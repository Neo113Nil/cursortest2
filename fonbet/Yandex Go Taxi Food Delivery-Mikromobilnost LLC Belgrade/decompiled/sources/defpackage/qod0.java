package defpackage;

/* loaded from: classes2.dex */
public final class qod0 implements uod0 {
    public final String a;
    public final String b;

    public qod0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qod0)) {
            return false;
        }
        qod0 qod0Var = (qod0) obj;
        return jl40.l(this.a, qod0Var.a) && jl40.l(this.b, qod0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(invoiceId=");
        sb.append(this.a);
        sb.append(", paymentMethodId=");
        return b64.p(sb, this.b, ')');
    }
}
