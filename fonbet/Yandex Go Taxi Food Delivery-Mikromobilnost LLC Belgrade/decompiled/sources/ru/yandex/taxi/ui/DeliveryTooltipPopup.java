package ru.yandex.taxi.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.eqh0;
import defpackage.uqs;
import kotlin.Metadata;
import ru.yandex.taxi.widget.TooltipView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/ui/DeliveryTooltipPopup;", "Landroid/widget/PopupWindow;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "anchor", "Lzy11;", "showAbove", "(Landroid/view/View;)V", "Lru/yandex/taxi/widget/TooltipView;", "tooltip", "Lru/yandex/taxi/widget/TooltipView;", "getTooltip", "()Lru/yandex/taxi/widget/TooltipView;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryTooltipPopup extends PopupWindow {
    private final TooltipView tooltip;

    public DeliveryTooltipPopup(ViewGroup viewGroup) {
        super(-2, -2);
        TooltipView tooltipView = (TooltipView) LayoutInflater.from(viewGroup.getContext()).inflate(eqh0.delivery_tooltip_popup, viewGroup, false);
        this.tooltip = tooltipView;
        setContentView(tooltipView);
    }

    public final TooltipView getTooltip() {
        return this.tooltip;
    }

    public final void showAbove(View anchor) {
        if (anchor.getVisibility() != 0 || isShowing()) {
            return;
        }
        OneShotPreDrawListener.add(anchor, new uqs(4, this, anchor));
    }
}
