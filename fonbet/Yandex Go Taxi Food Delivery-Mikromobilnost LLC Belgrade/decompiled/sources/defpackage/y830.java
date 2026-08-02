package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y830 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public y830(CharSequence charSequence, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y830)) {
            return false;
        }
        y830 y830Var = (y830) obj;
        return jl40.l(this.a, y830Var.a) && jl40.l(this.b, y830Var.b) && jl40.l(this.c, y830Var.c) && jl40.l(this.d, y830Var.d) && jl40.l(this.e, y830Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CharSequence charSequence = this.e;
        return hashCode4 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MosmetroOnboardingConfig(imageTag=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", buttonTitle=", this.d, ", userAgreement=");
        return xvz.n(v, this.e, Extension.C_BRAKE);
    }

    public y830() {
        this(null, null, null, null, null);
    }
}
