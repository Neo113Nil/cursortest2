package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class s41 implements wu0 {
    public final boolean a;
    public final xu0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public s41(boolean z, xu0 xu0Var, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = xu0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s41)) {
            return false;
        }
        s41 s41Var = (s41) obj;
        return this.a == s41Var.a && jl40.l(this.b, s41Var.b) && this.c.equals(s41Var.c) && this.d.equals(s41Var.d) && this.e.equals(s41Var.e) && this.f.equals(s41Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressPoint(sourcePoint=");
        sb.append(this.a);
        sb.append(", info=");
        sb.append(this.b);
        sb.append(", porchHint=");
        g8e.D(sb, this.c, ", floorHint=", this.d, ", apartmentHint=");
        return g8e.r(sb, this.e, ", doorPhoneHint=", this.f, Extension.C_BRAKE);
    }
}
