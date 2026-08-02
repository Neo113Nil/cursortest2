package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class re20 {
    public final ne20 a;
    public final ne20 b;
    public final ne20 c;
    public final ne20 d;

    public re20(ne20 ne20Var, ne20 ne20Var2, ne20 ne20Var3, ne20 ne20Var4) {
        this.a = ne20Var;
        this.b = ne20Var2;
        this.c = ne20Var3;
        this.d = ne20Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re20)) {
            return false;
        }
        re20 re20Var = (re20) obj;
        return this.a.equals(re20Var.a) && this.b.equals(re20Var.b) && this.c.equals(re20Var.c) && this.d.equals(re20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedRect(leftTop=" + this.a + ", rightTop=" + this.b + ", rightBottom=" + this.c + ", leftBottom=" + this.d + Extension.C_BRAKE;
    }
}
