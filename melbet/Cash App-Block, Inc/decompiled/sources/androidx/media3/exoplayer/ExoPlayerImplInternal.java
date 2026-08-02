package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.audio.AudioFocusManager;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.ShuffleOrder$DefaultShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.extractor.ts.NalUnitTargetBuffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.mlkit.vision.text.internal.zzd;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;

/* loaded from: classes3.dex */
public final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, VideoFrameMetadataListener {
    public static final long BUFFERING_MAXIMUM_INTERVAL_MS = Util.usToMs(10000);
    public final DefaultAnalyticsCollector analyticsCollector;
    public final SystemHandlerWrapper applicationLooperHandler;
    public final AudioFocusManager audioFocusManager;
    public final boolean avoidLoadingWhileEnded;
    public final long backBufferDurationUs;
    public final DefaultBandwidthMeter bandwidthMeter;
    public final SystemClock clock;
    public boolean deliverPendingMessageAtStartPositionRequired;
    public int droppedSeeksWhileScrubbing;
    public final TrackSelectorResult emptyTrackSelectorResult;
    public int enabledRendererCount;
    public boolean foregroundMode;
    public final SystemHandlerWrapper handler;
    public final boolean hasSecondaryRenderers;
    public boolean isPrewarmingDisabledUntilNextTransition;
    public boolean isRebuffering;
    public final DefaultLivePlaybackSpeedControl livePlaybackSpeedControl;
    public final DefaultLoadControl loadControl;
    public final zzd mediaClock;
    public final MediaSourceList mediaSourceList;
    public int nextPendingMessageIndexHint;
    public boolean offloadSchedulingEnabled;
    public boolean pauseAtEndOfWindow;
    public SeekPosition pendingInitialSeekPosition;
    public final ArrayList pendingMessages;
    public boolean pendingPauseAtEndOfPeriod;
    public ExoPlaybackException pendingRecoverableRendererError;
    public final Timeline.Period period;
    public PlaybackInfo playbackInfo;
    public NalUnitTargetBuffer playbackInfoUpdate;
    public final ExoPlayerImpl$$ExternalSyntheticLambda19 playbackInfoUpdateListener;
    public final Looper playbackLooper;
    public final zzv playbackLooperProvider;
    public final PlayerId playerId;
    public ExoPlayer.PreloadConfiguration preloadConfiguration;
    public final MediaPeriodQueue queue;
    public SeekPosition queuedSeekWhileScrubbing;
    public final long releaseTimeoutMs;
    public boolean releasedOnApplicationThread;
    public final BaseRenderer[] rendererCapabilities;
    public long rendererPositionElapsedRealtimeUs;
    public long rendererPositionUs;
    public final boolean[] rendererReportedReady;
    public final RendererHolder[] renderers;
    public int repeatMode;
    public boolean requestForRendererSleep;
    public boolean scrubbingModeEnabled;
    public boolean seekIsPendingWhileScrubbing;
    public SeekParameters seekParameters;
    public boolean shouldContinueLoading;
    public boolean shuffleModeEnabled;
    public final DefaultTrackSelector trackSelector;
    public final Timeline.Window window;
    public long prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
    public float volume = 1.0f;
    public ScrubbingModeParameters scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
    public long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    public long lastRebufferRealtimeMs = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.ExoPlayerImplInternal$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public AnonymousClass1() {
        }

        public final void onWakeup() {
            ExoPlayerImplInternal exoPlayerImplInternal = ExoPlayerImplInternal.this;
            if (exoPlayerImplInternal.scrubbingModeEnabled) {
                exoPlayerImplInternal.scrubbingModeParameters.getClass();
            } else if (!exoPlayerImplInternal.offloadSchedulingEnabled) {
                return;
            }
            exoPlayerImplInternal.handler.sendEmptyMessage(2);
        }
    }

    public final class MediaSourceListUpdateMessage {
        public final ArrayList mediaSourceHolders;
        public final long positionUs;
        public final ShuffleOrder$DefaultShuffleOrder shuffleOrder;
        public final int windowIndex;

        public MediaSourceListUpdateMessage(ArrayList arrayList, ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder, int i, long j) {
            this.mediaSourceHolders = arrayList;
            this.shuffleOrder = shuffleOrder$DefaultShuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    public final class PositionUpdateForPlaylistChange {
        public final int discontinuityReason;
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource$MediaPeriodId periodId;
        public final boolean periodPositionChanged;
        public final long periodPositionUs;
        public final boolean reportDiscontinuity;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            this.periodId = mediaSource$MediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
            this.periodPositionChanged = z4;
            this.reportDiscontinuity = z5;
            this.discontinuityReason = i;
        }
    }

    public final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    public ExoPlayerImplInternal(Context context, BaseRenderer[] baseRendererArr, BaseRenderer[] baseRendererArr2, DefaultTrackSelector defaultTrackSelector, TrackSelectorResult trackSelectorResult, DefaultLoadControl defaultLoadControl, DefaultBandwidthMeter defaultBandwidthMeter, int i, boolean z, DefaultAnalyticsCollector defaultAnalyticsCollector, SeekParameters seekParameters, DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl, long j, boolean z2, Looper looper, SystemClock systemClock, ExoPlayerImpl$$ExternalSyntheticLambda19 exoPlayerImpl$$ExternalSyntheticLambda19, PlayerId playerId, ExoPlayer.PreloadConfiguration preloadConfiguration, final VideoFrameMetadataListener videoFrameMetadataListener, boolean z3) {
        Looper looper2;
        this.playbackInfoUpdateListener = exoPlayerImpl$$ExternalSyntheticLambda19;
        this.trackSelector = defaultTrackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = defaultLoadControl;
        this.bandwidthMeter = defaultBandwidthMeter;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = defaultLivePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.pauseAtEndOfWindow = z2;
        this.clock = systemClock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = defaultAnalyticsCollector;
        this.avoidLoadingWhileEnded = z3;
        this.backBufferDurationUs = defaultLoadControl.backBufferDurationUs;
        Timeline.AnonymousClass1 anonymousClass1 = Timeline.EMPTY;
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new NalUnitTargetBuffer(createDummy);
        this.rendererCapabilities = new BaseRenderer[baseRendererArr.length];
        this.rendererReportedReady = new boolean[baseRendererArr.length];
        defaultTrackSelector.getClass();
        this.renderers = new RendererHolder[baseRendererArr.length];
        boolean z4 = false;
        z4 = false;
        boolean z5 = false;
        for (int i2 = 0; i2 < baseRendererArr.length; i2++) {
            BaseRenderer baseRenderer = baseRendererArr[i2];
            baseRenderer.index = i2;
            baseRenderer.playerId = playerId;
            baseRenderer.clock = systemClock;
            this.rendererCapabilities[i2] = baseRenderer;
            BaseRenderer baseRenderer2 = this.rendererCapabilities[i2];
            synchronized (baseRenderer2.lock) {
                baseRenderer2.rendererCapabilitiesListener = defaultTrackSelector;
            }
            BaseRenderer baseRenderer3 = baseRendererArr2[i2];
            if (baseRenderer3 != null) {
                baseRenderer3.index = i2;
                baseRenderer3.playerId = playerId;
                baseRenderer3.clock = systemClock;
                z5 = true;
            }
            RendererHolder[] rendererHolderArr = this.renderers;
            BaseRenderer baseRenderer4 = baseRendererArr[i2];
            RendererHolder rendererHolder = new RendererHolder();
            rendererHolder.primaryRenderer = baseRenderer4;
            rendererHolder.index = i2;
            rendererHolder.secondaryRenderer = baseRenderer3;
            rendererHolder.prewarmingState = 0;
            rendererHolder.primaryRequiresReset = false;
            rendererHolder.secondaryRequiresReset = false;
            rendererHolderArr[i2] = rendererHolder;
        }
        this.hasSecondaryRenderers = z5;
        this.mediaClock = new zzd(this, systemClock);
        this.pendingMessages = new ArrayList();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        Trace.checkState(defaultTrackSelector.listener == null);
        defaultTrackSelector.listener = this;
        defaultTrackSelector.bandwidthMeter = defaultBandwidthMeter;
        this.deliverPendingMessageAtStartPositionRequired = true;
        SystemHandlerWrapper createHandler = systemClock.createHandler(looper, null);
        this.applicationLooperHandler = createHandler;
        this.queue = new MediaPeriodQueue(defaultAnalyticsCollector, createHandler, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, z4 ? 1 : 0), preloadConfiguration);
        this.mediaSourceList = new MediaSourceList(this, defaultAnalyticsCollector, createHandler, playerId);
        zzv zzvVar = new zzv();
        this.playbackLooperProvider = zzvVar;
        synchronized (zzvVar.zzb) {
            try {
                if (((Looper) zzvVar.zzc) == null) {
                    if (zzvVar.zze == 0 && ((HandlerThread) zzvVar.zzd) == null) {
                        z4 = true;
                    }
                    Trace.checkState(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    zzvVar.zzd = handlerThread;
                    handlerThread.start();
                    zzvVar.zzc = ((HandlerThread) zzvVar.zzd).getLooper();
                }
                zzvVar.zze++;
                looper2 = (Looper) zzvVar.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.playbackLooper = looper2;
        SystemHandlerWrapper createHandler2 = systemClock.createHandler(looper2, this);
        this.handler = createHandler2;
        this.audioFocusManager = new AudioFocusManager(context, looper2, this);
        createHandler2.obtainMessage(35, new VideoFrameMetadataListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda3
            @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
            public final void onVideoFrameAboutToBeRendered(long j2, long j3, Format format2, MediaFormat mediaFormat) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, j3, format2, mediaFormat);
                ExoPlayerImplInternal.this.onVideoFrameAboutToBeRendered(j2, j3, format2, mediaFormat);
            }
        }).sendToTarget();
        createHandler2.obtainMessage(39, new ExoPlayerImplInternal$$ExternalSyntheticLambda4(this)).sendToTarget();
    }

    public static boolean isLoadingPossible(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != null) {
            try {
                MediaPeriod mediaPeriod = mediaPeriodHolder.mediaPeriod;
                if (mediaPeriodHolder.prepared) {
                    for (SampleStream sampleStream : mediaPeriodHolder.sampleStreams) {
                        if (sampleStream != null) {
                            sampleStream.maybeThrowError();
                        }
                    }
                } else {
                    mediaPeriod.maybeThrowPrepareError();
                }
                if ((!mediaPeriodHolder.prepared ? 0L : mediaPeriod.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window, Timeline.Period period) {
        int resolveSubsequentPeriod;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
        try {
            Pair periodPositionUs = timeline3.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            if (!timeline.equals(timeline3)) {
                if (timeline.getIndexOfPeriod(periodPositionUs.first) == -1) {
                    if (!z || (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z2, periodPositionUs.first, timeline3, timeline)) == -1) {
                        return null;
                    }
                    return timeline.getPeriodPositionUs(window, period, resolveSubsequentPeriod, -9223372036854775807L);
                }
                if (timeline3.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline3.getWindow(period.windowIndex, window, 0L).firstPeriodIndex == timeline3.getIndexOfPeriod(periodPositionUs.first)) {
                    return timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs);
                }
            }
            return periodPositionUs;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        Timeline.Window window2 = window;
        Timeline timeline3 = timeline;
        Object obj2 = timeline3.getWindow(timeline3.getPeriodByUid(obj, period).windowIndex, window, 0L).uid;
        for (int i2 = 0; i2 < timeline2.getWindowCount(); i2++) {
            if (timeline2.getWindow(i2, window, 0L).uid.equals(obj2)) {
                return i2;
            }
        }
        int indexOfPeriod = timeline3.getIndexOfPeriod(obj);
        int periodCount = timeline3.getPeriodCount();
        int i3 = -1;
        int i4 = 0;
        while (i4 < periodCount && i3 == -1) {
            Timeline timeline4 = timeline3;
            int nextPeriodIndex = timeline4.getNextPeriodIndex(indexOfPeriod, period, window2, i, z);
            if (nextPeriodIndex == -1) {
                break;
            }
            i3 = timeline2.getIndexOfPeriod(timeline4.getUidOfPeriod(nextPeriodIndex));
            i4++;
            timeline3 = timeline4;
            indexOfPeriod = nextPeriodIndex;
            window2 = window;
        }
        if (i3 == -1) {
            return -1;
        }
        return timeline2.getPeriod(i3, period, false).windowIndex;
    }

    public final void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = ((ArrayList) mediaSourceList.mediaSourceHolders).size();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    public final void applyScrubbingModeParameters() {
        for (RendererHolder rendererHolder : this.renderers) {
            ScrubbingModeParameters scrubbingModeParameters = this.scrubbingModeEnabled ? this.scrubbingModeParameters : null;
            ((BaseRenderer) rendererHolder.primaryRenderer).handleMessage(18, scrubbingModeParameters);
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.secondaryRenderer;
            if (baseRenderer != null) {
                baseRenderer.handleMessage(18, scrubbingModeParameters);
            }
        }
    }

    public final boolean areRenderersPrewarming() {
        if (!this.hasSecondaryRenderers) {
            return false;
        }
        for (RendererHolder rendererHolder : this.renderers) {
            if (rendererHolder.isPrewarming()) {
                return true;
            }
        }
        return false;
    }

    public final void attemptRendererErrorRecovery() {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    public final void disableAndResetPrewarmingRenderers() {
        BaseRenderer baseRenderer;
        if (this.hasSecondaryRenderers && areRenderersPrewarming()) {
            for (RendererHolder rendererHolder : this.renderers) {
                int enabledRendererCount = rendererHolder.getEnabledRendererCount();
                zzd zzdVar = this.mediaClock;
                if (rendererHolder.isPrewarming()) {
                    int i = rendererHolder.prewarmingState;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
                        } catch (RuntimeException e) {
                            Log.e("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        baseRenderer = (BaseRenderer) rendererHolder.secondaryRenderer;
                        baseRenderer.getClass();
                    }
                    rendererHolder.disableRenderer(baseRenderer, zzdVar);
                    try {
                        rendererHolder.maybeResetRenderer(z);
                    } catch (RuntimeException e2) {
                        Log.e("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    rendererHolder.prewarmingState = i2;
                }
                this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
            }
            this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
        }
    }

    public final void disableRenderer(int i) {
        RendererHolder[] rendererHolderArr = this.renderers;
        int enabledRendererCount = rendererHolderArr[i].getEnabledRendererCount();
        RendererHolder rendererHolder = rendererHolderArr[i];
        BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
        zzd zzdVar = this.mediaClock;
        rendererHolder.disableRenderer(baseRenderer, zzdVar);
        BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
        if (baseRenderer2 != null) {
            boolean z = (baseRenderer2.state == 0 || rendererHolder.prewarmingState == 3) ? false : true;
            rendererHolder.disableRenderer(baseRenderer2, zzdVar);
            rendererHolder.maybeResetRenderer(false);
            if (z) {
                BaseRenderer baseRenderer3 = (BaseRenderer) rendererHolder.primaryRenderer;
                baseRenderer2.getClass();
                baseRenderer2.handleMessage(17, baseRenderer3);
            }
        }
        rendererHolder.prewarmingState = 0;
        maybeTriggerOnRendererReadyChanged(i, false);
        this.enabledRendererCount -= enabledRendererCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x024d, code lost:
    
        if (r6 >= r4.targetBufferBytes) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doSomeWork() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        int i;
        PlaybackInfo playbackInfo;
        int i2;
        boolean z6;
        this.clock.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        this.handler.removeMessages(2);
        if (!this.avoidLoadingWhileEnded) {
            updatePeriods();
        }
        int i3 = this.playbackInfo.playbackState;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.avoidLoadingWhileEnded) {
            updatePeriods();
        }
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        if (mediaPeriodHolder == null) {
            scheduleNextWork(uptimeMillis);
            return;
        }
        android.os.Trace.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (mediaPeriodHolder.prepared) {
            this.clock.getClass();
            this.rendererPositionElapsedRealtimeUs = Util.msToUs(android.os.SystemClock.elapsedRealtime());
            mediaPeriodHolder.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                RendererHolder[] rendererHolderArr = this.renderers;
                if (i4 >= rendererHolderArr.length) {
                    break;
                }
                RendererHolder rendererHolder = rendererHolderArr[i4];
                if (rendererHolder.getEnabledRendererCount() == 0) {
                    maybeTriggerOnRendererReadyChanged(i4, false);
                } else {
                    long j3 = this.rendererPositionUs;
                    long j4 = this.rendererPositionElapsedRealtimeUs;
                    BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.secondaryRenderer;
                    BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.primaryRenderer;
                    if (RendererHolder.isRendererEnabled(baseRenderer2)) {
                        baseRenderer2.render(j3, j4);
                    }
                    if (baseRenderer != null && baseRenderer.state != 0) {
                        baseRenderer.render(j3, j4);
                    }
                    if (z) {
                        BaseRenderer baseRenderer3 = (BaseRenderer) rendererHolder.secondaryRenderer;
                        BaseRenderer baseRenderer4 = (BaseRenderer) rendererHolder.primaryRenderer;
                        boolean isEnded = RendererHolder.isRendererEnabled(baseRenderer4) ? baseRenderer4.isEnded() : true;
                        if (baseRenderer3 != null && baseRenderer3.state != 0) {
                            isEnded &= baseRenderer3.isEnded();
                        }
                        if (isEnded) {
                            z = true;
                            BaseRenderer rendererReadingFromPeriod = rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder);
                            z6 = rendererReadingFromPeriod != null || rendererReadingFromPeriod.hasReadStreamToEnd() || rendererReadingFromPeriod.isReady() || rendererReadingFromPeriod.isEnded();
                            maybeTriggerOnRendererReadyChanged(i4, z6);
                            z2 = !z2 && z6;
                            if (z6) {
                                maybeThrowRendererStreamError(i4);
                            }
                        }
                    }
                    z = false;
                    BaseRenderer rendererReadingFromPeriod2 = rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder);
                    if (rendererReadingFromPeriod2 != null) {
                    }
                    maybeTriggerOnRendererReadyChanged(i4, z6);
                    if (z2) {
                    }
                    if (z6) {
                    }
                }
                i4++;
            }
        } else {
            mediaPeriodHolder.mediaPeriod.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j5 = mediaPeriodHolder.info.durationUs;
        boolean z7 = z && mediaPeriodHolder.prepared && (j5 == -9223372036854775807L || j5 <= this.playbackInfo.positionUs);
        if (z7 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            int i5 = this.playbackInfo.playbackSuppressionReason;
            this.playbackInfoUpdate.incrementPendingOperationAcks(0);
            updatePlayWhenReadyWithAudioFocus(this.audioFocusManager.updateAudioFocus(this.playbackInfo.playbackState, false), i5, false, 5);
        }
        if (!z7 || !mediaPeriodHolder.info.isFinal) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            if (playbackInfo2.playbackState == 2) {
                MediaPeriodQueue mediaPeriodQueue = this.queue;
                if (this.enabledRendererCount == 0) {
                    z5 = isTimelineReady();
                } else if (z2) {
                    if (playbackInfo2.isLoading) {
                        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.playing;
                        long j6 = shouldUseLivePlaybackSpeedControl(playbackInfo2.timeline, mediaPeriodHolder2.info.id) ? this.livePlaybackSpeedControl.currentTargetLiveOffsetUs : -9223372036854775807L;
                        MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodQueue.loading;
                        boolean z8 = mediaPeriodHolder3.isFullyBuffered() && mediaPeriodHolder3.info.isFinal;
                        boolean z9 = mediaPeriodHolder3.info.id.isAd() && !mediaPeriodHolder3.prepared;
                        if (!z8 && !z9) {
                            long totalBufferedDurationUs = getTotalBufferedDurationUs(mediaPeriodHolder3.getBufferedPositionUs());
                            DefaultLoadControl defaultLoadControl = this.loadControl;
                            PlayerId playerId = this.playerId;
                            j = -9223372036854775807L;
                            Timeline timeline = this.playbackInfo.timeline;
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodHolder2.info.id;
                            float f = this.mediaClock.getPlaybackParameters().speed;
                            boolean z10 = this.playbackInfo.playWhenReady;
                            boolean z11 = this.isRebuffering;
                            defaultLoadControl.getClass();
                            long j7 = j6;
                            MediaItem.LocalConfiguration localConfiguration = timeline.getWindow(timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, defaultLoadControl.period).windowIndex, defaultLoadControl.window, 0L).mediaItem.localConfiguration;
                            if (localConfiguration != null) {
                                String scheme = localConfiguration.uri.getScheme();
                                if (TextUtils.isEmpty(scheme) || DefaultLoadControl.LOCAL_PLAYBACK_SCHEMES.contains(scheme)) {
                                    z4 = true;
                                    if (f != 1.0f) {
                                        totalBufferedDurationUs = Math.round(totalBufferedDurationUs / f);
                                    }
                                    j2 = !z11 ? z4 ? defaultLoadControl.bufferForPlaybackAfterRebufferForLocalPlaybackUs : defaultLoadControl.bufferForPlaybackAfterRebufferUs : z4 ? defaultLoadControl.bufferForPlaybackForLocalPlaybackUs : defaultLoadControl.bufferForPlaybackUs;
                                    if (j7 != -9223372036854775807L) {
                                        j2 = Math.min(j7 / 2, j2);
                                    }
                                    if (j2 > 0 && totalBufferedDurationUs < j2) {
                                        if (!(!z4 ? defaultLoadControl.prioritizeTimeOverSizeThresholdsForLocalPlayback : false)) {
                                            DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) defaultLoadControl.loadingStates.get(playerId);
                                            playerLoadingState.getClass();
                                            synchronized (playerLoadingState) {
                                                i = playerLoadingState.allocatedCounts;
                                            }
                                            int i6 = i * defaultLoadControl.allocator.individualAllocationSize;
                                            DefaultLoadControl.PlayerLoadingState playerLoadingState2 = (DefaultLoadControl.PlayerLoadingState) defaultLoadControl.loadingStates.get(playerId);
                                            playerLoadingState2.getClass();
                                        }
                                        z5 = false;
                                        if (z5) {
                                            setState(3);
                                            this.pendingRecoverableRendererError = null;
                                            if (shouldPlayWhenReady()) {
                                                updateRebufferingState(false, false);
                                                zzd zzdVar = this.mediaClock;
                                                z3 = true;
                                                zzdVar.zzd = true;
                                                ((StandaloneMediaClock) zzdVar.zza).start();
                                                startRenderers();
                                                if (this.playbackInfo.playbackState == 2) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        RendererHolder[] rendererHolderArr2 = this.renderers;
                                                        if (i7 >= rendererHolderArr2.length) {
                                                            break;
                                                        }
                                                        if (rendererHolderArr2[i7].getRendererReadingFromPeriod(mediaPeriodHolder) != null) {
                                                            maybeThrowRendererStreamError(i7);
                                                        }
                                                        i7++;
                                                    }
                                                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                                                    if (!playbackInfo3.isLoading && playbackInfo3.totalBufferedDurationUs < 500000 && isLoadingPossible(this.queue.loading) && shouldPlayWhenReady()) {
                                                        long j8 = this.playbackMaybeBecameStuckAtMs;
                                                        SystemClock systemClock = this.clock;
                                                        if (j8 == -9223372036854775807L) {
                                                            systemClock.getClass();
                                                            this.playbackMaybeBecameStuckAtMs = android.os.SystemClock.elapsedRealtime();
                                                        } else {
                                                            systemClock.getClass();
                                                            if (android.os.SystemClock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= 4000) {
                                                                throw new StuckPlayerException(0, 4000);
                                                            }
                                                        }
                                                        boolean z12 = (shouldPlayWhenReady() || this.playbackInfo.playbackState != 3) ? false : z3;
                                                        if (this.offloadSchedulingEnabled || !this.requestForRendererSleep || !z12) {
                                                            z3 = false;
                                                        }
                                                        playbackInfo = this.playbackInfo;
                                                        if (playbackInfo.sleepingForOffload != z3) {
                                                            this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z3);
                                                        }
                                                        this.requestForRendererSleep = false;
                                                        if (!z3 && (i2 = this.playbackInfo.playbackState) != 4 && (z12 || i2 == 2 || (i2 == 3 && this.enabledRendererCount != 0))) {
                                                            scheduleNextWork(uptimeMillis);
                                                        }
                                                        android.os.Trace.endSection();
                                                    }
                                                }
                                                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
                                                if (shouldPlayWhenReady()) {
                                                }
                                                if (this.offloadSchedulingEnabled) {
                                                }
                                                z3 = false;
                                                playbackInfo = this.playbackInfo;
                                                if (playbackInfo.sleepingForOffload != z3) {
                                                }
                                                this.requestForRendererSleep = false;
                                                if (!z3) {
                                                    scheduleNextWork(uptimeMillis);
                                                }
                                                android.os.Trace.endSection();
                                            }
                                        }
                                    }
                                    z5 = true;
                                    if (z5) {
                                    }
                                }
                            }
                            z4 = false;
                            if (f != 1.0f) {
                            }
                            if (!z11) {
                            }
                            if (j7 != -9223372036854775807L) {
                            }
                            if (j2 > 0) {
                                if (!(!z4 ? defaultLoadControl.prioritizeTimeOverSizeThresholdsForLocalPlayback : false)) {
                                }
                                z5 = false;
                                if (z5) {
                                }
                            }
                            z5 = true;
                            if (z5) {
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    z5 = true;
                    if (z5) {
                    }
                } else {
                    z5 = false;
                }
                j = -9223372036854775807L;
                if (z5) {
                }
            } else {
                j = -9223372036854775807L;
            }
            z3 = true;
            if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z2 : !isTimelineReady())) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    for (MediaPeriodHolder mediaPeriodHolder4 = this.queue.playing; mediaPeriodHolder4 != null; mediaPeriodHolder4 = mediaPeriodHolder4.next) {
                        for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder4.trackSelectorResult.selections) {
                            if (exoTrackSelection != null) {
                                exoTrackSelection.onRebuffer();
                            }
                        }
                    }
                    DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.livePlaybackSpeedControl;
                    long j9 = defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs;
                    if (j9 != j) {
                        long j10 = j9 + defaultLivePlaybackSpeedControl.targetLiveOffsetRebufferDeltaUs;
                        defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs = j10;
                        long j11 = defaultLivePlaybackSpeedControl.maxTargetLiveOffsetUs;
                        if (j11 != j && j10 > j11) {
                            defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs = j11;
                        }
                        defaultLivePlaybackSpeedControl.lastPlaybackSpeedUpdateMs = j;
                    }
                }
                stopRenderers();
            }
            if (this.playbackInfo.playbackState == 2) {
            }
            this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            if (shouldPlayWhenReady()) {
            }
            if (this.offloadSchedulingEnabled) {
            }
            z3 = false;
            playbackInfo = this.playbackInfo;
            if (playbackInfo.sleepingForOffload != z3) {
            }
            this.requestForRendererSleep = false;
            if (!z3) {
            }
            android.os.Trace.endSection();
        }
        setState(4);
        stopRenderers();
        z3 = true;
        if (this.playbackInfo.playbackState == 2) {
        }
        this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
        if (shouldPlayWhenReady()) {
        }
        if (this.offloadSchedulingEnabled) {
        }
        z3 = false;
        playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload != z3) {
        }
        this.requestForRendererSleep = false;
        if (!z3) {
        }
        android.os.Trace.endSection();
    }

    public final void enableRenderer(MediaPeriodHolder mediaPeriodHolder, int i, boolean z, long j) {
        RendererHolder rendererHolder = this.renderers[i];
        boolean isRendererEnabled = rendererHolder.isRendererEnabled();
        BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
        if (isRendererEnabled) {
            return;
        }
        boolean z2 = mediaPeriodHolder == this.queue.playing;
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.trackSelectorResult;
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        ExoTrackSelection exoTrackSelection = trackSelectorResult.selections[i];
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[i];
        long j2 = mediaPeriodHolder.rendererPositionOffsetUs;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodHolder.info.id;
        BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            exoTrackSelection.getClass();
            formatArr[i2] = exoTrackSelection.getFormat(i2);
        }
        int i3 = rendererHolder.prewarmingState;
        zzd zzdVar = this.mediaClock;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            rendererHolder.primaryRequiresReset = true;
            Trace.checkState(baseRenderer.state == 0);
            baseRenderer.configuration = rendererConfiguration;
            baseRenderer.mediaPeriodId = mediaSource$MediaPeriodId;
            baseRenderer.state = 1;
            baseRenderer.onEnabled(z4, z2);
            baseRenderer.replaceStream(formatArr, sampleStream, j, j2, mediaSource$MediaPeriodId);
            baseRenderer.resetPosition(j, z4, true);
            zzdVar.onRendererEnabled(baseRenderer);
        } else {
            rendererHolder.secondaryRequiresReset = true;
            baseRenderer2.getClass();
            Trace.checkState(baseRenderer2.state == 0);
            baseRenderer2.configuration = rendererConfiguration;
            baseRenderer2.mediaPeriodId = mediaSource$MediaPeriodId;
            baseRenderer2.state = 1;
            baseRenderer2.onEnabled(z4, z2);
            baseRenderer2.replaceStream(formatArr, sampleStream, j, j2, mediaSource$MediaPeriodId);
            baseRenderer2.resetPosition(j, z4, true);
            zzdVar.onRendererEnabled(baseRenderer2);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        BaseRenderer rendererReadingFromPeriod = rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder);
        rendererReadingFromPeriod.getClass();
        rendererReadingFromPeriod.handleMessage(11, anonymousClass1);
        if (z3 && z2) {
            rendererHolder.start();
        }
    }

    public final void enableRenderers(boolean[] zArr, long j) {
        RendererHolder[] rendererHolderArr;
        ExoPlayerImplInternal exoPlayerImplInternal;
        long j2;
        MediaPeriodHolder mediaPeriodHolder = this.queue.reading;
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.trackSelectorResult;
        int i = 0;
        while (true) {
            rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                break;
            }
            if (!trackSelectorResult.isRendererEnabled(i)) {
                rendererHolderArr[i].reset();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < rendererHolderArr.length) {
            if (trackSelectorResult.isRendererEnabled(i2) && rendererHolderArr[i2].getRendererReadingFromPeriod(mediaPeriodHolder) == null) {
                exoPlayerImplInternal = this;
                j2 = j;
                exoPlayerImplInternal.enableRenderer(mediaPeriodHolder, i2, zArr[i2], j2);
            } else {
                exoPlayerImplInternal = this;
                j2 = j;
            }
            i2++;
            this = exoPlayerImplInternal;
            j = j2;
        }
    }

    public final long getLiveOffsetUs(Timeline timeline, Object obj, long j) {
        Timeline.Period period = this.period;
        int i = timeline.getPeriodByUid(obj, period).windowIndex;
        Timeline.Window window = this.window;
        timeline.getWindow(i, window);
        if (window.windowStartTimeMs == -9223372036854775807L || !window.isLive() || !window.isDynamic) {
            return -9223372036854775807L;
        }
        long j2 = window.elapsedRealtimeEpochOffsetMs;
        return Util.msToUs((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - window.windowStartTimeMs) - (j + period.positionInWindowUs);
    }

    public final long getMaxRendererReadPositionUs(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long j = mediaPeriodHolder.rendererPositionOffsetUs;
        if (!mediaPeriodHolder.prepared) {
            return j;
        }
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                return j;
            }
            if (rendererHolderArr[i].getRendererReadingFromPeriod(mediaPeriodHolder) != null) {
                BaseRenderer rendererReadingFromPeriod = rendererHolderArr[i].getRendererReadingFromPeriod(mediaPeriodHolder);
                Objects.requireNonNull(rendererReadingFromPeriod);
                long j2 = rendererReadingFromPeriod.readingPositionUs;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final Pair getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        long j = 0;
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.PLACEHOLDER_MEDIA_PERIOD_ID, 0L);
        }
        int firstWindowIndex = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
        Pair periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, firstWindowIndex, -9223372036854775807L);
        MediaSource$MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long longValue = ((Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            Object obj = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid;
            Timeline.Period period = this.period;
            timeline.getPeriodByUid(obj, period);
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex)) {
                period.adPlaybackState.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(j));
    }

    public final long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.queue.loading;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.rendererPositionUs - mediaPeriodHolder.rendererPositionOffsetUs));
    }

    public final void handleAudioFocusPlayerCommandInternal(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(i, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReady, playbackInfo.playWhenReadyChangeReason);
    }

    public final void handleAudioFocusVolumeMultiplierChange() {
        setVolumeInternal(this.volume);
    }

    public final void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.loading;
        if (mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod) {
            mediaPeriodQueue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
            return;
        }
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.preloading;
        if (mediaPeriodHolder2 == null || mediaPeriodHolder2.mediaPeriod != mediaPeriod) {
            return;
        }
        maybeContinuePreloading();
    }

    public final void handleIoException(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        if (mediaPeriodHolder != null) {
            exoPlaybackException = exoPlaybackException.copyWithMediaPeriodId(mediaPeriodHolder.info.id);
        }
        Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackException);
    }

    public final void handleLoadingMediaPeriodChanged(boolean z) {
        MediaPeriodHolder mediaPeriodHolder = this.queue.loading;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodHolder == null ? this.playbackInfo.periodId : mediaPeriodHolder.info.id;
        boolean equals = this.playbackInfo.loadingMediaPeriodId.equals(mediaSource$MediaPeriodId);
        if (!equals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaSource$MediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = mediaPeriodHolder == null ? playbackInfo.positionUs : mediaPeriodHolder.getBufferedPositionUs();
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        playbackInfo2.totalBufferedDurationUs = getTotalBufferedDurationUs(playbackInfo2.bufferedPositionUs);
        if ((!equals || z) && mediaPeriodHolder != null && mediaPeriodHolder.prepared) {
            updateLoadControlTrackSelection(mediaPeriodHolder.info.id, mediaPeriodHolder.trackSelectorResult);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ae A[Catch: all -> 0x03a9, TryCatch #3 {all -> 0x03a9, blocks: (B:127:0x03a5, B:128:0x03ae, B:130:0x03b4, B:43:0x03c3, B:65:0x03ca, B:67:0x03d0, B:69:0x03da, B:71:0x03e7, B:74:0x03ea), top: B:41:0x0370 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMediaSourceListInfoRefreshed(Timeline timeline, boolean z) {
        long j;
        Timeline.Window window;
        Object obj;
        int i;
        long constrainValue;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        Timeline.Period period;
        boolean z5;
        Timeline timeline2;
        Timeline.Period period2;
        Timeline timeline3;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChange;
        int i3;
        long longValue;
        boolean z6;
        int i4;
        boolean z7;
        Timeline.Period period3;
        Timeline timeline4;
        Timeline timeline5;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        boolean z8;
        Timeline timeline6;
        long j8;
        int updateQueuedPeriods;
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodQueue mediaPeriodQueue;
        PlaybackInfo playbackInfo = this.playbackInfo;
        SeekPosition seekPosition = this.pendingInitialSeekPosition;
        MediaPeriodQueue mediaPeriodQueue2 = this.queue;
        int i5 = this.repeatMode;
        boolean z9 = this.shuffleModeEnabled;
        Timeline.Window window2 = this.window;
        Timeline.Period period4 = this.period;
        if (timeline.isEmpty()) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = PlaybackInfo.PLACEHOLDER_MEDIA_PERIOD_ID;
            boolean z10 = (mediaSource$MediaPeriodId2.equals(playbackInfo.periodId) && playbackInfo.positionUs == 0) ? false : true;
            PositionUpdateForPlaylistChange positionUpdateForPlaylistChange2 = new PositionUpdateForPlaylistChange(mediaSource$MediaPeriodId2, 0L, -9223372036854775807L, false, true, false, z10, z10 && z && !playbackInfo.timeline.isEmpty() && !playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period4).isPlaceholder, 4);
            timeline4 = timeline;
            j5 = 0;
            positionUpdateForPlaylistChange = positionUpdateForPlaylistChange2;
            period3 = period4;
        } else {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = playbackInfo.periodId;
            Object obj2 = mediaSource$MediaPeriodId3.periodUid;
            Timeline timeline7 = playbackInfo.timeline;
            boolean z11 = timeline7.isEmpty() || timeline7.getPeriodByUid(mediaSource$MediaPeriodId3.periodUid, period4).isPlaceholder;
            long j9 = (playbackInfo.periodId.isAd() || z11) ? playbackInfo.requestedContentPositionUs : playbackInfo.positionUs;
            if (seekPosition != null) {
                boolean z12 = true;
                j = 1;
                Timeline timeline8 = timeline;
                Pair resolveSeekPositionUs = resolveSeekPositionUs(timeline8, seekPosition, true, i5, z9, window2, period4);
                if (resolveSeekPositionUs == null) {
                    i4 = timeline8.getFirstWindowIndex(z9);
                    obj = obj2;
                    longValue = j9;
                    z6 = false;
                    z7 = false;
                } else {
                    long j10 = seekPosition.windowPositionUs;
                    obj = resolveSeekPositionUs.first;
                    if (j10 == -9223372036854775807L) {
                        i4 = timeline8.getPeriodByUid(obj, period4).windowIndex;
                        obj = obj2;
                        longValue = j9;
                        z6 = false;
                    } else {
                        longValue = ((Long) resolveSeekPositionUs.second).longValue();
                        z6 = true;
                        i4 = -1;
                    }
                    z7 = playbackInfo.playbackState == 4;
                    z12 = false;
                }
                z4 = z6;
                z3 = z12;
                z2 = z7;
                j2 = longValue;
                i = i4;
                window = window2;
                timeline3 = timeline8;
                period2 = period4;
            } else {
                j = 1;
                Timeline timeline9 = timeline;
                if (playbackInfo.timeline.isEmpty()) {
                    i = timeline9.getFirstWindowIndex(z9);
                    window = window2;
                    obj = obj2;
                } else if (timeline9.getIndexOfPeriod(obj2) == -1) {
                    obj = obj2;
                    int resolveSubsequentPeriod = resolveSubsequentPeriod(window2, period4, i5, z9, obj, playbackInfo.timeline, timeline9);
                    window = window2;
                    Timeline timeline10 = timeline9;
                    period = period4;
                    if (resolveSubsequentPeriod == -1) {
                        resolveSubsequentPeriod = timeline10.getFirstWindowIndex(z9);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i = resolveSubsequentPeriod;
                    z3 = z5;
                    j2 = j9;
                    z2 = false;
                    timeline2 = timeline10;
                    z4 = false;
                    timeline3 = timeline2;
                    period2 = period;
                } else {
                    window = window2;
                    obj = obj2;
                    if (j9 == -9223372036854775807L) {
                        i = timeline9.getPeriodByUid(obj, period4).windowIndex;
                    } else if (z11) {
                        playbackInfo.timeline.getPeriodByUid(mediaSource$MediaPeriodId3.periodUid, period4);
                        if (playbackInfo.timeline.getWindow(period4.windowIndex, window, 0L).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaSource$MediaPeriodId3.periodUid)) {
                            Pair periodPositionUs = timeline9.getPeriodPositionUs(window, period4, timeline9.getPeriodByUid(obj, period4).windowIndex, j9 + period4.positionInWindowUs);
                            obj = periodPositionUs.first;
                            constrainValue = ((Long) periodPositionUs.second).longValue();
                        } else {
                            constrainValue = timeline9.getPeriodByUid(obj, period4).durationUs != -9223372036854775807L ? Util.constrainValue(j9, 0L, period4.durationUs - 1) : j9;
                        }
                        j2 = constrainValue;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        timeline3 = timeline9;
                        period2 = period4;
                    } else {
                        i = -1;
                    }
                }
                j2 = j9;
                z2 = false;
                z3 = false;
                timeline2 = timeline9;
                period = period4;
                z4 = false;
                timeline3 = timeline2;
                period2 = period;
            }
            if (i != -1) {
                Pair periodPositionUs2 = timeline3.getPeriodPositionUs(window, period2, i, -9223372036854775807L);
                obj = periodPositionUs2.first;
                j2 = ((Long) periodPositionUs2.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = j2;
            }
            MediaSource$MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline3, obj, j2);
            int i6 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
            boolean z13 = i6 == -1 || ((i3 = mediaSource$MediaPeriodId3.nextAdGroupIndex) != -1 && i6 >= i3);
            boolean equals = mediaSource$MediaPeriodId3.periodUid.equals(obj);
            boolean z14 = equals && !mediaSource$MediaPeriodId3.isAd() && !resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && z13;
            Timeline.Period periodByUid = timeline3.getPeriodByUid(obj, period2);
            if (z11 || j9 != j3) {
                j4 = j3;
            } else {
                Object obj3 = mediaSource$MediaPeriodId3.periodUid;
                int i7 = mediaSource$MediaPeriodId3.adGroupIndex;
                j4 = j3;
                if (obj3.equals(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid)) {
                    if (mediaSource$MediaPeriodId3.isAd()) {
                        periodByUid.isServerSideInsertedAdGroup(i7);
                    }
                    if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                        periodByUid.isServerSideInsertedAdGroup(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex);
                    }
                }
            }
            if (z14) {
                resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaSource$MediaPeriodId3;
            }
            if (!resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                if (equals && mediaSource$MediaPeriodId3.isAd()) {
                    AdPlaybackState.AdGroup adGroup = timeline3.getPeriodByUid(obj, period2).adPlaybackState.getAdGroup(mediaSource$MediaPeriodId3.adGroupIndex);
                    adGroup.getClass();
                    long j11 = playbackInfo.requestedContentPositionUs;
                    j5 = 0;
                    if (j11 == -9223372036854775807L || 0 > j11) {
                        int i8 = adGroup.count;
                        int i9 = mediaSource$MediaPeriodId3.adIndexInAdGroup;
                        if (i8 > i9 && adGroup.states[i9] == 2) {
                            long j12 = timeline3.getPeriodByUid(obj, period2).durationUs;
                            if (j12 != -9223372036854775807L) {
                                j2 = Math.min(j12 - j, j2);
                            }
                            j6 = j2;
                            j7 = j6;
                        }
                    }
                } else {
                    j5 = 0;
                }
                j6 = j2;
                j7 = j4;
            } else if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(mediaSource$MediaPeriodId3)) {
                j6 = playbackInfo.positionUs;
                j7 = j4;
                j5 = 0;
            } else {
                timeline3.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, period2);
                if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == period2.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex)) {
                    period2.adPlaybackState.getClass();
                }
                j7 = j4;
                j5 = 0;
                j6 = 0;
            }
            boolean z15 = (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(playbackInfo.periodId) && j6 == playbackInfo.positionUs) ? false : true;
            int i10 = timeline3.getIndexOfPeriod(playbackInfo.periodId.periodUid) == -1 ? 4 : 3;
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid.equals(playbackInfo.periodId.periodUid) && resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex != -1) {
                AdPlaybackState.AdGroup adGroup2 = timeline3.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, period2).adPlaybackState.getAdGroup(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex);
                int i11 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup;
                int[] iArr = adGroup2.states;
                if (i11 >= iArr.length || iArr[i11] != 2) {
                    i2 = 0;
                    positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j6, j7, z2, z3, z4, z15, (z15 || !z || playbackInfo.timeline.isEmpty() || playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period2).isPlaceholder) ? false : true, i2);
                    timeline4 = timeline3;
                    period3 = period2;
                }
            }
            i2 = i10;
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j6, j7, z2, z3, z4, z15, (z15 || !z || playbackInfo.timeline.isEmpty() || playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period2).isPlaceholder) ? false : true, i2);
            timeline4 = timeline3;
            period3 = period2;
        }
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId4 = positionUpdateForPlaylistChange.periodId;
        long j13 = positionUpdateForPlaylistChange.periodPositionUs;
        try {
            if (positionUpdateForPlaylistChange.endPlayback) {
                z8 = true;
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            } else {
                z8 = true;
            }
            RendererHolder[] rendererHolderArr = this.renderers;
            int length = rendererHolderArr.length;
            int i12 = 0;
            Timeline timeline11 = period3;
            while (i12 < length) {
                RendererHolder rendererHolder = rendererHolderArr[i12];
                BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
                boolean equals2 = Objects.equals(baseRenderer.timeline, timeline4);
                if (equals2 == 0) {
                    baseRenderer.timeline = timeline4;
                    baseRenderer.onTimelineChanged();
                }
                BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
                if (baseRenderer2 != null && !Objects.equals(baseRenderer2.timeline, timeline4)) {
                    baseRenderer2.timeline = timeline4;
                    baseRenderer2.onTimelineChanged();
                }
                i12++;
                timeline11 = equals2;
            }
            try {
                if (positionUpdateForPlaylistChange.periodPositionChanged) {
                    timeline11 = timeline4;
                    if (!timeline11.isEmpty()) {
                        for (MediaPeriodHolder mediaPeriodHolder2 = this.queue.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.next) {
                            if (mediaPeriodHolder2.info.id.equals(mediaSource$MediaPeriodId4)) {
                                mediaPeriodHolder2.info = this.queue.getUpdatedMediaPeriodInfo(timeline11, mediaPeriodHolder2.info);
                                mediaPeriodHolder2.updateClipping();
                            }
                        }
                        boolean z16 = positionUpdateForPlaylistChange.forceBufferingState;
                        try {
                            mediaPeriodQueue = this.queue;
                            mediaSource$MediaPeriodId = mediaSource$MediaPeriodId4;
                        } catch (Throwable th) {
                            th = th;
                            mediaSource$MediaPeriodId = mediaSource$MediaPeriodId4;
                            timeline6 = timeline11;
                            timeline5 = timeline6;
                            PlaybackInfo playbackInfo2 = this.playbackInfo;
                            Timeline timeline12 = playbackInfo2.timeline;
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId5 = playbackInfo2.periodId;
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId6 = mediaSource$MediaPeriodId;
                            updatePlaybackSpeedSettingsForNewPeriod(timeline5, mediaSource$MediaPeriodId6, timeline12, mediaSource$MediaPeriodId5, positionUpdateForPlaylistChange.setTargetLiveOffset ? j13 : -9223372036854775807L, false);
                            if (!positionUpdateForPlaylistChange.periodPositionChanged || positionUpdateForPlaylistChange.requestedContentPositionUs != this.playbackInfo.requestedContentPositionUs) {
                                long j14 = positionUpdateForPlaylistChange.requestedContentPositionUs;
                                boolean z17 = positionUpdateForPlaylistChange.reportDiscontinuity;
                                this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId6, j13, j14, z17 ? j13 : this.playbackInfo.discontinuityStartPositionUs, z17, positionUpdateForPlaylistChange.discontinuityReason);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline5, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline5);
                            if (!timeline5.isEmpty()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(false);
                            this.handler.sendEmptyMessage(2);
                            throw th;
                        }
                        try {
                            j13 = seekToPeriodPosition(mediaSource$MediaPeriodId, j13, mediaPeriodQueue.playing != mediaPeriodQueue.reading ? z8 : false, z16);
                            PlaybackInfo playbackInfo3 = this.playbackInfo;
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId7 = mediaSource$MediaPeriodId;
                            updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaSource$MediaPeriodId7, playbackInfo3.timeline, playbackInfo3.periodId, !positionUpdateForPlaylistChange.setTargetLiveOffset ? j13 : -9223372036854775807L, false);
                            if (!positionUpdateForPlaylistChange.periodPositionChanged || positionUpdateForPlaylistChange.requestedContentPositionUs != this.playbackInfo.requestedContentPositionUs) {
                                long j15 = positionUpdateForPlaylistChange.requestedContentPositionUs;
                                boolean z18 = positionUpdateForPlaylistChange.reportDiscontinuity;
                                this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId7, j13, j15, !z18 ? j13 : this.playbackInfo.discontinuityStartPositionUs, z18, positionUpdateForPlaylistChange.discontinuityReason);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                            if (!timeline.isEmpty()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(false);
                            this.handler.sendEmptyMessage(2);
                        } catch (Throwable th2) {
                            th = th2;
                            j13 = j13;
                            timeline6 = timeline11;
                            timeline5 = timeline6;
                            PlaybackInfo playbackInfo22 = this.playbackInfo;
                            Timeline timeline122 = playbackInfo22.timeline;
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId52 = playbackInfo22.periodId;
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId62 = mediaSource$MediaPeriodId;
                            updatePlaybackSpeedSettingsForNewPeriod(timeline5, mediaSource$MediaPeriodId62, timeline122, mediaSource$MediaPeriodId52, positionUpdateForPlaylistChange.setTargetLiveOffset ? j13 : -9223372036854775807L, false);
                            if (!positionUpdateForPlaylistChange.periodPositionChanged) {
                            }
                            long j142 = positionUpdateForPlaylistChange.requestedContentPositionUs;
                            boolean z172 = positionUpdateForPlaylistChange.reportDiscontinuity;
                            this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId62, j13, j142, z172 ? j13 : this.playbackInfo.discontinuityStartPositionUs, z172, positionUpdateForPlaylistChange.discontinuityReason);
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline5, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline5);
                            if (!timeline5.isEmpty()) {
                            }
                            handleLoadingMediaPeriodChanged(false);
                            this.handler.sendEmptyMessage(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        MediaPeriodHolder mediaPeriodHolder3 = this.queue.reading;
                        long maxRendererReadPositionUs = mediaPeriodHolder3 == null ? j5 : getMaxRendererReadPositionUs(mediaPeriodHolder3);
                        try {
                            try {
                                if (areRenderersPrewarming() && (mediaPeriodHolder = this.queue.prewarming) != null) {
                                    j8 = getMaxRendererReadPositionUs(mediaPeriodHolder);
                                    updateQueuedPeriods = this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, maxRendererReadPositionUs, j8);
                                    if ((updateQueuedPeriods & 1) == 0) {
                                        seekToCurrentPosition(false);
                                    } else if ((updateQueuedPeriods & 2) != 0) {
                                        disableAndResetPrewarmingRenderers();
                                    }
                                }
                                updateQueuedPeriods = this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, maxRendererReadPositionUs, j8);
                                if ((updateQueuedPeriods & 1) == 0) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                timeline11 = timeline;
                                mediaSource$MediaPeriodId = mediaSource$MediaPeriodId4;
                                timeline6 = timeline11;
                                timeline5 = timeline6;
                                PlaybackInfo playbackInfo222 = this.playbackInfo;
                                Timeline timeline1222 = playbackInfo222.timeline;
                                MediaSource$MediaPeriodId mediaSource$MediaPeriodId522 = playbackInfo222.periodId;
                                MediaSource$MediaPeriodId mediaSource$MediaPeriodId622 = mediaSource$MediaPeriodId;
                                updatePlaybackSpeedSettingsForNewPeriod(timeline5, mediaSource$MediaPeriodId622, timeline1222, mediaSource$MediaPeriodId522, positionUpdateForPlaylistChange.setTargetLiveOffset ? j13 : -9223372036854775807L, false);
                                if (!positionUpdateForPlaylistChange.periodPositionChanged) {
                                }
                                long j1422 = positionUpdateForPlaylistChange.requestedContentPositionUs;
                                boolean z1722 = positionUpdateForPlaylistChange.reportDiscontinuity;
                                this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId622, j13, j1422, z1722 ? j13 : this.playbackInfo.discontinuityStartPositionUs, z1722, positionUpdateForPlaylistChange.discontinuityReason);
                                resetPendingPauseAtEndOfPeriod();
                                resolvePendingMessagePositions(timeline5, this.playbackInfo.timeline);
                                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline5);
                                if (!timeline5.isEmpty()) {
                                }
                                handleLoadingMediaPeriodChanged(false);
                                this.handler.sendEmptyMessage(2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            timeline11 = timeline;
                        }
                        j8 = j5;
                    } catch (Throwable th5) {
                        th = th5;
                        timeline11 = timeline4;
                    }
                }
                mediaSource$MediaPeriodId = mediaSource$MediaPeriodId4;
                PlaybackInfo playbackInfo32 = this.playbackInfo;
                MediaSource$MediaPeriodId mediaSource$MediaPeriodId72 = mediaSource$MediaPeriodId;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaSource$MediaPeriodId72, playbackInfo32.timeline, playbackInfo32.periodId, !positionUpdateForPlaylistChange.setTargetLiveOffset ? j13 : -9223372036854775807L, false);
                if (!positionUpdateForPlaylistChange.periodPositionChanged) {
                }
                long j152 = positionUpdateForPlaylistChange.requestedContentPositionUs;
                boolean z182 = positionUpdateForPlaylistChange.reportDiscontinuity;
                this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId72, j13, j152, !z182 ? j13 : this.playbackInfo.discontinuityStartPositionUs, z182, positionUpdateForPlaylistChange.discontinuityReason);
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                if (!timeline.isEmpty()) {
                }
                handleLoadingMediaPeriodChanged(false);
                this.handler.sendEmptyMessage(2);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            timeline5 = timeline4;
            mediaSource$MediaPeriodId = mediaSource$MediaPeriodId4;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        MediaPeriodHolder mediaPeriodHolder;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        MediaPeriodHolder mediaPeriodHolder2;
        int i2;
        int i3 = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.playbackInfoUpdate.incrementPendingOperationAcks(1);
                    updatePlayWhenReadyWithAudioFocus(this.audioFocusManager.updateAudioFocus(this.playbackInfo.playbackState, z), i4 >> 4, z, i4 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal((ConditionVariable) message.obj);
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (ConditionVariable) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
                    handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(message.obj);
                    moveMediaItemsInternal();
                    throw null;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder$DefaultShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder$DefaultShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternal();
                    seekToCurrentPosition(true);
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    setVideoOutputInternal(pair.first, (ConditionVariable) pair.second);
                    break;
                case 31:
                    setAudioAttributesInternal((AudioAttributes) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    setVolumeInternal(((Float) message.obj).floatValue());
                    break;
                case 33:
                    handleAudioFocusPlayerCommandInternal(message.arg1);
                    break;
                case 34:
                    handleAudioFocusVolumeMultiplierChange();
                    break;
                case 35:
                    setVideoFrameMetadataListenerInternal((VideoFrameMetadataListener) message.obj);
                    break;
                case 36:
                    setScrubbingModeEnabledInternal(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.seekIsPendingWhileScrubbing = false;
                    SeekPosition seekPosition = this.queuedSeekWhileScrubbing;
                    if (seekPosition != null) {
                        seekToInternal(seekPosition);
                        this.queuedSeekWhileScrubbing = null;
                        break;
                    }
                    break;
                case 38:
                    setScrubbingModeParametersInternal((ScrubbingModeParameters) message.obj);
                    break;
                case 39:
                    setImageMetadataListenerInternal((ExoPlayerImplInternal$$ExternalSyntheticLambda4) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.contentIsMalformed;
            int i5 = e.dataType;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                handleIoException(e, i3);
            }
            i3 = i2;
            handleIoException(e, i3);
        } catch (DataSourceException e2) {
            handleIoException(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i6 = e.f876type;
            MediaPeriodQueue mediaPeriodQueue = this.queue;
            if (i6 == 1 && (mediaPeriodHolder2 = mediaPeriodQueue.reading) != null && e.mediaPeriodId == null) {
                e = e.copyWithMediaPeriodId(mediaPeriodHolder2.info.id);
            }
            int i7 = e.f876type;
            SystemHandlerWrapper systemHandlerWrapper = this.handler;
            if (i7 == 1 && (mediaSource$MediaPeriodId = e.mediaPeriodId) != null && isRendererPrewarmingMediaPeriod(e.rendererIndex, mediaSource$MediaPeriodId)) {
                this.isPrewarmingDisabledUntilNextTransition = true;
                disableAndResetPrewarmingRenderers();
                MediaPeriodHolder prewarmingPeriod = mediaPeriodQueue.getPrewarmingPeriod();
                MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodQueue.playing;
                if (mediaPeriodHolder3 != prewarmingPeriod) {
                    while (mediaPeriodHolder3 != null) {
                        MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodHolder3.next;
                        if (mediaPeriodHolder4 == prewarmingPeriod) {
                            break;
                        }
                        mediaPeriodHolder3 = mediaPeriodHolder4;
                    }
                }
                mediaPeriodQueue.removeAfter(mediaPeriodHolder3);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    systemHandlerWrapper.sendEmptyMessage(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                if (e.f876type == 1 && mediaPeriodQueue.playing != mediaPeriodQueue.reading) {
                    while (true) {
                        mediaPeriodHolder = mediaPeriodQueue.playing;
                        if (mediaPeriodHolder == mediaPeriodQueue.reading) {
                            break;
                        }
                        mediaPeriodQueue.advancePlayingPeriod();
                    }
                    Trace.checkNotNull(mediaPeriodHolder);
                    maybeNotifyPlaybackInfoChanged();
                    MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                    MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = mediaPeriodInfo.id;
                    long j = mediaPeriodInfo.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId2, j, mediaPeriodInfo.requestedContentPositionUs, j, true, 0);
                }
                if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i = e.errorCode) == 5004 || i == 5003)) {
                    Log.w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.pendingRecoverableRendererError == null) {
                        this.pendingRecoverableRendererError = e;
                    }
                    SystemHandlerWrapper.SystemMessage obtainMessage = systemHandlerWrapper.obtainMessage(25, e);
                    Handler handler = systemHandlerWrapper.handler;
                    Message message2 = obtainMessage.message;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    obtainMessage.recycle();
                } else {
                    Log.e("ExoPlayerImplInternal", "Playback error", e);
                    stopInternal(true, false);
                    this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            handleIoException(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            handleIoException(e5, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA);
        } catch (IOException e6) {
            handleIoException(e6, 2000);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i3 = 1004;
            }
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, i3);
            Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackException2);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public final void handlePeriodPrepared(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder;
        ExoPlayerImplInternal exoPlayerImplInternal;
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.loading;
        zzd zzdVar = this.mediaClock;
        if (mediaPeriodHolder2 != null && mediaPeriodHolder2.mediaPeriod == mediaPeriod) {
            mediaPeriodHolder2.getClass();
            if (!mediaPeriodHolder2.prepared) {
                float f = zzdVar.getPlaybackParameters().speed;
                PlaybackInfo playbackInfo = this.playbackInfo;
                mediaPeriodHolder2.handlePrepared(f, playbackInfo.timeline, playbackInfo.playWhenReady);
            }
            updateLoadControlTrackSelection(mediaPeriodHolder2.info.id, mediaPeriodHolder2.trackSelectorResult);
            if (mediaPeriodHolder2 == mediaPeriodQueue.playing) {
                resetRendererPosition(mediaPeriodHolder2.info.startPositionUs, true);
                enableRenderers(new boolean[this.renderers.length], mediaPeriodQueue.reading.getStartPositionRendererTime());
                mediaPeriodHolder2.allRenderersInCorrectState = true;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                MediaSource$MediaPeriodId mediaSource$MediaPeriodId = playbackInfo2.periodId;
                long j = mediaPeriodHolder2.info.startPositionUs;
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId, j, playbackInfo2.requestedContentPositionUs, j, false, 5);
            } else {
                exoPlayerImplInternal = this;
            }
            exoPlayerImplInternal.maybeContinueLoading();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= mediaPeriodQueue.preloadPriorityList.size()) {
                mediaPeriodHolder = null;
                break;
            }
            mediaPeriodHolder = (MediaPeriodHolder) mediaPeriodQueue.preloadPriorityList.get(i);
            if (mediaPeriodHolder.mediaPeriod == mediaPeriod) {
                break;
            } else {
                i++;
            }
        }
        if (mediaPeriodHolder != null) {
            Trace.checkState(!mediaPeriodHolder.prepared);
            float f2 = zzdVar.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo3 = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f2, playbackInfo3.timeline, playbackInfo3.playWhenReady);
            MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodQueue.preloading;
            if (mediaPeriodHolder3 == null || mediaPeriodHolder3.mediaPeriod != mediaPeriod) {
                return;
            }
            maybeContinuePreloading();
        }
    }

    public final void handlePlaybackParameters(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        float f2 = playbackParameters.speed;
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        while (true) {
            i = 0;
            if (mediaPeriodHolder == null) {
                break;
            }
            ExoTrackSelection[] exoTrackSelectionArr = mediaPeriodHolder.trackSelectorResult.selections;
            int length = exoTrackSelectionArr.length;
            while (i < length) {
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f2);
                }
                i++;
            }
            mediaPeriodHolder = mediaPeriodHolder.next;
        }
        RendererHolder[] rendererHolderArr = this.renderers;
        int length2 = rendererHolderArr.length;
        while (i < length2) {
            RendererHolder rendererHolder = rendererHolderArr[i];
            float f3 = playbackParameters.speed;
            ((BaseRenderer) rendererHolder.primaryRenderer).setPlaybackSpeed(f, f3);
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.secondaryRenderer;
            if (baseRenderer != null) {
                baseRenderer.setPlaybackSpeed(f, f3);
            }
            i++;
        }
    }

    public final PlaybackInfo handlePositionDiscontinuity(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        RegularImmutableList regularImmutableList;
        boolean z2;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaSource$MediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult = playbackInfo.trackSelectorResult;
        List list = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared) {
            MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
            trackGroupArray = mediaPeriodHolder == null ? TrackGroupArray.EMPTY : mediaPeriodHolder.trackGroups;
            trackSelectorResult = mediaPeriodHolder == null ? this.emptyTrackSelectorResult : mediaPeriodHolder.trackSelectorResult;
            ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult.selections;
            ImmutableList.Builder builder = new ImmutableList.Builder(4);
            boolean z3 = false;
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                    if (metadata == null) {
                        builder.m2032add((Object) new Metadata(new Metadata.Entry[0]));
                    } else {
                        builder.m2032add((Object) metadata);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                regularImmutableList = builder.build();
            } else {
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                regularImmutableList = RegularImmutableList.EMPTY;
            }
            list = regularImmutableList;
            if (mediaPeriodHolder != null) {
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j2) {
                    mediaPeriodHolder.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j2);
                }
            }
            RendererHolder[] rendererHolderArr = this.renderers;
            MediaPeriodQueue mediaPeriodQueue = this.queue;
            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.playing;
            if (mediaPeriodHolder2 == mediaPeriodQueue.reading && mediaPeriodHolder2 != null) {
                TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder2.trackSelectorResult;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= rendererHolderArr.length) {
                        z2 = true;
                        break;
                    }
                    if (trackSelectorResult2.isRendererEnabled(i2)) {
                        if (((BaseRenderer) rendererHolderArr[i2].primaryRenderer).trackType != 1) {
                            z2 = false;
                            break;
                        }
                        if (trackSelectorResult2.rendererConfigurations[i2].offloadModePreferred != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.offloadSchedulingEnabled) {
                    this.offloadSchedulingEnabled = z5;
                    if (!z5 && this.playbackInfo.sleepingForOffload) {
                        this.handler.sendEmptyMessage(2);
                    }
                }
            }
        } else if (!mediaSource$MediaPeriodId.equals(playbackInfo.periodId)) {
            trackGroupArray = TrackGroupArray.EMPTY;
            trackSelectorResult = this.emptyTrackSelectorResult;
            list = RegularImmutableList.EMPTY;
        }
        TrackSelectorResult trackSelectorResult3 = trackSelectorResult;
        List list2 = list;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        if (z) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.playbackInfoUpdate;
            if (!nalUnitTargetBuffer.isCompleted || nalUnitTargetBuffer.nalLength == 5) {
                nalUnitTargetBuffer.isFilling = true;
                nalUnitTargetBuffer.isCompleted = true;
                nalUnitTargetBuffer.nalLength = i;
            } else {
                Trace.checkArgument(i == 5);
            }
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        return playbackInfo2.copyWithNewPosition(mediaSource$MediaPeriodId, j, j2, j3, getTotalBufferedDurationUs(playbackInfo2.bufferedPositionUs), trackGroupArray2, trackSelectorResult3, list2);
    }

    public final boolean isRendererPrewarmingMediaPeriod(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.prewarming;
        if (mediaPeriodHolder != null && mediaPeriodHolder.info.id.equals(mediaSource$MediaPeriodId)) {
            RendererHolder rendererHolder = this.renderers[i];
            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.prewarming;
            int i2 = rendererHolder.prewarmingState;
            boolean z = (i2 == 2 || i2 == 4) && rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder2) == ((BaseRenderer) rendererHolder.primaryRenderer);
            boolean z2 = rendererHolder.prewarmingState == 3 && rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder2) == ((BaseRenderer) rendererHolder.secondaryRenderer);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTimelineReady() {
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        long j = mediaPeriodHolder.info.durationUs;
        if (mediaPeriodHolder.prepared) {
            return j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady();
        }
        return false;
    }

    public final void maybeContinueLoading() {
        boolean shouldContinueLoading;
        if (isLoadingPossible(this.queue.loading)) {
            MediaPeriodHolder mediaPeriodHolder = this.queue.loading;
            long totalBufferedDurationUs = getTotalBufferedDurationUs(!mediaPeriodHolder.prepared ? 0L : mediaPeriodHolder.mediaPeriod.getNextLoadPositionUs());
            MediaPeriodHolder mediaPeriodHolder2 = this.queue.playing;
            long j = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, mediaPeriodHolder.info.id) ? this.livePlaybackSpeedControl.currentTargetLiveOffsetUs : -9223372036854775807L;
            PlayerId playerId = this.playerId;
            Timeline timeline = this.playbackInfo.timeline;
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodHolder.info.id;
            float f = this.mediaClock.getPlaybackParameters().speed;
            boolean z = this.playbackInfo.playWhenReady;
            LoadControl$Parameters loadControl$Parameters = new LoadControl$Parameters(playerId, timeline, mediaSource$MediaPeriodId, totalBufferedDurationUs, f, this.isRebuffering, j);
            shouldContinueLoading = this.loadControl.shouldContinueLoading(loadControl$Parameters);
            MediaPeriodHolder mediaPeriodHolder3 = this.queue.playing;
            if (!shouldContinueLoading && mediaPeriodHolder3.prepared && totalBufferedDurationUs < 500000 && this.backBufferDurationUs > 0) {
                mediaPeriodHolder3.mediaPeriod.discardBuffer(this.playbackInfo.positionUs);
                shouldContinueLoading = this.loadControl.shouldContinueLoading(loadControl$Parameters);
            }
        } else {
            shouldContinueLoading = false;
        }
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            MediaPeriodHolder mediaPeriodHolder4 = this.queue.loading;
            mediaPeriodHolder4.getClass();
            LoadingInfo.Builder builder = new LoadingInfo.Builder();
            builder.playbackPositionUs = this.rendererPositionUs - mediaPeriodHolder4.rendererPositionOffsetUs;
            float f2 = this.mediaClock.getPlaybackParameters().speed;
            Trace.checkArgument(f2 > RecyclerView.DECELERATION_RATE || f2 == -3.4028235E38f);
            builder.playbackSpeed = f2;
            long j2 = this.lastRebufferRealtimeMs;
            Trace.checkArgument(j2 >= 0 || j2 == -9223372036854775807L);
            builder.lastRebufferRealtimeMs = j2;
            LoadingInfo loadingInfo = new LoadingInfo(builder);
            Trace.checkState(mediaPeriodHolder4.next == null);
            mediaPeriodHolder4.mediaPeriod.continueLoading(loadingInfo);
        }
        updateIsLoading();
    }

    public final void maybeContinuePreloading() {
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        mediaPeriodQueue.maybeUpdatePreloadMediaPeriodHolder();
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.preloading;
        if (mediaPeriodHolder != null) {
            MediaPeriod mediaPeriod = mediaPeriodHolder.mediaPeriod;
            if ((!mediaPeriodHolder.prepareCalled || mediaPeriodHolder.prepared) && !mediaPeriod.isLoading()) {
                Timeline timeline = this.playbackInfo.timeline;
                if (mediaPeriodHolder.prepared) {
                    mediaPeriod.getBufferedPositionUs();
                }
                Iterator it = this.loadControl.loadingStates.values().iterator();
                while (it.hasNext()) {
                    if (((DefaultLoadControl.PlayerLoadingState) it.next()).isLoading) {
                        return;
                    }
                }
                if (!mediaPeriodHolder.prepareCalled) {
                    long j = mediaPeriodHolder.info.startPositionUs;
                    mediaPeriodHolder.prepareCalled = true;
                    mediaPeriod.prepare(this, j);
                    return;
                }
                LoadingInfo.Builder builder = new LoadingInfo.Builder();
                builder.playbackPositionUs = this.rendererPositionUs - mediaPeriodHolder.rendererPositionOffsetUs;
                float f = this.mediaClock.getPlaybackParameters().speed;
                Trace.checkArgument(f > RecyclerView.DECELERATION_RATE || f == -3.4028235E38f);
                builder.playbackSpeed = f;
                long j2 = this.lastRebufferRealtimeMs;
                Trace.checkArgument(j2 >= 0 || j2 == -9223372036854775807L);
                builder.lastRebufferRealtimeMs = j2;
                LoadingInfo loadingInfo = new LoadingInfo(builder);
                Trace.checkState(mediaPeriodHolder.next == null);
                mediaPeriod.continueLoading(loadingInfo);
            }
        }
    }

    public final void maybeNotifyPlaybackInfoChanged() {
        NalUnitTargetBuffer nalUnitTargetBuffer = this.playbackInfoUpdate;
        PlaybackInfo playbackInfo = this.playbackInfo;
        boolean z = nalUnitTargetBuffer.isFilling | (((PlaybackInfo) nalUnitTargetBuffer.nalData) != playbackInfo);
        nalUnitTargetBuffer.isFilling = z;
        nalUnitTargetBuffer.nalData = playbackInfo;
        if (z) {
            ExoPlayerImpl exoPlayerImpl = this.playbackInfoUpdateListener.f$0;
            exoPlayerImpl.playbackInfoUpdateHandler.post(new DispatchQueue$$ExternalSyntheticLambda0(17, exoPlayerImpl, nalUnitTargetBuffer));
            this.playbackInfoUpdate = new NalUnitTargetBuffer(this.playbackInfo);
        }
    }

    public final void maybeThrowRendererStreamError(int i) {
        RendererHolder rendererHolder = this.renderers[i];
        try {
            MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
            mediaPeriodHolder.getClass();
            BaseRenderer rendererReadingFromPeriod = rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder);
            rendererReadingFromPeriod.getClass();
            SampleStream sampleStream = rendererReadingFromPeriod.stream;
            sampleStream.getClass();
            sampleStream.maybeThrowError();
        } catch (IOException | RuntimeException e) {
            int i2 = ((BaseRenderer) rendererHolder.primaryRenderer).trackType;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            TrackSelectorResult trackSelectorResult = this.queue.playing.trackSelectorResult;
            Log.e("ExoPlayerImplInternal", "Disabling track due to error: ".concat(Format.toLogString(trackSelectorResult.selections[i].getSelectedFormat())), e);
            TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
            trackSelectorResult2.rendererConfigurations[i] = null;
            trackSelectorResult2.selections[i] = null;
            disableRenderer(i);
            MediaPeriodHolder mediaPeriodHolder2 = this.queue.playing;
            mediaPeriodHolder2.applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false, new boolean[mediaPeriodHolder2.rendererCapabilities.length]);
        }
    }

    public final void maybeTriggerOnRendererReadyChanged(int i, boolean z) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.applicationLooperHandler.post(new Recorder$$ExternalSyntheticLambda14(this, i, z));
        }
    }

    public final void mediaSourceListUpdateRequestedInternal() {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    public final void moveMediaItemsInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        this.handler.obtainMessage(9, (MediaPeriod) sequenceableLoader).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j, long j2, Format format2, MediaFormat mediaFormat) {
        if (this.seekIsPendingWhileScrubbing) {
            this.handler.obtainMessage(37).sendToTarget();
        }
    }

    public final void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        DefaultLoadControl defaultLoadControl = this.loadControl;
        ConcurrentHashMap concurrentHashMap = defaultLoadControl.loadingStates;
        long id = Thread.currentThread().getId();
        long j = defaultLoadControl.threadId;
        Trace.checkState("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        defaultLoadControl.threadId = id;
        PlayerId playerId = this.playerId;
        DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) concurrentHashMap.get(playerId);
        if (playerLoadingState == null) {
            DefaultLoadControl.PlayerLoadingState playerLoadingState2 = new DefaultLoadControl.PlayerLoadingState();
            playerLoadingState2.referenceCount = 1;
            concurrentHashMap.put(playerId, playerLoadingState2);
        } else {
            playerLoadingState.referenceCount++;
        }
        DefaultLoadControl.PlayerLoadingState playerLoadingState3 = (DefaultLoadControl.PlayerLoadingState) concurrentHashMap.get(playerId);
        playerLoadingState3.getClass();
        Integer num = (Integer) defaultLoadControl.playerTargetBufferBytesOverwrites.get(playerId.name);
        int intValue = (num == null || num.intValue() == -1) ? defaultLoadControl.targetBufferBytesOverwrite : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        playerLoadingState3.targetBufferBytes = intValue;
        playerLoadingState3.isLoading = false;
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        PlaybackInfo playbackInfo = this.playbackInfo;
        boolean z = playbackInfo.playWhenReady;
        updatePlayWhenReadyWithAudioFocus(this.audioFocusManager.updateAudioFocus(playbackInfo.playbackState, z), playbackInfo.playbackSuppressionReason, z, playbackInfo.playWhenReadyChangeReason);
        DefaultBandwidthMeter defaultBandwidthMeter = this.bandwidthMeter;
        defaultBandwidthMeter.getClass();
        MediaSourceList mediaSourceList = this.mediaSourceList;
        ArrayList arrayList = (ArrayList) mediaSourceList.mediaSourceHolders;
        Trace.checkState(!mediaSourceList.isPrepared);
        mediaSourceList.mediaTransferListener = defaultBandwidthMeter;
        for (int i = 0; i < arrayList.size(); i++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) arrayList.get(i);
            mediaSourceList.prepareChildSource(mediaSourceHolder);
            ((HashSet) mediaSourceList.enabledMediaSourceHolders).add(mediaSourceHolder);
        }
        mediaSourceList.isPrepared = true;
        this.handler.sendEmptyMessage(2);
    }

    public final void releaseInternal(ConditionVariable conditionVariable) {
        zzv zzvVar = this.playbackLooperProvider;
        SystemHandlerWrapper systemHandlerWrapper = this.handler;
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            DefaultLoadControl defaultLoadControl = this.loadControl;
            PlayerId playerId = this.playerId;
            ConcurrentHashMap concurrentHashMap = defaultLoadControl.loadingStates;
            DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) concurrentHashMap.get(playerId);
            if (playerLoadingState != null) {
                int i = playerLoadingState.referenceCount - 1;
                playerLoadingState.referenceCount = i;
                if (i == 0) {
                    concurrentHashMap.remove(playerId);
                    defaultLoadControl.updateAllocator();
                }
            }
            if (defaultLoadControl.loadingStates.isEmpty()) {
                defaultLoadControl.threadId = -1L;
            }
            AudioFocusManager audioFocusManager = this.audioFocusManager;
            audioFocusManager.playerControl = null;
            audioFocusManager.abandonAudioFocusIfHeld();
            audioFocusManager.setAudioFocusState(0);
            this.trackSelector.release();
            setState(1);
        } finally {
            systemHandlerWrapper.handler.removeCallbacksAndMessages(null);
            zzvVar.releaseLooper();
            conditionVariable.open();
        }
    }

    public final void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            BaseRenderer baseRenderer = this.rendererCapabilities[i];
            synchronized (baseRenderer.lock) {
                baseRenderer.rendererCapabilitiesListener = null;
            }
            RendererHolder rendererHolder = this.renderers[i];
            BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.primaryRenderer;
            Trace.checkState(baseRenderer2.state == 0);
            baseRenderer2.onRelease();
            rendererHolder.primaryRequiresReset = false;
            BaseRenderer baseRenderer3 = (BaseRenderer) rendererHolder.secondaryRenderer;
            if (baseRenderer3 != null) {
                Trace.checkState(baseRenderer3.state == 0);
                baseRenderer3.onRelease();
                rendererHolder.secondaryRequiresReset = false;
            }
        }
    }

    public final void removeMediaItemsInternal(int i, int i2, ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        mediaSourceList.getClass();
        Trace.checkArgument(i >= 0 && i <= i2 && i2 <= ((ArrayList) mediaSourceList.mediaSourceHolders).size());
        mediaSourceList.shuffleOrder = shuffleOrder$DefaultShuffleOrder;
        mediaSourceList.removeMediaSourcesInternal(i, i2);
        handleMediaSourceListInfoRefreshed(mediaSourceList.createTimeline(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reselectTracksInternal() {
        int i;
        int i2;
        float f = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.playing;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.reading;
        TrackSelectorResult trackSelectorResult = null;
        MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodHolder;
        boolean z = true;
        while (mediaPeriodHolder3 != null && mediaPeriodHolder3.prepared) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            TrackSelectorResult selectTracks = mediaPeriodHolder3.selectTracks(f, playbackInfo.timeline, playbackInfo.playWhenReady);
            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder3 == this.queue.playing ? selectTracks : trackSelectorResult;
            TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder3.trackSelectorResult;
            ExoTrackSelection[] exoTrackSelectionArr = selectTracks.selections;
            if (trackSelectorResult3 != null && trackSelectorResult3.selections.length == exoTrackSelectionArr.length) {
                for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
                    if (selectTracks.isEquivalent(trackSelectorResult3, i3)) {
                    }
                }
                if (mediaPeriodHolder3 == mediaPeriodHolder2) {
                    z = false;
                }
                mediaPeriodHolder3 = mediaPeriodHolder3.next;
                trackSelectorResult = trackSelectorResult2;
            }
            MediaPeriodQueue mediaPeriodQueue2 = this.queue;
            if (z) {
                MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodQueue2.playing;
                boolean z2 = (mediaPeriodQueue2.removeAfter(mediaPeriodHolder4) & 1) != 0;
                boolean[] zArr = new boolean[this.renderers.length];
                trackSelectorResult2.getClass();
                long applyTrackSelection = mediaPeriodHolder4.applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, z2, zArr);
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                boolean z3 = (playbackInfo2.playbackState == 4 || applyTrackSelection == playbackInfo2.positionUs) ? false : true;
                PlaybackInfo playbackInfo3 = this.playbackInfo;
                i = 4;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, applyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z3, 5);
                if (z3) {
                    resetRendererPosition(applyTrackSelection, true);
                }
                disableAndResetPrewarmingRenderers();
                boolean[] zArr2 = new boolean[this.renderers.length];
                int i4 = 0;
                while (true) {
                    RendererHolder[] rendererHolderArr = this.renderers;
                    if (i4 >= rendererHolderArr.length) {
                        break;
                    }
                    int enabledRendererCount = rendererHolderArr[i4].getEnabledRendererCount();
                    zArr2[i4] = this.renderers[i4].isRendererEnabled();
                    RendererHolder rendererHolder = this.renderers[i4];
                    SampleStream sampleStream = mediaPeriodHolder4.sampleStreams[i4];
                    zzd zzdVar = this.mediaClock;
                    long j = this.rendererPositionUs;
                    boolean z4 = zArr[i4];
                    BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
                    if (RendererHolder.isRendererEnabled(baseRenderer)) {
                        if (sampleStream != baseRenderer.stream) {
                            rendererHolder.disableRenderer(baseRenderer, zzdVar);
                        } else if (z4) {
                            baseRenderer.resetPosition(j, false, true);
                        }
                    }
                    BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
                    if (baseRenderer2 != null && RendererHolder.isRendererEnabled(baseRenderer2)) {
                        if (sampleStream != baseRenderer2.stream) {
                            rendererHolder.disableRenderer(baseRenderer2, zzdVar);
                        } else if (z4) {
                            baseRenderer2.resetPosition(j, false, true);
                        }
                    }
                    if (enabledRendererCount - this.renderers[i4].getEnabledRendererCount() > 0) {
                        maybeTriggerOnRendererReadyChanged(i4, false);
                    }
                    this.enabledRendererCount -= enabledRendererCount - this.renderers[i4].getEnabledRendererCount();
                    i4++;
                }
                enableRenderers(zArr2, this.rendererPositionUs);
                mediaPeriodHolder4.allRenderersInCorrectState = true;
            } else {
                i = 4;
                mediaPeriodQueue2.removeAfter(mediaPeriodHolder3);
                if (mediaPeriodHolder3.prepared) {
                    long max = Math.max(mediaPeriodHolder3.info.startPositionUs, this.rendererPositionUs - mediaPeriodHolder3.rendererPositionOffsetUs);
                    if (this.hasSecondaryRenderers && areRenderersPrewarming() && this.queue.prewarming == mediaPeriodHolder3) {
                        disableAndResetPrewarmingRenderers();
                    }
                    i2 = 4;
                    mediaPeriodHolder3.applyTrackSelection(selectTracks, max, false, new boolean[mediaPeriodHolder3.rendererCapabilities.length]);
                    handleLoadingMediaPeriodChanged(true);
                    if (this.playbackInfo.playbackState == i2) {
                        maybeContinueLoading();
                        updatePlaybackPositions();
                        this.handler.sendEmptyMessage(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            handleLoadingMediaPeriodChanged(true);
            if (this.playbackInfo.playbackState == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resetInternal(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        Timeline timeline;
        Timeline timeline2;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        List list;
        this.handler.removeMessages(2);
        this.seekIsPendingWhileScrubbing = false;
        if (this.queuedSeekWhileScrubbing != null) {
            this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.queuedSeekWhileScrubbing = null;
        }
        this.pendingRecoverableRendererError = null;
        updateRebufferingState(false, true);
        zzd zzdVar = this.mediaClock;
        zzdVar.zzd = false;
        StandaloneMediaClock standaloneMediaClock = (StandaloneMediaClock) zzdVar.zza;
        if (standaloneMediaClock.started) {
            standaloneMediaClock.resetPosition(standaloneMediaClock.getPositionUs());
            standaloneMediaClock.started = false;
        }
        this.rendererPositionUs = 1000000000000L;
        for (int i = 0; i < this.renderers.length; i++) {
            try {
                disableRenderer(i);
            } catch (ExoPlaybackException | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
        if (z) {
            for (RendererHolder rendererHolder : this.renderers) {
                try {
                    rendererHolder.reset();
                } catch (RuntimeException e2) {
                    Log.e("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.enabledRendererCount = 0;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = playbackInfo.periodId;
        long j4 = playbackInfo.positionUs;
        if (!this.playbackInfo.periodId.isAd()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            Timeline.Period period = this.period;
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = playbackInfo2.periodId;
            Timeline timeline3 = playbackInfo2.timeline;
            if (!timeline3.isEmpty() && !timeline3.getPeriodByUid(mediaSource$MediaPeriodId3.periodUid, period).isPlaceholder) {
                j = this.playbackInfo.positionUs;
                if (z2) {
                    j2 = j4;
                    j3 = j;
                    z5 = false;
                } else {
                    this.pendingInitialSeekPosition = null;
                    Pair placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
                    mediaSource$MediaPeriodId2 = (MediaSource$MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
                    long longValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                    z5 = mediaSource$MediaPeriodId2.equals(this.playbackInfo.periodId) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.queue.clear();
                this.shouldContinueLoading = false;
                timeline = this.playbackInfo.timeline;
                if (z3 || !(timeline instanceof PlaylistTimeline)) {
                    timeline2 = timeline;
                } else {
                    PlaylistTimeline playlistTimeline = (PlaylistTimeline) timeline;
                    ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder = (ShuffleOrder$DefaultShuffleOrder) this.mediaSourceList.shuffleOrder;
                    Timeline[] timelineArr = playlistTimeline.timelines;
                    Timeline[] timelineArr2 = new Timeline[timelineArr.length];
                    for (int i2 = 0; i2 < timelineArr.length; i2++) {
                        final Timeline timeline4 = timelineArr[i2];
                        timelineArr2[i2] = new ForwardingTimeline(timeline4) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1
                            public final Timeline.Window window = new Timeline.Window();

                            public AnonymousClass1(final Timeline timeline42) {
                                super(timeline42);
                                this.window = new Timeline.Window();
                            }

                            @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                            public final Timeline.Period getPeriod(int i3, Timeline.Period period2, boolean z6) {
                                Timeline timeline5 = this.timeline;
                                Timeline.Period period3 = timeline5.getPeriod(i3, period2, z6);
                                if (timeline5.getWindow(period3.windowIndex, this.window, 0L).isLive()) {
                                    period3.set(period2.id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, AdPlaybackState.NONE, true);
                                    return period3;
                                }
                                period3.isPlaceholder = true;
                                return period3;
                            }
                        };
                    }
                    timeline2 = new PlaylistTimeline(timelineArr2, playlistTimeline.uids, shuffleOrder$DefaultShuffleOrder);
                    if (mediaSource$MediaPeriodId2.adGroupIndex != -1) {
                        timeline2.getPeriodByUid(mediaSource$MediaPeriodId2.periodUid, this.period);
                        int i3 = this.period.windowIndex;
                        Timeline.Window window = this.window;
                        timeline2.getWindow(i3, window, 0L);
                        if (window.isLive()) {
                            mediaSource$MediaPeriodId = new MediaSource$MediaPeriodId(mediaSource$MediaPeriodId2.periodUid, mediaSource$MediaPeriodId2.windowSequenceNumber);
                            PlaybackInfo playbackInfo3 = this.playbackInfo;
                            int i4 = playbackInfo3.playbackState;
                            ExoPlaybackException exoPlaybackException = z4 ? null : playbackInfo3.playbackError;
                            TrackGroupArray trackGroupArray = z5 ? TrackGroupArray.EMPTY : playbackInfo3.trackGroups;
                            TrackSelectorResult trackSelectorResult = z5 ? this.emptyTrackSelectorResult : playbackInfo3.trackSelectorResult;
                            if (z5) {
                                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                                list = RegularImmutableList.EMPTY;
                            } else {
                                list = playbackInfo3.staticMetadata;
                            }
                            this.playbackInfo = new PlaybackInfo(timeline2, mediaSource$MediaPeriodId, j3, j2, i4, exoPlaybackException, false, trackGroupArray, trackSelectorResult, list, mediaSource$MediaPeriodId, playbackInfo3.playWhenReady, playbackInfo3.playWhenReadyChangeReason, playbackInfo3.playbackSuppressionReason, playbackInfo3.playbackParameters, j2, 0L, j2, 0L, false);
                            if (z3) {
                                MediaPeriodQueue mediaPeriodQueue = this.queue;
                                if (!mediaPeriodQueue.preloadPriorityList.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < mediaPeriodQueue.preloadPriorityList.size(); i5++) {
                                        ((MediaPeriodHolder) mediaPeriodQueue.preloadPriorityList.get(i5)).release();
                                    }
                                    mediaPeriodQueue.preloadPriorityList = arrayList;
                                    mediaPeriodQueue.preloading = null;
                                    mediaPeriodQueue.maybeUpdatePreloadMediaPeriodHolder();
                                }
                                MediaSourceList mediaSourceList = this.mediaSourceList;
                                HashMap hashMap = (HashMap) mediaSourceList.childSources;
                                for (MediaSourceList.MediaSourceAndListener mediaSourceAndListener : hashMap.values()) {
                                    try {
                                        mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
                                    } catch (RuntimeException e3) {
                                        Log.e("MediaSourceList", "Failed to release child source.", e3);
                                    }
                                    BaseMediaSource baseMediaSource = mediaSourceAndListener.mediaSource;
                                    MediaSourceList.ForwardingEventListener forwardingEventListener = mediaSourceAndListener.eventListener;
                                    baseMediaSource.removeEventListener(forwardingEventListener);
                                    mediaSourceAndListener.mediaSource.removeDrmEventListener(forwardingEventListener);
                                }
                                hashMap.clear();
                                ((HashSet) mediaSourceList.enabledMediaSourceHolders).clear();
                                mediaSourceList.isPrepared = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                mediaSource$MediaPeriodId = mediaSource$MediaPeriodId2;
                PlaybackInfo playbackInfo32 = this.playbackInfo;
                int i42 = playbackInfo32.playbackState;
                if (z4) {
                }
                TrackGroupArray trackGroupArray2 = z5 ? TrackGroupArray.EMPTY : playbackInfo32.trackGroups;
                TrackSelectorResult trackSelectorResult2 = z5 ? this.emptyTrackSelectorResult : playbackInfo32.trackSelectorResult;
                if (z5) {
                }
                this.playbackInfo = new PlaybackInfo(timeline2, mediaSource$MediaPeriodId, j3, j2, i42, exoPlaybackException, false, trackGroupArray2, trackSelectorResult2, list, mediaSource$MediaPeriodId, playbackInfo32.playWhenReady, playbackInfo32.playWhenReadyChangeReason, playbackInfo32.playbackSuppressionReason, playbackInfo32.playbackParameters, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.playbackInfo.requestedContentPositionUs;
        if (z2) {
        }
        this.queue.clear();
        this.shouldContinueLoading = false;
        timeline = this.playbackInfo.timeline;
        if (z3) {
        }
        timeline2 = timeline;
        mediaSource$MediaPeriodId = mediaSource$MediaPeriodId2;
        PlaybackInfo playbackInfo322 = this.playbackInfo;
        int i422 = playbackInfo322.playbackState;
        if (z4) {
        }
        TrackGroupArray trackGroupArray22 = z5 ? TrackGroupArray.EMPTY : playbackInfo322.trackGroups;
        TrackSelectorResult trackSelectorResult22 = z5 ? this.emptyTrackSelectorResult : playbackInfo322.trackSelectorResult;
        if (z5) {
        }
        this.playbackInfo = new PlaybackInfo(timeline2, mediaSource$MediaPeriodId, j3, j2, i422, exoPlaybackException, false, trackGroupArray22, trackSelectorResult22, list, mediaSource$MediaPeriodId, playbackInfo322.playWhenReady, playbackInfo322.playWhenReadyChangeReason, playbackInfo322.playbackSuppressionReason, playbackInfo322.playbackParameters, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        this.pendingPauseAtEndOfPeriod = mediaPeriodHolder != null && mediaPeriodHolder.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    public final void resetRendererPosition(long j, boolean z) {
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        long j2 = j + (mediaPeriodHolder == null ? 1000000000000L : mediaPeriodHolder.rendererPositionOffsetUs);
        this.rendererPositionUs = j2;
        ((StandaloneMediaClock) this.mediaClock.zza).resetPosition(j2);
        for (RendererHolder rendererHolder : this.renderers) {
            long j3 = this.rendererPositionUs;
            BaseRenderer rendererReadingFromPeriod = rendererHolder.getRendererReadingFromPeriod(mediaPeriodHolder);
            if (rendererReadingFromPeriod != null) {
                rendererReadingFromPeriod.resetPosition(j3, false, z);
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = r0.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.next) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder2.trackSelectorResult.selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    public final void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.pendingMessages;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(arrayList.get(size));
            throw null;
        }
    }

    public final void scheduleNextWork(long j) {
        boolean z;
        if (this.scrubbingModeEnabled) {
            this.scrubbingModeParameters.getClass();
            z = true;
        } else {
            z = false;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        long j2 = BUFFERING_MAXIMUM_INTERVAL_MS;
        if (z) {
            r4 = playbackInfo.playbackState != 3 ? j2 : 1000L;
            for (RendererHolder rendererHolder : this.renderers) {
                long j3 = this.rendererPositionUs;
                long j4 = this.rendererPositionElapsedRealtimeUs;
                BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.secondaryRenderer;
                BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.primaryRenderer;
                long durationToProgressUs = RendererHolder.isRendererEnabled(baseRenderer2) ? baseRenderer2.getDurationToProgressUs(j3, j4) : Long.MAX_VALUE;
                if (baseRenderer != null && baseRenderer.state != 0) {
                    durationToProgressUs = Math.min(durationToProgressUs, baseRenderer.getDurationToProgressUs(j3, j4));
                }
                r4 = Math.min(r4, Util.usToMs(durationToProgressUs));
            }
            if (this.playbackInfo.isPlaying()) {
                MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
                if ((mediaPeriodHolder != null ? mediaPeriodHolder.next : null) != null) {
                    if ((Util.msToUs(r4) * this.playbackInfo.playbackParameters.speed) + this.rendererPositionUs >= r1.getStartPositionRendererTime()) {
                        r4 = Math.min(r4, j2);
                    }
                }
            }
        } else if (playbackInfo.playbackState != 3 || shouldPlayWhenReady()) {
            r4 = j2;
        }
        this.handler.handler.sendEmptyMessageAtTime(2, j + r4);
    }

    public final void seekToCurrentPosition(boolean z) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = this.queue.playing.info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaSource$MediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId, seekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(21:(8:29|(1:95)(3:35|(1:39)|40)|41|(1:50)|48|49|19|20)(1:96)|55|56|(1:58)(1:88)|59|60|61|(1:63)(1:86)|64|65|66|67|68|69|70|71|72|73|18|19|20)|51|52|(1:54)(1:92)) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0190, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void seekToInternal(SeekPosition seekPosition) {
        long longValue;
        long j;
        MediaSource$MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        long j2;
        boolean z;
        boolean z2;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long seekToPeriodPosition;
        PlaybackInfo playbackInfo;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2;
        Timeline timeline;
        long j6;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId3;
        long j7;
        long j8;
        PlaybackInfo playbackInfo2;
        int i;
        int i2;
        long j9;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        if (exoPlayerImplInternal.seekIsPendingWhileScrubbing) {
            if (exoPlayerImplInternal.queuedSeekWhileScrubbing != null) {
                exoPlayerImplInternal.droppedSeeksWhileScrubbing++;
                exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            exoPlayerImplInternal.queuedSeekWhileScrubbing = seekPosition;
            return;
        }
        exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair resolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.timeline, seekPosition, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        if (resolveSeekPositionUs == null) {
            Pair placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.timeline);
            resolveMediaPeriodIdForAdsAfterPeriodPositionChange = (MediaSource$MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            longValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            z = !exoPlayerImplInternal.playbackInfo.timeline.isEmpty();
            j2 = 0;
            j = -9223372036854775807L;
        } else {
            Object obj = resolveSeekPositionUs.first;
            longValue = ((Long) resolveSeekPositionUs.second).longValue();
            j = seekPosition.windowPositionUs == -9223372036854775807L ? -9223372036854775807L : longValue;
            resolveMediaPeriodIdForAdsAfterPeriodPositionChange = exoPlayerImplInternal.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(exoPlayerImplInternal.playbackInfo.timeline, obj, longValue);
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                exoPlayerImplInternal.playbackInfo.timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, exoPlayerImplInternal.period);
                if (exoPlayerImplInternal.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup) {
                    exoPlayerImplInternal.period.adPlaybackState.getClass();
                }
                exoPlayerImplInternal.period.adPlaybackState.getAdGroup(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex).getClass();
                j = Math.max(j, 0L);
                longValue = 0;
                j2 = 0;
            } else {
                j2 = 0;
                if (seekPosition.windowPositionUs != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                    exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
                } else {
                    PlaybackInfo playbackInfo3 = exoPlayerImplInternal.playbackInfo;
                    if (resolveSeekPositionUs == null) {
                        if (playbackInfo3.playbackState != 1) {
                            exoPlayerImplInternal.setState(4);
                        }
                        exoPlayerImplInternal.resetInternal(false, true, false, true);
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(playbackInfo3.periodId)) {
                                            MediaPeriodHolder mediaPeriodHolder = exoPlayerImplInternal.queue.playing;
                                            if (mediaPeriodHolder == null || !mediaPeriodHolder.prepared || longValue == j2) {
                                                j5 = longValue;
                                            } else {
                                                MediaPeriod mediaPeriod = mediaPeriodHolder.mediaPeriod;
                                                long j10 = exoPlayerImplInternal.window.durationUs;
                                                if (exoPlayerImplInternal.scrubbingModeEnabled && j10 != -9223372036854775807L) {
                                                    exoPlayerImplInternal.scrubbingModeParameters.getClass();
                                                }
                                                j5 = mediaPeriod.getAdjustedSeekPositionUs(longValue, exoPlayerImplInternal.seekParameters);
                                            }
                                            if (Util.usToMs(j5) != Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs) || ((i = (playbackInfo2 = exoPlayerImplInternal.playbackInfo).playbackState) != 2 && i != 3)) {
                                                z2 = z;
                                                mediaSource$MediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                            }
                                            j8 = playbackInfo2.positionUs;
                                            i2 = 2;
                                            j9 = j8;
                                            z2 = z;
                                            mediaSource$MediaPeriodId3 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                            j7 = j;
                                            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaSource$MediaPeriodId3, j8, j7, j9, z2, i2);
                                        }
                                        z2 = z;
                                        mediaSource$MediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                        j5 = longValue;
                                        exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaSource$MediaPeriodId2, timeline, playbackInfo.periodId, j6, true);
                                        mediaSource$MediaPeriodId3 = mediaSource$MediaPeriodId2;
                                        j7 = j6;
                                        j8 = seekToPeriodPosition;
                                        i2 = 2;
                                        j9 = j8;
                                        exoPlayerImplInternal = this;
                                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaSource$MediaPeriodId3, j8, j7, j9, z2, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        mediaSource$MediaPeriodId = mediaSource$MediaPeriodId2;
                                        j3 = j6;
                                        j4 = seekToPeriodPosition;
                                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaSource$MediaPeriodId, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                    timeline = playbackInfo.timeline;
                                    j6 = j;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mediaSource$MediaPeriodId = mediaSource$MediaPeriodId2;
                                    j3 = j;
                                    j4 = seekToPeriodPosition;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaSource$MediaPeriodId, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                                playbackInfo = exoPlayerImplInternal.playbackInfo;
                                mediaSource$MediaPeriodId2 = mediaSource$MediaPeriodId;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            MediaPeriodQueue mediaPeriodQueue = exoPlayerImplInternal.queue;
                            seekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaSource$MediaPeriodId, j5, mediaPeriodQueue.playing != mediaPeriodQueue.reading, z3);
                            z2 |= longValue != seekToPeriodPosition;
                        } catch (Throwable th4) {
                            th = th4;
                            j3 = j;
                            j4 = longValue;
                            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaSource$MediaPeriodId, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        z3 = exoPlayerImplInternal.playbackInfo.playbackState == 4;
                    }
                }
                z2 = z;
                mediaSource$MediaPeriodId3 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                j8 = longValue;
                j7 = j;
                i2 = 2;
                j9 = j8;
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaSource$MediaPeriodId3, j8, j7, j9, z2, i2);
            } catch (Throwable th5) {
                th = th5;
                z2 = z;
                mediaSource$MediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                j4 = longValue;
                j3 = j;
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
            mediaSource$MediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        }
    }

    public final long seekToPeriodPosition(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, boolean z, boolean z2) {
        MediaPeriodQueue mediaPeriodQueue;
        int i;
        stopRenderers();
        boolean z3 = true;
        updateRebufferingState(false, true);
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        while (mediaPeriodHolder2 != null && !mediaSource$MediaPeriodId.equals(mediaPeriodHolder2.info.id)) {
            mediaPeriodHolder2 = mediaPeriodHolder2.next;
        }
        if (z || mediaPeriodHolder != mediaPeriodHolder2 || (mediaPeriodHolder2 != null && mediaPeriodHolder2.rendererPositionOffsetUs + j < 0)) {
            for (int i2 = 0; i2 < this.renderers.length; i2++) {
                disableRenderer(i2);
            }
            this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
            if (mediaPeriodHolder2 != null) {
                while (true) {
                    mediaPeriodQueue = this.queue;
                    if (mediaPeriodQueue.playing == mediaPeriodHolder2) {
                        break;
                    }
                    mediaPeriodQueue.advancePlayingPeriod();
                }
                mediaPeriodQueue.removeAfter(mediaPeriodHolder2);
                mediaPeriodHolder2.rendererPositionOffsetUs = 1000000000000L;
                enableRenderers(new boolean[this.renderers.length], this.queue.reading.getStartPositionRendererTime());
                mediaPeriodHolder2.allRenderersInCorrectState = true;
            }
        }
        disableAndResetPrewarmingRenderers();
        if (this.scrubbingModeEnabled) {
            for (RendererHolder rendererHolder : this.renderers) {
                if (rendererHolder.isRendererEnabled() && ((i = ((BaseRenderer) rendererHolder.primaryRenderer).trackType) == 2 || i == 4)) {
                    this.seekIsPendingWhileScrubbing = true;
                    break;
                }
            }
        }
        MediaPeriodQueue mediaPeriodQueue2 = this.queue;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodQueue2.removeAfter(mediaPeriodHolder2);
            if (!mediaPeriodHolder2.prepared) {
                mediaPeriodHolder2.info = mediaPeriodHolder2.info.copyWithStartPositionUs(j, -9223372036854775807L);
            } else if (mediaPeriodHolder2.hasEnabledTracks) {
                if (this.scrubbingModeEnabled) {
                    this.scrubbingModeParameters.getClass();
                    if (!this.playbackInfo.timeline.isEmpty() && mediaPeriodHolder2.info.id.equals(this.playbackInfo.periodId)) {
                        long j2 = mediaPeriodHolder2.rendererPositionOffsetUs + j;
                        boolean z4 = true;
                        for (RendererHolder rendererHolder2 : this.renderers) {
                            if (rendererHolder2.isRendererEnabled()) {
                                BaseRenderer rendererReadingFromPeriod = rendererHolder2.getRendererReadingFromPeriod(mediaPeriodHolder2);
                                z4 &= rendererReadingFromPeriod != null && rendererReadingFromPeriod.supportsResetPositionWithoutKeyFrameReset(j2);
                            }
                        }
                        if (z4) {
                            MediaPeriod mediaPeriod = mediaPeriodHolder2.mediaPeriod;
                            long j3 = this.playbackInfo.positionUs;
                            SeekParameters seekParameters = SeekParameters.PREVIOUS_SYNC;
                            if (mediaPeriod.getAdjustedSeekPositionUs(j3, seekParameters) == mediaPeriodHolder2.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = mediaPeriodHolder2.mediaPeriod.seekToUs(j);
                mediaPeriodHolder2.mediaPeriod.discardBuffer(j - this.backBufferDurationUs);
            }
            resetRendererPosition(j, z3);
            maybeContinueLoading();
        } else {
            mediaPeriodQueue2.clear();
            resetRendererPosition(j, true);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    public final void sendMessageInternal(PlayerMessage playerMessage) {
        playerMessage.getClass();
        SystemHandlerWrapper systemHandlerWrapper = this.handler;
        if (playerMessage.looper != this.playbackLooper) {
            systemHandlerWrapper.obtainMessage(15, playerMessage).sendToTarget();
            return;
        }
        synchronized (playerMessage) {
        }
        try {
            playerMessage.target.handleMessage(playerMessage.f877type, playerMessage.payload);
            playerMessage.markAsProcessed(true);
            int i = this.playbackInfo.playbackState;
            if (i == 3 || i == 2) {
                systemHandlerWrapper.sendEmptyMessage(2);
            }
        } catch (Throwable th) {
            playerMessage.markAsProcessed(true);
            throw th;
        }
    }

    public final void sendMessageToTargetThread(PlayerMessage playerMessage) {
        Looper looper = playerMessage.looper;
        if (looper.getThread().isAlive()) {
            this.clock.createHandler(looper, null).post(new AFd1lSDK$$ExternalSyntheticLambda0(this, playerMessage));
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    public final void setAudioAttributesInternal(AudioAttributes audioAttributes, boolean z) {
        DefaultTrackSelector defaultTrackSelector = this.trackSelector;
        if (!defaultTrackSelector.audioAttributes.equals(audioAttributes)) {
            defaultTrackSelector.audioAttributes = audioAttributes;
            defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
        }
        if (!z) {
            audioAttributes = null;
        }
        AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (!Objects.equals(audioFocusManager.audioAttributes, audioAttributes)) {
            audioFocusManager.audioAttributes = audioAttributes;
            int i = audioAttributes == null ? 0 : 1;
            audioFocusManager.focusGainToRequest = i;
            Trace.checkArgument("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        boolean z2 = playbackInfo.playWhenReady;
        updatePlayWhenReadyWithAudioFocus(audioFocusManager.updateAudioFocus(playbackInfo.playbackState, z2), playbackInfo.playbackSuppressionReason, z2, playbackInfo.playWhenReadyChangeReason);
    }

    public final void setForegroundModeInternal(boolean z, ConditionVariable conditionVariable) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (RendererHolder rendererHolder : this.renderers) {
                    rendererHolder.reset();
                }
            }
        }
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    public final void setImageMetadataListenerInternal(ExoPlayerImplInternal$$ExternalSyntheticLambda4 exoPlayerImplInternal$$ExternalSyntheticLambda4) {
        for (RendererHolder rendererHolder : this.renderers) {
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
            if (baseRenderer.trackType == 4) {
                baseRenderer.handleMessage(23, exoPlayerImplInternal$$ExternalSyntheticLambda4);
                BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
                if (baseRenderer2 != null) {
                    baseRenderer2.handleMessage(23, exoPlayerImplInternal$$ExternalSyntheticLambda4);
                }
            }
        }
    }

    public final void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        int i = mediaSourceListUpdateMessage.windowIndex;
        ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder = mediaSourceListUpdateMessage.shuffleOrder;
        ArrayList arrayList = mediaSourceListUpdateMessage.mediaSourceHolders;
        if (i != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(arrayList, shuffleOrder$DefaultShuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        MediaSourceList mediaSourceList = this.mediaSourceList;
        ArrayList arrayList2 = (ArrayList) mediaSourceList.mediaSourceHolders;
        mediaSourceList.removeMediaSourcesInternal(0, arrayList2.size());
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(arrayList2.size(), arrayList, shuffleOrder$DefaultShuffleOrder), false);
    }

    public final void setPauseAtEndOfWindowInternal(boolean z) {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (this.pendingPauseAtEndOfPeriod) {
            MediaPeriodQueue mediaPeriodQueue = this.queue;
            if (mediaPeriodQueue.reading != mediaPeriodQueue.playing) {
                seekToCurrentPosition(true);
                handleLoadingMediaPeriodChanged(false);
            }
        }
    }

    public final void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        zzd zzdVar = this.mediaClock;
        zzdVar.setPlaybackParameters(playbackParameters);
        PlaybackParameters playbackParameters2 = zzdVar.getPlaybackParameters();
        handlePlaybackParameters(playbackParameters2, playbackParameters2.speed, true, true);
    }

    public final void setPreloadConfigurationInternal(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        Timeline timeline = this.playbackInfo.timeline;
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        mediaPeriodQueue.getClass();
        preloadConfiguration.getClass();
        if (mediaPeriodQueue.preloadPriorityList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mediaPeriodQueue.preloadPriorityList.size(); i++) {
            ((MediaPeriodHolder) mediaPeriodQueue.preloadPriorityList.get(i)).release();
        }
        mediaPeriodQueue.preloadPriorityList = arrayList;
        mediaPeriodQueue.preloading = null;
        mediaPeriodQueue.maybeUpdatePreloadMediaPeriodHolder();
    }

    public final void setRepeatModeInternal(int i) {
        this.repeatMode = i;
        Timeline timeline = this.playbackInfo.timeline;
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        mediaPeriodQueue.repeatMode = i;
        int updateForPlaybackModeChange = mediaPeriodQueue.updateForPlaybackModeChange(timeline);
        if ((updateForPlaybackModeChange & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateForPlaybackModeChange & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    public final void setScrubbingModeEnabledInternal(boolean z) {
        if (!z) {
            SeekPosition seekPosition = this.queuedSeekWhileScrubbing;
            SystemHandlerWrapper systemHandlerWrapper = this.handler;
            if (seekPosition != null && this.seekIsPendingWhileScrubbing && !systemHandlerWrapper.handler.hasMessages(37)) {
                this.droppedSeeksWhileScrubbing++;
            }
            int i = this.droppedSeeksWhileScrubbing;
            if (i > 0) {
                this.applicationLooperHandler.post(new AFd1lSDK$$ExternalSyntheticLambda0(this, i));
            }
            this.droppedSeeksWhileScrubbing = 0;
            this.seekIsPendingWhileScrubbing = false;
            systemHandlerWrapper.removeMessages(37);
            SeekPosition seekPosition2 = this.queuedSeekWhileScrubbing;
            if (seekPosition2 != null) {
                seekToInternal(seekPosition2);
                this.queuedSeekWhileScrubbing = null;
                this.seekIsPendingWhileScrubbing = false;
            }
        }
        this.scrubbingModeEnabled = z;
        applyScrubbingModeParameters();
    }

    public final void setScrubbingModeParametersInternal(ScrubbingModeParameters scrubbingModeParameters) {
        this.scrubbingModeParameters = scrubbingModeParameters;
        applyScrubbingModeParameters();
    }

    public final void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    public final void setShuffleModeEnabledInternal(boolean z) {
        this.shuffleModeEnabled = z;
        Timeline timeline = this.playbackInfo.timeline;
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        mediaPeriodQueue.shuffleModeEnabled = z;
        int updateForPlaybackModeChange = mediaPeriodQueue.updateForPlaybackModeChange(timeline);
        if ((updateForPlaybackModeChange & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateForPlaybackModeChange & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    public final void setShuffleOrderInternal(ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        int size = ((ArrayList) mediaSourceList.mediaSourceHolders).size();
        if (shuffleOrder$DefaultShuffleOrder.shuffled.length != size) {
            shuffleOrder$DefaultShuffleOrder = new ShuffleOrder$DefaultShuffleOrder(new Random(shuffleOrder$DefaultShuffleOrder.random.nextLong())).cloneAndInsert(size);
        }
        mediaSourceList.shuffleOrder = shuffleOrder$DefaultShuffleOrder;
        handleMediaSourceListInfoRefreshed(mediaSourceList.createTimeline(), false);
    }

    public final void setState(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            }
            if (i != 3 && playbackInfo.sleepingForOffload) {
                this.playbackInfo = playbackInfo.copyWithSleepingForOffload(false);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackState(i);
        }
    }

    public final void setVideoFrameMetadataListenerInternal(VideoFrameMetadataListener videoFrameMetadataListener) {
        for (RendererHolder rendererHolder : this.renderers) {
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
            if (baseRenderer.trackType == 2) {
                baseRenderer.handleMessage(7, videoFrameMetadataListener);
                BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
                if (baseRenderer2 != null) {
                    baseRenderer2.handleMessage(7, videoFrameMetadataListener);
                }
            }
        }
    }

    public final void setVideoOutputInternal(Object obj, ConditionVariable conditionVariable) {
        for (RendererHolder rendererHolder : this.renderers) {
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
            if (baseRenderer.trackType == 2) {
                int i = rendererHolder.prewarmingState;
                if (i == 4 || i == 1) {
                    BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
                    baseRenderer2.getClass();
                    baseRenderer2.handleMessage(1, obj);
                } else {
                    baseRenderer.handleMessage(1, obj);
                }
            }
        }
        int i2 = this.playbackInfo.playbackState;
        if (i2 == 3 || i2 == 2) {
            this.handler.sendEmptyMessage(2);
        }
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    public final void setVolumeInternal(float f) {
        this.volume = f;
        float f2 = f * this.audioFocusManager.volumeMultiplier;
        for (RendererHolder rendererHolder : this.renderers) {
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.primaryRenderer;
            if (baseRenderer.trackType == 1) {
                baseRenderer.handleMessage(2, Float.valueOf(f2));
                BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.secondaryRenderer;
                if (baseRenderer2 != null) {
                    baseRenderer2.handleMessage(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    public final boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        if (mediaSource$MediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        int i = timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, this.period).windowIndex;
        Timeline.Window window = this.window;
        timeline.getWindow(i, window);
        return window.isLive() && window.isDynamic && window.windowStartTimeMs != -9223372036854775807L;
    }

    public final void startRenderers() {
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        if (mediaPeriodHolder == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.trackSelectorResult;
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                return;
            }
            if (trackSelectorResult.isRendererEnabled(i)) {
                rendererHolderArr[i].start();
            }
            i++;
        }
    }

    public final void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        DefaultLoadControl defaultLoadControl = this.loadControl;
        ConcurrentHashMap concurrentHashMap = defaultLoadControl.loadingStates;
        PlayerId playerId = this.playerId;
        DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) concurrentHashMap.get(playerId);
        if (playerLoadingState != null) {
            int i = playerLoadingState.referenceCount - 1;
            playerLoadingState.referenceCount = i;
            if (i == 0) {
                concurrentHashMap.remove(playerId);
                defaultLoadControl.updateAllocator();
            }
        }
        this.audioFocusManager.updateAudioFocus(1, this.playbackInfo.playWhenReady);
        setState(1);
    }

    public final void stopRenderers() {
        zzd zzdVar = this.mediaClock;
        zzdVar.zzd = false;
        StandaloneMediaClock standaloneMediaClock = (StandaloneMediaClock) zzdVar.zza;
        if (standaloneMediaClock.started) {
            standaloneMediaClock.resetPosition(standaloneMediaClock.getPositionUs());
            standaloneMediaClock.started = false;
        }
        for (RendererHolder rendererHolder : this.renderers) {
            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder.secondaryRenderer;
            BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder.primaryRenderer;
            if (RendererHolder.isRendererEnabled(baseRenderer2)) {
                RendererHolder.ensureStopped(baseRenderer2);
            }
            if (baseRenderer != null && baseRenderer.state != 0) {
                RendererHolder.ensureStopped(baseRenderer);
            }
        }
    }

    public final void updateIsLoading() {
        MediaPeriodHolder mediaPeriodHolder = this.queue.loading;
        boolean z = this.shouldContinueLoading || (mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateLoadControlTrackSelection(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, TrackSelectorResult trackSelectorResult) {
        boolean z;
        int length;
        int i;
        MediaPeriodHolder mediaPeriodHolder = this.queue.loading;
        mediaPeriodHolder.getClass();
        getTotalBufferedDurationUs(mediaPeriodHolder.getBufferedPositionUs());
        if (shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, mediaPeriodHolder.info.id)) {
            long j = this.livePlaybackSpeedControl.currentTargetLiveOffsetUs;
        }
        Timeline timeline = this.playbackInfo.timeline;
        float f = this.mediaClock.getPlaybackParameters().speed;
        boolean z2 = this.playbackInfo.playWhenReady;
        ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult.selections;
        DefaultLoadControl defaultLoadControl = this.loadControl;
        defaultLoadControl.getClass();
        RegularImmutableMap regularImmutableMap = defaultLoadControl.playerTargetBufferBytesOverwrites;
        PlayerId playerId = this.playerId;
        Integer num = (Integer) regularImmutableMap.get(playerId.name);
        int intValue = (num == null || num.intValue() == -1) ? defaultLoadControl.targetBufferBytesOverwrite : num.intValue();
        DefaultLoadControl.PlayerLoadingState playerLoadingState = (DefaultLoadControl.PlayerLoadingState) defaultLoadControl.loadingStates.get(playerId);
        playerLoadingState.getClass();
        if (intValue == -1) {
            MediaItem.LocalConfiguration localConfiguration = timeline.getWindow(timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, defaultLoadControl.period).windowIndex, defaultLoadControl.window, 0L).mediaItem.localConfiguration;
            if (localConfiguration != null) {
                String scheme = localConfiguration.uri.getScheme();
                if (TextUtils.isEmpty(scheme) || DefaultLoadControl.LOCAL_PLAYBACK_SCHEMES.contains(scheme)) {
                    z = true;
                    length = exoTrackSelectionArr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 13107200;
                        if (i >= length) {
                            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                            if (exoTrackSelection != null) {
                                switch (exoTrackSelection.getTrackGroup().f871type) {
                                    case TiffDirectoryConstants.DIRECTORY_TYPE_EXIF /* -2 */:
                                        i3 = 0;
                                        i2 += i3;
                                        break;
                                    case -1:
                                    case 1:
                                        i2 += i3;
                                        break;
                                    case 0:
                                        i3 = 144310272;
                                        i2 += i3;
                                        break;
                                    case 2:
                                        i3 = z ? 19660800 : 131072000;
                                        i2 += i3;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i3 = 131072;
                                        i2 += i3;
                                        break;
                                    case 4:
                                        i3 = 26214400;
                                        i2 += i3;
                                        break;
                                    default:
                                        Path$$ExternalSyntheticBUOutline0.m$3();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = Util.constrainValue(i2, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = exoTrackSelectionArr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = 13107200;
                if (i >= length) {
                }
                i++;
            }
        }
        playerLoadingState.targetBufferBytes = intValue;
        defaultLoadControl.updateAllocator();
    }

    public final void updateMediaSourcesWithMediaItemsInternal(int i, int i2, List list) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        mediaSourceList.getClass();
        ArrayList arrayList = (ArrayList) mediaSourceList.mediaSourceHolders;
        Trace.checkArgument(i >= 0 && i <= i2 && i2 <= arrayList.size());
        Trace.checkArgument(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((MediaSourceList.MediaSourceHolder) arrayList.get(i3)).mediaSource.updateMediaItem((MediaItem) list.get(i3 - i));
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.createTimeline(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a5, code lost:
    
        if (((long) ((r3.getStartPositionRendererTime() - r23.rendererPositionUs) / r23.mediaClock.getPlaybackParameters().speed)) > 10000000) goto L249;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updatePeriods() {
        MediaPeriodHolder mediaPeriodHolder;
        long j;
        MediaPeriodHolder mediaPeriodHolder2;
        MediaPeriodHolder mediaPeriodHolder3;
        RendererHolder[] rendererHolderArr;
        MediaPeriodQueue mediaPeriodQueue;
        boolean z;
        MediaPeriodHolder mediaPeriodHolder4;
        MediaPeriodHolder mediaPeriodHolder5;
        MediaPeriodHolder advancePlayingPeriod;
        boolean z2;
        int i;
        RendererHolder[] rendererHolderArr2;
        int i2;
        boolean z3;
        boolean z4;
        char c;
        int i3;
        int i4;
        MediaPeriodHolder mediaPeriodHolder6;
        MediaPeriodHolder mediaPeriodHolder7;
        boolean z5;
        int i5;
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared) {
            return;
        }
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        MediaPeriodQueue mediaPeriodQueue2 = this.queue;
        MediaPeriodHolder mediaPeriodHolder8 = mediaPeriodQueue2.loading;
        if (mediaPeriodHolder8 == null || (!mediaPeriodHolder8.info.isFinal && mediaPeriodHolder8.isFullyBuffered() && mediaPeriodQueue2.loading.info.durationUs != -9223372036854775807L && mediaPeriodQueue2.length < 100)) {
            MediaPeriodQueue mediaPeriodQueue3 = this.queue;
            long j2 = this.rendererPositionUs;
            PlaybackInfo playbackInfo = this.playbackInfo;
            MediaPeriodHolder mediaPeriodHolder9 = mediaPeriodQueue3.loading;
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder9 == null ? mediaPeriodQueue3.getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs, -9223372036854775807L) : mediaPeriodQueue3.getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder9, j2);
            if (mediaPeriodInfo != null) {
                MediaPeriodQueue mediaPeriodQueue4 = this.queue;
                MediaPeriodHolder mediaPeriodHolder10 = mediaPeriodQueue4.loading;
                long j3 = mediaPeriodHolder10 == null ? 1000000000000L : (mediaPeriodHolder10.rendererPositionOffsetUs + mediaPeriodHolder10.info.durationUs) - mediaPeriodInfo.startPositionUs;
                int i6 = 0;
                while (true) {
                    if (i6 >= mediaPeriodQueue4.preloadPriorityList.size()) {
                        mediaPeriodHolder = null;
                        break;
                    }
                    MediaPeriodInfo mediaPeriodInfo2 = ((MediaPeriodHolder) mediaPeriodQueue4.preloadPriorityList.get(i6)).info;
                    long j4 = mediaPeriodInfo2.durationUs;
                    long j5 = mediaPeriodInfo.durationUs;
                    if ((j4 == -9223372036854775807L || j4 == j5) && mediaPeriodInfo2.startPositionUs == mediaPeriodInfo.startPositionUs && mediaPeriodInfo2.id.equals(mediaPeriodInfo.id)) {
                        mediaPeriodHolder = (MediaPeriodHolder) mediaPeriodQueue4.preloadPriorityList.remove(i6);
                        break;
                    }
                    i6++;
                }
                if (mediaPeriodHolder == null) {
                    ExoPlayerImplInternal exoPlayerImplInternal = (ExoPlayerImplInternal) mediaPeriodQueue4.mediaPeriodHolderFactory.f$0;
                    BaseRenderer[] baseRendererArr = exoPlayerImplInternal.rendererCapabilities;
                    DefaultTrackSelector defaultTrackSelector = exoPlayerImplInternal.trackSelector;
                    DefaultLoadControl defaultLoadControl = exoPlayerImplInternal.loadControl;
                    PlayerId playerId = exoPlayerImplInternal.playerId;
                    defaultLoadControl.getClass();
                    j = -9223372036854775807L;
                    Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(defaultLoadControl, playerId);
                    MediaSourceList mediaSourceList = exoPlayerImplInternal.mediaSourceList;
                    TrackSelectorResult trackSelectorResult = exoPlayerImplInternal.emptyTrackSelectorResult;
                    exoPlayerImplInternal.preloadConfiguration.getClass();
                    mediaPeriodHolder = new MediaPeriodHolder(baseRendererArr, j3, defaultTrackSelector, anonymousClass3, mediaSourceList, mediaPeriodInfo, trackSelectorResult);
                } else {
                    j = -9223372036854775807L;
                    mediaPeriodHolder.info = mediaPeriodInfo;
                    mediaPeriodHolder.rendererPositionOffsetUs = j3;
                }
                MediaPeriodHolder mediaPeriodHolder11 = mediaPeriodQueue4.loading;
                if (mediaPeriodHolder11 == null) {
                    mediaPeriodQueue4.playing = mediaPeriodHolder;
                    mediaPeriodQueue4.reading = mediaPeriodHolder;
                    mediaPeriodQueue4.prewarming = mediaPeriodHolder;
                } else if (mediaPeriodHolder != mediaPeriodHolder11.next) {
                    mediaPeriodHolder11.disableTrackSelectionsInResult();
                    mediaPeriodHolder11.next = mediaPeriodHolder;
                    mediaPeriodHolder11.enableTrackSelectionsInResult();
                }
                mediaPeriodQueue4.oldFrontPeriodUid = null;
                mediaPeriodQueue4.loading = mediaPeriodHolder;
                mediaPeriodQueue4.length++;
                mediaPeriodQueue4.notifyQueueUpdate();
                if (!mediaPeriodHolder.prepareCalled) {
                    long j6 = mediaPeriodInfo.startPositionUs;
                    mediaPeriodHolder.prepareCalled = true;
                    mediaPeriodHolder.mediaPeriod.prepare(this, j6);
                } else if (mediaPeriodHolder.prepared) {
                    this.handler.obtainMessage(8, mediaPeriodHolder.mediaPeriod).sendToTarget();
                }
                if (this.queue.playing == mediaPeriodHolder) {
                    resetRendererPosition(mediaPeriodInfo.startPositionUs, true);
                }
                handleLoadingMediaPeriodChanged(false);
                if (this.shouldContinueLoading) {
                    maybeContinueLoading();
                } else {
                    this.shouldContinueLoading = isLoadingPossible(this.queue.loading);
                    updateIsLoading();
                }
                MediaPeriodQueue mediaPeriodQueue5 = this.queue;
                if (!this.pendingPauseAtEndOfPeriod && this.hasSecondaryRenderers && !this.isPrewarmingDisabledUntilNextTransition && !areRenderersPrewarming() && (mediaPeriodHolder6 = mediaPeriodQueue5.prewarming) != null && mediaPeriodHolder6 == mediaPeriodQueue5.reading && (mediaPeriodHolder7 = mediaPeriodHolder6.next) != null && (z5 = mediaPeriodHolder7.prepared)) {
                    Trace.checkState(z5);
                    if (((long) ((mediaPeriodHolder7.getStartPositionRendererTime() - this.rendererPositionUs) / this.mediaClock.getPlaybackParameters().speed)) <= 10000000) {
                        MediaPeriodHolder mediaPeriodHolder12 = mediaPeriodQueue5.prewarming;
                        mediaPeriodHolder12.getClass();
                        mediaPeriodQueue5.prewarming = mediaPeriodHolder12.next;
                        mediaPeriodQueue5.notifyQueueUpdate();
                        mediaPeriodQueue5.prewarming.getClass();
                        RendererHolder[] rendererHolderArr3 = this.renderers;
                        MediaPeriodHolder mediaPeriodHolder13 = mediaPeriodQueue5.prewarming;
                        if (mediaPeriodHolder13 != null) {
                            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder13.trackSelectorResult;
                            for (int i7 = 0; i7 < rendererHolderArr3.length; i7++) {
                                if (trackSelectorResult2.isRendererEnabled(i7)) {
                                    RendererHolder rendererHolder = rendererHolderArr3[i7];
                                    if (((BaseRenderer) rendererHolder.secondaryRenderer) != null && !rendererHolder.isPrewarming()) {
                                        RendererHolder rendererHolder2 = rendererHolderArr3[i7];
                                        Trace.checkState(!rendererHolder2.isPrewarming());
                                        if (RendererHolder.isRendererEnabled((BaseRenderer) rendererHolder2.primaryRenderer)) {
                                            i5 = 3;
                                        } else {
                                            BaseRenderer baseRenderer = (BaseRenderer) rendererHolder2.secondaryRenderer;
                                            i5 = (baseRenderer == null || baseRenderer.state == 0) ? 2 : 4;
                                        }
                                        rendererHolder2.prewarmingState = i5;
                                        enableRenderer(mediaPeriodHolder13, i7, false, mediaPeriodHolder13.getStartPositionRendererTime());
                                    }
                                }
                            }
                            if (areRenderersPrewarming()) {
                                this.prewarmingMediaPeriodDiscontinuity = mediaPeriodHolder13.mediaPeriod.readDiscontinuity();
                                if (!mediaPeriodHolder13.isFullyBuffered()) {
                                    mediaPeriodQueue5.removeAfter(mediaPeriodHolder13);
                                    handleLoadingMediaPeriodChanged(false);
                                    maybeContinueLoading();
                                }
                            }
                        }
                    }
                }
                boolean z6 = this.hasSecondaryRenderers;
                RendererHolder[] rendererHolderArr4 = this.renderers;
                MediaPeriodQueue mediaPeriodQueue6 = this.queue;
                mediaPeriodHolder2 = mediaPeriodQueue6.reading;
                if (mediaPeriodHolder2 != null) {
                    if (mediaPeriodHolder2.next == null || this.pendingPauseAtEndOfPeriod) {
                        if (mediaPeriodHolder2.info.isFinal || this.pendingPauseAtEndOfPeriod) {
                            for (RendererHolder rendererHolder3 : rendererHolderArr4) {
                                if (rendererHolder3.getRendererReadingFromPeriod(mediaPeriodHolder2) != null) {
                                    BaseRenderer rendererReadingFromPeriod = rendererHolder3.getRendererReadingFromPeriod(mediaPeriodHolder2);
                                    rendererReadingFromPeriod.getClass();
                                    if (rendererReadingFromPeriod.hasReadStreamToEnd()) {
                                        long j7 = mediaPeriodHolder2.info.durationUs;
                                        long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + mediaPeriodHolder2.rendererPositionOffsetUs;
                                        BaseRenderer rendererReadingFromPeriod2 = rendererHolder3.getRendererReadingFromPeriod(mediaPeriodHolder2);
                                        rendererReadingFromPeriod2.getClass();
                                        RendererHolder.setCurrentStreamFinalInternal(rendererReadingFromPeriod2, j8);
                                    }
                                }
                            }
                        }
                    } else if (mediaPeriodHolder2.prepared) {
                        int i8 = 0;
                        while (true) {
                            if (i8 < rendererHolderArr4.length) {
                                RendererHolder rendererHolder4 = rendererHolderArr4[i8];
                                if (!rendererHolder4.hasFinishedReadingFromPeriodInternal(mediaPeriodHolder2, (BaseRenderer) rendererHolder4.primaryRenderer) || !rendererHolder4.hasFinishedReadingFromPeriodInternal(mediaPeriodHolder2, (BaseRenderer) rendererHolder4.secondaryRenderer)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            } else if (!areRenderersPrewarming() || mediaPeriodQueue6.prewarming != mediaPeriodQueue6.reading) {
                                MediaPeriodHolder mediaPeriodHolder14 = mediaPeriodHolder2.next;
                                if (mediaPeriodHolder14.prepared || this.rendererPositionUs >= mediaPeriodHolder14.getStartPositionRendererTime()) {
                                    boolean z7 = mediaPeriodHolder2.next.prepared;
                                    if (z7) {
                                        Trace.checkState(z7);
                                    }
                                    TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder2.trackSelectorResult;
                                    MediaPeriodHolder mediaPeriodHolder15 = mediaPeriodQueue6.prewarming;
                                    MediaPeriodHolder mediaPeriodHolder16 = mediaPeriodQueue6.reading;
                                    if (mediaPeriodHolder15 == mediaPeriodHolder16) {
                                        mediaPeriodHolder16.getClass();
                                        mediaPeriodQueue6.prewarming = mediaPeriodHolder16.next;
                                    }
                                    MediaPeriodHolder mediaPeriodHolder17 = mediaPeriodQueue6.reading;
                                    mediaPeriodHolder17.getClass();
                                    mediaPeriodQueue6.reading = mediaPeriodHolder17.next;
                                    mediaPeriodQueue6.notifyQueueUpdate();
                                    MediaPeriodHolder mediaPeriodHolder18 = mediaPeriodQueue6.reading;
                                    mediaPeriodHolder18.getClass();
                                    TrackSelectorResult trackSelectorResult4 = mediaPeriodHolder18.trackSelectorResult;
                                    Timeline timeline = this.playbackInfo.timeline;
                                    updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodHolder18.info.id, timeline, mediaPeriodHolder2.info.id, -9223372036854775807L, false);
                                    if (mediaPeriodHolder18.prepared && ((z6 && this.prewarmingMediaPeriodDiscontinuity != j) || mediaPeriodHolder18.mediaPeriod.readDiscontinuity() != j)) {
                                        this.prewarmingMediaPeriodDiscontinuity = j;
                                        boolean z8 = z6 && !this.isPrewarmingDisabledUntilNextTransition;
                                        if (z8) {
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= rendererHolderArr4.length) {
                                                    break;
                                                }
                                                boolean isRendererEnabled = trackSelectorResult4.isRendererEnabled(i9);
                                                ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult4.selections;
                                                if (isRendererEnabled && ((BaseRenderer) rendererHolderArr4[i9].primaryRenderer).trackType != -2 && !MimeTypes.allSamplesAreSyncSamples(exoTrackSelectionArr[i9].getSelectedFormat().sampleMimeType, exoTrackSelectionArr[i9].getSelectedFormat().codecs) && !rendererHolderArr4[i9].isPrewarming()) {
                                                    z8 = false;
                                                    break;
                                                }
                                                i9++;
                                            }
                                        }
                                        if (!z8) {
                                            long startPositionRendererTime = mediaPeriodHolder18.getStartPositionRendererTime();
                                            for (RendererHolder rendererHolder5 : rendererHolderArr4) {
                                                BaseRenderer baseRenderer2 = (BaseRenderer) rendererHolder5.secondaryRenderer;
                                                BaseRenderer baseRenderer3 = (BaseRenderer) rendererHolder5.primaryRenderer;
                                                if (RendererHolder.isRendererEnabled(baseRenderer3) && (i4 = rendererHolder5.prewarmingState) != 4 && i4 != 2) {
                                                    RendererHolder.setCurrentStreamFinalInternal(baseRenderer3, startPositionRendererTime);
                                                }
                                                if (baseRenderer2 != null && baseRenderer2.state != 0 && rendererHolder5.prewarmingState != 3) {
                                                    RendererHolder.setCurrentStreamFinalInternal(baseRenderer2, startPositionRendererTime);
                                                }
                                            }
                                            if (!mediaPeriodHolder18.isFullyBuffered()) {
                                                mediaPeriodQueue6.removeAfter(mediaPeriodHolder18);
                                                handleLoadingMediaPeriodChanged(false);
                                                maybeContinueLoading();
                                            }
                                        }
                                    }
                                    for (RendererHolder rendererHolder6 : rendererHolderArr4) {
                                        long startPositionRendererTime2 = mediaPeriodHolder18.getStartPositionRendererTime();
                                        BaseRenderer baseRenderer4 = (BaseRenderer) rendererHolder6.primaryRenderer;
                                        int i10 = rendererHolder6.index;
                                        boolean isRendererEnabled2 = trackSelectorResult3.isRendererEnabled(i10);
                                        boolean isRendererEnabled3 = trackSelectorResult4.isRendererEnabled(i10);
                                        BaseRenderer baseRenderer5 = (BaseRenderer) rendererHolder6.secondaryRenderer;
                                        if (baseRenderer5 == null || (i3 = rendererHolder6.prewarmingState) == 3 || (i3 == 0 && RendererHolder.isRendererEnabled(baseRenderer4))) {
                                            baseRenderer5 = baseRenderer4;
                                        }
                                        if (!isRendererEnabled2 || baseRenderer5.streamIsFinal) {
                                            c = 65534;
                                        } else {
                                            int i11 = baseRenderer4.trackType;
                                            c = 65534;
                                            boolean z9 = i11 == -2;
                                            RendererConfiguration rendererConfiguration = trackSelectorResult3.rendererConfigurations[i10];
                                            RendererConfiguration rendererConfiguration2 = trackSelectorResult4.rendererConfigurations[i10];
                                            if (!isRendererEnabled3 || !Objects.equals(rendererConfiguration2, rendererConfiguration) || z9 || rendererHolder6.isPrewarming()) {
                                                RendererHolder.setCurrentStreamFinalInternal(baseRenderer5, startPositionRendererTime2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                MediaPeriodQueue mediaPeriodQueue7 = this.queue;
                mediaPeriodHolder3 = mediaPeriodQueue7.reading;
                if (mediaPeriodHolder3 != null && mediaPeriodQueue7.playing != mediaPeriodHolder3 && !mediaPeriodHolder3.allRenderersInCorrectState) {
                    rendererHolderArr2 = this.renderers;
                    TrackSelectorResult trackSelectorResult5 = mediaPeriodHolder3.trackSelectorResult;
                    z3 = true;
                    for (i2 = 0; i2 < rendererHolderArr2.length; i2++) {
                        int enabledRendererCount = rendererHolderArr2[i2].getEnabledRendererCount();
                        RendererHolder rendererHolder7 = rendererHolderArr2[i2];
                        zzd zzdVar = this.mediaClock;
                        int replaceStreamsOrDisableRendererForTransitionInternal = rendererHolder7.replaceStreamsOrDisableRendererForTransitionInternal((BaseRenderer) rendererHolder7.primaryRenderer, mediaPeriodHolder3, trackSelectorResult5, zzdVar);
                        int replaceStreamsOrDisableRendererForTransitionInternal2 = rendererHolder7.replaceStreamsOrDisableRendererForTransitionInternal((BaseRenderer) rendererHolder7.secondaryRenderer, mediaPeriodHolder3, trackSelectorResult5, zzdVar);
                        if (replaceStreamsOrDisableRendererForTransitionInternal == 1) {
                            replaceStreamsOrDisableRendererForTransitionInternal = replaceStreamsOrDisableRendererForTransitionInternal2;
                        }
                        if ((replaceStreamsOrDisableRendererForTransitionInternal & 2) != 0 && (z4 = this.offloadSchedulingEnabled) && z4) {
                            this.offloadSchedulingEnabled = false;
                            if (this.playbackInfo.sleepingForOffload) {
                                this.handler.sendEmptyMessage(2);
                            }
                        }
                        this.enabledRendererCount -= enabledRendererCount - rendererHolderArr2[i2].getEnabledRendererCount();
                        z3 &= (replaceStreamsOrDisableRendererForTransitionInternal & 1) != 0;
                    }
                    if (z3) {
                        for (int i12 = 0; i12 < rendererHolderArr2.length; i12++) {
                            if (trackSelectorResult5.isRendererEnabled(i12) && rendererHolderArr2[i12].getRendererReadingFromPeriod(mediaPeriodHolder3) == null) {
                                enableRenderer(mediaPeriodHolder3, i12, false, mediaPeriodHolder3.getStartPositionRendererTime());
                            }
                        }
                    }
                    if (z3) {
                        mediaPeriodQueue7.reading.allRenderersInCorrectState = true;
                    }
                }
                rendererHolderArr = this.renderers;
                mediaPeriodQueue = this.queue;
                z = false;
                while (shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (mediaPeriodHolder4 = mediaPeriodQueue.playing) != null && (mediaPeriodHolder5 = mediaPeriodHolder4.next) != null && this.rendererPositionUs >= mediaPeriodHolder5.getStartPositionRendererTime() && mediaPeriodHolder5.allRenderersInCorrectState) {
                    if (z) {
                        maybeNotifyPlaybackInfoChanged();
                    }
                    this.isPrewarmingDisabledUntilNextTransition = false;
                    advancePlayingPeriod = mediaPeriodQueue.advancePlayingPeriod();
                    advancePlayingPeriod.getClass();
                    if (this.playbackInfo.periodId.periodUid.equals(advancePlayingPeriod.info.id.periodUid)) {
                        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = this.playbackInfo.periodId;
                        if (mediaSource$MediaPeriodId.adGroupIndex == -1) {
                            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = advancePlayingPeriod.info.id;
                            if (mediaSource$MediaPeriodId2.adGroupIndex == -1 && mediaSource$MediaPeriodId.nextAdGroupIndex != mediaSource$MediaPeriodId2.nextAdGroupIndex) {
                                z2 = true;
                                MediaPeriodInfo mediaPeriodInfo3 = advancePlayingPeriod.info;
                                boolean z10 = z2;
                                MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = mediaPeriodInfo3.id;
                                long j9 = mediaPeriodInfo3.startPositionUs;
                                this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId3, j9, mediaPeriodInfo3.requestedContentPositionUs, j9, !z10, 0);
                                resetPendingPauseAtEndOfPeriod();
                                updatePlaybackPositions();
                                if (areRenderersPrewarming() && advancePlayingPeriod == mediaPeriodQueue.prewarming) {
                                    for (RendererHolder rendererHolder8 : rendererHolderArr) {
                                        int i13 = rendererHolder8.prewarmingState;
                                        if (i13 == 3 || i13 == 4) {
                                            boolean z11 = i13 == 4;
                                            BaseRenderer baseRenderer6 = (BaseRenderer) rendererHolder8.primaryRenderer;
                                            BaseRenderer baseRenderer7 = (BaseRenderer) rendererHolder8.secondaryRenderer;
                                            if (z11) {
                                                baseRenderer7.getClass();
                                                baseRenderer7.handleMessage(17, baseRenderer6);
                                            } else {
                                                baseRenderer7.getClass();
                                                baseRenderer6.handleMessage(17, baseRenderer7);
                                            }
                                            rendererHolder8.prewarmingState = rendererHolder8.prewarmingState == 4 ? 0 : 1;
                                        } else if (i13 == 2) {
                                            rendererHolder8.prewarmingState = 0;
                                        }
                                    }
                                }
                                if (this.playbackInfo.playbackState == 3) {
                                    startRenderers();
                                }
                                TrackSelectorResult trackSelectorResult6 = mediaPeriodQueue.playing.trackSelectorResult;
                                for (i = 0; i < rendererHolderArr.length; i++) {
                                    if (trackSelectorResult6.isRendererEnabled(i)) {
                                        RendererHolder rendererHolder9 = rendererHolderArr[i];
                                        BaseRenderer baseRenderer8 = (BaseRenderer) rendererHolder9.secondaryRenderer;
                                        BaseRenderer baseRenderer9 = (BaseRenderer) rendererHolder9.primaryRenderer;
                                        if (RendererHolder.isRendererEnabled(baseRenderer9)) {
                                            baseRenderer9.enableMayRenderStartOfStream();
                                        } else if (baseRenderer8 != null && baseRenderer8.state != 0) {
                                            baseRenderer8.enableMayRenderStartOfStream();
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z2 = false;
                    MediaPeriodInfo mediaPeriodInfo32 = advancePlayingPeriod.info;
                    boolean z102 = z2;
                    MediaSource$MediaPeriodId mediaSource$MediaPeriodId32 = mediaPeriodInfo32.id;
                    long j92 = mediaPeriodInfo32.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId32, j92, mediaPeriodInfo32.requestedContentPositionUs, j92, !z102, 0);
                    resetPendingPauseAtEndOfPeriod();
                    updatePlaybackPositions();
                    if (areRenderersPrewarming()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.playbackInfo.playbackState == 3) {
                    }
                    TrackSelectorResult trackSelectorResult62 = mediaPeriodQueue.playing.trackSelectorResult;
                    while (i < rendererHolderArr.length) {
                    }
                    z = true;
                }
                this.preloadConfiguration.getClass();
            }
        }
        j = -9223372036854775807L;
        if (this.shouldContinueLoading) {
        }
        MediaPeriodQueue mediaPeriodQueue52 = this.queue;
        if (!this.pendingPauseAtEndOfPeriod) {
            Trace.checkState(z5);
            if (((long) ((mediaPeriodHolder7.getStartPositionRendererTime() - this.rendererPositionUs) / this.mediaClock.getPlaybackParameters().speed)) <= 10000000) {
            }
        }
        boolean z62 = this.hasSecondaryRenderers;
        RendererHolder[] rendererHolderArr42 = this.renderers;
        MediaPeriodQueue mediaPeriodQueue62 = this.queue;
        mediaPeriodHolder2 = mediaPeriodQueue62.reading;
        if (mediaPeriodHolder2 != null) {
        }
        MediaPeriodQueue mediaPeriodQueue72 = this.queue;
        mediaPeriodHolder3 = mediaPeriodQueue72.reading;
        if (mediaPeriodHolder3 != null) {
            rendererHolderArr2 = this.renderers;
            TrackSelectorResult trackSelectorResult52 = mediaPeriodHolder3.trackSelectorResult;
            z3 = true;
            while (i2 < rendererHolderArr2.length) {
            }
            if (z3) {
            }
            if (z3) {
            }
        }
        rendererHolderArr = this.renderers;
        mediaPeriodQueue = this.queue;
        z = false;
        while (shouldPlayWhenReady()) {
            if (z) {
            }
            this.isPrewarmingDisabledUntilNextTransition = false;
            advancePlayingPeriod = mediaPeriodQueue.advancePlayingPeriod();
            advancePlayingPeriod.getClass();
            if (this.playbackInfo.periodId.periodUid.equals(advancePlayingPeriod.info.id.periodUid)) {
            }
            z2 = false;
            MediaPeriodInfo mediaPeriodInfo322 = advancePlayingPeriod.info;
            boolean z1022 = z2;
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId322 = mediaPeriodInfo322.id;
            long j922 = mediaPeriodInfo322.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaSource$MediaPeriodId322, j922, mediaPeriodInfo322.requestedContentPositionUs, j922, !z1022, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            if (areRenderersPrewarming()) {
            }
            if (this.playbackInfo.playbackState == 3) {
            }
            TrackSelectorResult trackSelectorResult622 = mediaPeriodQueue.playing.trackSelectorResult;
            while (i < rendererHolderArr.length) {
            }
            z = true;
        }
        this.preloadConfiguration.getClass();
    }

    public final void updatePlayWhenReadyWithAudioFocus(int i, int i2, boolean z, int i3) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.scrubbingModeEnabled;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z2 && playbackInfo.playbackSuppressionReason == i2 && playbackInfo.playWhenReadyChangeReason == i3) {
            return;
        }
        this.playbackInfo = playbackInfo.copyWithPlayWhenReady(i3, i2, z2);
        updateRebufferingState(false, false);
        MediaPeriodQueue mediaPeriodQueue = this.queue;
        for (MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.next) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder.trackSelectorResult.selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z2);
                }
            }
        }
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            if (playbackInfo2.sleepingForOffload) {
                this.playbackInfo = playbackInfo2.copyWithSleepingForOffload(false);
            }
            mediaPeriodQueue.reevaluateBuffer(this.rendererPositionUs);
            return;
        }
        int i4 = this.playbackInfo.playbackState;
        SystemHandlerWrapper systemHandlerWrapper = this.handler;
        if (i4 != 3) {
            if (i4 == 2) {
                systemHandlerWrapper.sendEmptyMessage(2);
            }
        } else {
            zzd zzdVar = this.mediaClock;
            zzdVar.zzd = true;
            ((StandaloneMediaClock) zzdVar.zza).start();
            startRenderers();
            systemHandlerWrapper.sendEmptyMessage(2);
        }
    }

    public final void updatePlaybackPositions() {
        long j;
        float f;
        MediaPeriodHolder mediaPeriodHolder = this.queue.playing;
        if (mediaPeriodHolder == null) {
            return;
        }
        long readDiscontinuity = mediaPeriodHolder.prepared ? mediaPeriodHolder.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            if (!mediaPeriodHolder.isFullyBuffered()) {
                this.queue.removeAfter(mediaPeriodHolder);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(readDiscontinuity, true);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, readDiscontinuity, playbackInfo.requestedContentPositionUs, readDiscontinuity, true, 5);
            }
        } else {
            zzd zzdVar = this.mediaClock;
            boolean z = mediaPeriodHolder != this.queue.reading;
            StandaloneMediaClock standaloneMediaClock = (StandaloneMediaClock) zzdVar.zza;
            BaseRenderer baseRenderer = (BaseRenderer) zzdVar.zze;
            if (baseRenderer == null || baseRenderer.isEnded() || ((z && ((BaseRenderer) zzdVar.zze).state != 2) || (!((BaseRenderer) zzdVar.zze).isReady() && (z || ((BaseRenderer) zzdVar.zze).hasReadStreamToEnd())))) {
                zzdVar.zzc = true;
                if (zzdVar.zzd) {
                    standaloneMediaClock.start();
                }
            } else {
                MediaClock mediaClock = (MediaClock) zzdVar.zzf;
                mediaClock.getClass();
                long positionUs = mediaClock.getPositionUs();
                if (zzdVar.zzc) {
                    if (positionUs >= standaloneMediaClock.getPositionUs()) {
                        zzdVar.zzc = false;
                        if (zzdVar.zzd) {
                            standaloneMediaClock.start();
                        }
                    } else if (standaloneMediaClock.started) {
                        standaloneMediaClock.resetPosition(standaloneMediaClock.getPositionUs());
                        standaloneMediaClock.started = false;
                    }
                }
                standaloneMediaClock.resetPosition(positionUs);
                PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
                if (!playbackParameters.equals(standaloneMediaClock.playbackParameters)) {
                    standaloneMediaClock.setPlaybackParameters(playbackParameters);
                    ((ExoPlayerImplInternal) zzdVar.zzb).handler.obtainMessage(16, playbackParameters).sendToTarget();
                }
            }
            long positionUs2 = zzdVar.getPositionUs();
            this.rendererPositionUs = positionUs2;
            long j2 = positionUs2 - mediaPeriodHolder.rendererPositionOffsetUs;
            long j3 = this.playbackInfo.positionUs;
            if (!this.pendingMessages.isEmpty() && !this.playbackInfo.periodId.isAd()) {
                if (this.deliverPendingMessageAtStartPositionRequired) {
                    this.deliverPendingMessageAtStartPositionRequired = false;
                }
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                playbackInfo2.timeline.getIndexOfPeriod(playbackInfo2.periodId.periodUid);
                int min = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
                if (min > 0 && this.pendingMessages.get(min - 1) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                } else {
                    if (min < this.pendingMessages.size() && this.pendingMessages.get(min) != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                    this.nextPendingMessageIndexHint = min;
                }
            }
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z2 = !this.playbackInfoUpdate.isCompleted;
                PlaybackInfo playbackInfo3 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, j2, playbackInfo3.requestedContentPositionUs, j2, z2, 6);
            } else {
                PlaybackInfo playbackInfo4 = this.playbackInfo;
                playbackInfo4.positionUs = j2;
                playbackInfo4.positionUpdateTimeMs = android.os.SystemClock.elapsedRealtime();
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.loading.getBufferedPositionUs();
        PlaybackInfo playbackInfo5 = this.playbackInfo;
        playbackInfo5.totalBufferedDurationUs = getTotalBufferedDurationUs(playbackInfo5.bufferedPositionUs);
        PlaybackInfo playbackInfo6 = this.playbackInfo;
        if (playbackInfo6.playWhenReady && playbackInfo6.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo6.timeline, playbackInfo6.periodId)) {
            PlaybackInfo playbackInfo7 = this.playbackInfo;
            float f2 = 1.0f;
            if (playbackInfo7.playbackParameters.speed == 1.0f) {
                DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.livePlaybackSpeedControl;
                long liveOffsetUs = getLiveOffsetUs(playbackInfo7.timeline, playbackInfo7.periodId.periodUid, playbackInfo7.positionUs);
                long j4 = this.playbackInfo.totalBufferedDurationUs;
                if (defaultLivePlaybackSpeedControl.mediaConfigurationTargetLiveOffsetUs != -9223372036854775807L) {
                    long j5 = liveOffsetUs - j4;
                    long j6 = defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetUs;
                    if (j6 == -9223372036854775807L) {
                        defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetUs = j5;
                        defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
                    } else {
                        defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetUs = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetDeviationUs = (long) ((9.999871E-4f * Math.abs(j5 - r9)) + (defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetDeviationUs * 0.999f));
                    }
                    if (defaultLivePlaybackSpeedControl.lastPlaybackSpeedUpdateMs != -9223372036854775807L) {
                        j = 1000;
                        if (android.os.SystemClock.elapsedRealtime() - defaultLivePlaybackSpeedControl.lastPlaybackSpeedUpdateMs < 1000) {
                            f2 = defaultLivePlaybackSpeedControl.adjustedPlaybackSpeed;
                        }
                    } else {
                        j = 1000;
                    }
                    defaultLivePlaybackSpeedControl.lastPlaybackSpeedUpdateMs = android.os.SystemClock.elapsedRealtime();
                    long j7 = (defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetDeviationUs * 3) + defaultLivePlaybackSpeedControl.smoothedMinPossibleLiveOffsetUs;
                    if (defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs > j7) {
                        float msToUs = Util.msToUs(j);
                        f = 1.0E-7f;
                        long[] jArr = {j7, defaultLivePlaybackSpeedControl.idealTargetLiveOffsetUs, defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs - (((long) ((defaultLivePlaybackSpeedControl.adjustedPlaybackSpeed - 1.0f) * msToUs)) + ((long) ((defaultLivePlaybackSpeedControl.maxPlaybackSpeed - 1.0f) * msToUs)))};
                        long j8 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j9 = jArr[i];
                            if (j9 > j8) {
                                j8 = j9;
                            }
                        }
                        defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs = j8;
                    } else {
                        f = 1.0E-7f;
                        long constrainValue = Util.constrainValue(liveOffsetUs - ((long) (Math.max(RecyclerView.DECELERATION_RATE, defaultLivePlaybackSpeedControl.adjustedPlaybackSpeed - 1.0f) / 1.0E-7f)), defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs, j7);
                        defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs = constrainValue;
                        long j10 = defaultLivePlaybackSpeedControl.maxTargetLiveOffsetUs;
                        if (j10 != -9223372036854775807L && constrainValue > j10) {
                            defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs = j10;
                        }
                    }
                    long j11 = liveOffsetUs - defaultLivePlaybackSpeedControl.currentTargetLiveOffsetUs;
                    if (Math.abs(j11) < defaultLivePlaybackSpeedControl.maxLiveOffsetErrorUsForUnitSpeed) {
                        defaultLivePlaybackSpeedControl.adjustedPlaybackSpeed = 1.0f;
                    } else {
                        defaultLivePlaybackSpeedControl.adjustedPlaybackSpeed = Util.constrainValue((f * j11) + 1.0f, defaultLivePlaybackSpeedControl.minPlaybackSpeed, defaultLivePlaybackSpeedControl.maxPlaybackSpeed);
                    }
                    f2 = defaultLivePlaybackSpeedControl.adjustedPlaybackSpeed;
                }
                if (this.mediaClock.getPlaybackParameters().speed != f2) {
                    PlaybackParameters playbackParameters2 = new PlaybackParameters(f2, this.playbackInfo.playbackParameters.pitch);
                    this.handler.removeMessages(16);
                    this.mediaClock.setPlaybackParameters(playbackParameters2);
                    handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
                }
            }
        }
    }

    public final void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Timeline timeline2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId2, long j, boolean z) {
        boolean shouldUseLivePlaybackSpeedControl = shouldUseLivePlaybackSpeedControl(timeline, mediaSource$MediaPeriodId);
        Object obj = mediaSource$MediaPeriodId.periodUid;
        if (!shouldUseLivePlaybackSpeedControl) {
            PlaybackParameters playbackParameters = mediaSource$MediaPeriodId.isAd() ? PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            zzd zzdVar = this.mediaClock;
            if (zzdVar.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            this.handler.removeMessages(16);
            zzdVar.setPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        Timeline.Period period = this.period;
        int i = timeline.getPeriodByUid(obj, period).windowIndex;
        Timeline.Window window = this.window;
        timeline.getWindow(i, window);
        MediaItem.LiveConfiguration liveConfiguration = window.liveConfiguration;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.livePlaybackSpeedControl;
        defaultLivePlaybackSpeedControl.getClass();
        defaultLivePlaybackSpeedControl.mediaConfigurationTargetLiveOffsetUs = Util.msToUs(liveConfiguration.targetOffsetMs);
        defaultLivePlaybackSpeedControl.minTargetLiveOffsetUs = Util.msToUs(liveConfiguration.minOffsetMs);
        defaultLivePlaybackSpeedControl.maxTargetLiveOffsetUs = Util.msToUs(liveConfiguration.maxOffsetMs);
        float f = liveConfiguration.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        defaultLivePlaybackSpeedControl.minPlaybackSpeed = f;
        float f2 = liveConfiguration.maxPlaybackSpeed;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        defaultLivePlaybackSpeedControl.maxPlaybackSpeed = f2;
        if (f == 1.0f && f2 == 1.0f) {
            defaultLivePlaybackSpeedControl.mediaConfigurationTargetLiveOffsetUs = -9223372036854775807L;
        }
        defaultLivePlaybackSpeedControl.maybeResetTargetLiveOffsetUs();
        if (j != -9223372036854775807L) {
            defaultLivePlaybackSpeedControl.targetLiveOffsetOverrideUs = getLiveOffsetUs(timeline, obj, j);
            defaultLivePlaybackSpeedControl.maybeResetTargetLiveOffsetUs();
            return;
        }
        if (!Objects.equals(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaSource$MediaPeriodId2.periodUid, period).windowIndex, window, 0L).uid : null, window.uid) || z) {
            defaultLivePlaybackSpeedControl.targetLiveOffsetOverrideUs = -9223372036854775807L;
            defaultLivePlaybackSpeedControl.maybeResetTargetLiveOffsetUs();
        }
    }

    public final void updateRebufferingState(boolean z, boolean z2) {
        long j;
        this.isRebuffering = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.clock.getClass();
            j = android.os.SystemClock.elapsedRealtime();
        }
        this.lastRebufferRealtimeMs = j;
    }
}
