package defpackage;

/* loaded from: classes12.dex */
public final class tnf0 {
    public final unf0 a;
    public final boolean b;

    public tnf0(unf0 unf0Var, boolean z) {
        this.a = unf0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnf0)) {
            return false;
        }
        tnf0 tnf0Var = (tnf0) obj;
        return this.a.equals(tnf0Var.a) && this.b == tnf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }
}
