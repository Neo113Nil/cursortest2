package defpackage;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes5.dex */
public final class tbo {
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final Long e;
    public final hee f;

    public tbo(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = hee.v(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tbo)) {
            return false;
        }
        tbo tboVar = (tbo) obj;
        return this.a == tboVar.a && this.b == tboVar.b && this.c == tboVar.c && Double.compare(this.d, tboVar.d) == 0 && hdg.S(this.e, tboVar.e) && hdg.S(this.f, tboVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.m(this.a, "maxAttempts");
        Y.n(this.b, "initialBackoffNanos");
        Y.n(this.c, "maxBackoffNanos");
        Y.u("backoffMultiplier", String.valueOf(this.d));
        Y.q(this.e, "perAttemptRecvTimeoutNanos");
        Y.q(this.f, "retryableStatusCodes");
        return Y.toString();
    }
}
