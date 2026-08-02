package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v3w {
    public static int a(int i, int i2, int i3) {
        return kbx.q(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return kbx.q(i) + i2 + i3 + i4;
    }

    public static int c(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static String d(String str, f2s f2sVar, String str2, f2s f2sVar2) {
        return str + f2sVar + str2 + f2sVar2;
    }

    public static String e(String str, String str2, String str3, String str4, boolean z) {
        return str + str2 + str3 + z + str4;
    }

    public static String f(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String g(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder h(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static LinkedHashSet i(LinkedHashMap linkedHashMap, String str, c2s c2sVar) {
        linkedHashMap.put(str, c2sVar);
        return new LinkedHashSet();
    }

    public static void j(xjo xjoVar, xjo xjoVar2, String str, xjo xjoVar3, String str2) {
        xjoVar.getClass();
        p6g.s(xjoVar2, str);
        p6g.s(xjoVar3, str2);
    }

    public static void k(String str, int i, int i2, String str2, Throwable th) {
        ssg.a(i2, str2, str + i, th);
    }

    public static void l(String str, String str2, int i, String str3, Throwable th) {
        ssg.a(i, str3, str + str2, th);
    }

    public static void m(StringBuilder sb, String str, int i, String str2, Throwable th) {
        sb.append(str);
        ssg.a(i, str2, sb.toString(), th);
    }

    public static void n(boolean z, xdr xdrVar, Object obj) {
        Boolean valueOf = Boolean.valueOf(z);
        xdrVar.getClass();
        xdrVar.m(obj, valueOf);
    }

    public static int o(int i, int i2, int i3) {
        return dmx.r(i) + i2 + i3;
    }

    public static int p(int i, int i2, int i3, int i4) {
        return dmx.r(i) + i2 + i3 + i4;
    }
}
