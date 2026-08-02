package defpackage;

/* loaded from: classes3.dex */
public final class n00 implements m00 {
    public final boolean a;
    public final mt b;

    public n00(boolean z, mt mtVar) {
        this.a = z;
        this.b = mtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        return this.a == n00Var.a && this.b.equals(n00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ModalDisclaimer(showLoadingScreen=" + this.a + ", albumFull=" + this.b + ")";
    }
}
