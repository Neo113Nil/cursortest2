package ru.yandex.taxi.logistics.deliveries.map.search;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.tje;
import defpackage.wtg0;
import defpackage.xqg0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/deliveries/map/search/DeliveryPinLocationView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/PointF;", "anchor", "Lzy11;", "applyAnchor", "(Landroid/graphics/PointF;)V", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View;", "pin", "setPin", "(Landroid/view/View;)V", "setAnchorPoint", "pinV2BottomMargin", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/logistics/deliveries/map/search/DeliveryPinPointView;", "locationPoint", "Lru/yandex/taxi/logistics/deliveries/map/search/DeliveryPinPointView;", "lastAnchor", "Landroid/graphics/PointF;", "pinView", "Landroid/view/View;", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryPinLocationView extends LinearLayout {
    private PointF lastAnchor;
    private final DeliveryPinPointView locationPoint;
    private final int pinV2BottomMargin;
    private View pinView;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryPinLocationView(Context context) {
        super(context);
        this.pinV2BottomMargin = -tje.r(wtg0.anchored_pin_bottom_space, getContext());
        DeliveryPinPointView deliveryPinPointView = new DeliveryPinPointView(context, null, 2, 0 == true ? 1 : 0);
        this.locationPoint = deliveryPinPointView;
        this.lastAnchor = new PointF(0.0f, 0.0f);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(deliveryPinPointView, layoutParams);
    }

    private final void applyAnchor(PointF anchor) {
        View view = this.pinView;
        if (view == null || view.getMeasuredWidth() != 0) {
            setX(anchor.x - (getMeasuredWidth() / 2.0f));
            setY((this.locationPoint.getMeasuredHeight() / 2.0f) + (anchor.y - getMeasuredHeight()));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        setAnchorPoint(this.lastAnchor);
    }

    public final void setAnchorPoint(PointF anchor) {
        this.lastAnchor = anchor;
        applyAnchor(anchor);
    }

    public final void setPin(View pin) {
        View view = this.pinView;
        if (view != null) {
            removeView(view);
        }
        this.pinView = pin;
        if (pin != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = this.pinV2BottomMargin;
            addView(pin, 0, layoutParams);
        }
        this.locationPoint.setOutlineColor(getContext().getColor(xqg0.black_two));
        applyAnchor(this.lastAnchor);
    }
}
