package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vye {
    public final long a;
    public final long b;

    public vye(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vye)) {
            return false;
        }
        vye vyeVar = (vye) obj;
        return this.a == vyeVar.a && this.b == vyeVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "CountdownAnchor(initialRemainingMs=", ", anchorUptime="));
    }
}
