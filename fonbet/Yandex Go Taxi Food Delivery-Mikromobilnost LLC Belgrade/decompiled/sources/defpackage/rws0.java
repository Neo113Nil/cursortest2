package defpackage;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class rws0 {
    public final long a;
    public final long b;
    public final int c;

    public rws0(int i, long j, long j2) {
        d6z.l(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rws0.class == obj.getClass()) {
            rws0 rws0Var = (rws0) obj;
            if (this.a == rws0Var.a && this.b == rws0Var.b && this.c == rws0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = tw21.a;
        Locale locale = Locale.US;
        StringBuilder w = unr0.w(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        w.append(this.b);
        w.append(", speedDivisor=");
        w.append(this.c);
        return w.toString();
    }
}
