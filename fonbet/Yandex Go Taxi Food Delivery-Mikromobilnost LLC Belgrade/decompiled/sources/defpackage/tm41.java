package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tm41 {
    public final sl41 a;
    public final s421 b;
    public final bm41 c;

    public tm41(sl41 sl41Var, s421 s421Var, bm41 bm41Var) {
        this.a = sl41Var;
        this.b = s421Var;
        this.c = bm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tm41) {
            tm41 tm41Var = (tm41) obj;
            if (this.a == tm41Var.a && this.b == tm41Var.b && this.c.equals(tm41Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebViewConfig(args=" + this.a + ", dependencies=" + this.b + ", callback=" + this.c + Extension.C_BRAKE;
    }
}
