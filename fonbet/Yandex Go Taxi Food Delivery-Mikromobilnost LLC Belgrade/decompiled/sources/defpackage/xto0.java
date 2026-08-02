package defpackage;

import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.scooters.presentation.route_navigation.navigation_style.a;

/* loaded from: classes6.dex */
public final class xto0 implements wto0 {
    public final /* synthetic */ yto0 a;

    public xto0(yto0 yto0Var) {
        this.a = yto0Var;
    }

    @Override // defpackage.wto0
    public final void e() {
        this.a.w.invoke();
    }

    @Override // defpackage.wto0
    public final void j5() {
        Camera camera;
        NavigationLayer navigationLayer = this.a.B;
        if (navigationLayer == null || (camera = navigationLayer.getCamera()) == null) {
            return;
        }
        CameraMode cameraMode = camera.cameraMode();
        CameraMode cameraMode2 = CameraMode.OVERVIEW;
        if (cameraMode == cameraMode2) {
            camera.setCameraMode(CameraMode.FREE, null);
        }
        camera.setCameraMode(cameraMode2, null);
    }

    @Override // defpackage.wto0
    public final void ma() {
        NavigationLayer navigationLayer = this.a.B;
        if (navigationLayer != null) {
            navigationLayer.setShowRequestPoints(false);
        }
    }

    @Override // defpackage.wto0
    public final void n5() {
        this.a.c.invoke();
    }

    @Override // defpackage.wto0
    public final void p9() {
        Camera camera;
        NavigationLayer navigationLayer = this.a.B;
        if (navigationLayer == null || (camera = navigationLayer.getCamera()) == null) {
            return;
        }
        CameraMode cameraMode = camera.cameraMode();
        CameraMode cameraMode2 = CameraMode.FOLLOWING;
        if (cameraMode == cameraMode2) {
            camera.setCameraMode(CameraMode.FREE, null);
        }
        camera.setCameraMode(cameraMode2, null);
    }

    @Override // defpackage.wto0
    public final void yg(Navigation navigation) {
        yto0 yto0Var = this.a;
        TaxiMapView h = ((gh00) ((ah00) yto0Var.b)).h();
        if (h != null) {
            w0o0 w0o0Var = yto0Var.z;
            new a((el00) w0o0Var.a.a.get(), h.getContext()).b(new zdk0(29, yto0Var, h, navigation), true);
        }
    }
}
