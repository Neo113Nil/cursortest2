package y3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k3.AbstractC4632a;
import m.AbstractC4715u0;

/* renamed from: y3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5236d extends AbstractC4715u0 {

    /* renamed from: I, reason: collision with root package name */
    public Drawable f41901I;
    public final Rect J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f41902K;

    /* renamed from: L, reason: collision with root package name */
    public int f41903L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f41904M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f41905N;

    public AbstractC5236d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new Rect();
        this.f41902K = new Rect();
        this.f41903L = 119;
        this.f41904M = true;
        this.f41905N = false;
        int[] iArr = AbstractC4632a.f38636h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f41903L = obtainStyledAttributes.getInt(1, this.f41903L);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f41904M = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f41901I;
        if (drawable != null) {
            if (this.f41905N) {
                this.f41905N = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f41904M;
                Rect rect = this.J;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f41903L;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f41902K;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f3, float f9) {
        super.drawableHotspotChanged(f3, f9);
        Drawable drawable = this.f41901I;
        if (drawable != null) {
            drawable.setHotspot(f3, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f41901I;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f41901I.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f41901I;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f41903L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f41901I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        this.f41905N = z3 | this.f41905N;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        this.f41905N = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f41901I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f41901I);
            }
            this.f41901I = drawable;
            this.f41905N = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f41903L == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f41903L != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f41903L = i;
            if (i == 119 && this.f41901I != null) {
                this.f41901I.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f41901I;
    }
}
