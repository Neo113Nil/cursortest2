package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w7b0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public w7b0(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7b0)) {
            return false;
        }
        w7b0 w7b0Var = (w7b0) obj;
        return jl40.l(this.a, w7b0Var.a) && jl40.l(this.b, w7b0Var.b) && jl40.l(this.c, w7b0Var.c) && this.d == w7b0Var.d && this.e == w7b0Var.e && jl40.l(this.f, w7b0Var.f) && jl40.l(this.g, w7b0Var.g) && jl40.l(this.h, w7b0Var.h) && jl40.l(this.i, w7b0Var.i) && jl40.l(this.j, w7b0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(oyr.b(this.e, oyr.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalUiGoal(id=", this.a, ", title=", this.b, ", subtitle=");
        b64.A(this.d, this.c, ", progressTotalCount=", ", progressCurrentCount=", v);
        smw0.t(this.e, ", progressImageTag=", this.f, ", prizeImageTag=", v);
        g8e.D(v, this.g, ", prizeInfoDeeplink=", this.h, ", promoBlockTitleOverride=");
        return g8e.r(v, this.i, ", promoBlockSubtitleOverride=", this.j, Extension.C_BRAKE);
    }
}
