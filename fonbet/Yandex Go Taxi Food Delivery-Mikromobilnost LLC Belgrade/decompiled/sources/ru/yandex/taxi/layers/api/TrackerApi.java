package ru.yandex.taxi.layers.api;

import defpackage.cmt;
import defpackage.m6x0;
import defpackage.qg21;
import defpackage.rvj0;
import defpackage.uau;
import defpackage.wqs;
import defpackage.x6v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/layers/api/TrackerApi;", "", "", "url", "Lx6v;", "ignoring", "", "additionalHeaders", "Lcmt;", "Lrvj0;", "a", "(Ljava/lang/String;Lx6v;Ljava/util/Map;)Lcmt;", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface TrackerApi {
    static /* synthetic */ cmt b(TrackerApi trackerApi, String str, LinkedHashMap linkedHashMap, int i) {
        Map<String, String> map = linkedHashMap;
        if ((i & 4) != 0) {
            map = b.f();
        }
        return trackerApi.a(str, x6v.a, map);
    }

    @wqs
    cmt<rvj0> a(@qg21 String url, @m6x0 x6v ignoring, @uau Map<String, String> additionalHeaders);
}
