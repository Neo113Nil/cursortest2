package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.AbstractC0097a;
import com.icecatchbiger.hookfrostmaster.R;
import h.C0157a;
import h.Q;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1113e;

    /* renamed from: f, reason: collision with root package name */
    public View f1114f;

    /* renamed from: g, reason: collision with root package name */
    public View f1115g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f1116h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1117i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1118j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1119k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1120l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1121m;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0157a c0157a = new C0157a(this);
        Field field = x.f3074a;
        setBackground(c0157a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1637a);
        boolean z2 = false;
        this.f1116h = obtainStyledAttributes.getDrawable(0);
        this.f1117i = obtainStyledAttributes.getDrawable(2);
        this.f1121m = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1119k = true;
            this.f1118j = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1119k ? !(this.f1116h != null || this.f1117i != null) : this.f1118j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1116h;
        if (drawable != null && drawable.isStateful()) {
            this.f1116h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1117i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1117i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1118j;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1118j.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1116h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1117i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1118j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1114f = findViewById(R.id.action_bar);
        this.f1115g = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1113e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1119k) {
            Drawable drawable = this.f1118j;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1116h == null) {
                z3 = false;
            } else if (this.f1114f.getVisibility() == 0) {
                this.f1116h.setBounds(this.f1114f.getLeft(), this.f1114f.getTop(), this.f1114f.getRight(), this.f1114f.getBottom());
            } else {
                View view = this.f1115g;
                if (view == null || view.getVisibility() != 0) {
                    this.f1116h.setBounds(0, 0, 0, 0);
                } else {
                    this.f1116h.setBounds(this.f1115g.getLeft(), this.f1115g.getTop(), this.f1115g.getRight(), this.f1115g.getBottom());
                }
            }
            this.f1120l = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1114f == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1121m) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1114f == null) {
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
        Drawable drawable2 = this.f1116h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1116h);
        }
        this.f1116h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1114f;
            if (view != null) {
                this.f1116h.setBounds(view.getLeft(), this.f1114f.getTop(), this.f1114f.getRight(), this.f1114f.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1119k ? !(this.f1116h != null || this.f1117i != null) : this.f1118j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1118j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1118j);
        }
        this.f1118j = drawable;
        boolean z2 = this.f1119k;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1118j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1116h != null || this.f1117i != null) : this.f1118j == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1117i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1117i);
        }
        this.f1117i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1120l && this.f1117i != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1119k ? !(this.f1116h != null || this.f1117i != null) : this.f1118j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1113e = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1116h;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1117i;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1118j;
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
        Drawable drawable2 = this.f1116h;
        boolean z2 = this.f1119k;
        return (drawable == drawable2 && !z2) || (drawable == this.f1117i && this.f1120l) || ((drawable == this.f1118j && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(Q q2) {
    }
}
