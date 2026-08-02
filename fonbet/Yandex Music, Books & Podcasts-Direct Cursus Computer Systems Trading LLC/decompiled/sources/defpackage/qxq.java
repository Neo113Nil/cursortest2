package defpackage;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qxq {
    public final long a;
    public final long b;
    public final int c;

    public qxq(int i, long j, long j2) {
        vq1.v(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qxq.class == obj.getClass()) {
            qxq qxqVar = (qxq) obj;
            if (this.a == qxqVar.a && this.b == qxqVar.b && this.c == qxqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = dvt.a;
        Locale locale = Locale.US;
        StringBuilder l = tlm.l(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        l.append(this.b);
        l.append(", speedDivisor=");
        l.append(this.c);
        return l.toString();
    }
}
