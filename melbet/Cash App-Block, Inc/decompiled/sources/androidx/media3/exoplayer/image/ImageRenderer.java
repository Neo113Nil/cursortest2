package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.Format;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda4;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.tracing.Trace;
import coil3.svg.internal.AndroidSvg;
import com.datadog.trace.core.util.SimpleRateLimiter;
import com.google.android.gms.time.zzc;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ImageRenderer extends BaseRenderer {
    public boolean codecNeedsInitialization;
    public int currentTileIndex;
    public BitmapFactoryImageDecoder decoder;
    public final zzc decoderFactory;
    public int decoderReinitializationState;
    public int firstFrameState;
    public final DecoderInputBuffer flagsOnlyBuffer;
    public ExoPlayerImplInternal$$ExternalSyntheticLambda4 imageMetadataListener;
    public ImageOutput imageOutput;
    public DecoderInputBuffer inputBuffer;
    public Format inputFormat;
    public boolean inputStreamEnded;
    public long largestQueuedPresentationTimeUs;
    public long lastProcessedOutputBufferTimeUs;
    public SimpleRateLimiter nextTileInfo;
    public Bitmap outputBitmap;
    public boolean outputStreamEnded;
    public OutputStreamInfo outputStreamInfo;
    public final ArrayDeque pendingOutputStreamChanges;
    public boolean readyToOutputTiles;
    public SimpleRateLimiter tileInfo;

    public final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L);
        public final long previousStreamLastBufferTimeUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j2) {
            this.previousStreamLastBufferTimeUs = j;
            this.streamOffsetUs = j2;
        }
    }

    public ImageRenderer(zzc zzcVar) {
        super(4);
        this.decoderFactory = zzcVar;
        this.imageOutput = ImageOutput.NO_OP;
        this.flagsOnlyBuffer = new DecoderInputBuffer(0);
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque();
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.decoderReinitializationState = 0;
        this.firstFrameState = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        if (r14 == ((r0 * r1.tileCountHorizontal) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drainOutput(long j) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.outputBitmap;
        if ((bitmap2 == null || this.tileInfo != null) && (this.firstFrameState != 0 || this.state == 2)) {
            ArrayDeque arrayDeque = this.pendingOutputStreamChanges;
            if (bitmap2 == null) {
                this.decoder.getClass();
                BitmapFactoryImageDecoder.AnonymousClass1 anonymousClass1 = (BitmapFactoryImageDecoder.AnonymousClass1) this.decoder.dequeueOutputBuffer();
                if (anonymousClass1 != null) {
                    if (!anonymousClass1.getFlag(4)) {
                        Trace.checkNotNull(anonymousClass1.bitmap, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.outputBitmap = anonymousClass1.bitmap;
                        anonymousClass1.release();
                    } else {
                        if (this.decoderReinitializationState == 3) {
                            releaseDecoderResources();
                            this.inputFormat.getClass();
                            maybeInitCodec();
                            return false;
                        }
                        anonymousClass1.release();
                        if (arrayDeque.isEmpty()) {
                            this.outputStreamEnded = true;
                            return false;
                        }
                    }
                }
            }
            if (this.readyToOutputTiles && this.outputBitmap != null && this.tileInfo != null) {
                this.inputFormat.getClass();
                Format format2 = this.inputFormat;
                int i = format2.tileCountHorizontal;
                int i2 = format2.tileCountVertical;
                boolean z = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                SimpleRateLimiter simpleRateLimiter = this.tileInfo;
                if (((Bitmap) simpleRateLimiter.secondsAndCount) == null) {
                    if (z) {
                        int i3 = simpleRateLimiter.capacity;
                        this.outputBitmap.getClass();
                        int width = this.outputBitmap.getWidth();
                        Format format3 = this.inputFormat;
                        format3.getClass();
                        int i4 = width / format3.tileCountHorizontal;
                        int height = this.outputBitmap.getHeight();
                        Format format4 = this.inputFormat;
                        format4.getClass();
                        int i5 = height / format4.tileCountVertical;
                        int i6 = this.inputFormat.tileCountHorizontal;
                        bitmap = Bitmap.createBitmap(this.outputBitmap, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.outputBitmap;
                        bitmap.getClass();
                    }
                    simpleRateLimiter.secondsAndCount = bitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.tileInfo.secondsAndCount;
                bitmap3.getClass();
                long j2 = this.tileInfo.startNanos;
                long j3 = j2 - j;
                boolean z2 = this.state == 2;
                int i7 = this.firstFrameState;
                if (i7 != 0) {
                    if (i7 == 1) {
                        z2 = true;
                    } else {
                        if (i7 != 3) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2 || j3 < 30000) {
                    ExoPlayerImplInternal$$ExternalSyntheticLambda4 exoPlayerImplInternal$$ExternalSyntheticLambda4 = this.imageMetadataListener;
                    if (exoPlayerImplInternal$$ExternalSyntheticLambda4 != null) {
                        long j4 = this.outputStreamInfo.streamOffsetUs;
                        this.inputFormat.getClass();
                        ExoPlayerImplInternal exoPlayerImplInternal = exoPlayerImplInternal$$ExternalSyntheticLambda4.f$0;
                        if (exoPlayerImplInternal.seekIsPendingWhileScrubbing) {
                            exoPlayerImplInternal.handler.obtainMessage(37).sendToTarget();
                        }
                    }
                    this.imageOutput.onImageAvailable(j2 - this.outputStreamInfo.streamOffsetUs, bitmap3);
                    SimpleRateLimiter simpleRateLimiter2 = this.tileInfo;
                    simpleRateLimiter2.getClass();
                    long j5 = simpleRateLimiter2.startNanos;
                    this.lastProcessedOutputBufferTimeUs = j5;
                    while (!arrayDeque.isEmpty() && j5 >= ((OutputStreamInfo) arrayDeque.peek()).previousStreamLastBufferTimeUs) {
                        this.outputStreamInfo = (OutputStreamInfo) arrayDeque.removeFirst();
                    }
                    this.firstFrameState = 3;
                    if (z) {
                        SimpleRateLimiter simpleRateLimiter3 = this.tileInfo;
                        simpleRateLimiter3.getClass();
                        int i8 = simpleRateLimiter3.capacity;
                        Format format5 = this.inputFormat;
                        format5.getClass();
                        int i9 = format5.tileCountVertical;
                        Format format6 = this.inputFormat;
                        format6.getClass();
                    }
                    this.outputBitmap = null;
                    this.tileInfo = this.nextTileInfo;
                    this.nextTileInfo = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010a, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean feedInputBuffer(long j) {
        boolean z;
        DecoderInputBuffer decoderInputBuffer;
        Format format2;
        int i;
        DecoderInputBuffer decoderInputBuffer2;
        if (!this.readyToOutputTiles || this.tileInfo == null) {
            AndroidSvg androidSvg = this.formatHolder;
            androidSvg.clear();
            BitmapFactoryImageDecoder bitmapFactoryImageDecoder = this.decoder;
            if (bitmapFactoryImageDecoder != null && this.decoderReinitializationState != 3 && !this.inputStreamEnded) {
                if (this.inputBuffer == null) {
                    DecoderInputBuffer decoderInputBuffer3 = (DecoderInputBuffer) bitmapFactoryImageDecoder.dequeueInputBuffer();
                    this.inputBuffer = decoderInputBuffer3;
                }
                int i2 = this.decoderReinitializationState;
                DecoderInputBuffer decoderInputBuffer4 = this.inputBuffer;
                if (i2 == 2) {
                    decoderInputBuffer4.getClass();
                    this.inputBuffer.flags = 4;
                    BitmapFactoryImageDecoder bitmapFactoryImageDecoder2 = this.decoder;
                    bitmapFactoryImageDecoder2.getClass();
                    bitmapFactoryImageDecoder2.queueInputBuffer(this.inputBuffer);
                    this.inputBuffer = null;
                    this.decoderReinitializationState = 3;
                    return false;
                }
                int readSource = readSource(androidSvg, decoderInputBuffer4, 0);
                if (readSource == -5) {
                    Format format3 = (Format) androidSvg.renderOptions;
                    format3.getClass();
                    this.inputFormat = format3;
                    this.codecNeedsInitialization = true;
                    this.decoderReinitializationState = 2;
                    return true;
                }
                if (readSource == -4) {
                    this.inputBuffer.flip();
                    ByteBuffer byteBuffer = this.inputBuffer.data;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        DecoderInputBuffer decoderInputBuffer5 = this.inputBuffer;
                        decoderInputBuffer5.getClass();
                        if (!decoderInputBuffer5.getFlag(4)) {
                            z = false;
                            if (z) {
                                DecoderInputBuffer decoderInputBuffer6 = this.inputBuffer;
                                decoderInputBuffer6.getClass();
                                decoderInputBuffer6.f875format = this.inputFormat;
                                BitmapFactoryImageDecoder bitmapFactoryImageDecoder3 = this.decoder;
                                bitmapFactoryImageDecoder3.getClass();
                                DecoderInputBuffer decoderInputBuffer7 = this.inputBuffer;
                                decoderInputBuffer7.getClass();
                                bitmapFactoryImageDecoder3.queueInputBuffer(decoderInputBuffer7);
                                this.currentTileIndex = 0;
                            }
                            decoderInputBuffer = this.inputBuffer;
                            decoderInputBuffer.getClass();
                            if (decoderInputBuffer.getFlag(4)) {
                                int i3 = this.currentTileIndex;
                                long j2 = decoderInputBuffer.timeUs;
                                SimpleRateLimiter simpleRateLimiter = new SimpleRateLimiter();
                                simpleRateLimiter.capacity = i3;
                                simpleRateLimiter.startNanos = j2;
                                this.nextTileInfo = simpleRateLimiter;
                                this.currentTileIndex = i3 + 1;
                                if (!this.readyToOutputTiles) {
                                    boolean z2 = j2 - 30000 <= j && j <= 30000 + j2;
                                    SimpleRateLimiter simpleRateLimiter2 = this.tileInfo;
                                    boolean z3 = simpleRateLimiter2 != null && simpleRateLimiter2.startNanos <= j && j < j2;
                                    Format format4 = this.inputFormat;
                                    format4.getClass();
                                    this.readyToOutputTiles = z2 || z3 || (format4.tileCountHorizontal == -1 || (i = (format2 = this.inputFormat).tileCountVertical) == -1 || i3 == (i * format2.tileCountHorizontal) - 1);
                                    if (z3) {
                                    }
                                }
                                this.tileInfo = this.nextTileInfo;
                                this.nextTileInfo = null;
                            } else {
                                this.readyToOutputTiles = true;
                            }
                            decoderInputBuffer2 = this.inputBuffer;
                            decoderInputBuffer2.getClass();
                            if (!decoderInputBuffer2.getFlag(4)) {
                                this.inputStreamEnded = true;
                                this.inputBuffer = null;
                                return false;
                            }
                            long j3 = this.largestQueuedPresentationTimeUs;
                            DecoderInputBuffer decoderInputBuffer8 = this.inputBuffer;
                            decoderInputBuffer8.getClass();
                            this.largestQueuedPresentationTimeUs = Math.max(j3, decoderInputBuffer8.timeUs);
                            if (z) {
                                this.inputBuffer = null;
                            } else {
                                DecoderInputBuffer decoderInputBuffer9 = this.inputBuffer;
                                decoderInputBuffer9.getClass();
                                decoderInputBuffer9.clear();
                            }
                            return !this.readyToOutputTiles;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    decoderInputBuffer = this.inputBuffer;
                    decoderInputBuffer.getClass();
                    if (decoderInputBuffer.getFlag(4)) {
                    }
                    decoderInputBuffer2 = this.inputBuffer;
                    decoderInputBuffer2.getClass();
                    if (!decoderInputBuffer2.getFlag(4)) {
                    }
                } else if (readSource != -3) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return false;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.imageMetadataListener = (ExoPlayerImplInternal$$ExternalSyntheticLambda4) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.NO_OP;
            }
            this.imageOutput = imageOutput;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isReady() {
        int i = this.firstFrameState;
        if (i != 3) {
            return i == 0 && this.readyToOutputTiles;
        }
        return true;
    }

    public final void maybeInitCodec() {
        if (this.codecNeedsInitialization) {
            Format format2 = this.inputFormat;
            format2.getClass();
            zzc zzcVar = this.decoderFactory;
            zzcVar.getClass();
            int supportsFormat = zzc.supportsFormat(format2);
            if (supportsFormat != BaseRenderer.create(4, 0, 0, 0) && supportsFormat != BaseRenderer.create(3, 0, 0, 0)) {
                throw createRendererException(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.inputFormat, false, 4005);
            }
            BitmapFactoryImageDecoder bitmapFactoryImageDecoder = this.decoder;
            if (bitmapFactoryImageDecoder != null) {
                bitmapFactoryImageDecoder.release();
            }
            this.decoder = new BitmapFactoryImageDecoder(zzcVar.zza);
            this.codecNeedsInitialization = false;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges.clear();
        releaseDecoderResources();
        this.imageOutput.onDisabled();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onEnabled(boolean z, boolean z2) {
        this.firstFrameState = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onPositionReset(long j, boolean z, boolean z2) {
        this.firstFrameState = Math.min(this.firstFrameState, 1);
        this.outputStreamEnded = false;
        this.inputStreamEnded = false;
        this.outputBitmap = null;
        this.tileInfo = null;
        this.nextTileInfo = null;
        this.readyToOutputTiles = false;
        this.inputBuffer = null;
        BitmapFactoryImageDecoder bitmapFactoryImageDecoder = this.decoder;
        if (bitmapFactoryImageDecoder != null) {
            bitmapFactoryImageDecoder.flush();
        }
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onRelease() {
        releaseDecoderResources();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onReset() {
        releaseDecoderResources();
        this.firstFrameState = Math.min(this.firstFrameState, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        if (this.outputStreamInfo.streamOffsetUs != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.pendingOutputStreamChanges;
            if (arrayDeque.isEmpty()) {
                long j3 = this.largestQueuedPresentationTimeUs;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.lastProcessedOutputBufferTimeUs;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j2));
            return;
        }
        this.outputStreamInfo = new OutputStreamInfo(-9223372036854775807L, j2);
    }

    public final void releaseDecoderResources() {
        this.inputBuffer = null;
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        BitmapFactoryImageDecoder bitmapFactoryImageDecoder = this.decoder;
        if (bitmapFactoryImageDecoder != null) {
            bitmapFactoryImageDecoder.release();
            this.decoder = null;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void render(long j, long j2) {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            AndroidSvg androidSvg = this.formatHolder;
            androidSvg.clear();
            DecoderInputBuffer decoderInputBuffer = this.flagsOnlyBuffer;
            decoderInputBuffer.clear();
            int readSource = readSource(androidSvg, decoderInputBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    Trace.checkState(decoderInputBuffer.getFlag(4));
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            Format format2 = (Format) androidSvg.renderOptions;
            format2.getClass();
            this.inputFormat = format2;
            this.codecNeedsInitialization = true;
        }
        if (this.decoder == null) {
            maybeInitCodec();
        }
        try {
            android.os.Trace.beginSection("drainAndFeedDecoder");
            while (drainOutput(j)) {
            }
            while (feedInputBuffer(j)) {
            }
            android.os.Trace.endSection();
        } catch (ImageDecoderException e) {
            throw createRendererException(e, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final int supportsFormat(Format format2) {
        this.decoderFactory.getClass();
        return zzc.supportsFormat(format2);
    }
}
