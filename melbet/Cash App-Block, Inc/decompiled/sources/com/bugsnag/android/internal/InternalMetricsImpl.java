package com.bugsnag.android.internal;

import com.bugsnag.android.Bugsnag;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public final class InternalMetricsImpl implements InternalMetrics {
    public int breadcrumbBytesRemovedCount;
    public int breadcrumbsRemovedCount;
    public final Map callbackCounts;
    public final Map configDifferences;
    public int metadataCharsTruncatedCount;
    public int metadataStringsTrimmedCount;

    public InternalMetricsImpl(Map map) {
        if (map == null) {
            this.configDifferences = new HashMap();
            this.callbackCounts = new HashMap();
            return;
        }
        Map asMutableMap = TypeIntrinsics.asMutableMap(map.get("config"));
        this.configDifferences = asMutableMap == null ? new HashMap() : asMutableMap;
        Map asMutableMap2 = TypeIntrinsics.asMutableMap(map.get("callbacks"));
        this.callbackCounts = asMutableMap2 == null ? new HashMap() : asMutableMap2;
        Map asMutableMap3 = TypeIntrinsics.asMutableMap(map.get("system"));
        if (asMutableMap3 != null) {
            Number number = (Number) asMutableMap3.get("stringsTruncated");
            this.metadataStringsTrimmedCount = number != null ? number.intValue() : 0;
            Number number2 = (Number) asMutableMap3.get("stringCharsTruncated");
            this.metadataCharsTruncatedCount = number2 != null ? number2.intValue() : 0;
            Number number3 = (Number) asMutableMap3.get("breadcrumbsRemovedCount");
            this.breadcrumbsRemovedCount = number3 != null ? number3.intValue() : 0;
            Number number4 = (Number) asMutableMap3.get("breadcrumbBytesRemoved");
            this.breadcrumbBytesRemovedCount = number4 != null ? number4.intValue() : 0;
        }
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public final void notifyAddCallback(String str) {
        Map map = this.callbackCounts;
        Integer num = (Integer) map.get(str);
        int intValue = (num != null ? num.intValue() : 0) + 1;
        map.put(str, Integer.valueOf(intValue >= 0 ? intValue : 0));
        Method method = Bugsnag.notifyAddCallback;
        if (method != null) {
            method.invoke(Bugsnag.ndkPlugin, str);
        }
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public final void setBreadcrumbTrimMetrics(int i, int i2) {
        this.breadcrumbsRemovedCount = i;
        this.breadcrumbBytesRemovedCount = i2;
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public final void setCallbackCounts(HashMap hashMap) {
        Map map = this.callbackCounts;
        map.clear();
        map.putAll(hashMap);
        Method method = Bugsnag.initCallbackCounts;
        if (method != null) {
            method.invoke(Bugsnag.ndkPlugin, hashMap);
        }
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public final void setConfigDifferences(Map map) {
        Map map2 = this.configDifferences;
        map2.clear();
        map2.putAll(map);
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("config", map2));
        Method method = Bugsnag.setStaticData;
        if (method != null) {
            method.invoke(Bugsnag.ndkPlugin, mapOf);
        }
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public final void setMetadataTrimMetrics(int i, int i2) {
        this.metadataStringsTrimmedCount = i;
        this.metadataCharsTruncatedCount = i2;
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public final Map toJsonableMap() {
        Map map;
        Map map2;
        Integer num;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.callbackCounts);
        Method method = Bugsnag.getCurrentCallbackSetCounts;
        if (method != null) {
            Object invoke = method.invoke(Bugsnag.ndkPlugin, null);
            invoke.getClass();
            map = (Map) invoke;
        } else {
            map = null;
        }
        if (map != null && (num = (Integer) map.get("ndkOnError")) != null) {
            hashMap.put("ndkOnError", num);
        }
        Method method2 = Bugsnag.getCurrentNativeApiCallUsage;
        if (method2 != null) {
            Object invoke2 = method2.invoke(Bugsnag.ndkPlugin, null);
            invoke2.getClass();
            map2 = (Map) invoke2;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        int i = this.metadataStringsTrimmedCount;
        Pair pair = i > 0 ? new Pair("stringsTruncated", Integer.valueOf(i)) : null;
        int i2 = this.metadataCharsTruncatedCount;
        Pair pair2 = i2 > 0 ? new Pair("stringCharsTruncated", Integer.valueOf(i2)) : null;
        int i3 = this.breadcrumbsRemovedCount;
        Pair pair3 = i3 > 0 ? new Pair("breadcrumbsRemoved", Integer.valueOf(i3)) : null;
        int i4 = this.breadcrumbBytesRemovedCount;
        Map map3 = MapsKt__MapsKt.toMap(ArraysKt___ArraysKt.filterNotNull(new Pair[]{pair, pair2, pair3, i4 > 0 ? new Pair("breadcrumbBytesRemoved", Integer.valueOf(i4)) : null}));
        Map map4 = this.configDifferences;
        return MapsKt__MapsKt.toMap(ArraysKt___ArraysKt.filterNotNull(new Pair[]{!map4.isEmpty() ? new Pair("config", map4) : null, !hashMap.isEmpty() ? new Pair("callbacks", hashMap) : null, map3.isEmpty() ? null : new Pair("system", map3)}));
    }
}
