package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qai {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qai(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qai)) {
            return false;
        }
        qai qaiVar = (qai) obj;
        return jl40.l(this.a, qaiVar.a) && jl40.l(this.b, qaiVar.b) && jl40.l(this.c, qaiVar.c) && jl40.l(this.d, qaiVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("DeliveryFormListItem(title=", this.a, ", subtitle=", this.b, ", trailTitle="), this.c, ", trailSubtitle=", this.d, Extension.C_BRAKE);
    }
}
