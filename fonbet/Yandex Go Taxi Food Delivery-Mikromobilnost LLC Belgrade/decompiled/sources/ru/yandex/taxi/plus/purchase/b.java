package ru.yandex.taxi.plus.purchase;

import defpackage.ny61;
import defpackage.u0v0;
import defpackage.vpr;
import defpackage.znp0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1 plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PlusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1) {
            plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1 = (PlusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1) continuation;
            int i2 = plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    znp0 znp0Var = (znp0) obj;
                    u0v0 a = this.b.z.c.a(znp0Var.a, znp0Var.d);
                    plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.L$0 = null;
                    plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.L$1 = null;
                    plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.L$2 = null;
                    plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.L$3 = null;
                    plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1) == coroutineSingletons) {
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
        plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1 = new PlusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPurchasePresenter$observerSubscriptionInfo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
