package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y0s0 implements pre {
    public final String a;
    public final azr0 b;
    public final r9x0 c;
    public final ul4 d;
    public final String e;

    public y0s0(String str, azr0 azr0Var, r9x0 r9x0Var, ul4 ul4Var, String str2) {
        this.a = str;
        this.b = azr0Var;
        this.c = r9x0Var;
        this.d = ul4Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0s0)) {
            return false;
        }
        y0s0 y0s0Var = (y0s0) obj;
        return jl40.l(this.a, y0s0Var.a) && this.b.equals(y0s0Var.b) && jl40.l(this.c, y0s0Var.c) && jl40.l(this.d, y0s0Var.d) && jl40.l(this.e, y0s0Var.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "shortcut";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        r9x0 r9x0Var = this.c;
        int hashCode2 = (hashCode + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        ul4 ul4Var = this.d;
        int hashCode3 = (hashCode2 + (ul4Var == null ? 0 : ul4Var.hashCode())) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutRemoteCoreWidget(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", badge=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
