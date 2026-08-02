package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r8i0 {
    public final String a;
    public final String b;
    public boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public r8i0(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "" : str4;
        boolean z2 = (i & 32) != 0;
        str5 = (i & 64) != 0 ? "" : str5;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = str5;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8i0)) {
            return false;
        }
        r8i0 r8i0Var = (r8i0) obj;
        return jl40.l(this.a, r8i0Var.a) && jl40.l(this.b, r8i0Var.b) && this.c == r8i0Var.c && jl40.l(this.d, r8i0Var.d) && jl40.l(this.e, r8i0Var.e) && this.f == r8i0Var.f && jl40.l(this.g, r8i0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.e(unr0.b(unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        boolean z = this.c;
        StringBuilder v = b64.v("RatingReason(name=", this.a, ", label=", this.b, ", isSelected=");
        unr0.A(", imageTag=", this.d, ", inactiveImageTag=", v, z);
        tse0.y(this.e, ", isClickable=", ", count=", v, this.f);
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
