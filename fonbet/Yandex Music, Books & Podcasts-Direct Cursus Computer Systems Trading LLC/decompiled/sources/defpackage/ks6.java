package defpackage;

/* loaded from: classes5.dex */
public final class ks6 {
    public final String a;
    public final String b;

    public ks6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks6)) {
            return false;
        }
        ks6 ks6Var = (ks6) obj;
        return this.a.equals(ks6Var.a) && this.b.equals(ks6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("CredentialInfo(title=", this.a, ", description=", this.b, ")");
    }
}
