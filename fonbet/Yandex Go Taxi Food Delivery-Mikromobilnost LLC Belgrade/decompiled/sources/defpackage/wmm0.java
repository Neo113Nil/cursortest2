package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wmm0 {
    public final cqs0 a;
    public final boolean b;
    public final smm0 c;
    public final ldc d;
    public final x9x0 e;
    public final boolean f;
    public final x2s g;

    public wmm0(cqs0 cqs0Var, boolean z, smm0 smm0Var, ldc ldcVar, x9x0 x9x0Var, boolean z2, x2s x2sVar) {
        this.a = cqs0Var;
        this.b = z;
        this.c = smm0Var;
        this.d = ldcVar;
        this.e = x9x0Var;
        this.f = z2;
        this.g = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmm0)) {
            return false;
        }
        wmm0 wmm0Var = (wmm0) obj;
        return jl40.l(this.a, wmm0Var.a) && this.b == wmm0Var.b && jl40.l(this.c, wmm0Var.c) && jl40.l(this.d, wmm0Var.d) && this.e.equals(wmm0Var.e) && this.f == wmm0Var.f && jl40.l(this.g, wmm0Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        smm0 smm0Var = this.c;
        int hashCode = (e + (smm0Var == null ? 0 : smm0Var.hashCode())) * 31;
        ldc ldcVar = this.d;
        int e2 = unr0.e((this.e.hashCode() + ((hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31)) * 31, 31, this.f);
        x2s x2sVar = this.g;
        return e2 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ScenarioSelectorOption(slot=" + this.a + ", isSelected=" + this.b + ", selectedImage=" + this.c + ", backgroundColor=" + this.d + ", action=" + this.e + ", isEnabled=" + this.f + ", onShownAnalyticsData=" + this.g + Extension.C_BRAKE;
    }
}
