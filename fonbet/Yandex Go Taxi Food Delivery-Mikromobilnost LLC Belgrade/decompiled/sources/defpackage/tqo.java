package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tqo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;

    public tqo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = z;
        this.m = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqo)) {
            return false;
        }
        tqo tqoVar = (tqo) obj;
        return jl40.l(this.a, tqoVar.a) && jl40.l(this.b, tqoVar.b) && jl40.l(this.c, tqoVar.c) && jl40.l(this.d, tqoVar.d) && jl40.l(this.e, tqoVar.e) && jl40.l(this.f, tqoVar.f) && jl40.l(this.g, tqoVar.g) && jl40.l(this.h, tqoVar.h) && jl40.l(this.i, tqoVar.i) && jl40.l(this.j, tqoVar.j) && jl40.l(this.k, tqoVar.k) && this.l == tqoVar.l && jl40.l(this.m, tqoVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder v = b64.v("ExperimentTitlesViewModel(titleFormName=", this.a, ", titleCancelButton=", this.b, ", titleSuccessButton=");
        g8e.D(v, this.c, ", titleApartmentNumber=", this.d, ", titlePorchNumber=");
        g8e.D(v, this.e, ", titleFloorNumber=", this.f, ", titleDoorPhoneNumber=");
        g8e.D(v, this.g, ", titleComment=", this.h, ", titleContact=");
        g8e.D(v, this.i, ", titleOriginalText=", this.j, ", subtitleOriginalText=");
        tse0.y(this.k, ", isOriginalTextShowing=", ", titleContactsPicker=", v, this.l);
        return oyr.t(v, this.m, Extension.C_BRAKE);
    }
}
