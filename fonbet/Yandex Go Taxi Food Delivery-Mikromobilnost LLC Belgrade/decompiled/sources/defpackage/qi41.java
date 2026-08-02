package defpackage;

/* loaded from: classes2.dex */
public final class qi41 implements vi41 {
    public final String a;
    public final boolean b;

    public qi41(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi41)) {
            return false;
        }
        qi41 qi41Var = (qi41) obj;
        return this.a.equals(qi41Var.a) && this.b == qi41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenUri(uri=");
        sb.append(this.a);
        sb.append(", requireAuthorization=");
        return unr0.u(sb, this.b, ')');
    }
}
