package ru.yandex.taxi.summary.promotions.interactor;

import defpackage.bvf0;
import defpackage.e0e;
import defpackage.j0e;
import defpackage.jl40;
import defpackage.m0e;
import defpackage.mnv0;
import defpackage.n0e;
import defpackage.nmv0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.r0e;
import defpackage.s0e;
import defpackage.sfj;
import defpackage.t0e;
import defpackage.tfj;
import defpackage.w511;
import defpackage.xfj;
import defpackage.yp2;
import defpackage.zkv0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class a {
    public final e a;
    public final pdc b;
    public final mnv0 c;
    public final yp2 d;

    public a(e eVar, pdc pdcVar, mnv0 mnv0Var, yp2 yp2Var) {
        this.a = eVar;
        this.b = pdcVar;
        this.c = mnv0Var;
        this.d = yp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nmv0 nmv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, ContinuationImpl continuationImpl) {
        SummaryDialogueConverter$prepareDialogToShow$1 summaryDialogueConverter$prepareDialogToShow$1;
        int i;
        a aVar;
        SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState2;
        SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState3;
        if (continuationImpl instanceof SummaryDialogueConverter$prepareDialogToShow$1) {
            summaryDialogueConverter$prepareDialogToShow$1 = (SummaryDialogueConverter$prepareDialogToShow$1) continuationImpl;
            int i2 = summaryDialogueConverter$prepareDialogToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryDialogueConverter$prepareDialogToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryDialogueConverter$prepareDialogToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryDialogueConverter$prepareDialogToShow$1.label;
                j0e j0eVar = null;
                sfj sfjVar = sfj.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    summaryDialogueConverter$prepareDialogToShow$1.L$0 = nmv0Var;
                    summaryDialogueConverter$prepareDialogToShow$1.L$1 = summaryPromotionsAnalytics$SummaryState;
                    summaryDialogueConverter$prepareDialogToShow$1.label = 1;
                    if (nmv0Var != null) {
                        zkv0 zkv0Var = nmv0Var.a;
                        t0e t0eVar = zkv0Var.j;
                        if (t0eVar instanceof j0e) {
                            j0eVar = (j0e) t0eVar;
                        } else if (!(t0eVar instanceof m0e) && !jl40.l(t0eVar, e0e.INSTANCE) && !jl40.l(t0eVar, s0e.INSTANCE) && !(t0eVar instanceof r0e) && !(t0eVar instanceof n0e)) {
                            w511.b();
                            return null;
                        }
                        j0e j0eVar2 = j0eVar;
                        if (j0eVar2 != null) {
                            if (nmv0Var.b) {
                                obj = tfj.a;
                                aVar = this;
                                summaryPromotionsAnalytics$SummaryState2 = summaryPromotionsAnalytics$SummaryState;
                            } else {
                                aVar = this;
                                summaryPromotionsAnalytics$SummaryState2 = summaryPromotionsAnalytics$SummaryState;
                                obj = bvf0.n(new SummaryDialogueConverter$extractDialog$2(aVar, j0eVar2, zkv0Var, summaryPromotionsAnalytics$SummaryState2, null), summaryDialogueConverter$prepareDialogToShow$1);
                            }
                            if (obj != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            summaryPromotionsAnalytics$SummaryState3 = summaryPromotionsAnalytics$SummaryState2;
                        }
                    }
                    aVar = this;
                    summaryPromotionsAnalytics$SummaryState2 = summaryPromotionsAnalytics$SummaryState;
                    obj = sfjVar;
                    if (obj != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    summaryPromotionsAnalytics$SummaryState3 = (SummaryPromotionsAnalytics$SummaryState) summaryDialogueConverter$prepareDialogToShow$1.L$1;
                    nmv0Var = (nmv0) summaryDialogueConverter$prepareDialogToShow$1.L$0;
                    kotlin.b.b(obj);
                    aVar = this;
                }
                xfj xfjVar = (xfj) obj;
                if (nmv0Var != null && !jl40.l(xfjVar, sfjVar)) {
                    aVar.c.f.c(nmv0Var.a, summaryPromotionsAnalytics$SummaryState3);
                }
                return xfjVar;
            }
        }
        summaryDialogueConverter$prepareDialogToShow$1 = new SummaryDialogueConverter$prepareDialogToShow$1(this, continuationImpl);
        Object obj2 = summaryDialogueConverter$prepareDialogToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryDialogueConverter$prepareDialogToShow$1.label;
        j0e j0eVar3 = null;
        sfj sfjVar2 = sfj.a;
        if (i != 0) {
        }
        xfj xfjVar2 = (xfj) obj2;
        if (nmv0Var != null) {
            aVar.c.f.c(nmv0Var.a, summaryPromotionsAnalytics$SummaryState3);
        }
        return xfjVar2;
    }
}
