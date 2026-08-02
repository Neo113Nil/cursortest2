package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda11;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.container.ObuParser$FrameHeader;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import androidx.media3.container.ObuParser$Obu;
import androidx.media3.container.ObuParser$SequenceHeader;
import androidx.media3.container.OpusUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.ScrubbingModeParameters;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.paging.PagingConfig;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.svg.internal.AndroidSvg;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpe;
import com.google.android.play.core.appupdate.zzi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.EocdRecord;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MediaCodecVideoRenderer extends MediaCodecRenderer {
    public static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean deviceNeedsSetOutputSurfaceWorkaround;
    public static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    public final AndroidSvg av1SampleDependencyParser;
    public int buffersInCodecCount;
    public int changeFrameRateStrategy;
    public boolean codecHandlesHdr10PlusOutOfBandMetadata;
    public PagingConfig codecMaxValues;
    public boolean codecNeedsSetOutputSurfaceWorkaround;
    public int consecutiveDroppedFrameCount;
    public int consecutiveDroppedInputBufferCount;
    public final Context context;
    public VideoSize decodedVideoSize;
    public final boolean deviceNeedsNoPostProcessWorkaround;
    public Surface displaySurface;
    public final PriorityQueue droppedDecoderInputBufferTimestamps;
    public long droppedFrameAccumulationStartTimeMs;
    public int droppedFrames;
    public final AndroidSvg eventDispatcher;
    public VideoFrameMetadataListener frameMetadataListener;
    public boolean hasSetVideoSink;
    public boolean haveReportedFirstFrameRenderedForCurrentSurface;
    public boolean isFlushRequired;
    public long lastFrameReleaseTimeNs;
    public long lastResetToKeyFramePositionUs;
    public final int maxDroppedFramesToNotify;
    public final long minEarlyUsToDropDecoderInput;
    public int nextVideoSinkFirstFrameReleaseInstruction;
    public Size outputResolution;
    public final boolean ownsVideoSink;
    public boolean pendingVideoSinkInputStreamChange;
    public long periodDurationUs;
    public PlaceholderSurface placeholderSurface;
    public int rendererPriority;
    public VideoSize reportedVideoSize;
    public int scalingMode;
    public ScrubbingModeParameters scrubbingModeParameters;
    public long startPositionUs;
    public long totalVideoFrameProcessingOffsetUs;
    public boolean tunneling;
    public int tunnelingAudioSessionId;
    public OnFrameRenderedListener tunnelingOnFrameRenderedListener;
    public List videoEffects;
    public int videoFrameProcessingOffsetCount;
    public final VideoFrameReleaseControl videoFrameReleaseControl;
    public final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    public final EocdRecord videoFrameReleaseInfo;
    public VideoSink videoSink;

    /* renamed from: androidx.media3.exoplayer.video.MediaCodecVideoRenderer$2, reason: invalid class name */
    public final class AnonymousClass2 {
        public final /* synthetic */ int val$bufferIndex;
        public final /* synthetic */ MediaCodecAdapter val$codec;

        public AnonymousClass2(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
            this.val$codec = mediaCodecAdapter;
            this.val$bufferIndex = i;
        }
    }

    public final class Builder {
        public long allowedJoiningTimeMs;
        public boolean buildCalled;
        public MediaCodecAdapter.Factory codecAdapterFactory;
        public final Context context;
        public Handler eventHandler;
        public ExoPlayerImpl.ComponentListener eventListener;
        public int maxDroppedFramesToNotify;

        public Builder(Context context) {
            this.context = context;
            this.codecAdapterFactory = new zzi(context, 1);
        }
    }

    public final class OnFrameRenderedListener implements Handler.Callback {
        public final Handler handler;

        public OnFrameRenderedListener(MediaCodecAdapter mediaCodecAdapter) {
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        public final void handleFrameRendered(long j) {
            Surface surface;
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            AndroidSvg androidSvg = mediaCodecVideoRenderer.eventDispatcher;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener || mediaCodecVideoRenderer.codec == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.pendingOutputEndOfStream = true;
                return;
            }
            try {
                mediaCodecVideoRenderer.updateOutputFormatForTime(j);
                VideoSize videoSize = mediaCodecVideoRenderer.decodedVideoSize;
                if (!videoSize.equals(VideoSize.UNKNOWN) && !videoSize.equals(mediaCodecVideoRenderer.reportedVideoSize)) {
                    mediaCodecVideoRenderer.reportedVideoSize = videoSize;
                    androidSvg.videoSizeChanged(videoSize);
                }
                mediaCodecVideoRenderer.decoderCounters.renderedOutputBufferCount++;
                VideoFrameReleaseControl videoFrameReleaseControl = mediaCodecVideoRenderer.videoFrameReleaseControl;
                boolean z = videoFrameReleaseControl.firstFrameState != 3;
                videoFrameReleaseControl.firstFrameState = 3;
                videoFrameReleaseControl.clock.getClass();
                videoFrameReleaseControl.lastReleaseRealtimeUs = Util.msToUs(SystemClock.elapsedRealtime());
                if (z && (surface = mediaCodecVideoRenderer.displaySurface) != null) {
                    Handler handler = (Handler) androidSvg.svg;
                    if (handler != null) {
                        handler.post(new CameraCallbackMap$$ExternalSyntheticLambda11(androidSvg, surface, SystemClock.elapsedRealtime(), 2));
                    }
                    mediaCodecVideoRenderer.haveReportedFirstFrameRenderedForCurrentSurface = true;
                }
                mediaCodecVideoRenderer.onProcessedOutputBuffer$1(j);
            } catch (ExoPlaybackException e) {
                mediaCodecVideoRenderer.pendingPlaybackException = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            String str = Util.DEVICE_DEBUG_INFO;
            handleFrameRendered(((i & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & i2));
            return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecVideoRenderer(Builder builder) {
        super(r0.getApplicationContext(), 2, builder.codecAdapterFactory, 30.0f);
        Context context = builder.context;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = builder.maxDroppedFramesToNotify;
        this.videoSink = null;
        this.eventDispatcher = new AndroidSvg(builder.eventHandler, builder.eventListener);
        this.ownsVideoSink = this.videoSink == null;
        this.videoFrameReleaseControl = new VideoFrameReleaseControl(applicationContext, this, builder.allowedJoiningTimeMs);
        this.videoFrameReleaseInfo = new EocdRecord();
        this.deviceNeedsNoPostProcessWorkaround = "NVIDIA".equals(Build.MANUFACTURER);
        this.outputResolution = Size.UNKNOWN;
        this.scalingMode = 1;
        this.changeFrameRateStrategy = 0;
        this.decodedVideoSize = VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.startPositionUs = -9223372036854775807L;
        this.periodDurationUs = -9223372036854775807L;
        this.av1SampleDependencyParser = new AndroidSvg(3);
        this.droppedDecoderInputBufferTimestamps = new PriorityQueue();
        this.minEarlyUsToDropDecoderInput = -15000L;
        this.videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster();
        this.scrubbingModeParameters = null;
    }

    public static boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    String str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2) {
                        case "AFTJMST12":
                        case "AFTKMST12":
                        case "AFTA":
                        case "AFTN":
                        case "AFTR":
                        case "AFTEU011":
                        case "AFTEU014":
                        case "AFTSO001":
                        case "AFTEUFF014":
                            z = true;
                            break;
                    }
                    deviceNeedsSetOutputSurfaceWorkaround = z;
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0089, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCodecMaxInputSize$1(MediaCodecInfo mediaCodecInfo, Format format2) {
        int i = format2.width;
        int i2 = format2.height;
        if (i != -1 && i2 != -1) {
            String str = format2.sampleMimeType;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel != null) {
                    int intValue = ((Integer) codecProfileAndLevel.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(PKIFailureInfo.badSenderNonce, ((i * i2) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mediaCodecInfo.secure)))) {
                        return ((Util.ceilDivide(i2, 16) * Util.ceilDivide(i, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List getDecoderInfos(Context context, LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2, boolean z, boolean z2) {
        String str = format2.sampleMimeType;
        if (str == null) {
            return RegularImmutableList.EMPTY;
        }
        if ("video/dolby-vision".equals(str) && !zzpe.doesDisplaySupportDolbyVision(context)) {
            String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format2);
            List decoderInfos = alternativeCodecMimeType == null ? RegularImmutableList.EMPTY : loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0.getDecoderInfos(alternativeCodecMimeType, z, z2);
            if (!decoderInfos.isEmpty()) {
                return decoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, z, z2);
    }

    public static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format2) {
        int i = format2.maxInputSize;
        List list = format2.initializationData;
        if (i == -1) {
            return getCodecMaxInputSize$1(mediaCodecInfo, format2);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return format2.maxInputSize + i2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format2, Format format3, boolean z) {
        int i;
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format2, format3);
        float f = format2.frameRate;
        float f2 = format3.frameRate;
        int i2 = canReuseCodec.discardReasons;
        PagingConfig pagingConfig = this.codecMaxValues;
        pagingConfig.getClass();
        if (format3.width > pagingConfig.pageSize || format3.height > pagingConfig.prefetchDistance) {
            i2 |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format3) > pagingConfig.initialLoadSize) {
            i2 |= 64;
        }
        if (this.changeFrameRateStrategy != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!mediaCodecInfo.secure || !z))) {
            if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r10)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format3, i3 != 0 ? 0 : canReuseCodec.result, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException createDecoderException(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        Surface surface = this.displaySurface;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, mediaCodecInfo);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void enableMayRenderStartOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null) {
            VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
            if (videoFrameReleaseControl.firstFrameState == 0) {
                videoFrameReleaseControl.firstFrameState = 1;
                return;
            }
            return;
        }
        int i = this.nextVideoSinkFirstFrameReleaseInstruction;
        if (i == 0 || i == 1) {
            this.nextVideoSinkFirstFrameReleaseInstruction = 0;
        } else {
            videoSink.allowReleaseFirstFrameBeforeStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.scrubbingModeParameters == null && !this.tunneling) || decoderInputBuffer.timeUs >= this.lastResetPositionUs || isBufferProbablyLastSample(decoderInputBuffer)) ? 0 : 32;
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float getCodecOperatingRateV23(float f, Format format2, Format[] formatArr) {
        MediaCodecInfo mediaCodecInfo;
        float f2 = -1.0f;
        for (Format format3 : formatArr) {
            float f3 = format3.frameRate;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.scrubbingModeParameters == null || (mediaCodecInfo = this.codecInfo) == null) {
            return f4;
        }
        int i = format2.width;
        int i2 = format2.height;
        float f5 = -3.4028235E38f;
        if (mediaCodecInfo.isVideo) {
            float f6 = mediaCodecInfo.maxFrameRate;
            if (f6 != -3.4028235E38f && mediaCodecInfo.maxFrameRateWidth == i && mediaCodecInfo.maxFrameRateHeight == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!mediaCodecInfo.isVideoSizeAndRateSupportedV21(1024.0d, i, i2)) {
                    float f7 = RecyclerView.DECELERATION_RATE;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(f9, i, i2)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                mediaCodecInfo.maxFrameRate = f5;
                mediaCodecInfo.maxFrameRateWidth = i;
                mediaCodecInfo.maxFrameRateHeight = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final e0 getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format2, MediaCrypto mediaCrypto, float f) {
        ColorInfo colorInfo;
        int i;
        PagingConfig pagingConfig;
        Point point;
        int i2;
        int i3;
        char c;
        boolean z;
        Pair codecProfileAndLevel;
        int codecMaxInputSize$1;
        String str = mediaCodecInfo.codecMimeType;
        Format[] formatArr = this.streamFormats;
        formatArr.getClass();
        int i4 = format2.width;
        float f2 = format2.frameRate;
        ColorInfo colorInfo2 = format2.colorInfo;
        int i5 = format2.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format2);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize$1 = getCodecMaxInputSize$1(mediaCodecInfo, format2)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * 1.5f), codecMaxInputSize$1);
            }
            pagingConfig = new PagingConfig(i4, i5, maxInputSize);
            colorInfo = colorInfo2;
            i = i5;
        } else {
            int length = formatArr.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                Format format3 = formatArr[i8];
                Format[] formatArr2 = formatArr;
                if (colorInfo2 != null && format3.colorInfo == null) {
                    Format.Builder buildUpon = format3.buildUpon();
                    buildUpon.colorInfo = colorInfo2;
                    format3 = new Format(buildUpon);
                }
                DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format2, format3);
                int i9 = length;
                int i10 = format3.height;
                if (canReuseCodec.result != 0) {
                    int i11 = format3.width;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format3));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                formatArr = formatArr2;
            }
            if (z2) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                boolean z4 = z3;
                int i13 = z3 ? i4 : i5;
                float f3 = i13 / i12;
                int i14 = 0;
                while (true) {
                    colorInfo = colorInfo2;
                    if (i14 >= 9) {
                        break;
                    }
                    int i15 = STANDARD_LONG_EDGE_VIDEO_PX[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (!z4) {
                        i17 = i15;
                    }
                    if (!z4) {
                        i15 = i17;
                    }
                    int i18 = i13;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.capabilities.getVideoCapabilities();
                    if (videoCapabilities == null) {
                        i2 = i12;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i12;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(Util.ceilDivide(i17, widthAlignment) * widthAlignment, Util.ceilDivide(i15, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i5;
                        if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(f2, point.x, point.y)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    colorInfo2 = colorInfo;
                    i13 = i18;
                    i12 = i2;
                }
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    Format.Builder buildUpon2 = format2.buildUpon();
                    buildUpon2.width = i6;
                    buildUpon2.height = i7;
                    maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize$1(mediaCodecInfo, new Format(buildUpon2)));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            } else {
                colorInfo = colorInfo2;
                i = i5;
            }
            pagingConfig = new PagingConfig(i6, i7, maxInputSize);
        }
        this.codecMaxValues = pagingConfig;
        int i19 = this.tunneling ? this.tunnelingAudioSessionId : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i);
        Log.setCsdBuffers(mediaFormat, format2.initializationData);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        Log.maybeSetInteger(mediaFormat, "rotation-degrees", format2.rotationDegrees);
        if (colorInfo != null) {
            ColorInfo colorInfo3 = colorInfo;
            Log.maybeSetInteger(mediaFormat, "color-transfer", colorInfo3.colorTransfer);
            Log.maybeSetInteger(mediaFormat, "color-standard", colorInfo3.colorSpace);
            Log.maybeSetInteger(mediaFormat, "color-range", colorInfo3.colorRange);
            byte[] bArr = colorInfo3.hdrStaticInfo;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format2.sampleMimeType) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2)) != null) {
            Log.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", pagingConfig.pageSize);
        mediaFormat.setInteger("max-height", pagingConfig.prefetchDistance);
        Log.maybeSetInteger(mediaFormat, "max-input-size", pagingConfig.initialLoadSize);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.deviceNeedsNoPostProcessWorkaround) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        applyCodecParametersToMediaFormat(mediaFormat);
        Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
        if (this.videoSink != null && !Util.isFrameDropAllowedOnSurfaceInput(this.context)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new e0(mediaCodecInfo, mediaFormat, format2, surfaceForCodec, mediaCrypto, (Object) null, 9);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface getSurfaceForCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        boolean z;
        PlaceholderSurface.PlaceholderSurfaceThread placeholderSurfaceThread;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.getInputSurface();
        }
        Surface surface = this.displaySurface;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.detachedSurfaceSupported) {
            return null;
        }
        Trace.checkState(shouldUsePlaceholderSurface(mediaCodecInfo));
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure && placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
        if (this.placeholderSurface == null) {
            boolean z2 = mediaCodecInfo.secure;
            boolean z3 = false;
            if (!z2) {
                int i = PlaceholderSurface.secureMode;
            } else if (!PlaceholderSurface.isSecureSupported()) {
                z = false;
                Trace.checkState(z);
                placeholderSurfaceThread = new PlaceholderSurface.PlaceholderSurfaceThread("ExoPlayer:PlaceholderSurface");
                int i2 = !z2 ? PlaceholderSurface.secureMode : 0;
                placeholderSurfaceThread.start();
                Handler handler = new Handler(placeholderSurfaceThread.getLooper(), placeholderSurfaceThread);
                placeholderSurfaceThread.handler = handler;
                placeholderSurfaceThread.eglSurfaceTexture = new EGLSurfaceTexture(handler);
                synchronized (placeholderSurfaceThread) {
                    placeholderSurfaceThread.handler.obtainMessage(1, i2, 0).sendToTarget();
                    while (placeholderSurfaceThread.surface == null && placeholderSurfaceThread.initException == null && placeholderSurfaceThread.initError == null) {
                        try {
                            placeholderSurfaceThread.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = placeholderSurfaceThread.initException;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = placeholderSurfaceThread.initError;
                if (error != null) {
                    throw error;
                }
                PlaceholderSurface placeholderSurface2 = placeholderSurfaceThread.surface;
                placeholderSurface2.getClass();
                this.placeholderSurface = placeholderSurface2;
            }
            z = true;
            Trace.checkState(z);
            placeholderSurfaceThread = new PlaceholderSurface.PlaceholderSurfaceThread("ExoPlayer:PlaceholderSurface");
            if (!z2) {
            }
            placeholderSurfaceThread.start();
            Handler handler2 = new Handler(placeholderSurfaceThread.getLooper(), placeholderSurfaceThread);
            placeholderSurfaceThread.handler = handler2;
            placeholderSurfaceThread.eglSurfaceTexture = new EGLSurfaceTexture(handler2);
            synchronized (placeholderSurfaceThread) {
            }
        }
        return this.placeholderSurface;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        MediaCodecAdapter mediaCodecAdapter = this.codec;
                        mediaCodecAdapter.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mediaCodecAdapter.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i, Object obj) {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
            this.frameMetadataListener = videoFrameMetadataListener;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != intValue) {
                this.tunnelingAudioSessionId = intValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.scalingMode = intValue2;
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.setVideoScalingMode(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.changeFrameRateStrategy = intValue3;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setChangeFrameRateStrategy(intValue3);
                return;
            }
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.videoFrameReleaseControl.frameReleaseHelper;
            if (videoFrameReleaseHelper.changeFrameRateStrategy == intValue3) {
                return;
            }
            videoFrameReleaseHelper.changeFrameRateStrategy = intValue3;
            videoFrameReleaseHelper.updateSurfacePlaybackFrameRate(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(VideoFrameProcessor.REDRAW)) {
                VideoSink videoSink3 = this.videoSink;
                if (videoSink3 == null || !videoSink3.isInitialized()) {
                    return;
                }
                this.videoSink.redraw();
                return;
            }
            this.videoEffects = list;
            VideoSink videoSink4 = this.videoSink;
            if (videoSink4 != null) {
                videoSink4.setVideoEffects(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            Size size = (Size) obj;
            if (size.width == 0 || size.height == 0) {
                return;
            }
            this.outputResolution = size;
            VideoSink videoSink5 = this.videoSink;
            if (videoSink5 != null) {
                Surface surface = this.displaySurface;
                surface.getClass();
                videoSink5.setOutputSurfaceInfo(surface, size);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.rendererPriority = ((Integer) obj).intValue();
                MediaCodecAdapter mediaCodecAdapter2 = this.codec;
                if (mediaCodecAdapter2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.rendererPriority));
                    mediaCodecAdapter2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.displaySurface;
                setOutput(null);
                obj.getClass();
                ((MediaCodecVideoRenderer) obj).handleMessage(1, surface2);
                break;
            case 18:
                boolean z = this.scrubbingModeParameters != null;
                ScrubbingModeParameters scrubbingModeParameters = (ScrubbingModeParameters) obj;
                this.scrubbingModeParameters = scrubbingModeParameters;
                if (z != (scrubbingModeParameters != null)) {
                    updateCodecOperatingRate(this.codecInputFormat);
                    break;
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    public final boolean hasSurfaceForCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        if (this.videoSink != null) {
            return true;
        }
        Surface surface = this.displaySurface;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.detachedSurfaceSupported) || shouldUsePlaceholderSurface(mediaCodecInfo);
        }
        return true;
    }

    public final boolean isBufferProbablyLastSample(DecoderInputBuffer decoderInputBuffer) {
        if (hasReadStreamToEnd() || decoderInputBuffer.getFlag(PKIFailureInfo.duplicateCertReq)) {
            return true;
        }
        long j = this.periodDurationUs;
        return j == -9223372036854775807L || j - (decoderInputBuffer.timeUs - this.outputStreamInfo.streamOffsetUs) <= 100000;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isEnded() {
        if (!this.outputStreamEnded) {
            return false;
        }
        VideoSink videoSink = this.videoSink;
        return videoSink == null || videoSink.isEnded();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r6.codecHotswapDeadlineMs) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isReady() {
        boolean z;
        VideoSink videoSink;
        boolean isReady;
        if (this.inputFormat != null) {
            if (hasReadStreamToEnd()) {
                isReady = this.streamIsFinal;
            } else {
                SampleStream sampleStream = this.stream;
                sampleStream.getClass();
                isReady = sampleStream.isReady();
            }
            if (!isReady && this.outputIndex < 0) {
                if (this.codecHotswapDeadlineMs != -9223372036854775807L) {
                    this.clock.getClass();
                }
            }
            z = true;
            videoSink = this.videoSink;
            if (videoSink == null) {
                return videoSink.isReady(z);
            }
            if (z && (this.codec == null || this.tunneling)) {
                return true;
            }
            return this.videoFrameReleaseControl.isReady(z);
        }
        z = false;
        videoSink = this.videoSink;
        if (videoSink == null) {
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean maybeInitializeProcessingPipeline(Format format2) {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.videoSink.initialize(format2);
        } catch (VideoSink.VideoSinkException e) {
            throw this.createRendererException(e, format2, false, 7000);
        }
    }

    public final void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            this.clock.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.droppedFrameAccumulationStartTimeMs;
            int i = this.droppedFrames;
            AndroidSvg androidSvg = this.eventDispatcher;
            Handler handler = (Handler) androidSvg.svg;
            if (handler != null) {
                handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg, i, j));
            }
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    public final void maybeSetupTunnelingForFirstFrame() {
        MediaCodecAdapter mediaCodecAdapter;
        if (this.tunneling && (mediaCodecAdapter = this.codec) != null) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListener(mediaCodecAdapter);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                mediaCodecAdapter.setParameters(bundle);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecError(Exception exc) {
        Log.e("MediaCodecVideoRenderer", "Video codec error", exc);
        AndroidSvg androidSvg = this.eventDispatcher;
        Handler handler = (Handler) androidSvg.svg;
        if (handler != null) {
            handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg, exc, 1));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecInitialized(long j, long j2, String str) {
        String str2;
        AndroidSvg androidSvg = this.eventDispatcher;
        Handler handler = (Handler) androidSvg.svg;
        if (handler != null) {
            str2 = str;
            handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg, str2, j, j2));
        } else {
            str2 = str;
        }
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str2);
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.codecInfo;
        mediaCodecInfo.getClass();
        boolean z = false;
        if ("video/x-vnd.on2.vp9".equals(mediaCodecInfo.mimeType)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo.capabilities.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.codecHandlesHdr10PlusOutOfBandMetadata = z;
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecParametersChanged(CodecParameters codecParameters) {
        AndroidSvg androidSvg = this.eventDispatcher;
        Handler handler = (Handler) androidSvg.svg;
        if (handler != null) {
            handler.post(new q4$$ExternalSyntheticLambda0(3, androidSvg, codecParameters));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onCodecReleased(String str) {
        AndroidSvg androidSvg = this.eventDispatcher;
        Handler handler = (Handler) androidSvg.svg;
        if (handler != null) {
            handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg, str, 2));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void onDisabled() {
        AndroidSvg androidSvg = this.eventDispatcher;
        this.reportedVideoSize = null;
        this.periodDurationUs = -9223372036854775807L;
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        this.isFlushRequired = true;
        int i = 5;
        try {
            super.onDisabled();
            DecoderCounters decoderCounters = this.decoderCounters;
            androidSvg.getClass();
            synchronized (decoderCounters) {
            }
            Handler handler = (Handler) androidSvg.svg;
            if (handler != null) {
                handler.post(new q4$$ExternalSyntheticLambda0(i, androidSvg, decoderCounters));
            }
            androidSvg.videoSizeChanged(VideoSize.UNKNOWN);
        } catch (Throwable th) {
            DecoderCounters decoderCounters2 = this.decoderCounters;
            androidSvg.getClass();
            synchronized (decoderCounters2) {
                Handler handler2 = (Handler) androidSvg.svg;
                if (handler2 != null) {
                    handler2.post(new q4$$ExternalSyntheticLambda0(i, androidSvg, decoderCounters2));
                }
                androidSvg.videoSizeChanged(VideoSize.UNKNOWN);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.video.MediaCodecVideoRenderer$1] */
    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onEnabled(boolean z, boolean z2) {
        VideoSink videoSink;
        this.decoderCounters = new DecoderCounters();
        RendererConfiguration rendererConfiguration = this.configuration;
        rendererConfiguration.getClass();
        boolean z3 = rendererConfiguration.tunneling;
        Trace.checkState((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        DecoderCounters decoderCounters = this.decoderCounters;
        AndroidSvg androidSvg = this.eventDispatcher;
        Handler handler = (Handler) androidSvg.svg;
        if (handler != null) {
            handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg, decoderCounters, 5));
        }
        boolean z4 = this.hasSetVideoSink;
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        if (!z4) {
            if (this.videoEffects != null && this.videoSink == null) {
                PlaybackVideoGraphWrapper.Builder builder = new PlaybackVideoGraphWrapper.Builder(this.context, videoFrameReleaseControl);
                builder.enablePlaylistMode = true;
                long j = this.minEarlyUsToDropDecoderInput;
                builder.lateThresholdToDropInputUs = j != -9223372036854775807L ? -j : -9223372036854775807L;
                androidx.media3.common.util.SystemClock systemClock = this.clock;
                systemClock.getClass();
                builder.clock = systemClock;
                Trace.checkState(!builder.built);
                if (builder.videoGraphFactory == null) {
                    builder.videoGraphFactory = new PlaybackVideoGraphWrapper.ReflectiveSingleInputVideoGraphFactory();
                }
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(builder);
                builder.built = true;
                if (1 >= playbackVideoGraphWrapper.totalVideoInputCount) {
                    playbackVideoGraphWrapper.totalVideoInputCount = 1;
                }
                SparseArray sparseArray = playbackVideoGraphWrapper.inputVideoSinks;
                if (Util.contains(sparseArray, 0)) {
                    videoSink = (VideoSink) sparseArray.get(0);
                } else {
                    PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = playbackVideoGraphWrapper.new InputVideoSink(playbackVideoGraphWrapper.context);
                    playbackVideoGraphWrapper.listeners.add(inputVideoSink);
                    sparseArray.put(0, inputVideoSink);
                    videoSink = inputVideoSink;
                }
                this.videoSink = videoSink;
            }
            this.hasSetVideoSink = true;
        }
        VideoSink videoSink2 = this.videoSink;
        if (videoSink2 == 0) {
            androidx.media3.common.util.SystemClock systemClock2 = this.clock;
            systemClock2.getClass();
            videoFrameReleaseControl.clock = systemClock2;
            videoFrameReleaseControl.onStreamChanged(!z2 ? 1 : 0);
            return;
        }
        videoSink2.setListener(new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void onFirstFrameRendered() {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                Surface surface = mediaCodecVideoRenderer.displaySurface;
                if (surface != null) {
                    AndroidSvg androidSvg2 = mediaCodecVideoRenderer.eventDispatcher;
                    Handler handler2 = (Handler) androidSvg2.svg;
                    if (handler2 != null) {
                        handler2.post(new CameraCallbackMap$$ExternalSyntheticLambda11(androidSvg2, surface, SystemClock.elapsedRealtime(), 2));
                    }
                    mediaCodecVideoRenderer.haveReportedFirstFrameRenderedForCurrentSurface = true;
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void onFrameAvailableForRendering() {
                ExoPlayerImplInternal.AnonymousClass1 anonymousClass1 = MediaCodecVideoRenderer.this.wakeupListener;
                if (anonymousClass1 != null) {
                    anonymousClass1.onWakeup();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void onFrameDropped() {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                if (mediaCodecVideoRenderer.displaySurface != null) {
                    mediaCodecVideoRenderer.updateDroppedBufferCounters(0, 1);
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void onVideoSizeChanged(VideoSize videoSize) {
            }
        });
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
        if (this.displaySurface != null && !this.outputResolution.equals(Size.UNKNOWN)) {
            this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
        }
        this.videoSink.setChangeFrameRateStrategy(this.changeFrameRateStrategy);
        this.videoSink.setPlaybackSpeed(this.currentPlaybackSpeed);
        List list = this.videoEffects;
        if (list != null) {
            this.videoSink.setVideoEffects(list);
        }
        this.nextVideoSinkFirstFrameReleaseInstruction = !z2 ? 1 : 0;
        this.experimentalEnableProcessedStreamChangedAtStart = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation onInputFormatChanged(AndroidSvg androidSvg) {
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(androidSvg);
        Format format2 = (Format) androidSvg.renderOptions;
        format2.getClass();
        AndroidSvg androidSvg2 = this.eventDispatcher;
        Handler handler = (Handler) androidSvg2.svg;
        if (handler != null) {
            handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg2, format2, onInputFormatChanged));
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        return onInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onOutputFormatChanged(Format format2, MediaFormat mediaFormat) {
        int integer;
        int i;
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter != null) {
            mediaCodecAdapter.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            i = format2.width;
            integer = format2.height;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = format2.pixelWidthHeightRatio;
        int i2 = format2.rotationDegrees;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.decodedVideoSize = new VideoSize(f, i, integer);
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.pendingVideoSinkInputStreamChange) {
            this.videoFrameReleaseControl.setFrameRate(format2.frameRate);
        } else {
            Format.Builder buildUpon = format2.buildUpon();
            buildUpon.width = i;
            buildUpon.height = integer;
            buildUpon.pixelWidthHeightRatio = f;
            Format format3 = new Format(buildUpon);
            int i4 = this.nextVideoSinkFirstFrameReleaseInstruction;
            List list = this.videoEffects;
            if (list == null) {
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                list = RegularImmutableList.EMPTY;
            }
            videoSink.onInputStreamChanged(format3, this.outputStreamInfo.startPositionUs, i4, list);
            this.nextVideoSinkFirstFrameReleaseInstruction = 2;
        }
        this.pendingVideoSinkInputStreamChange = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void onPositionReset(long j, boolean z, boolean z2) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null && !z) {
            videoSink.flush(true);
        }
        if (z2) {
            this.lastResetToKeyFramePositionUs = j;
        }
        super.onPositionReset(j, z, z2);
        VideoSink videoSink2 = this.videoSink;
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        if (videoSink2 == null) {
            videoFrameReleaseControl.frameReleaseHelper.resetAdjustment();
            videoFrameReleaseControl.lastPresentationTimeUs = -9223372036854775807L;
            videoFrameReleaseControl.initialPositionUs = -9223372036854775807L;
            videoFrameReleaseControl.firstFrameState = Math.min(videoFrameReleaseControl.firstFrameState, 1);
            videoFrameReleaseControl.joiningDeadlineMs = -9223372036854775807L;
            videoFrameReleaseControl.frameReadyWithoutSurface = false;
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
        if (z) {
            VideoSink videoSink3 = this.videoSink;
            if (videoSink3 != null) {
                videoSink3.join(false);
            } else {
                videoFrameReleaseControl.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onProcessedOutputBuffer$1(long j) {
        super.onProcessedOutputBuffer$1(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onProcessedStreamChange() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
            if (this.startPositionUs == -9223372036854775807L) {
                this.startPositionUs = this.outputStreamInfo.startPositionUs;
            }
            this.videoSink.setBufferTimestampAdjustmentUs(-this.startPositionUs);
        } else {
            this.videoFrameReleaseControl.onStreamChanged(2);
        }
        this.pendingVideoSinkInputStreamChange = true;
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        AndroidSvg androidSvg = this.av1SampleDependencyParser;
        if (androidSvg != null) {
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.codecInfo;
            mediaCodecInfo.getClass();
            if (mediaCodecInfo.mimeType.equals("video/av01") && decoderInputBuffer.getFlag(1) && (byteBuffer = decoderInputBuffer.data) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) androidSvg.svg;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.consecutiveDroppedInputBufferCount = 0;
        int codecBufferFlags = getCodecBufferFlags(decoderInputBuffer);
        if ((Build.VERSION.SDK_INT < 34 || (codecBufferFlags & 32) == 0) && !this.tunneling) {
            this.buffersInCodecCount++;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onRelease() {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onReset() {
        try {
            try {
                this.bypassEnabled = false;
                resetBypassState();
                releaseCodec();
                Toolbar.AnonymousClass1 anonymousClass1 = this.sourceDrmSession;
                if (anonymousClass1 != null) {
                    anonymousClass1.release(null);
                }
                this.sourceDrmSession = null;
            } catch (Throwable th) {
                Toolbar.AnonymousClass1 anonymousClass12 = this.sourceDrmSession;
                if (anonymousClass12 != null) {
                    anonymousClass12.release(null);
                }
                this.sourceDrmSession = null;
                throw th;
            }
        } finally {
            this.hasSetVideoSink = false;
            this.startPositionUs = -9223372036854775807L;
            PlaceholderSurface placeholderSurface = this.placeholderSurface;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.placeholderSurface = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onStarted() {
        this.droppedFrames = 0;
        this.clock.getClass();
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.startRendering();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onStopped() {
        maybeNotifyDroppedFrames();
        int i = this.videoFrameProcessingOffsetCount;
        if (i != 0) {
            long j = this.totalVideoFrameProcessingOffsetUs;
            AndroidSvg androidSvg = this.eventDispatcher;
            Handler handler = (Handler) androidSvg.svg;
            if (handler != null) {
                handler.post(new VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(androidSvg, j, i));
            }
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.stopRendering();
        } else {
            VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
            videoFrameReleaseControl.started = false;
            videoFrameReleaseControl.joiningDeadlineMs = -9223372036854775807L;
            VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.frameReleaseHelper;
            videoFrameReleaseHelper.started = false;
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.vsyncSampler;
            if (vSyncSampler != null) {
                vSyncSampler.unregister();
            }
            videoFrameReleaseHelper.clearSurfaceFrameRate();
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        super.onStreamChanged(formatArr, j, j2, mediaSource$MediaPeriodId);
        updatePeriodDurationUs(mediaSource$MediaPeriodId);
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.reset();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onTimelineChanged() {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = this.mediaPeriodId;
        if (mediaSource$MediaPeriodId != null) {
            updatePeriodDurationUs(mediaSource$MediaPeriodId);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format2) {
        int i4;
        mediaCodecAdapter.getClass();
        long j4 = j3 - this.outputStreamInfo.streamOffsetUs;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.droppedDecoderInputBufferTimestamps;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        updateDroppedBufferCounters(i5, 0);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            if (!z || z2) {
                return videoSink.handleInputFrame(j3, new AnonymousClass2(mediaCodecAdapter, i, j4));
            }
            skipOutputBuffer(mediaCodecAdapter, i);
            return true;
        }
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j3, j, j2, this.outputStreamInfo.startPositionUs, z, z2, this.videoFrameReleaseInfo);
        EocdRecord eocdRecord = this.videoFrameReleaseInfo;
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null && frameReleaseAction != 5 && frameReleaseAction != 4) {
            videoFrameReleaseEarlyTimeForecaster.onVideoFrameProcessed(j3, eocdRecord.entryCount);
        }
        if (frameReleaseAction == 0) {
            this.clock.getClass();
            long nanoTime = System.nanoTime();
            VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j4, nanoTime, format2, this.codecOutputMediaFormat);
            }
            renderOutputBufferV21(mediaCodecAdapter, i, nanoTime);
            updateVideoFrameProcessingOffsetCounters(eocdRecord.entryCount);
            return true;
        }
        if (frameReleaseAction == 1) {
            long j5 = eocdRecord.centralDirectoryOffset;
            long j6 = eocdRecord.entryCount;
            if (j5 == this.lastFrameReleaseTimeNs) {
                skipOutputBuffer(mediaCodecAdapter, i);
            } else {
                VideoFrameMetadataListener videoFrameMetadataListener2 = this.frameMetadataListener;
                if (videoFrameMetadataListener2 != null) {
                    i4 = i;
                    videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j4, j5, format2, this.codecOutputMediaFormat);
                } else {
                    i4 = i;
                }
                renderOutputBufferV21(mediaCodecAdapter, i4, j5);
            }
            updateVideoFrameProcessingOffsetCounters(j6);
            this.lastFrameReleaseTimeNs = j5;
            return true;
        }
        if (frameReleaseAction == 2) {
            android.os.Trace.beginSection("dropVideoBuffer");
            mediaCodecAdapter.releaseOutputBuffer(i);
            android.os.Trace.endSection();
            updateDroppedBufferCounters(0, 1);
            updateVideoFrameProcessingOffsetCounters(eocdRecord.entryCount);
            return true;
        }
        if (frameReleaseAction == 3) {
            skipOutputBuffer(mediaCodecAdapter, i);
            updateVideoFrameProcessingOffsetCounters(eocdRecord.entryCount);
            return true;
        }
        if (frameReleaseAction != 4 && frameReleaseAction != 5) {
            a$$ExternalSyntheticBUOutline0.m$1(String.valueOf(frameReleaseAction));
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void render(long j, long j2) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.f886format, false, 7001);
            }
        }
        super.render(j, j2);
    }

    public final void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        Surface surface;
        android.os.Trace.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j);
        android.os.Trace.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            VideoSize videoSize = this.decodedVideoSize;
            boolean equals = videoSize.equals(VideoSize.UNKNOWN);
            AndroidSvg androidSvg = this.eventDispatcher;
            if (!equals && !videoSize.equals(this.reportedVideoSize)) {
                this.reportedVideoSize = videoSize;
                androidSvg.videoSizeChanged(videoSize);
            }
            VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
            boolean z = videoFrameReleaseControl.firstFrameState != 3;
            videoFrameReleaseControl.firstFrameState = 3;
            videoFrameReleaseControl.clock.getClass();
            videoFrameReleaseControl.lastReleaseRealtimeUs = Util.msToUs(SystemClock.elapsedRealtime());
            if (!z || (surface = this.displaySurface) == null) {
                return;
            }
            Handler handler = (Handler) androidSvg.svg;
            if (handler != null) {
                handler.post(new CameraCallbackMap$$ExternalSyntheticLambda11(androidSvg, surface, SystemClock.elapsedRealtime(), 2));
            }
            this.haveReportedFirstFrameRenderedForCurrentSurface = true;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void renderToEndOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
        } else {
            long j = this.outputStreamInfo.lastBufferTimeUs;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.droppedDecoderInputBufferTimestamps.clear();
        this.buffersInCodecCount = 0;
        this.consecutiveDroppedInputBufferCount = 0;
        this.isFlushRequired = false;
        AndroidSvg androidSvg = this.av1SampleDependencyParser;
        if (androidSvg != null) {
            androidSvg.renderOptions = null;
            ByteBuffer byteBuffer = (ByteBuffer) androidSvg.svg;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    public final void setOutput(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.displaySurface;
        AndroidSvg androidSvg = this.eventDispatcher;
        if (surface2 == surface) {
            if (surface != null) {
                VideoSize videoSize = this.reportedVideoSize;
                if (videoSize != null) {
                    androidSvg.videoSizeChanged(videoSize);
                }
                Surface surface3 = this.displaySurface;
                if (surface3 == null || !this.haveReportedFirstFrameRenderedForCurrentSurface || (handler = (Handler) androidSvg.svg) == null) {
                    return;
                }
                handler.post(new CameraCallbackMap$$ExternalSyntheticLambda11(androidSvg, surface3, SystemClock.elapsedRealtime(), 2));
                return;
            }
            return;
        }
        this.displaySurface = surface;
        VideoSink videoSink = this.videoSink;
        VideoFrameReleaseControl videoFrameReleaseControl = this.videoFrameReleaseControl;
        if (videoSink == null) {
            videoFrameReleaseControl.setOutputSurface(surface);
        }
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int i = this.state;
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter != null && this.videoSink == null) {
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.codecInfo;
            mediaCodecInfo.getClass();
            if (!hasSurfaceForCodec(mediaCodecInfo) || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodecOrBypass();
            } else {
                Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
                if (surfaceForCodec != null) {
                    mediaCodecAdapter.setOutputSurface(surfaceForCodec);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return;
                    }
                    mediaCodecAdapter.detachOutputSurface();
                }
            }
        }
        if (surface != null) {
            VideoSize videoSize2 = this.reportedVideoSize;
            if (videoSize2 != null) {
                androidSvg.videoSizeChanged(videoSize2);
            }
        } else {
            this.reportedVideoSize = null;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.clearOutputSurfaceInfo();
            }
        }
        if (i == 2) {
            VideoSink videoSink3 = this.videoSink;
            if (videoSink3 != null) {
                videoSink3.join(true);
            } else {
                videoFrameReleaseControl.join(true);
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void setPlaybackSpeed(float f, float f2) {
        super.setPlaybackSpeed(f, f2);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f);
        }
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
        if (videoFrameReleaseEarlyTimeForecaster != null) {
            videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
    
        r2 = ((androidx.media3.container.ObuParser$Obu) r3.get(r7)).payload.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0107, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDiscardDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer;
        ObuParser$SequenceHeader obuParser$SequenceHeader;
        ObuParser$FrameHeader obuParser$FrameHeader;
        boolean z2 = false;
        if (!isBufferProbablyLastSample(decoderInputBuffer)) {
            boolean z3 = decoderInputBuffer.timeUs < this.lastResetPositionUs;
            VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = this.videoFrameReleaseEarlyTimeForecaster;
            if (videoFrameReleaseEarlyTimeForecaster != null) {
                long j = videoFrameReleaseEarlyTimeForecaster.lastFramePresentationTimeUs == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * videoFrameReleaseEarlyTimeForecaster.derivativeOfEarlyTime) + videoFrameReleaseEarlyTimeForecaster.lastFrameEarlyUs);
                if (j != -9223372036854775807L && j < this.minEarlyUsToDropDecoderInput) {
                    z = true;
                    if ((!z3 || z) && !decoderInputBuffer.getFlag(268435456)) {
                        if (decoderInputBuffer.getFlag(67108864)) {
                            AndroidSvg androidSvg = this.av1SampleDependencyParser;
                            if (androidSvg != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) androidSvg.svg;
                                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.codecInfo;
                                mediaCodecInfo.getClass();
                                if (mediaCodecInfo.mimeType.equals("video/av01") && (byteBuffer = decoderInputBuffer.data) != null) {
                                    boolean z4 = z3 || this.consecutiveDroppedInputBufferCount <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        androidSvg.updateSequenceHeaders(OpusUtil.split(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList split = OpusUtil.split(asReadOnlyBuffer);
                                    androidSvg.updateSequenceHeaders(split);
                                    int size = split.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        ObuParser$Obu obuParser$Obu = (ObuParser$Obu) split.get(size);
                                        int i2 = obuParser$Obu.f873type;
                                        if (i2 != 2 && i2 != 15) {
                                            if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (obuParser$SequenceHeader = (ObuParser$SequenceHeader) androidSvg.renderOptions) == null)) {
                                                break;
                                            }
                                            try {
                                                obuParser$FrameHeader = new ObuParser$FrameHeader(obuParser$SequenceHeader, obuParser$Obu);
                                            } catch (ObuParser$NotYetImplementedException unused) {
                                                obuParser$FrameHeader = null;
                                            }
                                            if (obuParser$FrameHeader != null) {
                                                if (obuParser$FrameHeader.isDependedOn) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((ObuParser$Obu) split.get(size)).f873type == 6 || ((ObuParser$Obu) split.get(size)).f873type == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        decoderInputBuffer.clear();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        PagingConfig pagingConfig = this.codecMaxValues;
                                        pagingConfig.getClass();
                                        if (pagingConfig.initialLoadSize + limit < asReadOnlyBuffer.capacity() && !decoderInputBuffer.getFlag(1073741824)) {
                                            ByteBuffer byteBuffer3 = decoderInputBuffer.data;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (z3) {
                                    this.decoderCounters.skippedInputBufferCount++;
                                } else {
                                    this.droppedDecoderInputBufferTimestamps.add(Long.valueOf(decoderInputBuffer.timeUs));
                                    this.consecutiveDroppedInputBufferCount++;
                                }
                            }
                            return z2;
                        }
                        decoderInputBuffer.clear();
                        z2 = true;
                        if (z2) {
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (!z3) {
            }
            if (decoderInputBuffer.getFlag(67108864)) {
            }
            z2 = true;
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean shouldFlushCodec() {
        boolean z;
        Format format2 = this.codecInputFormat;
        long j = this.periodDurationUs;
        if (j != -9223372036854775807L) {
            if (this.skippedFlushOffsetUs + 1 + j <= Long.MAX_VALUE - (this.outputStreamInfo.streamOffsetUs + j)) {
                z = false;
                return this.scrubbingModeParameters == null || this.isFlushRequired || this.tunneling || (format2 != null && format2.maxNumReorderSamples > 0) || z || this.outputStreamInfo.lastBufferTimeUs != -9223372036854775807L;
            }
        }
        z = true;
        if (this.scrubbingModeParameters == null) {
        }
    }

    public final boolean shouldIgnoreFrame(long j, long j2, boolean z, boolean z2) {
        if (this.videoSink != null && this.ownsVideoSink) {
            j2 -= -this.startPositionUs;
        }
        if (j < -500000 && !z) {
            SampleStream sampleStream = this.stream;
            sampleStream.getClass();
            int skipData = sampleStream.skipData(j2 - this.streamOffsetUs);
            if (skipData != 0) {
                this.lastResetToKeyFramePositionUs = j2;
                DecoderCounters decoderCounters = this.decoderCounters;
                PriorityQueue priorityQueue = this.droppedDecoderInputBufferTimestamps;
                if (z2) {
                    int i = decoderCounters.skippedInputBufferCount + skipData;
                    decoderCounters.skippedInputBufferCount = i;
                    decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
                    decoderCounters.skippedInputBufferCount = priorityQueue.size() + i;
                } else {
                    decoderCounters.droppedToKeyframeCount++;
                    updateDroppedBufferCounters(priorityQueue.size() + skipData, this.buffersInCodecCount);
                }
                if (this.codec != null) {
                    if (shouldReleaseCodecInsteadOfFlushing()) {
                        releaseCodec();
                        maybeInitCodecOrBypass();
                    } else if (shouldFlushCodec()) {
                        flushCodec();
                    } else {
                        this.hasSkippedFlushAndWaitingForQueueInputBuffer = true;
                    }
                }
                VideoSink videoSink = this.videoSink;
                if (videoSink != null) {
                    videoSink.flush(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean shouldInitCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return hasSurfaceForCodec(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean shouldReleaseCodecInsteadOfFlushing() {
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.codecInfo;
        if (this.videoSink != null && mediaCodecInfo != null) {
            String str = mediaCodecInfo.name;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.shouldReleaseCodecInsteadOfFlushing();
    }

    public final boolean shouldUsePlaceholderSurface(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        if (this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported();
    }

    public final void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i) {
        android.os.Trace.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i);
        android.os.Trace.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int supportsFormat(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2) {
        boolean z;
        int i = 0;
        if (!MimeTypes.isVideo(format2.sampleMimeType)) {
            return BaseRenderer.create(0, 0, 0, 0);
        }
        boolean z2 = format2.drmInitData != null;
        Context context = this.context;
        List decoderInfos = getDecoderInfos(context, loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(context, loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return BaseRenderer.create(1, 0, 0, 0);
        }
        int i2 = format2.cryptoType;
        if (i2 != 0 && i2 != 2) {
            return BaseRenderer.create(2, 0, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(context, format2);
        if (!isFormatSupported) {
            for (int i3 = 1; i3 < decoderInfos.size(); i3++) {
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo2 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) decoderInfos.get(i3);
                if (mediaCodecInfo2.isFormatSupported(context, format2)) {
                    z = false;
                    isFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
        }
        z = true;
        int i4 = isFormatSupported ? 4 : 3;
        int i5 = mediaCodecInfo.isSeamlessAdaptationSupported(format2) ? 16 : 8;
        int i6 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i7 = z ? 128 : 0;
        if ("video/dolby-vision".equals(format2.sampleMimeType) && !zzpe.doesDisplaySupportDolbyVision(context)) {
            i7 = 256;
        }
        if (isFormatSupported) {
            List decoderInfos2 = getDecoderInfos(context, loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, z2, true);
            if (!decoderInfos2.isEmpty()) {
                HashMap hashMap = MediaCodecUtil.decoderInfosCache;
                ArrayList arrayList = new ArrayList(decoderInfos2);
                Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda6(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(15, context, format2), 5));
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo3 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) arrayList.get(0);
                if (mediaCodecInfo3.isFormatSupported(context, format2) && mediaCodecInfo3.isSeamlessAdaptationSupported(format2)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        if (this.largestQueuedPresentationTimeUs == -9223372036854775807L || j < this.lastResetToKeyFramePositionUs) {
            return false;
        }
        long j2 = this.lastProcessedOutputBufferTimeUs;
        return j2 == -9223372036854775807L || j > j2;
    }

    public final void updateDroppedBufferCounters(int i, int i2) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i;
        int i3 = i + i2;
        decoderCounters.droppedBufferCount += i3;
        this.droppedFrames += i3;
        int i4 = this.consecutiveDroppedFrameCount + i3;
        this.consecutiveDroppedFrameCount = i4;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i4, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i5 = this.maxDroppedFramesToNotify;
        if (i5 <= 0 || this.droppedFrames < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    public final void updatePeriodDurationUs(MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        Timeline timeline = this.timeline;
        if (timeline.isEmpty()) {
            this.periodDurationUs = -9223372036854775807L;
            return;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid);
        if (indexOfPeriod == -1) {
            this.periodDurationUs = -9223372036854775807L;
        } else {
            this.periodDurationUs = timeline.getPeriod(indexOfPeriod, new Timeline.Period(), false).durationUs;
        }
    }

    public final void updateVideoFrameProcessingOffsetCounters(long j) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.totalVideoFrameProcessingOffsetUs += j;
        decoderCounters.videoFrameProcessingOffsetCount++;
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList getDecoderInfos(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2, boolean z) {
        boolean z2 = this.tunneling;
        Context context = this.context;
        List decoderInfos = getDecoderInfos(context, loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, z, z2);
        HashMap hashMap = MediaCodecUtil.decoderInfosCache;
        ArrayList arrayList = new ArrayList(decoderInfos);
        Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda6(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(15, context, format2), 5));
        return arrayList;
    }
}
