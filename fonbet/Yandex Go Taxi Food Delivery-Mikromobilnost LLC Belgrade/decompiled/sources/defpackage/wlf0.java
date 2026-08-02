package defpackage;

import com.yandex.go.promocodes.base.api.domain.entities.status.PromoCodeStatus;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class wlf0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final PromoCodeStatus g;
    public final jmf0 h;
    public final cmf0 i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final List m;
    public final boolean n;
    public final CharSequence o;

    public wlf0(String str, String str2, CharSequence charSequence, CharSequence charSequence2, String str3, String str4, PromoCodeStatus promoCodeStatus, jmf0 jmf0Var, cmf0 cmf0Var, boolean z, boolean z2, List list, List list2, boolean z3, CharSequence charSequence3) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = str3;
        this.f = str4;
        this.g = promoCodeStatus;
        this.h = jmf0Var;
        this.i = cmf0Var;
        this.j = z;
        this.k = z2;
        this.l = list;
        this.m = list2;
        this.n = z3;
        this.o = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlf0)) {
            return false;
        }
        wlf0 wlf0Var = (wlf0) obj;
        return jl40.l(this.a, wlf0Var.a) && jl40.l(this.b, wlf0Var.b) && jl40.l(this.c, wlf0Var.c) && jl40.l(this.d, wlf0Var.d) && jl40.l(this.e, wlf0Var.e) && jl40.l(this.f, wlf0Var.f) && this.g == wlf0Var.g && jl40.l(this.h, wlf0Var.h) && jl40.l(this.i, wlf0Var.i) && this.j == wlf0Var.j && this.k == wlf0Var.k && jl40.l(this.l, wlf0Var.l) && jl40.l(this.m, wlf0Var.m) && this.n == wlf0Var.n && jl40.l(this.o, wlf0Var.o);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.g.hashCode() + unr0.b(unr0.b(smw0.b(smw0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        jmf0 jmf0Var = this.h;
        int hashCode3 = (hashCode2 + (jmf0Var == null ? 0 : jmf0Var.hashCode())) * 31;
        cmf0 cmf0Var = this.i;
        int e = unr0.e(unr0.c(unr0.c(unr0.e(unr0.e((hashCode3 + (cmf0Var == null ? 0 : cmf0Var.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        CharSequence charSequence = this.o;
        return e + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoCode(iconUrl=", this.a, ", sectionId=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", service=");
        g8e.D(v, this.e, ", code=", this.f, ", status=");
        v.append(this.g);
        v.append(", error=");
        v.append(this.h);
        v.append(", details=");
        v.append(this.i);
        v.append(", isSelected=");
        v.append(this.j);
        v.append(", isSelectable=");
        v.append(this.k);
        v.append(", services=");
        v.append(this.l);
        v.append(", classes=");
        nzs.p(v, this.m, ", cardRequired=", this.n, ", additionalDiscountInfo=");
        return xvz.n(v, this.o, Extension.C_BRAKE);
    }
}
