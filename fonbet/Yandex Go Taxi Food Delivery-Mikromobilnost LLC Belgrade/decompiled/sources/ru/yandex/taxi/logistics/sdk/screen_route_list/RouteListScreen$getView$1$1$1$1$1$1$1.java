package ru.yandex.taxi.logistics.sdk.screen_route_list;

import defpackage.a6l0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RouteListScreen$getView$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        a6l0 a6l0Var = (a6l0) this.receiver;
        a6l0Var.getClass();
        if (intValue >= 0 && intValue2 >= 0) {
            a6l0Var.w.a(intValue, intValue2);
            a6l0Var.z.a(a6l0Var.b.b, "ChangePosition");
        }
        return zy11.a;
    }
}
