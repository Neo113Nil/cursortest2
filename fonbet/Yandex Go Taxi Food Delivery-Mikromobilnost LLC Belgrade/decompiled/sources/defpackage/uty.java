package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uty {
    public final si90 a;
    public final Text.Constant b;
    public final Text c;
    public final zbv d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public uty(si90 si90Var, Text.Constant constant, Text.Constant constant2, zbv zbvVar, Integer num, boolean z, boolean z2, boolean z3) {
        this.a = si90Var;
        this.b = constant;
        this.c = constant2;
        this.d = zbvVar;
        this.e = num;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uty)) {
            return false;
        }
        uty utyVar = (uty) obj;
        return jl40.l(this.a, utyVar.a) && this.b.equals(utyVar.b) && jl40.l(this.c, utyVar.c) && this.d.equals(utyVar.d) && jl40.l(this.e, utyVar.e) && this.f == utyVar.f && this.g == utyVar.g && this.h == utyVar.h;
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        int hashCode = (this.d.hashCode() + ((d + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.h) + unr0.e(unr0.e((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListViewItem(data=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subTitle=");
        sb.append(this.c);
        sb.append(", startIcon=");
        sb.append(this.d);
        sb.append(", endIcon=");
        sb.append(this.e);
        sb.append(", enabled=");
        sb.append(this.f);
        sb.append(", clickable=");
        return smw0.k(", shimmerStarted=", Extension.C_BRAKE, sb, this.g, this.h);
    }
}
