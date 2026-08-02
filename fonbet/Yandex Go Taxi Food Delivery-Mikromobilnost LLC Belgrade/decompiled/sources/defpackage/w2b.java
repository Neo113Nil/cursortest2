package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w2b {
    public final long a;
    public final long b;
    public final long c;

    public w2b(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2b)) {
            return false;
        }
        w2b w2bVar = (w2b) obj;
        return this.a == w2bVar.a && this.b == w2bVar.b && this.c == w2bVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "ChatEventsEntity(chatInternalId=", ", events=");
        w.append(this.b);
        return g8e.l(this.c, ", version=", Extension.C_BRAKE, w);
    }
}
