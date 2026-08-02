package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zys0 {
    public final ayu0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final kxy0 f;

    public zys0(ayu0 ayu0Var, String str, String str2, String str3, String str4, kxy0 kxy0Var) {
        this.a = ayu0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = kxy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zys0)) {
            return false;
        }
        zys0 zys0Var = (zys0) obj;
        return this.a.equals(zys0Var.a) && jl40.l(this.b, zys0Var.b) && jl40.l(this.c, zys0Var.c) && jl40.l(this.d, zys0Var.d) && jl40.l(this.e, zys0Var.e) && jl40.l(this.f, zys0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        kxy0 kxy0Var = this.f;
        return hashCode3 + (kxy0Var != null ? kxy0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartCameraWidget(title=");
        sb.append(this.a);
        sb.append(", iconTag=");
        sb.append(this.b);
        sb.append(", iconColor=");
        g8e.D(sb, this.c, ", backgroundColor=", this.d, ", initialColor=");
        sb.append(this.e);
        sb.append(", initialBackgroundGradient=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
