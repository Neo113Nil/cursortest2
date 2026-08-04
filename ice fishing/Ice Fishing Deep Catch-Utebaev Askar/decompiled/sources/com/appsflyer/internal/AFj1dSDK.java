package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1dSDK {
    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return getCurrencyIso4217Code((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return AFAdRevenueData((JSONObject) obj);
        }
        if (Intrinsics.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) throws JSONException {
        IntRange intRangeA = n.f.a(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(kotlin.collections.p.c(intRangeA));
        Iterator it = intRangeA.iterator();
        while (((n.c) it).f218c) {
            Object obj = jSONArray.get(((a0) it).a());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(AFAdRevenueData(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> AFAdRevenueData(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        Intrinsics.checkNotNullParameter(itKeys, "<this>");
        kotlin.collections.l lVar = new kotlin.collections.l(3, itKeys);
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        boolean z = lVar instanceof p.a;
        Sequence aVar = lVar;
        if (!z) {
            aVar = new p.a(lVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : aVar) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, AFAdRevenueData(obj2));
        }
        return linkedHashMap;
    }
}
