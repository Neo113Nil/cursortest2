package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yr0 {
    public final Address a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final bgq0 g;

    public yr0(bgq0 bgq0Var, Address address, String str, String str2, String str3, String str4, String str5) {
        this.a = address;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bgq0Var;
    }

    public static yr0 a(yr0 yr0Var, String str, String str2, String str3, String str4, String str5, bgq0 bgq0Var, int i) {
        String str6 = str2;
        Address address = yr0Var.a;
        if ((i & 2) != 0) {
            str = yr0Var.b;
        }
        if ((i & 4) != 0) {
            str6 = yr0Var.c;
        }
        if ((i & 8) != 0) {
            str3 = yr0Var.d;
        }
        if ((i & 16) != 0) {
            str4 = yr0Var.e;
        }
        if ((i & 32) != 0) {
            str5 = yr0Var.f;
        }
        if ((i & 64) != 0) {
            bgq0Var = yr0Var.g;
        }
        yr0Var.getClass();
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return new yr0(bgq0Var, address, str9, str6, str8, str4, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr0)) {
            return false;
        }
        yr0 yr0Var = (yr0) obj;
        return jl40.l(this.a, yr0Var.a) && jl40.l(this.b, yr0Var.b) && jl40.l(this.c, yr0Var.c) && jl40.l(this.d, yr0Var.d) && jl40.l(this.e, yr0Var.e) && jl40.l(this.f, yr0Var.f) && jl40.l(this.g, yr0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressCorrectionFieldsViewModel(address=");
        sb.append(this.a);
        sb.append(", apartment=");
        sb.append(this.b);
        sb.append(", porch=");
        g8e.D(sb, this.c, ", floor=", this.d, ", doorphoneNumber=");
        g8e.D(sb, this.e, ", comment=", this.f, ", contact=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
