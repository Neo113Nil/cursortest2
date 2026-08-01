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
    public Drawable f41904I;
    public final Rect J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f41905K;

    /* renamed from: L, reason: collision with root package name */
    public int f41906L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f41907M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f41908N;

    public AbstractC5236d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new Rect();
        this.f41905K = new Rect();
        this.f41906L = 119;
        this.f41907M = true;
        this.f41908N = false;
        int[] iArr = AbstractC4632a.f38636h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f41906L = obtainStyledAttributes.getInt(1, this.f41906L);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f41907M = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f41904I;
        if (drawable != null) {
            if (this.f41908N) {
                this.f41908N = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f41907M;
                Rect rect = this.J;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f41906L;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f41905K;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f3, float f9) {
        super.drawableHotspotChanged(f3, f9);
        Drawable drawable = this.f41904I;
        if (drawable != null) {
            drawable.setHotspot(f3, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f41904I;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f41904I.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f41904I;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f41906L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f41904I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        this.f41908N = z3 | this.f41908N;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        this.f41908N = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f41904I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f41904I);
            }
            this.f41904I = drawable;
            this.f41908N = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f41906L == 119) {
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
        if (this.f41906L != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f41906L = i;
            if (i == 119 && this.f41904I != null) {
                this.f41904I.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f41904I;
    }
}
