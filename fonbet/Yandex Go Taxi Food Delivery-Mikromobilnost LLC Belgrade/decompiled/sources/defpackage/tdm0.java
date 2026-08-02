package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tdm0 extends gc5 implements aam {
    public final String c;
    public final rbv d;
    public final Text e;
    public final Text f;
    public final rr51 g;
    public final rr51 h;
    public final List i;
    public final boolean j;
    public final boolean k;

    public tdm0(rbv rbvVar, rr51 rr51Var, rr51 rr51Var2, Text text, Text text2, String str, List list, boolean z, boolean z2) {
        super(str, 2);
        this.c = str;
        this.d = rbvVar;
        this.e = text;
        this.f = text2;
        this.g = rr51Var;
        this.h = rr51Var2;
        this.i = list;
        this.j = z;
        this.k = z2;
    }

    @Override // defpackage.aam
    public final boolean a() {
        return this.j && !this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdm0)) {
            return false;
        }
        tdm0 tdm0Var = (tdm0) obj;
        return jl40.l(this.c, tdm0Var.c) && jl40.l(this.d, tdm0Var.d) && jl40.l(this.e, tdm0Var.e) && jl40.l(this.f, tdm0Var.f) && jl40.l(this.g, tdm0Var.g) && jl40.l(this.h, tdm0Var.h) && jl40.l(this.i, tdm0Var.i) && this.j == tdm0Var.j && this.k == tdm0Var.k;
    }

    public final int hashCode() {
        int c = n.c(this.f, n.c(this.e, ly3.c(this.d, this.c.hashCode() * 31, 31), 31), 31);
        rr51 rr51Var = this.g;
        int hashCode = (c + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        rr51 rr51Var2 = this.h;
        return Boolean.hashCode(this.k) + unr0.e(unr0.c((hashCode + (rr51Var2 != null ? rr51Var2.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(id=");
        sb.append(this.c);
        sb.append(", startIcon=");
        sb.append(this.d);
        sb.append(", title=");
        ly3.C(sb, this.e, ", subtitle=", this.f, ", subtitleDivWidget=");
        sb.append(this.g);
        sb.append(", divWidget=");
        sb.append(this.h);
        sb.append(", accounts=");
        nzs.p(sb, this.i, ", dragAndDropEnabled=", this.j, ", expanded=");
        return x4e.i(sb, this.k, Extension.C_BRAKE);
    }
}
