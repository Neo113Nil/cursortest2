package defpackage;

/* loaded from: classes.dex */
public final class sns0 {
    public final tls a;
    public final qar b;

    public sns0(qar qarVar, tls tlsVar) {
        this.a = tlsVar;
        this.b = qarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sns0)) {
            return false;
        }
        sns0 sns0Var = (sns0) obj;
        return this.a.equals(sns0Var.a) && jl40.l(this.b, sns0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
