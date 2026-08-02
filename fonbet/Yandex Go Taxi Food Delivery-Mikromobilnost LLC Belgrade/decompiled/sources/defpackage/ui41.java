package defpackage;

/* loaded from: classes2.dex */
public final class ui41 implements vi41 {
    public final String a;

    public ui41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui41) && this.a.equals(((ui41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("YbOpenCardSuccess(paymentMethodId="), this.a, ')');
    }
}
