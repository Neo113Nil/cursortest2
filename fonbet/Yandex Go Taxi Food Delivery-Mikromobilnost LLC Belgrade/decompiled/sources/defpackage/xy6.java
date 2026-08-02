package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xy6 extends az6 {
    public final String a;
    public final sy6 b;

    public xy6(String str, sy6 sy6Var) {
        this.a = str;
        this.b = sy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy6)) {
            return false;
        }
        xy6 xy6Var = (xy6) obj;
        return jl40.l(this.a, xy6Var.a) && this.b.equals(xy6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SafeFlowButtonAction(url=" + this.a + ", commitProperties=" + this.b + Extension.C_BRAKE;
    }
}
