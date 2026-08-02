package defpackage;

import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x4e implements el7 {
    public static void A(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void B(pho phoVar, String str, HashMap hashMap, int i) {
        phoVar.a(str, hashMap, i, new HashMap());
    }

    public static void C(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static int D(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static double a(double d, double d2, double d3, double d4) {
        return ((d - d2) * d3) + d4;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static String d(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static String e(String str, float f, String str2, float f2, String str3) {
        return str + f + str2 + f2 + str3;
    }

    public static String f(String str, String str2, float f) {
        return str + f + str2;
    }

    public static String g(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String h(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String i(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder k(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(arrayList);
        sb.append(str4);
        return sb;
    }

    public static HashMap n(int i, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(i));
        return new HashMap();
    }

    public static HashMap o(Class cls, mb3 mb3Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, mb3Var);
        return hashMap;
    }

    public static HashMap p(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static HashMap q(HashMap hashMap, String str, String str2, String str3, String str4) {
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return new HashMap();
    }

    public static HashMap r(boolean z, HashMap hashMap, String str) {
        hashMap.put(str, Boolean.valueOf(z));
        return new HashMap();
    }

    public static Iterator s(Parcel parcel, int i, Map map) {
        parcel.writeInt(i);
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static LinkedHashMap t(int i, String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, str4);
        return linkedHashMap;
    }

    public static Map u(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static KotlinNothingValueException v(String str) {
        ixv.c(str);
        return new KotlinNothingValueException();
    }

    public static MapBuilder w(double d, MapBuilder mapBuilder, String str) {
        mapBuilder.put(str, Double.valueOf(d));
        return mapBuilder.j();
    }

    public static void x(int i, int i2, int i3, int i4, int i5) {
        tw21.Q(i);
        tw21.Q(i2);
        tw21.Q(i3);
        tw21.Q(i4);
        tw21.Q(i5);
    }

    public static void y(int i, int i2, View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static void z(int i, r0 r0Var, Object obj) {
        Integer valueOf = Integer.valueOf(i);
        r0Var.getClass();
        r0Var.m(obj, valueOf);
    }
}
