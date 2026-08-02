package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import defpackage.iyq;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RoutePointWidget$Content$9$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        iyq iyqVar = (iyq) obj;
        int intValue = ((Number) obj2).intValue();
        r0 r0Var = ((e) this.receiver).b.z.c.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.i((Set) value, new Pair(iyqVar, Integer.valueOf(intValue)))));
        return zy11.a;
    }
}
