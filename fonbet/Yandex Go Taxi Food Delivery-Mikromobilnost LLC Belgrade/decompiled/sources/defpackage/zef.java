package defpackage;

import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.a;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$OpenReason;

/* loaded from: classes6.dex */
public final /* synthetic */ class zef implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzs b;

    public /* synthetic */ zef(int i, zzs zzsVar) {
        this.a = i;
        this.b = zzsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        zzs zzsVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((fff) obj).a.Q(zzsVar, true);
                break;
            case 1:
                ((l6o0) obj).a.Q(new ken0(zzsVar));
                break;
            case 2:
                ((gym0) obj).a.r(new zef(i2, zzsVar));
                break;
            case 3:
                iym0 iym0Var = ((gym0) obj).a;
                iym0Var.z((m950) iym0Var.E.get(), new hym0(iym0Var, new tmm0(6, iym0Var, zzsVar), 0));
                break;
            case 4:
                han0 han0Var = (han0) obj;
                a aVar = han0Var.a;
                int i4 = 4;
                dpf dpfVar = new dpf(i4, aVar, han0Var.b, han0Var.c, han0Var.x, han0Var.y, han0Var.w);
                m950 m950Var = (m950) aVar.D.get();
                ParkingCardOpenReason parkingCardOpenReason = ParkingCardOpenReason.CAMERA_ON_COMPLETION;
                ParkingButtonAction parkingButtonAction = ParkingButtonAction.BUILD_ROUTE;
                Integer valueOf = Integer.valueOf(kyh0.scooters_parking_pano_build_route);
                zzs zzsVar2 = this.b;
                aVar.A(m950Var, new tbo0(zzsVar2, true, parkingCardOpenReason, parkingButtonAction, valueOf), new jan0(aVar, zzsVar2, dpfVar, i3));
                break;
            default:
                egn0 egn0Var = (egn0) obj;
                ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason = ScootersRouteNavigationAnalytics$OpenReason.PARKING_PANORAMA;
                egn0Var.w.invoke();
                egn0Var.y.V.a(new kwo0(zzsVar, scootersRouteNavigationAnalytics$OpenReason, egn0Var.x, null));
                break;
        }
        return zy11Var;
    }
}
