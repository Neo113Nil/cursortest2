package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz3b0;", "", "Companion", "x3b0", "y3b0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class z3b0 {
    public static final y3b0 Companion = new y3b0();
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

    public /* synthetic */ z3b0(int i, String str, String str2, String str3, int i2, int i3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3b0)) {
            return false;
        }
        z3b0 z3b0Var = (z3b0) obj;
        return jl40.l(this.a, z3b0Var.a) && jl40.l(this.b, z3b0Var.b) && jl40.l(this.c, z3b0Var.c) && this.d == z3b0Var.d && this.e == z3b0Var.e && jl40.l(this.f, z3b0Var.f) && jl40.l(this.g, z3b0Var.g) && jl40.l(this.h, z3b0Var.h) && jl40.l(this.i, z3b0Var.i) && jl40.l(this.j, z3b0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(oyr.b(this.e, oyr.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalGoal(id=", this.a, ", title=", this.b, ", subtitle=");
        b64.A(this.d, this.c, ", progressTotalCount=", ", progressCurrentCount=", v);
        smw0.t(this.e, ", progressImageTag=", this.f, ", prizeImageTag=", v);
        g8e.D(v, this.g, ", prizeInfoDeeplink=", this.h, ", promoBlockTitleOverride=");
        return g8e.r(v, this.i, ", promoBlockSubtitleOverride=", this.j, Extension.C_BRAKE);
    }

    public z3b0() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
    }
}
