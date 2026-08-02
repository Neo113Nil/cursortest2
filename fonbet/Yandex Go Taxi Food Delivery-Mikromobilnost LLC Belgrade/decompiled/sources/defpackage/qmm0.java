package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qmm0 {
    public final CharSequence a;
    public final ldc b;
    public final x9x0 c;
    public final x2s d;

    public qmm0(CharSequence charSequence, ldc ldcVar, x9x0 x9x0Var, x2s x2sVar) {
        this.a = charSequence;
        this.b = ldcVar;
        this.c = x9x0Var;
        this.d = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmm0)) {
            return false;
        }
        qmm0 qmm0Var = (qmm0) obj;
        return jl40.l(this.a, qmm0Var.a) && jl40.l(this.b, qmm0Var.b) && this.c.equals(qmm0Var.c) && jl40.l(this.d, qmm0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31)) * 31;
        x2s x2sVar = this.d;
        return hashCode2 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ScenarioSelectorButton(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", action=" + this.c + ", onShownAnalyticsData=" + this.d + Extension.C_BRAKE;
    }
}
