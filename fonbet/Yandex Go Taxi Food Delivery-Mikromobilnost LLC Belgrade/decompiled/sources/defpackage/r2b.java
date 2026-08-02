package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r2b {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public r2b(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2b)) {
            return false;
        }
        r2b r2bVar = (r2b) obj;
        return this.a == r2bVar.a && this.b == r2bVar.b && this.c == r2bVar.c && this.d == r2bVar.d && this.e == r2bVar.e && this.f == r2bVar.f && this.g == r2bVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "ThreadStateUpdateInfo(internalId=", ", seenMarker=");
        w.append(this.b);
        x4e.A(this.c, ", seenSeqNo=", ", ownerSeenMarkerVersion=", w);
        w.append(this.d);
        x4e.A(this.e, ", lastTimestamp=", ", lastSeqNo=", w);
        w.append(this.f);
        return g8e.l(this.g, ", minMessageTimestamp=", Extension.C_BRAKE, w);
    }
}
