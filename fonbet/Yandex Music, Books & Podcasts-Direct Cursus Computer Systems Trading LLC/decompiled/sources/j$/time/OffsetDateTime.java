package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            compare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            compare = Long.compare(this.a.z(this.b), offsetDateTime2.a.z(offsetDateTime2.b));
            if (compare == 0) {
                compare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime u(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d = zoneId.E().d(instant);
        return new OffsetDateTime(LocalDateTime.T(instant.a, instant.b, d), d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // j$.time.temporal.Temporal
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset d0 = ZoneOffset.d0(temporal);
                LocalDate localDate = (LocalDate) temporal.b(j$.time.temporal.p.f);
                l lVar = (l) temporal.b(j$.time.temporal.p.g);
                if (localDate != null && lVar != null) {
                    temporal = new OffsetDateTime(LocalDateTime.L(localDate, lVar), d0);
                } else {
                    temporal = u(Instant.E(temporal), d0);
                }
            } catch (b e) {
                i.g("Unable to obtain OffsetDateTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (qVar instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.b;
            boolean equals = zoneOffset.equals(temporal.b);
            OffsetDateTime offsetDateTime = temporal;
            if (!equals) {
                offsetDateTime = new OffsetDateTime(temporal.a.d0(zoneOffset.b - temporal.b.b), zoneOffset);
            }
            return this.a.o(offsetDateTime.a, qVar);
        }
        return qVar.between(this, temporal);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public final OffsetDateTime J(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.k(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.E(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = p.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.e(oVar);
        }
        return super.e(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = p.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                return this.a.z(this.b);
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.g(oVar);
        }
        return oVar.T(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j */
    public final Temporal m(LocalDate localDate) {
        LocalDateTime localDateTime = this.a;
        return J(localDateTime.g0(localDate, localDateTime.b), this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = p.a[aVar.ordinal()];
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return u(Instant.J(j, localDateTime.b.d), this.b);
            }
            if (i == 2) {
                return J(localDateTime, ZoneOffset.g0(aVar.b.a(j, aVar)));
            }
            return J(localDateTime.i(j, oVar), this.b);
        }
        return (OffsetDateTime) oVar.a0(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime l(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return J(this.a.l(j, qVar), this.b);
        }
        return (OffsetDateTime) qVar.u(this, j);
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
        if (fVar == j$.time.temporal.p.a) {
            return null;
        }
        if (fVar == j$.time.temporal.p.f) {
            return this.a.a;
        }
        if (fVar == j$.time.temporal.p.g) {
            return this.a.b;
        }
        if (fVar == j$.time.temporal.p.b) {
            return j$.time.chrono.t.c;
        }
        if (fVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal c(Temporal temporal) {
        return temporal.i(this.a.a.N(), j$.time.temporal.a.EPOCH_DAY).i(this.a.b.j0(), j$.time.temporal.a.NANO_OF_DAY).i(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
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
        return new t((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
