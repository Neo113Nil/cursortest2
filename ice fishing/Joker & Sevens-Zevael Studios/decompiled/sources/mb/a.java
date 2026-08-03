package mb;

import com.onesignal.core.internal.config.b;
import java.util.LinkedHashMap;
import java.util.Map;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    private final b _configModelStore;
    private final e9.a _time;
    private final Map<String, Long> records;

    public a(e9.a aVar, b bVar) {
        j.e(aVar, "_time");
        j.e(bVar, "_configModelStore");
        this._time = aVar;
        this._configModelStore = bVar;
        this.records = new LinkedHashMap();
    }

    public final void add(String str) {
        j.e(str, "key");
        this.records.put(str, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String str) {
        j.e(str, "key");
        Long l10 = this.records.get(str);
        if (l10 != null) {
            return this._time.getCurrentTimeMillis() - l10.longValue() >= ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String str) {
        j.e(str, "key");
        Long l10 = this.records.get(str);
        if (l10 != null) {
            if (this._time.getCurrentTimeMillis() - l10.longValue() <= ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
