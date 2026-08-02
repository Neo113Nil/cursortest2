package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y2c0 {
    public final long a;
    public final long b;
    public final long c;

    public y2c0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2c0)) {
            return false;
        }
        y2c0 y2c0Var = (y2c0) obj;
        return this.a == y2c0Var.a && this.b == y2c0Var.b && this.c == y2c0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "PinnedMessagesEntity(chatInternalId=", ", timestamp=");
        w.append(this.b);
        return g8e.l(this.c, ", lastActionTimestamp=", Extension.C_BRAKE, w);
    }
}
