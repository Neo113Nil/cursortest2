package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* loaded from: classes.dex */
public abstract class CatchingFishEspressoRoom extends CatchingFishAdMobXMLLayout {
    public Drawable CatchingFish;
    public final Rect CatchingFishCoroutineFlow;
    public int CatchingFishDaggerHiltFAB;
    public final Rect CatchingFishJetpackCompose;
    public boolean CatchingFishParcelableFlux;
    public final boolean CatchingFishSpannableWidget;

    public CatchingFishEspressoRoom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.CatchingFishJetpackCompose = new Rect();
        this.CatchingFishCoroutineFlow = new Rect();
        this.CatchingFishDaggerHiltFAB = 119;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishParcelableFlux = false;
        CatchingFishLayoutRoomFAB.CatchingFishOkHttp(context, attributeSet, 0, 0);
        int[] iArr = CatchingFishSnackbarPicasso.CatchingFishViewModelFAB;
        CatchingFishLayoutRoomFAB.CatchingFishAnimationMockk(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.CatchingFishDaggerHiltFAB = obtainStyledAttributes.getInt(1, this.CatchingFishDaggerHiltFAB);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.CatchingFishSpannableWidget = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.CatchingFish;
        if (drawable != null) {
            if (this.CatchingFishParcelableFlux) {
                this.CatchingFishParcelableFlux = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.CatchingFishSpannableWidget;
                Rect rect = this.CatchingFishJetpackCompose;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.CatchingFishDaggerHiltFAB;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.CatchingFishCoroutineFlow;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.CatchingFish;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.CatchingFish;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.CatchingFish.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.CatchingFish;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.CatchingFishDaggerHiltFAB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.CatchingFish;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // kotlin.text.CatchingFishAdMobXMLLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.CatchingFishParcelableFlux = z | this.CatchingFishParcelableFlux;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.CatchingFishParcelableFlux = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.CatchingFish;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.CatchingFish);
            }
            this.CatchingFish = drawable;
            this.CatchingFishParcelableFlux = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.CatchingFishDaggerHiltFAB == 119) {
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
        if (this.CatchingFishDaggerHiltFAB != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.CatchingFishDaggerHiltFAB = i;
            if (i == 119 && this.CatchingFish != null) {
                this.CatchingFish.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.CatchingFish;
    }
}
