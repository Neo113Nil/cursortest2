package defpackage;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public final class ssk0 implements EventInfoSession.EventInfoListener {
    public final /* synthetic */ ba20 a;

    public ssk0(ba20 ba20Var) {
        this.a = ba20Var;
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession.EventInfoListener
    public final void onEventInfoError(Error error) {
        this.a.error("roadEventsManager", "Error getting info", error.toString());
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession.EventInfoListener
    public final void onEventInfoReceived(GeoObject geoObject) {
        RoadEventMetadata roadEventMetadata = (RoadEventMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(RoadEventMetadata.class));
        ba20 ba20Var = this.a;
        if (roadEventMetadata != null) {
            ba20Var.success(rsq0.l(roadEventMetadata));
        } else {
            ba20Var.success(null);
        }
    }
}
