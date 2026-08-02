package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h implements j$.time.temporal.n, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final m a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.time.e.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public h(m mVar, int i, int i2, int i3) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.n
    public final Temporal u(Temporal temporal) {
        m mVar = (m) temporal.b(j$.time.temporal.p.b);
        if (mVar == null || this.a.equals(mVar)) {
            if (this.c != 0) {
                j$.time.temporal.s C = this.a.C(j$.time.temporal.a.MONTH_OF_YEAR);
                long j = (C.a == C.b && C.c == C.d && C.d()) ? (C.d - C.a) + 1 : -1L;
                int i = this.b;
                if (j > 0) {
                    temporal = temporal.l((i * j) + this.c, ChronoUnit.MONTHS);
                } else {
                    if (i != 0) {
                        temporal = temporal.l(i, ChronoUnit.YEARS);
                    }
                    temporal = temporal.l(this.c, ChronoUnit.MONTHS);
                }
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    temporal = temporal.l(i2, ChronoUnit.YEARS);
                }
            }
            int i3 = this.d;
            return i3 != 0 ? temporal.l(i3, ChronoUnit.DAYS) : temporal;
        }
        j$.time.i.f("Chronology mismatch, expected: ", this.a.s(), ", actual: ", mVar.s());
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.a.equals(hVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
