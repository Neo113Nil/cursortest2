package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xrz {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public xrz(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrz)) {
            return false;
        }
        xrz xrzVar = (xrz) obj;
        return this.a.equals(xrzVar.a) && this.b.equals(xrzVar.b) && jl40.l(this.c, xrzVar.c) && this.d == xrzVar.d && jl40.l(this.e, xrzVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("LotteryMenuItemUiState(title=", this.a, ", subtitle=", this.b, ", deeplink=");
        tse0.y(this.c, ", isVisible=", ", titleEndImageTag=", v, this.d);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
