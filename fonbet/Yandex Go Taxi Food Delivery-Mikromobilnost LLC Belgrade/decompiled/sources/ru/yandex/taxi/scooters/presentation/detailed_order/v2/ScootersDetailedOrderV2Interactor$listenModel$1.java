package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.chn0;
import defpackage.ems;
import defpackage.jfn0;
import defpackage.p6p0;
import defpackage.pvn;
import defpackage.sqm0;
import defpackage.thn0;
import defpackage.tpr;
import defpackage.uh6;
import defpackage.uyj;
import defpackage.vvo0;
import defpackage.zgn0;
import defpackage.zuo0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ScootersDetailedOrderV2Interactor$listenModel$1 extends AdaptedFunctionReference implements ems {
    public final tpr b(sqm0 sqm0Var, jfn0 jfn0Var, zuo0 zuo0Var, p6p0 p6p0Var, zgn0 zgn0Var) {
        chn0 chn0Var = (chn0) this.receiver;
        chn0Var.getClass();
        zuo0 N = uh6.N(sqm0Var, zuo0Var.getSessionId());
        if (N == null) {
            return pvn.a;
        }
        thn0 thn0Var = chn0Var.d;
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.statusbar.b bVar = new ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.statusbar.b(thn0Var.b.d(N), thn0Var, N);
        vvo0 vvo0Var = chn0Var.k;
        n0 n0Var = vvo0Var.c;
        tpr t = kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.c(kotlinx.coroutines.flow.e.d((r0) vvo0Var.b.b)));
        vvo0Var.a.getClass();
        return kotlinx.coroutines.flow.e.m(bVar, kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{n0Var, kotlinx.coroutines.flow.e.F(t, uyj.a)}, 2)), chn0Var.l.a(N), kotlinx.coroutines.flow.e.d(chn0Var.j.c(zuo0Var.getSessionId())), new ScootersDetailedOrderV2Interactor$handleModelsState$1(chn0Var, sqm0Var, N, jfn0Var, p6p0Var, zuo0Var, zgn0Var, null));
    }

    @Override // defpackage.ems
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b((sqm0) obj, (jfn0) obj2, (zuo0) obj3, (p6p0) obj4, (zgn0) obj5);
    }
}
