package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.EssentialPoint$Type;

/* loaded from: classes6.dex */
public final class tbo {
    public final String a;
    public final String b;
    public final EssentialPoint$Type c;
    public final zzs d;
    public final String e;

    public tbo(String str, String str2, EssentialPoint$Type essentialPoint$Type, zzs zzsVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = essentialPoint$Type;
        this.d = zzsVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbo)) {
            return false;
        }
        tbo tboVar = (tbo) obj;
        return jl40.l(this.a, tboVar.a) && this.b.equals(tboVar.b) && this.c == tboVar.c && jl40.l(this.d, tboVar.d) && jl40.l(this.e, tboVar.e);
    }

    public final int hashCode() {
        int b = nnm.b(this.d, (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("EssentialPoint(title=", this.a, ", time=", this.b, ", type=");
        v.append(this.c);
        v.append(", point=");
        v.append(this.d);
        v.append(", iconTag=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
