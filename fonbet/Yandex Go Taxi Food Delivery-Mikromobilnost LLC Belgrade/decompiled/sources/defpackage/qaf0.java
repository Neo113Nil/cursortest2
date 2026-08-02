package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qaf0 {
    public final yaf0 a;
    public final int b;

    public qaf0(yaf0 yaf0Var, int i) {
        this.a = yaf0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaf0)) {
            return false;
        }
        qaf0 qaf0Var = (qaf0) obj;
        return jl40.l(this.a, qaf0Var.a) && this.b == qaf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductsScreenInstance(screenType=" + this.a + ", instanceToken=" + this.b + Extension.C_BRAKE;
    }
}
