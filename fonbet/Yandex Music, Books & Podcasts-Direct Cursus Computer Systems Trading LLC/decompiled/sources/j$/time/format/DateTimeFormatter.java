package j$.time.format;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_ZONED_DATE_TIME;
    public static final DateTimeFormatter g;
    public final d a;
    public final Locale b;
    public final b0 c;
    public final d0 d;
    public final j$.time.chrono.m e;
    public final ZoneId f;

    public static DateTimeFormatter ofPattern(String str) {
        u uVar = new u();
        uVar.h(str);
        return uVar.r(Locale.getDefault(), d0.SMART, null);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        u uVar = new u();
        uVar.h(str);
        return uVar.r(locale, d0.SMART, null);
    }

    static {
        u uVar = new u();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        e0 e0Var = e0.EXCEEDS_PAD;
        uVar.n(aVar, 4, 10, e0Var);
        uVar.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        uVar.m(aVar2, 2);
        uVar.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        uVar.m(aVar3, 2);
        d0 d0Var = d0.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        DateTimeFormatter q = uVar.q(d0Var, tVar);
        ISO_LOCAL_DATE = q;
        u uVar2 = new u();
        p pVar = p.INSENSITIVE;
        uVar2.c(pVar);
        uVar2.a(q);
        j jVar = j.e;
        uVar2.c(jVar);
        uVar2.q(d0Var, tVar);
        u uVar3 = new u();
        uVar3.c(pVar);
        uVar3.a(q);
        uVar3.p();
        uVar3.c(jVar);
        uVar3.q(d0Var, tVar);
        u uVar4 = new u();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        uVar4.m(aVar4, 2);
        uVar4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar4.m(aVar5, 2);
        uVar4.p();
        uVar4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar4.m(aVar6, 2);
        uVar4.p();
        uVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter q2 = uVar4.q(d0Var, null);
        u uVar5 = new u();
        uVar5.c(pVar);
        uVar5.a(q2);
        uVar5.c(jVar);
        uVar5.q(d0Var, null);
        u uVar6 = new u();
        uVar6.c(pVar);
        uVar6.a(q2);
        uVar6.p();
        uVar6.c(jVar);
        uVar6.q(d0Var, null);
        u uVar7 = new u();
        uVar7.c(pVar);
        uVar7.a(q);
        uVar7.d('T');
        uVar7.a(q2);
        DateTimeFormatter q3 = uVar7.q(d0Var, tVar);
        u uVar8 = new u();
        uVar8.c(pVar);
        uVar8.a(q3);
        p pVar2 = p.LENIENT;
        uVar8.c(pVar2);
        uVar8.c(jVar);
        p pVar3 = p.STRICT;
        uVar8.c(pVar3);
        DateTimeFormatter q4 = uVar8.q(d0Var, tVar);
        u uVar9 = new u();
        uVar9.a(q4);
        uVar9.p();
        uVar9.d('[');
        p pVar4 = p.SENSITIVE;
        uVar9.c(pVar4);
        j$.time.f fVar = u.h;
        uVar9.c(new s(fVar, "ZoneRegionId()"));
        uVar9.d(']');
        ISO_ZONED_DATE_TIME = uVar9.q(d0Var, tVar);
        u uVar10 = new u();
        uVar10.a(q3);
        uVar10.p();
        uVar10.c(jVar);
        uVar10.p();
        uVar10.d('[');
        uVar10.c(pVar4);
        uVar10.c(new s(fVar, "ZoneRegionId()"));
        uVar10.d(']');
        uVar10.q(d0Var, tVar);
        u uVar11 = new u();
        uVar11.c(pVar);
        uVar11.n(aVar, 4, 10, e0Var);
        uVar11.d('-');
        uVar11.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        uVar11.p();
        uVar11.c(jVar);
        uVar11.q(d0Var, tVar);
        u uVar12 = new u();
        uVar12.c(pVar);
        uVar12.n(j$.time.temporal.i.c, 4, 10, e0Var);
        uVar12.e("-W");
        uVar12.m(j$.time.temporal.i.b, 2);
        uVar12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        uVar12.m(aVar7, 1);
        uVar12.p();
        uVar12.c(jVar);
        uVar12.q(d0Var, tVar);
        u uVar13 = new u();
        uVar13.c(pVar);
        uVar13.c(new g());
        g = uVar13.q(d0Var, null);
        u uVar14 = new u();
        uVar14.c(pVar);
        uVar14.m(aVar, 4);
        uVar14.m(aVar2, 2);
        uVar14.m(aVar3, 2);
        uVar14.p();
        uVar14.c(pVar2);
        uVar14.g("+HHMMss", "Z");
        uVar14.c(pVar3);
        uVar14.q(d0Var, tVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        u uVar15 = new u();
        uVar15.c(pVar);
        uVar15.c(pVar2);
        uVar15.p();
        uVar15.i(aVar7, hashMap);
        uVar15.e(", ");
        uVar15.o();
        uVar15.n(aVar3, 1, 2, e0.NOT_NEGATIVE);
        uVar15.d(' ');
        uVar15.i(aVar2, hashMap2);
        uVar15.d(' ');
        uVar15.m(aVar, 4);
        uVar15.d(' ');
        uVar15.m(aVar4, 2);
        uVar15.d(':');
        uVar15.m(aVar5, 2);
        uVar15.p();
        uVar15.d(':');
        uVar15.m(aVar6, 2);
        uVar15.o();
        uVar15.d(' ');
        uVar15.g("+HHMM", "GMT");
        uVar15.q(d0.SMART, tVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, b0 b0Var, d0 d0Var, j$.time.chrono.m mVar, ZoneId zoneId) {
        Objects.requireNonNull(dVar, "printerParser");
        this.a = dVar;
        Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        this.b = locale;
        Objects.requireNonNull(b0Var, "decimalStyle");
        this.c = b0Var;
        Objects.requireNonNull(d0Var, "resolverStyle");
        this.d = d0Var;
        this.e = mVar;
        this.f = zoneId;
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.u(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.b(e.getMessage(), e);
        }
    }

    public final Object a(CharSequence charSequence, j$.time.f fVar) {
        String charSequence2;
        Objects.requireNonNull(charSequence, "text");
        try {
            return b(charSequence).b(fVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0324, code lost:
    
        if (((java.util.HashMap) r8.a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c0 b(CharSequence charSequence) {
        String charSequence2;
        long j;
        long j2;
        j$.time.chrono.b bVar;
        j$.time.l lVar;
        Long l;
        j$.time.s sVar;
        j$.time.s sVar2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        v vVar = new v(this);
        int E = this.a.E(vVar, charSequence, parsePosition.getIndex());
        if (E < 0) {
            parsePosition.setErrorIndex(~E);
            vVar = null;
        } else {
            parsePosition.setIndex(E);
        }
        if (vVar != null) {
            DateTimeFormatter dateTimeFormatter = vVar.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                c0 c = vVar.c();
                j$.time.chrono.m mVar = vVar.c().c;
                if (mVar == null && (mVar = dateTimeFormatter.e) == null) {
                    mVar = j$.time.chrono.t.c;
                }
                c.c = mVar;
                ZoneId zoneId = c.b;
                if (zoneId == null) {
                    zoneId = dateTimeFormatter.f;
                }
                c.b = zoneId;
                c.e = this.d;
                c.s();
                c.y(c.c.W(c.a, c.e));
                c.w();
                if (((HashMap) c.a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c.a).entrySet().iterator();
                        while (it.hasNext()) {
                            j$.time.temporal.o oVar = (j$.time.temporal.o) ((Map.Entry) it.next()).getKey();
                            TemporalAccessor J = oVar.J(c.a, c, c.e);
                            if (J != null) {
                                if (J instanceof j$.time.chrono.j) {
                                    j$.time.chrono.j jVar = (j$.time.chrono.j) J;
                                    ZoneId zoneId2 = c.b;
                                    if (zoneId2 == null) {
                                        c.b = jVar.M();
                                    } else if (!zoneId2.equals(jVar.M())) {
                                        throw new j$.time.b("ChronoZonedDateTime must use the effective parsed zone: " + c.b);
                                    }
                                    J = jVar.A();
                                }
                                if (J instanceof j$.time.chrono.e) {
                                    j$.time.chrono.e eVar = (j$.time.chrono.e) J;
                                    c.x(eVar.h(), j$.time.s.d);
                                    c.y(eVar.n());
                                } else if (J instanceof j$.time.chrono.b) {
                                    c.y((j$.time.chrono.b) J);
                                } else if (J instanceof j$.time.l) {
                                    c.x((j$.time.l) J, j$.time.s.d);
                                } else {
                                    j$.time.i.a("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                    return null;
                                }
                            } else if (!((HashMap) c.a).containsKey(oVar)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (i == 50) {
                        j$.time.i.a("One of the parsed fields has an incorrectly implemented resolve method");
                        return null;
                    }
                    if (i > 0) {
                        c.s();
                        c.y(c.c.W(c.a, c.e));
                        c.w();
                    }
                }
                if (c.g == null) {
                    Map map = c.a;
                    j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
                    boolean containsKey = ((HashMap) map).containsKey(aVar);
                    Map map2 = c.a;
                    if (containsKey) {
                        long longValue = ((Long) ((HashMap) map2).remove(aVar)).longValue();
                        Map map3 = c.a;
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                        boolean containsKey2 = ((HashMap) map3).containsKey(aVar2);
                        Map map4 = c.a;
                        if (containsKey2) {
                            long longValue2 = (((Long) ((HashMap) map4).get(aVar2)).longValue() % 1000) + (longValue * 1000);
                            c.C(aVar, aVar2, Long.valueOf(longValue2));
                            ((HashMap) c.a).remove(aVar2);
                            ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue2 * 1000));
                        } else {
                            ((HashMap) map4).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue * 1000000));
                        }
                    } else {
                        j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map2).containsKey(aVar3)) {
                            ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c.a).remove(aVar3)).longValue() * 1000));
                        }
                    }
                    Map map5 = c.a;
                    j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
                    Long l2 = (Long) ((HashMap) map5).get(aVar4);
                    if (l2 != null) {
                        Map map6 = c.a;
                        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
                        Long l3 = (Long) ((HashMap) map6).get(aVar5);
                        Map map7 = c.a;
                        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
                        Long l4 = (Long) ((HashMap) map7).get(aVar6);
                        Map map8 = c.a;
                        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
                        Long l5 = (Long) ((HashMap) map8).get(aVar7);
                        if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                            j = 1000000;
                            j2 = 1000;
                            c.u(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                            ((HashMap) c.a).remove(aVar4);
                            ((HashMap) c.a).remove(aVar5);
                            ((HashMap) c.a).remove(aVar6);
                            ((HashMap) c.a).remove(aVar7);
                            if (c.e != d0.LENIENT && ((HashMap) c.a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) c.a).entrySet()) {
                                    j$.time.temporal.o oVar2 = (j$.time.temporal.o) entry.getKey();
                                    if (oVar2 instanceof j$.time.temporal.a) {
                                        j$.time.temporal.a aVar8 = (j$.time.temporal.a) oVar2;
                                        if (aVar8.e0()) {
                                            aVar8.d0(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                            bVar = c.f;
                            if (bVar != null) {
                                c.r(bVar);
                            }
                            lVar = c.g;
                            if (lVar != null) {
                                c.r(lVar);
                                if (c.f != null && ((HashMap) c.a).size() > 0) {
                                    c.r(c.f.O(c.g));
                                }
                            }
                            if (c.f != null && c.g != null) {
                                sVar = c.h;
                                sVar.getClass();
                                sVar2 = j$.time.s.d;
                                if (sVar != sVar2) {
                                    c.f = c.f.V(c.h);
                                    c.h = sVar2;
                                }
                            }
                            if (c.g == null) {
                                if (!((HashMap) c.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                                    if (!((HashMap) c.a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                                    }
                                }
                                Map map9 = c.a;
                                j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                                boolean containsKey3 = ((HashMap) map9).containsKey(aVar9);
                                Map map10 = c.a;
                                if (containsKey3) {
                                    long longValue3 = ((Long) ((HashMap) map10).get(aVar9)).longValue();
                                    ((HashMap) c.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue3 / j2));
                                    ((HashMap) c.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue3 / j));
                                } else {
                                    ((HashMap) map10).put(aVar9, 0L);
                                    ((HashMap) c.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                                    ((HashMap) c.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                                }
                            }
                            if (c.f != null && c.g != null) {
                                l = (Long) ((HashMap) c.a).get(j$.time.temporal.a.OFFSET_SECONDS);
                                if (l == null) {
                                    ((HashMap) c.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c.f.O(c.g).I(ZoneOffset.g0(l.intValue())).c0()));
                                    return c;
                                }
                                if (c.b != null) {
                                    ((HashMap) c.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c.f.O(c.g).I(c.b).c0()));
                                }
                            }
                            return c;
                        }
                        j = 1000000;
                        j2 = 1000;
                        bVar = c.f;
                        if (bVar != null) {
                        }
                        lVar = c.g;
                        if (lVar != null) {
                        }
                        if (c.f != null) {
                            sVar = c.h;
                            sVar.getClass();
                            sVar2 = j$.time.s.d;
                            if (sVar != sVar2) {
                            }
                        }
                        if (c.g == null) {
                        }
                        if (c.f != null) {
                            l = (Long) ((HashMap) c.a).get(j$.time.temporal.a.OFFSET_SECONDS);
                            if (l == null) {
                            }
                        }
                        return c;
                    }
                }
                j = 1000000;
                j2 = 1000;
                if (c.e != d0.LENIENT) {
                    while (r1.hasNext()) {
                    }
                }
                bVar = c.f;
                if (bVar != null) {
                }
                lVar = c.g;
                if (lVar != null) {
                }
                if (c.f != null) {
                }
                if (c.g == null) {
                }
                if (c.f != null) {
                }
                return c;
            }
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String dVar = this.a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
