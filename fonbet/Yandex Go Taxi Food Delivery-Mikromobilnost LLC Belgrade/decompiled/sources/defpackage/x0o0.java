package defpackage;

import android.content.Context;
import com.yandex.mapkit.navigation.transport.layer.ConstructionStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.StyleProvider;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import kotlin.a;

/* loaded from: classes14.dex */
public final class x0o0 implements StyleProvider {
    public final i3y a;
    public final juo0 b;
    public final i3y c;

    public x0o0(Context context) {
        this.a = a.a(new kok0(context, 7));
        this.b = new juo0(context);
        this.c = a.a(new tmm0(24, this, context));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final BalloonImageProvider balloonImageProvider() {
        return ((TransportNavigationStyleProvider) this.a.getValue()).balloonImageProvider();
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final ConstructionStyleProvider constructionStyleProvider() {
        return ((TransportNavigationStyleProvider) this.a.getValue()).constructionStyleProvider();
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final RequestPointStyleProvider requestPointStyleProvider() {
        return new dy31(2);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final RouteViewStyleProvider routeViewStyleProvider() {
        return this.b;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public final UserLocationStyleProvider userLocationStyleProvider() {
        return (n6p0) this.c.getValue();
    }
}
