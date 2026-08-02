package defpackage;

/* loaded from: classes2.dex */
public final class sz90 {
    public final String a;
    public final String b;

    public sz90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz90)) {
            return false;
        }
        sz90 sz90Var = (sz90) obj;
        return this.a.equals(sz90Var.a) && this.b.equals(sz90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentErrorHintContent(title=");
        sb.append(this.a);
        sb.append(", description=");
        return b64.p(sb, this.b, ')');
    }
}
