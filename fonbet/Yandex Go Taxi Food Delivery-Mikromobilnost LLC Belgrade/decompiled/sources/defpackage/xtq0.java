package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xtq0 {
    public final String a;
    public final duq0 b;

    public xtq0(String str, duq0 duq0Var) {
        this.a = str;
        this.b = duq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtq0)) {
            return false;
        }
        xtq0 xtq0Var = (xtq0) obj;
        return jl40.l(this.a, xtq0Var.a) && jl40.l(this.b, xtq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        duq0 duq0Var = this.b;
        return hashCode + (duq0Var == null ? 0 : duq0Var.hashCode());
    }

    public final String toString() {
        return "ServerTooltipActionEntity(url=" + this.a + ", linkContent=" + this.b + Extension.C_BRAKE;
    }
}
