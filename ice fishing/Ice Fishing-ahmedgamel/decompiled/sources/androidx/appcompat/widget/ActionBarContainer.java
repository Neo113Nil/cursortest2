package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import g.AbstractC4528a;
import m.C4690b;
import m.L0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4469A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4470B;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4471n;

    /* renamed from: u, reason: collision with root package name */
    public View f4472u;

    /* renamed from: v, reason: collision with root package name */
    public View f4473v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f4474w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f4475x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4476y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4477z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C4690b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37550a);
        boolean z6 = false;
        this.f4474w = obtainStyledAttributes.getDrawable(0);
        this.f4475x = obtainStyledAttributes.getDrawable(2);
        this.f4470B = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C5248R.id.split_action_bar) {
            this.f4477z = true;
            this.f4476y = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4477z ? !(this.f4474w != null || this.f4475x != null) : this.f4476y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4474w;
        if (drawable != null && drawable.isStateful()) {
            this.f4474w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4475x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4475x.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4476y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4476y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4474w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4475x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4476y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4472u = findViewById(C5248R.id.action_bar);
        this.f4473v = findViewById(C5248R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4471n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        boolean z9 = true;
        if (this.f4477z) {
            Drawable drawable = this.f4476y;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z9 = false;
            }
        } else {
            if (this.f4474w == null) {
                z9 = false;
            } else if (this.f4472u.getVisibility() == 0) {
                this.f4474w.setBounds(this.f4472u.getLeft(), this.f4472u.getTop(), this.f4472u.getRight(), this.f4472u.getBottom());
            } else {
                View view = this.f4473v;
                if (view == null || view.getVisibility() != 0) {
                    this.f4474w.setBounds(0, 0, 0, 0);
                } else {
                    this.f4474w.setBounds(this.f4473v.getLeft(), this.f4473v.getTop(), this.f4473v.getRight(), this.f4473v.getBottom());
                }
            }
            this.f4469A = false;
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6;
        if (this.f4472u == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i6 = this.f4470B) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f4472u == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4474w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4474w);
        }
        this.f4474w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4472u;
            if (view != null) {
                this.f4474w.setBounds(view.getLeft(), this.f4472u.getTop(), this.f4472u.getRight(), this.f4472u.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f4477z ? !(this.f4474w != null || this.f4475x != null) : this.f4476y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4476y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4476y);
        }
        this.f4476y = drawable;
        boolean z6 = this.f4477z;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f4476y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f4474w != null || this.f4475x != null) : this.f4476y == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4475x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4475x);
        }
        this.f4475x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4469A && this.f4475x != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f4477z ? !(this.f4474w != null || this.f4475x != null) : this.f4476y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f4471n = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z6 = i == 0;
        Drawable drawable = this.f4474w;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f4475x;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f4476y;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4474w;
        boolean z6 = this.f4477z;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f4475x && this.f4469A) {
            return true;
        }
        return (drawable == this.f4476y && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(L0 l02) {
    }
}
