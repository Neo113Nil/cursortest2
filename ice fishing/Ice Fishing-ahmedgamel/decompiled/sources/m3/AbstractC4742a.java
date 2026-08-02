package m3;

import android.R;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4742a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f39418a = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, C5248R.attr.backgroundTint, C5248R.attr.behavior_draggable, C5248R.attr.behavior_expandedOffset, C5248R.attr.behavior_fitToContents, C5248R.attr.behavior_halfExpandedRatio, C5248R.attr.behavior_hideable, C5248R.attr.behavior_peekHeight, C5248R.attr.behavior_saveFlags, C5248R.attr.behavior_significantVelocityThreshold, C5248R.attr.behavior_skipCollapsed, C5248R.attr.gestureInsetBottomIgnored, C5248R.attr.marginLeftSystemWindowInsets, C5248R.attr.marginRightSystemWindowInsets, C5248R.attr.marginTopSystemWindowInsets, C5248R.attr.paddingBottomSystemWindowInsets, C5248R.attr.paddingLeftSystemWindowInsets, C5248R.attr.paddingRightSystemWindowInsets, C5248R.attr.paddingTopSystemWindowInsets, C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay, C5248R.attr.shouldRemoveExpandedCorners};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f39419b = {C5248R.attr.carousel_alignment, C5248R.attr.carousel_backwardTransition, C5248R.attr.carousel_emptyViewsBehavior, C5248R.attr.carousel_firstView, C5248R.attr.carousel_forwardTransition, C5248R.attr.carousel_infinite, C5248R.attr.carousel_nextState, C5248R.attr.carousel_previousState, C5248R.attr.carousel_touchUpMode, C5248R.attr.carousel_touchUp_dampeningFactor, C5248R.attr.carousel_touchUp_velocityThreshold};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f39420c = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, C5248R.attr.checkedIcon, C5248R.attr.checkedIconEnabled, C5248R.attr.checkedIconTint, C5248R.attr.checkedIconVisible, C5248R.attr.chipBackgroundColor, C5248R.attr.chipCornerRadius, C5248R.attr.chipEndPadding, C5248R.attr.chipIcon, C5248R.attr.chipIconEnabled, C5248R.attr.chipIconSize, C5248R.attr.chipIconTint, C5248R.attr.chipIconVisible, C5248R.attr.chipMinHeight, C5248R.attr.chipMinTouchTargetSize, C5248R.attr.chipStartPadding, C5248R.attr.chipStrokeColor, C5248R.attr.chipStrokeWidth, C5248R.attr.chipSurfaceColor, C5248R.attr.closeIcon, C5248R.attr.closeIconEnabled, C5248R.attr.closeIconEndPadding, C5248R.attr.closeIconSize, C5248R.attr.closeIconStartPadding, C5248R.attr.closeIconTint, C5248R.attr.closeIconVisible, C5248R.attr.ensureMinTouchTargetSize, C5248R.attr.hideMotionSpec, C5248R.attr.iconEndPadding, C5248R.attr.iconStartPadding, C5248R.attr.rippleColor, C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay, C5248R.attr.showMotionSpec, C5248R.attr.textEndPadding, C5248R.attr.textStartPadding};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f39421d = {C5248R.attr.clockFaceBackgroundColor, C5248R.attr.clockNumberTextColor};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f39422e = {C5248R.attr.clockHandColor, C5248R.attr.materialCircleRadius, C5248R.attr.selectorSize};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f39423f = {C5248R.attr.behavior_autoHide, C5248R.attr.behavior_autoShrink};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f39424g = {C5248R.attr.behavior_autoHide};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f39425h = {R.attr.foreground, R.attr.foregroundGravity, C5248R.attr.foregroundInsidePadding};
    public static final int[] i = {R.attr.inputType, R.attr.popupElevation, C5248R.attr.dropDownBackgroundTint, C5248R.attr.simpleItemLayout, C5248R.attr.simpleItemSelectedColor, C5248R.attr.simpleItemSelectedRippleColor, C5248R.attr.simpleItems};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f39426j = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, C5248R.attr.backgroundTint, C5248R.attr.backgroundTintMode, C5248R.attr.cornerRadius, C5248R.attr.elevation, C5248R.attr.icon, C5248R.attr.iconGravity, C5248R.attr.iconPadding, C5248R.attr.iconSize, C5248R.attr.iconTint, C5248R.attr.iconTintMode, C5248R.attr.rippleColor, C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay, C5248R.attr.strokeColor, C5248R.attr.strokeWidth, C5248R.attr.toggleCheckedStateOnClick};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f39427k = {R.attr.enabled, C5248R.attr.checkedButton, C5248R.attr.selectionRequired, C5248R.attr.singleSelection};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f39428l = {R.attr.windowFullscreen, C5248R.attr.backgroundTint, C5248R.attr.dayInvalidStyle, C5248R.attr.daySelectedStyle, C5248R.attr.dayStyle, C5248R.attr.dayTodayStyle, C5248R.attr.nestedScrollable, C5248R.attr.rangeFillColor, C5248R.attr.yearSelectedStyle, C5248R.attr.yearStyle, C5248R.attr.yearTodayStyle};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f39429m = {R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, C5248R.attr.itemFillColor, C5248R.attr.itemShapeAppearance, C5248R.attr.itemShapeAppearanceOverlay, C5248R.attr.itemStrokeColor, C5248R.attr.itemStrokeWidth, C5248R.attr.itemTextColor};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f39430n = {R.attr.button, C5248R.attr.buttonCompat, C5248R.attr.buttonIcon, C5248R.attr.buttonIconTint, C5248R.attr.buttonIconTintMode, C5248R.attr.buttonTint, C5248R.attr.centerIfNoTextEnabled, C5248R.attr.checkedState, C5248R.attr.errorAccessibilityLabel, C5248R.attr.errorShown, C5248R.attr.useMaterialThemeColors};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f39431o = {C5248R.attr.buttonTint, C5248R.attr.useMaterialThemeColors};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f39432p = {C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f39433q = {R.attr.letterSpacing, R.attr.lineHeight, C5248R.attr.lineHeight};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f39434r = {R.attr.textAppearance, R.attr.lineHeight, C5248R.attr.lineHeight};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f39435s = {C5248R.attr.logoAdjustViewBounds, C5248R.attr.logoScaleType, C5248R.attr.navigationIconTint, C5248R.attr.subtitleCentered, C5248R.attr.titleCentered};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f39436t = {C5248R.attr.materialCircleRadius};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f39437u = {C5248R.attr.behavior_overlapTop};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f39438v = {C5248R.attr.cornerFamily, C5248R.attr.cornerFamilyBottomLeft, C5248R.attr.cornerFamilyBottomRight, C5248R.attr.cornerFamilyTopLeft, C5248R.attr.cornerFamilyTopRight, C5248R.attr.cornerSize, C5248R.attr.cornerSizeBottomLeft, C5248R.attr.cornerSizeBottomRight, C5248R.attr.cornerSizeTopLeft, C5248R.attr.cornerSizeTopRight};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f39439w = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, C5248R.attr.backgroundTint, C5248R.attr.behavior_draggable, C5248R.attr.coplanarSiblingViewId, C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f39440x = {R.attr.maxWidth, C5248R.attr.actionTextColorAlpha, C5248R.attr.animationMode, C5248R.attr.backgroundOverlayColorAlpha, C5248R.attr.backgroundTint, C5248R.attr.backgroundTintMode, C5248R.attr.elevation, C5248R.attr.maxActionInlineWidth, C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f39441y = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, C5248R.attr.fontFamily, C5248R.attr.fontVariationSettings, C5248R.attr.textAllCaps, C5248R.attr.textLocale};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f39442z = {C5248R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f39416A = {R.attr.enabled, R.attr.textColorHint, R.attr.maxWidth, R.attr.minWidth, R.attr.hint, R.attr.maxEms, R.attr.minEms, C5248R.attr.boxBackgroundColor, C5248R.attr.boxBackgroundMode, C5248R.attr.boxCollapsedPaddingTop, C5248R.attr.boxCornerRadiusBottomEnd, C5248R.attr.boxCornerRadiusBottomStart, C5248R.attr.boxCornerRadiusTopEnd, C5248R.attr.boxCornerRadiusTopStart, C5248R.attr.boxStrokeColor, C5248R.attr.boxStrokeErrorColor, C5248R.attr.boxStrokeWidth, C5248R.attr.boxStrokeWidthFocused, C5248R.attr.counterEnabled, C5248R.attr.counterMaxLength, C5248R.attr.counterOverflowTextAppearance, C5248R.attr.counterOverflowTextColor, C5248R.attr.counterTextAppearance, C5248R.attr.counterTextColor, C5248R.attr.cursorColor, C5248R.attr.cursorErrorColor, C5248R.attr.endIconCheckable, C5248R.attr.endIconContentDescription, C5248R.attr.endIconDrawable, C5248R.attr.endIconMinSize, C5248R.attr.endIconMode, C5248R.attr.endIconScaleType, C5248R.attr.endIconTint, C5248R.attr.endIconTintMode, C5248R.attr.errorAccessibilityLiveRegion, C5248R.attr.errorContentDescription, C5248R.attr.errorEnabled, C5248R.attr.errorIconDrawable, C5248R.attr.errorIconTint, C5248R.attr.errorIconTintMode, C5248R.attr.errorTextAppearance, C5248R.attr.errorTextColor, C5248R.attr.expandedHintEnabled, C5248R.attr.helperText, C5248R.attr.helperTextEnabled, C5248R.attr.helperTextTextAppearance, C5248R.attr.helperTextTextColor, C5248R.attr.hintAnimationEnabled, C5248R.attr.hintEnabled, C5248R.attr.hintTextAppearance, C5248R.attr.hintTextColor, C5248R.attr.passwordToggleContentDescription, C5248R.attr.passwordToggleDrawable, C5248R.attr.passwordToggleEnabled, C5248R.attr.passwordToggleTint, C5248R.attr.passwordToggleTintMode, C5248R.attr.placeholderText, C5248R.attr.placeholderTextAppearance, C5248R.attr.placeholderTextColor, C5248R.attr.prefixText, C5248R.attr.prefixTextAppearance, C5248R.attr.prefixTextColor, C5248R.attr.shapeAppearance, C5248R.attr.shapeAppearanceOverlay, C5248R.attr.startIconCheckable, C5248R.attr.startIconContentDescription, C5248R.attr.startIconDrawable, C5248R.attr.startIconMinSize, C5248R.attr.startIconScaleType, C5248R.attr.startIconTint, C5248R.attr.startIconTintMode, C5248R.attr.suffixText, C5248R.attr.suffixTextAppearance, C5248R.attr.suffixTextColor};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f39417B = {R.attr.textAppearance, C5248R.attr.enforceMaterialTheme, C5248R.attr.enforceTextAppearance};
}
