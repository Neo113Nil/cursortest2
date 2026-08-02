package defpackage;

import kotlin.Pair;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImplKt;

/* loaded from: classes6.dex */
public abstract class jpt {
    public static final Object a = uah.e(new Pair(0, new v6n("bufsize", false)), new Pair(1, new v6n("enable_hevc", true)), new Pair(2, new v6n("mburl", true)), new Pair(3, new v6n("audio_mbr", true)), new Pair(4, new v6n("from", false)), new Pair(5, new v6n("lowlatency", true)), new Pair(6, new v6n("max_res_height", true)), new Pair(7, new v6n("min_res_height", true)), new Pair(8, new v6n("ottsession", false)), new Pair(9, new v6n("packager", true)), new Pair(10, new v6n("partner_id", false)), new Pair(11, new v6n("preview", true)), new Pair(12, new v6n("secondary_v_tracks", true)), new Pair(13, new v6n(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, false)), new Pair(14, new v6n("target_ref", false)), new Pair(15, new v6n("t", false)), new Pair(16, new v6n("uuid", false)), new Pair(17, new v6n("video_category_id", false)), new Pair(18, new v6n("video_content_id", false)), new Pair(19, new v6n("vpuid", false)), new Pair(20, new v6n("vsid", false)));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static v6n a(int i) {
        Object obj = a.get(Integer.valueOf(i));
        if (obj != null) {
            return (v6n) obj;
        }
        xq0.x("Passed value is not included in UriQueryParameters constants");
        return null;
    }
}
