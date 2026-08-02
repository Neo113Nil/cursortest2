package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment;
import defpackage.c4r0;
import defpackage.cjj0;
import defpackage.ck31;
import defpackage.dqe0;
import defpackage.f2s;
import defpackage.fnx0;
import defpackage.g2s;
import defpackage.g6u;
import defpackage.gnx0;
import defpackage.h3y;
import defpackage.hqj0;
import defpackage.i2s;
import defpackage.jbh;
import defpackage.mdh;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oep0;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.slh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class y {
    public final hqj0 a;
    public final dqe0 b;
    public final cjj0 c;
    public final i2s d;
    public final c4r0 e;
    public final slh f;
    public final ck31 g;
    public final tt2 h;
    public final oep0 i;
    public final yvf0 j;
    public final h3y k;
    public final tpr l;

    public y(rqo rqoVar, hqj0 hqj0Var, dqe0 dqe0Var, cjj0 cjj0Var, i2s i2sVar, c4r0 c4r0Var, slh slhVar, ck31 ck31Var, tt2 tt2Var, oep0 oep0Var, yvf0 yvf0Var, h3y h3yVar) {
        this.a = hqj0Var;
        this.b = dqe0Var;
        this.c = cjj0Var;
        this.d = i2sVar;
        this.e = c4r0Var;
        this.f = slhVar;
        this.g = ck31Var;
        this.h = tt2Var;
        this.i = oep0Var;
        this.j = yvf0Var;
        this.k = h3yVar;
        this.l = ((jbh) rqoVar).c(ForceTariffSwitchForIntercityOrdersExperiment.k).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r11 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ForceTariffSwitchOrderInteractor$onSummaryShown$1 forceTariffSwitchOrderInteractor$onSummaryShown$1;
        int i;
        g2s g2sVar;
        f2s f2sVar;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ForceTariffSwitchOrderInteractor$onSummaryShown$1) {
            forceTariffSwitchOrderInteractor$onSummaryShown$1 = (ForceTariffSwitchOrderInteractor$onSummaryShown$1) continuationImpl;
            int i2 = forceTariffSwitchOrderInteractor$onSummaryShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceTariffSwitchOrderInteractor$onSummaryShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forceTariffSwitchOrderInteractor$onSummaryShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceTariffSwitchOrderInteractor$onSummaryShown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.h.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1 forceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1 = new ForceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1(this, null);
                    forceTariffSwitchOrderInteractor$onSummaryShown$1.label = 1;
                    obj = tje.k0(mdhVar, forceTariffSwitchOrderInteractor$onSummaryShown$tariffSwitchInfo$1, forceTariffSwitchOrderInteractor$onSummaryShown$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                g2sVar = (g2s) obj;
                if (g2sVar != null) {
                    slh slhVar = this.f;
                    String str = g2sVar.a.b;
                    mi31 mi31Var = g2sVar.b;
                    ConcurrentHashMap concurrentHashMap = slhVar.b;
                    if (mi31Var == null) {
                        concurrentHashMap.remove(str);
                    } else {
                        concurrentHashMap.put(str, mi31Var);
                    }
                    this.d.a.a = true;
                    this.e.a(new gnx0(new fnx0(g2sVar.a, "", SelectionOrigin.FORCE_TARIFF_SWITCH_FOR_INTERCITY_ORDERS_EXPERIMENT), false));
                    if (!this.d.a.b && (f2sVar = g2sVar.c) != null) {
                        this.h.getClass();
                        sjh sjhVar2 = uyj.a;
                        g6u g6uVar = o400.a;
                        ForceTariffSwitchOrderInteractor$onSummaryShown$2 forceTariffSwitchOrderInteractor$onSummaryShown$2 = new ForceTariffSwitchOrderInteractor$onSummaryShown$2(f2sVar, this, g2sVar, null);
                        forceTariffSwitchOrderInteractor$onSummaryShown$1.L$0 = null;
                        forceTariffSwitchOrderInteractor$onSummaryShown$1.L$1 = null;
                        forceTariffSwitchOrderInteractor$onSummaryShown$1.label = 2;
                        if (tje.k0(g6uVar, forceTariffSwitchOrderInteractor$onSummaryShown$2, forceTariffSwitchOrderInteractor$onSummaryShown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11Var;
            }
        }
        forceTariffSwitchOrderInteractor$onSummaryShown$1 = new ForceTariffSwitchOrderInteractor$onSummaryShown$1(this, continuationImpl);
        Object obj2 = forceTariffSwitchOrderInteractor$onSummaryShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceTariffSwitchOrderInteractor$onSummaryShown$1.label;
        if (i != 0) {
        }
        g2sVar = (g2s) obj2;
        if (g2sVar != null) {
        }
        return zy11Var;
    }
}
