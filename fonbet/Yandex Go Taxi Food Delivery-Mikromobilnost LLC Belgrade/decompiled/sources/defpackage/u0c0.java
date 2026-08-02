package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u0c0 {
    public static final u0c0 d;
    public final p0c0 a;
    public final p0c0 b;
    public final p0c0 c;

    static {
        p0c0 p0c0Var = p0c0.e;
        d = new u0c0(p0c0Var, p0c0Var, p0c0Var);
    }

    public u0c0(p0c0 p0c0Var, p0c0 p0c0Var2, p0c0 p0c0Var3) {
        this.a = p0c0Var;
        this.b = p0c0Var2;
        this.c = p0c0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0c0)) {
            return false;
        }
        u0c0 u0c0Var = (u0c0) obj;
        return this.a.equals(u0c0Var.a) && this.b.equals(u0c0Var.b) && this.c.equals(u0c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PinStyles(source=" + this.a + ", destination=" + this.b + ", mid=" + this.c + Extension.C_BRAKE;
    }
}
