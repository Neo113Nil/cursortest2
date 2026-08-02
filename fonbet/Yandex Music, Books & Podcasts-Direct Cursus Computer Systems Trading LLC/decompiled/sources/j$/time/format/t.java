package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class t extends s {
    public static final Map i = new ConcurrentHashMap();
    public final f0 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public t(f0 f0Var, boolean z) {
        super(j$.time.temporal.p.e, "ZoneText(" + f0Var + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.requireNonNull(f0Var, "textStyle");
        this.e = f0Var;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    @Override // j$.time.format.s, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(x xVar, StringBuilder sb) {
        boolean z;
        f0 f0Var;
        f0 f0Var2;
        String[] strArr;
        ZoneId zoneId = (ZoneId) xVar.b(j$.time.temporal.p.a);
        if (zoneId == null) {
            return false;
        }
        String s = zoneId.s();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = xVar.a;
            String str = null;
            Map map = null;
            if (!this.f) {
                if (temporalAccessor.f(j$.time.temporal.a.INSTANT_SECONDS)) {
                    z = zoneId.E().g(Instant.E(temporalAccessor));
                } else {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    if (temporalAccessor.f(aVar)) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                        if (temporalAccessor.f(aVar2)) {
                            LocalDateTime L = LocalDateTime.L(LocalDate.j0(temporalAccessor.g(aVar)), j$.time.l.a0(temporalAccessor.g(aVar2)));
                            Object e = zoneId.E().e(L);
                            if ((e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null) == null) {
                                z = zoneId.E().g(Instant.J(ZonedDateTime.J(L, zoneId, null).c0(), r0.a.b.d));
                            }
                        }
                    }
                }
                Locale locale = xVar.b.b;
                f0Var = f0.NARROW;
                f0Var2 = this.e;
                if (f0Var2 != f0Var) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i;
                    SoftReference softReference = (SoftReference) concurrentHashMap.get(s);
                    if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                        TimeZone timeZone = TimeZone.getTimeZone(s);
                        String[] strArr2 = {s, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), s, s};
                        if (map == null) {
                            map = new ConcurrentHashMap();
                        }
                        map.put(locale, strArr2);
                        concurrentHashMap.put(s, new SoftReference(map));
                        strArr = strArr2;
                    }
                    if (!z) {
                        str = strArr[f0Var2.a + 1];
                    } else if (z) {
                        str = strArr[f0Var2.a + 3];
                    } else {
                        str = strArr[f0Var2.a + 5];
                    }
                }
                if (str != null) {
                    s = str;
                }
            }
            z = 2;
            Locale locale2 = xVar.b.b;
            f0Var = f0.NARROW;
            f0Var2 = this.e;
            if (f0Var2 != f0Var) {
            }
            if (str != null) {
            }
        }
        sb.append(s);
        return true;
    }

    @Override // j$.time.format.s
    public final m a(v vVar) {
        m mVar;
        if (this.e == f0.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.i.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = vVar.b ? new m("", null, null) : new l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap hashMap = (HashMap) g0.d;
                String str2 = (String) hashMap.get(str);
                if (str2 == null) {
                    HashMap hashMap2 = (HashMap) g0.g;
                    if (hashMap2.containsKey(str)) {
                        str = (String) hashMap2.get(str);
                        str2 = (String) hashMap.get(str);
                    }
                }
                if (str2 != null) {
                    Map map2 = (Map) ((HashMap) g0.f).get(str2);
                    str = (map2 == null || !map2.containsKey(locale.getCountry())) ? (String) ((HashMap) g0.e).get(str2) : (String) map2.get(locale.getCountry());
                }
                HashMap hashMap3 = (HashMap) g0.g;
                if (hashMap3.containsKey(str)) {
                    str = (String) hashMap3.get(str);
                }
                for (int i2 = this.e == f0.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    mVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }
}
