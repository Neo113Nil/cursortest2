package d5;

import android.location.Location;
import c5.InterfaceC0543a;
import com.onesignal.user.internal.properties.b;
import e5.C4465a;
import f5.InterfaceC4510a;
import f5.InterfaceC4511b;
import g5.InterfaceC4530a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.h;
import x4.f;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4452a implements InterfaceC4511b, InterfaceC0543a {
    private final f _applicationService;
    private final InterfaceC4510a _controller;
    private final InterfaceC4530a _prefs;
    private final b _propertiesModelStore;
    private final K4.a _time;
    private boolean locationCoarse;

    public C4452a(f _applicationService, K4.a _time, InterfaceC4530a _prefs, b _propertiesModelStore, InterfaceC4510a _controller) {
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
        C4465a c4465a = new C4465a();
        c4465a.setAccuracy(Float.valueOf(location.getAccuracy()));
        c4465a.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        c4465a.setType(getLocationCoarse() ? 0 : 1);
        c4465a.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            c4465a.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            c4465a.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            c4465a.setLat(Double.valueOf(location.getLatitude()));
            c4465a.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar.setLocationLongitude(c4465a.getLog());
        aVar.setLocationLatitude(c4465a.getLat());
        aVar.setLocationAccuracy(c4465a.getAccuracy());
        aVar.setLocationBackground(c4465a.getBg());
        aVar.setLocationType(c4465a.getType());
        aVar.setLocationTimestamp(c4465a.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // c5.InterfaceC0543a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // c5.InterfaceC0543a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // f5.InterfaceC4511b
    public void onLocationChanged(Location location) {
        h.e(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // c5.InterfaceC0543a
    public void setLocationCoarse(boolean z3) {
        this.locationCoarse = z3;
    }
}
