package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public final class wi70 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final bj70 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public wi70(int i, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this((i & 1) != 0 ? "" : charSequence, "", (i & 4) != 0 ? "" : charSequence2, bj70.d, (i & 16) != 0, (i & 32) == 0, (i & 64) != 0 ? false : z);
    }

    public static wi70 a(wi70 wi70Var, bj70 bj70Var, int i) {
        return new wi70(wi70Var.a, wi70Var.b, wi70Var.c, bj70Var, (i & 16) != 0 ? wi70Var.e : true, wi70Var.f, wi70Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi70)) {
            return false;
        }
        wi70 wi70Var = (wi70) obj;
        return jl40.l(this.a, wi70Var.a) && jl40.l(this.b, wi70Var.b) && jl40.l(this.c, wi70Var.c) && jl40.l(this.d, wi70Var.d) && this.e == wi70Var.e && this.f == wi70Var.f && this.g == wi70Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.e(unr0.e((this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "OrderButtonModel(title=", ", subtitle=", ", contentDescription=");
        r.append((Object) this.c);
        r.append(", buttonStyle=");
        r.append(this.d);
        r.append(", enabled=");
        nnm.v(", shimmering=", ", hasLargestContent=", r, this.e, this.f);
        return x4e.i(r, this.g, Extension.C_BRAKE);
    }

    public wi70() {
        this(HProv.PP_VERSION_TIMESTAMP, null, null, false);
    }

    public wi70(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, bj70 bj70Var, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = bj70Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }
}
