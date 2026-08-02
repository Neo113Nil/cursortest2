package defpackage;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zwd {
    public final int a;
    public final long b;
    public final hee c;

    public zwd(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = hee.v(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zwd.class != obj.getClass()) {
            return false;
        }
        zwd zwdVar = (zwd) obj;
        return this.a == zwdVar.a && this.b == zwdVar.b && hdg.S(this.c, zwdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.m(this.a, "maxAttempts");
        Y.n(this.b, "hedgingDelayNanos");
        Y.q(this.c, "nonFatalStatusCodes");
        return Y.toString();
    }
}
