package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yot0 {
    public final tls a;
    public final tls b;
    public final String c;
    public final String d;
    public final String e;
    public boolean f;

    public yot0(tls tlsVar, tls tlsVar2, String str, String str2, String str3, boolean z) {
        this.a = tlsVar;
        this.b = tlsVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yot0)) {
            return false;
        }
        yot0 yot0Var = (yot0) obj;
        return jl40.l(this.a, yot0Var.a) && jl40.l(this.b, yot0Var.b) && jl40.l(this.c, yot0Var.c) && jl40.l(this.d, yot0Var.d) && jl40.l(this.e, yot0Var.e) && this.f == yot0Var.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(ly3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        boolean z = this.f;
        StringBuilder sb = new StringBuilder("SpecialRequirementCommentModel(onExpandedViewClick=");
        sb.append(this.a);
        sb.append(", saveForNextTripsClicked=");
        sb.append(this.b);
        sb.append(", placeholder=");
        g8e.D(sb, this.c, ", saveText=", this.d, ", valueText=");
        return nnm.i(this.e, ", saveForNextTrips=", Extension.C_BRAKE, sb, z);
    }
}
