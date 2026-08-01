package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.icefishing.icefishingbigwin.C5275R;
import g.AbstractC4518a;
import m.C4677b;
import m.L0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4501A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4502B;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4503n;

    /* renamed from: u, reason: collision with root package name */
    public View f4504u;

    /* renamed from: v, reason: collision with root package name */
    public View f4505v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f4506w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f4507x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4508y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4509z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C4677b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37588a);
        boolean z3 = false;
        this.f4506w = obtainStyledAttributes.getDrawable(0);
        this.f4507x = obtainStyledAttributes.getDrawable(2);
        this.f4502B = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C5275R.id.split_action_bar) {
            this.f4509z = true;
            this.f4508y = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4509z ? !(this.f4506w != null || this.f4507x != null) : this.f4508y == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4506w;
        if (drawable != null && drawable.isStateful()) {
            this.f4506w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4507x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4507x.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4508y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4508y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4506w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4507x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4508y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4504u = findViewById(C5275R.id.action_bar);
        this.f4505v = findViewById(C5275R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4503n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        boolean z6 = true;
        if (this.f4509z) {
            Drawable drawable = this.f4508y;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f4506w == null) {
                z6 = false;
            } else if (this.f4504u.getVisibility() == 0) {
                this.f4506w.setBounds(this.f4504u.getLeft(), this.f4504u.getTop(), this.f4504u.getRight(), this.f4504u.getBottom());
            } else {
                View view = this.f4505v;
                if (view == null || view.getVisibility() != 0) {
                    this.f4506w.setBounds(0, 0, 0, 0);
                } else {
                    this.f4506w.setBounds(this.f4505v.getLeft(), this.f4505v.getTop(), this.f4505v.getRight(), this.f4505v.getBottom());
                }
            }
            this.f4501A = false;
        }
        if (z6) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        int i9;
        if (this.f4504u == null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && (i9 = this.f4502B) >= 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i6)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i6);
        if (this.f4504u == null) {
            return;
        }
        View.MeasureSpec.getMode(i6);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4506w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4506w);
        }
        this.f4506w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4504u;
            if (view != null) {
                this.f4506w.setBounds(view.getLeft(), this.f4504u.getTop(), this.f4504u.getRight(), this.f4504u.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f4509z ? !(this.f4506w != null || this.f4507x != null) : this.f4508y == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4508y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4508y);
        }
        this.f4508y = drawable;
        boolean z3 = this.f4509z;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f4508y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f4506w != null || this.f4507x != null) : this.f4508y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4507x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4507x);
        }
        this.f4507x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4501A && this.f4507x != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f4509z ? !(this.f4506w != null || this.f4507x != null) : this.f4508y == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f4503n = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.f4506w;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f4507x;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f4508y;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4506w;
        boolean z3 = this.f4509z;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f4507x && this.f4501A) {
            return true;
        }
        return (drawable == this.f4508y && z3) || super.verifyDrawable(drawable);
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
