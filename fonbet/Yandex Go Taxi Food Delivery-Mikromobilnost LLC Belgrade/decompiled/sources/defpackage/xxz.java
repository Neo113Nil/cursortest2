package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xxz {
    public final long a;
    public final long b;

    public xxz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxz)) {
            return false;
        }
        xxz xxzVar = (xxz) obj;
        return this.a == xxzVar.a && this.b == xxzVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "LpEditDeliveryInterval(from=", ", to="));
    }
}
