package com.gamericefishpro.space.gh;

import com.gamericefishpro.space.rc.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final b _configModelStore;
    private final com.gamericefishpro.space.kd.a _time;
    private final Map<String, Long> records;

    public a(com.gamericefishpro.space.kd.a _time, b _configModelStore) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._time = _time;
        this._configModelStore = _configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.records.put(key, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l = this.records.get(key);
        if (l != null) {
            return this._time.getCurrentTimeMillis() - l.longValue() >= ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l = this.records.get(key);
        if (l != null) {
            if (this._time.getCurrentTimeMillis() - l.longValue() <= ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
