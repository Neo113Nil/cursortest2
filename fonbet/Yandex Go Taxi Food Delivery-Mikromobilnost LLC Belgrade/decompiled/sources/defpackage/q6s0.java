package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q6s0 {
    public final boolean a;
    public final boolean b;

    public q6s0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6s0)) {
            return false;
        }
        q6s0 q6s0Var = (q6s0) obj;
        return this.a == q6s0Var.a && this.b == q6s0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("ShowEndpoints(showSrcPin=", ", showDstPin=", Extension.C_BRAKE, this.a, this.b);
    }

    public q6s0() {
        this(true, true);
    }
}
