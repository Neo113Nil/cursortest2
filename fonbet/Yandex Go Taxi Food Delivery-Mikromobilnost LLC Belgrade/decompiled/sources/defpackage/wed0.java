package defpackage;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;

/* loaded from: classes2.dex */
public final class wed0 implements yed0 {
    public final PlusPaySdkAdapter$PaymentFlowErrorReason a;

    public wed0(PlusPaySdkAdapter$PaymentFlowErrorReason plusPaySdkAdapter$PaymentFlowErrorReason) {
        this.a = plusPaySdkAdapter$PaymentFlowErrorReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wed0) && jl40.l(this.a, ((wed0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ')';
    }
}
