package com.iab.omid.library.toponad;

import D.x;
import com.iab.omid.library.toponad.utils.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f36988a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f36989b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f36990c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f36991d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f36992e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f36993f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f36994g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] a9 = a(str);
        StringBuilder sb = new StringBuilder(AbstractC5128c.j(str.length(), 16, str2));
        if (!b(str, sb, f36989b, str2, a9) && !a(str, sb, f36988a, str2, a9) && !b(str, sb, f36991d, str2, a9) && !a(str, sb, f36990c, str2, a9) && !b(str, sb, f36993f, str2, a9) && !a(str, sb, f36992e, str2, a9) && !a(str, sb, f36994g, str2, a9)) {
            return str2.concat(str);
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        return a(str2, x.l("<script type=\"text/javascript\">", str, "</script>"));
    }

    private static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    private static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
