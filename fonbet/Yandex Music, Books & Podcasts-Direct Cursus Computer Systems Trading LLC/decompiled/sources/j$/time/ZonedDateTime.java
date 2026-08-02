package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public static ZonedDateTime J(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f E = zoneId.E();
        List f = E.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() != 0) {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object e = E.e(localDateTime);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            localDateTime = localDateTime.d0(Duration.E(bVar.d.b - bVar.c.b, 0).a);
            zoneOffset = bVar.d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime u(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.E().d(Instant.J(j, i));
        return new ZonedDateTime(LocalDateTime.T(j, i, d), zoneId, d);
    }

    public static ZonedDateTime E(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId u = ZoneId.u(temporalAccessor);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporalAccessor.f(aVar)) {
                return J(LocalDateTime.L(LocalDate.J(temporalAccessor), l.J(temporalAccessor)), u, null);
            }
            return u(temporalAccessor.g(aVar), temporalAccessor.e(j$.time.temporal.a.NANO_OF_SECOND), u);
        } catch (b e) {
            i.g("Unable to obtain ZonedDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static ZonedDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.a(charSequence, new f(1));
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
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
            if (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) oVar).b;
            }
            return this.a.k(oVar);
        }
        return oVar.E(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = z.a[((j$.time.temporal.a) oVar).ordinal()];
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
            int i = z.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                return c0();
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.g(oVar);
        }
        return oVar.T(this);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset p() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final ZoneId M() {
        return this.c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j H(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : J(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime q(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : u(this.a.z(this.b), this.a.b.d, zoneId);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e A() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate n() {
        return this.a.a;
    }

    public int getDayOfMonth() {
        return this.a.a.getDayOfMonth();
    }

    @Override // j$.time.chrono.j
    public final l h() {
        return this.a.b;
    }

    @Override // j$.time.chrono.j
    /* renamed from: T, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ZonedDateTime m(LocalDate localDate) {
        return J(LocalDateTime.L(localDate, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = z.a[aVar.ordinal()];
            if (i == 1) {
                return u(j, this.a.b.d, this.c);
            }
            if (i != 2) {
                return J(this.a.i(j, oVar), this.c, this.b);
            }
            ZoneOffset g0 = ZoneOffset.g0(aVar.b.a(j, aVar));
            return (g0.equals(this.b) || !this.c.E().f(this.a).contains(g0)) ? this : new ZonedDateTime(this.a, this.c, g0);
        }
        return (ZonedDateTime) oVar.a0(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime l(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) qVar;
            boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
            LocalDateTime localDateTime = this.a;
            if (z) {
                return J(localDateTime.l(j, qVar), this.c, this.b);
            }
            LocalDateTime l = localDateTime.l(j, qVar);
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            Objects.requireNonNull(l, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.E().f(l).contains(zoneOffset)) {
                return new ZonedDateTime(l, zoneId, zoneOffset);
            }
            return u(l.z(zoneOffset), l.b.d, zoneId);
        }
        return (ZonedDateTime) qVar.u(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.chrono.j a(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(f fVar) {
        if (fVar == j$.time.temporal.p.f) {
            return n();
        }
        return super.b(fVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        ZonedDateTime E = E(temporal);
        if (qVar instanceof ChronoUnit) {
            ZonedDateTime q = E.q(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) qVar;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.a.o(q.a, qVar);
            }
            return new OffsetDateTime(this.a, this.b).o(new OffsetDateTime(q.a, q.b), qVar);
        }
        return qVar.between(this, E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
