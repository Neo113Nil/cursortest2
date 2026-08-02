package ru.yandex.taxi.mapoverlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.sa90;
import defpackage.sfh0;
import defpackage.urh0;
import defpackage.xip;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.TooltipFrameLayout;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/mapoverlay/AddToFavoritesOverlayTooltipView;", "Lru/yandex/taxi/widget/TooltipFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Lzy11;", "setText", "(Ljava/lang/String;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lxip;", "binding", "Lxip;", "Landroid/widget/LinearLayout;", "tooltipRootView", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/widget/RobotoTextView;", "tooltipText", "Lru/yandex/taxi/widget/RobotoTextView;", "suggestedfavorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddToFavoritesOverlayTooltipView extends TooltipFrameLayout {
    private final xip binding;
    private final LinearLayout tooltipRootView;
    private final RobotoTextView tooltipText;

    public AddToFavoritesOverlayTooltipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(urh0.favorites_overlay_tooltip_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = sfh0.tooltip_text;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
        if (robotoTextView == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.binding = new xip(linearLayout, robotoTextView);
        this.tooltipRootView = linearLayout;
        this.tooltipText = robotoTextView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        sa90 measurePointerPaddings = measurePointerPaddings();
        Integer num = (Integer) measurePointerPaddings.a;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) measurePointerPaddings.b;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        this.tooltipRootView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec) - intValue2, widthMeasureSpec), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec) - intValue, heightMeasureSpec));
        setMeasuredDimension(View.resolveSize(getPaddingEnd() + getPaddingStart() + this.tooltipRootView.getMeasuredWidth() + intValue2, widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + this.tooltipRootView.getMeasuredHeight() + intValue, heightMeasureSpec));
    }

    public final void setText(String text) {
        this.tooltipText.setText(text);
    }

    public AddToFavoritesOverlayTooltipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AddToFavoritesOverlayTooltipView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AddToFavoritesOverlayTooltipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
