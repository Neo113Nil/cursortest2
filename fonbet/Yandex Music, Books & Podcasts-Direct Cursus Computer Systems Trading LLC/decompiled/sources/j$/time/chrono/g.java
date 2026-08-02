package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g implements e, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.l b;

    public static g u(m mVar, Temporal temporal) {
        g gVar = (g) temporal;
        if (mVar.equals(gVar.d())) {
            return gVar;
        }
        j$.time.i.e("Chronology mismatch, required: ", mVar.s(), gVar.d().s());
        return null;
    }

    public g(b bVar, j$.time.l lVar) {
        Objects.requireNonNull(lVar, "time");
        this.a = bVar;
        this.b = lVar;
    }

    public final g T(Temporal temporal, j$.time.l lVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == lVar) ? this : new g(d.u(bVar.d(), temporal), lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.chrono.e
    public final b n() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.l h() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.e0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return (((j$.time.temporal.a) oVar).e0() ? this.b : this.a).k(oVar);
        }
        return oVar.E(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).e0() ? this.b.e(oVar) : this.a.e(oVar);
        }
        return k(oVar).a(g(oVar), oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).e0() ? this.b.g(oVar) : this.a.g(oVar);
        }
        return oVar.T(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j */
    public final Temporal m(LocalDate localDate) {
        return T(localDate, this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final g i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            boolean e0 = ((j$.time.temporal.a) oVar).e0();
            b bVar = this.a;
            if (e0) {
                return T(bVar, this.b.i(j, oVar));
            }
            return T(bVar.i(j, oVar), this.b);
        }
        return u(this.a.d(), oVar.a0(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final g l(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return u(this.a.d(), qVar.u(this, j));
        }
        switch (f.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J(this.a, 0L, 0L, 0L, j);
            case 2:
                g T = T(this.a.l(j / 86400000000L, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return T.J(T.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g T2 = T(this.a.l(j / 86400000, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return T2.J(T2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return J(this.a, 0L, 0L, j, 0L);
            case 5:
                return J(this.a, 0L, j, 0L, 0L);
            case 6:
                return J(this.a, j, 0L, 0L, 0L);
            case 7:
                g T3 = T(this.a.l(j / 256, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return T3.J(T3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return T(this.a.l(j, qVar), this.b);
        }
    }

    public final g J(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.l lVar = this.b;
        if (j5 == 0) {
            return T(bVar, lVar);
        }
        long j6 = j / 24;
        long j0 = lVar.j0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + j0;
        long floorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long floorMod = Math.floorMod(j7, 86400000000000L);
        return T(bVar.l(floorDiv, (j$.time.temporal.q) ChronoUnit.DAYS), floorMod == j0 ? this.b : j$.time.l.a0(floorMod));
    }

    @Override // j$.time.chrono.e
    public final j I(ZoneId zoneId) {
        return l.E(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        e Q = d().Q(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, Q);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            b n = Q.n();
            if (Q.h().compareTo(this.b) < 0) {
                n = n.a(1L, (j$.time.temporal.q) chronoUnit2);
            }
            return this.a.o(n, qVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long g = Q.g(aVar) - this.a.g(aVar);
        switch (f.a[chronoUnit.ordinal()]) {
            case 1:
                g = Math.multiplyExact(g, 86400000000000L);
                break;
            case 2:
                g = Math.multiplyExact(g, 86400000000L);
                break;
            case 3:
                g = Math.multiplyExact(g, 86400000L);
                break;
            case 4:
                g = Math.multiplyExact(g, 86400);
                break;
            case 5:
                g = Math.multiplyExact(g, 1440);
                break;
            case 6:
                g = Math.multiplyExact(g, 24);
                break;
            case 7:
                g = Math.multiplyExact(g, 2);
                break;
        }
        return Math.addExact(g, this.b.o(Q.h(), qVar));
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }
}
