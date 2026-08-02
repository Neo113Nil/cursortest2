package defpackage;

/* loaded from: classes4.dex */
public final class qmw {
    public static final qmw f = new qmw(0, Long.MAX_VALUE, h4q.b);
    public final long a;
    public final long b;
    public final h4q c;
    public final float d;
    public final long e;

    public qmw(long j, long j2, h4q h4qVar) {
        this.a = j;
        this.b = j2;
        this.c = h4qVar;
        this.d = j2 > 0 ? j / j2 : 0.0f;
        this.e = eeh.c(2000 * h4qVar.a);
    }

    public static /* synthetic */ qmw b(qmw qmwVar, Long l, h4q h4qVar, int i) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            h4qVar = null;
        }
        return qmwVar.a(l, null, h4qVar);
    }

    public final qmw a(Long l, Long l2, h4q h4qVar) {
        float f2 = h4qVar != null ? h4qVar.a : this.c.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        long longValue = l2 != null ? l2.longValue() : this.b;
        long j = longValue < 0 ? 0L : longValue;
        return new qmw(yhn.f(l != null ? l.longValue() : this.a, 0L, j), j, new h4q(f2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmw)) {
            return false;
        }
        qmw qmwVar = (qmw) obj;
        return this.a == qmwVar.a && this.b == qmwVar.b && this.c.equals(qmwVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c.a) + tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder l = tlm.l(this.a, "YnisonPlayerPosition(progressMs=", ", durationMs=");
        l.append(this.b);
        l.append(", speed=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
