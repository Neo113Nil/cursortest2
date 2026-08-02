package ru.yandex.taxi.linked_order.map;

import defpackage.uzs;
import defpackage.wls;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class LinkedOrderRouteProgressTracker$listenRouteParams$2 extends AdaptedFunctionReference implements wls {
    public static final LinkedOrderRouteProgressTracker$listenRouteParams$2 a = new LinkedOrderRouteProgressTracker$listenRouteParams$2(2, 0, zzs.class, "equalsWithPrecision", "equalsWithPrecision(Lru/yandex/taxi/common_models/net/GeoPoint;D)Z");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        uzs uzsVar = zzs.Companion;
        return Boolean.valueOf(((zzs) obj).a((zzs) obj2, 1.0E-6d));
    }
}
