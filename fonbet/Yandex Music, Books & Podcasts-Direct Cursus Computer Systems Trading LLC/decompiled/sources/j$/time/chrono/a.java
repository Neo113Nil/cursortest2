package j$.time.chrono;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import j$.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return s().compareTo(((m) obj).s());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m E(m mVar, String str) {
        String w;
        m mVar2 = (m) a.putIfAbsent(str, mVar);
        if (mVar2 == null && (w = mVar.w()) != null) {
            b.putIfAbsent(w, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public b W(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return r(((Long) map.remove(aVar)).longValue());
        }
        L(map, d0Var);
        b a0 = a0(map, d0Var);
        if (a0 != null) {
            return a0;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return T(map, d0Var);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(aVar5)) {
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int a2 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            return J(U(a2, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int a3 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        b m = U(a2, a3, 1).l((C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.q) ChronoUnit.DAYS).m(new j$.time.temporal.m(j$.time.d.u(C(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (d0Var != j$.time.format.d0.STRICT || m.e(aVar3) == a3) {
                            return m;
                        }
                        j$.time.i.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                } else {
                    int a4 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        long subtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return U(a4, 1, 1).l(subtractExact, (j$.time.temporal.q) ChronoUnit.MONTHS).l(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.q) ChronoUnit.WEEKS).l(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.q) ChronoUnit.DAYS);
                    }
                    int a5 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a6 = C(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    b l = U(a4, a5, 1).l((C(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((a6 - 1) * 7), (j$.time.temporal.q) ChronoUnit.DAYS);
                    if (d0Var != j$.time.format.d0.STRICT || l.e(aVar3) == a5) {
                        return l;
                    }
                    j$.time.i.a("Strict mode rejected resolved date as it is in a different month");
                    return null;
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (!map.containsKey(aVar7)) {
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(aVar8)) {
                return null;
            }
            j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(aVar9)) {
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (!map.containsKey(aVar10)) {
                    return null;
                }
                int a7 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (d0Var == j$.time.format.d0.LENIENT) {
                    return J(y(a7, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                }
                b m2 = y(a7, 1).l((C(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.q) ChronoUnit.DAYS).m(new j$.time.temporal.m(j$.time.d.u(C(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                if (d0Var != j$.time.format.d0.STRICT || m2.e(aVar2) == a7) {
                    return m2;
                }
                j$.time.i.a("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            int a8 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (d0Var == j$.time.format.d0.LENIENT) {
                return y(a8, 1).l(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.q) ChronoUnit.WEEKS).l(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.q) ChronoUnit.DAYS);
            }
            int a9 = C(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            b l2 = y(a8, 1).l((C(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((a9 - 1) * 7), (j$.time.temporal.q) ChronoUnit.DAYS);
            if (d0Var != j$.time.format.d0.STRICT || l2.e(aVar2) == a8) {
                return l2;
            }
            j$.time.i.a("Strict mode rejected resolved date as it is in a different year");
            return null;
        }
        int a10 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (d0Var == j$.time.format.d0.LENIENT) {
            return y(a10, 1).l(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.q) ChronoUnit.DAYS);
        }
        return y(a10, C(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
    }

    public void L(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                aVar.d0(l.longValue());
            }
            b i = P().i(1L, (j$.time.temporal.o) j$.time.temporal.a.DAY_OF_MONTH).i(l.longValue(), (j$.time.temporal.o) aVar);
            u(map, j$.time.temporal.a.MONTH_OF_YEAR, i.e(r0));
            u(map, j$.time.temporal.a.YEAR, i.e(r0));
        }
    }

    public b a0(Map map, j$.time.format.d0 d0Var) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (d0Var != j$.time.format.d0.LENIENT) {
                intExact = C(aVar).a(l.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                u(map, j$.time.temporal.a.YEAR, G(F(C(r2).a(l2.longValue(), r2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar2)) {
                u(map, aVar2, G(y(C(aVar2).a(((Long) map.get(aVar2)).longValue(), aVar2), 1).R(), intExact));
                return null;
            }
            if (d0Var == j$.time.format.d0.STRICT) {
                map.put(aVar, l);
                return null;
            }
            if (D().isEmpty()) {
                u(map, aVar2, intExact);
                return null;
            }
            u(map, aVar2, G((n) r9.get(r9.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        C(aVar3).b(((Long) map.get(aVar3)).longValue(), aVar3);
        return null;
    }

    public b T(Map map, j$.time.format.d0 d0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a2 = C(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (d0Var == j$.time.format.d0.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return U(a2, 1, 1).l(subtractExact, (j$.time.temporal.q) ChronoUnit.MONTHS).l(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.q) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a3 = C(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a4 = C(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (d0Var != j$.time.format.d0.SMART) {
            return U(a2, a3, a4);
        }
        try {
            return U(a2, a3, a4);
        } catch (j$.time.b unused) {
            return U(a2, a3, 1).m(new j$.time.f(3));
        }
    }

    public static b J(b bVar, long j, long j2, long j3) {
        long j4;
        b l = bVar.l(j, (j$.time.temporal.q) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        b l2 = l.l(j2, (j$.time.temporal.q) chronoUnit);
        if (j3 > 7) {
            long j5 = j3 - 1;
            l2 = l2.l(j5 / 7, (j$.time.temporal.q) chronoUnit);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                l2 = l2.l(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.q) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return l2.m(new j$.time.temporal.m(j$.time.d.u((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return l2.m(new j$.time.temporal.m(j$.time.d.u((int) j3).getValue(), 0));
    }

    public static void u(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l != null && l.longValue() != j) {
            throw new j$.time.b("Conflict found: " + aVar + StringUtil.SPACE + l + " differs from " + aVar + StringUtil.SPACE + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && s().compareTo(((a) obj).s()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ s().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return s();
    }
}
