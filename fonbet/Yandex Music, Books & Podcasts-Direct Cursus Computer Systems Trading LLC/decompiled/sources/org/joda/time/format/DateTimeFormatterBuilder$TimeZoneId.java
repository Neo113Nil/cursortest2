package org.joda.time.format;

import defpackage.cve;
import defpackage.dfi;
import defpackage.md7;
import defpackage.pd7;
import defpackage.qve;
import defpackage.rk4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
final class DateTimeFormatterBuilder$TimeZoneId implements qve, cve {
    public static final DateTimeFormatterBuilder$TimeZoneId a;
    public static final HashMap b;
    public static final ArrayList c;
    public static final int d;
    public static final int e;
    public static final /* synthetic */ DateTimeFormatterBuilder$TimeZoneId[] f;

    static {
        DateTimeFormatterBuilder$TimeZoneId dateTimeFormatterBuilder$TimeZoneId = new DateTimeFormatterBuilder$TimeZoneId("INSTANCE", 0);
        a = dateTimeFormatterBuilder$TimeZoneId;
        f = new DateTimeFormatterBuilder$TimeZoneId[]{dateTimeFormatterBuilder$TimeZoneId};
        c = new ArrayList();
        ArrayList arrayList = new ArrayList(DateTimeZone.l().b());
        Collections.sort(arrayList);
        b = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                indexOf = indexOf < str.length() ? indexOf + 1 : indexOf;
                i2 = Math.max(i2, indexOf);
                String substring = str.substring(0, indexOf + 1);
                String substring2 = str.substring(indexOf);
                HashMap hashMap = b;
                if (!hashMap.containsKey(substring)) {
                    hashMap.put(substring, new ArrayList());
                }
                ((List) hashMap.get(substring)).add(substring2);
            } else {
                c.add(str);
            }
            i = Math.max(i, str.length());
        }
        d = i;
        e = i2;
    }

    public static DateTimeFormatterBuilder$TimeZoneId valueOf(String str) {
        return (DateTimeFormatterBuilder$TimeZoneId) Enum.valueOf(DateTimeFormatterBuilder$TimeZoneId.class, str);
    }

    public static DateTimeFormatterBuilder$TimeZoneId[] values() {
        return (DateTimeFormatterBuilder$TimeZoneId[]) f.clone();
    }

    @Override // defpackage.cve
    public final int a() {
        return d;
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        List list;
        String str;
        int i2;
        String str2;
        int length = charSequence.length();
        int min = Math.min(length, e + i);
        int i3 = i;
        while (true) {
            if (i3 >= min) {
                list = c;
                str = "";
                i2 = i;
                break;
            }
            if (charSequence.charAt(i3) == '/') {
                int i4 = i3 + 1;
                str = charSequence.subSequence(i, i4).toString();
                i2 = str.length() + i;
                if (i3 < length - 1) {
                    StringBuilder k = dfi.k(str);
                    k.append(charSequence.charAt(i4));
                    str2 = k.toString();
                } else {
                    str2 = str;
                }
                list = (List) b.get(str2);
                if (list == null) {
                    return ~i;
                }
            } else {
                i3++;
            }
        }
        String str3 = null;
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str4 = (String) list.get(i5);
            if (md7.n(str4, charSequence, i2) && (str3 == null || str4.length() > str3.length())) {
                str3 = str4;
            }
        }
        if (str3 == null) {
            return ~i;
        }
        DateTimeZone c2 = DateTimeZone.c(str.concat(str3));
        pd7Var.i = null;
        pd7Var.d = c2;
        return str3.length() + i2;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        sb.append((CharSequence) (dateTimeZone != null ? dateTimeZone.f() : ""));
    }

    @Override // defpackage.qve
    public final int d() {
        return d;
    }
}
