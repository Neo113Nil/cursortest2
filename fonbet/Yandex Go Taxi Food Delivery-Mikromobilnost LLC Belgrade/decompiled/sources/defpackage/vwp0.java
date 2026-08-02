package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vwp0 {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final nvi0 f;
    public final nvi0 g;
    public final au2 h;

    public /* synthetic */ vwp0(String str, String str2, String str3, String str4, ovi0 ovi0Var, au2 au2Var, int i) {
        this((i & 1) != 0 ? "" : str, str2, str3, false, (i & 16) != 0 ? null : str4, ovi0Var, null, au2Var);
    }

    public static vwp0 a(vwp0 vwp0Var, CharSequence charSequence, boolean z, String str, nvi0 nvi0Var) {
        String str2 = vwp0Var.b;
        String str3 = vwp0Var.c;
        nvi0 nvi0Var2 = vwp0Var.f;
        au2 au2Var = vwp0Var.h;
        vwp0Var.getClass();
        return new vwp0(charSequence, str2, str3, z, str, nvi0Var2, nvi0Var, au2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwp0)) {
            return false;
        }
        vwp0 vwp0Var = (vwp0) obj;
        return jl40.l(this.a, vwp0Var.a) && jl40.l(this.b, vwp0Var.b) && jl40.l(this.c, vwp0Var.c) && this.d == vwp0Var.d && jl40.l(this.e, vwp0Var.e) && jl40.l(this.f, vwp0Var.f) && jl40.l(this.g, vwp0Var.g) && jl40.l(this.h, vwp0Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        nvi0 nvi0Var = this.f;
        int hashCode2 = (hashCode + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31;
        nvi0 nvi0Var2 = this.g;
        return this.h.hashCode() + ((hashCode2 + (nvi0Var2 != null ? nvi0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(value=");
        sb.append((Object) this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", label=");
        tse0.y(this.c, ", confirmed=", ", id=", sb, this.d);
        sb.append(this.e);
        sb.append(", defaultIcon=");
        sb.append(this.f);
        sb.append(", confirmedIcon=");
        sb.append(this.g);
        sb.append(", fallbackIcon=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public vwp0(CharSequence charSequence, String str, String str2, boolean z, String str3, nvi0 nvi0Var, nvi0 nvi0Var2, au2 au2Var) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = nvi0Var;
        this.g = nvi0Var2;
        this.h = au2Var;
    }
}
