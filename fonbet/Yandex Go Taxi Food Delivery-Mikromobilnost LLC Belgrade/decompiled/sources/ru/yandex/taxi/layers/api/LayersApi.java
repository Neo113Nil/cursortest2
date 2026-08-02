package ru.yandex.taxi.layers.api;

import defpackage.cmt;
import defpackage.cq60;
import defpackage.g4e0;
import defpackage.j8c;
import defpackage.o5e0;
import defpackage.q76;
import defpackage.s490;
import defpackage.wyx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/layers/api/LayersApi;", "", "Lwyx;", "params", "Lcmt;", "Lcq60;", "c", "(Lwyx;)Lcmt;", "Lj8c;", "b", "Lg4e0;", "d", "Lo5e0;", "a", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface LayersApi {
    @s490("layers/v1/polylines")
    cmt<o5e0> a(@q76 wyx params);

    @s490("layers/v1/cluster")
    cmt<j8c> b(@q76 wyx params);

    @s490("layers/v2/objects")
    cmt<cq60> c(@q76 wyx params);

    @s490("layers/v1/polygons")
    cmt<g4e0> d(@q76 wyx params);
}
