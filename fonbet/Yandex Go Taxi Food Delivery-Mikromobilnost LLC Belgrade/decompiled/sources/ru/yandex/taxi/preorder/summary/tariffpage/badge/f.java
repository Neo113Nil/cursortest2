package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y990;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ y990 b;

    public f(mth mthVar, y990 y990Var) {
        this.a = mthVar;
        this.b = y990Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1 paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1) {
            paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1 = (PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1) continuation;
            int i2 = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.L$0 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.L$1 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.L$2 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1 = new PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
