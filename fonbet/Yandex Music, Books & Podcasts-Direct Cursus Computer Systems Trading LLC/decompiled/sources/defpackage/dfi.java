package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract /* synthetic */ class dfi {
    public static int a(float f, float f2, float f3) {
        return Math.round((f + f2) * f3);
    }

    public static int b(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static String c(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String d(long j, String str) {
        return str + j;
    }

    public static String e(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String f(String str, int i, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String g(String str, String str2, Object obj) {
        return str + obj + str2;
    }

    public static String h(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static String i(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String j(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder l(String str, int i, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static LinkedHashMap m(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, str4);
        return linkedHashMap;
    }

    public static Map n(String str, String str2) {
        return tah.b(new Pair(str, str2));
    }

    public static void o(int i, String str, String str2) {
        vq1.n0(str2, str + i);
    }

    public static void p(int i, String str, String str2, String str3, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, nmb.u(i));
    }

    public static void q(long j, String str, StringBuilder sb) {
        sb.append((Object) d85.i(j));
        sb.append(str);
    }

    public static void r(String str, String str2) {
        Assertions.throwOrSkip(str2, new FailedAssertionException(str));
    }

    public static void s(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void t(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void u(LinkedHashMap linkedHashMap, String str, ArrayList arrayList, boolean z, String str2) {
        linkedHashMap.put(str, arrayList);
        linkedHashMap.put(str2, String.valueOf(z));
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? "null" : "PLAINTEXT" : "TLS";
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? "null" : "OUTBOUND" : "INBOUND";
    }
}
