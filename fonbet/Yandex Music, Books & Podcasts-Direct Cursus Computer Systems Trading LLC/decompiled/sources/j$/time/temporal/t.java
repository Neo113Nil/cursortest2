package j$.time.temporal;

import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t implements o {
    public static final s f = s.f(1, 7);
    public static final s g = s.g(0, 4, 6);
    public static final s h = s.g(0, 52, 54);
    public static final s i = s.g(1, 52, 53);
    public final String a;
    public final u b;
    public final q c;
    public final q d;
    public final s e;

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }

    public final j$.time.chrono.b e(j$.time.chrono.m mVar, int i2, int i3, int i4) {
        j$.time.chrono.b U = mVar.U(i2, 1, 1);
        int h2 = h(1, b(U));
        int i5 = i4 - 1;
        return U.l(((Math.min(i3, a(h2, U.Y() + this.b.b) - 1) - 1) * 7) + i5 + (-h2), (q) ChronoUnit.DAYS);
    }

    public t(String str, u uVar, q qVar, q qVar2, s sVar) {
        this.a = str;
        this.b = uVar;
        this.c = qVar;
        this.d = qVar2;
        this.e = sVar;
    }

    @Override // j$.time.temporal.o
    public final long T(TemporalAccessor temporalAccessor) {
        int c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        q qVar = this.d;
        if (qVar == chronoUnit) {
            c = b(temporalAccessor);
        } else if (qVar != ChronoUnit.MONTHS) {
            if (qVar != ChronoUnit.YEARS) {
                if (qVar == u.h) {
                    c = d(temporalAccessor);
                } else if (qVar == ChronoUnit.FOREVER) {
                    c = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
                }
            } else {
                int b = b(temporalAccessor);
                int e = temporalAccessor.e(a.DAY_OF_YEAR);
                c = a(h(e, b), e);
            }
        } else {
            int b2 = b(temporalAccessor);
            int e2 = temporalAccessor.e(a.DAY_OF_MONTH);
            c = a(h(e2, b2), e2);
        }
        return c;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.e(a.DAY_OF_WEEK) - this.b.a.getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        int e = temporalAccessor.e(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int e2 = temporalAccessor.e(aVar);
        int h2 = h(e2, b);
        int a = a(h2, e2);
        return a == 0 ? e - 1 : a >= a(h2, ((int) temporalAccessor.k(aVar).d) + this.b.b) ? e + 1 : e;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int a;
        int b = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int e = temporalAccessor.e(aVar);
        int h2 = h(e, b);
        int a2 = a(h2, e);
        if (a2 == 0) {
            return d(j$.time.chrono.m.t(temporalAccessor).K(temporalAccessor).a(e, (q) ChronoUnit.DAYS));
        }
        return (a2 <= 50 || a2 < (a = a(h2, ((int) temporalAccessor.k(aVar).d) + this.b.b))) ? a2 : (a2 - a) + 1;
    }

    public final int h(int i2, int i3) {
        int floorMod = Math.floorMod(i2 - i3, 7);
        return floorMod + 1 > this.b.b ? 7 - floorMod : -floorMod;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.o
    public final Temporal a0(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.e(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.l(r0 - r1, this.c);
        }
        u uVar = this.b;
        return e(j$.time.chrono.m.t(temporal), (int) j, temporal.e(uVar.e), temporal.e(uVar.c));
    }

    @Override // j$.time.temporal.o
    public final TemporalAccessor J(Map map, c0 c0Var, d0 d0Var) {
        j$.time.chrono.b bVar;
        j$.time.chrono.b bVar2;
        j$.time.chrono.b bVar3;
        long longValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(longValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        s sVar = this.e;
        u uVar = this.b;
        q qVar = this.d;
        if (qVar == chronoUnit) {
            long floorMod = Math.floorMod((sVar.a(longValue, this) - 1) + (uVar.a.getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(floorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int floorMod2 = Math.floorMod(aVar.b.a(((Long) map.get(aVar)).longValue(), aVar) - uVar.a.getValue(), 7) + 1;
        j$.time.chrono.m t = j$.time.chrono.m.t(c0Var);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((qVar != u.h && qVar != ChronoUnit.FOREVER) || !map.containsKey(uVar.f) || !map.containsKey(uVar.e)) {
                return null;
            }
            t tVar = uVar.f;
            int a = tVar.e.a(((Long) map.get(tVar)).longValue(), uVar.f);
            if (d0Var == d0.LENIENT) {
                bVar = e(t, a, 1, floorMod2).l(Math.subtractExact(((Long) map.get(uVar.e)).longValue(), 1L), (q) chronoUnit);
            } else {
                t tVar2 = uVar.e;
                j$.time.chrono.b e = e(t, a, tVar2.e.a(((Long) map.get(tVar2)).longValue(), uVar.e), floorMod2);
                if (d0Var == d0.STRICT && c(e) != a) {
                    j$.time.i.a("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                bVar = e;
            }
            map.remove(this);
            map.remove(uVar.f);
            map.remove(uVar.e);
            map.remove(aVar);
            return bVar;
        }
        int a2 = aVar2.b.a(((Long) map.get(aVar2)).longValue(), aVar2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (qVar == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long longValue2 = ((Long) map.get(aVar3)).longValue();
                long j = intExact;
                if (d0Var == d0.LENIENT) {
                    j$.time.chrono.b l = t.U(a2, 1, 1).l(Math.subtractExact(longValue2, 1L), (q) chronoUnit2);
                    int b = b(l);
                    int e2 = l.e(a.DAY_OF_MONTH);
                    bVar3 = l.l(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(e2, b), e2)), 7), floorMod2 - b(l)), (q) ChronoUnit.DAYS);
                } else {
                    j$.time.chrono.b U = t.U(a2, aVar3.b.a(longValue2, aVar3), 1);
                    long a3 = sVar.a(j, this);
                    int b2 = b(U);
                    int e3 = U.e(a.DAY_OF_MONTH);
                    j$.time.chrono.b l2 = U.l((((int) (a3 - a(h(e3, b2), e3))) * 7) + (floorMod2 - b(U)), (q) ChronoUnit.DAYS);
                    if (d0Var == d0.STRICT && l2.g(aVar3) != longValue2) {
                        j$.time.i.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    bVar3 = l2;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return bVar3;
            }
        }
        if (qVar != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = intExact;
        j$.time.chrono.b U2 = t.U(a2, 1, 1);
        if (d0Var == d0.LENIENT) {
            int b3 = b(U2);
            int e4 = U2.e(a.DAY_OF_YEAR);
            bVar2 = U2.l(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(e4, b3), e4)), 7), floorMod2 - b(U2)), (q) ChronoUnit.DAYS);
        } else {
            long a4 = sVar.a(j2, this);
            int b4 = b(U2);
            int e5 = U2.e(a.DAY_OF_YEAR);
            j$.time.chrono.b l3 = U2.l((((int) (a4 - a(h(e5, b4), e5))) * 7) + (floorMod2 - b(U2)), (q) ChronoUnit.DAYS);
            if (d0Var == d0.STRICT && l3.g(aVar2) != a2) {
                j$.time.i.a("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            bVar2 = l3;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return bVar2;
    }

    @Override // j$.time.temporal.o
    public final s L() {
        return this.e;
    }

    @Override // j$.time.temporal.o
    public final boolean u(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        q qVar = this.d;
        if (qVar == chronoUnit) {
            return true;
        }
        if (qVar == ChronoUnit.MONTHS) {
            return temporalAccessor.f(a.DAY_OF_MONTH);
        }
        if (qVar == ChronoUnit.YEARS) {
            return temporalAccessor.f(a.DAY_OF_YEAR);
        }
        if (qVar == u.h) {
            return temporalAccessor.f(a.DAY_OF_YEAR);
        }
        if (qVar == ChronoUnit.FOREVER) {
            return temporalAccessor.f(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.o
    public final s E(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        q qVar = this.d;
        if (qVar == chronoUnit) {
            return this.e;
        }
        if (qVar == ChronoUnit.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (qVar == ChronoUnit.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (qVar == u.h) {
            return g(temporalAccessor);
        }
        if (qVar == ChronoUnit.FOREVER) {
            return a.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
    }

    public final s f(TemporalAccessor temporalAccessor, a aVar) {
        int h2 = h(temporalAccessor.e(aVar), b(temporalAccessor));
        s k = temporalAccessor.k(aVar);
        return s.f(a(h2, (int) k.a), a(h2, (int) k.d));
    }

    public final s g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.f(aVar)) {
            return h;
        }
        int b = b(temporalAccessor);
        int e = temporalAccessor.e(aVar);
        int h2 = h(e, b);
        int a = a(h2, e);
        if (a != 0) {
            if (a >= a(h2, this.b.b + ((int) temporalAccessor.k(aVar).d))) {
                return g(j$.time.chrono.m.t(temporalAccessor).K(temporalAccessor).l((r0 - e) + 8, (q) ChronoUnit.DAYS));
            }
            return s.f(1L, r1 - 1);
        }
        return g(j$.time.chrono.m.t(temporalAccessor).K(temporalAccessor).a(e + 7, (q) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
