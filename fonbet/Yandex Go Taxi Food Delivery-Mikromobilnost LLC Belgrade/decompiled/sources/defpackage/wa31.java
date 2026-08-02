package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wa31 {
    public final ldc a;
    public final float b;

    public wa31(ldc ldcVar, float f) {
        this.a = ldcVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa31)) {
            return false;
        }
        wa31 wa31Var = (wa31) obj;
        return jl40.l(this.a, wa31Var.a) && y7m.b(this.b, wa31Var.b);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        return Float.hashCode(this.b) + ((ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31);
    }

    public final String toString() {
        return "VerticalBarModel(color=" + this.a + ", width=" + y7m.c(this.b) + Extension.C_BRAKE;
    }
}
