package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ua31 {
    public final String a;
    public final wp2 b;
    public final wp2 c;
    public final wp2 d;
    public final Float e;
    public final String f;

    public ua31(String str, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, Float f, String str2) {
        this.a = str;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = wp2Var3;
        this.e = f;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua31)) {
            return false;
        }
        ua31 ua31Var = (ua31) obj;
        return this.a.equals(ua31Var.a) && jl40.l(this.b, ua31Var.b) && jl40.l(this.c, ua31Var.c) && jl40.l(this.d, ua31Var.d) && jl40.l(this.e, ua31Var.e) && jl40.l(this.f, ua31Var.f);
    }

    public final int hashCode() {
        int b = n.b(this.d, n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
        Float f = this.e;
        int hashCode = (b + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VerticalBadgeUiState(text=" + this.a + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", shadowAppColor=" + this.d + ", shadowAlpha=" + this.e + ", showPolicyId=" + this.f + Extension.C_BRAKE;
    }
}
