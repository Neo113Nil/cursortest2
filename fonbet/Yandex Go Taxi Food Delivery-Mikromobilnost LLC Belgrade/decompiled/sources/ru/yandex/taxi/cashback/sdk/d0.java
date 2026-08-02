package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.fnx0;
import defpackage.lux0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fnx0 b;

    public d0(vpr vprVar, fnx0 fnx0Var) {
        this.a = vprVar;
        this.b = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1 taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1;
        int i;
        String str;
        lux0 lux0Var;
        pex0 pex0Var;
        List list;
        Object obj2;
        if (continuation instanceof TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1) {
            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1 = (TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1) continuation;
            int i2 = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Boolean bool = (Boolean) obj;
                    fnx0 fnx0Var = this.b;
                    if (fnx0Var != null && (pex0Var = fnx0Var.c) != null && (list = pex0Var.S) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((ServiceLevel.Branding) obj2).getC() == ServiceLevel.Branding.Type.COMPOSITE_PAYMENT_AMOUNT) {
                                break;
                            }
                        }
                        ServiceLevel.Branding branding = (ServiceLevel.Branding) obj2;
                        if (branding != null) {
                            str = branding.getI();
                            lux0Var = new lux0(str, bool);
                            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$0 = null;
                            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$1 = null;
                            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$2 = null;
                            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$3 = null;
                            taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(lux0Var, taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str = null;
                    lux0Var = new lux0(str, bool);
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$0 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$1 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$2 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.L$3 = null;
                    taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lux0Var, taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1 = new TaxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1(this, continuation);
        Object obj32 = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCompositePaymentStateSource$listenSwitchModel$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
