package defpackage;

import com.yandex.plus.core.data.pay.PlusPaymentMethod;

/* loaded from: classes2.dex */
public final class z6a0 implements a7a0 {
    public final PlusPaymentMethod a;

    public z6a0(PlusPaymentMethod plusPaymentMethod) {
        this.a = plusPaymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6a0) && this.a.equals(((z6a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(paymentMethod=" + this.a + ')';
    }
}
