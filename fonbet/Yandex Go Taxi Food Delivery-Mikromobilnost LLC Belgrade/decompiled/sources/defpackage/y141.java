package defpackage;

import com.yandex.mapkit.navigation.transport.GuidanceListener;
import com.yandex.mapkit.navigation.transport.RouteChangeReason;
import java.util.Objects;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class y141 implements GuidanceListener {
    public final ist a = jst.e.A("WALKING_NAVIGATION:GUIDANCE_LISTENER");
    public final n0 b;
    public final eci0 c;
    public final n0 d;
    public final eci0 e;
    public final n0 f;
    public final eci0 g;
    public final n0 h;
    public final eci0 i;

    public y141() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        n0 b = ffx.b(0, 1, bufferOverflow);
        this.b = b;
        this.c = e.c(b);
        n0 b2 = ffx.b(0, 1, bufferOverflow);
        this.d = b2;
        this.e = e.c(b2);
        n0 b3 = ffx.b(0, 1, bufferOverflow);
        this.f = b3;
        this.g = e.c(b3);
        n0 b4 = ffx.b(0, 1, bufferOverflow);
        this.h = b4;
        this.i = e.c(b4);
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteChanged(RouteChangeReason routeChangeReason) {
        Objects.toString(routeChangeReason);
        this.a.getClass();
        this.d.g(routeChangeReason);
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteFinished() {
        this.a.getClass();
        this.f.g(zy11.a);
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteLost() {
        this.a.getClass();
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onGuidanceModeChanged() {
        this.a.getClass();
        this.h.g(zy11.a);
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onLocationChanged() {
        this.b.g(zy11.a);
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onReachedRequestPoint() {
        this.a.getClass();
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onReturnedToRoute() {
        this.a.getClass();
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onVehicleDetection(int i, String str) {
        this.a.getClass();
    }
}
