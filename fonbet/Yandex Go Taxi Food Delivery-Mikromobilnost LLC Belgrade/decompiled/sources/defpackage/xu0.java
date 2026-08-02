package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xu0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static xu0 a(xu0 xu0Var, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = xu0Var.a;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = xu0Var.b;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = xu0Var.c;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = xu0Var.d;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = xu0Var.e;
        }
        xu0Var.getClass();
        return new xu0(str6, str7, str8, str9, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return jl40.l(this.a, xu0Var.a) && jl40.l(this.b, xu0Var.b) && jl40.l(this.c, xu0Var.c) && jl40.l(this.d, xu0Var.d) && jl40.l(this.e, xu0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddressFormEntity(address=", this.a, ", porch=", this.b, ", apartment=");
        g8e.D(v, this.c, ", floor=", this.d, ", doorPhone=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
