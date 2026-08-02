package ru.yandex.taxi.tooltips;

import android.view.View;
import android.widget.PopupWindow;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.g18;
import defpackage.gb5;
import defpackage.jst;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.TooltipPointerDrawer$PointerGravity;
import ru.yandex.taxi.widget.TooltipView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH&¢\u0006\u0004\b(\u0010\u001dJ\u000f\u0010)\u001a\u00020\rH\u0017¢\u0006\u0004\b)\u0010\u001dJ\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/taxi/tooltips/BaseSummaryTooltipPopup;", "Landroid/widget/PopupWindow;", "Lru/yandex/taxi/widget/TooltipView;", "tooltip", "", "text", "<init>", "(Lru/yandex/taxi/widget/TooltipView;Ljava/lang/String;)V", "Landroid/view/View;", "anchorView", "", "horizontalOffset", "verticalOffset", "Lzy11;", "showAbove", "(Landroid/view/View;II)V", "tooltipView", "resolveHorizontalAnchorOffset", "(Landroid/view/View;Landroid/view/View;)I", "setAnchorView", "(Landroid/view/View;)V", "offset", "setTooltipPointerOffset", "(I)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(F)V", "updateAnchorPosition", "()V", "setHorizontalOffset", "setVerticalOffset", "Lru/yandex/taxi/tooltips/SummaryTooltipAlignment;", "anchorAlignment", "setAnchorAlignment", "(Lru/yandex/taxi/tooltips/SummaryTooltipAlignment;)V", "Lru/yandex/taxi/widget/TooltipPointerDrawer$PointerGravity;", "gravity", "setPointerGravity", "(Lru/yandex/taxi/widget/TooltipPointerDrawer$PointerGravity;)V", "attach", "detach", "asView", "()Landroid/view/View;", "Lru/yandex/taxi/widget/TooltipView;", "Landroid/view/View;", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/tooltips/SummaryTooltipAlignment;", "Lg18;", "anchorPreDrawCancellable", "Lg18;", "fb5", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSummaryTooltipPopup extends PopupWindow {
    private SummaryTooltipAlignment anchorAlignment;
    private g18 anchorPreDrawCancellable;
    private View anchorView;
    private int horizontalOffset;
    private final TooltipView tooltip;
    private int verticalOffset;

    public BaseSummaryTooltipPopup(TooltipView tooltipView, String str) {
        super(tooltipView, -2, -2);
        this.tooltip = tooltipView;
        this.anchorAlignment = SummaryTooltipAlignment.CENTER;
        this.anchorPreDrawCancellable = g18.u1;
        tooltipView.setText(str);
    }

    private final int resolveHorizontalAnchorOffset(View anchorView, View tooltipView) {
        int i = gb5.a[this.anchorAlignment.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return (anchorView.getWidth() - tooltipView.getMeasuredWidth()) / 2;
        }
        return anchorView.getWidth() + (-tooltipView.getMeasuredWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAbove(View anchorView, int horizontalOffset, int verticalOffset) {
        try {
            this.tooltip.measure(0, 0);
            showAsDropDown(anchorView, resolveHorizontalAnchorOffset(anchorView, this.tooltip) + horizontalOffset, ((-anchorView.getHeight()) - this.tooltip.getMeasuredHeight()) + verticalOffset);
        } catch (Exception e) {
            jst.e.k(e, "Cannot show tooltip view");
        }
    }

    public final View asView() {
        return this.tooltip;
    }

    public abstract void attach();

    public void detach() {
        this.anchorPreDrawCancellable.cancel();
    }

    public void setAlpha(float alpha) {
        this.tooltip.setAlpha(alpha);
    }

    public final void setAnchorAlignment(SummaryTooltipAlignment anchorAlignment) {
        this.anchorAlignment = anchorAlignment;
    }

    public final void setAnchorView(View anchorView) {
        this.anchorView = anchorView;
    }

    public final void setHorizontalOffset(int offset) {
        this.horizontalOffset = offset;
    }

    public final void setPointerGravity(TooltipPointerDrawer$PointerGravity gravity) {
        this.tooltip.setPointerGravity(gravity);
    }

    public final void setTooltipPointerOffset(int offset) {
        this.tooltip.setPointerOffset(offset);
    }

    public final void setVerticalOffset(int offset) {
        this.verticalOffset = offset;
    }

    public final void updateAnchorPosition() {
        update(this.anchorView, getWidth(), getHeight());
    }
}
