package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qj90 implements rj90 {
    public final List a;
    public final String b;
    public final boolean c;
    public final ntz0 d;
    public final Text e;
    public final Text f;
    public final boolean g;
    public final boolean h;

    public qj90(List list, String str, boolean z, ntz0 ntz0Var, Text.Resource resource, Text.Resource resource2, boolean z2, boolean z3) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = ntz0Var;
        this.e = resource;
        this.f = resource2;
        this.g = z2;
        this.h = z3;
    }

    @Override // defpackage.rj90
    public final rtz0 a() {
        return this.d;
    }

    @Override // defpackage.rj90
    public final Text b() {
        return this.e;
    }

    @Override // defpackage.rj90
    public final Text c() {
        return this.f;
    }

    public final boolean d() {
        return this.g;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj90)) {
            return false;
        }
        qj90 qj90Var = (qj90) obj;
        return this.a.equals(qj90Var.a) && this.b.equals(qj90Var.b) && this.c == qj90Var.c && this.d.equals(qj90Var.d) && jl40.l(this.e, qj90Var.e) && jl40.l(this.f, qj90Var.f) && this.g == qj90Var.g && this.h == qj90Var.h;
    }

    public final List f() {
        return this.a;
    }

    public final boolean g() {
        return this.h;
    }

    public final int hashCode() {
        int d = vfc.d(this.d.a, unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        Text text = this.e;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.f;
        return Boolean.hashCode(this.h) + unr0.e((hashCode + (text2 != null ? text2.hashCode() : 0)) * 31, 31, this.g);
    }

    @Override // defpackage.rj90
    public final boolean isBackButtonVisible() {
        return this.c;
    }

    public final String toString() {
        StringBuilder s = xvz.s("Success(recyclerItems=", this.a, ", filterText=", this.b, ", isBackButtonVisible=");
        s.append(this.c);
        s.append(", toolbarRightPart=");
        s.append(this.d);
        s.append(", toolbarTitle=");
        ly3.C(s, this.e, ", toolbarSubtitle=", this.f, ", animateRecycler=");
        return smw0.k(", scrollToTop=", Extension.C_BRAKE, s, this.g, this.h);
    }
}
