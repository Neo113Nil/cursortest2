package ru.yandex.taxi.cashback.sdk;

import defpackage.fnx0;
import defpackage.j49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j49 c;
    public final /* synthetic */ fnx0 w;

    public f(tpr tprVar, boolean z, j49 j49Var, fnx0 fnx0Var) {
        this.a = tprVar;
        this.b = z;
        this.c = j49Var;
        this.w = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CashbackTariffContextInteractor$tariffContext$$inlined$map$1$1 cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1;
        int i;
        if (continuation instanceof CashbackTariffContextInteractor$tariffContext$$inlined$map$1$1) {
            cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1 = (CashbackTariffContextInteractor$tariffContext$$inlined$map$1$1) continuation;
            int i2 = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c, this.w);
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.L$0 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.L$1 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.L$2 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1) == coroutineSingletons) {
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
        cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1 = new CashbackTariffContextInteractor$tariffContext$$inlined$map$1$1(this, continuation);
        Object obj2 = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
