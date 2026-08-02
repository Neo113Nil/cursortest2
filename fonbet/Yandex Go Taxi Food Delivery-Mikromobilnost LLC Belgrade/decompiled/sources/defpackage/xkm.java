package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.navigator.driving.notification_camera.NotificationCameraView;
import com.yandex.go.navigator.driving.speedometer.SpeedGroupView;
import com.yandex.go.navigator.maneuver.UpcomingManeuverView;

/* loaded from: classes12.dex */
public final class xkm implements zo31 {
    public final GoConstraintLayout a;
    public final NotificationCameraView b;
    public final SpeedGroupView c;
    public final UpcomingManeuverView d;

    public xkm(GoConstraintLayout goConstraintLayout, NotificationCameraView notificationCameraView, SpeedGroupView speedGroupView, UpcomingManeuverView upcomingManeuverView) {
        this.a = goConstraintLayout;
        this.b = notificationCameraView;
        this.c = speedGroupView;
        this.d = upcomingManeuverView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
