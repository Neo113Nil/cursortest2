package defpackage;

import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.AmountScreenStatus;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a;
import com.ybsdk.widgets.common.YbButtonView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t9g0 implements v9g0 {
    public final a a;
    public final String b;
    public final BigDecimal c;
    public final lfv d;
    public final YbButtonView.a e;
    public final String f;
    public final rr51 g;
    public final ProductType h;
    public final String i;
    public final AmountScreenStatus j;
    public final boolean k;
    public final rr51 l;
    public final List m;
    public final List n;
    public final String o;
    public final wvz0 p;
    public final boolean q;
    public final List r;

    public t9g0(a aVar, String str, BigDecimal bigDecimal, lfv lfvVar, YbButtonView.a aVar2, String str2, rr51 rr51Var, ProductType productType, String str3, AmountScreenStatus amountScreenStatus, boolean z, rr51 rr51Var2, List list, ArrayList arrayList, String str4, wvz0 wvz0Var, boolean z2, ArrayList arrayList2) {
        this.a = aVar;
        this.b = str;
        this.c = bigDecimal;
        this.d = lfvVar;
        this.e = aVar2;
        this.f = str2;
        this.g = rr51Var;
        this.h = productType;
        this.i = str3;
        this.j = amountScreenStatus;
        this.k = z;
        this.l = rr51Var2;
        this.m = list;
        this.n = arrayList;
        this.o = str4;
        this.p = wvz0Var;
        this.q = z2;
        this.r = arrayList2;
    }

    @Override // defpackage.v9g0
    public final YbButtonView.a a() {
        return this.e;
    }

    @Override // defpackage.v9g0
    public final String b() {
        return this.f;
    }

    @Override // defpackage.w9g0
    public final lfv c() {
        return this.d;
    }

    @Override // defpackage.v9g0
    public final rr51 d() {
        return this.g;
    }

    public final List e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9g0)) {
            return false;
        }
        t9g0 t9g0Var = (t9g0) obj;
        return this.a.equals(t9g0Var.a) && this.b.equals(t9g0Var.b) && jl40.l(this.c, t9g0Var.c) && this.d.equals(t9g0Var.d) && this.e.equals(t9g0Var.e) && jl40.l(this.f, t9g0Var.f) && jl40.l(this.g, t9g0Var.g) && this.h == t9g0Var.h && jl40.l(this.i, t9g0Var.i) && this.j == t9g0Var.j && this.k == t9g0Var.k && jl40.l(this.l, t9g0Var.l) && jl40.l(this.m, t9g0Var.m) && jl40.l(this.n, t9g0Var.n) && jl40.l(this.o, t9g0Var.o) && jl40.l(this.p, t9g0Var.p) && this.q == t9g0Var.q && jl40.l(this.r, t9g0Var.r);
    }

    public final rr51 f() {
        return this.l;
    }

    public final AmountScreenStatus g() {
        return this.j;
    }

    @Override // defpackage.v9g0
    public final BigDecimal getAmount() {
        return this.c;
    }

    @Override // defpackage.v9g0
    public final String getCurrency() {
        return this.b;
    }

    @Override // defpackage.v9g0
    public final a getIcon() {
        return this.a;
    }

    public final boolean h() {
        return this.q;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + smw0.f(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rr51 rr51Var = this.g;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        ProductType productType = this.h;
        int e = unr0.e((this.j.hashCode() + unr0.b((hashCode3 + (productType == null ? 0 : productType.hashCode())) * 31, 31, this.i)) * 31, 31, this.k);
        rr51 rr51Var2 = this.l;
        int hashCode4 = (e + (rr51Var2 == null ? 0 : rr51Var2.hashCode())) * 31;
        List list = this.m;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.n;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.o;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wvz0 wvz0Var = this.p;
        int e2 = unr0.e((hashCode7 + (wvz0Var == null ? 0 : wvz0Var.hashCode())) * 31, 31, this.q);
        List list3 = this.r;
        return e2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List i() {
        return this.r;
    }

    public final String j() {
        return this.i;
    }

    public final ProductType k() {
        return this.h;
    }

    public final List l() {
        return this.n;
    }

    public final wvz0 m() {
        return this.p;
    }

    public final String n() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountScreen(icon=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", amount=");
        sb.append(this.c);
        sb.append(", toolbar=");
        sb.append(this.d);
        sb.append(", button=");
        sb.append(this.e);
        sb.append(", purpose=");
        sb.append(this.f);
        sb.append(", amountInfoWidget=");
        sb.append(this.g);
        sb.append(", productType=");
        sb.append(this.h);
        sb.append(", message=");
        sb.append(this.i);
        sb.append(", amountStatus=");
        sb.append(this.j);
        sb.append(", isAmountEditable=");
        sb.append(this.k);
        sb.append(", agreementsData=");
        sb.append(this.l);
        sb.append(", agreementsChipText=");
        nnm.w(sb, this.m, ", termContent=", this.n, ", validationId=");
        sb.append(this.o);
        sb.append(", tooltip=");
        sb.append(this.p);
        sb.append(", areTapsBlocked=");
        sb.append(this.q);
        sb.append(", boostStrategyVariables=");
        sb.append(this.r);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
