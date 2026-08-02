package ru.yandex.taxi.design.action;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.yt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/yandex/taxi/design/action/ActionComponentContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hasProgressAnimation", "Lzy11;", "setProgressAnimation$design_components", "(Z)V", "setProgressAnimation", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "Companion", "yt", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionComponentContainer extends ConstraintLayout {
    public static final yt Companion = new yt();
    public static final int SHIMMERING_DURATION = 3000;
    private ShimmeringPaint shimmeringPaint;

    public /* synthetic */ ActionComponentContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ShimmeringPaint shimmeringPaint = this.shimmeringPaint;
        if (shimmeringPaint == null) {
            return;
        }
        shimmeringPaint.updateShimmering();
        canvas.drawPaint(shimmeringPaint);
        postInvalidateOnAnimation();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ShimmeringPaint shimmeringPaint = this.shimmeringPaint;
        if (shimmeringPaint != null) {
            shimmeringPaint.updateOffset(this);
        }
    }

    public final void setProgressAnimation$design_components(boolean hasProgressAnimation) {
        ShimmeringPaint shimmeringPaint;
        if (hasProgressAnimation) {
            shimmeringPaint = new ShimmeringPaint(getContext());
            shimmeringPaint.setDuration(3000L);
        } else {
            shimmeringPaint = null;
        }
        this.shimmeringPaint = shimmeringPaint;
    }

    public ActionComponentContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ActionComponentContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ActionComponentContainer(Context context) {
        this(context, null, 0, 6, null);
    }
}
