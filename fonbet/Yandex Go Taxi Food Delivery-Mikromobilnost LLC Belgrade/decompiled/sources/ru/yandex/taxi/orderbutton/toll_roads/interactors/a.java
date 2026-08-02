package ru.yandex.taxi.orderbutton.toll_roads.interactors;

import defpackage.bj70;
import defpackage.g6u;
import defpackage.gqz0;
import defpackage.hay;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.o400;
import defpackage.opz0;
import defpackage.pex0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vi70;
import defpackage.xi70;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.tollroad.data.e;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class a implements xi70 {
    public final e a;
    public final opz0 b;
    public final gqz0 c;
    public final tt2 d;

    public a(e eVar, opz0 opz0Var, gqz0 gqz0Var, tt2 tt2Var) {
        this.a = eVar;
        this.b = opz0Var;
        this.c = gqz0Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xi70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vi70 vi70Var, Continuation continuation) {
        TollRoadSummaryOrderButtonInteractor$buttonModel$1 tollRoadSummaryOrderButtonInteractor$buttonModel$1;
        int i;
        boolean booleanValue;
        e eVar;
        boolean z;
        if (continuation instanceof TollRoadSummaryOrderButtonInteractor$buttonModel$1) {
            tollRoadSummaryOrderButtonInteractor$buttonModel$1 = (TollRoadSummaryOrderButtonInteractor$buttonModel$1) continuation;
            int i2 = tollRoadSummaryOrderButtonInteractor$buttonModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadSummaryOrderButtonInteractor$buttonModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tollRoadSummaryOrderButtonInteractor$buttonModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadSummaryOrderButtonInteractor$buttonModel$1.label;
                opz0 opz0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (opz0Var.e()) {
                        this.d.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1 tollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1 = new TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1(this, null);
                        tollRoadSummaryOrderButtonInteractor$buttonModel$1.L$0 = vi70Var;
                        tollRoadSummaryOrderButtonInteractor$buttonModel$1.label = 1;
                        obj = tje.k0(g6uVar, tollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1, tollRoadSummaryOrderButtonInteractor$buttonModel$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vi70Var = (vi70) tollRoadSummaryOrderButtonInteractor$buttonModel$1.L$0;
                kotlin.b.b(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                eVar = this.a;
                z = !opz0Var.d().g && ((Boolean) eVar.h.getValue()).booleanValue();
                if ((booleanValue && !eVar.c()) || z) {
                    mi31 mi31Var = vi70Var.a;
                    bj70 bj70Var = vi70Var.b;
                    pex0 pex0Var = mi31Var.a;
                    boolean f = eVar.f();
                    if (!z) {
                        return hay.g(opz0Var.b(opz0Var.d().e.c.a.e), null, bj70Var, pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                    }
                    if (f) {
                        return hay.g(opz0Var.b(opz0Var.d().e.c.a.d), opz0Var.b(opz0Var.d().e.c.c), bj70Var, pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
                    }
                }
                return null;
            }
        }
        tollRoadSummaryOrderButtonInteractor$buttonModel$1 = new TollRoadSummaryOrderButtonInteractor$buttonModel$1(this, (ContinuationImpl) continuation);
        Object obj2 = tollRoadSummaryOrderButtonInteractor$buttonModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadSummaryOrderButtonInteractor$buttonModel$1.label;
        opz0 opz0Var2 = this.b;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        eVar = this.a;
        if (opz0Var2.d().g) {
        }
        if (booleanValue) {
            mi31 mi31Var2 = vi70Var.a;
            bj70 bj70Var2 = vi70Var.b;
            pex0 pex0Var2 = mi31Var2.a;
            boolean f2 = eVar.f();
            if (!z) {
            }
        }
        mi31 mi31Var22 = vi70Var.a;
        bj70 bj70Var22 = vi70Var.b;
        pex0 pex0Var22 = mi31Var22.a;
        boolean f22 = eVar.f();
        if (!z) {
        }
    }

    @Override // defpackage.xi70
    public final String b() {
        return "TollRoadSummaryOrderButtonInteractor";
    }
}
