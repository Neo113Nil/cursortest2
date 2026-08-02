package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xgf0 implements zgf0 {
    public final fv11 a;
    public final qv11 b;
    public final xss0 c;
    public final xss0 d;
    public final xss0 e;

    public xgf0(fv11 fv11Var, qv11 qv11Var, xss0 xss0Var, xss0 xss0Var2, xss0 xss0Var3) {
        this.a = fv11Var;
        this.b = qv11Var;
        this.c = xss0Var;
        this.d = xss0Var2;
        this.e = xss0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgf0)) {
            return false;
        }
        xgf0 xgf0Var = (xgf0) obj;
        return jl40.l(this.a, xgf0Var.a) && jl40.l(this.b, xgf0Var.b) && jl40.l(this.c, xgf0Var.c) && jl40.l(this.d, xgf0Var.d) && jl40.l(this.e, xgf0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xss0 xss0Var = this.c;
        int hashCode2 = (hashCode + (xss0Var == null ? 0 : xss0Var.hashCode())) * 31;
        xss0 xss0Var2 = this.d;
        int hashCode3 = (hashCode2 + (xss0Var2 == null ? 0 : xss0Var2.hashCode())) * 31;
        xss0 xss0Var3 = this.e;
        return hashCode3 + (xss0Var3 != null ? xss0Var3.hashCode() : 0);
    }

    public final String toString() {
        return "Content(headerState=" + this.a + ", progressBarState=" + this.b + ", plusState=" + this.c + ", conciergeState=" + this.d + ", ultimaModeToggleState=" + this.e + Extension.C_BRAKE;
    }
}
