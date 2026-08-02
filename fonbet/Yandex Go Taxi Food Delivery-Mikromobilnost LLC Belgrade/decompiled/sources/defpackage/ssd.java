package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;
import com.yandex.mapkit.geometry.Point;
import java.util.function.BiConsumer;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.map_common.map.utils.PointEvaluator;

/* loaded from: classes5.dex */
public final /* synthetic */ class ssd implements BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ ssd(boolean z) {
        this.a = 5;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                DriverProfileModalView.animateHidePhoto$lambda$0((Integer) obj, (ViewGroup.LayoutParams) obj2);
                break;
            case 2:
                ((FullScreenBannerPage) obj2).setPlaybackResumed(false);
                break;
            case 3:
                ((FullScreenBannerPage) obj2).destroy();
                break;
            case 4:
                ((FullScreenBannerPage) obj2).horizontalScrollFinished();
                break;
            case 5:
                ((f4c0) obj).o((Point) obj2);
                break;
            default:
                f4c0 f4c0Var = (f4c0) obj;
                ValueAnimator ofObject = ValueAnimator.ofObject(new PointEvaluator(), (Point) f4c0Var.h, (Point) obj2);
                ofObject.addUpdateListener(new mt00(f4c0Var, 1));
                ofObject.start();
                break;
        }
    }

    public /* synthetic */ ssd(int i) {
        this.a = i;
    }
}
