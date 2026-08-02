package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sn40 implements rcx0 {
    public final String a;
    public final nn40 b;
    public final ln40 c;
    public final on40 d;
    public final pn40 e;
    public final qn40 f;
    public final String g;

    public sn40(String str, nn40 nn40Var, ln40 ln40Var, on40 on40Var, pn40 pn40Var, qn40 qn40Var, String str2) {
        this.a = str;
        this.b = nn40Var;
        this.c = ln40Var;
        this.d = on40Var;
        this.e = pn40Var;
        this.f = qn40Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn40)) {
            return false;
        }
        sn40 sn40Var = (sn40) obj;
        return jl40.l(this.a, sn40Var.a) && this.b.equals(sn40Var.b) && this.c.equals(sn40Var.c) && this.d.equals(sn40Var.d) && this.e.equals(sn40Var.e) && jl40.l(this.f, sn40Var.f) && this.g.equals(sn40Var.g);
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        qn40 qn40Var = this.f;
        return this.g.hashCode() + ((hashCode + (qn40Var == null ? 0 : qn40Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTariffOptionUiState(id=");
        sb.append(this.a);
        sb.append(", leadUiState=");
        sb.append(this.b);
        sb.append(", bodyUiState=");
        sb.append(this.c);
        sb.append(", trail2UiState=");
        sb.append(this.d);
        sb.append(", trailUiState=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
