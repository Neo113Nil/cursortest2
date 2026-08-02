package defpackage;

import com.yandex.mapkit.navigation.transport.NavigationListener;
import com.yandex.runtime.Error;
import java.util.Objects;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class s541 implements NavigationListener {
    public final ist a = jst.e.A("WALKING_NAVIGATION:NAVIGATION_LISTENER");
    public final n0 b;
    public final eci0 c;
    public final n0 d;
    public final eci0 e;
    public final n0 f;

    public s541() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        n0 b = ffx.b(0, 1, bufferOverflow);
        this.b = b;
        this.c = e.c(b);
        n0 b2 = ffx.b(0, 1, bufferOverflow);
        this.d = b2;
        this.e = e.c(b2);
        this.f = ffx.b(0, 1, bufferOverflow);
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onResetRoutes() {
        this.a.getClass();
        this.f.g(zy11.a);
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onRoutesBuilt() {
        this.a.getClass();
        this.b.g(zy11.a);
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onRoutingError(Error error) {
        Objects.toString(error);
        this.a.getClass();
        this.d.g(error);
    }
}
