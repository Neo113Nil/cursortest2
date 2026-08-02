package d5;

import android.location.Location;
import c5.InterfaceC0554a;
import com.onesignal.user.internal.properties.b;
import e5.C4482a;
import f5.InterfaceC4520a;
import f5.InterfaceC4521b;
import g5.InterfaceC4534a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.h;
import x4.f;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4463a implements InterfaceC4521b, InterfaceC0554a {
    private final f _applicationService;
    private final InterfaceC4520a _controller;
    private final InterfaceC4534a _prefs;
    private final b _propertiesModelStore;
    private final K4.a _time;
    private boolean locationCoarse;

    public C4463a(f _applicationService, K4.a _time, InterfaceC4534a _prefs, b _propertiesModelStore, InterfaceC4520a _controller) {
        h.e(_applicationService, "_applicationService");
        h.e(_time, "_time");
        h.e(_prefs, "_prefs");
        h.e(_propertiesModelStore, "_propertiesModelStore");
        h.e(_controller, "_controller");
        this._applicationService = _applicationService;
        this._time = _time;
        this._prefs = _prefs;
        this._propertiesModelStore = _propertiesModelStore;
        this._controller = _controller;
        _controller.subscribe(this);
    }

    private final void capture(Location location) {
        C4482a c4482a = new C4482a();
        c4482a.setAccuracy(Float.valueOf(location.getAccuracy()));
        c4482a.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        c4482a.setType(getLocationCoarse() ? 0 : 1);
        c4482a.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            c4482a.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            c4482a.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            c4482a.setLat(Double.valueOf(location.getLatitude()));
            c4482a.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar.setLocationLongitude(c4482a.getLog());
        aVar.setLocationLatitude(c4482a.getLat());
        aVar.setLocationAccuracy(c4482a.getAccuracy());
        aVar.setLocationBackground(c4482a.getBg());
        aVar.setLocationType(c4482a.getType());
        aVar.setLocationTimestamp(c4482a.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // c5.InterfaceC0554a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // c5.InterfaceC0554a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // f5.InterfaceC4521b
    public void onLocationChanged(Location location) {
        h.e(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // c5.InterfaceC0554a
    public void setLocationCoarse(boolean z6) {
        this.locationCoarse = z6;
    }
}
