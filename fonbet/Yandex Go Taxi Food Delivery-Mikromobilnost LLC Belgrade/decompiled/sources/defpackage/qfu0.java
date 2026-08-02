package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qfu0 {
    public final igu0 a;
    public final bl00 b;
    public final bl00 c;
    public final vfu0 d;
    public final Float e;

    public qfu0(igu0 igu0Var, bl00 bl00Var, bl00 bl00Var2, vfu0 vfu0Var, Float f) {
        this.a = igu0Var;
        this.b = bl00Var;
        this.c = bl00Var2;
        this.d = vfu0Var;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qfu0) {
            qfu0 qfu0Var = (qfu0) obj;
            if (this.a.equals(qfu0Var.a) && jl40.l(this.b, qfu0Var.b) && this.c == qfu0Var.c && this.d == qfu0Var.d && jl40.l(this.e, qfu0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl00 bl00Var = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (bl00Var == null ? 0 : bl00Var.hashCode())) * 31)) * 31)) * 31;
        Float f = this.e;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "StopBubbleUiState(stop=" + this.a + ", image=" + this.b + ", pointImage=" + this.c + ", focusMode=" + this.d + ", minZoom=" + this.e + Extension.C_BRAKE;
    }
}
