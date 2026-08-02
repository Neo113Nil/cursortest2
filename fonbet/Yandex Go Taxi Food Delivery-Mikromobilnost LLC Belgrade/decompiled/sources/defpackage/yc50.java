package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lyc50;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface yc50 extends l050 {
    void B5();

    void V0(CameraMode cameraMode);

    void ga(Navigation navigation);

    void j2();

    void q6(boolean z);

    void refreshStyle();

    void selectRoadEvent(String str);

    void v1(DrivingRoute drivingRoute);
}
