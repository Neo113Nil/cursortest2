package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.TrackOutput;
import androidx.tracing.Trace;
import coil3.memory.RealStrongMemoryCache$cache$1;
import coil3.svg.internal.AndroidSvg;
import com.datadog.trace.core.util.SimpleRateLimiter;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class SampleQueue implements TrackOutput {
    public int absoluteFirstIndex;
    public Toolbar.AnonymousClass1 currentDrmSession;
    public Format downstreamFormat;
    public final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    public final DrmSessionManager drmSessionManager;
    public boolean isLastSampleQueued;
    public int length;
    public boolean loggedUnexpectedNonSyncSample;
    public int readPosition;
    public int relativeFirstIndex;
    public final SampleDataQueue sampleDataQueue;
    public Format upstreamFormat;
    public ProgressiveMediaPeriod upstreamFormatChangeListener;
    public final SimpleRateLimiter extrasHolder = new SimpleRateLimiter();
    public int capacity = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
    public long[] sourceIds = new long[IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO];
    public long[] offsets = new long[IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO];
    public long[] timesUs = new long[IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO];
    public int[] flags = new int[IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO];
    public int[] sizes = new int[IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO];
    public TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO];
    public final HuffmanTreeGroup sharedSampleMetadata = new HuffmanTreeGroup(new Id3Peeker$$ExternalSyntheticBUOutline0(13));
    public long startTimeUs = Long.MIN_VALUE;
    public long largestDiscardedTimestampUs = Long.MIN_VALUE;
    public long largestQueuedTimestampUs = Long.MIN_VALUE;
    public boolean upstreamFormatRequired = true;
    public boolean upstreamKeyframeRequired = true;
    public boolean discardAllSamplesToStartTime = true;
    public long readEndTimeUs = Long.MIN_VALUE;
    public int readEndTimeAbsoluteIndex = -1;

    public final class SharedSampleMetadata {
        public final DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0 drmSessionReference;

        /* renamed from: format, reason: collision with root package name */
        public final Format f884format;

        public SharedSampleMetadata(Format format2, DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0 drmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0) {
            this.f884format = format2;
            this.drmSessionReference = drmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0;
        }
    }

    public SampleQueue(Recorder.AnonymousClass3 anonymousClass3, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(anonymousClass3);
    }

    public final long discardSamples(int i) {
        long j = this.largestDiscardedTimestampUs;
        int i2 = 0;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int relativeIndex = getRelativeIndex(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.timesUs[relativeIndex]);
                if ((this.flags[relativeIndex] & 1) != 0) {
                    break;
                }
                relativeIndex--;
                if (relativeIndex == -1) {
                    relativeIndex = this.capacity - 1;
                }
            }
        }
        this.largestDiscardedTimestampUs = Math.max(j, j2);
        this.length -= i;
        int i4 = this.absoluteFirstIndex + i;
        this.absoluteFirstIndex = i4;
        int i5 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i5;
        int i6 = this.capacity;
        if (i5 >= i6) {
            this.relativeFirstIndex = i5 - i6;
        }
        int i7 = this.readPosition - i;
        this.readPosition = i7;
        if (i7 < 0) {
            this.readPosition = 0;
        }
        HuffmanTreeGroup huffmanTreeGroup = this.sharedSampleMetadata;
        SparseArray sparseArray = (SparseArray) huffmanTreeGroup.codes;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((Id3Peeker$$ExternalSyntheticBUOutline0) huffmanTreeGroup.trees).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = huffmanTreeGroup.alphabetSize;
            if (i9 > 0) {
                huffmanTreeGroup.alphabetSize = i9 - 1;
            }
            i2 = i8;
        }
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i10 = this.relativeFirstIndex;
        if (i10 == 0) {
            i10 = this.capacity;
        }
        return this.offsets[i10 - 1] + this.sizes[r10];
    }

    public final void discardToEnd() {
        long discardSamples;
        SampleDataQueue sampleDataQueue = this.sampleDataQueue;
        synchronized (this) {
            int i = this.length;
            discardSamples = i == 0 ? -1L : discardSamples(i);
        }
        sampleDataQueue.discardDownstreamTo(discardSamples);
    }

    public final int findSampleAfter(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.timesUs[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.timesUs[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.flags[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i3;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format2) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.upstreamFormatRequired = false;
                if (!Objects.equals(format2, this.upstreamFormat)) {
                    if (!(((SparseArray) this.sharedSampleMetadata.codes).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.sharedSampleMetadata.codes;
                        if (((SharedSampleMetadata) sparseArray.valueAt(sparseArray.size() - 1)).f884format.equals(format2)) {
                            SparseArray sparseArray2 = (SparseArray) this.sharedSampleMetadata.codes;
                            this.upstreamFormat = ((SharedSampleMetadata) sparseArray2.valueAt(sparseArray2.size() - 1)).f884format;
                            boolean z2 = this.discardAllSamplesToStartTime;
                            Format format3 = this.upstreamFormat;
                            String str = format3.sampleMimeType;
                            this.discardAllSamplesToStartTime = z2 & (MimeTypes.getTrackType(str) != 1 && MimeTypes.allSamplesAreSyncSamples(str, format3.codecs));
                            this.loggedUnexpectedNonSyncSample = false;
                            z = true;
                        }
                    }
                    this.upstreamFormat = format2;
                    boolean z22 = this.discardAllSamplesToStartTime;
                    Format format32 = this.upstreamFormat;
                    String str2 = format32.sampleMimeType;
                    this.discardAllSamplesToStartTime = z22 & (MimeTypes.getTrackType(str2) != 1 && MimeTypes.allSamplesAreSyncSamples(str2, format32.codecs));
                    this.loggedUnexpectedNonSyncSample = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ProgressiveMediaPeriod progressiveMediaPeriod = this.upstreamFormatChangeListener;
        if (progressiveMediaPeriod == null || !z) {
            return;
        }
        progressiveMediaPeriod.handler.post(progressiveMediaPeriod.maybeFinishPrepareRunnable);
    }

    public final int getRelativeIndex(int i) {
        int i2 = this.relativeFirstIndex + i;
        int i3 = this.capacity;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final synchronized boolean isReady(boolean z) {
        Format format2;
        int i = this.absoluteFirstIndex;
        int i2 = this.readPosition;
        int i3 = i + i2;
        int i4 = this.readEndTimeAbsoluteIndex;
        boolean z2 = true;
        if (i4 != -1 && i3 >= i4) {
            return true;
        }
        if (i2 != this.length) {
            if (((SharedSampleMetadata) this.sharedSampleMetadata.m4368get(i3)).f884format != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z && !this.isLastSampleQueued && ((format2 = this.upstreamFormat) == null || format2 == this.downstreamFormat)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean mayReadSample(int i) {
        Toolbar.AnonymousClass1 anonymousClass1 = this.currentDrmSession;
        if (anonymousClass1 == null || anonymousClass1.getState() == 4) {
            return true;
        }
        if ((this.flags[i] & 1073741824) != 0) {
            return false;
        }
        this.currentDrmSession.getClass();
        return false;
    }

    public final void onFormatResult(Format format2, AndroidSvg androidSvg) {
        Format format3;
        Format format4 = this.downstreamFormat;
        boolean z = format4 == null;
        DrmInitData drmInitData = format4 == null ? null : format4.drmInitData;
        this.downstreamFormat = format2;
        DrmInitData drmInitData2 = format2.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        if (drmSessionManager != null) {
            int cryptoType = drmSessionManager.getCryptoType(format2);
            Format.Builder buildUpon = format2.buildUpon();
            buildUpon.cryptoType = cryptoType;
            format3 = new Format(buildUpon);
        } else {
            format3 = format2;
        }
        androidSvg.renderOptions = format3;
        androidSvg.svg = this.currentDrmSession;
        if (drmSessionManager == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            Toolbar.AnonymousClass1 anonymousClass1 = this.currentDrmSession;
            DrmSessionEventListener.EventDispatcher eventDispatcher = this.drmEventDispatcher;
            Toolbar.AnonymousClass1 acquireSession = drmSessionManager.acquireSession(eventDispatcher, format2);
            this.currentDrmSession = acquireSession;
            androidSvg.svg = acquireSession;
            if (anonymousClass1 != null) {
                anonymousClass1.release(eventDispatcher);
            }
        }
    }

    public final void reset(boolean z) {
        SampleDataQueue sampleDataQueue = this.sampleDataQueue;
        Recorder.AnonymousClass3 anonymousClass3 = sampleDataQueue.allocator;
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = sampleDataQueue.firstAllocationNode;
        if (((Allocation) realStrongMemoryCache$cache$1.map) != null) {
            synchronized (anonymousClass3) {
                ((DefaultLoadControl) anonymousClass3.this$0).allocator.release(realStrongMemoryCache$cache$1);
                RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = realStrongMemoryCache$cache$1;
                while (realStrongMemoryCache$cache$12 != null) {
                    Allocation allocation = (Allocation) realStrongMemoryCache$cache$12.map;
                    allocation.getClass();
                    anonymousClass3.releaseInternal(allocation);
                    realStrongMemoryCache$cache$12 = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$12.this$0;
                    if (realStrongMemoryCache$cache$12 == null || ((Allocation) realStrongMemoryCache$cache$12.map) == null) {
                        realStrongMemoryCache$cache$12 = null;
                    }
                }
            }
            realStrongMemoryCache$cache$1.map = null;
            realStrongMemoryCache$cache$1.this$0 = null;
        }
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$13 = sampleDataQueue.firstAllocationNode;
        int i = sampleDataQueue.allocationLength;
        Trace.checkState(((Allocation) realStrongMemoryCache$cache$13.map) == null);
        realStrongMemoryCache$cache$13.maxSize = 0L;
        realStrongMemoryCache$cache$13.size = i;
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$14 = sampleDataQueue.firstAllocationNode;
        sampleDataQueue.readAllocationNode = realStrongMemoryCache$cache$14;
        sampleDataQueue.writeAllocationNode = realStrongMemoryCache$cache$14;
        sampleDataQueue.totalBytesWritten = 0L;
        synchronized (anonymousClass3) {
            ((DefaultLoadControl) anonymousClass3.this$0).allocator.trim();
        }
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.readEndTimeAbsoluteIndex = -1;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        HuffmanTreeGroup huffmanTreeGroup = this.sharedSampleMetadata;
        SparseArray sparseArray = (SparseArray) huffmanTreeGroup.codes;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((Id3Peeker$$ExternalSyntheticBUOutline0) huffmanTreeGroup.trees).accept(sparseArray.valueAt(i2));
        }
        huffmanTreeGroup.alphabetSize = -1;
        sparseArray.clear();
        if (z) {
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
            this.discardAllSamplesToStartTime = true;
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        while (true) {
            SampleDataQueue sampleDataQueue = this.sampleDataQueue;
            if (i <= 0) {
                sampleDataQueue.getClass();
                return;
            }
            int preAppend = sampleDataQueue.preAppend(i);
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = sampleDataQueue.writeAllocationNode;
            Allocation allocation = (Allocation) realStrongMemoryCache$cache$1.map;
            parsableByteArray.readBytes(((int) (sampleDataQueue.totalBytesWritten - realStrongMemoryCache$cache$1.maxSize)) + allocation.offset, preAppend, allocation.data);
            i -= preAppend;
            long j = sampleDataQueue.totalBytesWritten + preAppend;
            sampleDataQueue.totalBytesWritten = j;
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = sampleDataQueue.writeAllocationNode;
            if (j == realStrongMemoryCache$cache$12.size) {
                sampleDataQueue.writeAllocationNode = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$12.this$0;
            }
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData$1(DataReader dataReader, int i, boolean z) {
        SampleDataQueue sampleDataQueue = this.sampleDataQueue;
        int preAppend = sampleDataQueue.preAppend(i);
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = sampleDataQueue.writeAllocationNode;
        Allocation allocation = (Allocation) realStrongMemoryCache$cache$1.map;
        int read = dataReader.read(allocation.data, ((int) (sampleDataQueue.totalBytesWritten - realStrongMemoryCache$cache$1.maxSize)) + allocation.offset, preAppend);
        if (read == -1) {
            if (z) {
                return -1;
            }
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
        long j = sampleDataQueue.totalBytesWritten + read;
        sampleDataQueue.totalBytesWritten = j;
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = sampleDataQueue.writeAllocationNode;
        if (j == realStrongMemoryCache$cache$12.size) {
            sampleDataQueue.writeAllocationNode = (RealStrongMemoryCache$cache$1) realStrongMemoryCache$cache$12.this$0;
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        if (((androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) r10.valueAt(r10.size() - 1)).f884format.equals(r9.upstreamFormat) == false) goto L50;
     */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        int i4 = i & 1;
        boolean z = i4 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        if (this.discardAllSamplesToStartTime) {
            if (j < this.startTimeUs) {
                return;
            }
            if (i4 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.upstreamFormat);
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.sampleDataQueue.totalBytesWritten - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.length;
                if (i5 > 0) {
                    int relativeIndex = getRelativeIndex(i5 - 1);
                    Trace.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j2);
                }
                this.isLastSampleQueued = (536870912 & i) != 0;
                this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j);
                long j3 = this.readEndTimeUs;
                if (j3 != Long.MIN_VALUE && this.readEndTimeAbsoluteIndex == -1 && j >= j3) {
                    this.readEndTimeAbsoluteIndex = this.absoluteFirstIndex + this.length;
                }
                int relativeIndex2 = getRelativeIndex(this.length);
                this.timesUs[relativeIndex2] = j;
                this.offsets[relativeIndex2] = j2;
                this.sizes[relativeIndex2] = i2;
                this.flags[relativeIndex2] = i;
                this.cryptoDatas[relativeIndex2] = cryptoData;
                this.sourceIds[relativeIndex2] = 0;
                if (!(((SparseArray) this.sharedSampleMetadata.codes).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.sharedSampleMetadata.codes;
                }
                Format format2 = this.upstreamFormat;
                format2.getClass();
                DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0 drmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0 = this.drmSessionManager != null ? DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0.EMPTY : DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0.EMPTY;
                HuffmanTreeGroup huffmanTreeGroup = this.sharedSampleMetadata;
                int i6 = this.absoluteFirstIndex + this.length;
                SharedSampleMetadata sharedSampleMetadata = new SharedSampleMetadata(format2, drmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0);
                SparseArray sparseArray2 = (SparseArray) huffmanTreeGroup.codes;
                if (huffmanTreeGroup.alphabetSize == -1) {
                    Trace.checkState(sparseArray2.size() == 0);
                    huffmanTreeGroup.alphabetSize = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    Trace.checkArgument(i6 >= keyAt);
                    if (keyAt == i6) {
                        ((Id3Peeker$$ExternalSyntheticBUOutline0) huffmanTreeGroup.trees).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, sharedSampleMetadata);
                int i7 = this.length + 1;
                this.length = i7;
                int i8 = this.capacity;
                if (i7 == i8) {
                    int i9 = i8 + IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i9];
                    int i10 = this.relativeFirstIndex;
                    int i11 = i8 - i10;
                    System.arraycopy(this.offsets, i10, jArr2, 0, i11);
                    System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i11);
                    System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i11);
                    System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i11);
                    System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i11);
                    System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i11);
                    int i12 = this.relativeFirstIndex;
                    System.arraycopy(this.offsets, 0, jArr2, i11, i12);
                    System.arraycopy(this.timesUs, 0, jArr3, i11, i12);
                    System.arraycopy(this.flags, 0, iArr, i11, i12);
                    System.arraycopy(this.sizes, 0, iArr2, i11, i12);
                    System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i11, i12);
                    System.arraycopy(this.sourceIds, 0, jArr, i11, i12);
                    this.offsets = jArr2;
                    this.timesUs = jArr3;
                    this.flags = iArr;
                    this.sizes = iArr2;
                    this.cryptoDatas = cryptoDataArr;
                    this.sourceIds = jArr;
                    this.relativeFirstIndex = 0;
                    this.capacity = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        Throwable th;
        SampleQueue sampleQueue;
        SampleQueue sampleQueue2;
        long j2;
        int findSampleBefore;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.readPosition = 0;
                                SampleDataQueue sampleDataQueue = this.sampleDataQueue;
                                sampleDataQueue.readAllocationNode = sampleDataQueue.firstAllocationNode;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    sampleQueue = this;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sampleQueue = this;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        sampleQueue = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int relativeIndex = getRelativeIndex(0);
            long j3 = this.readEndTimeUs;
            long j4 = this.largestQueuedTimestampUs;
            if (j3 != Long.MIN_VALUE) {
                try {
                    j4 = Math.min(j4, j3);
                } catch (Throwable th8) {
                    th = th8;
                    sampleQueue = this;
                    throw th;
                }
            }
            int i = this.readPosition;
            int i2 = this.length;
            if (!(i != i2) || j < this.timesUs[relativeIndex] || (j > j4 && !z)) {
                return false;
            }
            if (this.discardAllSamplesToStartTime) {
                sampleQueue2 = this;
                j2 = j;
                findSampleBefore = sampleQueue2.findSampleAfter(relativeIndex, i2 - i, j2, z);
            } else {
                sampleQueue2 = this;
                j2 = j;
                findSampleBefore = sampleQueue2.findSampleBefore(relativeIndex, i2 - i, j2, true);
            }
            if (findSampleBefore == -1) {
                return false;
            }
            sampleQueue2.startTimeUs = j2;
            sampleQueue2.readPosition += findSampleBefore;
            return true;
        } catch (Throwable th9) {
            th = th9;
            sampleQueue = this;
            th = th;
            throw th;
        }
    }
}
