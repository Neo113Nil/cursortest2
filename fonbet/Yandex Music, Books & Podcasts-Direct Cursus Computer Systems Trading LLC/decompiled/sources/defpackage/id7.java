package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class id7 implements qve, cve {
    public final int a;

    public id7(int i) {
        this.a = i;
    }

    @Override // defpackage.cve
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        AtomicReference atomicReference = sd7.a;
        Map map = (Map) atomicReference.get();
        if (map == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            DateTimeZone dateTimeZone = DateTimeZone.a;
            linkedHashMap.put("UT", dateTimeZone);
            linkedHashMap.put("UTC", dateTimeZone);
            linkedHashMap.put("GMT", dateTimeZone);
            sd7.b(linkedHashMap, "EST", "America/New_York");
            sd7.b(linkedHashMap, "EDT", "America/New_York");
            sd7.b(linkedHashMap, "CST", "America/Chicago");
            sd7.b(linkedHashMap, "CDT", "America/Chicago");
            sd7.b(linkedHashMap, "MST", "America/Denver");
            sd7.b(linkedHashMap, "MDT", "America/Denver");
            sd7.b(linkedHashMap, "PST", "America/Los_Angeles");
            sd7.b(linkedHashMap, "PDT", "America/Los_Angeles");
            Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            while (true) {
                if (atomicReference.compareAndSet(null, unmodifiableMap)) {
                    map = unmodifiableMap;
                    break;
                }
                if (atomicReference.get() != null) {
                    map = (Map) atomicReference.get();
                    break;
                }
            }
        }
        String str = null;
        for (String str2 : map.keySet()) {
            if (md7.n(str2, charSequence, i) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str == null) {
            return ~i;
        }
        DateTimeZone dateTimeZone2 = (DateTimeZone) map.get(str);
        pd7Var.i = null;
        pd7Var.d = dateTimeZone2;
        return str.length() + i;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        long j2 = j - i;
        String str = "";
        if (dateTimeZone != null) {
            int i2 = this.a;
            if (i2 == 0) {
                str = dateTimeZone.g(j2, locale);
            } else if (i2 == 1) {
                str = dateTimeZone.n(j2, locale);
            }
        }
        sb.append((CharSequence) str);
    }

    @Override // defpackage.qve
    public final int d() {
        return this.a == 1 ? 4 : 20;
    }
}
