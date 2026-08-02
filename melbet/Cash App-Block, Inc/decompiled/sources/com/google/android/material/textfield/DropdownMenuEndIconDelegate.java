package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.stripe.hcaptcha.HCaptchaDialogFragment$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.shared.WindowUtilsKt;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class DropdownMenuEndIconDelegate extends EndIconDelegate {
    public AccessibilityManager accessibilityManager;
    public final int animationFadeInDuration;
    public final TimeInterpolator animationFadeInterpolator;
    public final int animationFadeOutDuration;
    public AutoCompleteTextView autoCompleteTextView;
    public long dropdownPopupActivatedAt;
    public boolean dropdownPopupDirty;
    public boolean editTextHasFocus;
    public ValueAnimator fadeInAnim;
    public ValueAnimator fadeOutAnim;
    public boolean isEndIconChecked;
    public final GiftCardEditor$$ExternalSyntheticLambda0 onEditTextFocusChangeListener;
    public final Q0$$ExternalSyntheticLambda0 onIconClickListener;
    public final DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 touchExplorationStateChangeListener;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5] */
    public DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new Q0$$ExternalSyntheticLambda0(this, 11);
        this.onEditTextFocusChangeListener = new GiftCardEditor$$ExternalSyntheticLambda0(this, 4);
        this.touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                AutoCompleteTextView autoCompleteTextView = dropdownMenuEndIconDelegate.autoCompleteTextView;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                dropdownMenuEndIconDelegate.endIconView.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
        this.animationFadeInDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 67);
        this.animationFadeOutDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 50);
        this.animationFadeInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void afterEditTextChanged() {
        if (this.accessibilityManager.isTouchExplorationEnabled() && WindowUtilsKt.isEditable(this.autoCompleteTextView) && !this.endIconView.hasFocus()) {
            this.autoCompleteTextView.dismissDropDown();
        }
        this.autoCompleteTextView.post(new KnotView$$ExternalSyntheticLambda1(this, 8));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconContentDescriptionResId() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconDrawableResId() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onEditTextFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.touchExplorationStateChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isBoxBackgroundModeSupported(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isIconChecked() {
        return this.isEndIconChecked;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onEditTextAttached(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.autoCompleteTextView = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new HCaptchaDialogFragment$$ExternalSyntheticLambda1(this, 2));
        this.autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.dropdownPopupDirty = true;
                dropdownMenuEndIconDelegate.dropdownPopupActivatedAt = SystemClock.uptimeMillis();
                dropdownMenuEndIconDelegate.setEndIconChecked(false);
            }
        });
        this.autoCompleteTextView.setThreshold(0);
        TextInputLayout textInputLayout = this.textInputLayout;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.accessibilityManager.isTouchExplorationEnabled()) {
            this.endIconView.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
        if (!WindowUtilsKt.isEditable(this.autoCompleteTextView)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!this.accessibilityManager.isEnabled() || WindowUtilsKt.isEditable(this.autoCompleteTextView)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.isEndIconChecked && !this.autoCompleteTextView.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            showHideDropdown();
            this.dropdownPopupDirty = true;
            this.dropdownPopupActivatedAt = SystemClock.uptimeMillis();
        }
    }

    public final void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void setUp() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        TimeInterpolator timeInterpolator = this.animationFadeInterpolator;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.animationFadeInDuration);
        ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 9));
        this.fadeInAnim = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.animationFadeOutDuration);
        ofFloat2.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 9));
        this.fadeOutAnim = ofFloat2;
        ofFloat2.addListener(new Transition.AnonymousClass3(this, 11));
        this.accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
    }

    public final void showHideDropdown() {
        if (this.autoCompleteTextView == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.dropdownPopupActivatedAt;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.dropdownPopupDirty = false;
        }
        if (this.dropdownPopupDirty) {
            this.dropdownPopupDirty = false;
            return;
        }
        setEndIconChecked(!this.isEndIconChecked);
        boolean z = this.isEndIconChecked;
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.autoCompleteTextView.showDropDown();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void tearDown() {
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.autoCompleteTextView.setOnDismissListener(null);
        }
    }
}
