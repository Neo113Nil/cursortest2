package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCompoundButtonHelper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import coil3.size.DimensionKt;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponentKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public boolean broadcasting;
    public Drawable buttonDrawable;
    public Drawable buttonIconDrawable;
    public ColorStateList buttonIconTintList;
    public PorterDuff.Mode buttonIconTintMode;
    public ColorStateList buttonTintList;
    public boolean centerIfNoTextEnabled;
    public int checkedState;
    public int[] currentStateChecked;
    public CharSequence customStateDescription;
    public CharSequence errorAccessibilityLabel;
    public boolean errorShown;
    public ColorStateList materialThemeColorsTintList;
    public CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    public final LinkedHashSet onCheckedStateChangedListeners;
    public final LinkedHashSet onErrorChangedListeners;
    public final AnimatedVectorDrawableCompat transitionToUnchecked;
    public final AnonymousClass1 transitionToUncheckedCallback;
    public boolean useMaterialThemeColors;
    public boolean usingMaterialButtonDrawable;
    public static final int[] INDETERMINATE_STATE_SET = {R.attr.state_indeterminate};
    public static final int[] ERROR_STATE_SET = {R.attr.state_error};
    public static final int[][] CHECKBOX_STATES = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$1, reason: invalid class name */
    public final class AnonymousClass1 extends Animatable2Compat$AnimationCallback {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ View this$0;

        public /* synthetic */ AnonymousClass1(View view, int i) {
            this.$r8$classId = i;
            this.this$0 = view;
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            int i = this.$r8$classId;
            View view = this.this$0;
            switch (i) {
                case 0:
                    ColorStateList colorStateList = ((MaterialCheckBox) view).buttonTintList;
                    if (colorStateList != null) {
                        drawable.setTintList(colorStateList);
                        break;
                    }
                    break;
                case 1:
                    BaseProgressIndicator baseProgressIndicator = (BaseProgressIndicator) view;
                    baseProgressIndicator.setIndeterminate(false);
                    baseProgressIndicator.setProgressCompat(baseProgressIndicator.storedProgress, baseProgressIndicator.storedProgressAnimated);
                    break;
                default:
                    BaseProgressIndicator baseProgressIndicator2 = (BaseProgressIndicator) view;
                    if (!baseProgressIndicator2.isIndeterminateModeChangeRequested) {
                        baseProgressIndicator2.setVisibility(baseProgressIndicator2.visibilityAfterHide);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            switch (this.$r8$classId) {
                case 0:
                    MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.this$0;
                    ColorStateList colorStateList = materialCheckBox.buttonTintList;
                    if (colorStateList != null) {
                        drawable.setTint(colorStateList.getColorForState(materialCheckBox.currentStateChecked, colorStateList.getDefaultColor()));
                        break;
                    }
                    break;
            }
        }
    }

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new zzb(11);
        public int checkedState;

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.checkedState;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.checkedState));
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i);
        ColorStateList colorStateList;
        this.onErrorChangedListeners = new LinkedHashSet();
        this.onCheckedStateChangedListeners = new LinkedHashSet();
        Context context2 = getContext();
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context2);
        Drawable drawable = ResourcesCompat.getDrawable(context2.getResources(), R.drawable.mtrl_checkbox_button_checked_unchecked, context2.getTheme());
        drawable.setCallback(animatedVectorDrawableCompat.mCallback);
        new GifDrawable.GifState(drawable.getConstantState(), 1);
        animatedVectorDrawableCompat.mDelegateDrawable = drawable;
        this.transitionToUnchecked = animatedVectorDrawableCompat;
        this.transitionToUncheckedCallback = new AnonymousClass1(this, 0);
        Context context3 = getContext();
        this.buttonDrawable = this.buttonDrawable;
        ColorStateList colorStateList2 = this.buttonTintList;
        if (colorStateList2 == null) {
            if (super.getButtonTintList() != null) {
                colorStateList2 = super.getButtonTintList();
            } else {
                AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCompoundButtonHelper;
                colorStateList2 = appCompatCompoundButtonHelper != null ? appCompatCompoundButtonHelper.mButtonTintList : null;
            }
        }
        this.buttonTintList = colorStateList2;
        setSupportButtonTintList(null);
        ViewUtils.checkCompatibleTheme(context3, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = R$styleable.MaterialCheckBox;
        ViewUtils.checkTextAppearance(context3, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        GrpcMethod grpcMethod = new GrpcMethod(context3, obtainStyledAttributes);
        this.buttonIconDrawable = grpcMethod.getDrawable(2);
        if (this.buttonDrawable != null && MaterialAttributes.resolveBoolean(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.buttonDrawable = DimensionKt.getDrawable(context3, R.drawable.mtrl_checkbox_button);
                this.usingMaterialButtonDrawable = true;
                if (this.buttonIconDrawable == null) {
                    this.buttonIconDrawable = DimensionKt.getDrawable(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.buttonIconTintList = ContextUtilsKt.getColorStateList(context3, grpcMethod, 3);
        this.buttonIconTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = obtainStyledAttributes.getBoolean(11, false);
        this.centerIfNoTextEnabled = obtainStyledAttributes.getBoolean(6, true);
        this.errorShown = obtainStyledAttributes.getBoolean(9, false);
        this.errorAccessibilityLabel = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        if (obtainStyledAttributes.hasValue(10) && (colorStateList = ContextUtilsKt.getColorStateList(context3, grpcMethod, 10)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateList);
            }
        }
        grpcMethod.recycle();
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.checkedState == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.checkedState == 2) {
            View.mergeDrawableStates(onCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (this.errorShown) {
            View.mergeDrawableStates(onCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = SelfieUtilsKt.getCheckedState(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.centerIfNoTextEnabled || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.DECELERATION_RATE);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.errorShown) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.errorAccessibilityLabel));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checkedState = this.checkedState;
        return savedState;
    }

    public final void refreshButtonDrawable() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Transition.AnonymousClass3 anonymousClass3;
        this.buttonDrawable = SelfieUtilsKt.createTintableMutatedDrawableIfNeeded$1(this.buttonDrawable, this.buttonTintList, getButtonTintMode());
        this.buttonIconDrawable = SelfieUtilsKt.createTintableMutatedDrawableIfNeeded$1(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        if (this.usingMaterialButtonDrawable) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.transitionToUnchecked;
            if (animatedVectorDrawableCompat != null) {
                AnonymousClass1 anonymousClass1 = this.transitionToUncheckedCallback;
                if (anonymousClass1 != null) {
                    Drawable drawable = animatedVectorDrawableCompat.mDelegateDrawable;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (anonymousClass1.mPlatformCallback == null) {
                            anonymousClass1.mPlatformCallback = new Animatable2Compat$AnimationCallback.AnonymousClass1();
                        }
                        AnimatedVectorDrawableCompat.Api23Impl.unregisterAnimationCallback(animatedVectorDrawable, anonymousClass1.mPlatformCallback);
                    }
                    ArrayList arrayList = animatedVectorDrawableCompat.mAnimationCallbacks;
                    if (arrayList != null) {
                        arrayList.remove(anonymousClass1);
                        if (animatedVectorDrawableCompat.mAnimationCallbacks.size() == 0 && (anonymousClass3 = animatedVectorDrawableCompat.mAnimatorListener) != null) {
                            animatedVectorDrawableCompat.mAnimatedVectorState.mAnimatorSet.removeListener(anonymousClass3);
                            animatedVectorDrawableCompat.mAnimatorListener = null;
                        }
                    }
                }
                animatedVectorDrawableCompat.registerAnimationCallback(anonymousClass1);
            }
            Drawable drawable2 = this.buttonDrawable;
            if ((drawable2 instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable3 = this.buttonDrawable;
        if (drawable3 != null && (colorStateList2 = this.buttonTintList) != null) {
            drawable3.setTintList(colorStateList2);
        }
        Drawable drawable4 = this.buttonIconDrawable;
        if (drawable4 != null && (colorStateList = this.buttonIconTintList) != null) {
            drawable4.setTintList(colorStateList);
        }
        super.setButtonDrawable(SelfieUtilsKt.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable, -1, -1));
        refreshDrawableState();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.centerIfNoTextEnabled = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i) {
            this.checkedState = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            LinkedHashSet linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    InputCheckboxGroupComponentKt$$ExternalSyntheticLambda0 inputCheckboxGroupComponentKt$$ExternalSyntheticLambda0 = (InputCheckboxGroupComponentKt$$ExternalSyntheticLambda0) it.next();
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = inputCheckboxGroupComponentKt$$ExternalSyntheticLambda0.f$0;
                    ArrayList arrayList = inputCheckboxGroupComponentKt$$ExternalSyntheticLambda0.f$1;
                    BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        String str = null;
                        if (it2.hasNext()) {
                            MaterialCheckBox materialCheckBox = (MaterialCheckBox) it2.next();
                            if (materialCheckBox.isChecked()) {
                                Object tag = materialCheckBox.getTag();
                                tag.getClass();
                                str = (String) tag;
                            }
                            if (str != null) {
                                linkedHashSet2.add(str);
                            }
                        }
                    }
                    bitmapController.getClass();
                    StateFlowImpl stateFlowImpl = bitmapController._bitmapValue;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, linkedHashSet2);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
        }
    }

    public final void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        int i = this.checkedState;
        super.setStateDescription(i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.errorShown == z) {
            return;
        }
        this.errorShown = z;
        refreshDrawableState();
        Iterator it = this.onErrorChangedListeners.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (!z) {
            setButtonTintList(null);
            return;
        }
        if (this.materialThemeColorsTintList == null) {
            int resolveColor = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorControlActivated));
            int resolveColor2 = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorError));
            int resolveColor3 = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorSurface));
            int resolveColor4 = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorOnSurface));
            this.materialThemeColorsTintList = new ColorStateList(CHECKBOX_STATES, new int[]{MaterialColors.layer(1.0f, resolveColor3, resolveColor2), MaterialColors.layer(1.0f, resolveColor3, resolveColor), MaterialColors.layer(0.54f, resolveColor3, resolveColor4), MaterialColors.layer(0.38f, resolveColor3, resolveColor4), MaterialColors.layer(0.38f, resolveColor3, resolveColor4)});
        }
        setButtonTintList(this.materialThemeColorsTintList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }
}
