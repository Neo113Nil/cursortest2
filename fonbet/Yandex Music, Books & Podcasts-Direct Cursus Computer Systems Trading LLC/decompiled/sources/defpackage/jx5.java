package defpackage;

/* loaded from: classes3.dex */
public final class jx5 implements kx5 {
    public final ov5 a;
    public final boolean b;

    public jx5(ov5 ov5Var, boolean z) {
        this.a = ov5Var;
        this.b = z;
    }

    @Override // defpackage.kx5
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx5)) {
            return false;
        }
        jx5 jx5Var = (jx5) obj;
        return this.a.equals(jx5Var.a) && this.b == jx5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "City(location=" + this.a + ", isSelected=" + this.b + ")";
    }
}
