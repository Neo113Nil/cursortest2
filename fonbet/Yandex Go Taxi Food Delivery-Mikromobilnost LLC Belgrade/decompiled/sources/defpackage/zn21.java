package defpackage;

/* loaded from: classes14.dex */
public final class zn21 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final int d;
    public final boolean e;
    public final bv11 f;

    public zn21(CharSequence charSequence, String str, String str2, int i, boolean z, bv11 bv11Var) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
        this.f = bv11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn21)) {
            return false;
        }
        zn21 zn21Var = (zn21) obj;
        return jl40.l(this.a, zn21Var.a) && jl40.l(this.b, zn21Var.b) && jl40.l(this.c, zn21Var.c) && this.d == zn21Var.d && this.e == zn21Var.e && jl40.l(this.f, zn21Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(oyr.b(this.d, unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
