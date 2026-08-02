package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vzo0 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final szo0 d;
    public final String e;
    public final tzo0 f;
    public final tzo0 g;
    public final uzo0 h;

    public vzo0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, szo0 szo0Var, String str, tzo0 tzo0Var, tzo0 tzo0Var2, uzo0 uzo0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = szo0Var;
        this.e = str;
        this.f = tzo0Var;
        this.g = tzo0Var2;
        this.h = uzo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzo0)) {
            return false;
        }
        vzo0 vzo0Var = (vzo0) obj;
        return jl40.l(this.a, vzo0Var.a) && jl40.l(this.b, vzo0Var.b) && jl40.l(this.c, vzo0Var.c) && jl40.l(this.d, vzo0Var.d) && this.e.equals(vzo0Var.e) && this.f.equals(vzo0Var.f) && this.g.equals(vzo0Var.g) && jl40.l(this.h, vzo0Var.h);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        szo0 szo0Var = this.d;
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + unr0.b((b + (szo0Var == null ? 0 : szo0Var.hashCode())) * 31, 31, this.e)) * 31)) * 31;
        uzo0 uzo0Var = this.h;
        return hashCode + (uzo0Var != null ? uzo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersSubscriptionUpsaleOnBookUiState(title=", ", subtitle=", ", priceTitle=");
        r.append((Object) this.c);
        r.append(", badge=");
        r.append(this.d);
        r.append(", imageTag=");
        r.append(this.e);
        r.append(", rejectButton=");
        r.append(this.f);
        r.append(", confirmButton=");
        r.append(this.g);
        r.append(", legalInfo=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
