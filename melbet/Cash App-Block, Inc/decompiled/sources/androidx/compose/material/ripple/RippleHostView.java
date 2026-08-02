package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class RippleHostView extends View {
    public static final int[] PressedState = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] RestingState = new int[0];
    public Boolean bounded;
    public Long lastRippleStateChangeTimeMillis;
    public Worker$$ExternalSyntheticLambda0 onInvalidateRipple;
    public Preview$$ExternalSyntheticLambda0 resetRippleRunnable;
    public UnprojectedRipple ripple;

    public RippleHostView(Context context) {
        super(context);
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m513addRippleKOepWvA(PressInteraction.Press press, boolean z, long j, int i, long j2, float f, Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0) {
        if (this.ripple == null || !Boolean.valueOf(z).equals(this.bounded)) {
            UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
            setBackground(unprojectedRipple);
            this.ripple = unprojectedRipple;
            this.bounded = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        unprojectedRipple2.getClass();
        this.onInvalidateRipple = worker$$ExternalSyntheticLambda0;
        m514setRipplePropertiesbiQXAtU(j, i, j2, f);
        if (z) {
            unprojectedRipple2.setHotspot(Float.intBitsToFloat((int) (press.pressPosition >> 32)), Float.intBitsToFloat((int) (press.pressPosition & BodyPartID.bodyIdMax)));
        } else {
            unprojectedRipple2.setHotspot(unprojectedRipple2.getBounds().centerX(), unprojectedRipple2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = this.resetRippleRunnable;
        if (preview$$ExternalSyntheticLambda0 != null) {
            removeCallbacks(preview$$ExternalSyntheticLambda0);
            Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda02 = this.resetRippleRunnable;
            preview$$ExternalSyntheticLambda02.getClass();
            preview$$ExternalSyntheticLambda02.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            disposeRipple();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0 = this.onInvalidateRipple;
        if (worker$$ExternalSyntheticLambda0 != null) {
            worker$$ExternalSyntheticLambda0.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m514setRipplePropertiesbiQXAtU(long j, int i, long j2, float f) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        if (unprojectedRipple.getRadius() != i) {
            unprojectedRipple.setRadius(i);
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(f, j2, 14);
        Color color = unprojectedRipple.rippleColor;
        if (!(color == null ? false : Color.m676equalsimpl0(color.value, m675copywmQWz5c$default))) {
            unprojectedRipple.rippleColor = new Color(m675copywmQWz5c$default);
            unprojectedRipple.setColor(ColorStateList.valueOf(ColorKt.m694toArgb8_81llA(m675copywmQWz5c$default)));
        }
        Rect rect = new Rect(0, 0, MathKt__MathJVMKt.roundToInt(Size.m643getWidthimpl(j)), MathKt__MathJVMKt.roundToInt(Size.m640getHeightimpl(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    public final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? PressedState : RestingState;
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(this, 29);
            this.resetRippleRunnable = preview$$ExternalSyntheticLambda0;
            postDelayed(preview$$ExternalSyntheticLambda0, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }
}
