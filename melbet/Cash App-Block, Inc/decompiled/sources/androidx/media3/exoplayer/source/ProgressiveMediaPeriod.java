package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.Util$$ExternalSyntheticLambda0;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.Loader.LoadTask;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.tracing.Trace;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.datadog.trace.core.util.SimpleRateLimiter;
import com.google.android.libraries.places.internal.zzayv;
import com.google.common.collect.RegularImmutableMap;
import dagger.internal.Providers;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import net.idrnd.misnap.iad.IadFrame;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput {
    public static final Format ICY_FORMAT;
    public static final Map ICY_METADATA_HEADERS;
    public final Recorder.AnonymousClass3 allocator;
    public MediaPeriod.Callback callback;
    public final long continueLoadingCheckIntervalBytes;
    public ControlledTrackOutput[] controlledTrackOutputs;
    public final DataSource dataSource;
    public int dataType;
    public final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    public final DrmSessionManager drmSessionManager;
    public long durationUs;
    public int enabledTrackCount;
    public final long endPositionUs = Long.MIN_VALUE;
    public int extractedSamplesCountAtStartOfLoad;
    public final Handler handler;
    public boolean haveAudioVideoTracks;
    public IcyHeaders icyHeaders;
    public boolean isLengthKnown;
    public boolean isLive;
    public boolean isSingleSample;
    public long lastSeekPositionUs;
    public final ProgressiveMediaSource listener;
    public final ConditionVariable loadCondition;
    public final HurlStack loadErrorHandlingPolicy;
    public final Loader loader;
    public boolean loadingFinished;
    public final ProgressiveMediaPeriod$$ExternalSyntheticLambda0 maybeFinishPrepareRunnable;
    public final DrmSessionEventListener.EventDispatcher mediaSourceEventDispatcher;
    public boolean notifyDiscontinuity;
    public final ProgressiveMediaPeriod$$ExternalSyntheticLambda0 onContinueLoadingRequestedRunnable;
    public boolean pendingDeferredRetry;
    public boolean pendingInitialDiscontinuity;
    public long pendingResetPositionUs;
    public boolean prepared;
    public final Recorder.AnonymousClass3 progressiveMediaExtractor;
    public boolean released;
    public TrackId[] sampleQueueTrackIds;
    public SampleQueue[] sampleQueues;
    public boolean sampleQueuesBuilt;
    public SeekMap seekMap;
    public boolean seenFirstTrackSelection;
    public final long singleSampleDurationUs;
    public final Format singleTrackFormat;
    public MetadataRepo trackState;
    public final Uri uri;

    public final class ExtractingLoadable {
        public final StatsDataSource dataSource;
        public DataSpec dataSpec;
        public final ProgressiveMediaPeriod extractorOutput;
        public TrackOutput icyTrackOutput;
        public volatile boolean loadCanceled;
        public final ConditionVariable loadCondition;
        public final Recorder.AnonymousClass3 progressiveMediaExtractor;
        public long seekTimeUs;
        public boolean seenIcyMetadata;
        public final Uri uri;
        public final IadFrame positionHolder = new IadFrame(3);
        public boolean pendingExtractorSeek = true;

        public ExtractingLoadable(Uri uri, DataSource dataSource, Recorder.AnonymousClass3 anonymousClass3, ProgressiveMediaPeriod progressiveMediaPeriod, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = anonymousClass3;
            this.extractorOutput = progressiveMediaPeriod;
            this.loadCondition = conditionVariable;
            LoadEventInfo.idSource.getAndIncrement();
            this.dataSpec = buildDataSpec(0L, null);
        }

        public final DataSpec buildDataSpec(long j, String str) {
            Map map = ProgressiveMediaPeriod.ICY_METADATA_HEADERS;
            if (str != null && !str.startsWith("W/")) {
                StatusLine builder = RegularImmutableMap.builder();
                builder.putAll(map.entrySet());
                builder.put("If-Range", str);
                map = builder.build(false);
            }
            Map map2 = Collections.EMPTY_MAP;
            Uri uri = this.uri;
            Trace.checkNotNull(uri, "The uri must be set.");
            return new DataSpec(uri, 1, null, map, j, -1L, 6);
        }

        public final void load() {
            DataSource dataSource;
            Extractor extractor;
            int i;
            int i2 = 0;
            String str = null;
            while (i2 == 0 && !this.loadCanceled) {
                try {
                    long j = this.positionHolder.b;
                    DataSpec buildDataSpec = buildDataSpec(j, str);
                    this.dataSpec = buildDataSpec;
                    long open = this.dataSource.open(buildDataSpec);
                    if (this.loadCanceled) {
                        if (i2 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                            this.positionHolder.b = this.progressiveMediaExtractor.getCurrentInputPosition();
                        }
                        StatsDataSource statsDataSource = this.dataSource;
                        if (statsDataSource != null) {
                            try {
                                statsDataSource.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    List list = (List) this.dataSource.dataSource.getResponseHeaders().get("ETag");
                    str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    if (open != -1) {
                        open += j;
                        ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod.handler.post(new ProgressiveMediaPeriod$$ExternalSyntheticLambda0(progressiveMediaPeriod, 0));
                    }
                    long j2 = open;
                    ProgressiveMediaPeriod.this.icyHeaders = IcyHeaders.parse(this.dataSource.dataSource.getResponseHeaders());
                    StatsDataSource statsDataSource2 = this.dataSource;
                    IcyHeaders icyHeaders = ProgressiveMediaPeriod.this.icyHeaders;
                    if (icyHeaders == null || (i = icyHeaders.metadataInterval) == -1) {
                        dataSource = statsDataSource2;
                    } else {
                        dataSource = new IcyDataSource(statsDataSource2, i, this);
                        TrackOutput prepareTrackOutput = ProgressiveMediaPeriod.this.prepareTrackOutput(new TrackId(0, true));
                        this.icyTrackOutput = prepareTrackOutput;
                        prepareTrackOutput.format(ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    this.progressiveMediaExtractor.init(dataSource, this.uri, this.dataSource.dataSource.getResponseHeaders(), j, j2, this.extractorOutput);
                    if (ProgressiveMediaPeriod.this.icyHeaders != null && (extractor = (Extractor) this.progressiveMediaExtractor.val$recordingToStart) != null && (extractor instanceof Mp3Extractor)) {
                        ((Mp3Extractor) extractor).disableSeeking = true;
                    }
                    if (this.pendingExtractorSeek) {
                        Recorder.AnonymousClass3 anonymousClass3 = this.progressiveMediaExtractor;
                        long j3 = this.seekTimeUs;
                        Extractor extractor2 = (Extractor) anonymousClass3.val$recordingToStart;
                        extractor2.getClass();
                        extractor2.seek(j, j3);
                        this.pendingExtractorSeek = false;
                    }
                    while (i2 == 0 && !this.loadCanceled) {
                        try {
                            ConditionVariable conditionVariable = this.loadCondition;
                            synchronized (conditionVariable) {
                                while (!conditionVariable.isOpen) {
                                    conditionVariable.clock.getClass();
                                    conditionVariable.wait();
                                }
                            }
                            Recorder.AnonymousClass3 anonymousClass32 = this.progressiveMediaExtractor;
                            IadFrame iadFrame = this.positionHolder;
                            Extractor extractor3 = (Extractor) anonymousClass32.val$recordingToStart;
                            extractor3.getClass();
                            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) anonymousClass32.this$0;
                            defaultExtractorInput.getClass();
                            i2 = extractor3.read(defaultExtractorInput, iadFrame);
                            long currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                            if (currentInputPosition > ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j) {
                                ConditionVariable conditionVariable2 = this.loadCondition;
                                synchronized (conditionVariable2) {
                                    conditionVariable2.isOpen = false;
                                }
                                ProgressiveMediaPeriod progressiveMediaPeriod2 = ProgressiveMediaPeriod.this;
                                progressiveMediaPeriod2.handler.post(progressiveMediaPeriod2.onContinueLoadingRequestedRunnable);
                                j = currentInputPosition;
                            }
                        } catch (InterruptedException unused2) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.b = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    StatsDataSource statsDataSource3 = this.dataSource;
                    if (statsDataSource3 != null) {
                        try {
                            statsDataSource3.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    if (i2 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.b = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    StatsDataSource statsDataSource4 = this.dataSource;
                    if (statsDataSource4 != null) {
                        try {
                            statsDataSource4.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public final class SampleStreamImpl implements SampleStream {
        public final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            return !progressiveMediaPeriod.suppressRead() && progressiveMediaPeriod.sampleQueues[this.track].isReady(progressiveMediaPeriod.loadingFinished);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
            int i = this.track;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            SampleQueue sampleQueue = progressiveMediaPeriod.sampleQueues[i];
            Toolbar.AnonymousClass1 anonymousClass1 = sampleQueue.currentDrmSession;
            if (anonymousClass1 != null && anonymousClass1.getState() == 1) {
                DrmSession$DrmSessionException error = sampleQueue.currentDrmSession.getError();
                error.getClass();
                throw error;
            }
            Loader loader = progressiveMediaPeriod.loader;
            int minimumLoadableRetryCount = progressiveMediaPeriod.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(progressiveMediaPeriod.dataType);
            IOException iOException = loader.fatalError;
            if (iOException != null) {
                throw iOException;
            }
            Loader.LoadTask loadTask = loader.currentTask;
            if (loadTask != null) {
                if (minimumLoadableRetryCount == Integer.MIN_VALUE) {
                    minimumLoadableRetryCount = loadTask.defaultMinRetryCount;
                }
                IOException iOException2 = loadTask.currentError;
                if (iOException2 != null && loadTask.errorCount > minimumLoadableRetryCount) {
                    throw iOException2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
        
            if (r4.isLastSampleQueued != false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
        
            if (r13 == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00b3, code lost:
        
            r6 = r4.upstreamFormat;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00b5, code lost:
        
            if (r6 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
        
            if (r7 != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00bb, code lost:
        
            if (r6 == r4.downstreamFormat) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
        
            r4.onFormatResult(r6, r18);
         */
        @Override // androidx.media3.exoplayer.source.SampleStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int readData(AndroidSvg androidSvg, DecoderInputBuffer decoderInputBuffer, int i) {
            int i2;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i3 = this.track;
            if (progressiveMediaPeriod.suppressRead()) {
                return -3;
            }
            progressiveMediaPeriod.maybeNotifyDownstreamFormat(i3);
            SampleQueue sampleQueue = progressiveMediaPeriod.sampleQueues[i3];
            boolean z = progressiveMediaPeriod.loadingFinished;
            sampleQueue.getClass();
            boolean z2 = (i & 2) != 0;
            SimpleRateLimiter simpleRateLimiter = sampleQueue.extrasHolder;
            synchronized (sampleQueue) {
                decoderInputBuffer.waitingForKeys = false;
                int i4 = sampleQueue.absoluteFirstIndex;
                int i5 = sampleQueue.readPosition;
                int i6 = i4 + i5;
                int i7 = sampleQueue.readEndTimeAbsoluteIndex;
                boolean z3 = i7 != -1 && i6 >= i7;
                if ((i5 != sampleQueue.length) && !z3) {
                    Format format2 = ((SampleQueue.SharedSampleMetadata) sampleQueue.sharedSampleMetadata.m4368get(i6)).f884format;
                    if (!z2 && format2 == sampleQueue.downstreamFormat) {
                        int relativeIndex = sampleQueue.getRelativeIndex(sampleQueue.readPosition);
                        if (sampleQueue.mayReadSample(relativeIndex)) {
                            decoderInputBuffer.flags = sampleQueue.flags[relativeIndex];
                            if (sampleQueue.readPosition == sampleQueue.length - 1 && (z || sampleQueue.isLastSampleQueued)) {
                                decoderInputBuffer.addFlag(PKIFailureInfo.duplicateCertReq);
                            }
                            decoderInputBuffer.timeUs = sampleQueue.timesUs[relativeIndex];
                            simpleRateLimiter.capacity = sampleQueue.sizes[relativeIndex];
                            simpleRateLimiter.startNanos = sampleQueue.offsets[relativeIndex];
                            simpleRateLimiter.secondsAndCount = sampleQueue.cryptoDatas[relativeIndex];
                            i2 = -4;
                        } else {
                            decoderInputBuffer.waitingForKeys = true;
                            i2 = -3;
                        }
                    }
                    sampleQueue.onFormatResult(format2, androidSvg);
                    i2 = -5;
                }
                decoderInputBuffer.flags = 4;
                decoderInputBuffer.timeUs = Long.MIN_VALUE;
                i2 = -4;
            }
            if (i2 == -4 && !decoderInputBuffer.getFlag(4)) {
                boolean z4 = (i & 1) != 0;
                if ((i & 4) == 0) {
                    SampleDataQueue sampleDataQueue = sampleQueue.sampleDataQueue;
                    SimpleRateLimiter simpleRateLimiter2 = sampleQueue.extrasHolder;
                    if (z4) {
                        SampleDataQueue.readSampleData(sampleDataQueue.readAllocationNode, decoderInputBuffer, simpleRateLimiter2, sampleDataQueue.scratch);
                    } else {
                        sampleDataQueue.readAllocationNode = SampleDataQueue.readSampleData(sampleDataQueue.readAllocationNode, decoderInputBuffer, simpleRateLimiter2, sampleDataQueue.scratch);
                    }
                }
                if (!z4) {
                    sampleQueue.readPosition++;
                }
            }
            if (i2 == -3) {
                progressiveMediaPeriod.maybeStartDeferredRetry(i3);
            }
            return i2;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            int i;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i2 = this.track;
            boolean z = false;
            if (progressiveMediaPeriod.suppressRead()) {
                return 0;
            }
            progressiveMediaPeriod.maybeNotifyDownstreamFormat(i2);
            SampleQueue sampleQueue = progressiveMediaPeriod.sampleQueues[i2];
            boolean z2 = progressiveMediaPeriod.loadingFinished;
            synchronized (sampleQueue) {
                int relativeIndex = sampleQueue.getRelativeIndex(sampleQueue.readPosition);
                int i3 = sampleQueue.readPosition;
                int i4 = sampleQueue.length;
                if ((i3 != i4) && j >= sampleQueue.timesUs[relativeIndex]) {
                    if (j <= sampleQueue.largestQueuedTimestampUs || !z2) {
                        i = sampleQueue.findSampleBefore(relativeIndex, i4 - i3, j, true);
                        if (i == -1) {
                            i = 0;
                        }
                    } else {
                        i = i4 - i3;
                    }
                }
                i = 0;
            }
            synchronized (sampleQueue) {
                if (i >= 0) {
                    try {
                        if (sampleQueue.readPosition + i <= sampleQueue.length) {
                            z = true;
                        }
                    } finally {
                    }
                }
                Trace.checkArgument(z);
                sampleQueue.readPosition += i;
            }
            if (i == 0) {
                progressiveMediaPeriod.maybeStartDeferredRetry(i2);
            }
            return i;
        }
    }

    public final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z) {
            this.id = i;
            this.isIcyTrack = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.id == trackId.id && this.isIcyTrack == trackId.isIcyTrack;
        }

        public final int hashCode() {
            return (this.id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        ICY_METADATA_HEADERS = Collections.unmodifiableMap(hashMap);
        Format.Builder builder = new Format.Builder();
        builder.id = "icy";
        builder.sampleMimeType = MimeTypes.normalizeMimeType("application/x-icy");
        ICY_FORMAT = new Format(builder);
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, Recorder.AnonymousClass3 anonymousClass3, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, HurlStack hurlStack, DrmSessionEventListener.EventDispatcher eventDispatcher2, ProgressiveMediaSource progressiveMediaSource, Recorder.AnonymousClass3 anonymousClass32, int i, Format format2, long j, zzayv zzayvVar) {
        Loader loader;
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = hurlStack;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = progressiveMediaSource;
        this.allocator = anonymousClass32;
        this.continueLoadingCheckIntervalBytes = i;
        this.singleTrackFormat = format2;
        if (zzayvVar != null) {
            loader = new Loader(zzayvVar);
        } else {
            String concat = "ExoPlayer:Loader:".concat("ProgressiveMediaPeriod");
            String str = Util.DEVICE_DEBUG_INFO;
            loader = new Loader(new zzayv(1, Executors.newSingleThreadExecutor(new Util$$ExternalSyntheticLambda0(concat)), new Id3Peeker$$ExternalSyntheticBUOutline0(14)));
        }
        this.loader = loader;
        this.progressiveMediaExtractor = anonymousClass3;
        this.singleSampleDurationUs = j;
        this.loadCondition = new ConditionVariable();
        this.maybeFinishPrepareRunnable = new ProgressiveMediaPeriod$$ExternalSyntheticLambda0(this, 1);
        this.onContinueLoadingRequestedRunnable = new ProgressiveMediaPeriod$$ExternalSyntheticLambda0(this, 2);
        this.handler = Util.createHandlerForCurrentLooper(null);
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.controlledTrackOutputs = new ControlledTrackOutput[0];
        this.pendingResetPositionUs = -9223372036854775807L;
        this.dataType = 1;
    }

    public final void assertPrepared() {
        Trace.checkState(this.prepared);
        this.trackState.getClass();
        this.seekMap.getClass();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished) {
            return false;
        }
        Loader loader = this.loader;
        if (loader.fatalError != null || this.pendingDeferredRetry) {
            return false;
        }
        if ((this.prepared || this.singleTrackFormat != null) && this.enabledTrackCount == 0) {
            return false;
        }
        boolean open = this.loadCondition.open();
        if (loader.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j) {
        long j2;
        long j3;
        int i;
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.trackState.mRootNode;
        int length = this.sampleQueues.length;
        int i2 = 0;
        while (i2 < length) {
            SampleQueue sampleQueue = this.sampleQueues[i2];
            boolean z = zArr[i2];
            SampleDataQueue sampleDataQueue = sampleQueue.sampleDataQueue;
            synchronized (sampleQueue) {
                try {
                    int i3 = sampleQueue.length;
                    j2 = -1;
                    if (i3 != 0) {
                        long[] jArr = sampleQueue.timesUs;
                        int i4 = sampleQueue.relativeFirstIndex;
                        if (j >= jArr[i4]) {
                            j3 = j;
                            int findSampleBefore = sampleQueue.findSampleBefore(i4, (!z || (i = sampleQueue.readPosition) == i3) ? i3 : i + 1, j3, false);
                            if (findSampleBefore != -1) {
                                j2 = sampleQueue.discardSamples(findSampleBefore);
                            }
                        }
                    }
                    j3 = j;
                } finally {
                }
            }
            sampleDataQueue.discardDownstreamTo(j2);
            i2++;
            j = j3;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[RETURN] */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j);
        long j2 = seekPoints.first.timeUs;
        long j3 = seekPoints.second.timeUs;
        long j4 = seekParameters.toleranceAfterUs;
        long j5 = seekParameters.toleranceBeforeUs;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = Util.DEVICE_DEBUG_INFO;
        long j6 = j - j5;
        long j7 = Long.MAX_VALUE;
        long j8 = (((j5 ^ j) > 0L ? 1 : ((j5 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j8 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j8 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j8 = Long.MIN_VALUE;
        }
        long saturatedAdd = Providers.saturatedAdd(j, j4);
        if ((saturatedAdd != Long.MIN_VALUE || j + j4 == Long.MIN_VALUE) && (saturatedAdd != Long.MAX_VALUE || j4 + j == Long.MAX_VALUE)) {
            j7 = saturatedAdd;
        }
        boolean z = j8 <= j2 && j2 <= j7;
        boolean z2 = j8 <= j3 && j3 <= j7;
        if (!z || !z2) {
            if (!z) {
                return z2 ? j3 : j8;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long j;
        boolean z;
        long j2;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                MetadataRepo metadataRepo = this.trackState;
                if (((boolean[]) metadataRepo.mEmojiCharArray)[i] && ((boolean[]) metadataRepo.mRootNode)[i]) {
                    SampleQueue sampleQueue = this.sampleQueues[i];
                    synchronized (sampleQueue) {
                        z = sampleQueue.isLastSampleQueued;
                    }
                    if (z) {
                        continue;
                    } else {
                        SampleQueue sampleQueue2 = this.sampleQueues[i];
                        synchronized (sampleQueue2) {
                            j2 = sampleQueue2.largestQueuedTimestampUs;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = getLargestQueuedTimestampUs(false);
        }
        return j == Long.MIN_VALUE ? this.lastSeekPositionUs : j;
    }

    public final int getExtractedSamplesCount() {
        int i = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            i += sampleQueue.absoluteFirstIndex + sampleQueue.length;
        }
        return i;
    }

    public final long getLargestQueuedTimestampUs(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.sampleQueues.length; i++) {
            if (!z) {
                MetadataRepo metadataRepo = this.trackState;
                metadataRepo.getClass();
                if (!((boolean[]) metadataRepo.mRootNode)[i]) {
                    continue;
                }
            }
            SampleQueue sampleQueue = this.sampleQueues[i];
            synchronized (sampleQueue) {
                j = sampleQueue.largestQueuedTimestampUs;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        assertPrepared();
        return (TrackGroupArray) this.trackState.mMetadataList;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        boolean z;
        if (this.loadingFinished || !this.loader.isLoading()) {
            return false;
        }
        ConditionVariable conditionVariable = this.loadCondition;
        synchronized (conditionVariable) {
            z = conditionVariable.isOpen;
        }
        return z;
    }

    public final boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:? -> B:99:0x017f). Please report as a decompilation issue!!! */
    public final void maybeFinishPrepare() {
        SampleQueue sampleQueue;
        int i;
        int i2;
        Metadata copyWithAppendedEntries;
        long j = this.singleSampleDurationUs;
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        boolean z = false;
        for (SampleQueue sampleQueue2 : this.sampleQueues) {
            if (sampleQueue2.getUpstreamFormat() == null) {
                return;
            }
        }
        ConditionVariable conditionVariable = this.loadCondition;
        synchronized (conditionVariable) {
            conditionVariable.isOpen = false;
        }
        int length = this.sampleQueues.length;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            char c = 1;
            if (i4 >= length) {
                break;
            }
            Format upstreamFormat = this.sampleQueues[i4].getUpstreamFormat();
            upstreamFormat.getClass();
            int trackType = MimeTypes.getTrackType(upstreamFormat.sampleMimeType);
            char c2 = trackType != 1 ? trackType != 2 ? trackType != 3 ? trackType != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i3 == 1) {
                c = 3;
            } else if (i3 == 2) {
                c = 4;
            } else if (i3 != 3) {
                c = i3 != 4 ? (char) 0 : (char) 2;
            }
            if (c2 > c) {
                i5 = i4;
                i3 = trackType;
            }
            i4++;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        int i6 = 0;
        while (i6 < length) {
            Format upstreamFormat2 = this.sampleQueues[i6].getUpstreamFormat();
            upstreamFormat2.getClass();
            String str = upstreamFormat2.sampleMimeType;
            boolean isAudio = MimeTypes.isAudio(str);
            boolean z2 = (isAudio || MimeTypes.isVideo(str)) ? true : z;
            zArr[i6] = z2;
            boolean z3 = z;
            this.haveAudioVideoTracks |= z2;
            this.isSingleSample = (j != -9223372036854775807L && length == 1 && MimeTypes.isImage(str)) ? true : z3 ? 1 : 0;
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                int i7 = icyHeaders.bitrate;
                if (isAudio || this.sampleQueueTrackIds[i6].isIcyTrack) {
                    Metadata metadata = upstreamFormat2.metadata;
                    if (metadata == null) {
                        Metadata.Entry[] entryArr = new Metadata.Entry[1];
                        entryArr[z3 ? 1 : 0] = icyHeaders;
                        copyWithAppendedEntries = new Metadata(entryArr);
                    } else {
                        Metadata.Entry[] entryArr2 = new Metadata.Entry[1];
                        entryArr2[z3 ? 1 : 0] = icyHeaders;
                        copyWithAppendedEntries = metadata.copyWithAppendedEntries(entryArr2);
                    }
                    Format.Builder buildUpon = upstreamFormat2.buildUpon();
                    buildUpon.metadata = copyWithAppendedEntries;
                    upstreamFormat2 = new Format(buildUpon);
                }
                if (isAudio && upstreamFormat2.averageBitrate == -1 && upstreamFormat2.peakBitrate == -1 && i7 != -1) {
                    Format.Builder buildUpon2 = upstreamFormat2.buildUpon();
                    buildUpon2.averageBitrate = i7;
                    upstreamFormat2 = new Format(buildUpon2);
                }
            }
            int cryptoType = this.drmSessionManager.getCryptoType(upstreamFormat2);
            Format.Builder buildUpon3 = upstreamFormat2.buildUpon();
            buildUpon3.cryptoType = cryptoType;
            Format format2 = new Format(buildUpon3);
            if (i6 != i5) {
                Format.Builder buildUpon4 = format2.buildUpon();
                buildUpon4.primaryTrackGroupId = Integer.toString(i5);
                format2 = new Format(buildUpon4);
            }
            trackGroupArr[i6] = new TrackGroup(Integer.toString(i6), format2);
            this.pendingInitialDiscontinuity = format2.hasPrerollSamples | this.pendingInitialDiscontinuity;
            SampleQueue sampleQueue3 = this.sampleQueues[i6];
            long j2 = this.endPositionUs;
            synchronized (sampleQueue3) {
                try {
                    if (j2 != sampleQueue3.readEndTimeUs) {
                        if (j2 == Long.MIN_VALUE) {
                            sampleQueue3.readEndTimeAbsoluteIndex = -1;
                        } else {
                            if (j2 <= sampleQueue3.largestQueuedTimestampUs) {
                                i = sampleQueue3.findSampleAfter(sampleQueue3.relativeFirstIndex, sampleQueue3.length, j2, false);
                                sampleQueue = sampleQueue3;
                            } else {
                                sampleQueue = sampleQueue3;
                                i = -1;
                            }
                            if (i == -1) {
                                i2 = -1;
                            } else {
                                try {
                                    i2 = sampleQueue.absoluteFirstIndex + i;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            sampleQueue.readEndTimeAbsoluteIndex = i2;
                            sampleQueue.readEndTimeUs = j2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sampleQueue = sampleQueue3;
                    throw th;
                }
            }
            i6++;
            z = z3 ? 1 : 0;
        }
        TrackGroupArray trackGroupArray = new TrackGroupArray(trackGroupArr);
        MetadataRepo metadataRepo = new MetadataRepo();
        metadataRepo.mMetadataList = trackGroupArray;
        metadataRepo.mEmojiCharArray = zArr;
        int i8 = trackGroupArray.length;
        metadataRepo.mRootNode = new boolean[i8];
        metadataRepo.mTypeface = new boolean[i8];
        this.trackState = metadataRepo;
        if (this.isSingleSample && this.durationUs == -9223372036854775807L) {
            this.durationUs = j;
            this.seekMap = new ForwardingSeekMap(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public final long getDurationUs() {
                    return ProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap, this.isLive);
        this.prepared = true;
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    public final void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        MetadataRepo metadataRepo = this.trackState;
        boolean[] zArr = (boolean[]) metadataRepo.mTypeface;
        if (zArr[i]) {
            return;
        }
        Format format2 = ((TrackGroupArray) metadataRepo.mMetadataList).get(i).formats[0];
        MediaLoadData mediaLoadData = new MediaLoadData(MimeTypes.getTrackType(format2.sampleMimeType), format2, Util.usToMs(this.lastSeekPositionUs), -9223372036854775807L);
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
        eventDispatcher.dispatchEvent(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(16, eventDispatcher, mediaLoadData));
        zArr[i] = true;
    }

    public final void maybeStartDeferredRetry(int i) {
        assertPrepared();
        if (this.pendingDeferredRetry) {
            if ((!this.haveAudioVideoTracks || ((boolean[]) this.trackState.mEmojiCharArray)[i]) && !this.sampleQueues[i].isReady(false)) {
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (SampleQueue sampleQueue : this.sampleQueues) {
                    sampleQueue.reset(false);
                }
                MediaPeriod.Callback callback = this.callback;
                callback.getClass();
                callback.onContinueLoadingRequested(this);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        int minimumLoadableRetryCount = this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType);
        Loader loader = this.loader;
        IOException iOException = loader.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        Loader.LoadTask loadTask = loader.currentTask;
        if (loadTask != null) {
            if (minimumLoadableRetryCount == Integer.MIN_VALUE) {
                minimumLoadableRetryCount = loadTask.defaultMinRetryCount;
            }
            IOException iOException2 = loadTask.currentError;
            if (iOException2 != null && loadTask.errorCount > minimumLoadableRetryCount) {
                throw iOException2;
            }
        }
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer(null, "Loading finished before preparation is complete.");
        }
    }

    public final void onLoadCanceled(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.dataSpec, statsDataSource.lastOpenedUri, statsDataSource.lastResponseHeaders, j, j2, statsDataSource.bytesRead);
        this.loadErrorHandlingPolicy.getClass();
        MediaLoadData mediaLoadData = new MediaLoadData(-1, (Format) null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs));
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
        eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2(eventDispatcher, loadEventInfo, mediaLoadData, 1));
        if (z) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset(false);
        }
        if (this.enabledTrackCount > 0) {
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this);
        }
    }

    public final void onLoadCompleted(ExtractingLoadable extractingLoadable, long j, long j2) {
        if (this.durationUs == -9223372036854775807L && this.seekMap != null) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j3;
            this.listener.onSourceInfoRefreshed(j3, this.seekMap, this.isLive);
        }
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.dataSpec, statsDataSource.lastOpenedUri, statsDataSource.lastResponseHeaders, j, j2, statsDataSource.bytesRead);
        this.loadErrorHandlingPolicy.getClass();
        MediaLoadData mediaLoadData = new MediaLoadData(-1, (Format) null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs));
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
        eventDispatcher.dispatchEvent(new MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2(eventDispatcher, loadEventInfo, mediaLoadData, 0));
        this.loadingFinished = true;
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        Format format2 = this.singleTrackFormat;
        if (format2 == null) {
            this.loadCondition.open();
            startLoading();
        } else {
            track(0, 3).format(format2);
            setSeekMap(new IndexSeekMap(-9223372036854775807L, new long[]{0}, new long[]{0}));
            endTracks();
            this.pendingResetPositionUs = j;
        }
    }

    public final TrackOutput prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.sampleQueueTrackIds[i])) {
                return this.sampleQueues[i];
            }
        }
        if (this.sampleQueuesBuilt) {
            Log.w("ProgressiveMediaPeriod", "Extractor added new track (id=" + trackId.id + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        drmSessionManager.getClass();
        SampleQueue sampleQueue = new SampleQueue(this.allocator, drmSessionManager, this.drmEventDispatcher);
        ControlledTrackOutput controlledTrackOutput = new ControlledTrackOutput(sampleQueue);
        sampleQueue.upstreamFormatChangeListener = this;
        int i2 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i2);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i2);
        sampleQueueArr[length] = sampleQueue;
        this.sampleQueues = sampleQueueArr;
        ControlledTrackOutput[] controlledTrackOutputArr = (ControlledTrackOutput[]) Arrays.copyOf(this.controlledTrackOutputs, i2);
        controlledTrackOutputArr[length] = controlledTrackOutput;
        this.controlledTrackOutputs = controlledTrackOutputArr;
        return controlledTrackOutput;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        if (this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
            return this.lastSeekPositionUs;
        }
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        boolean z;
        if (this.enabledTrackCount <= 0 || isPendingReset()) {
            return;
        }
        boolean z2 = false;
        if (this.endPositionUs != Long.MIN_VALUE) {
            assertPrepared();
            boolean z3 = true;
            int i = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                if (i >= sampleQueueArr.length) {
                    break;
                }
                MetadataRepo metadataRepo = this.trackState;
                if (((boolean[]) metadataRepo.mRootNode)[i] && (((boolean[]) metadataRepo.mEmojiCharArray)[i] || !this.haveAudioVideoTracks)) {
                    SampleQueue sampleQueue = sampleQueueArr[i];
                    synchronized (sampleQueue) {
                        z = sampleQueue.readEndTimeAbsoluteIndex != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.loadingFinished = true;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void seekMap(SeekMap seekMap) {
        this.handler.post(new q4$$ExternalSyntheticLambda0(1, this, seekMap));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        boolean seekTo;
        assertPrepared();
        boolean[] zArr = (boolean[]) this.trackState.mEmojiCharArray;
        if (!this.seekMap.isSeekable()) {
            j = 0;
        }
        this.notifyDiscontinuity = false;
        boolean z = this.lastSeekPositionUs == j;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        if (this.dataType != 7 && (this.loadingFinished || this.loader.isLoading())) {
            int length = this.sampleQueues.length;
            for (int i = 0; i < length; i++) {
                SampleQueue sampleQueue = this.sampleQueues[i];
                if (this.controlledTrackOutputs[i].outputMode.get() == ControlledTrackOutput.OutputMode.PASS_THROUGH) {
                    int i2 = sampleQueue.absoluteFirstIndex;
                    if (sampleQueue.readPosition + i2 != 0 || !z) {
                        if (this.isSingleSample) {
                            synchronized (sampleQueue) {
                                synchronized (sampleQueue) {
                                    sampleQueue.readPosition = 0;
                                    SampleDataQueue sampleDataQueue = sampleQueue.sampleDataQueue;
                                    sampleDataQueue.readAllocationNode = sampleDataQueue.firstAllocationNode;
                                }
                            }
                            int i3 = sampleQueue.absoluteFirstIndex;
                            if (i2 >= i3 && i2 <= sampleQueue.length + i3) {
                                int i4 = sampleQueue.readEndTimeAbsoluteIndex;
                                if (i4 == -1 || i2 < i4) {
                                    sampleQueue.startTimeUs = Long.MIN_VALUE;
                                    sampleQueue.readPosition = i2 - i3;
                                    seekTo = true;
                                } else {
                                    seekTo = false;
                                }
                            }
                            seekTo = false;
                        } else {
                            seekTo = sampleQueue.seekTo(j, this.loadingFinished);
                        }
                        if (seekTo) {
                            continue;
                        } else if (!zArr[i] && this.haveAudioVideoTracks) {
                        }
                    }
                }
            }
            return j;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.pendingInitialDiscontinuity = false;
        if (!this.loader.isLoading()) {
            this.loader.fatalError = null;
            for (SampleQueue sampleQueue2 : this.sampleQueues) {
                sampleQueue2.reset(false);
            }
            return j;
        }
        for (SampleQueue sampleQueue3 : this.sampleQueues) {
            sampleQueue3.discardToEnd();
        }
        Loader.LoadTask loadTask = this.loader.currentTask;
        loadTask.getClass();
        loadTask.cancel(false);
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ExoTrackSelection exoTrackSelection;
        assertPrepared();
        MetadataRepo metadataRepo = this.trackState;
        TrackGroupArray trackGroupArray = (TrackGroupArray) metadataRepo.mMetadataList;
        boolean[] zArr3 = (boolean[]) metadataRepo.mRootNode;
        int i = this.enabledTrackCount;
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            SampleStream sampleStream = sampleStreamArr[i2];
            if (sampleStream != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                int i3 = ((SampleStreamImpl) sampleStream).track;
                Trace.checkState(zArr3[i3]);
                this.enabledTrackCount--;
                zArr3[i3] = false;
                sampleStreamArr[i2] = null;
            }
        }
        boolean z = !this.seenFirstTrackSelection ? j == 0 || this.isSingleSample : i != 0;
        for (int i4 = 0; i4 < exoTrackSelectionArr.length; i4++) {
            if (sampleStreamArr[i4] == null && (exoTrackSelection = exoTrackSelectionArr[i4]) != null) {
                Trace.checkState(exoTrackSelection.length() == 1);
                Trace.checkState(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int indexOf = trackGroupArray.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                Trace.checkState(!zArr3[indexOf]);
                this.enabledTrackCount++;
                zArr3[indexOf] = true;
                this.pendingInitialDiscontinuity = exoTrackSelection.getSelectedFormat().hasPrerollSamples | this.pendingInitialDiscontinuity;
                sampleStreamArr[i4] = new SampleStreamImpl(indexOf);
                zArr2[i4] = true;
                if (!z) {
                    SampleQueue sampleQueue = this.sampleQueues[indexOf];
                    z = (sampleQueue.absoluteFirstIndex + sampleQueue.readPosition == 0 || sampleQueue.seekTo(j, true)) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            this.pendingInitialDiscontinuity = false;
            Loader loader = this.loader;
            if (loader.isLoading()) {
                for (SampleQueue sampleQueue2 : this.sampleQueues) {
                    sampleQueue2.discardToEnd();
                }
                Loader.LoadTask loadTask = loader.currentTask;
                loadTask.getClass();
                loadTask.cancel(false);
            } else {
                this.loadingFinished = false;
                for (SampleQueue sampleQueue3 : this.sampleQueues) {
                    sampleQueue3.reset(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            for (int i5 = 0; i5 < sampleStreamArr.length; i5++) {
                if (sampleStreamArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.seenFirstTrackSelection = true;
        return j;
    }

    public final void setSeekMap(SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new SeekMap.Unseekable(-9223372036854775807L);
        this.durationUs = seekMap.getDurationUs();
        boolean z = !this.isLengthKnown && seekMap.getDurationUs() == -9223372036854775807L;
        this.isLive = z;
        this.dataType = z ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap, z);
        } else {
            maybeFinishPrepare();
        }
    }

    public final void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            Trace.checkState(isPendingReset());
            long j = this.endPositionUs;
            if (j == Long.MIN_VALUE) {
                j = this.durationUs;
            }
            if (j != -9223372036854775807L && this.pendingResetPositionUs > j) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = -9223372036854775807L;
                return;
            }
            SeekMap seekMap = this.seekMap;
            seekMap.getClass();
            long j2 = seekMap.getSeekPoints(this.pendingResetPositionUs).first.position;
            long j3 = this.pendingResetPositionUs;
            extractingLoadable.positionHolder.b = j2;
            extractingLoadable.seekTimeUs = j3;
            extractingLoadable.pendingExtractorSeek = true;
            extractingLoadable.seenIcyMetadata = false;
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.startTimeUs = this.pendingResetPositionUs;
            }
            this.pendingResetPositionUs = -9223372036854775807L;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        int minimumLoadableRetryCount = this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType);
        Loader loader = this.loader;
        loader.getClass();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        loader.fatalError = null;
        Loader.LoadTask loadTask = loader.new LoadTask(myLooper, extractingLoadable, this, minimumLoadableRetryCount, SystemClock.elapsedRealtime());
        Trace.checkState(loader.currentTask == null);
        loader.currentTask = loadTask;
        loadTask.execute();
    }

    public final boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i, int i2) {
        return prepareTrackOutput(new TrackId(i, false));
    }

    public final class ControlledTrackOutput implements TrackOutput {
        public final DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        public final AtomicReference outputMode = new AtomicReference(OutputMode.PASS_THROUGH);
        public final SampleQueue sampleQueue;
        public final SampleQueue trackOutput;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class OutputMode {
            public static final /* synthetic */ OutputMode[] $VALUES;
            public static final OutputMode DISCARDING;
            public static final OutputMode DISCARD_AFTER_NEXT_SAMPLE_METADATA;
            public static final OutputMode PASS_THROUGH;

            static {
                OutputMode outputMode = new OutputMode("PASS_THROUGH", 0);
                PASS_THROUGH = outputMode;
                OutputMode outputMode2 = new OutputMode("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
                DISCARD_AFTER_NEXT_SAMPLE_METADATA = outputMode2;
                OutputMode outputMode3 = new OutputMode("DISCARDING", 2);
                DISCARDING = outputMode3;
                $VALUES = new OutputMode[]{outputMode, outputMode2, outputMode3};
            }

            public static OutputMode valueOf(String str) {
                return (OutputMode) Enum.valueOf(OutputMode.class, str);
            }

            public static OutputMode[] values() {
                return (OutputMode[]) $VALUES.clone();
            }
        }

        public ControlledTrackOutput(SampleQueue sampleQueue) {
            this.trackOutput = sampleQueue;
            this.sampleQueue = sampleQueue;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void durationUs(long j) {
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void format(Format format2) {
            this.trackOutput.format(format2);
        }

        public final TrackOutput getCurrentOutput() {
            return this.outputMode.get() == OutputMode.DISCARDING ? this.discardingTrackOutput : this.sampleQueue;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final int sampleData(DataReader dataReader, int i, boolean z) {
            return getCurrentOutput().sampleData(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final int sampleData$1(DataReader dataReader, int i, boolean z) {
            return getCurrentOutput().sampleData$1(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            getCurrentOutput().sampleMetadata(j, i, i2, i3, cryptoData);
            AtomicReference atomicReference = this.outputMode;
            if (atomicReference.get() == OutputMode.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
                this.sampleQueue.reset(false);
                atomicReference.set(OutputMode.DISCARDING);
            }
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void sampleData(int i, ParsableByteArray parsableByteArray) {
            getCurrentOutput().sampleData(i, parsableByteArray);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
            getCurrentOutput().sampleData(parsableByteArray, i, i2);
        }
    }
}
