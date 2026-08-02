package ru.yandex.taxi.logistics.sdk.pay_on_delivery;

import defpackage.cc7;
import defpackage.mea0;
import defpackage.ny61;
import defpackage.phi;
import defpackage.rol0;
import defpackage.uhi;
import defpackage.v4r0;
import defpackage.vhi;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext.PaymentContextDto;

/* loaded from: classes5.dex */
public final class a {
    public final vhi a;
    public final phi b;

    public a(vhi vhiVar, phi phiVar) {
        this.a = vhiVar;
        this.b = phiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, mea0 mea0Var, ContinuationImpl continuationImpl) {
        DeliveryPayNowInteractorImpl$payNow$1 deliveryPayNowInteractorImpl$payNow$1;
        int i;
        Object value;
        String str2;
        r0 r0Var;
        Object value2;
        if (continuationImpl instanceof DeliveryPayNowInteractorImpl$payNow$1) {
            deliveryPayNowInteractorImpl$payNow$1 = (DeliveryPayNowInteractorImpl$payNow$1) continuationImpl;
            int i2 = deliveryPayNowInteractorImpl$payNow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPayNowInteractorImpl$payNow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPayNowInteractorImpl$payNow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPayNowInteractorImpl$payNow$1.label;
                phi phiVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var2 = phiVar.a;
                    do {
                        value = r0Var2.getValue();
                    } while (!r0Var2.k(value, v4r0.i((Set) value, str)));
                    PaymentContextDto paymentContextDto = new PaymentContextDto(mea0Var.b, mea0Var.a);
                    deliveryPayNowInteractorImpl$payNow$1.L$0 = str;
                    deliveryPayNowInteractorImpl$payNow$1.L$1 = null;
                    deliveryPayNowInteractorImpl$payNow$1.label = 1;
                    vhi vhiVar = this.a;
                    vhiVar.getClass();
                    String uuid = UUID.randomUUID().toString();
                    obj = e.y(e.F(e.K(new rol0(new DeliveryPayNowTask$getPayNowPollingFlow$1(str, uuid, paymentContextDto, vhiVar, null)), new cc7(vhiVar.b.a(), uuid, 4)), vhiVar.d.b), deliveryPayNowInteractorImpl$payNow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) deliveryPayNowInteractorImpl$payNow$1.L$0;
                    kotlin.b.b(obj);
                }
                uhi uhiVar = (uhi) obj;
                r0Var = phiVar.a;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, v4r0.f((Set) value2, str2)));
                return uhiVar;
            }
        }
        deliveryPayNowInteractorImpl$payNow$1 = new DeliveryPayNowInteractorImpl$payNow$1(this, continuationImpl);
        Object obj2 = deliveryPayNowInteractorImpl$payNow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPayNowInteractorImpl$payNow$1.label;
        phi phiVar2 = this.b;
        if (i != 0) {
        }
        uhi uhiVar2 = (uhi) obj2;
        r0Var = phiVar2.a;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, v4r0.f((Set) value2, str2)));
        return uhiVar2;
    }
}
