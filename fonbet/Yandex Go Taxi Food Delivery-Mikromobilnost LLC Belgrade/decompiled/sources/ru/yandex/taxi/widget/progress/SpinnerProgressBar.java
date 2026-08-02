package ru.yandex.taxi.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.dzg0;
import defpackage.g4i0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/taxi/widget/progress/SpinnerProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "tintColor", "Lzy11;", "setTint", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "loadingIcon", "Landroid/graphics/drawable/Drawable;", "", "customAnimTime", "J", "getIconSize", "()I", "iconSize", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpinnerProgressBar extends View {
    public static final int $stable = 8;
    private long customAnimTime;
    private final Drawable loadingIcon;

    public SpinnerProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.loadingIcon = tje.y(dzg0.ic_spinner_24, getContext());
        this.customAnimTime = -1L;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4i0.SpinnerProgressBar, i, i2);
        try {
            setTint(obtainStyledAttributes.getColor(g4i0.SpinnerProgressBar_spinnerColor, qje.t(obtainStyledAttributes.getResourceId(g4i0.SpinnerProgressBar_spinnerColor, xng0.textMain), getContext())));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final int getIconSize() {
        return this.loadingIcon.getBounds().bottom;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.translate(getIconSize() / 2.0f, getIconSize() / 2.0f);
        long j = this.customAnimTime;
        if (j < 0) {
            j = AnimationUtils.currentAnimationTimeMillis();
        }
        canvas.rotate(((j % 1000) / 1000.0f) * 360.0f);
        canvas.translate((-getIconSize()) / 2.0f, (-getIconSize()) / 2.0f);
        this.loadingIcon.draw(canvas);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        this.loadingIcon.setBounds(0, 0, View.MeasureSpec.getSize(widthMeasureSpec), size);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setTint(int tintColor) {
        this.loadingIcon.setTint(tintColor);
    }

    public SpinnerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SpinnerProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SpinnerProgressBar(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SpinnerProgressBar(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
