package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u030 {
    public final ldc a;
    public final int b;

    public u030(ldc ldcVar, int i) {
        this.a = ldcVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u030)) {
            return false;
        }
        u030 u030Var = (u030) obj;
        return jl40.l(this.a, u030Var.a) && this.b == u030Var.b;
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        return Integer.hashCode(this.b) + ((ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31);
    }

    public final String toString() {
        return "ModalViewContentStyle(backgroundColor=" + this.a + ", spacingHeight=" + this.b + Extension.C_BRAKE;
    }
}
