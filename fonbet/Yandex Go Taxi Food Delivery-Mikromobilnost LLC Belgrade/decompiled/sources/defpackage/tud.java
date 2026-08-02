package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tud {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public tud(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
    }

    public static tud a(tud tudVar, boolean z) {
        return new tud(tudVar.a, tudVar.b, tudVar.c, tudVar.d, tudVar.e, z, tudVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tud)) {
            return false;
        }
        tud tudVar = (tud) obj;
        return jl40.l(this.a, tudVar.a) && jl40.l(this.b, tudVar.b) && jl40.l(this.c, tudVar.c) && jl40.l(this.d, tudVar.d) && jl40.l(this.e, tudVar.e) && this.f == tudVar.f && this.g == tudVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return Boolean.hashCode(this.g) + unr0.e((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("CompoundOptionSelectItem(optionName=", this.a, ", iconUrl=", this.b, ", imageBigTag=");
        g8e.D(v, this.c, ", title=", this.d, ", subtitle=");
        tse0.y(this.e, ", checked=", ", enabled=", v, this.f);
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
