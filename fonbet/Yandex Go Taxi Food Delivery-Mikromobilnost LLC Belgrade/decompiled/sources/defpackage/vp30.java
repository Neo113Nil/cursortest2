package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class vp30 implements xp30 {
    public final ovi0 a;
    public final String b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public vp30(ovi0 ovi0Var, String str, String str2, String str3, CharSequence charSequence) {
        this.a = ovi0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp30)) {
            return false;
        }
        vp30 vp30Var = (vp30) obj;
        return jl40.l(this.a, vp30Var.a) && jl40.l(this.b, vp30Var.b) && jl40.l(this.c, vp30Var.c) && jl40.l(this.d, vp30Var.d) && jl40.l(this.e, vp30Var.e);
    }

    public final int hashCode() {
        ovi0 ovi0Var = this.a;
        int hashCode = (ovi0Var == null ? 0 : ovi0Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CharSequence charSequence = this.e;
        return hashCode4 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(imageTag=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", buttonTitle=", this.d, ", userAgreement=");
        return xvz.n(sb, this.e, Extension.C_BRAKE);
    }

    public vp30() {
        this(null, null, null, null, null);
    }
}
