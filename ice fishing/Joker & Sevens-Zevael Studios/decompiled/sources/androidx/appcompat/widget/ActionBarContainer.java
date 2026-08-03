package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import h3.w;
import java.lang.reflect.Field;
import m.v0;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public boolean f381g;

    /* renamed from: h, reason: collision with root package name */
    public View f382h;

    /* renamed from: i, reason: collision with root package name */
    public View f383i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f384j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f385k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f386l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f387m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f388n;

    /* renamed from: o, reason: collision with root package name */
    public final int f389o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.a aVar = new m.a(this);
        Field field = w.f2829a;
        setBackground(aVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f2910a);
        boolean z10 = false;
        this.f384j = obtainStyledAttributes.getDrawable(0);
        this.f385k = obtainStyledAttributes.getDrawable(2);
        this.f389o = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f387m = true;
            this.f386l = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f387m ? !(this.f384j != null || this.f385k != null) : this.f386l == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f384j;
        if (drawable != null && drawable.isStateful()) {
            this.f384j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f385k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f385k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f386l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f386l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f384j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f385k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f386l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f382h = findViewById(R.id.action_bar);
        this.f383i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f381g || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (this.f387m) {
            Drawable drawable = this.f386l;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f384j == null) {
                z11 = false;
            } else if (this.f382h.getVisibility() == 0) {
                this.f384j.setBounds(this.f382h.getLeft(), this.f382h.getTop(), this.f382h.getRight(), this.f382h.getBottom());
            } else {
                View view = this.f383i;
                if (view == null || view.getVisibility() != 0) {
                    this.f384j.setBounds(0, 0, 0, 0);
                } else {
                    this.f384j.setBounds(this.f383i.getLeft(), this.f383i.getTop(), this.f383i.getRight(), this.f383i.getBottom());
                }
            }
            this.f388n = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f382h == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f389o) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f382h == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f384j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f384j);
        }
        this.f384j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f382h;
            if (view != null) {
                this.f384j.setBounds(view.getLeft(), this.f382h.getTop(), this.f382h.getRight(), this.f382h.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f387m ? !(this.f384j != null || this.f385k != null) : this.f386l == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f386l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f386l);
        }
        this.f386l = drawable;
        boolean z10 = this.f387m;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f386l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f384j != null || this.f385k != null) : this.f386l == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f385k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f385k);
        }
        this.f385k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f388n && this.f385k != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f387m ? !(this.f384j != null || this.f385k != null) : this.f386l == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        this.f381g = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f384j;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f385k;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f386l;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f384j;
        boolean z10 = this.f387m;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f385k && this.f388n) {
            return true;
        }
        return (drawable == this.f386l && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(v0 v0Var) {
    }
}
