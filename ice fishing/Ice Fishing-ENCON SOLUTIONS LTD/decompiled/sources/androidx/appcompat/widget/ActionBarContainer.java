package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.AbstractC0131a;
import com.watchfacestudio.spraktum.R;
import h.C0205a;
import h.P;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2068a;

    /* renamed from: b, reason: collision with root package name */
    public View f2069b;

    /* renamed from: c, reason: collision with root package name */
    public View f2070c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2071d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2072e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2073f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2074g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2075h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2076i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0205a c0205a = new C0205a(this);
        Field field = x.f8596a;
        setBackground(c0205a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2618a);
        boolean z2 = false;
        this.f2071d = obtainStyledAttributes.getDrawable(0);
        this.f2072e = obtainStyledAttributes.getDrawable(2);
        this.f2076i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2074g = true;
            this.f2073f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2074g ? !(this.f2071d != null || this.f2072e != null) : this.f2073f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2071d;
        if (drawable != null && drawable.isStateful()) {
            this.f2071d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2072e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2072e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2073f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2073f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2071d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2072e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2073f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2069b = findViewById(R.id.action_bar);
        this.f2070c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2068a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f2074g) {
            Drawable drawable = this.f2073f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f2071d == null) {
                z3 = false;
            } else if (this.f2069b.getVisibility() == 0) {
                this.f2071d.setBounds(this.f2069b.getLeft(), this.f2069b.getTop(), this.f2069b.getRight(), this.f2069b.getBottom());
            } else {
                View view = this.f2070c;
                if (view == null || view.getVisibility() != 0) {
                    this.f2071d.setBounds(0, 0, 0, 0);
                } else {
                    this.f2071d.setBounds(this.f2070c.getLeft(), this.f2070c.getTop(), this.f2070c.getRight(), this.f2070c.getBottom());
                }
            }
            this.f2075h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f2069b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f2076i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f2069b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2071d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2071d);
        }
        this.f2071d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2069b;
            if (view != null) {
                this.f2071d.setBounds(view.getLeft(), this.f2069b.getTop(), this.f2069b.getRight(), this.f2069b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f2074g ? !(this.f2071d != null || this.f2072e != null) : this.f2073f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2073f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2073f);
        }
        this.f2073f = drawable;
        boolean z2 = this.f2074g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f2073f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f2071d != null || this.f2072e != null) : this.f2073f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f2072e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2072e);
        }
        this.f2072e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2075h && this.f2072e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f2074g ? !(this.f2071d != null || this.f2072e != null) : this.f2073f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f2068a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f2071d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f2072e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f2073f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2071d;
        boolean z2 = this.f2074g;
        return (drawable == drawable2 && !z2) || (drawable == this.f2072e && this.f2075h) || ((drawable == this.f2073f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(P p2) {
    }
}
