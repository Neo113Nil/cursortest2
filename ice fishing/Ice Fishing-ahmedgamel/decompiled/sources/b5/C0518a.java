package b5;

import a5.InterfaceC0437a;
import c5.InterfaceC0543a;
import com.onesignal.debug.internal.logging.b;
import g5.InterfaceC4530a;
import kotlin.jvm.internal.h;
import u7.v;
import x4.f;
import z4.InterfaceC5261b;
import z7.InterfaceC5267d;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0518a implements InterfaceC5261b {
    private final f _applicationService;
    private final InterfaceC0543a _capturer;
    private final InterfaceC0437a _locationManager;
    private final InterfaceC4530a _prefs;
    private final K4.a _time;

    public C0518a(f _applicationService, InterfaceC0437a _locationManager, InterfaceC4530a _prefs, InterfaceC0543a _capturer, K4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_locationManager, "_locationManager");
        h.e(_prefs, "_prefs");
        h.e(_capturer, "_capturer");
        h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // z4.InterfaceC5261b
    public Object backgroundRun(InterfaceC5267d interfaceC5267d) {
        this._capturer.captureLastLocation();
        return v.f41353a;
    }

    @Override // z4.InterfaceC5261b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (e5.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
