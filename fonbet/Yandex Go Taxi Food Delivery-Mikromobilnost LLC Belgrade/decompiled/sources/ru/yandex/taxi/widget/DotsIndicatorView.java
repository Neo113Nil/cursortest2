package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.g4i0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.usg0;
import defpackage.xqg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/widget/DotsIndicatorView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "count", "selected", "Lzy11;", "inflateDots", "(II)V", "setDotsCount", "(I)V", "position", "setIndicator", "dotColor", "selectedDotColor", "setDotColors", "Landroid/graphics/drawable/Drawable;", "icon", "Landroid/graphics/drawable/Drawable;", "iconSelected", "iconColor", CA20Status.STATUS_USER_I, "iconSelectedColor", "dotsPadding", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DotsIndicatorView extends LinearLayout {
    public static final int $stable = 8;
    private final int dotsPadding;
    private Drawable icon;
    private int iconColor;
    private Drawable iconSelected;
    private int iconSelectedColor;
    private int selected;

    public DotsIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconColor = context.getColor(xqg0.transparent_40_white);
        this.iconSelectedColor = context.getColor(xqg0.white);
        this.dotsPadding = tje.r(usg0.dots_indicator_padding, getContext());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g4i0.DotsIndicatorView, i, 0);
        try {
            this.selected = obtainStyledAttributes.getInt(g4i0.DotsIndicatorView_selectedDot, 0);
            int i2 = obtainStyledAttributes.getInt(g4i0.DotsIndicatorView_dotsCount, 0);
            if (this.selected >= i2) {
                this.selected = -1;
            }
            this.iconColor = obtainStyledAttributes.getColor(g4i0.DotsIndicatorView_dotIconColor, this.iconColor);
            this.iconSelectedColor = obtainStyledAttributes.getColor(g4i0.DotsIndicatorView_selectedDotIconColor, this.iconSelectedColor);
            obtainStyledAttributes.recycle();
            int i3 = this.iconColor;
            int v = tje.v(getContext(), 6.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(i3);
            gradientDrawable.setSize(v, v);
            this.icon = gradientDrawable;
            int i4 = this.iconSelectedColor;
            int dimensionPixelSize = getResources().getDimensionPixelSize(mrg0.go_design_s_space);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(i4);
            gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize);
            this.iconSelected = gradientDrawable2;
            setOrientation(0);
            setGravity(17);
            inflateDots(i2, this.selected);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void inflateDots(int count, int selected) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.height = -2;
        generateDefaultLayoutParams.width = -2;
        int i = this.dotsPadding;
        generateDefaultLayoutParams.leftMargin = i / 2;
        generateDefaultLayoutParams.rightMargin = i / 2;
        int i2 = 0;
        while (i2 < count) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setImageDrawable(i2 == selected ? this.iconSelected : this.icon);
            addView(appCompatImageView, generateDefaultLayoutParams);
            i2++;
        }
    }

    public final void setDotColors(int dotColor, int selectedDotColor) {
        if (dotColor == this.iconColor && this.iconSelectedColor == selectedDotColor) {
            return;
        }
        this.iconColor = dotColor;
        this.iconSelectedColor = selectedDotColor;
        int v = tje.v(getContext(), 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(dotColor);
        gradientDrawable.setSize(v, v);
        this.icon = gradientDrawable;
        int dimensionPixelSize = getResources().getDimensionPixelSize(mrg0.go_design_s_space);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(selectedDotColor);
        gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize);
        this.iconSelected = gradientDrawable2;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            ((ImageView) getChildAt(i)).setImageDrawable(i == this.selected ? this.iconSelected : this.icon);
            i++;
        }
    }

    public void setDotsCount(int count) {
        if (count < 0) {
            return;
        }
        if (count > getChildCount()) {
            inflateDots(count - getChildCount(), this.selected - getChildCount());
            return;
        }
        while (count < getChildCount()) {
            removeViewAt(getChildCount() - 1);
        }
        if (this.selected >= count) {
            this.selected = -1;
        }
    }

    public void setIndicator(int position) {
        int i = this.selected;
        if (position != i) {
            View childAt = getChildAt(i);
            ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (imageView != null) {
                imageView.setImageDrawable(this.icon);
            }
            View childAt2 = getChildAt(position);
            ImageView imageView2 = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
            if (imageView2 != null) {
                imageView2.setImageDrawable(this.iconSelected);
            }
            this.selected = position;
        }
    }

    public DotsIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DotsIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DotsIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
