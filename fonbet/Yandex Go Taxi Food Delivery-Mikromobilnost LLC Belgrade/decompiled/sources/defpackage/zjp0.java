package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zjp0 {
    public final CharSequence a;
    public final CharSequence b;
    public final ldc c;
    public final lvi0 d;
    public final x9x0 e;
    public final x2s f;
    public final yjp0 g;

    public zjp0(CharSequence charSequence, CharSequence charSequence2, ldc ldcVar, lvi0 lvi0Var, x9x0 x9x0Var, x2s x2sVar, yjp0 yjp0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ldcVar;
        this.d = lvi0Var;
        this.e = x9x0Var;
        this.f = x2sVar;
        this.g = yjp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjp0)) {
            return false;
        }
        zjp0 zjp0Var = (zjp0) obj;
        return jl40.l(this.a, zjp0Var.a) && jl40.l(this.b, zjp0Var.b) && jl40.l(this.c, zjp0Var.c) && this.d.equals(zjp0Var.d) && this.e.equals(zjp0Var.e) && this.f.equals(zjp0Var.f) && jl40.l(this.g, zjp0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ldc ldcVar = this.c;
        int a = tse0.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31)) * 31)) * 31, 31);
        yjp0 yjp0Var = this.g;
        return a + (yjp0Var != null ? yjp0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScrollableItemModel(title=", ", subtitle=", ", backgroundColor=");
        r.append(this.c);
        r.append(", image=");
        r.append(this.d);
        r.append(", widgetAction=");
        r.append(this.e);
        r.append(", onShownAnalyticsData=");
        r.append(this.f);
        r.append(", badge=");
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
