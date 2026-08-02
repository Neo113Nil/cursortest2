package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import java.math.BigDecimal;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vl01 implements wl01 {
    public final eu01 a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final hh6 g;
    public final vnq h;
    public final Text i;
    public final Text j;
    public final boolean k;
    public final uvz0 l;
    public final YbButtonView.a m;
    public final boolean n;
    public final ubv0 o;
    public final x49 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final dcf t;
    public final int u;
    public final int v;
    public final bk01 w;

    public vl01(eu01 eu01Var, BigDecimal bigDecimal, String str, String str2, List list, boolean z, hh6 hh6Var, vnq vnqVar, Text.Constant constant, Text.Constant constant2, boolean z2, uvz0 uvz0Var, YbButtonView.a aVar, boolean z3, ubv0 ubv0Var, x49 x49Var, boolean z4, boolean z5, boolean z6, dcf dcfVar, int i, int i2, bk01 bk01Var) {
        this.a = eu01Var;
        this.b = bigDecimal;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = z;
        this.g = hh6Var;
        this.h = vnqVar;
        this.i = constant;
        this.j = constant2;
        this.k = z2;
        this.l = uvz0Var;
        this.m = aVar;
        this.n = z3;
        this.o = ubv0Var;
        this.p = x49Var;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.t = dcfVar;
        this.u = i;
        this.v = i2;
        this.w = bk01Var;
    }

    public final boolean a() {
        return this.f;
    }

    public final hh6 b() {
        return this.g;
    }

    public final List c() {
        return this.e;
    }

    public final x49 d() {
        return this.p;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl01)) {
            return false;
        }
        vl01 vl01Var = (vl01) obj;
        return this.a.equals(vl01Var.a) && this.b.equals(vl01Var.b) && this.c.equals(vl01Var.c) && jl40.l(this.d, vl01Var.d) && jl40.l(this.e, vl01Var.e) && this.f == vl01Var.f && jl40.l(this.g, vl01Var.g) && jl40.l(this.h, vl01Var.h) && jl40.l(this.i, vl01Var.i) && jl40.l(this.j, vl01Var.j) && this.k == vl01Var.k && jl40.l(this.l, vl01Var.l) && jl40.l(this.m, vl01Var.m) && this.n == vl01Var.n && jl40.l(this.o, vl01Var.o) && jl40.l(this.p, vl01Var.p) && this.q == vl01Var.q && this.r == vl01Var.r && this.s == vl01Var.s && jl40.l(this.t, vl01Var.t) && this.u == vl01Var.u && this.v == vl01Var.v && jl40.l(this.w, vl01Var.w);
    }

    public final YbButtonView.a f() {
        return this.m;
    }

    public final dcf g() {
        return this.t;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int b = unr0.b(smw0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int e = unr0.e(unr0.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        hh6 hh6Var = this.g;
        int hashCode = (e + (hh6Var == null ? 0 : hh6Var.hashCode())) * 31;
        vnq vnqVar = this.h;
        int hashCode2 = (hashCode + (vnqVar == null ? 0 : vnqVar.hashCode())) * 31;
        Text text = this.i;
        int hashCode3 = (hashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.j;
        int e2 = unr0.e((hashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31, 31, this.k);
        uvz0 uvz0Var = this.l;
        int hashCode4 = (e2 + (uvz0Var == null ? 0 : uvz0Var.hashCode())) * 31;
        YbButtonView.a aVar = this.m;
        int e3 = unr0.e((hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.n);
        ubv0 ubv0Var = this.o;
        int hashCode5 = (e3 + (ubv0Var == null ? 0 : ubv0Var.a.hashCode())) * 31;
        x49 x49Var = this.p;
        int e4 = unr0.e(unr0.e(unr0.e((hashCode5 + (x49Var == null ? 0 : x49Var.hashCode())) * 31, 31, this.q), 31, this.r), 31, this.s);
        dcf dcfVar = this.t;
        int b2 = oyr.b(this.v, oyr.b(this.u, (e4 + (dcfVar == null ? 0 : dcfVar.hashCode())) * 31, 31), 31);
        bk01 bk01Var = this.w;
        return b2 + (bk01Var != null ? bk01Var.hashCode() : 0);
    }

    public final boolean i() {
        return this.q;
    }

    public final boolean j() {
        return this.n;
    }

    public final vnq k() {
        return this.h;
    }

    public final Text l() {
        return this.j;
    }

    public final Text m() {
        return this.i;
    }

    public final bk01 n() {
        return this.w;
    }

    public final int o() {
        return this.u;
    }

    public final int p() {
        return this.v;
    }

    public final ubv0 q() {
        return this.o;
    }

    public final gu01 r() {
        return this.a;
    }

    public final uvz0 s() {
        return this.l;
    }

    public final BigDecimal t() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(toolbar=");
        sb.append(this.a);
        sb.append(", transferringAmount=");
        sb.append(this.b);
        sb.append(", currencySymbol=");
        g8e.D(sb, this.c, ", comment=", this.d, ", buttonsList=");
        nzs.p(sb, this.e, ", allowSwipeButtons=", this.f, ", bottomSheetViewState=");
        sb.append(this.g);
        sb.append(", fee=");
        sb.append(this.h);
        sb.append(", infoText=");
        ly3.C(sb, this.i, ", infoSubtitle=", this.j, ", isCommentVisible=");
        sb.append(this.k);
        sb.append(", tooltip=");
        sb.append(this.l);
        sb.append(", confirmButtonState=");
        sb.append(this.m);
        sb.append(", dialogShowing=");
        sb.append(this.n);
        sb.append(", suggestsViewState=");
        sb.append(this.o);
        sb.append(", cashback=");
        sb.append(this.p);
        sb.append(", deeplinkBottomSheetShowing=");
        nnm.v(", isAmountEditable=", ", isCommentEditable=", sb, this.q, this.r);
        sb.append(this.s);
        sb.append(", crossBorderCurrencyRateState=");
        sb.append(this.t);
        sb.append(", infoTextColorAttr=");
        vfc.u(this.u, this.v, ", infoTopPaddingDp=", ", infoTextAutosize=", sb);
        sb.append(this.w);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public final boolean u() {
        return this.r;
    }

    public final boolean v() {
        return this.s;
    }

    public final boolean w() {
        return this.k;
    }
}
