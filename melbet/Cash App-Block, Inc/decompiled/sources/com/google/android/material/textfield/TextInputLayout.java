package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;
import androidx.customview.view.AbsSavedState;
import androidx.media3.common.FlagSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.viewpager.widget.ViewPager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.stats.zza;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{R.attr.state_pressed}, new int[0]};
    public ValueAnimator animator;
    public boolean areCornerRadiiRtl;
    public MaterialShapeDrawable boxBackground;
    public boolean boxBackgroundApplied;
    public int boxBackgroundColor;
    public int boxBackgroundMode;
    public int boxCollapsedPaddingTopPx;
    public final int boxLabelCutoutPaddingPx;
    public int boxStrokeColor;
    public int boxStrokeWidthDefaultPx;
    public int boxStrokeWidthFocusedPx;
    public int boxStrokeWidthPx;
    public MaterialShapeDrawable boxUnderlineDefault;
    public MaterialShapeDrawable boxUnderlineFocused;
    public final CollapsingTextHelper collapsingTextHelper;
    public boolean counterEnabled;
    public int counterMaxLength;
    public int counterOverflowTextAppearance;
    public ColorStateList counterOverflowTextColor;
    public boolean counterOverflowed;
    public int counterTextAppearance;
    public ColorStateList counterTextColor;
    public AppCompatTextView counterView;
    public ColorStateList cursorColor;
    public ColorStateList cursorErrorColor;
    public int defaultFilledBackgroundColor;
    public ColorStateList defaultHintTextColor;
    public int defaultStrokeColor;
    public int disabledColor;
    public int disabledFilledBackgroundColor;
    public EditText editText;
    public final LinkedHashSet editTextAttachedListeners;
    public ColorDrawable endDummyDrawable;
    public int endDummyDrawableWidth;
    public final EndCompoundLayout endLayout;
    public boolean expandedHintEnabled;
    public final int extraSpaceBetweenPlaceholderAndHint;
    public StateListDrawable filledDropDownMenuBackground;
    public int focusedFilledBackgroundColor;
    public int focusedStrokeColor;
    public ColorStateList focusedTextColor;
    public boolean globalLayoutListenerAdded;
    public CharSequence hint;
    public boolean hintAnimationEnabled;
    public boolean hintEnabled;
    public boolean hintExpanded;
    public int hoveredFilledBackgroundColor;
    public int hoveredStrokeColor;
    public boolean inDrawableStateChanged;
    public final IndicatorViewController indicatorViewController;
    public final FrameLayout inputFrame;
    public boolean isProvidingHint;
    public LengthCounter lengthCounter;
    public int maxEms;
    public int maxWidth;
    public int minEms;
    public int minWidth;
    public Drawable originalEditTextEndDrawable;
    public int originalEditTextMinimumHeight;
    public CharSequence originalHint;
    public MaterialShapeDrawable outlinedDropDownMenuBackground;
    public boolean placeholderEnabled;
    public Fade placeholderFadeIn;
    public Fade placeholderFadeOut;
    public CharSequence placeholderText;
    public int placeholderTextAppearance;
    public ColorStateList placeholderTextColor;
    public AppCompatTextView placeholderTextView;
    public boolean restoringSavedState;
    public ShapeAppearanceModel shapeAppearanceModel;
    public ColorDrawable startDummyDrawable;
    public int startDummyDrawableWidth;
    public final StartCompoundLayout startLayout;
    public ColorStateList strokeErrorColor;
    public final Rect tmpBoundsRect;
    public final Rect tmpRect;
    public final RectF tmpRectF;
    public Typeface typeface;

    public final class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence;
            String str;
            AppCompatTextView appCompatTextView;
            this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
            TextInputLayout textInputLayout = this.layout;
            EditText editText = textInputLayout.editText;
            IndicatorViewController indicatorViewController = textInputLayout.indicatorViewController;
            CharSequence charSequence2 = null;
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence charSequence3 = textInputLayout.hintEnabled ? textInputLayout.hint : null;
            CharSequence charSequence4 = indicatorViewController.helperTextEnabled ? indicatorViewController.helperText : null;
            CharSequence error = textInputLayout.getError();
            CharSequence charSequence5 = textInputLayout.placeholderEnabled ? textInputLayout.placeholderText : null;
            int i = textInputLayout.counterMaxLength;
            if (textInputLayout.counterEnabled && textInputLayout.counterOverflowed && (appCompatTextView = textInputLayout.counterView) != null) {
                charSequence2 = appCompatTextView.getContentDescription();
            }
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(charSequence3);
            boolean z = textInputLayout.hintExpanded;
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (isEmpty3 && TextUtils.isEmpty(charSequence2)) ? false : true;
            String charSequence6 = !isEmpty2 ? charSequence3.toString() : "";
            CharSequence charSequence7 = charSequence2;
            if (TextUtils.isEmpty(charSequence4)) {
                charSequence = error;
            } else {
                charSequence = error;
                if (indicatorViewController.captionToShow == 2 && indicatorViewController.helperTextView != null && !TextUtils.isEmpty(indicatorViewController.helperText)) {
                    if (TextUtils.isEmpty(charSequence6)) {
                        str = charSequence4.toString();
                    } else {
                        str = charSequence6 + ", " + ((Object) charSequence4);
                    }
                    charSequence6 = str;
                }
            }
            StartCompoundLayout startCompoundLayout = textInputLayout.startLayout;
            View view2 = startCompoundLayout.prefixTextView;
            if (view2.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(view2);
                accessibilityNodeInfoCompat.setTraversalAfter(view2);
            } else {
                accessibilityNodeInfoCompat.setTraversalAfter(startCompoundLayout.startIconView);
            }
            if (!isEmpty) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(charSequence6)) {
                accessibilityNodeInfoCompat.setText(charSequence6);
                if (!z && charSequence5 != null) {
                    accessibilityNodeInfoCompat.setText(charSequence6 + ", " + ((Object) charSequence5));
                }
            } else if (charSequence5 != null) {
                accessibilityNodeInfoCompat.setText(charSequence5);
            }
            if (!TextUtils.isEmpty(charSequence6)) {
                accessibilityNodeInfo.setHintText(charSequence6);
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            }
            if (text == null || text.length() != i) {
                i = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(i);
            if (z2) {
                accessibilityNodeInfoCompat.setError(!isEmpty3 ? charSequence : charSequence7);
            }
            textInputLayout.endLayout.getEndIconDelegate().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.layout.endLayout.getEndIconDelegate().onPopulateAccessibilityEvent(accessibilityEvent);
        }
    }

    public interface LengthCounter {
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(17);
        public CharSequence error;
        public boolean isEndIconChecked;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, com.squareup.cash.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new IndicatorViewController(this);
        this.lengthCounter = new AesGcmSiv$$ExternalSyntheticLambda0(6);
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        this.globalLayoutListenerAdded = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.textSizeInterpolator = linearInterpolator;
        collapsingTextHelper.recalculate(false);
        collapsingTextHelper.positionInterpolator = linearInterpolator;
        collapsingTextHelper.recalculate(false);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        ViewUtils.checkCompatibleTheme(context2, attributeSet, i, com.squareup.cash.R.style.Widget_Design_TextInputLayout);
        int[] iArr = R$styleable.TextInputLayout;
        ViewUtils.checkTextAppearance(context2, attributeSet, iArr, i, com.squareup.cash.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.squareup.cash.R.style.Widget_Design_TextInputLayout);
        GrpcMethod grpcMethod = new GrpcMethod(context2, obtainStyledAttributes);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, grpcMethod);
        this.startLayout = startCompoundLayout;
        this.hintEnabled = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.hintAnimationEnabled = obtainStyledAttributes.getBoolean(47, true);
        this.expandedHintEnabled = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i, com.squareup.cash.R.style.Widget_Design_TextInputLayout).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.extraSpaceBetweenPlaceholderAndHint = getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.boxStrokeWidthDefaultPx = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        RealBugReportSenderFactory builder = this.shapeAppearanceModel.toBuilder();
        if (dimension >= RecyclerView.DECELERATION_RATE) {
            builder.endpoint = new AbsoluteCornerSize(dimension);
        }
        if (dimension2 >= RecyclerView.DECELERATION_RATE) {
            builder.backStackDumper = new AbsoluteCornerSize(dimension2);
        }
        if (dimension3 >= RecyclerView.DECELERATION_RATE) {
            builder.featureEligibilityDumper = new AbsoluteCornerSize(dimension3);
        }
        if (dimension4 >= RecyclerView.DECELERATION_RATE) {
            builder.cashDatabase = new AbsoluteCornerSize(dimension4);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = ContextUtilsKt.getColorStateList(context2, grpcMethod, 7);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateList2 = ResourcesCompat.getColorStateList(context2.getResources(), com.squareup.cash.R.color.mtrl_filled_background_color, context2.getTheme());
                this.disabledFilledBackgroundColor = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateList3 = grpcMethod.getColorStateList(1);
            this.focusedTextColor = colorStateList3;
            this.defaultHintTextColor = colorStateList3;
        }
        ColorStateList colorStateList4 = ContextUtilsKt.getColorStateList(context2, grpcMethod, 14);
        this.focusedStrokeColor = obtainStyledAttributes.getColor(14, 0);
        this.defaultStrokeColor = context2.getColor(com.squareup.cash.R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = context2.getColor(com.squareup.cash.R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = context2.getColor(com.squareup.cash.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(ContextUtilsKt.getColorStateList(context2, grpcMethod, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.cursorColor = grpcMethod.getColorStateList(24);
        this.cursorErrorColor = grpcMethod.getColorStateList(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i2 = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.counterTextAppearance = obtainStyledAttributes.getResourceId(22, 0);
        this.counterOverflowTextAppearance = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(grpcMethod.getColorStateList(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(grpcMethod.getColorStateList(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(grpcMethod.getColorStateList(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(grpcMethod.getColorStateList(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(grpcMethod.getColorStateList(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(grpcMethod.getColorStateList(59));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, grpcMethod);
        this.endLayout = endCompoundLayout;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        grpcMethod.recycle();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.inputFrame;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        EditText editText = (EditText) view;
        if (this.editText != null) {
            a$$ExternalSyntheticBUOutline0.m$3("We already have an EditText, can only have one");
            return;
        }
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (endCompoundLayout.endIconMode != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i2 = this.minEms;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.minWidth);
        }
        int i3 = this.maxEms;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface = this.editText.getTypeface();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean collapsedTypefaceInternal = collapsingTextHelper.setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = collapsingTextHelper.setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            collapsingTextHelper.recalculate(false);
        }
        collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        float letterSpacing = this.editText.getLetterSpacing();
        if (collapsingTextHelper.expandedLetterSpacing != letterSpacing) {
            collapsingTextHelper.expandedLetterSpacing = letterSpacing;
            collapsingTextHelper.recalculate(false);
        }
        int gravity = this.editText.getGravity();
        collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        collapsingTextHelper.setExpandedTextGravity(gravity);
        this.originalEditTextMinimumHeight = editText.getMinimumHeight();
        this.editText.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            public int previousLineCount;
            public final /* synthetic */ EditText val$editText;

            {
                this.val$editText = editText;
                this.previousLineCount = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.updateLabelState(!textInputLayout.restoringSavedState, false);
                if (textInputLayout.counterEnabled) {
                    textInputLayout.updateCounter(editable);
                }
                if (textInputLayout.placeholderEnabled) {
                    textInputLayout.updatePlaceholderText(editable);
                }
                EditText editText2 = this.val$editText;
                int lineCount = editText2.getLineCount();
                int i4 = this.previousLineCount;
                if (lineCount != i4) {
                    if (lineCount < i4) {
                        int minimumHeight = editText2.getMinimumHeight();
                        int i5 = textInputLayout.originalEditTextMinimumHeight;
                        if (minimumHeight != i5) {
                            editText2.setMinimumHeight(i5);
                        }
                    }
                    this.previousLineCount = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        updateCursorColor();
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startLayout.bringToFront();
        endCompoundLayout.bringToFront();
        Iterator it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            ((EndCompoundLayout.AnonymousClass2) it.next()).onEditTextAttached(this);
        }
        endCompoundLayout.updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    public final void adjustFilledEditTextPaddingForLargeFont() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper.expandedMaxLines != 1) {
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (collapsingTextHelper.getCollapsedTextHeight() + this.extraSpaceBetweenPlaceholderAndHint), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.editText;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_filled_edittext_font_2_0_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ContextUtilsKt.isFontScaleAtLeast1_3(getContext())) {
            EditText editText3 = this.editText;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_filled_edittext_font_1_3_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public final void animateToExpansionFraction(float f) {
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper.expandedFraction == f) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.squareup.cash.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.animator.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.squareup.cash.R.attr.motionDurationMedium4, 167));
            this.animator.addUpdateListener(new TabLayout.AnonymousClass1(this, 3));
        }
        this.animator.setFloatValues(collapsingTextHelper.expandedFraction, f);
        this.animator.start();
    }

    public final void applyBoxAttributes() {
        int i;
        int i2;
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (this.boxBackgroundMode == 2 && (i = this.boxStrokeWidthPx) > -1 && (i2 = this.boxStrokeColor) != 0) {
            MaterialShapeDrawable materialShapeDrawable2 = this.boxBackground;
            materialShapeDrawable2.drawableState.strokeWidth = i;
            materialShapeDrawable2.invalidateSelf();
            materialShapeDrawable2.setStrokeColor(ColorStateList.valueOf(i2));
        }
        int i3 = this.boxBackgroundColor;
        if (this.boxBackgroundMode == 1) {
            Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), com.squareup.cash.R.attr.colorSurface);
            i3 = ColorUtils.compositeColors(this.boxBackgroundColor, colorOrNull != null ? colorOrNull.intValue() : 0);
        }
        this.boxBackgroundColor = i3;
        this.boxBackground.setFillColor(ColorStateList.valueOf(i3));
        MaterialShapeDrawable materialShapeDrawable3 = this.boxUnderlineDefault;
        if (materialShapeDrawable3 != null && this.boxUnderlineFocused != null) {
            if (this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0) {
                materialShapeDrawable3.setFillColor(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
                this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
        updateEditTextBoxBackgroundIfNeeded();
    }

    public final Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.tmpBoundsRect;
        rect2.bottom = i;
        int i2 = this.boxBackgroundMode;
        if (i2 == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, z);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, z);
            return rect2;
        }
        rect2.left = this.editText.getPaddingLeft() + i3;
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    public final int calculateLabelMarginTop() {
        if (this.hintEnabled) {
            int i = this.boxBackgroundMode;
            CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
            if (i == 0) {
                return (int) collapsingTextHelper.getCollapsedTextHeight();
            }
            if (i == 2) {
                if (collapsingTextHelper.expandedMaxLines == 1) {
                    return (int) (collapsingTextHelper.getCollapsedTextHeight() / 2.0f);
                }
                float collapsedTextHeight = collapsingTextHelper.getCollapsedTextHeight();
                TextPaint textPaint = collapsingTextHelper.tmpPaint;
                textPaint.setTextSize(collapsingTextHelper.collapsedTextSize);
                textPaint.setTypeface(collapsingTextHelper.collapsedTypeface);
                textPaint.setLetterSpacing(collapsingTextHelper.collapsedLetterSpacing);
                return Math.max(0, (int) (collapsedTextHeight - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final Fade createPlaceholderFadeTransition() {
        Fade fade = new Fade();
        fade.mDuration = MotionUtils.resolveThemeDuration(getContext(), com.squareup.cash.R.attr.motionDurationShort2, 87);
        fade.mInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), com.squareup.cash.R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        return fade;
    }

    public final boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable$ImplApi18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.inputFrame;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.editText) {
                newChild.setHint(this.hintEnabled ? this.hint : null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z = this.hintEnabled;
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (z) {
            collapsingTextHelper.draw(canvas);
        }
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float f = collapsingTextHelper.expandedFraction;
            int centerX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(centerX, bounds2.left, f);
            bounds.right = AnimationUtils.lerp(centerX, bounds2.right, f);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            collapsingTextHelper.state = drawableState;
            ColorStateList colorStateList2 = collapsingTextHelper.collapsedTextColor;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = collapsingTextHelper.expandedTextColor) != null && colorStateList.isStateful())) {
                collapsingTextHelper.recalculate(false);
                z = true;
                if (this.editText != null) {
                    updateLabelState(isLaidOut() && isEnabled(), false);
                }
                updateEditTextBackground();
                updateTextInputBoxState();
                if (z) {
                    invalidate();
                }
                this.inDrawableStateChanged = false;
            }
        }
        z = false;
        if (this.editText != null) {
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (z) {
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.editText;
        if (editText == null) {
            return super.getBaseline();
        }
        return calculateLabelMarginTop() + getPaddingTop() + editText.getBaseline();
    }

    public final MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : RecyclerView.DECELERATION_RATE;
        EditText editText = this.editText;
        float dimensionPixelOffset2 = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).popupElevation : getResources().getDimensionPixelOffset(com.squareup.cash.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        RoundedCornerTreatment roundedCornerTreatment = new RoundedCornerTreatment();
        RoundedCornerTreatment roundedCornerTreatment2 = new RoundedCornerTreatment();
        RoundedCornerTreatment roundedCornerTreatment3 = new RoundedCornerTreatment();
        RoundedCornerTreatment roundedCornerTreatment4 = new RoundedCornerTreatment();
        Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
        Transition.AnonymousClass1 anonymousClass12 = new Transition.AnonymousClass1();
        Transition.AnonymousClass1 anonymousClass13 = new Transition.AnonymousClass1();
        Transition.AnonymousClass1 anonymousClass14 = new Transition.AnonymousClass1();
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f);
        AbsoluteCornerSize absoluteCornerSize2 = new AbsoluteCornerSize(f);
        AbsoluteCornerSize absoluteCornerSize3 = new AbsoluteCornerSize(dimensionPixelOffset);
        AbsoluteCornerSize absoluteCornerSize4 = new AbsoluteCornerSize(dimensionPixelOffset);
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        shapeAppearanceModel.topLeftCorner = roundedCornerTreatment;
        shapeAppearanceModel.topRightCorner = roundedCornerTreatment2;
        shapeAppearanceModel.bottomRightCorner = roundedCornerTreatment3;
        shapeAppearanceModel.bottomLeftCorner = roundedCornerTreatment4;
        shapeAppearanceModel.topLeftCornerSize = absoluteCornerSize;
        shapeAppearanceModel.topRightCornerSize = absoluteCornerSize2;
        shapeAppearanceModel.bottomRightCornerSize = absoluteCornerSize4;
        shapeAppearanceModel.bottomLeftCornerSize = absoluteCornerSize3;
        shapeAppearanceModel.topEdge = anonymousClass1;
        shapeAppearanceModel.rightEdge = anonymousClass12;
        shapeAppearanceModel.bottomEdge = anonymousClass13;
        shapeAppearanceModel.leftEdge = anonymousClass14;
        EditText editText2 = this.editText;
        ColorStateList colorStateList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).dropDownBackgroundTint : null;
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = MaterialShapeDrawable.clearPaint;
            colorStateList = ColorStateList.valueOf(MaterialColors.resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, com.squareup.cash.R.attr.colorSurface, "MaterialShapeDrawable")));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(dimensionPixelOffset2);
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.drawableState;
        if (materialShapeDrawableState.padding == null) {
            materialShapeDrawableState.padding = new Rect();
        }
        materialShapeDrawable.drawableState.padding.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final CharSequence getError() {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        if (indicatorViewController.errorEnabled) {
            return indicatorViewController.errorText;
        }
        return null;
    }

    public final int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z) {
            StartCompoundLayout startCompoundLayout = this.startLayout;
            if (startCompoundLayout.prefixText != null) {
                compoundPaddingLeft = startCompoundLayout.getPrefixTextStartOffset();
                return compoundPaddingLeft + i;
            }
        }
        if (z) {
            EndCompoundLayout endCompoundLayout = this.endLayout;
            if (endCompoundLayout.suffixText != null) {
                compoundPaddingLeft = endCompoundLayout.getSuffixTextEndOffset();
                return compoundPaddingLeft + i;
            }
        }
        compoundPaddingLeft = this.editText.getCompoundPaddingLeft();
        return compoundPaddingLeft + i;
    }

    public final int getLabelRightBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        int compoundPaddingRight;
        if (!z) {
            EndCompoundLayout endCompoundLayout = this.endLayout;
            if (endCompoundLayout.suffixText != null) {
                compoundPaddingRight = endCompoundLayout.getSuffixTextEndOffset();
                return i - compoundPaddingRight;
            }
        }
        if (z) {
            StartCompoundLayout startCompoundLayout = this.startLayout;
            if (startCompoundLayout.prefixText != null) {
                compoundPaddingRight = startCompoundLayout.getPrefixTextStartOffset();
                return i - compoundPaddingRight;
            }
        }
        compoundPaddingRight = this.editText.getCompoundPaddingRight();
        return i - compoundPaddingRight;
    }

    public final void onApplyBoxBackgroundMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        } else if (i == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable$ImplApi18)) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
                int i2 = CutoutDrawable$ImplApi18.$r8$clinit;
                if (shapeAppearanceModel == null) {
                    shapeAppearanceModel = new ShapeAppearanceModel();
                }
                CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState = new CutoutDrawable$CutoutDrawableState(shapeAppearanceModel, new RectF());
                CutoutDrawable$ImplApi18 cutoutDrawable$ImplApi18 = new CutoutDrawable$ImplApi18(cutoutDrawable$CutoutDrawableState);
                cutoutDrawable$ImplApi18.drawableState = cutoutDrawable$CutoutDrawableState;
                this.boxBackground = cutoutDrawable$ImplApi18;
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        if (this.boxBackgroundMode == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ContextUtilsKt.isFontScaleAtLeast1_3(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(com.squareup.cash.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.boxBackgroundMode;
                if (i3 == 2) {
                    if (this.outlinedDropDownMenuBackground == null) {
                        this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.outlinedDropDownMenuBackground);
                } else if (i3 == 1) {
                    if (this.filledDropDownMenuBackground == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.filledDropDownMenuBackground = stateListDrawable;
                        int[] iArr = {R.attr.state_above_anchor};
                        if (this.outlinedDropDownMenuBackground == null) {
                            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
                        }
                        stateListDrawable.addState(iArr, this.outlinedDropDownMenuBackground);
                        this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.filledDropDownMenuBackground);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.globalLayoutListenerAdded = false;
        if (this.editText != null && this.editText.getMeasuredHeight() < (max = Math.max(endCompoundLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            this.editText.setMinimumHeight(max);
            z = true;
        }
        boolean updateDummyDrawables = updateDummyDrawables();
        if (z || updateDummyDrawables) {
            this.editText.post(new KnotView$$ExternalSyntheticLambda1(this, 9));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float expandedTextFullSingleLineHeight;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
            if (materialShapeDrawable != null) {
                int i6 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i6 - this.boxStrokeWidthDefaultPx, rect.right, i6);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
            if (materialShapeDrawable2 != null) {
                int i7 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i7 - this.boxStrokeWidthFocusedPx, rect.right, i7);
            }
            if (this.hintEnabled) {
                float textSize = this.editText.getTextSize();
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                collapsingTextHelper.setExpandedTextSize(textSize);
                TextPaint textPaint = collapsingTextHelper.tmpPaint;
                int gravity = this.editText.getGravity();
                collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                collapsingTextHelper.setExpandedTextGravity(gravity);
                Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
                collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds.left, calculateCollapsedTextBounds.top, calculateCollapsedTextBounds.right, calculateCollapsedTextBounds.bottom);
                if (this.editText == null) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                if (collapsingTextHelper.expandedMaxLines == 1) {
                    textPaint.setTextSize(collapsingTextHelper.expandedTextSize);
                    textPaint.setTypeface(collapsingTextHelper.expandedTypeface);
                    textPaint.setLetterSpacing(collapsingTextHelper.expandedLetterSpacing);
                    expandedTextFullSingleLineHeight = -textPaint.ascent();
                } else {
                    expandedTextFullSingleLineHeight = collapsingTextHelper.getExpandedTextFullSingleLineHeight() * collapsingTextHelper.expandedLineCount;
                }
                int compoundPaddingLeft = this.editText.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.tmpBoundsRect;
                rect2.left = compoundPaddingLeft;
                if (this.boxBackgroundMode != 1 || this.editText.getMinLines() > 1) {
                    if (this.boxBackgroundMode != 0 || collapsingTextHelper.expandedMaxLines == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(collapsingTextHelper.expandedTextSize);
                        textPaint.setTypeface(collapsingTextHelper.expandedTypeface);
                        textPaint.setLetterSpacing(collapsingTextHelper.expandedLetterSpacing);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.editText.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (expandedTextFullSingleLineHeight / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.editText.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.boxBackgroundMode != 1 || this.editText.getMinLines() > 1) ? rect.bottom - this.editText.getCompoundPaddingBottom() : (int) (rect2.top + expandedTextFullSingleLineHeight);
                rect2.bottom = compoundPaddingBottom;
                collapsingTextHelper.setExpandedBounds(true, rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                collapsingTextHelper.recalculate(false);
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.globalLayoutListenerAdded;
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (!z) {
            endCompoundLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        if (this.placeholderTextView != null && (editText = this.editText) != null) {
            this.placeholderTextView.setGravity(editText.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
        endCompoundLayout.updateSuffixTextViewPadding();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper.expandedMaxLines == 1) {
            return;
        }
        int measuredWidth = (this.editText.getMeasuredWidth() - this.editText.getCompoundPaddingLeft()) - this.editText.getCompoundPaddingRight();
        TextPaint textPaint = collapsingTextHelper.tmpPaint;
        textPaint.setTextSize(collapsingTextHelper.collapsedTextSize);
        textPaint.setTypeface(collapsingTextHelper.collapsedTypeface);
        textPaint.setLetterSpacing(collapsingTextHelper.collapsedLetterSpacing);
        float f2 = measuredWidth;
        collapsingTextHelper.collapsedHeight = collapsingTextHelper.createStaticLayout(collapsingTextHelper.collapsedMaxLines, textPaint, collapsingTextHelper.text, (collapsingTextHelper.collapsedTextSize / collapsingTextHelper.expandedTextSize) * f2, collapsingTextHelper.isRtl).getHeight();
        textPaint.setTextSize(collapsingTextHelper.expandedTextSize);
        textPaint.setTypeface(collapsingTextHelper.expandedTypeface);
        textPaint.setLetterSpacing(collapsingTextHelper.expandedLetterSpacing);
        collapsingTextHelper.expandedHeight = collapsingTextHelper.createStaticLayout(collapsingTextHelper.expandedMaxLines, textPaint, collapsingTextHelper.text, f2, collapsingTextHelper.isRtl).getHeight();
        EditText editText2 = this.editText;
        Rect rect = this.tmpRect;
        DescendantOffsetUtils.getDescendantRect(this, editText2, rect);
        Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
        collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds.left, calculateCollapsedTextBounds.top, calculateCollapsedTextBounds.right, calculateCollapsedTextBounds.bottom);
        updateInputLayoutMargins();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.editText == null) {
            return;
        }
        int i3 = collapsingTextHelper.expandedHeight;
        if (i3 != -1) {
            f = i3;
        } else {
            TextPaint textPaint2 = collapsingTextHelper.tmpPaint;
            textPaint2.setTextSize(collapsingTextHelper.expandedTextSize);
            textPaint2.setTypeface(collapsingTextHelper.expandedTypeface);
            textPaint2.setLetterSpacing(collapsingTextHelper.expandedLetterSpacing);
            f = -textPaint2.ascent();
        }
        float f3 = f;
        CharSequence charSequence = this.placeholderText;
        float f4 = RecyclerView.DECELERATION_RATE;
        if (charSequence != null) {
            TextPaint textPaint3 = new TextPaint(EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            textPaint3.set(this.placeholderTextView.getPaint());
            textPaint3.setTextSize(this.placeholderTextView.getTextSize());
            textPaint3.setTypeface(this.placeholderTextView.getTypeface());
            textPaint3.setLetterSpacing(this.placeholderTextView.getLetterSpacing());
            try {
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.placeholderText, textPaint3, measuredWidth);
                staticLayoutBuilderCompat.isRtl = getLayoutDirection() == 1;
                staticLayoutBuilderCompat.includePad = true;
                float lineSpacingExtra = this.placeholderTextView.getLineSpacingExtra();
                float lineSpacingMultiplier = this.placeholderTextView.getLineSpacingMultiplier();
                staticLayoutBuilderCompat.lineSpacingAdd = lineSpacingExtra;
                staticLayoutBuilderCompat.lineSpacingMultiplier = lineSpacingMultiplier;
                staticLayoutBuilderCompat.staticLayoutBuilderConfigurer = new MaterialButton$$ExternalSyntheticLambda3(this, 3);
                f4 = staticLayoutBuilderCompat.build().getHeight() + (this.boxBackgroundMode == 1 ? collapsingTextHelper.getCollapsedTextHeight() + this.boxCollapsedPaddingTopPx + this.extraSpaceBetweenPlaceholderAndHint : 0.0f);
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float max = Math.max(f3, f4);
        if (this.editText.getMeasuredHeight() < max) {
            this.editText.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new zza(this, 10));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.areCornerRadiiRtl) {
            CornerSize cornerSize = this.shapeAppearanceModel.topLeftCornerSize;
            RectF rectF = this.tmpRectF;
            float cornerSize2 = cornerSize.getCornerSize(rectF);
            float cornerSize3 = this.shapeAppearanceModel.topRightCornerSize.getCornerSize(rectF);
            float cornerSize4 = this.shapeAppearanceModel.bottomLeftCornerSize.getCornerSize(rectF);
            float cornerSize5 = this.shapeAppearanceModel.bottomRightCornerSize.getCornerSize(rectF);
            ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
            ResToolsKt resToolsKt = shapeAppearanceModel.topLeftCorner;
            ResToolsKt resToolsKt2 = shapeAppearanceModel.topRightCorner;
            ResToolsKt resToolsKt3 = shapeAppearanceModel.bottomLeftCorner;
            ResToolsKt resToolsKt4 = shapeAppearanceModel.bottomRightCorner;
            Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
            Transition.AnonymousClass1 anonymousClass12 = new Transition.AnonymousClass1();
            Transition.AnonymousClass1 anonymousClass13 = new Transition.AnonymousClass1();
            Transition.AnonymousClass1 anonymousClass14 = new Transition.AnonymousClass1();
            AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(cornerSize3);
            AbsoluteCornerSize absoluteCornerSize2 = new AbsoluteCornerSize(cornerSize2);
            AbsoluteCornerSize absoluteCornerSize3 = new AbsoluteCornerSize(cornerSize5);
            AbsoluteCornerSize absoluteCornerSize4 = new AbsoluteCornerSize(cornerSize4);
            ShapeAppearanceModel shapeAppearanceModel2 = new ShapeAppearanceModel();
            shapeAppearanceModel2.topLeftCorner = resToolsKt2;
            shapeAppearanceModel2.topRightCorner = resToolsKt;
            shapeAppearanceModel2.bottomRightCorner = resToolsKt3;
            shapeAppearanceModel2.bottomLeftCorner = resToolsKt4;
            shapeAppearanceModel2.topLeftCornerSize = absoluteCornerSize;
            shapeAppearanceModel2.topRightCornerSize = absoluteCornerSize2;
            shapeAppearanceModel2.bottomRightCornerSize = absoluteCornerSize4;
            shapeAppearanceModel2.bottomLeftCornerSize = absoluteCornerSize3;
            shapeAppearanceModel2.topEdge = anonymousClass1;
            shapeAppearanceModel2.rightEdge = anonymousClass12;
            shapeAppearanceModel2.bottomEdge = anonymousClass13;
            shapeAppearanceModel2.leftEdge = anonymousClass14;
            this.areCornerRadiiRtl = z;
            setShapeAppearanceModel(shapeAppearanceModel2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.error = getError();
        }
        EndCompoundLayout endCompoundLayout = this.endLayout;
        savedState.isEndIconChecked = endCompoundLayout.endIconMode != 0 && endCompoundLayout.endIconView.checked;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openCutout() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (cutoutEnabled()) {
            int width = this.editText.getWidth();
            int gravity = this.editText.getGravity();
            CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
            boolean calculateIsRtl = collapsingTextHelper.calculateIsRtl(collapsingTextHelper.text);
            collapsingTextHelper.isRtl = calculateIsRtl;
            Rect rect = collapsingTextHelper.collapsedBounds;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (calculateIsRtl) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = collapsingTextHelper.collapsedTextWidth;
                    }
                } else if (calculateIsRtl) {
                    f = rect.right;
                    f2 = collapsingTextHelper.collapsedTextWidth;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.tmpRectF;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (collapsingTextHelper.collapsedTextWidth / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (collapsingTextHelper.isRtl) {
                        f5 = collapsingTextHelper.collapsedTextWidth;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (collapsingTextHelper.isRtl) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = collapsingTextHelper.collapsedTextWidth;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = collapsingTextHelper.getCollapsedTextHeight() + rect.top;
                if (collapsingTextHelper.textLayout != null && !collapsingTextHelper.shouldTruncateCollapsedToSingleLine()) {
                    StaticLayout staticLayout = collapsingTextHelper.textLayout;
                    float lineWidth = (collapsingTextHelper.collapsedTextSize / collapsingTextHelper.expandedTextSize) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (collapsingTextHelper.isRtl) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > RecyclerView.DECELERATION_RATE || rectF.height() <= RecyclerView.DECELERATION_RATE) {
                }
                float f6 = rectF.left;
                float f7 = this.boxLabelCutoutPaddingPx;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
                rectF.top = RecyclerView.DECELERATION_RATE;
                CutoutDrawable$ImplApi18 cutoutDrawable$ImplApi18 = (CutoutDrawable$ImplApi18) this.boxBackground;
                cutoutDrawable$ImplApi18.getClass();
                cutoutDrawable$ImplApi18.setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = collapsingTextHelper.collapsedTextWidth / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.tmpRectF;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (collapsingTextHelper.collapsedTextWidth / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = collapsingTextHelper.getCollapsedTextHeight() + rect.top;
            if (collapsingTextHelper.textLayout != null) {
                StaticLayout staticLayout2 = collapsingTextHelper.textLayout;
                float lineWidth2 = (collapsingTextHelper.collapsedTextSize / collapsingTextHelper.expandedTextSize) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (collapsingTextHelper.isRtl) {
                }
            }
            if (rectF.width() > RecyclerView.DECELERATION_RATE) {
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public void setBoxCornerFamily(int i) {
        RealBugReportSenderFactory builder = this.shapeAppearanceModel.toBuilder();
        CornerSize cornerSize = this.shapeAppearanceModel.topLeftCornerSize;
        builder.bugReportService = RetryKt.createCornerTreatment(i);
        builder.endpoint = cornerSize;
        CornerSize cornerSize2 = this.shapeAppearanceModel.topRightCornerSize;
        builder.sessionManager = RetryKt.createCornerTreatment(i);
        builder.backStackDumper = cornerSize2;
        CornerSize cornerSize3 = this.shapeAppearanceModel.bottomLeftCornerSize;
        builder.preferences = RetryKt.createCornerTreatment(i);
        builder.cashDatabase = cornerSize3;
        CornerSize cornerSize4 = this.shapeAppearanceModel.bottomRightCornerSize;
        builder.tempStorage = RetryKt.createCornerTreatment(i);
        builder.featureEligibilityDumper = cornerSize4;
        this.shapeAppearanceModel = builder.build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean z = getLayoutDirection() == 1;
        this.areCornerRadiiRtl = z;
        float f5 = z ? f2 : f;
        if (!z) {
            f = f2;
        }
        float f6 = z ? f4 : f3;
        if (!z) {
            f3 = f4;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f5 && this.boxBackground.getTopRightCornerResolvedSize() == f) {
            MaterialShapeDrawable materialShapeDrawable2 = this.boxBackground;
            float[] fArr = materialShapeDrawable2.springAnimatedCornerSizes;
            if ((fArr != null ? fArr[2] : materialShapeDrawable2.drawableState.shapeAppearance.getDefaultShape().bottomLeftCornerSize.getCornerSize(materialShapeDrawable2.getBoundsAsRectF$1())) == f6) {
                MaterialShapeDrawable materialShapeDrawable3 = this.boxBackground;
                float[] fArr2 = materialShapeDrawable3.springAnimatedCornerSizes;
                if ((fArr2 != null ? fArr2[1] : materialShapeDrawable3.drawableState.shapeAppearance.getDefaultShape().bottomRightCornerSize.getCornerSize(materialShapeDrawable3.getBoundsAsRectF$1())) == f3) {
                    return;
                }
            }
        }
        RealBugReportSenderFactory builder = this.shapeAppearanceModel.toBuilder();
        builder.endpoint = new AbsoluteCornerSize(f5);
        builder.backStackDumper = new AbsoluteCornerSize(f);
        builder.cashDatabase = new AbsoluteCornerSize(f6);
        builder.featureEligibilityDumper = new AbsoluteCornerSize(f3);
        this.shapeAppearanceModel = builder.build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            IndicatorViewController indicatorViewController = this.indicatorViewController;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(com.squareup.cash.R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                indicatorViewController.addIndicator(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                if (this.counterView != null) {
                    EditText editText = this.editText;
                    updateCounter(editText != null ? editText.getText() : null);
                }
            } else {
                indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (!this.counterEnabled || this.counterView == null) {
                return;
            }
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (shouldShowError() || (this.counterView != null && this.counterOverflowed)) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endLayout.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endLayout.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.setEndIconContentDescription(i != 0 ? endCompoundLayout.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        Drawable drawable = i != 0 ? DimensionKt.getDrawable(endCompoundLayout.getContext(), i) : null;
        TextInputLayout textInputLayout = endCompoundLayout.textInputLayout;
        CheckableImageButton checkableImageButton = endCompoundLayout.endIconView;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(textInputLayout, checkableImageButton, endCompoundLayout.endIconTintList, endCompoundLayout.endIconTintMode);
            IconHelper.refreshIconDrawableState(textInputLayout, checkableImageButton, endCompoundLayout.endIconTintList);
        }
    }

    public void setEndIconMinSize(int i) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (i < 0) {
            endCompoundLayout.getClass();
            a$$ExternalSyntheticBUOutline0.m$3("endIconSize cannot be less than 0");
        } else if (i != endCompoundLayout.endIconMinSize) {
            endCompoundLayout.endIconMinSize = i;
            CheckableImageButton checkableImageButton = endCompoundLayout.endIconView;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = endCompoundLayout.errorIconView;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.endLayout.setEndIconMode(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        CheckableImageButton checkableImageButton = endCompoundLayout.endIconView;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.endIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.endIconOnLongClickListener = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.endIconView;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.endIconView.setScaleType(scaleType);
        endCompoundLayout.errorIconView.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (endCompoundLayout.endIconTintList != colorStateList) {
            endCompoundLayout.endIconTintList = colorStateList;
            IconHelper.applyIconTint(endCompoundLayout.textInputLayout, endCompoundLayout.endIconView, colorStateList, endCompoundLayout.endIconTintMode);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (endCompoundLayout.endIconTintMode != mode) {
            endCompoundLayout.endIconTintMode = mode;
            IconHelper.applyIconTint(endCompoundLayout.textInputLayout, endCompoundLayout.endIconView, endCompoundLayout.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.endLayout.setEndIconVisible(z);
    }

    public void setError(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        if (!indicatorViewController.errorEnabled) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            indicatorViewController.hideError();
            return;
        }
        indicatorViewController.cancelCaptionAnimator();
        indicatorViewController.errorText = charSequence;
        indicatorViewController.errorView.setText(charSequence);
        int i = indicatorViewController.captionDisplayed;
        if (i != 1) {
            indicatorViewController.captionToShow = 1;
        }
        indicatorViewController.updateCaptionViewsVisibility(i, indicatorViewController.captionToShow, indicatorViewController.shouldAnimateCaptionView(indicatorViewController.errorView, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        indicatorViewController.errorViewAccessibilityLiveRegion = i;
        AppCompatTextView appCompatTextView = indicatorViewController.errorView;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        indicatorViewController.errorViewContentDescription = charSequence;
        AppCompatTextView appCompatTextView = indicatorViewController.errorView;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        TextInputLayout textInputLayout = indicatorViewController.textInputView;
        if (indicatorViewController.errorEnabled == z) {
            return;
        }
        indicatorViewController.cancelCaptionAnimator();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.context);
            indicatorViewController.errorView = appCompatTextView;
            appCompatTextView.setId(com.squareup.cash.R.id.textinput_error);
            indicatorViewController.errorView.setTextAlignment(5);
            Typeface typeface = indicatorViewController.typeface;
            if (typeface != null) {
                indicatorViewController.errorView.setTypeface(typeface);
            }
            int i = indicatorViewController.errorTextAppearance;
            indicatorViewController.errorTextAppearance = i;
            AppCompatTextView appCompatTextView2 = indicatorViewController.errorView;
            if (appCompatTextView2 != null) {
                indicatorViewController.textInputView.setTextAppearanceCompatWithErrorFallback(appCompatTextView2, i);
            }
            ColorStateList colorStateList = indicatorViewController.errorViewTextColor;
            indicatorViewController.errorViewTextColor = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.errorView;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = indicatorViewController.errorViewContentDescription;
            indicatorViewController.errorViewContentDescription = charSequence;
            AppCompatTextView appCompatTextView4 = indicatorViewController.errorView;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = indicatorViewController.errorViewAccessibilityLiveRegion;
            indicatorViewController.errorViewAccessibilityLiveRegion = i2;
            AppCompatTextView appCompatTextView5 = indicatorViewController.errorView;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            indicatorViewController.errorView.setVisibility(4);
            indicatorViewController.addIndicator(indicatorViewController.errorView, 0);
        } else {
            indicatorViewController.hideError();
            indicatorViewController.removeIndicator(indicatorViewController.errorView, 0);
            indicatorViewController.errorView = null;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        indicatorViewController.errorEnabled = z;
    }

    public void setErrorIconDrawable(int i) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.setErrorIconDrawable(i != 0 ? DimensionKt.getDrawable(endCompoundLayout.getContext(), i) : null);
        IconHelper.refreshIconDrawableState(endCompoundLayout.textInputLayout, endCompoundLayout.errorIconView, endCompoundLayout.errorIconTintList);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        CheckableImageButton checkableImageButton = endCompoundLayout.errorIconView;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.errorIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.errorIconOnLongClickListener = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.errorIconView;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (endCompoundLayout.errorIconTintList != colorStateList) {
            endCompoundLayout.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(endCompoundLayout.textInputLayout, endCompoundLayout.errorIconView, colorStateList, endCompoundLayout.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (endCompoundLayout.errorIconTintMode != mode) {
            endCompoundLayout.errorIconTintMode = mode;
            IconHelper.applyIconTint(endCompoundLayout.textInputLayout, endCompoundLayout.errorIconView, endCompoundLayout.errorIconTintList, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        indicatorViewController.errorTextAppearance = i;
        AppCompatTextView appCompatTextView = indicatorViewController.errorView;
        if (appCompatTextView != null) {
            indicatorViewController.textInputView.setTextAppearanceCompatWithErrorFallback(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        indicatorViewController.errorViewTextColor = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.errorView;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        if (isEmpty) {
            if (indicatorViewController.helperTextEnabled) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!indicatorViewController.helperTextEnabled) {
            setHelperTextEnabled(true);
        }
        indicatorViewController.cancelCaptionAnimator();
        indicatorViewController.helperText = charSequence;
        indicatorViewController.helperTextView.setText(charSequence);
        int i = indicatorViewController.captionDisplayed;
        if (i != 2) {
            indicatorViewController.captionToShow = 2;
        }
        indicatorViewController.updateCaptionViewsVisibility(i, indicatorViewController.captionToShow, indicatorViewController.shouldAnimateCaptionView(indicatorViewController.helperTextView, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        indicatorViewController.helperTextViewTextColor = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.helperTextView;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        TextInputLayout textInputLayout = indicatorViewController.textInputView;
        if (indicatorViewController.helperTextEnabled == z) {
            return;
        }
        indicatorViewController.cancelCaptionAnimator();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.context);
            indicatorViewController.helperTextView = appCompatTextView;
            appCompatTextView.setId(com.squareup.cash.R.id.textinput_helper_text);
            indicatorViewController.helperTextView.setTextAlignment(5);
            Typeface typeface = indicatorViewController.typeface;
            if (typeface != null) {
                indicatorViewController.helperTextView.setTypeface(typeface);
            }
            indicatorViewController.helperTextView.setVisibility(4);
            indicatorViewController.helperTextView.setImportantForAccessibility(2);
            int i = indicatorViewController.helperTextTextAppearance;
            indicatorViewController.helperTextTextAppearance = i;
            AppCompatTextView appCompatTextView2 = indicatorViewController.helperTextView;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = indicatorViewController.helperTextViewTextColor;
            indicatorViewController.helperTextViewTextColor = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.helperTextView;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            indicatorViewController.addIndicator(indicatorViewController.helperTextView, 1);
        } else {
            indicatorViewController.cancelCaptionAnimator();
            int i2 = indicatorViewController.captionDisplayed;
            if (i2 == 2) {
                indicatorViewController.captionToShow = 0;
            }
            indicatorViewController.updateCaptionViewsVisibility(i2, indicatorViewController.captionToShow, indicatorViewController.shouldAnimateCaptionView(indicatorViewController.helperTextView, ""));
            indicatorViewController.removeIndicator(indicatorViewController.helperTextView, 1);
            indicatorViewController.helperTextView = null;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        indicatorViewController.helperTextEnabled = z;
    }

    public void setHelperTextTextAppearance(int i) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        indicatorViewController.helperTextTextAppearance = i;
        AppCompatTextView appCompatTextView = indicatorViewController.helperTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            if (!TextUtils.equals(charSequence, this.hint)) {
                this.hint = charSequence;
                this.collapsingTextHelper.setText(charSequence);
                if (!this.hintExpanded) {
                    openCutout();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (z) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                if (!TextUtils.equals(null, this.hint)) {
                    this.hint = null;
                    this.collapsingTextHelper.setText(null);
                    if (!this.hintExpanded) {
                        openCutout();
                    }
                }
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintMaxLines(int i) {
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (i != collapsingTextHelper.collapsedMaxLines) {
            collapsingTextHelper.collapsedMaxLines = i;
            collapsingTextHelper.recalculate(false);
        }
        collapsingTextHelper.setExpandedMaxLines(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        collapsingTextHelper.setCollapsedTextAppearance(i);
        this.focusedTextColor = collapsingTextHelper.collapsedTextColor;
        if (this.editText != null) {
            updateLabelState(false, false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false, false);
            }
        }
    }

    public void setLengthCounter(LengthCounter lengthCounter) {
        this.lengthCounter = lengthCounter;
    }

    public void setMaxEms(int i) {
        this.maxEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.minEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.endIconView.setContentDescription(i != 0 ? endCompoundLayout.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.endIconView.setImageDrawable(i != 0 ? DimensionKt.getDrawable(endCompoundLayout.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (z && endCompoundLayout.endIconMode != 1) {
            endCompoundLayout.setEndIconMode(1);
        } else if (z) {
            endCompoundLayout.getClass();
        } else {
            endCompoundLayout.setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.endIconTintList = colorStateList;
        IconHelper.applyIconTint(endCompoundLayout.textInputLayout, endCompoundLayout.endIconView, colorStateList, endCompoundLayout.endIconTintMode);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.endIconTintMode = mode;
        IconHelper.applyIconTint(endCompoundLayout.textInputLayout, endCompoundLayout.endIconView, endCompoundLayout.endIconTintList, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(com.squareup.cash.R.id.textinput_placeholder);
            this.placeholderTextView.setImportantForAccessibility(1);
            this.placeholderTextView.setAccessibilityLiveRegion(1);
            Fade createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.mStartDelay = 67L;
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
            ViewCompat.setAccessibilityDelegate(this.placeholderTextView, new AnonymousClass2(i));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        AppCompatTextView appCompatTextView = this.placeholderTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            AppCompatTextView appCompatTextView = this.placeholderTextView;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.placeholderTextView;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.placeholderTextView = null;
        } else if (appCompatTextView != null) {
            this.inputFrame.addView(appCompatTextView);
            this.placeholderTextView.setVisibility(0);
        }
        this.placeholderEnabled = z;
    }

    public void setPrefixText(CharSequence charSequence) {
        StartCompoundLayout startCompoundLayout = this.startLayout;
        startCompoundLayout.getClass();
        startCompoundLayout.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        startCompoundLayout.prefixTextView.setText(charSequence);
        startCompoundLayout.updateVisibility();
    }

    public void setPrefixTextAppearance(int i) {
        this.startLayout.prefixTextView.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.prefixTextView.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.shapeAppearanceModel = shapeAppearanceModel;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z) {
        this.startLayout.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        StartCompoundLayout startCompoundLayout = this.startLayout;
        if (i < 0) {
            startCompoundLayout.getClass();
            a$$ExternalSyntheticBUOutline0.m$3("startIconSize cannot be less than 0");
        } else if (i != startCompoundLayout.startIconMinSize) {
            startCompoundLayout.startIconMinSize = i;
            CheckableImageButton checkableImageButton = startCompoundLayout.startIconView;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.startLayout;
        CheckableImageButton checkableImageButton = startCompoundLayout.startIconView;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.startIconOnLongClickListener;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.startLayout;
        startCompoundLayout.startIconOnLongClickListener = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.startIconView;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startLayout.startIconView.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.startLayout;
        if (startCompoundLayout.startIconTintList != colorStateList) {
            startCompoundLayout.startIconTintList = colorStateList;
            IconHelper.applyIconTint(startCompoundLayout.textInputLayout, startCompoundLayout.startIconView, colorStateList, startCompoundLayout.startIconTintMode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.startLayout;
        if (startCompoundLayout.startIconTintMode != mode) {
            startCompoundLayout.startIconTintMode = mode;
            IconHelper.applyIconTint(startCompoundLayout.textInputLayout, startCompoundLayout.startIconView, startCompoundLayout.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.startLayout.setStartIconVisible(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        endCompoundLayout.getClass();
        endCompoundLayout.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        endCompoundLayout.suffixTextView.setText(charSequence);
        endCompoundLayout.updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i) {
        this.endLayout.suffixTextView.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.endLayout.suffixTextView.setTextColor(colorStateList);
    }

    public final void setTextAppearanceCompatWithErrorFallback(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.squareup.cash.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.squareup.cash.R.color.design_error));
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
            boolean collapsedTypefaceInternal = collapsingTextHelper.setCollapsedTypefaceInternal(typeface);
            boolean expandedTypefaceInternal = collapsingTextHelper.setExpandedTypefaceInternal(typeface);
            if (collapsedTypefaceInternal || expandedTypefaceInternal) {
                collapsingTextHelper.recalculate(false);
            }
            IndicatorViewController indicatorViewController = this.indicatorViewController;
            if (typeface != indicatorViewController.typeface) {
                indicatorViewController.typeface = typeface;
                AppCompatTextView appCompatTextView = indicatorViewController.errorView;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = indicatorViewController.helperTextView;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.counterView;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final boolean shouldShowError() {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        return (indicatorViewController.captionToShow != 1 || indicatorViewController.errorView == null || TextUtils.isEmpty(indicatorViewController.errorText)) ? false : true;
    }

    public final void updateCounter(Editable editable) {
        ((AesGcmSiv$$ExternalSyntheticLambda0) this.lengthCounter).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.counterOverflowed;
        int i = this.counterMaxLength;
        if (i == -1) {
            this.counterView.setText(String.valueOf(length));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = length > i;
            Context context = getContext();
            this.counterView.setContentDescription(context.getString(this.counterOverflowed ? com.squareup.cash.R.string.character_counter_overflowed_content_description : com.squareup.cash.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.counterMaxLength)));
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            String str = BidiFormatter.LRM_STRING;
            BidiFormatter bidiFormatter = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? BidiFormatter.DEFAULT_RTL_INSTANCE : BidiFormatter.DEFAULT_LTR_INSTANCE;
            AppCompatTextView appCompatTextView = this.counterView;
            String string2 = getContext().getString(com.squareup.cash.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.counterMaxLength));
            bidiFormatter.getClass();
            FlagSet.Builder builder = TextDirectionHeuristicsCompat.LTR;
            appCompatTextView.setText(string2 != null ? bidiFormatter.unicodeWrap(string2).toString() : null);
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false, false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public final void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.counterView;
        if (appCompatTextView != null) {
            setTextAppearanceCompatWithErrorFallback(appCompatTextView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    public final void updateCursorColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.cursorColor;
        if (colorStateList2 == null) {
            colorStateList2 = MaterialColors.getColorStateListOrNull(getContext(), com.squareup.cash.R.attr.colorControlActivated);
        }
        EditText editText = this.editText;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.editText.getTextCursorDrawable().mutate();
        if ((shouldShowError() || (this.counterView != null && this.counterOverflowed)) && (colorStateList = this.cursorErrorColor) != null) {
            colorStateList2 = colorStateList;
        }
        mutate.setTintList(colorStateList2);
    }

    public final boolean updateDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        StartCompoundLayout startCompoundLayout = this.startLayout;
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((startCompoundLayout.startIconView.getDrawable() != null || (startCompoundLayout.prefixText != null && startCompoundLayout.prefixTextView.getVisibility() == 0)) && startCompoundLayout.getMeasuredWidth() > 0) {
            int max = Math.max(0, startCompoundLayout.getMeasuredWidth() - this.editText.getPaddingLeft());
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != max) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = max;
                colorDrawable.setBounds(0, 0, max, 1);
            }
            Drawable[] compoundDrawablesRelative = this.editText.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            ColorDrawable colorDrawable2 = this.startDummyDrawable;
            if (drawable != colorDrawable2) {
                this.editText.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] compoundDrawablesRelative2 = this.editText.getCompoundDrawablesRelative();
                this.editText.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.startDummyDrawable = null;
                z = true;
            }
            z = false;
        }
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if ((endCompoundLayout.isErrorIconVisible() || ((endCompoundLayout.endIconMode != 0 && endCompoundLayout.isEndIconVisible()) || endCompoundLayout.suffixText != null)) && endCompoundLayout.getMeasuredWidth() > 0) {
            int measuredWidth = endCompoundLayout.suffixTextView.getMeasuredWidth() - this.editText.getPaddingRight();
            if (endCompoundLayout.isErrorIconVisible()) {
                checkableImageButton = endCompoundLayout.errorIconView;
            } else if (endCompoundLayout.endIconMode != 0 && endCompoundLayout.isEndIconVisible()) {
                checkableImageButton = endCompoundLayout.endIconView;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int max2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.editText.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.endDummyDrawable;
            if (colorDrawable3 != null && this.endDummyDrawableWidth != max2) {
                this.endDummyDrawableWidth = max2;
                colorDrawable3.setBounds(0, 0, max2, 1);
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.endDummyDrawable = colorDrawable4;
                this.endDummyDrawableWidth = max2;
                colorDrawable4.setBounds(0, 0, max2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.endDummyDrawable;
            if (drawable2 != colorDrawable5) {
                this.originalEditTextEndDrawable = drawable2;
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.endDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative4 = this.editText.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
            return z2;
        }
        return z;
    }

    public final void updateEditTextBackground() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = DrawableUtils.CHECKED_STATE_SET;
        Drawable mutate = background.mutate();
        if (shouldShowError()) {
            AppCompatTextView appCompatTextView2 = this.indicatorViewController.errorView;
            mutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (appCompatTextView = this.counterView) != null) {
            mutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.editText.refreshDrawableState();
        }
    }

    public final void updateEditTextBoxBackgroundIfNeeded() {
        Drawable drawable;
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            EditText editText2 = this.editText;
            if ((editText2 instanceof AutoCompleteTextView) && editText2.getInputType() == 0) {
                EditText editText3 = this.editText;
                int resolveColor = MaterialColors.resolveColor(editText3.getContext(), MaterialAttributes.resolveTypedValueOrThrow(editText3, com.squareup.cash.R.attr.colorControlHighlight));
                int i = this.boxBackgroundMode;
                int[][] iArr = EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
                if (i == 2) {
                    Context context = getContext();
                    MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
                    int resolveColor2 = MaterialColors.resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, com.squareup.cash.R.attr.colorSurface, "TextInputLayout"));
                    MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
                    int layer = MaterialColors.layer(0.1f, resolveColor, resolveColor2);
                    materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{layer, 0}));
                    materialShapeDrawable2.setTint(resolveColor2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{layer, resolveColor2});
                    MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
                    materialShapeDrawable3.setTint(-1);
                    drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
                } else if (i == 1) {
                    MaterialShapeDrawable materialShapeDrawable4 = this.boxBackground;
                    int i2 = this.boxBackgroundColor;
                    drawable = new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(0.1f, resolveColor, i2), i2}), materialShapeDrawable4, materialShapeDrawable4);
                } else {
                    drawable = null;
                }
            } else {
                drawable = this.boxBackground;
            }
            this.editText.setBackground(drawable);
            this.boxBackgroundApplied = true;
        }
    }

    public final void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            FrameLayout frameLayout = this.inputFrame;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                frameLayout.requestLayout();
            }
        }
    }

    public final void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (colorStateList2 != null) {
            collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            int i = this.disabledColor;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(i));
        } else if (shouldShowError()) {
            AppCompatTextView appCompatTextView2 = this.indicatorViewController.errorView;
            collapsingTextHelper.setCollapsedAndExpandedTextColor(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.counterOverflowed && (appCompatTextView = this.counterView) != null) {
            collapsingTextHelper.setCollapsedAndExpandedTextColor(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        EndCompoundLayout endCompoundLayout = this.endLayout;
        StartCompoundLayout startCompoundLayout = this.startLayout;
        if (z3 || !this.expandedHintEnabled || (isEnabled() && z4)) {
            if (z2 || this.hintExpanded) {
                ValueAnimator valueAnimator = this.animator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.animator.cancel();
                }
                if (z && this.hintAnimationEnabled) {
                    animateToExpansionFraction(1.0f);
                } else {
                    collapsingTextHelper.setExpansionFraction(1.0f);
                }
                this.hintExpanded = false;
                if (cutoutEnabled()) {
                    openCutout();
                }
                EditText editText3 = this.editText;
                updatePlaceholderText(editText3 != null ? editText3.getText() : null);
                startCompoundLayout.hintExpanded = false;
                startCompoundLayout.updateVisibility();
                endCompoundLayout.hintExpanded = false;
                endCompoundLayout.updateSuffixTextVisibility();
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.animator.cancel();
            }
            if (z && this.hintAnimationEnabled) {
                animateToExpansionFraction(RecyclerView.DECELERATION_RATE);
            } else {
                collapsingTextHelper.setExpansionFraction(RecyclerView.DECELERATION_RATE);
            }
            if (cutoutEnabled() && !((CutoutDrawable$ImplApi18) this.boxBackground).drawableState.cutoutBounds.isEmpty() && cutoutEnabled()) {
                ((CutoutDrawable$ImplApi18) this.boxBackground).setCutout(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            }
            this.hintExpanded = true;
            AppCompatTextView appCompatTextView3 = this.placeholderTextView;
            if (appCompatTextView3 != null && this.placeholderEnabled) {
                appCompatTextView3.setText((CharSequence) null);
                TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeOut);
                this.placeholderTextView.setVisibility(4);
            }
            startCompoundLayout.hintExpanded = true;
            startCompoundLayout.updateVisibility();
            endCompoundLayout.hintExpanded = true;
            endCompoundLayout.updateSuffixTextVisibility();
        }
    }

    public final void updatePlaceholderText(Editable editable) {
        ((AesGcmSiv$$ExternalSyntheticLambda0) this.lengthCounter).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.inputFrame;
        if (length != 0 || this.hintExpanded) {
            AppCompatTextView appCompatTextView = this.placeholderTextView;
            if (appCompatTextView == null || !this.placeholderEnabled) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(frameLayout, this.placeholderFadeOut);
            this.placeholderTextView.setVisibility(4);
            return;
        }
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        TransitionManager.beginDelayedTransition(frameLayout, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
    }

    public final void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public final void updateTextInputBoxState() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z, z2);
            } else {
                AppCompatTextView appCompatTextView2 = this.indicatorViewController.errorView;
                this.boxStrokeColor = appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1;
            }
        } else if (!this.counterOverflowed || (appCompatTextView = this.counterView) == null) {
            if (z) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z2) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z, z2);
        } else {
            this.boxStrokeColor = appCompatTextView.getCurrentTextColor();
        }
        updateCursorColor();
        EndCompoundLayout endCompoundLayout = this.endLayout;
        TextInputLayout textInputLayout = endCompoundLayout.textInputLayout;
        TextInputLayout textInputLayout2 = endCompoundLayout.textInputLayout;
        CheckableImageButton checkableImageButton = endCompoundLayout.endIconView;
        endCompoundLayout.updateErrorIconVisibility();
        IconHelper.refreshIconDrawableState(textInputLayout2, endCompoundLayout.errorIconView, endCompoundLayout.errorIconTintList);
        IconHelper.refreshIconDrawableState(textInputLayout2, checkableImageButton, endCompoundLayout.endIconTintList);
        if (endCompoundLayout.getEndIconDelegate() instanceof DropdownMenuEndIconDelegate) {
            if (!textInputLayout.shouldShowError() || checkableImageButton.getDrawable() == null) {
                IconHelper.applyIconTint(textInputLayout, checkableImageButton, endCompoundLayout.endIconTintList, endCompoundLayout.endIconTintMode);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                AppCompatTextView appCompatTextView3 = textInputLayout.indicatorViewController.errorView;
                mutate.setTint(appCompatTextView3 != null ? appCompatTextView3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        StartCompoundLayout startCompoundLayout = this.startLayout;
        IconHelper.refreshIconDrawableState(startCompoundLayout.textInputLayout, startCompoundLayout.startIconView, startCompoundLayout.startIconTintList);
        if (this.boxBackgroundMode == 2) {
            int i = this.boxStrokeWidthPx;
            if (z && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i && cutoutEnabled() && !this.hintExpanded) {
                if (cutoutEnabled()) {
                    ((CutoutDrawable$ImplApi18) this.boxBackground).setCutout(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                }
                openCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z2 && !z) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
        if (endCompoundLayout.endIconMode == 3) {
            EditText editText3 = this.editText;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                checkableImageButton.setFocusable(false);
                checkableImageButton.setClickable(false);
            } else {
                checkableImageButton.setFocusable(true);
                checkableImageButton.setClickable(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$2, reason: invalid class name */
    public final class AnonymousClass2 extends AccessibilityDelegateCompat {
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass2(ViewPager viewPager) {
            this.$r8$classId = 2;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            switch (this.$r8$classId) {
                case 1:
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    accessibilityEvent.setClassName(ScrollView.class.getName());
                    accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                    accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                    accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                    accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                    accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                    break;
                case 2:
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    accessibilityEvent.setClassName(ViewPager.class.getName());
                    accessibilityEvent.setScrollable(false);
                    accessibilityEvent.getEventType();
                    break;
                default:
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    break;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            int i = this.$r8$classId;
            View.AccessibilityDelegate accessibilityDelegate = this.mOriginalDelegate;
            switch (i) {
                case 0:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                    break;
                case 1:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                    if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                        accessibilityNodeInfoCompat.setScrollable(true);
                        if (nestedScrollView.getScrollY() > 0) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                        }
                        if (nestedScrollView.getScrollY() < scrollRange) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                            break;
                        }
                    }
                    break;
                case 2:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
                    accessibilityNodeInfoCompat.setScrollable(false);
                    break;
                case 3:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setCollectionInfo(null);
                    break;
                case 4:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setScrollable(false);
                    break;
                default:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setCollectionInfo(null);
                    break;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            if (r5 != 16908346) goto L34;
         */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            switch (this.$r8$classId) {
                case 1:
                    if (!super.performAccessibilityAction(view, i, bundle)) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        if (nestedScrollView.isEnabled()) {
                            int height = nestedScrollView.getHeight();
                            Rect rect = new Rect();
                            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                                height = rect.height();
                            }
                            if (i != 4096) {
                                if (i != 8192 && i != 16908344) {
                                    break;
                                } else {
                                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                                    if (max != nestedScrollView.getScrollY()) {
                                        nestedScrollView.smoothScrollBy(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                        break;
                                    }
                                }
                            }
                            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                            if (min != nestedScrollView.getScrollY()) {
                                nestedScrollView.smoothScrollBy(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                                break;
                            }
                        }
                        break;
                    }
                    break;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endLayout.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endLayout.endIconView.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.endLayout.setErrorIconDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.endLayout;
        TextInputLayout textInputLayout = endCompoundLayout.textInputLayout;
        CheckableImageButton checkableImageButton = endCompoundLayout.endIconView;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(textInputLayout, checkableImageButton, endCompoundLayout.endIconTintList, endCompoundLayout.endIconTintMode);
            IconHelper.refreshIconDrawableState(textInputLayout, checkableImageButton, endCompoundLayout.endIconTintList);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
