package defpackage;

/* loaded from: classes8.dex */
public final class urc0 {
    public final roc0 a;
    public final long b;

    public urc0(roc0 roc0Var, long j) {
        this.a = roc0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urc0)) {
            return false;
        }
        urc0 urc0Var = (urc0) obj;
        return this.a.equals(urc0Var.a) && e3n.d(this.b, urc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "PlaqueUiState(model=" + this.a + ", animationDuration=" + ((Object) e3n.p(this.b)) + ')';
    }
}
