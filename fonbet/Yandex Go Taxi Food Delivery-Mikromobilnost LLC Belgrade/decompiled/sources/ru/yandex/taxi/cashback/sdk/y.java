package ru.yandex.taxi.cashback.sdk;

import defpackage.e4a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes9.dex */
public final class y implements vpr {
    public final /* synthetic */ vpr a;

    public y(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1 taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1;
        int i;
        PaymentMethod$Type a;
        if (continuation instanceof TaxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1) {
            taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1 = (TaxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1) continuation;
            int i2 = taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e4a0 e4a0Var = (e4a0) obj;
                    String code = (e4a0Var == null || (a = e4a0Var.a()) == null) ? null : a.getCode();
                    if (code == null) {
                        code = "";
                    }
                    taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.L$0 = null;
                    taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.L$1 = null;
                    taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.L$2 = null;
                    taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.L$3 = null;
                    taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(code, taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1 = new TaxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiClientContextRepository$getTaxiClientContextFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
