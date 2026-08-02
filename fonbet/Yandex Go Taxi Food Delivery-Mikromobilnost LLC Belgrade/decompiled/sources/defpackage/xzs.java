package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes5.dex */
public final class xzs {
    public static final vzs Companion = new vzs();
    public final Double a;
    public final Double b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ xzs(int i, Double d, Double d2, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, tzs.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzs)) {
            return false;
        }
        xzs xzsVar = (xzs) obj;
        return jl40.l(this.a, xzsVar.a) && jl40.l(this.b, xzsVar.b) && jl40.l(this.c, xzsVar.c) && jl40.l(this.d, xzsVar.d) && jl40.l(this.e, xzsVar.e);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoPoint(lat=");
        sb.append(this.a);
        sb.append(", lon=");
        sb.append(this.b);
        sb.append(", datumId=");
        g8e.D(sb, this.c, ", datumType=", this.d, ", log=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public xzs(Double d, Double d2, String str, String str2, String str3) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
