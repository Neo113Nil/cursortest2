package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ve20 {
    public final ioc0 a;
    public final soc0 b;
    public final String c;

    public ve20(ioc0 ioc0Var, soc0 soc0Var, String str) {
        this.a = ioc0Var;
        this.b = soc0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve20)) {
            return false;
        }
        ve20 ve20Var = (ve20) obj;
        return jl40.l(this.a, ve20Var.a) && jl40.l(this.b, ve20Var.b) && jl40.l(this.c, ve20Var.c);
    }

    public final int hashCode() {
        ioc0 ioc0Var = this.a;
        int hashCode = (ioc0Var == null ? 0 : ioc0Var.hashCode()) * 31;
        soc0 soc0Var = this.b;
        return this.c.hashCode() + ((hashCode + (soc0Var != null ? soc0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MicroWidgetsPlaqueOnScreen(plaque=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", screen=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
