package com.gamericefishpro.space.oe;

import android.location.Location;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.qe.b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, com.gamericefishpro.space.ne.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.qe.a _controller;
    private final com.gamericefishpro.space.te.a _prefs;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final com.gamericefishpro.space.kd.a _time;
    private boolean locationCoarse;

    public a(f _applicationService, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.te.a _prefs, com.gamericefishpro.space.hh.b _propertiesModelStore, com.gamericefishpro.space.qe.a _controller) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_controller, "_controller");
        this._applicationService = _applicationService;
        this._time = _time;
        this._prefs = _prefs;
        this._propertiesModelStore = _propertiesModelStore;
        this._controller = _controller;
        _controller.subscribe(this);
    }

    private final void capture(Location location) {
        com.gamericefishpro.space.pe.a aVar = new com.gamericefishpro.space.pe.a();
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
        com.gamericefishpro.space.hh.a aVar2 = (com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel();
        aVar2.setLocationLongitude(aVar.getLog());
        aVar2.setLocationLatitude(aVar.getLat());
        aVar2.setLocationAccuracy(aVar.getAccuracy());
        aVar2.setLocationBackground(aVar.getBg());
        aVar2.setLocationType(aVar.getType());
        aVar2.setLocationTimestamp(aVar.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // com.gamericefishpro.space.ne.a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // com.gamericefishpro.space.ne.a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // com.gamericefishpro.space.qe.b
    public void onLocationChanged(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        com.gamericefishpro.space.od.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // com.gamericefishpro.space.ne.a
    public void setLocationCoarse(boolean z) {
        this.locationCoarse = z;
    }
}
