package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r0l0 {
    public final boolean a;
    public final boolean b;

    public r0l0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0l0)) {
            return false;
        }
        r0l0 r0l0Var = (r0l0) obj;
        return this.a == r0l0Var.a && this.b == r0l0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("RouteChange(srcChanged=", ", destsChanged=", Extension.C_BRAKE, this.a, this.b);
    }
}
