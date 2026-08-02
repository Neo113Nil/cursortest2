package defpackage;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.v0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class vda0 {
    public final PaymentMethods a;
    public final long b;

    static {
        v0 v0Var = PaymentMethods.Companion;
    }

    public vda0(PaymentMethods paymentMethods, long j) {
        this.a = paymentMethods;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vda0)) {
            return false;
        }
        vda0 vda0Var = (vda0) obj;
        return jl40.l(this.a, vda0Var.a) && this.b == vda0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodsWithRequestTime(paymentMethods=" + this.a + ", startRequestTime=" + this.b + Extension.C_BRAKE;
    }
}
