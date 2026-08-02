package defpackage;

/* loaded from: classes11.dex */
public final class vfk extends xfk {
    public final q5i0 a;
    public final q5i0 b;
    public final kic c;
    public final u5i0 d;

    public vfk(q5i0 q5i0Var, q5i0 q5i0Var2, kic kicVar, u5i0 u5i0Var) {
        this.a = q5i0Var;
        this.b = q5i0Var2;
        this.c = kicVar;
        this.d = u5i0Var;
    }

    public final q5i0 a() {
        return this.a;
    }

    public final q5i0 b() {
        return this.b;
    }

    public final kic c() {
        return this.c;
    }

    public final u5i0 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfk)) {
            return false;
        }
        vfk vfkVar = (vfk) obj;
        return this.a.equals(vfkVar.a) && this.b.equals(vfkVar.b) && jl40.l(this.c, vfkVar.c) && this.d.equals(vfkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RadialGradient(centerX=" + this.a + ", centerY=" + this.b + ", colormap=" + this.c + ", radius=" + this.d + ')';
    }
}
