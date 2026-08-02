package defpackage;

/* loaded from: classes15.dex */
public final class rqp0 extends crp0 {
    public final Throwable c;
    public final String d;

    public rqp0(Throwable th, String str) {
        super("PinStorageError");
        this.c = th;
        this.d = str;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.c;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqp0)) {
            return false;
        }
        rqp0 rqp0Var = (rqp0) obj;
        return this.c.equals(rqp0Var.c) && this.d.equals(rqp0Var.d);
    }

    public final int hashCode() {
        return unr0.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        return "PinStorageError(exception=" + this.c + ", mode=" + this.d + ", payload=null)";
    }
}
