package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishAdMobManifest;
import kotlin.text.CatchingFishExoPlayerFAB;
import kotlin.text.CatchingFishWidgetGlide;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean CatchingFishCloudMessaging;
    public View CatchingFishDaggerWebsocket;
    public final int CatchingFishEspressoTesting;
    public final boolean CatchingFishFragmentHandler;
    public Drawable CatchingFishLayout;
    public boolean CatchingFishReduxKtor;
    public Drawable CatchingFishViewModelFAB;
    public Drawable CatchingFishViewModelScope;
    public View CatchingFishWorkManager;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new CatchingFishExoPlayerFAB(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishParcelableFAB);
        boolean z = false;
        this.CatchingFishViewModelScope = obtainStyledAttributes.getDrawable(0);
        this.CatchingFishViewModelFAB = obtainStyledAttributes.getDrawable(2);
        this.CatchingFishEspressoTesting = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.CatchingFishFragmentHandler = true;
            this.CatchingFishLayout = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.CatchingFishFragmentHandler ? !(this.CatchingFishViewModelScope != null || this.CatchingFishViewModelFAB != null) : this.CatchingFishLayout == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.CatchingFishViewModelScope;
        if (drawable != null && drawable.isStateful()) {
            this.CatchingFishViewModelScope.setState(getDrawableState());
        }
        Drawable drawable2 = this.CatchingFishViewModelFAB;
        if (drawable2 != null && drawable2.isStateful()) {
            this.CatchingFishViewModelFAB.setState(getDrawableState());
        }
        Drawable drawable3 = this.CatchingFishLayout;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.CatchingFishLayout.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.CatchingFishViewModelScope;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.CatchingFishViewModelFAB;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.CatchingFishLayout;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.CatchingFishDaggerWebsocket = findViewById(R.id.action_bar);
        this.CatchingFishWorkManager = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.CatchingFishReduxKtor || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.CatchingFishFragmentHandler) {
            Drawable drawable = this.CatchingFishLayout;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.CatchingFishViewModelScope == null) {
                z2 = false;
            } else if (this.CatchingFishDaggerWebsocket.getVisibility() == 0) {
                this.CatchingFishViewModelScope.setBounds(this.CatchingFishDaggerWebsocket.getLeft(), this.CatchingFishDaggerWebsocket.getTop(), this.CatchingFishDaggerWebsocket.getRight(), this.CatchingFishDaggerWebsocket.getBottom());
            } else {
                View view = this.CatchingFishWorkManager;
                if (view == null || view.getVisibility() != 0) {
                    this.CatchingFishViewModelScope.setBounds(0, 0, 0, 0);
                } else {
                    this.CatchingFishViewModelScope.setBounds(this.CatchingFishWorkManager.getLeft(), this.CatchingFishWorkManager.getTop(), this.CatchingFishWorkManager.getRight(), this.CatchingFishWorkManager.getBottom());
                }
            }
            this.CatchingFishCloudMessaging = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.CatchingFishDaggerWebsocket == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.CatchingFishEspressoTesting) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.CatchingFishDaggerWebsocket == null) {
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
        Drawable drawable2 = this.CatchingFishViewModelScope;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.CatchingFishViewModelScope);
        }
        this.CatchingFishViewModelScope = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.CatchingFishDaggerWebsocket;
            if (view != null) {
                this.CatchingFishViewModelScope.setBounds(view.getLeft(), this.CatchingFishDaggerWebsocket.getTop(), this.CatchingFishDaggerWebsocket.getRight(), this.CatchingFishDaggerWebsocket.getBottom());
            }
        }
        boolean z = false;
        if (!this.CatchingFishFragmentHandler ? !(this.CatchingFishViewModelScope != null || this.CatchingFishViewModelFAB != null) : this.CatchingFishLayout == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.CatchingFishLayout;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.CatchingFishLayout);
        }
        this.CatchingFishLayout = drawable;
        boolean z = this.CatchingFishFragmentHandler;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.CatchingFishLayout) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.CatchingFishViewModelScope != null || this.CatchingFishViewModelFAB != null) : this.CatchingFishLayout == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.CatchingFishViewModelFAB;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.CatchingFishViewModelFAB);
        }
        this.CatchingFishViewModelFAB = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.CatchingFishCloudMessaging && this.CatchingFishViewModelFAB != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.CatchingFishFragmentHandler ? !(this.CatchingFishViewModelScope != null || this.CatchingFishViewModelFAB != null) : this.CatchingFishLayout == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.CatchingFishReduxKtor = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.CatchingFishViewModelScope;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.CatchingFishViewModelFAB;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.CatchingFishLayout;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.CatchingFishViewModelScope;
        boolean z = this.CatchingFishFragmentHandler;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.CatchingFishViewModelFAB && this.CatchingFishCloudMessaging) {
            return true;
        }
        return (drawable == this.CatchingFishLayout && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(CatchingFishAdMobManifest catchingFishAdMobManifest) {
    }
}
