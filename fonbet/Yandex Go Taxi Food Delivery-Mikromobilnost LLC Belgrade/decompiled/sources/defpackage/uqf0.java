package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uqf0 {
    public final dof0 a;
    public final ulf0 b;
    public final qqf0 c;
    public final rqf0 d;
    public final sls e;

    public uqf0(dof0 dof0Var, ulf0 ulf0Var, qqf0 qqf0Var, rqf0 rqf0Var, sls slsVar) {
        this.a = dof0Var;
        this.b = ulf0Var;
        this.c = qqf0Var;
        this.d = rqf0Var;
        this.e = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqf0)) {
            return false;
        }
        uqf0 uqf0Var = (uqf0) obj;
        return jl40.l(this.a, uqf0Var.a) && this.b.equals(uqf0Var.b) && jl40.l(this.c, uqf0Var.c) && jl40.l(this.d, uqf0Var.d) && jl40.l(this.e, uqf0Var.e);
    }

    public final int hashCode() {
        dof0 dof0Var = this.a;
        int hashCode = (this.b.hashCode() + ((dof0Var == null ? 0 : dof0Var.a.hashCode()) * 31)) * 31;
        qqf0 qqf0Var = this.c;
        int hashCode2 = (hashCode + (qqf0Var == null ? 0 : qqf0Var.hashCode())) * 31;
        rqf0 rqf0Var = this.d;
        int hashCode3 = (hashCode2 + (rqf0Var == null ? 0 : rqf0Var.a.hashCode())) * 31;
        sls slsVar = this.e;
        return hashCode3 + (slsVar != null ? slsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoUiState(leadUiState=");
        sb.append(this.a);
        sb.append(", bodyUiState=");
        sb.append(this.b);
        sb.append(", trail2UiState=");
        sb.append(this.c);
        sb.append(", trailUiState=");
        sb.append(this.d);
        sb.append(", clickCallback=");
        return ly3.r(sb, this.e, Extension.C_BRAKE);
    }
}
