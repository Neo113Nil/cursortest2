package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xis0 {
    public static final xis0 c;
    public final okj a;
    public final okj b;

    static {
        mkj mkjVar = mkj.a;
        c = new xis0(mkjVar, mkjVar);
    }

    public xis0(okj okjVar, okj okjVar2) {
        this.a = okjVar;
        this.b = okjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xis0)) {
            return false;
        }
        xis0 xis0Var = (xis0) obj;
        return this.a.equals(xis0Var.a) && this.b.equals(xis0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + Extension.C_BRAKE;
    }
}
