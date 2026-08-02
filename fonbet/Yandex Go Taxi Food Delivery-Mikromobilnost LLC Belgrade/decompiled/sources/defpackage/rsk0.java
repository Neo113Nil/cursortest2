package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.road_events.RoadEventSession;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public final class rsk0 implements RoadEventSession.RoadEventListener {
    public final /* synthetic */ ba20 a;

    public rsk0(ba20 ba20Var) {
        this.a = ba20Var;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventSession.RoadEventListener
    public final void onRoadEventError(Error error) {
        this.a.error("roadEventsManager", "Error adding road event", error.toString());
    }

    @Override // com.yandex.mapkit.road_events.RoadEventSession.RoadEventListener
    public final void onRoadEventReceived(GeoObject geoObject) {
        this.a.success(null);
    }
}
