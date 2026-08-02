package defpackage;

import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import com.yandex.mapkit.road_events_layer.RoadEvent;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.mapkit.road_events_layer.RoadEventsLayerListener;

/* loaded from: classes7.dex */
public final class y511 extends q35 {
    public final /* synthetic */ int c = 0;
    public final fni0 d;
    public Object e;

    public y511(ssr ssrVar, h311 h311Var) {
        super(ssrVar, "transport_request_point_view_listener");
        this.d = h311Var;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                x511 x511Var = (x511) this.e;
                if (x511Var != null) {
                    ((NavigationLayer) ((h311) fni0Var).a).addRequestPointViewListener(x511Var);
                    this.e = null;
                    break;
                }
                break;
            default:
                psk0 psk0Var = (psk0) this.e;
                if (psk0Var != null) {
                    ((RoadEventsLayer) ((osk0) fni0Var).a).removeListener(psk0Var);
                    this.e = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                x511 x511Var = new x511(this);
                this.e = x511Var;
                ((NavigationLayer) ((h311) fni0Var).a).addRequestPointViewListener(x511Var);
                break;
            default:
                RoadEventsLayerListener roadEventsLayerListener = new RoadEventsLayerListener() { // from class: psk0
                    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayerListener
                    public final void onRoadEventPlacemarkTap(RoadEvent roadEvent) {
                        y511.this.c(new iik0(6, roadEvent));
                    }
                };
                this.e = roadEventsLayerListener;
                ((RoadEventsLayer) ((osk0) fni0Var).a).addListener(roadEventsLayerListener);
                break;
        }
    }

    public y511(ssr ssrVar, osk0 osk0Var) {
        super(ssrVar, "road_events_layer_listener");
        this.d = osk0Var;
    }
}
