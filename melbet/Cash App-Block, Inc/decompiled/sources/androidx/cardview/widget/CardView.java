package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder;
import androidx.cardview.R$styleable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class CardView extends FrameLayout {
    public static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    public final Recorder.AnonymousClass1 mCardViewDelegate;
    public boolean mCompatPadding;
    public final Rect mContentPadding;
    public boolean mPreventCornerOverlap;
    public final Rect mShadowBounds;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(this, 14);
        this.mCardViewDelegate = anonymousClass1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i, com.squareup.cash.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.squareup.cash.R.color.cardview_light_background) : getResources().getColor(com.squareup.cash.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, RecyclerView.DECELERATION_RATE);
        float dimension2 = obtainStyledAttributes.getDimension(4, RecyclerView.DECELERATION_RATE);
        float dimension3 = obtainStyledAttributes.getDimension(5, RecyclerView.DECELERATION_RATE);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        RoundRectDrawable roundRectDrawable = new RoundRectDrawable(valueOf, dimension);
        anonymousClass1.val$videoEncoderSession = roundRectDrawable;
        setBackgroundDrawable(roundRectDrawable);
        setClipToOutline(true);
        setElevation(dimension2);
        CardViewApi21Impl.setMaxElevation(anonymousClass1, dimension3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.mCardViewDelegate.val$videoEncoderSession;
        if (valueOf == null) {
            roundRectDrawable.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        roundRectDrawable.mBackground = valueOf;
        roundRectDrawable.mPaint.setColor(valueOf.getColorForState(roundRectDrawable.getState(), roundRectDrawable.mBackground.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.mCardViewDelegate.this$0).setElevation(f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        CardViewApi21Impl.updatePadding(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        CardViewApi21Impl.setMaxElevation(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            Recorder.AnonymousClass1 anonymousClass1 = this.mCardViewDelegate;
            CardViewApi21Impl.setMaxElevation(anonymousClass1, ((RoundRectDrawable) anonymousClass1.val$videoEncoderSession).mPadding);
        }
    }

    public void setRadius(float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.mCardViewDelegate.val$videoEncoderSession;
        if (f == roundRectDrawable.mRadius) {
            return;
        }
        roundRectDrawable.mRadius = f;
        roundRectDrawable.updateBounds(null);
        roundRectDrawable.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            Recorder.AnonymousClass1 anonymousClass1 = this.mCardViewDelegate;
            CardViewApi21Impl.setMaxElevation(anonymousClass1, ((RoundRectDrawable) anonymousClass1.val$videoEncoderSession).mPadding);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.mCardViewDelegate.val$videoEncoderSession;
        if (colorStateList == null) {
            roundRectDrawable.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawable.mBackground = colorStateList;
        roundRectDrawable.mPaint.setColor(colorStateList.getColorForState(roundRectDrawable.getState(), roundRectDrawable.mBackground.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
