package defpackage;

import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.NavigationListener;
import com.yandex.runtime.Error;
import kotlin.Result;
import ru.yandex.taxi.scooters.domain.model.ScootersUnableCreateRouteException;

/* loaded from: classes6.dex */
public final class vto0 implements NavigationListener {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ Navigation b;

    public vto0(j18 j18Var, Navigation navigation) {
        this.a = j18Var;
        this.b = navigation;
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onResetRoutes() {
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onRoutesBuilt() {
        this.a.resumeWith(this.b.getRoutes());
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onRoutingError(Error error) {
        this.a.resumeWith(new Result.Failure(new ScootersUnableCreateRouteException("Unable to get route from mapkit")));
    }
}
