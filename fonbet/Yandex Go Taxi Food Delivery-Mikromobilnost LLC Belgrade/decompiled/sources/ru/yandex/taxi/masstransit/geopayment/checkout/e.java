package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.a8a0;
import defpackage.ftb1;
import defpackage.i6f;
import defpackage.jl40;
import defpackage.n6f;
import defpackage.ny61;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class e {
    public final ru.yandex.taxi.masstransit.geopayment.checkout.network.a a;

    public e(ru.yandex.taxi.masstransit.geopayment.checkout.network.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentMethod paymentMethod, String str, int i, String str2, String str3, ContinuationImpl continuationImpl) {
        CreatePaymentInteractor$createPayment$1 createPaymentInteractor$createPayment$1;
        int i2;
        if (continuationImpl instanceof CreatePaymentInteractor$createPayment$1) {
            createPaymentInteractor$createPayment$1 = (CreatePaymentInteractor$createPayment$1) continuationImpl;
            int i3 = createPaymentInteractor$createPayment$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                createPaymentInteractor$createPayment$1.label = i3 - Integer.MIN_VALUE;
                Object obj = createPaymentInteractor$createPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = createPaymentInteractor$createPayment$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    n6f n6fVar = new n6f(UUID.randomUUID().toString(), str, new n6f.a(paymentMethod instanceof PaymentMethod.Card ? "card" : jl40.l(paymentMethod, PaymentMethod.GooglePay.INSTANCE) ? "googlepay" : (jl40.l(paymentMethod, PaymentMethod.NewSbpToken.INSTANCE) || jl40.l(paymentMethod, PaymentMethod.Sbp.INSTANCE)) ? "sbp" : paymentMethod instanceof PaymentMethod.SbpToken ? "sbp_token" : paymentMethod instanceof PaymentMethod.YBMethod ? "yandex_card" : "unknown", a8a0.c(paymentMethod)), i, str3 != null ? str2 : null, str3, 128);
                    createPaymentInteractor$createPayment$1.L$0 = null;
                    createPaymentInteractor$createPayment$1.L$1 = null;
                    createPaymentInteractor$createPayment$1.L$2 = null;
                    createPaymentInteractor$createPayment$1.L$3 = null;
                    createPaymentInteractor$createPayment$1.L$4 = null;
                    createPaymentInteractor$createPayment$1.L$5 = null;
                    createPaymentInteractor$createPayment$1.I$0 = i;
                    createPaymentInteractor$createPayment$1.label = 1;
                    obj = this.a.a(n6fVar, createPaymentInteractor$createPayment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ftb1.a((i6f) obj);
            }
        }
        createPaymentInteractor$createPayment$1 = new CreatePaymentInteractor$createPayment$1(this, continuationImpl);
        Object obj2 = createPaymentInteractor$createPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = createPaymentInteractor$createPayment$1.label;
        if (i2 != 0) {
        }
        return ftb1.a((i6f) obj2);
    }
}
