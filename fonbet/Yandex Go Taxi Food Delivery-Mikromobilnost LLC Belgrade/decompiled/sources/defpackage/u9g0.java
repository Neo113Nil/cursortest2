package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.a;
import com.ybsdk.widgets.common.YbButtonView;
import java.math.BigDecimal;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u9g0 implements v9g0 {
    public final a a;
    public final String b;
    public final BigDecimal c;
    public final lfv d;
    public final YbButtonView.a e;
    public final String f;
    public final rr51 g;
    public final js10 h;
    public final List i;
    public final String j;
    public final String k;

    public u9g0(a aVar, String str, BigDecimal bigDecimal, lfv lfvVar, YbButtonView.a aVar2, String str2, rr51 rr51Var, js10 js10Var, List list, String str3, String str4) {
        this.a = aVar;
        this.b = str;
        this.c = bigDecimal;
        this.d = lfvVar;
        this.e = aVar2;
        this.f = str2;
        this.g = rr51Var;
        this.h = js10Var;
        this.i = list;
        this.j = str3;
        this.k = str4;
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

    public final String e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9g0)) {
            return false;
        }
        u9g0 u9g0Var = (u9g0) obj;
        return this.a.equals(u9g0Var.a) && this.b.equals(u9g0Var.b) && jl40.l(this.c, u9g0Var.c) && this.d.equals(u9g0Var.d) && jl40.l(this.e, u9g0Var.e) && jl40.l(this.f, u9g0Var.f) && jl40.l(this.g, u9g0Var.g) && this.h.equals(u9g0Var.h) && this.i.equals(u9g0Var.i) && jl40.l(this.j, u9g0Var.j) && jl40.l(this.k, u9g0Var.k);
    }

    public final String f() {
        return this.j;
    }

    public final js10 g() {
        return this.h;
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

    public final List h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + smw0.f(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31;
        YbButtonView.a aVar = this.e;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        rr51 rr51Var = this.g;
        int c = unr0.c((this.h.hashCode() + ((hashCode3 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31)) * 31, 31, this.i);
        String str2 = this.j;
        int hashCode4 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultScreen(icon=");
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
        sb.append(", messages=");
        sb.append(this.h);
        sb.append(", widgetsList=");
        oyr.D(", infoTitle=", this.j, ", infoDescription=", sb, this.i);
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
