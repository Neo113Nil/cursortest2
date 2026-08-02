package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewState$CodeState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v9c {
    public final String A;
    public final kao B;
    public final boolean C;
    public final stz0 a;
    public final Text b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Text.Resource k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final Text o;
    public final ColorModel p;
    public final Integer q;
    public final Text r;
    public final jbs0 s;
    public final Text t;
    public final boolean u;
    public final boolean v;
    public final boolean w = true;
    public final boolean x;
    public final boolean y;
    public final CodeConfirmationViewState$CodeState z;

    public v9c(stz0 stz0Var, Text text, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Text.Resource resource, String str, boolean z8, boolean z9, Text text2, ColorModel.Attr attr, Integer num, Text.Join join, jbs0 jbs0Var, Text text3, boolean z10, boolean z11, boolean z12, boolean z13, CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState, String str2, kao kaoVar, boolean z14) {
        this.a = stz0Var;
        this.b = text;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = resource;
        this.l = str;
        this.m = z8;
        this.n = z9;
        this.o = text2;
        this.p = attr;
        this.q = num;
        this.r = join;
        this.s = jbs0Var;
        this.t = text3;
        this.u = z10;
        this.v = z11;
        this.x = z12;
        this.y = z13;
        this.z = codeConfirmationViewState$CodeState;
        this.A = str2;
        this.B = kaoVar;
        this.C = z14;
    }

    public final int a() {
        return this.d;
    }

    public final CodeConfirmationViewState$CodeState b() {
        return this.z;
    }

    public final Text c() {
        return this.k;
    }

    public final kao d() {
        return this.B;
    }

    public final Text e() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9c)) {
            return false;
        }
        v9c v9cVar = (v9c) obj;
        return jl40.l(this.a, v9cVar.a) && jl40.l(this.b, v9cVar.b) && this.c == v9cVar.c && this.d == v9cVar.d && this.e == v9cVar.e && this.f == v9cVar.f && this.g == v9cVar.g && this.h == v9cVar.h && this.i == v9cVar.i && this.j == v9cVar.j && jl40.l(this.k, v9cVar.k) && jl40.l(this.l, v9cVar.l) && this.m == v9cVar.m && this.n == v9cVar.n && jl40.l(this.o, v9cVar.o) && jl40.l(this.p, v9cVar.p) && jl40.l(this.q, v9cVar.q) && jl40.l(this.r, v9cVar.r) && jl40.l(this.s, v9cVar.s) && jl40.l(this.t, v9cVar.t) && this.u == v9cVar.u && this.v == v9cVar.v && this.w == v9cVar.w && this.x == v9cVar.x && this.y == v9cVar.y && this.z == v9cVar.z && jl40.l(this.A, v9cVar.A) && jl40.l(this.B, v9cVar.B) && this.C == v9cVar.C;
    }

    public final boolean f() {
        return this.v;
    }

    public final Text g() {
        return this.o;
    }

    public final Integer h() {
        return this.q;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.b(uw51.b(this.k, unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.d, unr0.e(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n);
        Text text = this.o;
        int hashCode = (e + (text == null ? 0 : text.hashCode())) * 31;
        ColorModel colorModel = this.p;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        Integer num = this.q;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Text text2 = this.r;
        int hashCode4 = (hashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31;
        jbs0 jbs0Var = this.s;
        int b = unr0.b((this.z.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(n.c(this.t, (hashCode4 + (jbs0Var == null ? 0 : jbs0Var.hashCode())) * 31, 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y)) * 31, 31, this.A);
        kao kaoVar = this.B;
        return Boolean.hashCode(this.C) + ((b + (kaoVar != null ? kaoVar.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.x;
    }

    public final boolean j() {
        return this.C;
    }

    public final boolean k() {
        return this.j;
    }

    public final boolean l() {
        return this.u;
    }

    public final boolean m() {
        return this.g;
    }

    public final boolean n() {
        return this.i;
    }

    public final boolean o() {
        return this.h;
    }

    public final jbs0 p() {
        return this.s;
    }

    public final String q() {
        return this.l;
    }

    public final String r() {
        return this.A;
    }

    public final Text s() {
        return this.r;
    }

    public final Text t() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeConfirmationViewState(toolbar=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", canEditCode=");
        sb.append(this.c);
        sb.append(", codeLength=");
        sb.append(this.d);
        sb.append(", isCodeChecking=");
        nnm.v(", showCodeIsWrong=", ", shouldShowRetryButton=", sb, this.e, this.f);
        nnm.v(", showRetryButtonShimmer=", ", shouldShowSupportButton=", sb, this.g, this.h);
        nnm.v(", shouldShowBottomBackButton=", ", errorOptionsButtonTitle=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", supportUrl=");
        sb.append(this.l);
        sb.append(", isToolbarBackButtonEnabled=");
        nnm.v(", isAvatarButtonEnabled=", ", infoMessage=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(", toolbarBackButtonColor=");
        sb.append(this.p);
        sb.append(", infoMessageColor=");
        sb.append(this.q);
        sb.append(", timerText=");
        sb.append(this.r);
        sb.append(", signOutViewState=");
        sb.append(this.s);
        sb.append(", header=");
        sb.append(this.t);
        sb.append(", shouldShowChangeAccount=");
        nnm.v(", hideToolbarBackButton=", ", onTimerUpdate=", sb, this.u, this.v);
        nnm.v(", noAttemptsLeft=", ", isKeyboardEnable=", sb, this.w, this.x);
        sb.append(this.y);
        sb.append(", codeState=");
        sb.append(this.z);
        sb.append(", textCode=");
        sb.append(this.A);
        sb.append(", errorViewState=");
        sb.append(this.B);
        sb.append(", shouldShowBankLogo=");
        return x4e.i(sb, this.C, Extension.C_BRAKE);
    }

    public final stz0 u() {
        return this.a;
    }

    public final ColorModel v() {
        return this.p;
    }

    public final boolean w() {
        return this.n;
    }

    public final boolean x() {
        return this.e;
    }

    public final boolean y() {
        return this.y;
    }

    public final boolean z() {
        return this.m;
    }
}
