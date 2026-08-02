package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFj1bSDK {
    private static final List<Object> getMediationNetwork(JSONArray jSONArray) {
        IntRange until = RangesKt___RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            obj.getClass();
            arrayList.add(getMediationNetwork(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ConstrainedOnceSequence asSequence = SequencesKt__SequencesKt.asSequence(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = asSequence.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            obj.getClass();
            linkedHashMap.put(next, getMediationNetwork(obj));
        }
        return linkedHashMap;
    }

    private static final Object getMediationNetwork(Object obj) {
        if (obj instanceof JSONArray) {
            return getMediationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
