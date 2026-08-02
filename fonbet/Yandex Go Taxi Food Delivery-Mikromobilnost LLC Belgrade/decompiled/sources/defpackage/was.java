package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class was {
    public final vas a;
    public final fl1 b;
    public final nas c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public was(vas vasVar, fl1 fl1Var, nas nasVar, boolean z, String str, boolean z2, boolean z3) {
        this.a = vasVar;
        this.b = fl1Var;
        this.c = nasVar;
        this.d = z;
        this.e = str;
        this.f = z2;
        this.g = z3;
    }

    public static was a(was wasVar, fl1 fl1Var, nas nasVar, String str, boolean z, int i) {
        vas vasVar = wasVar.a;
        if ((i & 2) != 0) {
            fl1Var = wasVar.b;
        }
        fl1 fl1Var2 = fl1Var;
        if ((i & 4) != 0) {
            nasVar = wasVar.c;
        }
        nas nasVar2 = nasVar;
        boolean z2 = wasVar.d;
        if ((i & 16) != 0) {
            str = wasVar.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = wasVar.f;
        }
        boolean z3 = wasVar.g;
        wasVar.getClass();
        return new was(vasVar, fl1Var2, nasVar2, z2, str2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof was)) {
            return false;
        }
        was wasVar = (was) obj;
        return jl40.l(this.a, wasVar.a) && jl40.l(this.b, wasVar.b) && jl40.l(this.c, wasVar.c) && this.d == wasVar.d && jl40.l(this.e, wasVar.e) && this.f == wasVar.f && this.g == wasVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fl1 fl1Var = this.b;
        int hashCode2 = (hashCode + (fl1Var == null ? 0 : fl1Var.hashCode())) * 31;
        nas nasVar = this.c;
        int e = unr0.e((hashCode2 + (nasVar == null ? 0 : nasVar.a.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + unr0.e((e + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsPayEnrollSuccessState(fpsPay=");
        sb.append(this.a);
        sb.append(", currentAgreement=");
        sb.append(this.b);
        sb.append(", bottomSheetState=");
        sb.append(this.c);
        sb.append(", showOpenAccountsMarker=");
        sb.append(this.d);
        sb.append(", operationId=");
        tse0.y(this.e, ", isConfirming=", ", isUpgradeScreen=", sb, this.f);
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
