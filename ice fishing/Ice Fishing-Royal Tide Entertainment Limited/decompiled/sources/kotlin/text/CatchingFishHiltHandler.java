package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class CatchingFishHiltHandler extends Button {
    public final CatchingFishGradleJUnit CatchingFishDaggerWebsocket;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public CatchingFishToastAnimation CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHiltHandler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishReduxKtor = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, i);
        catchingFishGradleJUnit.CatchingFishSnackbar();
        getEmojiTextViewHelper().CatchingFishParcelableFAB(attributeSet, i);
    }

    private CatchingFishToastAnimation getEmojiTextViewHelper() {
        if (this.CatchingFishWorkManager == null) {
            this.CatchingFishWorkManager = new CatchingFishToastAnimation(this);
        }
        return this.CatchingFishWorkManager;
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeMaxTextSize();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return Math.round(catchingFishGradleJUnit.CatchingFishLayout.CatchingFishDaggerWebsocket);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeMinTextSize();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return Math.round(catchingFishGradleJUnit.CatchingFishLayout.CatchingFishReduxKtor);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeStepGranularity();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return Math.round(catchingFishGradleJUnit.CatchingFishLayout.CatchingFishCoroutine);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeTextAvailableSizes();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        return catchingFishGradleJUnit != null ? catchingFishGradleJUnit.CatchingFishLayout.CatchingFishWorkManager : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return catchingFishGradleJUnit.CatchingFishLayout.CatchingFishParcelableFAB;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return CatchingFishHiltMVPToast.CatchingFishRecyclerView(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit == null || CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return;
        }
        catchingFishGradleJUnit.CatchingFishLayout.CatchingFishParcelableFAB();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            CatchingFishHandlerIntent catchingFishHandlerIntent = catchingFishGradleJUnit.CatchingFishLayout;
            if (CatchingFishMVVMGraphQL.CatchingFishCoroutine || !catchingFishHandlerIntent.CatchingFishDaggerWebsocket()) {
                return;
            }
            catchingFishHandlerIntent.CatchingFishParcelableFAB();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().CatchingFishSnackbar(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishViewModelFAB(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishLayout(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishFragmentHandler(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(CatchingFishHiltMVPToast.CatchingFishDataStoreIntent(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().CatchingFishCoroutine(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((CatchingFishFirebaseDagger) getEmojiTextViewHelper().CatchingFishSnackbar.CatchingFishDaggerWebsocket).CatchingFishMVPRobolectric(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishParcelableFAB.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = CatchingFishMVVMGraphQL.CatchingFishCoroutine;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            CatchingFishHandlerIntent catchingFishHandlerIntent = catchingFishGradleJUnit.CatchingFishLayout;
            if (z || catchingFishHandlerIntent.CatchingFishDaggerWebsocket()) {
                return;
            }
            catchingFishHandlerIntent.CatchingFishWorkManager(i, f);
        }
    }
}
