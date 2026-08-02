package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vbu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public vbu(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbu)) {
            return false;
        }
        vbu vbuVar = (vbu) obj;
        return jl40.l(this.a, vbuVar.a) && jl40.l(this.b, vbuVar.b) && jl40.l(this.c, vbuVar.c) && jl40.l(this.d, vbuVar.d) && jl40.l(this.e, vbuVar.e) && jl40.l(this.f, vbuVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderState(title=", this.a, ", subtitle=", this.b, ", pickupTitle=");
        g8e.D(v, this.c, ", deliveryTitle=", this.d, ", costTitle=");
        return g8e.r(v, this.e, ", imageUrl=", this.f, Extension.C_BRAKE);
    }
}
