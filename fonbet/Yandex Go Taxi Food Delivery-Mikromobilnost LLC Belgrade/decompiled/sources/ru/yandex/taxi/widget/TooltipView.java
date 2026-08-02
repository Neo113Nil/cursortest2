package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.g4i0;
import defpackage.sa90;
import defpackage.zrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/widget/TooltipView;", "Lru/yandex/taxi/widget/TooltipFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "initAttrs", "(Landroid/util/AttributeSet;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "textColor", "setTooltipTextColor", "(I)V", "show", "()V", "hide", "maxLines", "setMaxLines", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/widget/TextView;", "tooltipView", "Landroid/widget/TextView;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipView extends TooltipFrameLayout {
    public static final int $stable = 8;
    private final TextView tooltipView;

    public TooltipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tooltipView = (TextView) LayoutInflater.from(context).inflate(zrh0.tooltip_view, this).findViewById(agh0.tooltip_view);
        initAttrs(attributeSet);
    }

    private final void initAttrs(AttributeSet attrs) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, g4i0.TooltipView, 0, 0);
        try {
            this.tooltipView.setBackgroundResource(obtainStyledAttributes.getResourceId(g4i0.TooltipView_body, f1h0.tooltip_black));
            String string = obtainStyledAttributes.getString(g4i0.TooltipView_text);
            if (string != null) {
                setText(string);
            }
            setTooltipTextColor(obtainStyledAttributes.getColor(g4i0.TooltipView_text_color, -1));
            this.tooltipView.setElevation(obtainStyledAttributes.getDimensionPixelSize(g4i0.TooltipView_tooltip_elevation, 0));
            int i = obtainStyledAttributes.getInt(g4i0.TooltipView_maxLines, 0);
            if (i > 0) {
                setMaxLines(i);
            }
            int i2 = obtainStyledAttributes.getInt(g4i0.TooltipView_lines, 0);
            if (i2 > 0) {
                this.tooltipView.setLines(i2);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g4i0.TooltipView_tooltip_max_width, 0);
            if (dimensionPixelSize > 0) {
                this.tooltipView.setMaxWidth(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final CharSequence getText() {
        return this.tooltipView.getText();
    }

    public final void hide() {
        cma1.L(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        sa90 measurePointerPaddings = measurePointerPaddings();
        Integer num = (Integer) measurePointerPaddings.a;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) measurePointerPaddings.b;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        this.tooltipView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec) - intValue2, widthMeasureSpec), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec) - intValue, heightMeasureSpec));
        setMeasuredDimension(View.resolveSize(getPaddingEnd() + getPaddingStart() + this.tooltipView.getMeasuredWidth() + intValue2, widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + this.tooltipView.getMeasuredHeight() + intValue, heightMeasureSpec));
    }

    public final void setMaxLines(int maxLines) {
        this.tooltipView.setMaxLines(maxLines);
    }

    public final void setText(CharSequence text) {
        this.tooltipView.setText(text);
    }

    public final void setTooltipTextColor(int textColor) {
        this.tooltipView.setTextColor(textColor);
    }

    public final void show() {
        cma1.J(this);
    }

    public TooltipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TooltipView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TooltipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
