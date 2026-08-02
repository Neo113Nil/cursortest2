package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.runtime.Error;
import java.util.Objects;

/* loaded from: classes12.dex */
public final class z521 implements EventInfoSession.EventInfoListener {
    public final /* synthetic */ j18 a;

    public z521(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession.EventInfoListener
    public final void onEventInfoError(Error error) {
        hst hstVar = jst.e;
        Objects.toString(error);
        hstVar.getClass();
        this.a.resumeWith(null);
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession.EventInfoListener
    public final void onEventInfoReceived(GeoObject geoObject) {
        this.a.resumeWith((RoadEventMetadata) geoObject.getMetadataContainer().getItem(RoadEventMetadata.class));
    }
}
