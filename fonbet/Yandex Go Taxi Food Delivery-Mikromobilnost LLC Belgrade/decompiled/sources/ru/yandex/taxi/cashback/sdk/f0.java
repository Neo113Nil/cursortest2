package ru.yandex.taxi.cashback.sdk;

import defpackage.mrd;
import defpackage.mux0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f0 implements vpr {
    public final /* synthetic */ vpr a;

    public f0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiCompositePaymentStateSource$special$$inlined$map$1$2$1 taxiCompositePaymentStateSource$special$$inlined$map$1$2$1;
        int i;
        Boolean bool;
        if (continuation instanceof TaxiCompositePaymentStateSource$special$$inlined$map$1$2$1) {
            taxiCompositePaymentStateSource$special$$inlined$map$1$2$1 = (TaxiCompositePaymentStateSource$special$$inlined$map$1$2$1) continuation;
            int i2 = taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = mux0.a[((mrd) obj).a.ordinal()];
                    if (i3 == 1) {
                        bool = Boolean.TRUE;
                    } else if (i3 == 2) {
                        bool = Boolean.FALSE;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        bool = null;
                    }
                    taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.L$0 = null;
                    taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.L$1 = null;
                    taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.L$2 = null;
                    taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.L$3 = null;
                    taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(bool, taxiCompositePaymentStateSource$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiCompositePaymentStateSource$special$$inlined$map$1$2$1 = new TaxiCompositePaymentStateSource$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCompositePaymentStateSource$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
