package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xvz0 {
    public final String a;
    public final duz0 b;

    public xvz0(String str, duz0 duz0Var) {
        this.a = str;
        this.b = duz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvz0)) {
            return false;
        }
        xvz0 xvz0Var = (xvz0) obj;
        return jl40.l(this.a, xvz0Var.a) && jl40.l(this.b, xvz0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        duz0 duz0Var = this.b;
        return hashCode + (duz0Var == null ? 0 : duz0Var.hashCode());
    }

    public final String toString() {
        return "TooltipWithActionEntity(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
