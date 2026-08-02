package A3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import m.AbstractC4728u0;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public abstract class f extends AbstractC4728u0 {

    /* renamed from: I, reason: collision with root package name */
    public Drawable f155I;
    public final Rect J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f156K;

    /* renamed from: L, reason: collision with root package name */
    public int f157L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f158M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f159N;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new Rect();
        this.f156K = new Rect();
        this.f157L = 119;
        this.f158M = true;
        this.f159N = false;
        int[] iArr = AbstractC4742a.f39425h;
        n.a(context, attributeSet, 0, 0);
        n.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f157L = obtainStyledAttributes.getInt(1, this.f157L);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f158M = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f155I;
        if (drawable != null) {
            if (this.f159N) {
                this.f159N = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.f158M;
                Rect rect = this.J;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f157L;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f156K;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f9) {
        super.drawableHotspotChanged(f2, f9);
        Drawable drawable = this.f155I;
        if (drawable != null) {
            drawable.setHotspot(f2, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f155I;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f155I.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f155I;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f157L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f155I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // m.AbstractC4728u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        this.f159N = z6 | this.f159N;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        this.f159N = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f155I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f155I);
            }
            this.f155I = drawable;
            this.f159N = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f157L == 119) {
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
        if (this.f157L != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f157L = i;
            if (i == 119 && this.f155I != null) {
                this.f155I.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f155I;
    }
}
