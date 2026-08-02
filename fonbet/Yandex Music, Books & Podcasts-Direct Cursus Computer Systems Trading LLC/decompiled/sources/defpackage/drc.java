package defpackage;

/* loaded from: classes3.dex */
public final class drc {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public drc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drc)) {
            return false;
        }
        drc drcVar = (drc) obj;
        return this.a == drcVar.a && this.b == drcVar.b && this.c == drcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(eta.j("ForegroundState(foreground=", this.a, ", started=", this.b, ", resumed="), this.c, ")");
    }
}
