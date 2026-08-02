package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xb {
    public static final xb k = new xb(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;

    public xb(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = i;
        this.i = i2;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return jl40.l(this.a, xbVar.a) && jl40.l(this.b, xbVar.b) && jl40.l(this.c, xbVar.c) && jl40.l(this.d, xbVar.d) && jl40.l(this.e, xbVar.e) && jl40.l(this.f, xbVar.f) && jl40.l(this.g, xbVar.g) && this.h == xbVar.h && this.i == xbVar.i && jl40.l(this.j, xbVar.j);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.j.hashCode() + oyr.b(this.i, oyr.b(this.h, unr0.b(unr0.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AcceptComboOrderPopupModel(url=", this.a, ", title=", this.b, ", text=");
        g8e.D(v, this.c, ", textSubtitle=", this.d, ", lowerText=");
        g8e.D(v, this.e, ", declineButtonText=", this.f, ", confirmButtonText=");
        b64.A(this.h, this.g, ", selectorMaxNumber=", ", maxAllowedNumber=", v);
        return xvz.h(this.i, ", errorTextTooManyPassengers=", this.j, Extension.C_BRAKE, v);
    }

    public /* synthetic */ xb(int i) {
        this(0, 0, "", "", null, null, null, "", "", "");
    }

    public xb() {
        this(0);
    }
}
