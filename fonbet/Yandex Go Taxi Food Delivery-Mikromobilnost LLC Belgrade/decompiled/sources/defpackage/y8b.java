package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y8b {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public y8b(int i, int i2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8b)) {
            return false;
        }
        y8b y8bVar = (y8b) obj;
        return this.a == y8bVar.a && this.b == y8bVar.b && this.c == y8bVar.c && this.d == y8bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "ChatRoleEntity(chatInternalId=", ", version=");
        vfc.y(w, this.b, ", role=", this.c);
        return b64.q(w, ", rights=", this.d, Extension.C_BRAKE);
    }
}
