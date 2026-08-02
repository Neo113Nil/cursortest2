package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.util.TimedValueQueue;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class EndCompoundLayout extends LinearLayout {
    public final AccessibilityManager accessibilityManager;
    public EditText editText;
    public final AnonymousClass1 editTextWatcher;
    public final LinkedHashSet endIconChangedListeners;
    public final TimedValueQueue endIconDelegates;
    public final FrameLayout endIconFrame;
    public int endIconMinSize;
    public int endIconMode;
    public View.OnLongClickListener endIconOnLongClickListener;
    public ColorStateList endIconTintList;
    public PorterDuff.Mode endIconTintMode;
    public final CheckableImageButton endIconView;
    public View.OnLongClickListener errorIconOnLongClickListener;
    public ColorStateList errorIconTintList;
    public PorterDuff.Mode errorIconTintMode;
    public final CheckableImageButton errorIconView;
    public boolean hintExpanded;
    public CharSequence suffixText;
    public final AppCompatTextView suffixTextView;
    public final TextInputLayout textInputLayout;
    public AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* renamed from: com.google.android.material.textfield.EndCompoundLayout$1, reason: invalid class name */
    public final class AnonymousClass1 extends TextWatcherAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ ViewGroup this$0;

        public /* synthetic */ AnonymousClass1(ViewGroup viewGroup, int i) {
            this.$r8$classId = i;
            this.this$0 = viewGroup;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i = this.$r8$classId;
            ViewGroup viewGroup = this.this$0;
            switch (i) {
                case 0:
                    ((EndCompoundLayout) viewGroup).getEndIconDelegate().afterEditTextChanged();
                    break;
                default:
                    ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) viewGroup;
                    if (!TextUtils.isEmpty(editable)) {
                        int i2 = ChipTextInputComboView.$r8$clinit;
                        String formatText = chipTextInputComboView.formatText(editable);
                        if (TextUtils.isEmpty(formatText)) {
                            formatText = chipTextInputComboView.formatText("00");
                        }
                        chipTextInputComboView.chipText = formatText;
                        break;
                    } else {
                        int i3 = ChipTextInputComboView.$r8$clinit;
                        chipTextInputComboView.chipText = chipTextInputComboView.formatText("00");
                        break;
                    }
            }
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    ((EndCompoundLayout) this.this$0).getEndIconDelegate().beforeEditTextChanged();
                    break;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.EndCompoundLayout$2, reason: invalid class name */
    public final class AnonymousClass2 {
        public AnonymousClass2() {
        }

        public final void onEditTextAttached(TextInputLayout textInputLayout) {
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            AnonymousClass1 anonymousClass1 = endCompoundLayout.editTextWatcher;
            EditText editText = endCompoundLayout.editText;
            if (editText == textInputLayout.editText) {
                return;
            }
            if (editText != null) {
                editText.removeTextChangedListener(anonymousClass1);
                if (endCompoundLayout.editText.getOnFocusChangeListener() == endCompoundLayout.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                    endCompoundLayout.editText.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.editText;
            endCompoundLayout.editText = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(anonymousClass1);
            }
            endCompoundLayout.getEndIconDelegate().onEditTextAttached(endCompoundLayout.editText);
            endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, GrpcMethod grpcMethod) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet();
        this.editTextWatcher = new AnonymousClass1(this, i);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (ContextUtilsKt.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.errorIconView = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (ContextUtilsKt.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.endIconView = checkableImageButton2;
        this.endIconDelegates = new TimedValueQueue(this, grpcMethod);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        TypedArray typedArray = (TypedArray) grpcMethod.requestAdapter;
        if (typedArray.hasValue(38)) {
            this.errorIconTintList = ContextUtilsKt.getColorStateList(getContext(), grpcMethod, 38);
        }
        if (typedArray.hasValue(39)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            setErrorIconDrawable(grpcMethod.getDrawable(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setCheckable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.endIconTintList = ContextUtilsKt.getColorStateList(getContext(), grpcMethod, 32);
            }
            if (typedArray.hasValue(33)) {
                this.endIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            setEndIconMode(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                setEndIconContentDescription(typedArray.getText(27));
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.endIconTintList = ContextUtilsKt.getColorStateList(getContext(), grpcMethod, 55);
            }
            if (typedArray.hasValue(56)) {
                this.endIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(56, -1), null);
            }
            setEndIconMode(typedArray.getBoolean(54, false) ? 1 : 0);
            setEndIconContentDescription(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.endIconMinSize) {
            this.endIconMinSize = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType convertScaleType = IconHelper.convertScaleType(typedArray.getInt(31, -1));
            checkableImageButton2.setScaleType(convertScaleType);
            checkableImageButton.setScaleType(convertScaleType);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(grpcMethod.getColorStateList(74));
        }
        CharSequence text = typedArray.getText(72);
        this.suffixText = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        updateSuffixTextVisibility();
        frameLayout.addView(checkableImageButton2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButton);
        checkableImageButton.setOnFocusableChangedListener(new CheckableImageButton.OnFocusableChangedListener(this) { // from class: com.google.android.material.textfield.EndCompoundLayout$$ExternalSyntheticLambda0
            public final /* synthetic */ EndCompoundLayout f$0;

            {
                this.f$0 = this;
            }

            @Override // com.google.android.material.internal.CheckableImageButton.OnFocusableChangedListener
            public final void onFocusableChanged() {
                int i3 = i;
                EndCompoundLayout endCompoundLayout = this.f$0;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton3 = endCompoundLayout.errorIconView;
                        IconHelper.updateIconTooltip(checkableImageButton3, checkableImageButton3.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton4 = endCompoundLayout.endIconView;
                        IconHelper.updateIconTooltip(checkableImageButton4, checkableImageButton4.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButton2.setOnFocusableChangedListener(new CheckableImageButton.OnFocusableChangedListener(this) { // from class: com.google.android.material.textfield.EndCompoundLayout$$ExternalSyntheticLambda0
            public final /* synthetic */ EndCompoundLayout f$0;

            {
                this.f$0 = this;
            }

            @Override // com.google.android.material.internal.CheckableImageButton.OnFocusableChangedListener
            public final void onFocusableChanged() {
                int i3 = i2;
                EndCompoundLayout endCompoundLayout = this.f$0;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton3 = endCompoundLayout.errorIconView;
                        IconHelper.updateIconTooltip(checkableImageButton3, checkableImageButton3.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton4 = endCompoundLayout.endIconView;
                        IconHelper.updateIconTooltip(checkableImageButton4, checkableImageButton4.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.editTextAttachedListeners.add(anonymousClass2);
        if (textInputLayout.editText != null) {
            anonymousClass2.onEditTextAttached(textInputLayout);
        }
        addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(this, 5));
    }

    public final EndIconDelegate getEndIconDelegate() {
        EndIconDelegate noEndIconDelegate;
        int i = this.endIconMode;
        TimedValueQueue timedValueQueue = this.endIconDelegates;
        SparseArray sparseArray = (SparseArray) timedValueQueue.timestamps;
        EndIconDelegate endIconDelegate = (EndIconDelegate) sparseArray.get(i);
        if (endIconDelegate != null) {
            return endIconDelegate;
        }
        EndCompoundLayout endCompoundLayout = (EndCompoundLayout) timedValueQueue.values;
        int i2 = 1;
        if (i == -1) {
            noEndIconDelegate = new NoEndIconDelegate(endCompoundLayout, i2);
        } else if (i == 0) {
            noEndIconDelegate = new NoEndIconDelegate(endCompoundLayout, 0);
        } else if (i == 1) {
            noEndIconDelegate = new PasswordToggleEndIconDelegate(endCompoundLayout, timedValueQueue.size);
        } else if (i == 2) {
            noEndIconDelegate = new ClearTextEndIconDelegate(endCompoundLayout);
        } else {
            if (i != 3) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid end icon mode: "));
                return null;
            }
            noEndIconDelegate = new DropdownMenuEndIconDelegate(endCompoundLayout);
        }
        sparseArray.append(i, noEndIconDelegate);
        return noEndIconDelegate;
    }

    public final int getSuffixTextEndOffset() {
        int marginStart;
        if (isEndIconVisible() || isErrorIconVisible()) {
            CheckableImageButton checkableImageButton = this.endIconView;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.suffixTextView.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public final boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public final void refreshIconState(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean isIconCheckable = endIconDelegate.isIconCheckable();
        CheckableImageButton checkableImageButton = this.endIconView;
        boolean z4 = true;
        if (!isIconCheckable || (z3 = checkableImageButton.checked) == endIconDelegate.isIconChecked()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(endIconDelegate instanceof DropdownMenuEndIconDelegate) || (isActivated = checkableImageButton.isActivated()) == ((DropdownMenuEndIconDelegate) endIconDelegate).editTextHasFocus) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            IconHelper.refreshIconDrawableState(this.textInputLayout, checkableImageButton, this.endIconTintList);
        }
    }

    public final void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.endIconView;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            IconHelper.updateIconTooltip(checkableImageButton, charSequence);
        }
    }

    public final void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
        this.endIconMode = i;
        Iterator it = this.endIconChangedListeners.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        setEndIconVisible(i != 0);
        EndIconDelegate endIconDelegate2 = getEndIconDelegate();
        int i2 = this.endIconDelegates.first;
        if (i2 == 0) {
            i2 = endIconDelegate2.getIconDrawableResId();
        }
        Drawable drawable = i2 != 0 ? DimensionKt.getDrawable(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.endIconView;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.textInputLayout;
        if (drawable != null) {
            IconHelper.applyIconTint(textInputLayout, checkableImageButton, this.endIconTintList, this.endIconTintMode);
            IconHelper.refreshIconDrawableState(textInputLayout, checkableImageButton, this.endIconTintList);
        }
        checkableImageButton.setCheckable(endIconDelegate2.isIconCheckable());
        if (!endIconDelegate2.isBoxBackgroundModeSupported(textInputLayout.boxBackgroundMode)) {
            a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(textInputLayout.boxBackgroundMode, i, " is not supported by the end icon mode ", new StringBuilder("The current box background mode ")));
            return;
        }
        endIconDelegate2.setUp();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = endIconDelegate2.getTouchExplorationStateChangeListener();
        this.touchExplorationStateChangeListener = touchExplorationStateChangeListener2;
        if (touchExplorationStateChangeListener2 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        View.OnClickListener onIconClickListener = endIconDelegate2.getOnIconClickListener();
        View.OnLongClickListener onLongClickListener = this.endIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onIconClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
        int iconContentDescriptionResId = endIconDelegate2.getIconContentDescriptionResId();
        setEndIconContentDescription(iconContentDescriptionResId != 0 ? getResources().getText(iconContentDescriptionResId) : null);
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate2.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate2);
        }
        IconHelper.applyIconTint(textInputLayout, checkableImageButton, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public final void setEndIconVisible(boolean z) {
        EditText editText;
        if (isEndIconVisible() != z) {
            CheckableImageButton checkableImageButton = this.endIconView;
            if (!z && checkableImageButton.hasFocus() && (editText = this.editText) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public final void setErrorIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.errorIconView;
        checkableImageButton.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, checkableImageButton, this.errorIconTintList, this.errorIconTintMode);
    }

    public final void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    public final void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || !((this.suffixText == null || this.hintExpanded) ? 8 : false)) ? 0 : 8);
    }

    public final void updateErrorIconVisibility() {
        CheckableImageButton checkableImageButton = this.errorIconView;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.textInputLayout;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.indicatorViewController.errorEnabled && textInputLayout.shouldShowError()) ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (this.endIconMode != 0) {
            return;
        }
        textInputLayout.updateDummyDrawables();
    }

    public final void updateSuffixTextViewPadding() {
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout.editText == null) {
            return;
        }
        this.suffixTextView.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : textInputLayout.editText.getPaddingEnd(), textInputLayout.editText.getPaddingBottom());
    }

    public final void updateSuffixTextVisibility() {
        AppCompatTextView appCompatTextView = this.suffixTextView;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        updateEndLayoutVisibility();
        appCompatTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }
}
