package defpackage;

/* loaded from: classes13.dex */
public final class vec0 implements yec0 {
    public final uec0 a;

    public vec0(uec0 uec0Var) {
        this.a = uec0Var;
    }

    @Override // defpackage.yec0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vec0) && jl40.l(this.a, ((vec0) obj).a);
    }

    @Override // defpackage.yec0
    public final uec0 getState() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Hidden(state=" + this.a + ", isHapticEnabled=false)";
    }
}
