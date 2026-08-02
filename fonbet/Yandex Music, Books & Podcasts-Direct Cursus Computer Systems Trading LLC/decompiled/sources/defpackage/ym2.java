package defpackage;

/* loaded from: classes3.dex */
public final class ym2 {
    public final vm2 a;
    public final wn2 b;

    public ym2(vm2 vm2Var, wn2 wn2Var) {
        this.a = vm2Var;
        this.b = wn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym2)) {
            return false;
        }
        ym2 ym2Var = (ym2) obj;
        return this.a.equals(ym2Var.a) && this.b.equals(ym2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BarAboveColors(bgColors=" + this.a + ", textColors=" + this.b + ")";
    }
}
