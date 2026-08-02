package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w0f0 implements c1f0 {
    public final String a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final npw0 e;

    public w0f0(String str, boolean z, int i, boolean z2, npw0 npw0Var) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = npw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0f0)) {
            return false;
        }
        w0f0 w0f0Var = (w0f0) obj;
        return jl40.l(this.a, w0f0Var.a) && this.b == w0f0Var.b && this.c == w0f0Var.c && this.d == w0f0Var.d && jl40.l(this.e, w0f0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int e = unr0.e(oyr.b(this.c, unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31), 31, this.d);
        npw0 npw0Var = this.e;
        return e + (npw0Var != null ? npw0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Default(price=", this.a, ", isLoading=", ", color=", this.b);
        tse0.z(l, this.c, ", hasSurge=", this.d, ", surgeIconInfo=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
