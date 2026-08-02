package defpackage;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class mzc {
    public static final ConcurrentHashMap n = new ConcurrentHashMap();
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final TreeMap g;
    public final TreeMap h;
    public final TreeMap i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public mzc(Locale locale) {
        DateFormatSymbols a = sd7.a(locale);
        this.a = a.getEras();
        String[] weekdays = a.getWeekdays();
        String[] strArr = new String[8];
        int i = 1;
        while (i < 8) {
            strArr[i] = weekdays[i < 7 ? i + 1 : 1];
            i++;
        }
        this.b = strArr;
        String[] shortWeekdays = a.getShortWeekdays();
        String[] strArr2 = new String[8];
        int i2 = 1;
        while (i2 < 8) {
            strArr2[i2] = shortWeekdays[i2 < 7 ? i2 + 1 : 1];
            i2++;
        }
        this.c = strArr2;
        String[] months = a.getMonths();
        String[] strArr3 = new String[13];
        for (int i3 = 1; i3 < 13; i3++) {
            strArr3[i3] = months[i3 - 1];
        }
        this.d = strArr3;
        String[] shortMonths = a.getShortMonths();
        String[] strArr4 = new String[13];
        for (int i4 = 1; i4 < 13; i4++) {
            strArr4[i4] = shortMonths[i4 - 1];
        }
        this.e = strArr4;
        this.f = a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i5 = 0; i5 < 13; i5++) {
            numArr[i5] = Integer.valueOf(i5);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap treeMap = new TreeMap(comparator);
        this.g = treeMap;
        a(treeMap, this.a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap treeMap2 = new TreeMap(comparator);
        this.h = treeMap2;
        a(treeMap2, this.b, numArr);
        a(treeMap2, this.c, numArr);
        for (int i6 = 1; i6 <= 7; i6++) {
            treeMap2.put(String.valueOf(i6).intern(), numArr[i6]);
        }
        TreeMap treeMap3 = new TreeMap(comparator);
        this.i = treeMap3;
        a(treeMap3, this.d, numArr);
        a(treeMap3, this.e, numArr);
        for (int i7 = 1; i7 <= 12; i7++) {
            treeMap3.put(String.valueOf(i7).intern(), numArr[i7]);
        }
        this.j = c(this.a);
        this.k = c(this.b);
        c(this.c);
        this.l = c(this.d);
        c(this.e);
        this.m = c(this.f);
    }

    public static void a(TreeMap treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String str = strArr[length];
            if (str != null) {
                treeMap.put(str, numArr[length]);
            }
        }
    }

    public static mzc b(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentHashMap concurrentHashMap = n;
        mzc mzcVar = (mzc) concurrentHashMap.get(locale);
        if (mzcVar == null) {
            mzcVar = new mzc(locale);
            mzc mzcVar2 = (mzc) concurrentHashMap.putIfAbsent(locale, mzcVar);
            if (mzcVar2 != null) {
                return mzcVar2;
            }
        }
        return mzcVar;
    }

    public static int c(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }
}
