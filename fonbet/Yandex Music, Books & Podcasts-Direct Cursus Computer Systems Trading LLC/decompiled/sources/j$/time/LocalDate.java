package j$.time;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.l, j$.time.chrono.b, Serializable {
    public static final LocalDate d = i0(-999999999, 1, 1);
    public static final LocalDate e = i0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        i0(1970, 1, 1);
    }

    public static LocalDate now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant b = clock.b();
        ZoneId a = clock.a();
        Objects.requireNonNull(b, "instant");
        Objects.requireNonNull(a, "zone");
        return j0(Math.floorDiv(b.a + a.E().d(b).b, 86400));
    }

    public static LocalDate i0(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.d0(i);
        j$.time.temporal.a.MONTH_OF_YEAR.d0(i2);
        j$.time.temporal.a.DAY_OF_MONTH.d0(i3);
        return E(i, i2, i3);
    }

    public static LocalDate k0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.d0(j);
        j$.time.temporal.a.DAY_OF_YEAR.d0(i2);
        boolean b0 = j$.time.chrono.t.c.b0(j);
        if (i2 == 366 && !b0) {
            i.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        Month L = Month.L(((i2 - 1) / 31) + 1);
        if (i2 > (L.E(b0) + L.u(b0)) - 1) {
            L = Month.a[((((int) 1) + 12) + L.ordinal()) % 12];
        }
        return new LocalDate(i, L.getValue(), (i2 - L.u(b0)) + 1);
    }

    public static LocalDate j0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.d0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate J(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.b(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        i.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate E(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.t.c.b0(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    i.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new b("Invalid date '" + Month.L(i2).name() + StringUtil.SPACE + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate q0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.t.c.b0((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.E(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        int i = h.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, f0());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, Y());
        }
        if (i != 3) {
            return i != 4 ? aVar.b : getYear() <= 0 ? j$.time.temporal.s.f(1L, 1000000000L) : j$.time.temporal.s.f(1L, 999999999L);
        }
        return j$.time.temporal.s.f(1L, (getMonth() != Month.FEBRUARY || B()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return L(oVar);
        }
        return super.e(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.EPOCH_DAY) {
                return N();
            }
            if (oVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return d0();
            }
            return L(oVar);
        }
        return oVar.T(this);
    }

    public final int L(j$.time.temporal.o oVar) {
        switch (h.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return a0();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return T().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((a0() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((a0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final long d0() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m d() {
        return j$.time.chrono.t.c;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.n R() {
        return getYear() >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    public int getYear() {
        return this.a;
    }

    public Month getMonth() {
        return Month.L(this.b);
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public final int a0() {
        return (getMonth().u(B()) + this.c) - 1;
    }

    public final d T() {
        return d.u(((int) Math.floorMod(N() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.b
    public final boolean B() {
        return j$.time.chrono.t.c.b0(this.a);
    }

    public final int f0() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : B() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int Y() {
        return B() ? 366 : 365;
    }

    @Override // j$.time.chrono.b
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final LocalDate m(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDate) {
            return (LocalDate) lVar;
        }
        return (LocalDate) lVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final LocalDate i(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (LocalDate) oVar.a0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.d0(j);
        switch (h.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return i0(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (a0() != i2) {
                    return k0(this.a, i2);
                }
                return this;
            case 3:
                return o0(j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return t0((int) j);
            case 5:
                return m0(j - T().getValue());
            case 6:
                return m0(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m0(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return j0(j);
            case 9:
                return o0(j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    j$.time.temporal.a.MONTH_OF_YEAR.d0(i3);
                    return q0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return n0(j - d0());
            case 12:
                return t0((int) j);
            case 13:
                if (g(j$.time.temporal.a.ERA) != j) {
                    return t0(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final LocalDate t0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.d0(i);
        return q0(i, this.b, this.c);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b V(j$.time.temporal.n nVar) {
        if (nVar != null) {
            s sVar = (s) nVar;
            return n0((sVar.a * 12) + sVar.b).m0(sVar.c);
        }
        Objects.requireNonNull(nVar, "amountToAdd");
        return (LocalDate) ((s) nVar).u(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDate l(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDate) qVar.u(this, j);
        }
        switch (h.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return m0(j);
            case 2:
                return o0(j);
            case 3:
                return n0(j);
            case 4:
                return p0(j);
            case 5:
                return p0(Math.multiplyExact(j, 10));
            case 6:
                return p0(Math.multiplyExact(j, 100));
            case 7:
                return p0(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j), aVar);
            default:
                i.d("Unsupported unit: ", qVar);
                return null;
        }
    }

    public final LocalDate p0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return q0(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    public final LocalDate n0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return q0(aVar.b.a(Math.floorDiv(j2, j3), aVar), ((int) Math.floorMod(j2, j3)) + 1, this.c);
    }

    public final LocalDate o0(long j) {
        return m0(Math.multiplyExact(j, 7));
    }

    public final LocalDate m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long f0 = f0();
                if (j2 <= f0) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - f0));
                }
                j$.time.temporal.a.YEAR.d0(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - f0));
            }
        }
        return j0(Math.addExact(N(), j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? m0(Long.MAX_VALUE).m0(1L) : m0(-j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(f fVar) {
        return fVar == j$.time.temporal.p.f ? this : super.b(fVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        LocalDate J = J(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, J);
        }
        switch (h.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J.N() - N();
            case 2:
                return (J.N() - N()) / 7;
            case 3:
                return h0(J);
            case 4:
                return h0(J) / 12;
            case 5:
                return h0(J) / 120;
            case 6:
                return h0(J) / 1200;
            case 7:
                return h0(J) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return J.g(aVar) - g(aVar);
            default:
                i.d("Unsupported unit: ", qVar);
                return 0L;
        }
    }

    public final long h0(LocalDate localDate) {
        return (((localDate.d0() * 32) + localDate.getDayOfMonth()) - ((d0() * 32) + getDayOfMonth())) / 32;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e O(l lVar) {
        return LocalDateTime.L(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final long N() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !B() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.b, java.lang.Comparable
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return u((LocalDate) bVar);
        }
        return super.compareTo(bVar);
    }

    public final int u(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean e0(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? u((LocalDate) bVar) < 0 : N() < bVar.N();
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && u((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
