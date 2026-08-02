package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r9j extends gf91 {
    public final String p;
    public final dn8 q;
    public final nbv r;
    public final Text.Resource s;
    public final boolean t;
    public final List u;
    public final o0p v;
    public final YbButtonView.a w;
    public final YbButtonView.a x;
    public final YbButtonView.a y;
    public final boolean z;

    public r9j(String str, dn8 dn8Var, nbv nbvVar, Text.Resource resource, boolean z, List list, o0p o0pVar, YbButtonView.a aVar, YbButtonView.a aVar2, YbButtonView.a aVar3, boolean z2) {
        this.p = str;
        this.q = dn8Var;
        this.r = nbvVar;
        this.s = resource;
        this.t = z;
        this.u = list;
        this.v = o0pVar;
        this.w = aVar;
        this.x = aVar2;
        this.y = aVar3;
        this.z = z2;
    }

    public final o0p d() {
        return this.v;
    }

    public final YbButtonView.a e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9j)) {
            return false;
        }
        r9j r9jVar = (r9j) obj;
        return jl40.l(this.p, r9jVar.p) && this.q.equals(r9jVar.q) && this.r.equals(r9jVar.r) && this.s.equals(r9jVar.s) && this.t == r9jVar.t && this.u.equals(r9jVar.u) && this.v.equals(r9jVar.v) && this.w.equals(r9jVar.w) && jl40.l(this.x, r9jVar.x) && this.y.equals(r9jVar.y) && this.z == r9jVar.z;
    }

    public final YbButtonView.a f() {
        return this.w;
    }

    public final YbButtonView.a g() {
        return this.x;
    }

    public final boolean h() {
        return this.t;
    }

    public final int hashCode() {
        int hashCode = (this.w.hashCode() + ((this.v.hashCode() + unr0.c(unr0.e(uw51.b(this.s, (this.r.hashCode() + ((this.q.hashCode() + (this.p.hashCode() * 31)) * 31)) * 31, 31), 31, this.t), 31, this.u)) * 31)) * 31;
        YbButtonView.a aVar = this.x;
        return Boolean.hashCode(this.z) + ((this.y.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31);
    }

    public final dn8 i() {
        return this.q;
    }

    public final Text j() {
        return this.s;
    }

    public final rbv k() {
        return this.r;
    }

    public final List l() {
        return this.u;
    }

    public final boolean m() {
        return this.z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Real(id=");
        sb.append(this.p);
        sb.append(", requisites=");
        sb.append(this.q);
        sb.append(", requisitesShowHideImage=");
        sb.append(this.r);
        sb.append(", requisitesShowHideA11yDescription=");
        sb.append(this.s);
        sb.append(", removable=");
        sb.append(this.t);
        sb.append(", settings=");
        sb.append(this.u);
        sb.append(", addToSamsungPaySettingsItemState=");
        sb.append(this.v);
        sb.append(", freezeButtonState=");
        sb.append(this.w);
        sb.append(", reissueButtonState=");
        sb.append(this.x);
        sb.append(", deleteButtonState=");
        sb.append(this.y);
        sb.append(", isNfcSettingsAvailable=");
        return x4e.i(sb, this.z, Extension.C_BRAKE);
    }
}
