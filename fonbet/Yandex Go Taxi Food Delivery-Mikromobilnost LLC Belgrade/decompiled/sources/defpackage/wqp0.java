package defpackage;

/* loaded from: classes15.dex */
public final class wqp0 extends crp0 {
    public final int c;
    public final String d;
    public final String e;

    public wqp0(int i, String str, String str2) {
        super("TooHeavyImage");
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqp0)) {
            return false;
        }
        wqp0 wqp0Var = (wqp0) obj;
        return this.c == wqp0Var.c && jl40.l(this.d, wqp0Var.d) && this.e.equals(wqp0Var.e);
    }

    public final int f() {
        return this.c;
    }

    public final int hashCode() {
        return unr0.b(unr0.b(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.c, "TooHeavyImage(imageSizeInKb=", ", headers=", this.d, ", url="), this.e, ", payload=null)");
    }
}
