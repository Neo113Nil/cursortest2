package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public abstract class CatchingFishIntentCameraX extends FrameLayout {
    public static final CatchingFishSpannableGlide CatchingFishEspressoTesting = new CatchingFishSpannableGlide();
    public PorterDuff.Mode CatchingFishCloudMessaging;
    public int CatchingFishDaggerWebsocket;
    public ColorStateList CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public final CatchingFishFragmentMVVM CatchingFishReduxKtor;
    public final int CatchingFishViewModelFAB;
    public final float CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishIntentCameraX(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishPayPal);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.CatchingFishReduxKtor = CatchingFishFragmentMVVM.CatchingFishSnackbar(context2, attributeSet, 0, 0).CatchingFishParcelableFAB();
        }
        this.CatchingFishWorkManager = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(CatchingFishDaggerBiometric.CatchingFishNavigation(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(CatchingFishViewMVIMVVM.CatchingFishJetpackCompose(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.CatchingFishViewModelScope = obtainStyledAttributes.getFloat(1, 1.0f);
        this.CatchingFishViewModelFAB = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.CatchingFishLayout = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(CatchingFishEspressoTesting);
        setFocusable(true);
        if (getBackground() == null) {
            int CatchingFishRoomDatabase = CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(getBackgroundOverlayColorAlpha(), CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, R.attr.colorSurface), CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, R.attr.colorOnSurface));
            CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishReduxKtor;
            if (catchingFishFragmentMVVM != null) {
                int i = CatchingFishGsonFABRetrofit.CatchingFishParcelableFAB;
                CatchingFishContextGraphQL catchingFishContextGraphQL = new CatchingFishContextGraphQL(catchingFishFragmentMVVM);
                catchingFishContextGraphQL.CatchingFishUnitTesting(ColorStateList.valueOf(CatchingFishRoomDatabase));
                gradientDrawable = catchingFishContextGraphQL;
            } else {
                Resources resources = getResources();
                int i2 = CatchingFishGsonFABRetrofit.CatchingFishParcelableFAB;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(CatchingFishRoomDatabase);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.CatchingFishFragmentHandler;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.CatchingFishViewModelScope;
    }

    public int getAnimationMode() {
        return this.CatchingFishDaggerWebsocket;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.CatchingFishWorkManager;
    }

    public int getMaxInlineActionWidth() {
        return this.CatchingFishLayout;
    }

    public int getMaxWidth() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.CatchingFishViewModelFAB;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.CatchingFishDaggerWebsocket = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.CatchingFishFragmentHandler != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.CatchingFishFragmentHandler);
            drawable.setTintMode(this.CatchingFishCloudMessaging);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.CatchingFishFragmentHandler = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.CatchingFishCloudMessaging);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.CatchingFishCloudMessaging = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : CatchingFishEspressoTesting);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(CatchingFishGsonFABRetrofit catchingFishGsonFABRetrofit) {
    }
}
