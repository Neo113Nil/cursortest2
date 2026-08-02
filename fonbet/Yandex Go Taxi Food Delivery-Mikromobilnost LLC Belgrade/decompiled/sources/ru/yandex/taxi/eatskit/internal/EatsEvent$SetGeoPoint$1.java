package ru.yandex.taxi.eatskit.internal;

import defpackage.ecn;
import defpackage.l0t;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsEvent$SetGeoPoint$1 extends FunctionReferenceImpl implements wls {
    public static final EatsEvent$SetGeoPoint$1 b = new EatsEvent$SetGeoPoint$1(2, 0, ecn.class, "setGeoPoint", "setGeoPoint(Lru/yandex/taxi/eatskit/dto/GeoPositionWithSource;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((ecn) obj).g("setGeoPoint", (l0t) obj2);
        return zy11.a;
    }
}
