package defpackage;

import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.mapkit.map.Map;

/* loaded from: classes12.dex */
public final /* synthetic */ class sl00 implements Map.CameraCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ sl00(int i) {
        this.a = i;
    }

    private final void a(boolean z) {
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public final void onMoveFinished(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                RateRouteModalView.adjustZoom$lambda$0(z);
                break;
        }
    }
}
