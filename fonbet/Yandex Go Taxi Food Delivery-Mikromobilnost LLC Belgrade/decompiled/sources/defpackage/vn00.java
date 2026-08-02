package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vn00 implements fo00 {
    public final CharSequence a;
    public final CharSequence b;
    public final ixy0 c;
    public final kdc d;
    public final kdc e;
    public final ixy0 f;

    public vn00(CharSequence charSequence, CharSequence charSequence2, ixy0 ixy0Var, kdc kdcVar, kdc kdcVar2, ixy0 ixy0Var2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ixy0Var;
        this.d = kdcVar;
        this.e = kdcVar2;
        this.f = ixy0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn00)) {
            return false;
        }
        vn00 vn00Var = (vn00) obj;
        return jl40.l(this.a, vn00Var.a) && jl40.l(this.b, vn00Var.b) && jl40.l(this.c, vn00Var.c) && jl40.l(this.d, vn00Var.d) && jl40.l(this.e, vn00Var.e) && jl40.l(this.f, vn00Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31;
        kdc kdcVar = this.d;
        int hashCode3 = (hashCode2 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.e;
        int hashCode4 = (hashCode3 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        ixy0 ixy0Var = this.f;
        return hashCode4 + (ixy0Var != null ? ixy0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "PinWarSmallPinStyle(title=", ", subtitle=", ", image=");
        r.append(this.c);
        r.append(", imageBackgroundColor=");
        r.append(this.d);
        r.append(", backgroundColor=");
        r.append(this.e);
        r.append(", organizationLogo=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
