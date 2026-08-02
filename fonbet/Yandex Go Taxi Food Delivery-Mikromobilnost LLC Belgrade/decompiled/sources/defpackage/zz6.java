package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zz6 {
    public final vz6 a;
    public final vz6 b;
    public final tay c;

    public zz6(vz6 vz6Var, vz6 vz6Var2, tay tayVar) {
        this.a = vz6Var;
        this.b = vz6Var2;
        this.c = tayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz6)) {
            return false;
        }
        zz6 zz6Var = (zz6) obj;
        return this.a.equals(zz6Var.a) && jl40.l(this.b, zz6Var.b) && jl40.l(this.c, zz6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vz6 vz6Var = this.b;
        int hashCode2 = (hashCode + (vz6Var == null ? 0 : vz6Var.hashCode())) * 31;
        tay tayVar = this.c;
        return hashCode2 + (tayVar != null ? tayVar.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonGroupEntity(firstButton=" + this.a + ", secondButton=" + this.b + ", legalAgreement=" + this.c + Extension.C_BRAKE;
    }
}
