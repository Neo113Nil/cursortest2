package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ua71 implements ug71 {
    public final xn71 a;

    public ua71(xn71 xn71Var) {
        this.a = xn71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua71) && jl40.l(this.a, ((ua71) obj).a);
    }

    public final int hashCode() {
        xn71 xn71Var = this.a;
        if (xn71Var == null) {
            return 0;
        }
        return xn71Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.a + Extension.C_BRAKE;
    }
}
