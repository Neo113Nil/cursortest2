package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Metadata implements JsonStream.Streamable {
    public final ObjectJsonStreamer jsonStreamer;
    public final Map store;

    public Metadata(Map map) {
        this.store = map;
        this.jsonStreamer = new ObjectJsonStreamer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addMetadata(String str, String str2, Object obj) {
        Map map = this.store;
        if (obj == null) {
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                map2.remove(str2);
            }
            if (map2 == null || map2.isEmpty()) {
                map.remove(str);
                return;
            }
            return;
        }
        Map map3 = (Map) map.get(str);
        if (map3 == null) {
            map3 = new ConcurrentHashMap();
        }
        map.put(str, map3);
        Object obj2 = map3.get(str2);
        if (obj2 != null && (obj instanceof Map)) {
            obj = Bugsnag.mergeMaps$bugsnag_android_core_release(CollectionsKt__CollectionsKt.listOf((Object[]) new Map[]{obj2, obj}));
        }
        map3.put(str2, obj);
    }

    public final Metadata copy() {
        Metadata metadata = new Metadata(toMap());
        metadata.jsonStreamer.redactedKeys = CollectionsKt.toSet(this.jsonStreamer.redactedKeys);
        return metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Metadata) && Intrinsics.areEqual(this.store, ((Metadata) obj).store);
    }

    public final int hashCode() {
        return this.store.hashCode();
    }

    public final ConcurrentHashMap toMap() {
        Map map = this.store;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
        for (Map.Entry entry : map.entrySet()) {
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        this.jsonStreamer.objectToStream(this.store, jsonStream, true);
    }

    public final String toString() {
        return "Metadata(store=" + this.store + ')';
    }

    public /* synthetic */ Metadata(int i) {
        this(new ConcurrentHashMap());
    }

    public final void addMetadata(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            addMetadata(str, (String) entry.getKey(), entry.getValue());
        }
    }
}
