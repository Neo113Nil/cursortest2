package ru.yandex.taxi.masstransit.domain;

import defpackage.igl0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class x implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ igl0 b;
    public final /* synthetic */ y c;

    public x(tpr tprVar, igl0 igl0Var, y yVar) {
        this.a = tprVar;
        this.b = igl0Var;
        this.c = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1 mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1) {
            mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1 = (MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1) continuation;
            int i2 = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w wVar = new w(vprVar, this.b, this.c);
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.L$0 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.L$1 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.L$2 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(wVar, mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1 = new MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
