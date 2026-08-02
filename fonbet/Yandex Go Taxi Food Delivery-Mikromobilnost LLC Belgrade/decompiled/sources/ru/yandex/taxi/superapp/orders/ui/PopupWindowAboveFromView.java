package ru.yandex.taxi.superapp.orders.ui;

import android.view.View;
import android.widget.PopupWindow;
import defpackage.xw31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/superapp/orders/ui/PopupWindowAboveFromView;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "popup", "<init>", "(Landroid/view/View;)V", "from", "", "offsetX", "offsetY", "gravity", "Lzy11;", "showFromAbove", "(Landroid/view/View;III)V", "Landroid/view/View;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopupWindowAboveFromView extends PopupWindow {
    private final View popup;

    public PopupWindowAboveFromView(View view) {
        super(view, -2, -2);
        this.popup = view;
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public static /* synthetic */ void showFromAbove$default(PopupWindowAboveFromView popupWindowAboveFromView, View view, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        popupWindowAboveFromView.showFromAbove(view, i, i2, i3);
    }

    public final void showFromAbove(View from, int offsetX, int offsetY, int gravity) {
        this.popup.measure(0, 0);
        int[] iArr = new int[2];
        from.getLocationOnScreen(iArr);
        if (xw31.k(from.getContext())) {
            showAtLocation(from, gravity, (iArr[0] + offsetX) - from.getWidth(), (iArr[1] - this.popup.getMeasuredHeight()) + offsetY);
        } else {
            showAtLocation(from, gravity, iArr[0], (iArr[1] - this.popup.getMeasuredHeight()) + offsetY);
        }
    }
}
