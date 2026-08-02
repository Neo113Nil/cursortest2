package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final l a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        if (this.b.equals(rVar.b)) {
            return this.a.compareTo(rVar.a);
        }
        int compare = Long.compare(E(), rVar.E());
        return compare == 0 ? this.a.compareTo(rVar.a) : compare;
    }

    static {
        l lVar = l.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        lVar.getClass();
        new r(lVar, zoneOffset);
        l lVar2 = l.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        lVar2.getClass();
        new r(lVar2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        r rVar;
        if (temporal instanceof r) {
            rVar = (r) temporal;
        } else {
            try {
                rVar = new r(l.J(temporal), ZoneOffset.d0(temporal));
            } catch (b e) {
                i.g("Unable to obtain OffsetTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (qVar instanceof ChronoUnit) {
            long E = rVar.E() - E();
            switch (q.a[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return E;
                case 2:
                    return E / 1000;
                case 3:
                    return E / 1000000;
                case 4:
                    return E / 1000000000;
                case 5:
                    return E / 60000000000L;
                case 6:
                    return E / 3600000000000L;
                case 7:
                    return E / 43200000000000L;
                default:
                    i.d("Unsupported unit: ", qVar);
                    return 0L;
            }
        }
        return qVar.between(this, rVar);
    }

    public r(l lVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(lVar, "time");
        this.a = lVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public final r J(l lVar, ZoneOffset zoneOffset) {
        return (this.a == lVar && this.b.equals(zoneOffset)) ? this : new r(lVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).e0() || oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.k(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.E(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.b;
            }
            return this.a.g(oVar);
        }
        return oVar.T(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j */
    public final Temporal m(LocalDate localDate) {
        return (r) localDate.c(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            l lVar = this.a;
            if (oVar == aVar) {
                j$.time.temporal.a aVar2 = (j$.time.temporal.a) oVar;
                return J(lVar, ZoneOffset.g0(aVar2.b.a(j, aVar2)));
            }
            return J(lVar.i(j, oVar), this.b);
        }
        return (r) oVar.a0(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final r l(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return J(this.a.l(j, qVar), this.b);
        }
        return (r) qVar.u(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(f fVar) {
        if (fVar == j$.time.temporal.p.d || fVar == j$.time.temporal.p.e) {
            return this.b;
        }
        if (((fVar == j$.time.temporal.p.a) || (fVar == j$.time.temporal.p.b)) || fVar == j$.time.temporal.p.f) {
            return null;
        }
        if (fVar == j$.time.temporal.p.g) {
            return this.a;
        }
        if (fVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal c(Temporal temporal) {
        return temporal.i(this.a.j0(), j$.time.temporal.a.NANO_OF_DAY).i(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final long E() {
        return this.a.j0() - (this.b.b * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a.equals(rVar.a) && this.b.equals(rVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
