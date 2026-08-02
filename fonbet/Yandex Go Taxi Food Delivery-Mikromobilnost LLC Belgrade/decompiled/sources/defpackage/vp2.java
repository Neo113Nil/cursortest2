package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class vp2 implements wp2 {
    public final long a;
    public final long b;

    public vp2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp2)) {
            return false;
        }
        vp2 vp2Var = (vp2) obj;
        return ldc.c(this.a, vp2Var.a) && ldc.c(this.b, vp2Var.b);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("MultiColor(light=", ldc.i(this.a), ", dark=", ldc.i(this.b), Extension.C_BRAKE);
    }
}
