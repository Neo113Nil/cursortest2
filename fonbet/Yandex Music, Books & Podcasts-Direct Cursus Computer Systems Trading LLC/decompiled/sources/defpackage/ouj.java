package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.Nb;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ouj implements ws3 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static void A(String str, String str2, String str3, String str4, ArrayList arrayList) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }

    public static void B(String str, List list, int i, String str2, Throwable th) {
        ssg.a(i, str2, str + list, th);
    }

    public static void C(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static /* synthetic */ int D(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] E(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static fxb c(String str, List list, List list2) {
        list.getClass();
        return new fxb(list2, str);
    }

    public static fif e(Object obj) {
        qgg.h0(obj);
        return new fif();
    }

    public static fif f(String str) {
        sme.c(str);
        return new fif();
    }

    public static ClassCastException g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static IllegalStateException h(a7f a7fVar, fx6 fx6Var, String str) {
        a7fVar.getClass();
        fx6Var.getClass();
        return new IllegalStateException(str);
    }

    public static Object i(List list, int i) {
        list.getClass();
        Object obj = list.get(i);
        obj.getClass();
        return obj;
    }

    public static Object j(List list, List list2) {
        list.getClass();
        Object Q = CollectionsKt.Q(list2);
        Q.getClass();
        return Q;
    }

    public static String k(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String l(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String f0 = a7fVar.f0();
        f0.getClass();
        return f0;
    }

    public static String m(String str, float f, String str2) {
        return str + f + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String s(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static String t(CoverPath coverPath) {
        String pathForSize = coverPath.getPathForSize(wct.t());
        pathForSize.getClass();
        return pathForSize;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static JSONObject w(t7k t7kVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, str, str2);
        return jSONObject;
    }

    public static void x(int i, oq5 oq5Var, int i2, kb5 kb5Var) {
        oq5Var.k0(Integer.valueOf(i));
        oq5Var.b(Integer.valueOf(i2), kb5Var);
    }

    public static void y(int i, LinkedHashMap linkedHashMap, String str, int i2, String str2) {
        linkedHashMap.put(str, String.valueOf(i));
        linkedHashMap.put(str2, String.valueOf(i2));
    }

    public static void z(oq5 oq5Var, int i, wn5 wn5Var, oq5 oq5Var2, int i2) {
        Nb.a(i, wn5Var, new lrq(oq5Var), oq5Var2, i2);
    }
}
