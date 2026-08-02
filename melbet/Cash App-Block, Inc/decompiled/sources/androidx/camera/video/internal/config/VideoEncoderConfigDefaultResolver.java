package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Supplier;
import androidx.media3.common.util.StuckPlayerDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VideoEncoderConfigDefaultResolver implements Supplier {
    public static final Size VIDEO_SIZE_BASE = new Size(1280, 720);
    public final DynamicRange dynamicRange;
    public final Range expectedFrameRateRange;
    public final Timebase inputTimebase;
    public final String mimeType;
    public final Size surfaceSize;
    public final VideoSpec videoSpec;

    public VideoEncoderConfigDefaultResolver(String str, Timebase timebase, VideoSpec videoSpec, Size size, DynamicRange dynamicRange, Range range) {
        str.getClass();
        timebase.getClass();
        videoSpec.getClass();
        size.getClass();
        dynamicRange.getClass();
        range.getClass();
        this.mimeType = str;
        this.inputTimebase = timebase;
        this.videoSpec = videoSpec;
        this.surfaceSize = size;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        Integer num;
        LinkedHashMap linkedHashMap = VideoConfigUtil.MIME_TO_DATA_SPACE_MAP;
        Range range = this.expectedFrameRateRange;
        VideoSpec videoSpec = this.videoSpec;
        CaptureEncodeRates resolveFrameRates$camera_video = VideoConfigUtil.resolveFrameRates$camera_video(videoSpec, range);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = resolveFrameRates$camera_video.captureRate;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = resolveFrameRates$camera_video.encodeRate;
        sb.append(i2);
        sb.append("fps.");
        StringUtilsKt.d("VidEncCfgDefaultRslvr", sb.toString());
        int i3 = videoSpec.bitrate;
        DynamicRange dynamicRange = this.dynamicRange;
        Size size = this.surfaceSize;
        if (i3 == 0) {
            StringUtilsKt.d("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
            int i4 = dynamicRange.mBitDepth;
            int i5 = resolveFrameRates$camera_video.encodeRate;
            int width = size.getWidth();
            Size size2 = VIDEO_SIZE_BASE;
            i3 = VideoConfigUtil.scaleBitrate(14000000, i4, 8, i5, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight());
        }
        HashMap hashMap = DynamicRangeUtil.MIME_TO_DEFAULT_PROFILE_LEVEL_MAP;
        String str = this.mimeType;
        Map map = (Map) hashMap.get(str);
        int intValue = (map == null || (num = (Integer) map.get(dynamicRange)) == null) ? -1 : num.intValue();
        AutoValue_VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace = VideoConfigUtil.mimeAndProfileToEncoderDataSpace(intValue, str);
        StuckPlayerDetector builder = AutoValue_VideoEncoderConfig.builder();
        builder.player = str;
        Timebase timebase = this.inputTimebase;
        if (timebase == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null inputTimebase");
            return null;
        }
        builder.callback = timebase;
        if (size == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null resolution");
            return null;
        }
        builder.clock = size;
        builder.stuckSuppressedDetector = Integer.valueOf(i3);
        builder.stuckBufferingDetector = Integer.valueOf(i);
        builder.stuckPlayingDetector = Integer.valueOf(i2);
        builder.playerListener = Integer.valueOf(intValue);
        builder.handler = mimeAndProfileToEncoderDataSpace;
        return builder.build();
    }
}
