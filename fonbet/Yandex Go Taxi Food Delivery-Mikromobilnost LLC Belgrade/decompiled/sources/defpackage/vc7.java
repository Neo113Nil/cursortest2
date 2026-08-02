package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vc7 {
    public final long a;
    public final long b;

    public vc7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc7)) {
            return false;
        }
        vc7 vc7Var = (vc7) obj;
        return this.a == vc7Var.a && this.b == vc7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "CacheTimelineVersionsEntity(chatInternalId=", ", timelineVersion="));
    }
}
