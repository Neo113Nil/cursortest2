package ru.yandex.video.m3.player.impl.tracking;

import defpackage.ny61;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.yandex.video.m3.player.feature.FeatureConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0086\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bR\u001f\u0010\u0003\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/UriQueryParameters;", "", "()V", "privateParameters", "", "", "Lru/yandex/video/m3/player/impl/tracking/UriQueryParams;", "Lru/yandex/video/m3/player/impl/tracking/QueryParam;", "get", "value", "values", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UriQueryParameters {
    public static final UriQueryParameters INSTANCE = new UriQueryParameters();
    private static final Map<Integer, QueryParam> privateParameters = b.i(new Pair(0, new QueryParam("bufsize", false)), new Pair(1, new QueryParam("enable_hevc", true)), new Pair(2, new QueryParam("mburl", true)), new Pair(3, new QueryParam("audio_mbr", true)), new Pair(4, new QueryParam("from", false)), new Pair(5, new QueryParam(FeatureConfigurator.LowLatency.QUERY_LOW_LATENCY, true)), new Pair(6, new QueryParam("max_res_height", true)), new Pair(7, new QueryParam("min_res_height", true)), new Pair(8, new QueryParam("ottsession", false)), new Pair(9, new QueryParam(FeatureConfigurator.LowLatency.QUERY_PACKAGER, true)), new Pair(10, new QueryParam("partner_id", false)), new Pair(11, new QueryParam("preview", true)), new Pair(12, new QueryParam("secondary_v_tracks", true)), new Pair(13, new QueryParam(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, false)), new Pair(14, new QueryParam("target_ref", false)), new Pair(15, new QueryParam("t", false)), new Pair(16, new QueryParam("uuid", false)), new Pair(17, new QueryParam("video_category_id", false)), new Pair(18, new QueryParam("video_content_id", false)), new Pair(19, new QueryParam("vpuid", false)), new Pair(20, new QueryParam("vsid", false)));
    public static final int $stable = 8;

    private UriQueryParameters() {
    }

    public final QueryParam get(@UriQueryParams int value) throws IllegalArgumentException {
        QueryParam queryParam = privateParameters.get(Integer.valueOf(value));
        if (queryParam != null) {
            return queryParam;
        }
        ny61.g("Passed value is not included in UriQueryParameters constants");
        return null;
    }

    public final List<QueryParam> values() {
        return a.J0(privateParameters.values());
    }
}
