package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayPaymentGatewayErrorKind;

/* loaded from: classes2.dex */
public final class znd0 implements cod0 {
    public final PlusPayPaymentGatewayErrorKind a;

    public znd0(PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind) {
        this.a = plusPayPaymentGatewayErrorKind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znd0) && this.a == ((znd0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentGateway(kind=" + this.a + ')';
    }
}
