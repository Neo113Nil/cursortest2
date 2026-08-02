package defpackage;

import com.yandex.mapkit.directions.Directions;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.transport.Transport;

/* loaded from: classes15.dex */
public final /* synthetic */ class xo5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j24 b;

    public /* synthetic */ xo5(j24 j24Var, int i) {
        this.a = i;
        this.b = j24Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j24 j24Var = this.b;
        switch (i) {
            case 0:
                j24Var.invoke(((Transport) obj).createBicycleRouterV2());
                break;
            case 1:
                j24Var.invoke(((Directions) obj).createDrivingRouter(DrivingRouterType.COMBINED));
                break;
            case 2:
                j24Var.invoke(((Transport) obj).createMasstransitInfoService());
                break;
            case 3:
                j24Var.invoke(((Transport) obj).createMasstransitRouter());
                break;
            case 4:
                j24Var.invoke(((Transport) obj).createPedestrianRouter());
                break;
            default:
                j24Var.invoke(((Transport) obj).createScooterRouter());
                break;
        }
        return zy11Var;
    }
}
