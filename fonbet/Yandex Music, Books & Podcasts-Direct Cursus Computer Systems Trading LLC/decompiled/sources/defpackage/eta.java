package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.fragment.app.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class eta {
    public static int a(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(f73 f73Var, int i, int i2) {
        return (f73Var.hashCode() + i) * i2;
    }

    public static int c(onq onqVar, int i, int i2) {
        return (onqVar.hashCode() + i) * i2;
    }

    public static int d(Integer num, ua5 ua5Var, sai saiVar) {
        int intValue = num.intValue();
        ua5Var.getClass();
        saiVar.getClass();
        return intValue;
    }

    public static String e() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static String f(String str, o oVar, String str2) {
        return str + oVar + str2;
    }

    public static String g(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String h(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder i(String str, nrf nrfVar, String str2, onq onqVar, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(nrfVar);
        sb.append(str2);
        sb.append(onqVar);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder j(String str, boolean z, String str2, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void k(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str.substring(i, i2));
        sb.append(str2);
    }

    public static void l(int i, wn5 wn5Var, oq5 oq5Var, boolean z) {
        wn5Var.invoke(oq5Var, Integer.valueOf(i));
        oq5Var.p(z);
    }

    public static void m(int i, String str, String str2, String str3, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, String.valueOf(i));
    }

    public static void n(long j, aqi aqiVar) {
        aqiVar.setValue(new d85(j));
    }

    public static void o(bsc bscVar, azs azsVar) {
        azsVar.d(new dsc(bscVar));
    }

    public static void p(vci vciVar, float f, oq5 oq5Var, boolean z) {
        u1g.l(oq5Var, d.e(vciVar, f));
        oq5Var.p(z);
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj == null) {
            return;
        }
        l1j.f();
    }

    public static void r(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void s(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void t(StringBuilder sb, ges gesVar, String str, ges gesVar2, String str2) {
        sb.append(gesVar);
        sb.append(str);
        sb.append(gesVar2);
        sb.append(str2);
    }

    public static void u(LinkedHashMap linkedHashMap, String str, String str2, boolean z, String str3) {
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, String.valueOf(z));
    }
}
