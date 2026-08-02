package com.datadog.trace.api;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class ConfigCollector {
    public static final AtomicReferenceFieldUpdater COLLECTED_UPDATER;
    public static final /* synthetic */ long COLLECTED_UPDATER$offset;
    public static final ConfigCollector INSTANCE;
    public volatile Map collected;

    static {
        ConfigCollector configCollector = new ConfigCollector();
        configCollector.collected = new ConcurrentHashMap();
        INSTANCE = configCollector;
        COLLECTED_UPDATER = AtomicReferenceFieldUpdater.newUpdater(ConfigCollector.class, Map.class, "collected");
        COLLECTED_UPDATER$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(ConfigCollector.class.getDeclaredField("collected"));
    }

    public final void put(String str, int i, Object obj) {
        this.collected.put(str, new ConfigSetting(str, i, obj));
    }

    public final void putAll(HashMap hashMap) {
        ConfigCollector configCollector;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.collected.size() + hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            concurrentHashMap.put((String) entry.getKey(), new ConfigSetting((String) entry.getKey(), 2, entry.getValue()));
        }
        while (true) {
            Map map = this.collected;
            for (Map.Entry entry2 : map.entrySet()) {
                if (!hashMap.containsKey(entry2.getKey())) {
                    concurrentHashMap.put((String) entry2.getKey(), (ConfigSetting) entry2.getValue());
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = COLLECTED_UPDATER;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                long j = COLLECTED_UPDATER$offset;
                configCollector = this;
                if (unsafe.compareAndSwapObject(configCollector, j, map, concurrentHashMap)) {
                    return;
                }
                if (unsafe.getObjectVolatile(configCollector, j) != map) {
                    break;
                } else {
                    this = configCollector;
                }
            }
            concurrentHashMap.keySet().retainAll(hashMap.keySet());
            this = configCollector;
        }
    }
}
