package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class rk3 implements zk3 {
    public final ni3 a;

    public rk3(ni3 ni3Var) {
        this.a = ni3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk3) && jl40.l(this.a, ((rk3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Authorized(credentials=" + this.a + Extension.C_BRAKE;
    }
}
