package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zuc0 {
    public static final zuc0 f = new zuc0(new yuc0(null, ""), new yuc0(null, ""), null, null, null);
    public final yuc0 a;
    public final yuc0 b;
    public final kdc c;
    public final kdc d;
    public final kdc e;

    public zuc0(yuc0 yuc0Var, yuc0 yuc0Var2, kdc kdcVar, kdc kdcVar2, kdc kdcVar3) {
        this.a = yuc0Var;
        this.b = yuc0Var2;
        this.c = kdcVar;
        this.d = kdcVar2;
        this.e = kdcVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuc0)) {
            return false;
        }
        zuc0 zuc0Var = (zuc0) obj;
        return this.a.equals(zuc0Var.a) && this.b.equals(zuc0Var.b) && jl40.l(this.c, zuc0Var.c) && jl40.l(this.d, zuc0Var.d) && jl40.l(this.e, zuc0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kdc kdcVar = this.c;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.d;
        int hashCode3 = (hashCode2 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        kdc kdcVar3 = this.e;
        return hashCode3 + (kdcVar3 != null ? kdcVar3.hashCode() : 0);
    }

    public final String toString() {
        return "PlateNumberUiState(primaryText=" + this.a + ", secondaryText=" + this.b + ", dividerColor=" + this.c + ", borderColor=" + this.d + ", backgroundColor=" + this.e + Extension.C_BRAKE;
    }
}
