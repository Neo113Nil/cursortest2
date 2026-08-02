package defpackage;

import com.yandex.go.walking.navigation.impl.navigation_core.b;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class v541 {
    public final b a;
    public final ngl0 b;

    public v541(b bVar, ngl0 ngl0Var) {
        this.a = bVar;
        this.b = ngl0Var;
    }

    public final List a() {
        Navigation navigation = this.a.c;
        List<Route> routes = navigation != null ? navigation.getRoutes() : null;
        return routes == null ? EmptyList.a : routes;
    }
}
