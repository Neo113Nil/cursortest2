package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kolosta.rejin.jilosa.R;
import defpackage.LfKQckgD;
import defpackage.z00;
import defpackage.z50;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public View MdtA4re8;
    public boolean NCTxEWno;
    public Drawable P7K7Inc8;
    public final boolean Qr9iLBAD;
    public Drawable VgvYg0wo;
    public Drawable b2ZJblxo;
    public final int eVhOlqcC;
    public boolean jb9XjC4I;
    public View wxUZMvaN;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new LfKQckgD(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.qoPGr6Ce);
        boolean z = false;
        this.VgvYg0wo = obtainStyledAttributes.getDrawable(0);
        this.P7K7Inc8 = obtainStyledAttributes.getDrawable(2);
        this.eVhOlqcC = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.Qr9iLBAD = true;
            this.b2ZJblxo = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.Qr9iLBAD ? !(this.VgvYg0wo != null || this.P7K7Inc8 != null) : this.b2ZJblxo == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.VgvYg0wo;
        if (drawable != null && drawable.isStateful()) {
            this.VgvYg0wo.setState(getDrawableState());
        }
        Drawable drawable2 = this.P7K7Inc8;
        if (drawable2 != null && drawable2.isStateful()) {
            this.P7K7Inc8.setState(getDrawableState());
        }
        Drawable drawable3 = this.b2ZJblxo;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.b2ZJblxo.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.VgvYg0wo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.P7K7Inc8;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.b2ZJblxo;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.MdtA4re8 = findViewById(R.id.action_bar);
        this.wxUZMvaN = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.NCTxEWno || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.Qr9iLBAD) {
            Drawable drawable = this.b2ZJblxo;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.VgvYg0wo == null) {
                z2 = false;
            } else if (this.MdtA4re8.getVisibility() == 0) {
                this.VgvYg0wo.setBounds(this.MdtA4re8.getLeft(), this.MdtA4re8.getTop(), this.MdtA4re8.getRight(), this.MdtA4re8.getBottom());
            } else {
                View view = this.wxUZMvaN;
                if (view == null || view.getVisibility() != 0) {
                    this.VgvYg0wo.setBounds(0, 0, 0, 0);
                } else {
                    this.VgvYg0wo.setBounds(this.wxUZMvaN.getLeft(), this.wxUZMvaN.getTop(), this.wxUZMvaN.getRight(), this.wxUZMvaN.getBottom());
                }
            }
            this.jb9XjC4I = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.MdtA4re8 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.eVhOlqcC) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.MdtA4re8 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.VgvYg0wo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.VgvYg0wo);
        }
        this.VgvYg0wo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.MdtA4re8;
            if (view != null) {
                this.VgvYg0wo.setBounds(view.getLeft(), this.MdtA4re8.getTop(), this.MdtA4re8.getRight(), this.MdtA4re8.getBottom());
            }
        }
        boolean z = false;
        if (!this.Qr9iLBAD ? !(this.VgvYg0wo != null || this.P7K7Inc8 != null) : this.b2ZJblxo == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.b2ZJblxo;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.b2ZJblxo);
        }
        this.b2ZJblxo = drawable;
        boolean z = this.Qr9iLBAD;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.b2ZJblxo) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.VgvYg0wo != null || this.P7K7Inc8 != null) : this.b2ZJblxo == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.P7K7Inc8;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.P7K7Inc8);
        }
        this.P7K7Inc8 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.jb9XjC4I && this.P7K7Inc8 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.Qr9iLBAD ? !(this.VgvYg0wo != null || this.P7K7Inc8 != null) : this.b2ZJblxo == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.NCTxEWno = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.VgvYg0wo;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.P7K7Inc8;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.b2ZJblxo;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.VgvYg0wo;
        boolean z = this.Qr9iLBAD;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.P7K7Inc8 && this.jb9XjC4I) {
            return true;
        }
        return (drawable == this.b2ZJblxo && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(z50 z50Var) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
