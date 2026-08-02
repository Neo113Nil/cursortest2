package androidx.camera.video.internal.config;

import android.os.Build;
import androidx.media3.extractor.mkv.Sniffer;
import defpackage.Size$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public abstract class DynamicRangeFormatComboRegistry {
    public static final String MIMETYPE_VIDEO_HEVC_GATED = takeIf(24, "video/hevc");
    public static final String MIMETYPE_VIDEO_VP9_GATED = takeIf(24, "video/x-vnd.on2.vp9");
    public static final String MIMETYPE_AUDIO_OPUS_GATED = takeIf(29, "audio/opus");
    public static final String MIMETYPE_VIDEO_DOLBY_VISION_GATED = takeIf(33, "video/dolby-vision");
    public static final String MIMETYPE_VIDEO_AV1_GATED = takeIf(34, "video/av01");
    public static final String MIMETYPE_VIDEO_APV_GATED = takeIf(36, "video/apv");
    public static final Lazy registries$delegate = LazyKt.lazy(new Size$$ExternalSyntheticLambda0(15));
    public static final Lazy standardMp4Audios$delegate = LazyKt.lazy(new Size$$ExternalSyntheticLambda0(16));
    public static final Lazy standardWebmAudios$delegate = LazyKt.lazy(new Size$$ExternalSyntheticLambda0(17));

    public static FormatComboRegistry buildDolbyVisionRegistry() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = linkedHashMap.get(0);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(0, obj);
        }
        new Sniffer(0, (Map) obj, 1).support(CollectionsKt__CollectionsKt.listOfNotNull(MIMETYPE_VIDEO_DOLBY_VISION_GATED), (List) standardMp4Audios$delegate.getValue());
        return new FormatComboRegistry(linkedHashMap);
    }

    public static String takeIf(int i, String str) {
        if (Build.VERSION.SDK_INT >= i) {
            return str;
        }
        return null;
    }
}
