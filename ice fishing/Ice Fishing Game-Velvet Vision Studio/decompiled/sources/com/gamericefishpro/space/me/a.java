package com.gamericefishpro.space.me;

import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.pc.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private final f _applicationService;
    private final com.gamericefishpro.space.ne.a _capturer;
    private final com.gamericefishpro.space.ke.a _locationManager;
    private final com.gamericefishpro.space.te.a _prefs;
    private final com.gamericefishpro.space.kd.a _time;

    public a(f _applicationService, com.gamericefishpro.space.ke.a _locationManager, com.gamericefishpro.space.te.a _prefs, com.gamericefishpro.space.ne.a _capturer, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // com.gamericefishpro.space.pc.b
    public Object backgroundRun(com.gamericefishpro.space.th.a aVar) {
        this._capturer.captureLastLocation();
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.pc.b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            com.gamericefishpro.space.od.b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (com.gamericefishpro.space.pe.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        com.gamericefishpro.space.od.b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
