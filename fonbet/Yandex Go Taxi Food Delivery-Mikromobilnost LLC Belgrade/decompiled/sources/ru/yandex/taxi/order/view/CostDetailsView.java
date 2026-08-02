package ru.yandex.taxi.order.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.kdc;
import defpackage.lye;
import defpackage.ny61;
import defpackage.zrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/order/view/CostDetailsView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "name", "amount", "Lzy11;", "setData", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Lkdc;", "nameTextColor", "amountTextColor", "setTextColor", "(Lkdc;Lkdc;)V", "", "nameTextSizeSp", "amountTextSizeSp", "setTextSize", "(FF)V", "", "dotsPattern", "setDotsPattern", "(Ljava/lang/String;)V", "Llye;", "binding", "Llye;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CostDetailsView extends RelativeLayout {
    public static final int $stable = 8;
    private final lye binding;

    public CostDetailsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(zrh0.cost_details_view, this);
        int i3 = agh0.amount;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
        if (robotoTextView != null) {
            i3 = agh0.dots;
            DotsView dotsView = (DotsView) cma1.O(i3, this);
            if (dotsView != null) {
                i3 = agh0.name;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, this);
                if (robotoTextView2 != null) {
                    this.binding = new lye(this, robotoTextView, dotsView, robotoTextView2);
                    setScreenReaderFocusable(true);
                    setFocusable(true);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    public final void setData(CharSequence name, CharSequence amount) {
        this.binding.d.setText(name);
        this.binding.b.setText(amount);
        setContentDescription(((Object) name) + " " + ((Object) amount));
        requestLayout();
    }

    public final void setDotsPattern(String dotsPattern) {
        this.binding.c.setDotsPattern(dotsPattern);
        requestLayout();
    }

    public final void setTextColor(kdc nameTextColor, kdc amountTextColor) {
        this.binding.d.setTextColor(nameTextColor);
        this.binding.b.setTextColor(amountTextColor);
    }

    public final void setTextSize(float nameTextSizeSp, float amountTextSizeSp) {
        this.binding.d.setTextSize(nameTextSizeSp);
        this.binding.b.setTextSize(amountTextSizeSp);
        requestLayout();
    }

    public CostDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CostDetailsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CostDetailsView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CostDetailsView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
