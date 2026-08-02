package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xei0 {
    public final boolean a;
    public final int b;
    public final long c;

    public xei0(boolean z, int i, long j) {
        this.a = z;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xei0)) {
            return false;
        }
        xei0 xei0Var = (xei0) obj;
        return this.a == xei0Var.a && this.b == xei0Var.b && this.c == xei0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, xvz.p("RealtimeSignalTransportConfig(canSend=", this.b, ", maxBatchSize=", ", sendInterval=", this.a));
    }

    public /* synthetic */ xei0(int i) {
        this(true, 200, 2000L);
    }

    public xei0() {
        this(0);
    }
}
