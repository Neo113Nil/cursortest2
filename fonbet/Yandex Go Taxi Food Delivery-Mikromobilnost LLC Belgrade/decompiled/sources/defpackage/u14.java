package defpackage;

import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u14 implements y14 {
    public final stz0 a;
    public final ahq0 b;
    public final YbButtonViewGroup.b c;
    public final boolean d;
    public final cv3 e;
    public final j5x0 f;
    public final jr3 g;
    public final fv3 h;
    public final boolean i;
    public final boolean j;

    public u14(stz0 stz0Var, ahq0 ahq0Var, YbButtonViewGroup.b bVar, boolean z, cv3 cv3Var, j5x0 j5x0Var, jr3 jr3Var, fv3 fv3Var, boolean z2, boolean z3) {
        this.a = stz0Var;
        this.b = ahq0Var;
        this.c = bVar;
        this.d = z;
        this.e = cv3Var;
        this.f = j5x0Var;
        this.g = jr3Var;
        this.h = fv3Var;
        this.i = z2;
        this.j = z3;
    }

    public final jr3 a() {
        return this.g;
    }

    public final fv3 b() {
        return this.h;
    }

    public final cv3 c() {
        return this.e;
    }

    public final YbButtonViewGroup.b d() {
        return this.c;
    }

    public final ahq0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u14)) {
            return false;
        }
        u14 u14Var = (u14) obj;
        return this.a.equals(u14Var.a) && this.b.equals(u14Var.b) && this.c.equals(u14Var.c) && this.d == u14Var.d && jl40.l(this.e, u14Var.e) && jl40.l(this.f, u14Var.f) && jl40.l(this.g, u14Var.g) && this.h.equals(u14Var.h) && this.i == u14Var.i && this.j == u14Var.j;
    }

    public final j5x0 f() {
        return this.f;
    }

    public final stz0 g() {
        return this.a;
    }

    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        cv3 cv3Var = this.e;
        int hashCode = (e + (cv3Var == null ? 0 : cv3Var.hashCode())) * 31;
        j5x0 j5x0Var = this.f;
        int hashCode2 = (hashCode + (j5x0Var == null ? 0 : j5x0Var.hashCode())) * 31;
        jr3 jr3Var = this.g;
        return Boolean.hashCode(this.j) + unr0.e((this.h.hashCode() + ((hashCode2 + (jr3Var != null ? jr3Var.hashCode() : 0)) * 31)) * 31, 31, this.i);
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(toolbar=");
        sb.append(this.a);
        sb.append(", currentPaymentMethod=");
        sb.append(this.b);
        sb.append(", buttonsViewGroupState=");
        sb.append(this.c);
        sb.append(", isInputInteractive=");
        sb.append(this.d);
        sb.append(", bottomSheetState=");
        sb.append(this.e);
        sb.append(", tabViewState=");
        sb.append(this.f);
        sb.append(", autoFundData=");
        sb.append(this.g);
        sb.append(", autoTopupData=");
        sb.append(this.h);
        sb.append(", isAutoTopupVisible=");
        return smw0.k(", isAutoFundVisible=", Extension.C_BRAKE, sb, this.i, this.j);
    }
}
