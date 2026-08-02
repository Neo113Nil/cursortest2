package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rub extends n351 {
    public final lub c;
    public final v4v d;
    public final b151 e;
    public final nnn f;
    public final x2s g;
    public final String h;

    public rub(lub lubVar, lvi0 lvi0Var, x9x0 x9x0Var, nnn nnnVar, x2s x2sVar, String str) {
        super("circle-input", false, 14);
        this.c = lubVar;
        this.d = lvi0Var;
        this.e = x9x0Var;
        this.f = nnnVar;
        this.g = x2sVar;
        this.h = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rub)) {
            return false;
        }
        rub rubVar = (rub) obj;
        return this.c.equals(rubVar.c) && jl40.l(this.d, rubVar.d) && jl40.l(this.e, rubVar.e) && this.f.equals(rubVar.f) && jl40.l(this.g, rubVar.g) && jl40.l(this.h, rubVar.h);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        v4v v4vVar = this.d;
        int hashCode2 = (hashCode + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        b151 b151Var = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (b151Var == null ? 0 : b151Var.hashCode())) * 31)) * 31;
        x2s x2sVar = this.g;
        int hashCode4 = (hashCode3 + (x2sVar == null ? 0 : x2sVar.hashCode())) * 31;
        String str = this.h;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CircleInputModel(model=" + this.c + ", iconModel=" + this.d + ", onWidgetCenterTapAction=" + this.e + ", onProgressAssigned=" + this.f + ", onShownAnalyticsData=" + this.g + ", id=" + this.h + Extension.C_BRAKE;
    }
}
