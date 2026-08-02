package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public class RegionMonitoringState implements Serializable {
    private final Callback callback;
    private boolean inside = false;
    private long lastSeenTime = 0;
    public transient boolean a = false;

    public RegionMonitoringState(Callback callback) {
        this.callback = callback;
    }

    public final Callback a() {
        return this.callback;
    }

    public final boolean b() {
        return this.inside;
    }

    public final boolean c() {
        this.lastSeenTime = SystemClock.elapsedRealtime();
        if (this.inside) {
            return false;
        }
        this.inside = true;
        return true;
    }

    public final boolean f() {
        if (!this.inside || this.lastSeenTime <= 0 || SystemClock.elapsedRealtime() - this.lastSeenTime <= b.E) {
            return false;
        }
        SystemClock.elapsedRealtime();
        this.inside = false;
        this.lastSeenTime = 0L;
        return true;
    }
}
