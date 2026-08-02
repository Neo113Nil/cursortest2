package com.appsflyer.internal;

import defpackage.ghp;
import defpackage.n86;
import defpackage.rpe;
import defpackage.v75;
import defpackage.yhn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFj1iSDK {
    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return getMonetizationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getRevenue((JSONObject) obj);
        }
        if (Intrinsics.d(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> getMonetizationNetwork(JSONArray jSONArray) {
        IntRange m = yhn.m(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(v75.o(m, 10));
        Iterator it = m.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((rpe) it).nextInt());
            obj.getClass();
            arrayList.add(AFAdRevenueData(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> getRevenue(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        n86 b = ghp.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            obj.getClass();
            linkedHashMap.put(next, AFAdRevenueData(obj));
        }
        return linkedHashMap;
    }
}
