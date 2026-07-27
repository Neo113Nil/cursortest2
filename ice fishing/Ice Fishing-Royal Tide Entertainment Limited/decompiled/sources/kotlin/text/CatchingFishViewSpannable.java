package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public final class CatchingFishViewSpannable extends ToggleButton {
    public final CatchingFishGradleJUnit CatchingFishDaggerWebsocket;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public CatchingFishToastAnimation CatchingFishWorkManager;

    public CatchingFishViewSpannable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishReduxKtor = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, R.attr.buttonStyleToggle);
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().CatchingFishParcelableFAB(attributeSet, R.attr.buttonStyleToggle);
    }

    private CatchingFishToastAnimation getEmojiTextViewHelper() {
        if (this.CatchingFishWorkManager == null) {
            this.CatchingFishWorkManager = new CatchingFishToastAnimation(this);
        }
        return this.CatchingFishWorkManager;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().CatchingFishSnackbar(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().CatchingFishCoroutine(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((CatchingFishFirebaseDagger) getEmojiTextViewHelper().CatchingFishSnackbar.CatchingFishDaggerWebsocket).CatchingFishMVPRobolectric(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        catchingFishGradleJUnit.CatchingFishCloudMessaging(colorStateList);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        catchingFishGradleJUnit.CatchingFishEspressoTesting(mode);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }
}
