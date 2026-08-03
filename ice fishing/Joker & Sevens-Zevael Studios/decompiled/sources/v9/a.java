package v9;

import ac.o;
import fc.d;
import pc.j;
import q8.f;
import s8.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements b {
    private final f _applicationService;
    private final w9.a _capturer;
    private final u9.a _locationManager;
    private final aa.a _prefs;
    private final e9.a _time;

    public a(f fVar, u9.a aVar, aa.a aVar2, w9.a aVar3, e9.a aVar4) {
        j.e(fVar, "_applicationService");
        j.e(aVar, "_locationManager");
        j.e(aVar2, "_prefs");
        j.e(aVar3, "_capturer");
        j.e(aVar4, "_time");
        this._applicationService = fVar;
        this._locationManager = aVar;
        this._prefs = aVar2;
        this._capturer = aVar3;
        this._time = aVar4;
    }

    @Override // s8.b
    public Object backgroundRun(d dVar) {
        this._capturer.captureLastLocation();
        return o.f277a;
    }

    @Override // s8.b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (y9.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
