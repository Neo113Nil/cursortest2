package ru.yandex.taxi.eatskit.internal;

import defpackage.ecn;
import defpackage.jfn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsEvent$OpenTracking$1 extends FunctionReferenceImpl implements wls {
    public static final EatsEvent$OpenTracking$1 b = new EatsEvent$OpenTracking$1(2, 0, ecn.class, "openTracking", "openTracking(Lru/yandex/taxi/eats_orders/data/dto/order_id/EatsOrderIdDto;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((ecn) obj).g("openTracking", (jfn) obj2);
        return zy11.a;
    }
}
