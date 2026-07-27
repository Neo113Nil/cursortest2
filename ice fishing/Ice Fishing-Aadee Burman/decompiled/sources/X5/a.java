package X5;

import com.onesignal.core.internal.config.b;
import com.onesignal.core.internal.config.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a {
    private final c _configModelStore;
    private final K4.a _time;
    private final Map<String, Long> records;

    public a(K4.a _time, c _configModelStore) {
        h.e(_time, "_time");
        h.e(_configModelStore, "_configModelStore");
        this._time = _time;
        this._configModelStore = _configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(String key) {
        h.e(key, "key");
        this.records.put(key, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String key) {
        h.e(key, "key");
        Long l9 = this.records.get(key);
        if (l9 != null) {
            return this._time.getCurrentTimeMillis() - l9.longValue() >= ((b) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String key) {
        h.e(key, "key");
        Long l9 = this.records.get(key);
        if (l9 != null) {
            if (this._time.getCurrentTimeMillis() - l9.longValue() <= ((b) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
