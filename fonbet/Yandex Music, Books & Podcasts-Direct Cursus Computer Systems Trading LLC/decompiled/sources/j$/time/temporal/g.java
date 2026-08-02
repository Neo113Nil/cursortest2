package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g implements o {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.o
            public final s L() {
                return s.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.o
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.DAY_OF_YEAR) || !temporalAccessor.f(a.MONTH_OF_YEAR) || !temporalAccessor.f(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.time.chrono.m.t(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.o
            public final s E(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long g = temporalAccessor.g(g.QUARTER_OF_YEAR);
                if (g == 1) {
                    return j$.time.chrono.t.c.b0(temporalAccessor.g(a.YEAR)) ? s.f(1L, 91L) : s.f(1L, 90L);
                }
                if (g == 2) {
                    return s.f(1L, 91L);
                }
                if (g == 3 || g == 4) {
                    return s.f(1L, 92L);
                }
                return L();
            }

            @Override // j$.time.temporal.o
            public final long T(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.e(a.DAY_OF_YEAR) - g.a[((temporalAccessor.e(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.t.c.b0(temporalAccessor.g(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.o
            public final Temporal a0(Temporal temporal, long j) {
                long T = T(temporal);
                L().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.i((j - T) + temporal.g(aVar), aVar);
            }

            @Override // j$.time.temporal.o
            public final TemporalAccessor J(Map map, c0 c0Var, d0 d0Var) {
                LocalDate i0;
                long j;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                o oVar = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(oVar);
                if (l != null && l2 != null) {
                    int a2 = aVar.b.a(l.longValue(), aVar);
                    long longValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                    g gVar2 = i.a;
                    if (j$.time.chrono.m.t(c0Var).equals(j$.time.chrono.t.c)) {
                        if (d0Var == d0.LENIENT) {
                            i0 = LocalDate.i0(a2, 1, 1).n0(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                            j = Math.subtractExact(longValue, 1L);
                        } else {
                            i0 = LocalDate.i0(a2, ((oVar.L().a(l2.longValue(), oVar) - 1) * 3) + 1, 1);
                            if (longValue < 1 || longValue > 90) {
                                if (d0Var == d0.STRICT) {
                                    E(i0).b(longValue, this);
                                } else {
                                    L().b(longValue, this);
                                }
                            }
                            j = longValue - 1;
                        }
                        map.remove(this);
                        map.remove(aVar);
                        map.remove(oVar);
                        return i0.m0(j);
                    }
                    j$.time.i.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.o
            public final s L() {
                return s.f(1L, 4L);
            }

            @Override // j$.time.temporal.o
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.time.chrono.m.t(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.o
            public final long T(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.g(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.o
            public final s E(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return L();
            }

            @Override // j$.time.temporal.o
            public final Temporal a0(Temporal temporal, long j) {
                long T = T(temporal);
                L().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.i(((j - T) * 3) + temporal.g(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.o
            public final s L() {
                return s.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.o
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.time.chrono.m.t(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.o
            public final s E(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.g0(LocalDate.J(temporalAccessor));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final long T(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.d0(LocalDate.J(temporalAccessor));
            }

            @Override // j$.time.temporal.o
            public final Temporal a0(Temporal temporal, long j) {
                L().b(j, this);
                return temporal.l(Math.subtractExact(j, T(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.o
            public final TemporalAccessor J(Map map, c0 c0Var, d0 d0Var) {
                LocalDate i;
                long j;
                o oVar = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(oVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l != null && l2 != null) {
                    int a2 = oVar.L().a(l.longValue(), oVar);
                    long longValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    g gVar4 = i.a;
                    if (j$.time.chrono.m.t(c0Var).equals(j$.time.chrono.t.c)) {
                        LocalDate i0 = LocalDate.i0(a2, 1, 4);
                        if (d0Var == d0.LENIENT) {
                            long longValue2 = l2.longValue();
                            if (longValue2 > 7) {
                                long j2 = longValue2 - 1;
                                i0 = i0.o0(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (longValue2 < 1) {
                                    i0 = i0.o0(Math.subtractExact(longValue2, 7L) / 7);
                                    j = (longValue2 + 6) % 7;
                                }
                                i = i0.o0(Math.subtractExact(longValue, 1L)).i(longValue2, aVar);
                            }
                            longValue2 = j + 1;
                            i = i0.o0(Math.subtractExact(longValue, 1L)).i(longValue2, aVar);
                        } else {
                            int a3 = aVar.b.a(l2.longValue(), aVar);
                            if (longValue < 1 || longValue > 52) {
                                if (d0Var == d0.STRICT) {
                                    g.g0(i0).b(longValue, this);
                                } else {
                                    L().b(longValue, this);
                                }
                            }
                            i = i0.o0(longValue - 1).i(a3, aVar);
                        }
                        map.remove(this);
                        map.remove(oVar);
                        map.remove(aVar);
                        return i;
                    }
                    j$.time.i.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.o
            public final s L() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.o
            public final boolean u(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.time.chrono.m.t(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.o
            public final long T(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.e0(LocalDate.J(temporalAccessor));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final s E(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.o
            public final Temporal a0(Temporal temporal, long j) {
                if (!u(temporal)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate J = LocalDate.J(temporal);
                int e = J.e(a.DAY_OF_WEEK);
                int d0 = g.d0(J);
                if (d0 == 53 && g.f0(a2) == 52) {
                    d0 = 52;
                }
                return temporal.m(LocalDate.i0(a2, 1, 4).m0(((d0 - 1) * 7) + (e - r6.e(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static s g0(LocalDate localDate) {
        return s.f(1L, f0(e0(localDate)));
    }

    public static int f0(int i) {
        LocalDate i0 = LocalDate.i0(i, 1, 1);
        if (i0.T() != j$.time.d.THURSDAY) {
            return (i0.T() == j$.time.d.WEDNESDAY && i0.B()) ? 53 : 52;
        }
        return 53;
    }

    public static int d0(LocalDate localDate) {
        int ordinal = localDate.T().ordinal();
        int a0 = localDate.a0() - 1;
        int i = (3 - ordinal) + a0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (a0 >= i3) {
            int i4 = ((a0 - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.B())) {
                return i4;
            }
            return 1;
        }
        if (localDate.a0() != 180) {
            localDate = LocalDate.k0(localDate.a, 180);
        }
        return (int) g0(localDate.p0(-1L)).d;
    }

    public static int e0(LocalDate localDate) {
        int year = localDate.getYear();
        int a0 = localDate.a0();
        if (a0 <= 3) {
            return a0 - localDate.T().ordinal() < -2 ? year - 1 : year;
        }
        if (a0 >= 363) {
            return ((a0 - 363) - (localDate.B() ? 1 : 0)) - localDate.T().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
