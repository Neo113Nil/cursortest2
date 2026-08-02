package defpackage;

/* loaded from: classes11.dex */
public final class zku0 extends vgb1 {
    public final String a;
    public final boolean b;

    public zku0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zku0)) {
            return false;
        }
        zku0 zku0Var = (zku0) obj;
        return jl40.l(this.a, zku0Var.a) && this.b == zku0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanStoredValue(name=");
        sb.append(this.a);
        sb.append(", value=");
        return unr0.u(sb, this.b, ')');
    }
}
