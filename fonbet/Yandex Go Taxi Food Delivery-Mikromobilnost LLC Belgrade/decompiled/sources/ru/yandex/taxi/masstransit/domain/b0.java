package ru.yandex.taxi.masstransit.domain;

import defpackage.i540;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;

    public b0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1 mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1) {
            mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1 = (MtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i540 i540Var = (i540) obj;
                    MtSummaryCommunicationsResponse mtSummaryCommunicationsResponse = !i540Var.a.a.a.a.isEmpty() ? i540Var.a : null;
                    mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.L$0 = null;
                    mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.L$1 = null;
                    mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.L$2 = null;
                    mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.L$3 = null;
                    mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(mtSummaryCommunicationsResponse, mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1 = new MtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPromoMapper$transportPromotionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
