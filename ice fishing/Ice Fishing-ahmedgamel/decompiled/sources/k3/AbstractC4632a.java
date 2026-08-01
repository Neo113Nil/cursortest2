package k3;

import android.R;
import com.icefishing.icefishingbigwin.C5275R;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4632a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f38629a = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, C5275R.attr.backgroundTint, C5275R.attr.behavior_draggable, C5275R.attr.behavior_expandedOffset, C5275R.attr.behavior_fitToContents, C5275R.attr.behavior_halfExpandedRatio, C5275R.attr.behavior_hideable, C5275R.attr.behavior_peekHeight, C5275R.attr.behavior_saveFlags, C5275R.attr.behavior_significantVelocityThreshold, C5275R.attr.behavior_skipCollapsed, C5275R.attr.gestureInsetBottomIgnored, C5275R.attr.marginLeftSystemWindowInsets, C5275R.attr.marginRightSystemWindowInsets, C5275R.attr.marginTopSystemWindowInsets, C5275R.attr.paddingBottomSystemWindowInsets, C5275R.attr.paddingLeftSystemWindowInsets, C5275R.attr.paddingRightSystemWindowInsets, C5275R.attr.paddingTopSystemWindowInsets, C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay, C5275R.attr.shouldRemoveExpandedCorners};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f38630b = {C5275R.attr.carousel_alignment, C5275R.attr.carousel_backwardTransition, C5275R.attr.carousel_emptyViewsBehavior, C5275R.attr.carousel_firstView, C5275R.attr.carousel_forwardTransition, C5275R.attr.carousel_infinite, C5275R.attr.carousel_nextState, C5275R.attr.carousel_previousState, C5275R.attr.carousel_touchUpMode, C5275R.attr.carousel_touchUp_dampeningFactor, C5275R.attr.carousel_touchUp_velocityThreshold};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f38631c = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, C5275R.attr.checkedIcon, C5275R.attr.checkedIconEnabled, C5275R.attr.checkedIconTint, C5275R.attr.checkedIconVisible, C5275R.attr.chipBackgroundColor, C5275R.attr.chipCornerRadius, C5275R.attr.chipEndPadding, C5275R.attr.chipIcon, C5275R.attr.chipIconEnabled, C5275R.attr.chipIconSize, C5275R.attr.chipIconTint, C5275R.attr.chipIconVisible, C5275R.attr.chipMinHeight, C5275R.attr.chipMinTouchTargetSize, C5275R.attr.chipStartPadding, C5275R.attr.chipStrokeColor, C5275R.attr.chipStrokeWidth, C5275R.attr.chipSurfaceColor, C5275R.attr.closeIcon, C5275R.attr.closeIconEnabled, C5275R.attr.closeIconEndPadding, C5275R.attr.closeIconSize, C5275R.attr.closeIconStartPadding, C5275R.attr.closeIconTint, C5275R.attr.closeIconVisible, C5275R.attr.ensureMinTouchTargetSize, C5275R.attr.hideMotionSpec, C5275R.attr.iconEndPadding, C5275R.attr.iconStartPadding, C5275R.attr.rippleColor, C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay, C5275R.attr.showMotionSpec, C5275R.attr.textEndPadding, C5275R.attr.textStartPadding};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f38632d = {C5275R.attr.clockFaceBackgroundColor, C5275R.attr.clockNumberTextColor};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f38633e = {C5275R.attr.clockHandColor, C5275R.attr.materialCircleRadius, C5275R.attr.selectorSize};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f38634f = {C5275R.attr.behavior_autoHide, C5275R.attr.behavior_autoShrink};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f38635g = {C5275R.attr.behavior_autoHide};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f38636h = {R.attr.foreground, R.attr.foregroundGravity, C5275R.attr.foregroundInsidePadding};
    public static final int[] i = {R.attr.inputType, R.attr.popupElevation, C5275R.attr.dropDownBackgroundTint, C5275R.attr.simpleItemLayout, C5275R.attr.simpleItemSelectedColor, C5275R.attr.simpleItemSelectedRippleColor, C5275R.attr.simpleItems};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f38637j = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, C5275R.attr.backgroundTint, C5275R.attr.backgroundTintMode, C5275R.attr.cornerRadius, C5275R.attr.elevation, C5275R.attr.icon, C5275R.attr.iconGravity, C5275R.attr.iconPadding, C5275R.attr.iconSize, C5275R.attr.iconTint, C5275R.attr.iconTintMode, C5275R.attr.rippleColor, C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay, C5275R.attr.strokeColor, C5275R.attr.strokeWidth, C5275R.attr.toggleCheckedStateOnClick};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f38638k = {R.attr.enabled, C5275R.attr.checkedButton, C5275R.attr.selectionRequired, C5275R.attr.singleSelection};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f38639l = {R.attr.windowFullscreen, C5275R.attr.backgroundTint, C5275R.attr.dayInvalidStyle, C5275R.attr.daySelectedStyle, C5275R.attr.dayStyle, C5275R.attr.dayTodayStyle, C5275R.attr.nestedScrollable, C5275R.attr.rangeFillColor, C5275R.attr.yearSelectedStyle, C5275R.attr.yearStyle, C5275R.attr.yearTodayStyle};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f38640m = {R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, C5275R.attr.itemFillColor, C5275R.attr.itemShapeAppearance, C5275R.attr.itemShapeAppearanceOverlay, C5275R.attr.itemStrokeColor, C5275R.attr.itemStrokeWidth, C5275R.attr.itemTextColor};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f38641n = {R.attr.button, C5275R.attr.buttonCompat, C5275R.attr.buttonIcon, C5275R.attr.buttonIconTint, C5275R.attr.buttonIconTintMode, C5275R.attr.buttonTint, C5275R.attr.centerIfNoTextEnabled, C5275R.attr.checkedState, C5275R.attr.errorAccessibilityLabel, C5275R.attr.errorShown, C5275R.attr.useMaterialThemeColors};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f38642o = {C5275R.attr.buttonTint, C5275R.attr.useMaterialThemeColors};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f38643p = {C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f38644q = {R.attr.letterSpacing, R.attr.lineHeight, C5275R.attr.lineHeight};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f38645r = {R.attr.textAppearance, R.attr.lineHeight, C5275R.attr.lineHeight};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f38646s = {C5275R.attr.logoAdjustViewBounds, C5275R.attr.logoScaleType, C5275R.attr.navigationIconTint, C5275R.attr.subtitleCentered, C5275R.attr.titleCentered};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f38647t = {C5275R.attr.materialCircleRadius};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f38648u = {C5275R.attr.behavior_overlapTop};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f38649v = {C5275R.attr.cornerFamily, C5275R.attr.cornerFamilyBottomLeft, C5275R.attr.cornerFamilyBottomRight, C5275R.attr.cornerFamilyTopLeft, C5275R.attr.cornerFamilyTopRight, C5275R.attr.cornerSize, C5275R.attr.cornerSizeBottomLeft, C5275R.attr.cornerSizeBottomRight, C5275R.attr.cornerSizeTopLeft, C5275R.attr.cornerSizeTopRight};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f38650w = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, C5275R.attr.backgroundTint, C5275R.attr.behavior_draggable, C5275R.attr.coplanarSiblingViewId, C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f38651x = {R.attr.maxWidth, C5275R.attr.actionTextColorAlpha, C5275R.attr.animationMode, C5275R.attr.backgroundOverlayColorAlpha, C5275R.attr.backgroundTint, C5275R.attr.backgroundTintMode, C5275R.attr.elevation, C5275R.attr.maxActionInlineWidth, C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f38652y = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, C5275R.attr.fontFamily, C5275R.attr.fontVariationSettings, C5275R.attr.textAllCaps, C5275R.attr.textLocale};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f38653z = {C5275R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f38627A = {R.attr.enabled, R.attr.textColorHint, R.attr.maxWidth, R.attr.minWidth, R.attr.hint, R.attr.maxEms, R.attr.minEms, C5275R.attr.boxBackgroundColor, C5275R.attr.boxBackgroundMode, C5275R.attr.boxCollapsedPaddingTop, C5275R.attr.boxCornerRadiusBottomEnd, C5275R.attr.boxCornerRadiusBottomStart, C5275R.attr.boxCornerRadiusTopEnd, C5275R.attr.boxCornerRadiusTopStart, C5275R.attr.boxStrokeColor, C5275R.attr.boxStrokeErrorColor, C5275R.attr.boxStrokeWidth, C5275R.attr.boxStrokeWidthFocused, C5275R.attr.counterEnabled, C5275R.attr.counterMaxLength, C5275R.attr.counterOverflowTextAppearance, C5275R.attr.counterOverflowTextColor, C5275R.attr.counterTextAppearance, C5275R.attr.counterTextColor, C5275R.attr.cursorColor, C5275R.attr.cursorErrorColor, C5275R.attr.endIconCheckable, C5275R.attr.endIconContentDescription, C5275R.attr.endIconDrawable, C5275R.attr.endIconMinSize, C5275R.attr.endIconMode, C5275R.attr.endIconScaleType, C5275R.attr.endIconTint, C5275R.attr.endIconTintMode, C5275R.attr.errorAccessibilityLiveRegion, C5275R.attr.errorContentDescription, C5275R.attr.errorEnabled, C5275R.attr.errorIconDrawable, C5275R.attr.errorIconTint, C5275R.attr.errorIconTintMode, C5275R.attr.errorTextAppearance, C5275R.attr.errorTextColor, C5275R.attr.expandedHintEnabled, C5275R.attr.helperText, C5275R.attr.helperTextEnabled, C5275R.attr.helperTextTextAppearance, C5275R.attr.helperTextTextColor, C5275R.attr.hintAnimationEnabled, C5275R.attr.hintEnabled, C5275R.attr.hintTextAppearance, C5275R.attr.hintTextColor, C5275R.attr.passwordToggleContentDescription, C5275R.attr.passwordToggleDrawable, C5275R.attr.passwordToggleEnabled, C5275R.attr.passwordToggleTint, C5275R.attr.passwordToggleTintMode, C5275R.attr.placeholderText, C5275R.attr.placeholderTextAppearance, C5275R.attr.placeholderTextColor, C5275R.attr.prefixText, C5275R.attr.prefixTextAppearance, C5275R.attr.prefixTextColor, C5275R.attr.shapeAppearance, C5275R.attr.shapeAppearanceOverlay, C5275R.attr.startIconCheckable, C5275R.attr.startIconContentDescription, C5275R.attr.startIconDrawable, C5275R.attr.startIconMinSize, C5275R.attr.startIconScaleType, C5275R.attr.startIconTint, C5275R.attr.startIconTintMode, C5275R.attr.suffixText, C5275R.attr.suffixTextAppearance, C5275R.attr.suffixTextColor};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f38628B = {R.attr.textAppearance, C5275R.attr.enforceMaterialTheme, C5275R.attr.enforceTextAppearance};
}
