package defpackage;

import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.transport.Navigation;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final /* synthetic */ class t211 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v211 b;
    public final /* synthetic */ u211 c;

    public /* synthetic */ t211(v211 v211Var, u211 u211Var, int i) {
        this.a = i;
        this.b = v211Var;
        this.c = u211Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Location location;
        int i = this.a;
        u211 u211Var = this.c;
        v211 v211Var = this.b;
        switch (i) {
            case 0:
                v211Var.c(new t211(v211Var, u211Var, 1));
                return zy11.a;
            default:
                Location location2 = ((Navigation) v211Var.c.a).getGuidance().getLocation();
                if (location2 == null || ((location = u211Var.a.f) != null && location.getPosition().getLatitude() == location2.getPosition().getLatitude() && location.getPosition().getLongitude() == location2.getPosition().getLongitude() && jl40.i(location.getHeading(), location2.getHeading()) && jl40.i(location.getSpeed(), location2.getSpeed()))) {
                    return null;
                }
                v211Var.f = location2;
                return b.i(new Pair("type", "onLocationChanged"), new Pair("location", rsq0.g(location2)));
        }
    }
}
