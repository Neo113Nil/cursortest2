package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xve {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xve(boolean z, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xve)) {
            return false;
        }
        xve xveVar = (xve) obj;
        return this.a == xveVar.a && this.b.equals(xveVar.b) && this.c.equals(xveVar.c) && this.d.equals(xveVar.d) && jl40.l(this.e, xveVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = ly3.v("CorpSuccessScreenData(isScreenExists=", ", title=", this.b, ", subtitle=", this.a);
        g8e.D(v, this.c, ", buttonTitle=", this.d, ", iconTag=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
