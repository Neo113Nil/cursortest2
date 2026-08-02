package defpackage;

/* loaded from: classes2.dex */
public final class z8a0 implements b9a0 {
    public final ked0 a;

    public z8a0(ked0 ked0Var) {
        this.a = ked0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8a0) && jl40.l(this.a, ((z8a0) obj).a);
    }

    @Override // defpackage.b9a0
    public final String getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentMethod(content=" + this.a + ')';
    }
}
