package defpackage;

import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;

/* loaded from: classes2.dex */
public final class zod0 implements bpd0 {
    public final PlusPaymentFlowErrorReason a;
    public final boolean b;

    public zod0(PlusPaymentFlowErrorReason plusPaymentFlowErrorReason, boolean z) {
        this.a = plusPaymentFlowErrorReason;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zod0)) {
            return false;
        }
        zod0 zod0Var = (zod0) obj;
        return jl40.l(this.a, zod0Var.a) && this.b == zod0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentError(reason=");
        sb.append(this.a);
        sb.append(", errorScreenSkipped=");
        return x4e.i(sb, this.b, ", payload=null, failedToStart=false)");
    }
}
