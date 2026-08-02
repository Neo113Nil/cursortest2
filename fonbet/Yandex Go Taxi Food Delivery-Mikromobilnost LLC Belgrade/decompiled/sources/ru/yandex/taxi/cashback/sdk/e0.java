package ru.yandex.taxi.cashback.sdk;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class e0 implements tpr {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ fnx0 b;

    public e0(g0 g0Var, fnx0 fnx0Var) {
        this.a = g0Var;
        this.b = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1 taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1) {
            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1 = (TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1) continuation;
            int i2 = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(vprVar, this.b);
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.L$0 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.L$1 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.L$2 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.label = 1;
                    if (this.a.collect(d0Var, taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1 = new TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
