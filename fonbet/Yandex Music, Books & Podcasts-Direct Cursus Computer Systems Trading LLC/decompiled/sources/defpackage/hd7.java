package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public final class hd7 implements qve, cve {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final DateTimeFieldType a;
    public final boolean b;

    public hd7(DateTimeFieldType dateTimeFieldType, boolean z) {
        this.a = dateTimeFieldType;
        this.b = z;
    }

    @Override // defpackage.cve
    public final int a() {
        return d();
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        int intValue;
        Map map;
        Locale locale = pd7Var.b;
        ConcurrentHashMap concurrentHashMap = c;
        Map map2 = (Map) concurrentHashMap.get(locale);
        if (map2 == null) {
            map2 = new ConcurrentHashMap();
            concurrentHashMap.put(locale, map2);
        }
        DateTimeFieldType dateTimeFieldType = this.a;
        Object[] objArr = (Object[]) map2.get(dateTimeFieldType);
        if (objArr == null) {
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
            MutableDateTime mutableDateTime = new MutableDateTime(0L, ISOChronology.V(DateTimeZone.a));
            xc7 b = dateTimeFieldType.b(mutableDateTime.b());
            if (!b.t()) {
                wvs.g(dateTimeFieldType, "' is not supported", "Field '");
                return 0;
            }
            MutableDateTime.Property property = new MutableDateTime.Property(mutableDateTime, b);
            int n = property.b().n();
            int j = property.b().j();
            if (j - n > 32) {
                return ~i;
            }
            intValue = property.b().i(locale);
            while (n <= j) {
                property.d(n);
                String d = property.b().d(property.c(), locale);
                Boolean bool = Boolean.TRUE;
                concurrentHashMap2.put(d, bool);
                concurrentHashMap2.put(property.b().d(property.c(), locale).toLowerCase(locale), bool);
                concurrentHashMap2.put(property.b().d(property.c(), locale).toUpperCase(locale), bool);
                concurrentHashMap2.put(property.b().f(property.c(), locale), bool);
                concurrentHashMap2.put(property.b().f(property.c(), locale).toLowerCase(locale), bool);
                concurrentHashMap2.put(property.b().f(property.c(), locale).toUpperCase(locale), bool);
                n++;
            }
            if ("en".equals(locale.getLanguage()) && dateTimeFieldType == DateTimeFieldType.a) {
                Boolean bool2 = Boolean.TRUE;
                concurrentHashMap2.put("BCE", bool2);
                concurrentHashMap2.put("bce", bool2);
                concurrentHashMap2.put("CE", bool2);
                concurrentHashMap2.put("ce", bool2);
                intValue = 3;
            }
            map2.put(dateTimeFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(intValue)});
            map = concurrentHashMap2;
        } else {
            Map map3 = (Map) objArr[0];
            intValue = ((Integer) objArr[1]).intValue();
            map = map3;
        }
        for (int min = Math.min(charSequence.length(), intValue + i); min > i; min--) {
            String charSequence2 = charSequence.subSequence(i, min).toString();
            if (map.containsKey(charSequence2)) {
                nd7 c2 = pd7Var.c();
                c2.a = dateTimeFieldType.b(pd7Var.a);
                c2.b = 0;
                c2.c = charSequence2;
                c2.d = locale;
                return min;
            }
        }
        return ~i;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        try {
            xc7 b = this.a.b(rk4Var);
            sb.append((CharSequence) (this.b ? b.d(j, locale) : b.f(j, locale)));
        } catch (RuntimeException unused) {
            sb.append((char) 65533);
        }
    }

    @Override // defpackage.qve
    public final int d() {
        return this.b ? 6 : 20;
    }
}
