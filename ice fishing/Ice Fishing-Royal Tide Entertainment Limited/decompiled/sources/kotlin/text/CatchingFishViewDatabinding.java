package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class CatchingFishViewDatabinding extends CheckBox implements CatchingFishViewFluxMoshi {
    public final CatchingFishPicassoJUnit CatchingFishDaggerWebsocket;
    public final CatchingFishServiceGraphQL CatchingFishReduxKtor;
    public CatchingFishToastAnimation CatchingFishViewModelScope;
    public final CatchingFishGradleJUnit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewDatabinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = new CatchingFishServiceGraphQL(this);
        this.CatchingFishReduxKtor = catchingFishServiceGraphQL;
        catchingFishServiceGraphQL.CatchingFishReduxKtor(attributeSet, i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishWorkManager = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, i);
        getEmojiTextViewHelper().CatchingFishParcelableFAB(attributeSet, i);
    }

    private CatchingFishToastAnimation getEmojiTextViewHelper() {
        if (this.CatchingFishViewModelScope == null) {
            this.CatchingFishViewModelScope = new CatchingFishToastAnimation(this);
        }
        return this.CatchingFishViewModelScope;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishViewFluxMoshi
    public ColorStateList getSupportButtonTintList() {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            return (ColorStateList) catchingFishServiceGraphQL.CatchingFishParcelableFAB;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            return (PorterDuff.Mode) catchingFishServiceGraphQL.CatchingFishSnackbar;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.CatchingFishWorkManager.CatchingFishReduxKtor();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.CatchingFishWorkManager.CatchingFishDaggerWebsocket();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().CatchingFishSnackbar(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            if (catchingFishServiceGraphQL.CatchingFishDaggerWebsocket) {
                catchingFishServiceGraphQL.CatchingFishDaggerWebsocket = false;
            } else {
                catchingFishServiceGraphQL.CatchingFishDaggerWebsocket = true;
                catchingFishServiceGraphQL.CatchingFishParcelableFAB();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
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
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    @Override // kotlin.text.CatchingFishViewFluxMoshi
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            catchingFishServiceGraphQL.CatchingFishParcelableFAB = colorStateList;
            catchingFishServiceGraphQL.CatchingFishCoroutine = true;
            catchingFishServiceGraphQL.CatchingFishParcelableFAB();
        }
    }

    @Override // kotlin.text.CatchingFishViewFluxMoshi
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            catchingFishServiceGraphQL.CatchingFishSnackbar = mode;
            catchingFishServiceGraphQL.CatchingFishReduxKtor = true;
            catchingFishServiceGraphQL.CatchingFishParcelableFAB();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        catchingFishGradleJUnit.CatchingFishCloudMessaging(colorStateList);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        catchingFishGradleJUnit.CatchingFishEspressoTesting(mode);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }
}
