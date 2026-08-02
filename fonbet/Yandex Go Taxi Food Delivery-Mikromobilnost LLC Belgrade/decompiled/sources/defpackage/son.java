package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class son implements won {
    public final boolean a;
    public final hpn b;
    public final mon c;
    public final rr51 d;
    public final non e;
    public final ron f;

    public son(boolean z, hpn hpnVar, mon monVar, rr51 rr51Var, non nonVar, ron ronVar) {
        this.a = z;
        this.b = hpnVar;
        this.c = monVar;
        this.d = rr51Var;
        this.e = nonVar;
        this.f = ronVar;
    }

    @Override // defpackage.won
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof son)) {
            return false;
        }
        son sonVar = (son) obj;
        return this.a == sonVar.a && jl40.l(this.b, sonVar.b) && jl40.l(this.c, sonVar.c) && jl40.l(this.d, sonVar.d) && this.e.equals(sonVar.e) && jl40.l(this.f, sonVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ly3.b(Boolean.hashCode(this.a) * 31, 31, this.b.a)) * 31;
        rr51 rr51Var = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31)) * 31;
        ron ronVar = this.f;
        return hashCode2 + (ronVar != null ? ronVar.hashCode() : 0);
    }

    public final String toString() {
        return "EducationDivKitContentEntity(showCross=" + this.a + ", shadow=" + this.b + ", position=" + this.c + ", divkitData=" + this.d + ", glow=" + this.e + ", scrollBehaviour=" + this.f + Extension.C_BRAKE;
    }
}
