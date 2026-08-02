package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xd3 {
    public final au2 a;
    public final ie3 b;
    public final String c;

    public xd3(au2 au2Var, ie3 ie3Var, String str) {
        this.a = au2Var;
        this.b = ie3Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xd3) {
            xd3 xd3Var = (xd3) obj;
            if (this.a == xd3Var.a && jl40.l(this.b, xd3Var.b) && jl40.l(this.c, xd3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ie3 ie3Var = this.b;
        return this.c.hashCode() + ((hashCode + (ie3Var == null ? 0 : ie3Var.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuctionButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
