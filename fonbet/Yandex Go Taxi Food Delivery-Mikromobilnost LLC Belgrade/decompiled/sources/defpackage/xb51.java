package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class xb51 {
    public static final vb51 Companion = new vb51();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;

    public /* synthetic */ xb51(int i, int i2, String str, int i3, int i4, String str2, String str3, String str4, int i5, int i6, String str5) {
        if (1023 != (i & 1023)) {
            qje.Z(i, 1023, tb51.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = i4;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i5;
        this.i = i6;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb51)) {
            return false;
        }
        xb51 xb51Var = (xb51) obj;
        return this.a == xb51Var.a && jl40.l(this.b, xb51Var.b) && this.c == xb51Var.c && this.d == xb51Var.d && jl40.l(this.e, xb51Var.e) && jl40.l(this.f, xb51Var.f) && jl40.l(this.g, xb51Var.g) && this.h == xb51Var.h && this.i == xb51Var.i && jl40.l(this.j, xb51Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + oyr.b(this.i, oyr.b(this.h, unr0.b(unr0.b(unr0.b(oyr.b(this.d, oyr.b(this.c, unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "WriteCardKey(block=", ", value=", this.b, ", readKeyId=");
        vfc.u(this.c, this.d, ", readKeyVersion=", ", readKeyValue=", v);
        g8e.D(v, this.e, ", readKeyType=", this.f, ", writeKeyType=");
        b64.A(this.h, this.g, ", writeKeyId=", ", writeKeyVersion=", v);
        return xvz.h(this.i, ", writeKeyValue=", this.j, Extension.C_BRAKE, v);
    }
}
