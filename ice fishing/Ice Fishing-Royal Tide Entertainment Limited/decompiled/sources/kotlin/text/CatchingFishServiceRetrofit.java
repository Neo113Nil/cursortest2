package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class CatchingFishServiceRetrofit extends MultiAutoCompleteTextView {
    public static final int[] CatchingFishViewModelScope = {R.attr.popupBackground};
    public final CatchingFishGradleJUnit CatchingFishDaggerWebsocket;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public final CatchingFishBundleGlide CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishServiceRetrofit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.autoCompleteTextViewStyle);
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(getContext(), attributeSet, CatchingFishViewModelScope, com.catchingfish.fishcatcherpro.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket).hasValue(0)) {
            setDropDownBackgroundDrawable(CatchingFishRecyclerView.CatchingFishMutableLiveData(0));
        }
        CatchingFishRecyclerView.CatchingFishAnimation();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishReduxKtor = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, com.catchingfish.fishcatcherpro.R.attr.autoCompleteTextViewStyle);
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, com.catchingfish.fishcatcherpro.R.attr.autoCompleteTextViewStyle);
        catchingFishGradleJUnit.CatchingFishSnackbar();
        CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(this, 8);
        this.CatchingFishWorkManager = catchingFishBundleGlide;
        catchingFishBundleGlide.CatchingFishParcelableFlux(attributeSet, com.catchingfish.fishcatcherpro.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener CatchingFishCoroutineFlow = catchingFishBundleGlide.CatchingFishCoroutineFlow(keyListener);
        if (CatchingFishCoroutineFlow == keyListener) {
            return;
        }
        super.setKeyListener(CatchingFishCoroutineFlow);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        CatchingFishFirebaseDagger.CatchingFishHandler(onCreateInputConnection, editorInfo, this);
        return this.CatchingFishWorkManager.CatchingFishGsonAppCompat(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.CatchingFishWorkManager.CatchingFishMutableLiveData(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.CatchingFishWorkManager.CatchingFishCoroutineFlow(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishViewModelScope(context, i);
        }
    }
}
