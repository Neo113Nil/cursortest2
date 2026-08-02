package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class prh extends MediaRouter.VolumeCallback {
    public final orh a;

    public prh(orh orhVar) {
        this.a = orhVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(routeInfo, i);
    }
}
