package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class ytk extends zqh {
    public final MediaRouter.RouteInfo a;

    public ytk(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.zqh
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.zqh
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
