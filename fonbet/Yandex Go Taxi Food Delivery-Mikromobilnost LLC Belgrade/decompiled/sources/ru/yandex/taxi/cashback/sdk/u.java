package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.chargers.domain.ChargersCompositePaymentInteractor$ChargersCompositePaymentState;
import defpackage.fux0;
import defpackage.ny61;
import defpackage.r2c;
import defpackage.s2c;
import defpackage.t2c;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public u(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1 taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1;
        int i;
        Boolean bool;
        if (continuation instanceof TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1) {
            taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1 = (TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1) continuation;
            int i2 = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ChargersCompositePaymentInteractor$ChargersCompositePaymentState chargersCompositePaymentInteractor$ChargersCompositePaymentState = (ChargersCompositePaymentInteractor$ChargersCompositePaymentState) obj;
                    int i3 = fux0.a[chargersCompositePaymentInteractor$ChargersCompositePaymentState.ordinal()];
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
                    t2c t2cVar = new t2c(this.b, "", "", s2c.c, EmptyList.a, chargersCompositePaymentInteractor$ChargersCompositePaymentState == ChargersCompositePaymentInteractor$ChargersCompositePaymentState.DISABLED, bool != null ? new r2c("", bool.booleanValue()) : null);
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.L$0 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.L$1 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.L$2 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.L$3 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(t2cVar, taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1 = new TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
