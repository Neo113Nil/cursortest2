package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.c4i0;
import defpackage.mqg0;
import defpackage.nwy0;
import defpackage.qke;
import defpackage.w4m;
import defpackage.x4m;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002-.B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'J\r\u0010(\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/yandex/taxi/design/DotsIndicatorComponent;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/viewpager/widget/ViewPager$a;", "createPageChangeListener", "()Landroidx/viewpager/widget/ViewPager$a;", "Landroidx/viewpager2/widget/ViewPager2$a;", "createPageChangeCallback", "()Landroidx/viewpager2/widget/ViewPager2$a;", "dotsCount", "Lzy11;", "setDotsCount", "(I)V", "dotColor", "selectedDotColor", "setDotColors", "(II)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "position", "", "positionOffset", "setPageScroll", "(IF)V", "", "ignoreRtl", "(IFZ)V", "scrollFinished", "()V", "Lru/yandex/taxi/design/DotsIndicatorDrawable;", "drawable", "Lru/yandex/taxi/design/DotsIndicatorDrawable;", "x4m", "w4m", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DotsIndicatorComponent extends View implements nwy0 {
    private final DotsIndicatorDrawable drawable;

    public DotsIndicatorComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DotsIndicatorDrawable dotsIndicatorDrawable = new DotsIndicatorDrawable(context);
        this.drawable = dotsIndicatorDrawable;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.DotsIndicatorComponent, i, 0);
        try {
            dotsIndicatorDrawable.setDotColors(obtainStyledAttributes.getColor(c4i0.DotsIndicatorComponent_dot_color, context.getColor(mqg0.transparent_40_white)), obtainStyledAttributes.getColor(c4i0.DotsIndicatorComponent_selected_dot_color, context.getColor(mqg0.white)));
            obtainStyledAttributes.recycle();
            if (isInEditMode()) {
                dotsIndicatorDrawable.setDotsCount(5);
                dotsIndicatorDrawable.setPosition(2, 0.0f);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final ViewPager2.a createPageChangeCallback() {
        return new w4m(this);
    }

    public final ViewPager.a createPageChangeListener() {
        return new x4m(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int height = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.drawable.getLargeItemSize()) / 2) + getPaddingTop();
        DotsIndicatorDrawable dotsIndicatorDrawable = this.drawable;
        dotsIndicatorDrawable.setBounds(0, height, dotsIndicatorDrawable.getIntrinsicWidth(), this.drawable.getLargeItemSize() + height);
        this.drawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int largeItemSize = this.drawable.getLargeItemSize();
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            largeItemSize = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(this.drawable.getIntrinsicWidth(), largeItemSize);
    }

    public final void scrollFinished() {
        qke.E(getContext(), HapticController$Effect.TICK, false, 8);
    }

    public final void setDotColors(int dotColor, int selectedDotColor) {
        this.drawable.setDotColors(dotColor, selectedDotColor);
        invalidate();
    }

    public final void setDotsCount(int dotsCount) {
        if (this.drawable.getDotsCount() != dotsCount) {
            this.drawable.setDotsCount(dotsCount);
            requestLayout();
        }
    }

    public final void setPageScroll(int position, float positionOffset, boolean ignoreRtl) {
        this.drawable.setPosition(position, positionOffset, ignoreRtl);
        invalidate();
    }

    public final void setPageScroll(int position, float positionOffset) {
        setPageScroll(position, positionOffset, false);
    }

    public DotsIndicatorComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DotsIndicatorComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DotsIndicatorComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.dotsIndicatorComponentStyle : i);
    }
}
