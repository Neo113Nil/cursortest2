package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yk40 implements pre, hon {
    public final String a;
    public final g8l0 b;
    public final FormattedText c;
    public final FormattedText d;
    public final lts0 e;
    public final r9x0 f;
    public final fws0 g;
    public final x2s h;

    public yk40(String str, g8l0 g8l0Var, FormattedText formattedText, FormattedText formattedText2, lts0 lts0Var, r9x0 r9x0Var, fws0 fws0Var, x2s x2sVar) {
        this.a = str;
        this.b = g8l0Var;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = lts0Var;
        this.f = r9x0Var;
        this.g = fws0Var;
        this.h = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk40)) {
            return false;
        }
        yk40 yk40Var = (yk40) obj;
        return jl40.l(this.a, yk40Var.a) && this.b.equals(yk40Var.b) && this.c.equals(yk40Var.c) && this.d.equals(yk40Var.d) && jl40.l(this.e, yk40Var.e) && jl40.l(this.f, yk40Var.f) && jl40.l(this.g, yk40Var.g) && this.h.equals(yk40Var.h);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "multi-address";
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a), 31, this.d.a);
        lts0 lts0Var = this.e;
        int hashCode = (c + (lts0Var == null ? 0 : lts0Var.hashCode())) * 31;
        r9x0 r9x0Var = this.f;
        int hashCode2 = (hashCode + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        fws0 fws0Var = this.g;
        return this.h.hashCode() + ((hashCode2 + (fws0Var != null ? fws0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MultiAddressRemoteCoreWidget(id=" + this.a + ", routePointsInterval=" + this.b + ", description=" + this.c + ", title=" + this.d + ", lead=" + this.e + ", action=" + this.f + ", trail=" + this.g + ", analyticsData=" + this.h + Extension.C_BRAKE;
    }
}
