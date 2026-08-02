package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zot0 {
    public final String a;
    public final String b;
    public boolean c;
    public final tls d;
    public final yot0 e;
    public final boolean f;
    public final String g;
    public final String h;

    public zot0(String str, String str2, boolean z, tls tlsVar, yot0 yot0Var, boolean z2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = tlsVar;
        this.e = yot0Var;
        this.f = z2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zot0)) {
            return false;
        }
        zot0 zot0Var = (zot0) obj;
        return jl40.l(this.a, zot0Var.a) && jl40.l(this.b, zot0Var.b) && this.c == zot0Var.c && jl40.l(this.d, zot0Var.d) && jl40.l(this.e, zot0Var.e) && this.f == zot0Var.f && jl40.l(this.g, zot0Var.g) && jl40.l(this.h, zot0Var.h);
    }

    public final int hashCode() {
        int a = ly3.a(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        yot0 yot0Var = this.e;
        int b = unr0.b(unr0.e((a + (yot0Var == null ? 0 : yot0Var.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.c;
        StringBuilder v = b64.v("SpecialRequirementModel(title=", this.a, ", subtitle=", this.b, ", isChecked=");
        v.append(z);
        v.append(", onSwitcherClick=");
        v.append(this.d);
        v.append(", specialRequirementCommentModel=");
        v.append(this.e);
        v.append(", isLast=");
        v.append(this.f);
        v.append(", requirementName=");
        return g8e.r(v, this.g, ", accessibilityAlert=", this.h, Extension.C_BRAKE);
    }
}
