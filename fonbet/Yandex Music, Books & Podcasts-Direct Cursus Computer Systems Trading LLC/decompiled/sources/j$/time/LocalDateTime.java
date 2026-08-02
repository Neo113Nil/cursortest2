package j$.time;

import com.connectsdk.service.airplay.PListParser;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = L(LocalDate.d, l.e);
    public static final LocalDateTime d = L(LocalDate.e, l.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final l b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j I(ZoneId zoneId) {
        return ZonedDateTime.J(this, zoneId, null);
    }

    public static LocalDateTime L(LocalDate localDate, l lVar) {
        Objects.requireNonNull(localDate, PListParser.TAG_DATE);
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(localDate, lVar);
    }

    public static LocalDateTime T(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.d0(j2);
        return new LocalDateTime(LocalDate.j0(Math.floorDiv(j + zoneOffset.b, 86400)), l.a0((((int) Math.floorMod(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime E(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(LocalDate.J(temporalAccessor), l.J(temporalAccessor));
            } catch (b e) {
                i.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
                return null;
            }
        }
        return ((ZonedDateTime) temporalAccessor).a;
    }

    public LocalDateTime(LocalDate localDate, l lVar) {
        this.a = localDate;
        this.b = lVar;
    }

    public final LocalDateTime g0(LocalDate localDate, l lVar) {
        return (this.a == localDate && this.b == lVar) ? this : new LocalDateTime(localDate, lVar);
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
            return ((j$.time.temporal.a) oVar).e0() ? this.b.k(oVar) : this.a.k(oVar);
        }
        return oVar.E(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).e0() ? this.b.e(oVar) : this.a.e(oVar);
        }
        return super.e(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).e0() ? this.b.g(oVar) : this.a.g(oVar);
        }
        return oVar.T(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b n() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final l h() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j */
    public final Temporal m(LocalDate localDate) {
        return g0(localDate, this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            boolean e0 = ((j$.time.temporal.a) oVar).e0();
            LocalDate localDate = this.a;
            if (e0) {
                return g0(localDate, this.b.i(j, oVar));
            }
            return g0(localDate.i(j, oVar), this.b);
        }
        return (LocalDateTime) oVar.a0(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime l(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDateTime) qVar.u(this, j);
        }
        switch (j.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return e0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime g0 = g0(this.a.m0(j / 86400000000L), this.b);
                return g0.e0(g0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime g02 = g0(this.a.m0(j / 86400000), this.b);
                return g02.e0(g02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return d0(j);
            case 5:
                return e0(this.a, 0L, j, 0L, 0L);
            case 6:
                return e0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime g03 = g0(this.a.m0(j / 256), this.b);
                return g03.e0(g03.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return g0(this.a.l(j, qVar), this.b);
        }
    }

    public final LocalDateTime d0(long j) {
        return e0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.chrono.e a(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }

    public final LocalDateTime e0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        l lVar = this.b;
        if (j5 == 0) {
            return g0(localDate, lVar);
        }
        long j6 = 1;
        long j0 = lVar.j0();
        long j7 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j6) + j0;
        long floorDiv = Math.floorDiv(j7, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j6);
        long floorMod = Math.floorMod(j7, 86400000000000L);
        return g0(localDate.m0(floorDiv), floorMod == j0 ? this.b : l.a0(floorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(f fVar) {
        if (fVar == j$.time.temporal.p.f) {
            return this.a;
        }
        return super.b(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r0.u(r1) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (r0.e0(r8.a) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        if (r9.b.compareTo(r8.b) <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
    
        r0 = r0.m0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        return r8.a.o(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r9.b.compareTo(r8.b) >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r0 = r0.minusDays(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r0.N() > r1.N()) goto L33;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        long j;
        long j2;
        LocalDateTime E = E(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, E);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) < 0) {
            LocalDate localDate = this.a;
            LocalDate localDate2 = E.a;
            localDate.getClass();
            long N = localDate2.N() - localDate.N();
            if (N == 0) {
                return this.b.o(E.b, qVar);
            }
            long j0 = E.b.j0() - this.b.j0();
            if (N > 0) {
                j = N - 1;
                j2 = j0 + 86400000000000L;
            } else {
                j = N + 1;
                j2 = j0 - 86400000000000L;
            }
            switch (j.a[chronoUnit.ordinal()]) {
                case 1:
                    j = Math.multiplyExact(j, 86400000000000L);
                    break;
                case 2:
                    j = Math.multiplyExact(j, 86400000000L);
                    j2 /= 1000;
                    break;
                case 3:
                    j = Math.multiplyExact(j, 86400000L);
                    j2 /= 1000000;
                    break;
                case 4:
                    j = Math.multiplyExact(j, 86400);
                    j2 /= 1000000000;
                    break;
                case 5:
                    j = Math.multiplyExact(j, 1440);
                    j2 /= 60000000000L;
                    break;
                case 6:
                    j = Math.multiplyExact(j, 24);
                    j2 /= 3600000000000L;
                    break;
                case 7:
                    j = Math.multiplyExact(j, 2);
                    j2 /= 43200000000000L;
                    break;
            }
            return Math.addExact(j, j2);
        }
        LocalDate localDate3 = E.a;
        LocalDate localDate4 = this.a;
        if (localDate4 != null) {
            localDate3.getClass();
        }
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.e, java.lang.Comparable
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return u((LocalDateTime) eVar);
        }
        return super.compareTo(eVar);
    }

    public final int u(LocalDateTime localDateTime) {
        int u = this.a.u(localDateTime.a);
        return u == 0 ? this.b.compareTo(localDateTime.b) : u;
    }

    public final boolean J(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return u((LocalDateTime) eVar) < 0;
        }
        long N = this.a.N();
        long N2 = eVar.n().N();
        if (N >= N2) {
            return N == N2 && this.b.j0() < eVar.h().j0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
