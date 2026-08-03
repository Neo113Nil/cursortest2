package x9;

import android.location.Location;
import java.math.BigDecimal;
import java.math.RoundingMode;
import pc.j;
import q8.f;
import z9.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements b, w9.a {
    private final f _applicationService;
    private final z9.a _controller;
    private final aa.a _prefs;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final e9.a _time;
    private boolean locationCoarse;

    public a(f fVar, e9.a aVar, aa.a aVar2, com.onesignal.user.internal.properties.b bVar, z9.a aVar3) {
        j.e(fVar, "_applicationService");
        j.e(aVar, "_time");
        j.e(aVar2, "_prefs");
        j.e(bVar, "_propertiesModelStore");
        j.e(aVar3, "_controller");
        this._applicationService = fVar;
        this._time = aVar;
        this._prefs = aVar2;
        this._propertiesModelStore = bVar;
        this._controller = aVar3;
        aVar3.subscribe(this);
    }

    private final void capture(Location location) {
        y9.a aVar = new y9.a();
        aVar.setAccuracy(Float.valueOf(location.getAccuracy()));
        aVar.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        aVar.setType(getLocationCoarse() ? 0 : 1);
        aVar.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            aVar.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            aVar.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            aVar.setLat(Double.valueOf(location.getLatitude()));
            aVar.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar2 = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar2.setLocationLongitude(aVar.getLog());
        aVar2.setLocationLatitude(aVar.getLat());
        aVar2.setLocationAccuracy(aVar.getAccuracy());
        aVar2.setLocationBackground(aVar.getBg());
        aVar2.setLocationType(aVar.getType());
        aVar2.setLocationTimestamp(aVar.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // w9.a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // w9.a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // z9.b
    public void onLocationChanged(Location location) {
        j.e(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // w9.a
    public void setLocationCoarse(boolean z10) {
        this.locationCoarse = z10;
    }
}
