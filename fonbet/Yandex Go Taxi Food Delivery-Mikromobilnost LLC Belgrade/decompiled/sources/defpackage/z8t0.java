package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z8t0 {
    public static final z8t0 i = new z8t0("", false, "", "", "", "", "", "");
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;

    public z8t0(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8t0)) {
            return false;
        }
        z8t0 z8t0Var = (z8t0) obj;
        return jl40.l(this.a, z8t0Var.a) && jl40.l(this.b, z8t0Var.b) && jl40.l(this.c, z8t0Var.c) && jl40.l(this.d, z8t0Var.d) && this.e == z8t0Var.e && this.f.equals(z8t0Var.f) && jl40.l(this.g, z8t0Var.g) && jl40.l(this.h, z8t0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.b(unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("SomethingWrongScreenUiState(screenTitle=", this.a, ", screenSubtitle=", this.b, ", toggleTitle=");
        g8e.D(v, this.c, ", toggleSubtitle=", this.d, ", toggleState=");
        unr0.A(", buttonTitle=", this.f, ", emergencyChatUrl=", v, this.e);
        return g8e.r(v, this.g, ", safetyCenterDeeplink=", this.h, Extension.C_BRAKE);
    }
}
