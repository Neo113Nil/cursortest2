package defpackage;

import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class z5y0 implements c6y0 {
    public final TaxiOrderSessionCheckpoint a;
    public final long b;
    public final long c;

    public z5y0(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, long j, long j2) {
        this.a = taxiOrderSessionCheckpoint;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.c6y0
    public final TaxiOrderSessionCheckpoint a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5y0)) {
            return false;
        }
        z5y0 z5y0Var = (z5y0) obj;
        return this.a == z5y0Var.a && this.b == z5y0Var.b && this.c == z5y0Var.c;
    }

    @Override // defpackage.c6y0
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Di(checkpoint=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        return g8e.l(this.c, ", timeTaken=", Extension.C_BRAKE, sb);
    }
}
