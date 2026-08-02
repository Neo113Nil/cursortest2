package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* loaded from: classes.dex */
public final class fph extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ kph a;

    public fph(kph kphVar) {
        this.a = kphVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.m(routingController);
    }
}
