package j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public class a0 {
    public static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final y b = new y();
    public static final a0 c = new a0();

    public String d(j$.time.temporal.o oVar, long j, f0 f0Var, Locale locale) {
        Object a2 = a(oVar, locale);
        if (a2 instanceof z) {
            return ((z) a2).a(j, f0Var);
        }
        return null;
    }

    public String c(j$.time.chrono.m mVar, j$.time.temporal.o oVar, long j, f0 f0Var, Locale locale) {
        if (mVar == j$.time.chrono.t.c || !(oVar instanceof j$.time.temporal.a)) {
            return d(oVar, j, f0Var, locale);
        }
        return null;
    }

    public Iterator f(j$.time.temporal.o oVar, f0 f0Var, Locale locale) {
        List list;
        Object a2 = a(oVar, locale);
        if (!(a2 instanceof z) || (list = (List) ((HashMap) ((z) a2).b).get(f0Var)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator e(j$.time.chrono.m mVar, j$.time.temporal.o oVar, f0 f0Var, Locale locale) {
        if (mVar == j$.time.chrono.t.c || !(oVar instanceof j$.time.temporal.a)) {
            return f(oVar, f0Var, locale);
        }
        return null;
    }

    public static String b(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public static Object a(j$.time.temporal.o oVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(oVar, locale);
        Object obj2 = ((ConcurrentHashMap) a).get(simpleImmutableEntry2);
        if (obj2 != null) {
            return obj2;
        }
        Long l = 7L;
        long j = 1;
        HashMap hashMap = new HashMap();
        int i = 0;
        if (oVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j2 = i;
                    hashMap2.put(Long.valueOf(j2), eras[i]);
                    hashMap3.put(Long.valueOf(j2), b(eras[i]));
                }
                i++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(f0.FULL, hashMap2);
                hashMap.put(f0.SHORT, hashMap2);
                hashMap.put(f0.NARROW, hashMap3);
            }
            obj = new z(hashMap);
        } else if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            int length = dateFormatSymbols2.getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            int i2 = 1;
            while (i2 <= length) {
                String b2 = j$.time.e.b(i2, "LLLL", locale);
                long j3 = j;
                long j4 = i2;
                linkedHashMap.put(Long.valueOf(j4), b2);
                linkedHashMap2.put(Long.valueOf(j4), b2.substring(0, Character.charCount(b2.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j4), j$.time.e.b(i2, "LLL", locale));
                i2++;
                j = j3;
            }
            long j5 = j;
            if (length > 0) {
                hashMap.put(f0.FULL_STANDALONE, linkedHashMap);
                hashMap.put(f0.NARROW_STANDALONE, linkedHashMap2);
                hashMap.put(f0.SHORT_STANDALONE, linkedHashMap3);
            }
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = dateFormatSymbols2.getMonths();
            for (int i3 = 0; i3 < months.length; i3++) {
                if (!months[i3].isEmpty()) {
                    long j6 = i3 + j5;
                    hashMap4.put(Long.valueOf(j6), months[i3]);
                    hashMap5.put(Long.valueOf(j6), b(months[i3]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(f0.FULL, hashMap4);
                hashMap.put(f0.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    hashMap6.put(Long.valueOf(i + j5), shortMonths[i]);
                }
                i++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(f0.SHORT, hashMap6);
            }
            obj = new z(hashMap);
        } else {
            if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                int length2 = dateFormatSymbols3.getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                int i4 = 1;
                while (i4 <= length2) {
                    DateFormatSymbols dateFormatSymbols4 = dateFormatSymbols3;
                    String a2 = j$.time.e.a(i4, "cccc", locale);
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry2;
                    long j7 = i4;
                    linkedHashMap4.put(Long.valueOf(j7), a2);
                    linkedHashMap5.put(Long.valueOf(j7), a2.substring(0, Character.charCount(a2.codePointAt(0))));
                    linkedHashMap6.put(Long.valueOf(j7), j$.time.e.a(i4, "ccc", locale));
                    i4++;
                    dateFormatSymbols3 = dateFormatSymbols4;
                    simpleImmutableEntry2 = simpleImmutableEntry3;
                    l = l;
                    length2 = length2;
                }
                DateFormatSymbols dateFormatSymbols5 = dateFormatSymbols3;
                simpleImmutableEntry = simpleImmutableEntry2;
                Long l2 = l;
                if (length2 > 0) {
                    hashMap.put(f0.FULL_STANDALONE, linkedHashMap4);
                    hashMap.put(f0.NARROW_STANDALONE, linkedHashMap5);
                    hashMap.put(f0.SHORT_STANDALONE, linkedHashMap6);
                }
                HashMap hashMap7 = new HashMap();
                String[] weekdays = dateFormatSymbols5.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(l2, weekdays[1]);
                hashMap.put(f0.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, b(weekdays[2]));
                hashMap8.put(2L, b(weekdays[3]));
                hashMap8.put(3L, b(weekdays[4]));
                hashMap8.put(4L, b(weekdays[5]));
                hashMap8.put(5L, b(weekdays[6]));
                hashMap8.put(6L, b(weekdays[7]));
                hashMap8.put(l2, b(weekdays[1]));
                hashMap.put(f0.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols5.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(l2, shortWeekdays[1]);
                hashMap.put(f0.SHORT, hashMap9);
                obj = new z(hashMap);
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                if (oVar == j$.time.temporal.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols6 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap10 = new HashMap();
                    HashMap hashMap11 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols6.getAmPmStrings();
                    for (int i5 = 0; i5 < amPmStrings.length; i5++) {
                        if (!amPmStrings[i5].isEmpty()) {
                            long j8 = i5;
                            hashMap10.put(Long.valueOf(j8), amPmStrings[i5]);
                            hashMap11.put(Long.valueOf(j8), b(amPmStrings[i5]));
                        }
                    }
                    if (!hashMap10.isEmpty()) {
                        hashMap.put(f0.FULL, hashMap10);
                        hashMap.put(f0.SHORT, hashMap10);
                        hashMap.put(f0.NARROW, hashMap11);
                    }
                    obj = new z(hashMap);
                } else {
                    obj = "";
                }
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = simpleImmutableEntry;
            concurrentHashMap.putIfAbsent(simpleImmutableEntry4, obj);
            return concurrentHashMap.get(simpleImmutableEntry4);
        }
        simpleImmutableEntry = simpleImmutableEntry2;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) a;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry42 = simpleImmutableEntry;
        concurrentHashMap2.putIfAbsent(simpleImmutableEntry42, obj);
        return concurrentHashMap2.get(simpleImmutableEntry42);
    }
}
