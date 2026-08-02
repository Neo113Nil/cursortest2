package defpackage;

/* loaded from: classes15.dex */
public final class sqp0 extends crp0 {
    public final String c;
    public final boolean d;
    public final Throwable e;

    public sqp0(Exception exc, String str, boolean z) {
        super("RemoteConfigError");
        this.c = str;
        this.d = z;
        this.e = exc;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.e;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqp0)) {
            return false;
        }
        sqp0 sqp0Var = (sqp0) obj;
        return jl40.l(this.c, sqp0Var.c) && this.d == sqp0Var.d && jl40.l(this.e, sqp0Var.e);
    }

    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        int e = unr0.e(this.c.hashCode() * 31, 31, this.d);
        Throwable th = this.e;
        return (e + (th == null ? 0 : th.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder l = oo31.l("RemoteConfigError(key=", this.c, ", isLocal=", ", exception=", this.d);
        l.append(this.e);
        l.append(", payload=null)");
        return l.toString();
    }
}
