package ru.yandex.taxi.logistics.sdk.screen_route_list;

import defpackage.a6l0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RouteListScreen$getView$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        a6l0 a6l0Var = (a6l0) this.receiver;
        a6l0Var.w.g(intValue - 1);
        a6l0Var.z.a(a6l0Var.b.b, "RemovePoint");
        return zy11.a;
    }
}
