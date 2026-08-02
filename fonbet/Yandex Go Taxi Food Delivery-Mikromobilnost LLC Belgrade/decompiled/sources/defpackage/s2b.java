package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class s2b {
    public final long a;
    public final long b;

    public s2b(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2b)) {
            return false;
        }
        s2b s2bVar = (s2b) obj;
        return this.a == s2bVar.a && this.b == s2bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "Versions(version=", ", fullInfoVersion="));
    }
}
