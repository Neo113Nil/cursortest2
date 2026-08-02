package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class thb {
    public final Text a;
    public final nwb0 b;
    public final uju c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final kao g;
    public final jbs0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final utb0 l;

    public thb(Text text, nwb0 nwb0Var, uju ujuVar, boolean z, boolean z2, boolean z3, kao kaoVar, jbs0 jbs0Var, boolean z4, boolean z5, boolean z6, utb0 utb0Var) {
        this.a = text;
        this.b = nwb0Var;
        this.c = ujuVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = kaoVar;
        this.h = jbs0Var;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = utb0Var;
    }

    public final boolean a() {
        return this.i;
    }

    public final kao b() {
        return this.g;
    }

    public final uju c() {
        return this.c;
    }

    public final utb0 d() {
        return this.l;
    }

    public final nwb0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof thb) {
            thb thbVar = (thb) obj;
            if (jl40.l(this.a, thbVar.a) && this.b.equals(thbVar.b) && this.c.equals(thbVar.c) && this.d == thbVar.d && this.e == thbVar.e && this.f == thbVar.f && this.g == thbVar.g && jl40.l(this.h, thbVar.h) && this.i == thbVar.i && this.j == thbVar.j && this.k == thbVar.k && jl40.l(this.l, thbVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + unr0.e(unr0.e(unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        jbs0 jbs0Var = this.h;
        int e = unr0.e(unr0.e(unr0.e((hashCode + (jbs0Var == null ? 0 : jbs0Var.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        utb0 utb0Var = this.l;
        return e + (utb0Var != null ? utb0Var.hashCode() : 0);
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.f;
    }

    public final jbs0 k() {
        return this.h;
    }

    public final Text l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckPinViewState(title=");
        sb.append(this.a);
        sb.append(", pinInput=");
        sb.append(this.b);
        sb.append(", hintState=");
        sb.append(this.c);
        sb.append(", shouldShowForgotPinText=");
        sb.append(this.d);
        sb.append(", shouldShowBiometric=");
        nnm.v(", shouldShowSignOutButton=", ", errorState=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", signOutViewState=");
        sb.append(this.h);
        sb.append(", backVisible=");
        nnm.v(", shouldShowBankLogo=", ", shouldShowErrorView=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", pinActionButtonModel=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
