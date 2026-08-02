package ru.yandex.taxi.scooters.data.mapper;

import com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException;
import com.yandex.go.scooters.passes.model.PassPayment;
import com.yandex.go.scooters.passes.model.PassPaymentType;
import defpackage.lea0;
import defpackage.m6a0;
import defpackage.n6a0;
import defpackage.ny61;
import defpackage.pco0;
import defpackage.zgz;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class e {
    public final com.yandex.go.scooters.payments.domain.b a;
    public final n6a0 b;

    public e(com.yandex.go.scooters.payments.domain.b bVar, n6a0 n6a0Var) {
        this.a = bVar;
        this.b = n6a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lea0 lea0Var, boolean z, ContinuationImpl continuationImpl) {
        ScootersPassPaymentMethodMapper$mapToPayment$1 scootersPassPaymentMethodMapper$mapToPayment$1;
        int i;
        PassPaymentType passPaymentType;
        PassPaymentType passPaymentType2;
        if (continuationImpl instanceof ScootersPassPaymentMethodMapper$mapToPayment$1) {
            scootersPassPaymentMethodMapper$mapToPayment$1 = (ScootersPassPaymentMethodMapper$mapToPayment$1) continuationImpl;
            int i2 = scootersPassPaymentMethodMapper$mapToPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassPaymentMethodMapper$mapToPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassPaymentMethodMapper$mapToPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassPaymentMethodMapper$mapToPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentMethod$Type c = lea0Var.c();
                    int i3 = c == null ? -1 : pco0.a[c.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        passPaymentType = PassPaymentType.CARD;
                    } else if (i3 == 3) {
                        passPaymentType = PassPaymentType.GOOGLE_PAY;
                    } else if (i3 == 4) {
                        passPaymentType = PassPaymentType.CORP;
                    } else {
                        if (i3 != 5) {
                            ScootersNoSelectedPaymentMethodException scootersNoSelectedPaymentMethodException = new ScootersNoSelectedPaymentMethodException();
                            zgz.a("Unsupported payment type for scooters passes flow: " + c, scootersNoSelectedPaymentMethodException);
                            throw scootersNoSelectedPaymentMethodException;
                        }
                        passPaymentType = PassPaymentType.NEQUI_TOKEN;
                    }
                    m6a0 b = n6a0.b(this.b, lea0Var);
                    scootersPassPaymentMethodMapper$mapToPayment$1.L$0 = lea0Var;
                    scootersPassPaymentMethodMapper$mapToPayment$1.L$1 = null;
                    scootersPassPaymentMethodMapper$mapToPayment$1.L$2 = passPaymentType;
                    scootersPassPaymentMethodMapper$mapToPayment$1.L$3 = null;
                    scootersPassPaymentMethodMapper$mapToPayment$1.Z$0 = z;
                    scootersPassPaymentMethodMapper$mapToPayment$1.label = 1;
                    Object a = this.a.a(b, scootersPassPaymentMethodMapper$mapToPayment$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    PassPaymentType passPaymentType3 = passPaymentType;
                    obj = a;
                    passPaymentType2 = passPaymentType3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = scootersPassPaymentMethodMapper$mapToPayment$1.Z$0;
                    passPaymentType2 = (PassPaymentType) scootersPassPaymentMethodMapper$mapToPayment$1.L$2;
                    lea0Var = (lea0) scootersPassPaymentMethodMapper$mapToPayment$1.L$0;
                    kotlin.b.b(obj);
                }
                String str = (String) obj;
                boolean z2 = (z || passPaymentType2 == PassPaymentType.CORP) ? false : true;
                if (passPaymentType2 != PassPaymentType.GOOGLE_PAY) {
                    str = lea0Var.getId();
                }
                return new PassPayment(passPaymentType2, str, z2);
            }
        }
        scootersPassPaymentMethodMapper$mapToPayment$1 = new ScootersPassPaymentMethodMapper$mapToPayment$1(this, continuationImpl);
        Object obj2 = scootersPassPaymentMethodMapper$mapToPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassPaymentMethodMapper$mapToPayment$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (z) {
        }
        if (passPaymentType2 != PassPaymentType.GOOGLE_PAY) {
        }
        return new PassPayment(passPaymentType2, str2, z2);
    }
}
