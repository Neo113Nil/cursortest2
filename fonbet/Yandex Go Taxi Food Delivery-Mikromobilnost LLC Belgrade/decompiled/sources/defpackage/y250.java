package defpackage;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;

/* loaded from: classes2.dex */
public final class y250 {
    public final PlusPaySdkAdapter$CompositeOffer a;
    public final boolean b;
    public final String c;

    public y250(PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, boolean z, String str) {
        this.a = plusPaySdkAdapter$CompositeOffer;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y250)) {
            return false;
        }
        y250 y250Var = (y250) obj;
        return jl40.l(this.a, y250Var.a) && this.b == y250Var.b && this.c.equals(y250Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeButtonOffer(compositeOffer=");
        sb.append(this.a);
        sb.append(", canStartAutoPayment=");
        sb.append(this.b);
        sb.append(", trackId=");
        return b64.p(sb, this.c, ')');
    }
}
