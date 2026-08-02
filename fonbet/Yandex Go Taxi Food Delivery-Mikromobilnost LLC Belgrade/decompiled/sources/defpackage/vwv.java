package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vwv extends mwc0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public vwv(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final List a() {
        return scc.g(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vwv)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zkb1.b(a(), ((vwv) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "InitializationEvent(duration=", ", width=");
        w.append(this.b);
        x4e.A(this.c, ", height=", ", rotationCorrection=", w);
        return oyr.n(this.d, Extension.C_BRAKE, w);
    }
}
