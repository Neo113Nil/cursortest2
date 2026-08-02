package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.e4a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;

    public w(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1 taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1) {
            taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1 = (TaxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1) continuation;
            int i2 = taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e4a0 r = ((TaxiOrder) obj).r();
                    taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.L$0 = null;
                    taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.L$1 = null;
                    taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.L$2 = null;
                    taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.L$3 = null;
                    taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(r, taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1 = new TaxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
