package defpackage;

/* loaded from: classes5.dex */
public final class hxc {
    public final s84 a;
    public final boolean b;

    public hxc(s84 s84Var) {
        this.a = s84Var;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxc)) {
            return false;
        }
        hxc hxcVar = (hxc) obj;
        return this.a == hxcVar.a && this.b == hxcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FullCastState(castState=" + this.a + ", isError=" + this.b + ")";
    }

    public hxc(s84 s84Var, boolean z) {
        this.a = s84Var;
        this.b = z;
    }
}
