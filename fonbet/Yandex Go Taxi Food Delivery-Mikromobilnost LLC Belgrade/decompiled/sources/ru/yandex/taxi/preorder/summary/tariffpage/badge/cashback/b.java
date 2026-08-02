package ru.yandex.taxi.preorder.summary.tariffpage.badge.cashback;

import defpackage.h29;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ h29 b;

    public b(mth mthVar, h29 h29Var) {
        this.a = mthVar;
        this.b = h29Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1 cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1) {
            cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1 = (CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1) continuation;
            int i2 = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.L$0 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.L$1 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.L$2 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1 = new CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
