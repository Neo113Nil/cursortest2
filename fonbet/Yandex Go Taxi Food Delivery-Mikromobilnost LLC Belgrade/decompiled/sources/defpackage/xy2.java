package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xy2 {
    public final tx4 a;
    public final tx4 b;
    public final tx4 c;
    public final gxd d;

    public xy2(tx4 tx4Var, tx4 tx4Var2, tx4 tx4Var3, gxd gxdVar) {
        this.a = tx4Var;
        this.b = tx4Var2;
        this.c = tx4Var3;
        this.d = gxdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy2)) {
            return false;
        }
        xy2 xy2Var = (xy2) obj;
        return this.a.equals(xy2Var.a) && this.b.equals(xy2Var.b) && this.c.equals(xy2Var.c) && this.d.equals(xy2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppTypography(normal=" + this.a + ", tight=" + this.b + ", loose=" + this.c + ", condensed=" + this.d + Extension.C_BRAKE;
    }
}
