package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zi50 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final cj50 d;
    public final sh50 e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final bi50 j;
    public final kf60 k;
    public final kyx l;
    public final d43 m;

    public zi50(String str, boolean z, boolean z2, cj50 cj50Var, sh50 sh50Var, boolean z3, boolean z4, String str2, String str3, bi50 bi50Var, kf60 kf60Var, kyx kyxVar, d43 d43Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = cj50Var;
        this.e = sh50Var;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = str3;
        this.j = bi50Var;
        this.k = kf60Var;
        this.l = kyxVar;
        this.m = d43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi50)) {
            return false;
        }
        zi50 zi50Var = (zi50) obj;
        return jl40.l(this.a, zi50Var.a) && this.b == zi50Var.b && this.c == zi50Var.c && jl40.l(this.d, zi50Var.d) && jl40.l(this.e, zi50Var.e) && this.f == zi50Var.f && this.g == zi50Var.g && jl40.l(this.h, zi50Var.h) && jl40.l(this.i, zi50Var.i) && jl40.l(this.j, zi50Var.j) && jl40.l(this.k, zi50Var.k) && jl40.l(this.l, zi50Var.l) && jl40.l(this.m, zi50Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + unr0.b(unr0.b(unr0.e(unr0.e((this.e.hashCode() + ((this.d.hashCode() + unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31)) * 31;
        d43 d43Var = this.m;
        return hashCode + (d43Var != null ? d43Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("NddRouteSelectorUiState(currentAddress=", this.a, ", showShareButton=", ", isAnimated=", this.b);
        l.append(this.c);
        l.append(", nddRouteSwitchButtonsState=");
        l.append(this.d);
        l.append(", addressFlowSwitchButtonsState=");
        l.append(this.e);
        l.append(", isSourceSelector=");
        l.append(this.f);
        l.append(", isPickupPointSelector=");
        unr0.A(", title=", this.h, ", addressTitle=", l, this.g);
        l.append(this.i);
        l.append(", doneButtonState=");
        l.append(this.j);
        l.append(", notAllowedSourceState=");
        l.append(this.k);
        l.append(", layersFeaturesErrorState=");
        l.append(this.l);
        l.append(", areaAnalyticsData=");
        l.append(this.m);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public zi50() {
        this(0);
    }

    public zi50(int i) {
        this(null, false, false, cj50.c, sh50.c, true, true, "", "", bi50.c, kf60.c, kyx.e, null);
    }
}
