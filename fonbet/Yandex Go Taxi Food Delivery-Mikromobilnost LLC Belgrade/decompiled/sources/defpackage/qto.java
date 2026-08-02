package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qto {
    public final String a;
    public final double b;
    public final boolean c;
    public final String d;

    public qto(String str, double d, boolean z, String str2) {
        this.a = str;
        this.b = d;
        this.c = z;
        this.d = str2;
    }

    public static qto a(qto qtoVar, boolean z, String str, int i) {
        String str2 = qtoVar.a;
        double d = qtoVar.b;
        if ((i & 4) != 0) {
            z = qtoVar.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = qtoVar.d;
        }
        qtoVar.getClass();
        return new qto(str2, d, z2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qto)) {
            return false;
        }
        qto qtoVar = (qto) obj;
        return jl40.l(this.a, qtoVar.a) && Double.compare(this.b, qtoVar.b) == 0 && this.c == qtoVar.c && jl40.l(this.d, qtoVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExplorerDistrictState(districtName=" + this.a + ", districtCoverage=" + this.b + ", isVisible=" + this.c + ", finishedIconUrl=" + this.d + Extension.C_BRAKE;
    }
}
