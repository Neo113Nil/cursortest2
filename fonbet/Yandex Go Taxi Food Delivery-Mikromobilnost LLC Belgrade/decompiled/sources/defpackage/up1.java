package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class up1 implements xp1 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;

    public up1(String str, List list, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up1)) {
            return false;
        }
        up1 up1Var = (up1) obj;
        return jl40.l(this.a, up1Var.a) && jl40.l(this.b, up1Var.b) && jl40.l(this.c, up1Var.c) && jl40.l(this.d, up1Var.d) && jl40.l(this.e, up1Var.e) && this.f == up1Var.f && this.g == up1Var.g && this.h == up1Var.h && this.i == up1Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, unr0.b(unr0.b(unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("Content(screenTitle=", this.a, ", cards=", this.b, ", completionTitle=");
        g8e.D(r, this.c, ", completionSubtitle=", this.d, ", completionButtonText=");
        b64.A(this.f, this.e, ", onboardingCardsCount=", ", evaluationCardsCount=", r);
        vfc.u(this.g, this.h, ", remainingEvaluationCount=", ", isStackCompleted=", r);
        return x4e.i(r, this.i, Extension.C_BRAKE);
    }
}
