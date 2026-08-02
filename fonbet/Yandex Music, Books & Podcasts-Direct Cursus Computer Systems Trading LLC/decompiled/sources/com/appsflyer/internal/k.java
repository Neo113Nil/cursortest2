package com.appsflyer.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.data.network.core.t;
import com.yandex.plus.core.data.common.v;
import defpackage.cdk;
import defpackage.ceu;
import defpackage.ern;
import defpackage.g96;
import defpackage.i96;
import defpackage.q7g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LINKED" : "ALLOWED" : "DENIED" : "UNKNOWN";
    }

    public static int a(q7g q7gVar, int i, int i2) {
        return (q7gVar.hashCode() + i) * i2;
    }

    public static int b(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i, int i2) {
        linkedHashMap.put(str, parcel.readString());
        return i + i2;
    }

    public static int c(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static int d(com.yandex.passport.common.core.f fVar, int i, int i2) {
        return (fVar.hashCode() + i) * i2;
    }

    public static int e(com.yandex.plus.bdui.action.a aVar, int i, int i2) {
        return (aVar.hashCode() + i) * i2;
    }

    public static int f(v vVar, int i, int i2) {
        return (vVar.hashCode() + i) * i2;
    }

    public static g96 g(i96 i96Var, i96 i96Var2, ceu ceuVar, int i) {
        return ceuVar.a(new Pair(i96Var, i96Var2), i);
    }

    public static Parcelable h(Bundle bundle, Class cls, String str) {
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.getParcelable(str);
    }

    public static com.yandex.passport.api.impl.b i(Bundle bundle, String str) {
        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(bundle.getInt(str));
        a.getClass();
        return a;
    }

    public static com.yandex.passport.common.network.n j(long j, t tVar, com.yandex.passport.data.models.g gVar) {
        return tVar.a(gVar, new Long(j));
    }

    public static com.yandex.passport.common.network.p k(String str, String str2) {
        com.yandex.passport.common.network.p pVar = new com.yandex.passport.common.network.p(str);
        pVar.J(str2);
        return pVar;
    }

    public static String l(Class cls, StringBuilder sb) {
        sb.append(ern.a(cls));
        return sb.toString().toString();
    }

    public static String m(String str, Class cls) {
        return str.concat(cls.getSimpleName()).toString();
    }

    public static String n(StringBuilder sb, com.yandex.passport.common.core.f fVar, char c) {
        sb.append(fVar);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, com.yandex.plus.bdui.action.a aVar, char c) {
        sb.append(aVar);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, Boolean bool, char c) {
        sb.append(bool);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder q(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static HashMap r(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static Iterator s(Map map, Parcel parcel) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static LinkedHashMap t(cdk cdkVar, String str, String str2, String str3) {
        cdkVar.getClass();
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str2, str3);
        return linkedHashMap;
    }

    public static void u(int i, String str, String str2, String str3, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(str, String.valueOf(i));
        linkedHashMap.put(str2, str3);
    }

    public static void v(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void w(String str, Integer num, HashMap hashMap, String str2) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str, num);
        hashMap.put(str2, hashMap2);
    }

    public static void x(StringBuilder sb, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.log.api.a aVar2, String str) {
        sb.append(aVar);
        bVar.c(aVar2, str, sb.toString());
    }

    public static void y(StringBuilder sb, String str, String str2) {
        sb.append((Object) com.yandex.passport.common.url.b.m(str));
        sb.append(str2);
    }

    public static void z(LinkedHashMap linkedHashMap, String str, List list, boolean z, String str2) {
        linkedHashMap.put(str, list);
        linkedHashMap.put(str2, String.valueOf(z));
    }
}
