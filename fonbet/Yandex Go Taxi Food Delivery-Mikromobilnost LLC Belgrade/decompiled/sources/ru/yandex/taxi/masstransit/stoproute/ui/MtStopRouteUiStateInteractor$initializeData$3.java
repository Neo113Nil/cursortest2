package ru.yandex.taxi.masstransit.stoproute.ui;

import defpackage.n440;
import defpackage.p440;
import defpackage.r240;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MtStopRouteUiStateInteractor$initializeData$3 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) this.receiver;
        if (((p440) obj) instanceof n440) {
            r240 r240Var = gVar.o;
            if (!r240Var.c) {
                r240Var.c = true;
                r240Var.b.a(200, r240.a(r240Var.a).getAnalyticsName(), r240Var.a.a());
            }
        } else {
            gVar.getClass();
        }
        return zy11.a;
    }
}
