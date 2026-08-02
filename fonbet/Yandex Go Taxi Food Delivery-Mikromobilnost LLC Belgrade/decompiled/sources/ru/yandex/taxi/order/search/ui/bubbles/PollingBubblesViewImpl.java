package ru.yandex.taxi.order.search.ui.bubbles;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.search.ui.bubbles.CarPollingBubbleView;
import com.yandex.mapkit.ScreenPoint;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.zkh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/order/search/ui/bubbles/PollingBubblesViewImpl;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mapkit/ScreenPoint;", IssuingDistributionPointExtension.POINT, "Lzy11;", "animateBubbleAppearingAt", "(Lcom/yandex/mapkit/ScreenPoint;)V", "screenPoint", "translateAt", "animateBubbleDisappear", "()V", "hidePollingBubble", "Lcom/yandex/go/taxi/order/search/ui/bubbles/CarPollingBubbleView;", "carPollingBubbleView", "Lcom/yandex/go/taxi/order/search/ui/bubbles/CarPollingBubbleView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PollingBubblesViewImpl extends FrameLayout {
    public static final int $stable = 8;
    private final CarPollingBubbleView carPollingBubbleView;

    public PollingBubblesViewImpl(Context context) {
        super(context);
        c.q(this, zkh0.polling_bubbles_view, true);
        int i = p8h0.car_polling_bubbles;
        WeakHashMap weakHashMap = b.a;
        this.carPollingBubbleView = (CarPollingBubbleView) ((View) rp31.d(this, i));
    }

    public void animateBubbleAppearingAt(ScreenPoint point) {
        this.carPollingBubbleView.animateBubbleAppearAt(point);
    }

    public void animateBubbleDisappear() {
        this.carPollingBubbleView.animateBubbleDisappear();
    }

    public void hidePollingBubble() {
        this.carPollingBubbleView.hidePollingBubble();
    }

    public void translateAt(ScreenPoint screenPoint) {
        this.carPollingBubbleView.translateAt(screenPoint);
    }
}
