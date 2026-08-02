package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class v6b {
    public final long a;
    public final long b;

    public v6b(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6b)) {
            return false;
        }
        v6b v6bVar = (v6b) obj;
        return this.a == v6bVar.a && this.b == v6bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "ChatOrganizationCrossRefEntity(chatInternalId=", ", organizationId="));
    }
}
