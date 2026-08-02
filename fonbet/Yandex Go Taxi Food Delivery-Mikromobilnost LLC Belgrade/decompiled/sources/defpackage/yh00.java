package defpackage;

import com.yandex.go.coroutines.g;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.navigator.ui.b;
import com.yandex.go.places.impl.ui.discovery.map.d;
import com.yandex.go.places.impl.ui.organizations.map.overlay.c;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import com.yandex.mapkit.navigation.automotive.layer.RouteView;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.main.ui.overlay.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class yh00 implements hr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yh00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hr7
    public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        RouteView selectedRoute;
        List<BalloonView> balloonViews;
        Camera camera;
        c cVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((x6f0) ((y6f0) obj)).d(new nso(vj91.c(((gh00) ((com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.c) obj2).d).e.a()), cameraUpdateReason));
                break;
            case 1:
                a.a((a) obj2, (qfu0) obj, cameraPosition.getZoom());
                break;
            case 2:
                b bVar = (b) obj2;
                dd50 dd50Var = bVar.w;
                ad50 ad50Var = (ad50) obj;
                if (z) {
                    NavigationLayer navigationLayer = bVar.I;
                    if (((navigationLayer == null || (camera = navigationLayer.getCamera()) == null) ? null : camera.cameraMode()) != CameraMode.FOLLOWING && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                        float j = ((gh00) ((ah00) bVar.b)).j();
                        if (Math.abs(j - dd50Var.P) > 0.3f) {
                            if (j == -1.0f) {
                                dd50Var.P = j;
                            }
                            float f = dd50Var.P;
                            com.yandex.go.navigator.analitycs.a aVar = dd50Var.K;
                            if (j > f) {
                                aVar.k();
                            } else {
                                aVar.l();
                            }
                            dd50Var.P = j;
                        }
                    }
                }
                boolean z2 = true;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    dd50Var.y.a(FocusMode.FREE);
                    o oVar = dd50Var.C;
                    oVar.a.b.b();
                    r0 r0Var = oVar.d;
                    Boolean bool = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    if (z) {
                        o oVar2 = dd50Var.C;
                        long timerTimeoutMs = oVar2.b.getTimerTimeoutMs();
                        ho21 ho21Var = oVar2.a;
                        if (oVar2.c) {
                            oVar2.c = false;
                            ho21Var.a = true;
                        }
                        g gVar = ho21Var.b;
                        if (ho21Var.a) {
                            gVar.b();
                            gVar.a(timerTimeoutMs);
                        }
                        r0 r0Var2 = oVar2.d;
                        Boolean bool2 = Boolean.TRUE;
                        r0Var2.getClass();
                        r0Var2.m(null, bool2);
                    }
                }
                b bVar2 = ad50Var.b;
                NavigationLayer navigationLayer2 = bVar2.I;
                if (navigationLayer2 != null && (selectedRoute = navigationLayer2.selectedRoute()) != null && (balloonViews = selectedRoute.getBalloonViews()) != null) {
                    List<BalloonView> list = balloonViews;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (BalloonView balloonView : list) {
                            boolean z3 = balloonView.getBalloon().getManoeuvre() != null;
                            boolean z4 = balloonView.getBalloon().getManoeuvreWithLaneSign() != null;
                            if (z3 || z4) {
                                if (balloonView.isIsVisible()) {
                                    qv10.B(z2, bVar2.w.A.a, null);
                                    break;
                                }
                            }
                        }
                    }
                }
                z2 = false;
                qv10.B(z2, bVar2.w.A.a, null);
                break;
            case 3:
                do80 do80Var = (do80) obj2;
                ah00 ah00Var = (ah00) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES && (cVar = do80Var.D) != null) {
                    VisibleRegion a = ((gh00) ah00Var).e.a();
                    float j2 = ((gh00) ah00Var).j();
                    if (!cVar.F) {
                        cVar.A.c(j2, ru.yandex.taxi.map.utils.a.D(a));
                        break;
                    }
                }
                break;
            case 4:
                ah00 ah00Var2 = (ah00) obj;
                d dVar = ((k7c0) obj2).c;
                VisibleRegion a2 = ((gh00) ah00Var2).e.a();
                float j3 = ((gh00) ah00Var2).j();
                r0 r0Var3 = dVar.P.f;
                r6c0 r6c0Var = new r6c0(a2, j3);
                r0Var3.getClass();
                r0Var3.m(null, r6c0Var);
                break;
            default:
                ah00 ah00Var3 = (ah00) obj2;
                y6f0 y6f0Var = (y6f0) obj;
                if (z && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    float azimuth = cameraPosition.getAzimuth();
                    if (azimuth != 0.0f) {
                        if (350.0f <= azimuth || azimuth <= 10.0f) {
                            ((gh00) ah00Var3).w();
                            ((x6f0) y6f0Var).d(zy11.a);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
