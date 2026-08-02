package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yzj0 implements c0k0 {
    public final int a;
    public final d51 b;

    public yzj0(int i, d51 d51Var) {
        this.a = i;
        this.b = d51Var;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzj0)) {
            return false;
        }
        yzj0 yzj0Var = (yzj0) obj;
        return this.a == yzj0Var.a && this.b.equals(yzj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RoutePosition(index=" + this.a + ", routeType=" + this.b + Extension.C_BRAKE;
    }
}
