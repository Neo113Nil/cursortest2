package defpackage;

import com.yandex.go.navigator.ui.b;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;

/* loaded from: classes12.dex */
public final class zc50 extends zcs0 {
    public final /* synthetic */ b a;

    public zc50(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.zcs0, com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener
    public final void onBalloonViewTap(BalloonView balloonView) {
        Balloon balloon = balloonView.getBalloon();
        if (balloon.getAlternative() == null && balloon.getRouteSummary() == null) {
            return;
        }
        dd50 dd50Var = this.a.w;
        dd50Var.F.a(balloonView.getHostRoute());
    }

    @Override // defpackage.zcs0, com.yandex.mapkit.navigation.automotive.layer.BalloonViewListener
    public final void onBalloonVisibilityChanged(BalloonView balloonView) {
        b bVar = this.a;
        NavigationLayer navigationLayer = bVar.I;
        if ((navigationLayer != null ? navigationLayer.getMode() : null) != NavigationLayerMode.GUIDANCE) {
            return;
        }
        if (balloonView.getBalloon().getManoeuvre() == null && balloonView.getBalloon().getManoeuvreWithLaneSign() == null) {
            return;
        }
        qv10.B(balloonView.isIsVisible(), bVar.w.A.a, null);
    }
}
