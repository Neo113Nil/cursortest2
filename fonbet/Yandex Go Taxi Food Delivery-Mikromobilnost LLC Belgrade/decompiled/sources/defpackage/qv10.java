package defpackage;

import android.os.Parcel;
import com.google.crypto.tink.shaded.protobuf.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class qv10 {
    public static void A(int i, wls wlsVar, bts btsVar, boolean z, boolean z2) {
        wlsVar.invoke(btsVar, Integer.valueOf(i));
        btsVar.t(z);
        btsVar.t(z2);
    }

    public static void B(boolean z, r0 r0Var, Object obj) {
        Boolean valueOf = Boolean.valueOf(z);
        r0Var.getClass();
        r0Var.m(obj, valueOf);
    }

    public static void C(Object[] objArr, int i, String str, hst hstVar) {
        hstVar.n(String.format(str, Arrays.copyOf(objArr, i)));
    }

    public static int D(int i, int i2, int i3, int i4) {
        return g.j(i) + i2 + i3 + i4;
    }

    public static int a(int i, int i2, int i3) {
        return g.i(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(String str, String str2, cne0 cne0Var, int i) {
        return cne0Var.i(str + str2, i);
    }

    public static ike e(jse jseVar) {
        return bvf0.a(jseVar.plus(jl40.a()));
    }

    public static m1r0 f(yxq0 yxq0Var) {
        return yxq0Var.a.e.b.e;
    }

    public static String g(int i, String str) {
        return (str + i).toString();
    }

    public static String h(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String i(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String j(long j, String str) {
        return str + j;
    }

    public static String k(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String l(Class cls, String str) {
        return str + cls;
    }

    public static String m(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String n(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String o(String str, Object obj) {
        return str + obj;
    }

    public static String p(String str, String str2, Object obj) {
        return str + obj + str2;
    }

    public static String q(StringBuilder sb, Long l, char c) {
        sb.append(l);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, Set set, char c) {
        sb.append(set);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, List list, String str2, List list2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(list2);
        sb.append(str3);
        return sb;
    }

    public static ArrayList w(String str, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    public static Iterator x(Map map, Parcel parcel) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static MapBuilder y(String str, String str2) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(str, str2);
        return mapBuilder;
    }

    public static Ref$ObjectRef z(Object obj) {
        b.b(obj);
        return new Ref$ObjectRef();
    }
}
