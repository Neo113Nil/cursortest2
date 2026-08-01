package g;

import android.R;
import com.icefishinggame.icefishinggamemultigames.C5275R;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4518a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f37588a = {C5275R.attr.background, C5275R.attr.backgroundSplit, C5275R.attr.backgroundStacked, C5275R.attr.contentInsetEnd, C5275R.attr.contentInsetEndWithActions, C5275R.attr.contentInsetLeft, C5275R.attr.contentInsetRight, C5275R.attr.contentInsetStart, C5275R.attr.contentInsetStartWithNavigation, C5275R.attr.customNavigationLayout, C5275R.attr.displayOptions, C5275R.attr.divider, C5275R.attr.elevation, C5275R.attr.height, C5275R.attr.hideOnContentScroll, C5275R.attr.homeAsUpIndicator, C5275R.attr.homeLayout, C5275R.attr.icon, C5275R.attr.indeterminateProgressStyle, C5275R.attr.itemPadding, C5275R.attr.logo, C5275R.attr.navigationMode, C5275R.attr.popupTheme, C5275R.attr.progressBarPadding, C5275R.attr.progressBarStyle, C5275R.attr.subtitle, C5275R.attr.subtitleTextStyle, C5275R.attr.title, C5275R.attr.titleTextStyle};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f37589b = {R.attr.layout_gravity};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f37590c = {R.attr.minWidth};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f37591d = {C5275R.attr.background, C5275R.attr.backgroundSplit, C5275R.attr.closeItemLayout, C5275R.attr.height, C5275R.attr.subtitleTextStyle, C5275R.attr.titleTextStyle};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f37592e = {R.attr.layout, C5275R.attr.buttonIconDimen, C5275R.attr.buttonPanelSideLayout, C5275R.attr.listItemLayout, C5275R.attr.listLayout, C5275R.attr.multiChoiceItemLayout, C5275R.attr.showTitle, C5275R.attr.singleChoiceItemLayout};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f37593f = {R.attr.src, C5275R.attr.srcCompat, C5275R.attr.tint, C5275R.attr.tintMode};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f37594g = {R.attr.thumb, C5275R.attr.tickMark, C5275R.attr.tickMarkTint, C5275R.attr.tickMarkTintMode};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f37595h = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};
    public static final int[] i = {R.attr.textAppearance, C5275R.attr.autoSizeMaxTextSize, C5275R.attr.autoSizeMinTextSize, C5275R.attr.autoSizePresetSizes, C5275R.attr.autoSizeStepGranularity, C5275R.attr.autoSizeTextType, C5275R.attr.drawableBottomCompat, C5275R.attr.drawableEndCompat, C5275R.attr.drawableLeftCompat, C5275R.attr.drawableRightCompat, C5275R.attr.drawableStartCompat, C5275R.attr.drawableTint, C5275R.attr.drawableTintMode, C5275R.attr.drawableTopCompat, C5275R.attr.emojiCompatEnabled, C5275R.attr.firstBaselineToTopHeight, C5275R.attr.fontFamily, C5275R.attr.fontVariationSettings, C5275R.attr.lastBaselineToBottomHeight, C5275R.attr.lineHeight, C5275R.attr.textAllCaps, C5275R.attr.textLocale};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f37596j = {R.attr.windowIsFloating, R.attr.windowAnimationStyle, C5275R.attr.actionBarDivider, C5275R.attr.actionBarItemBackground, C5275R.attr.actionBarPopupTheme, C5275R.attr.actionBarSize, C5275R.attr.actionBarSplitStyle, C5275R.attr.actionBarStyle, C5275R.attr.actionBarTabBarStyle, C5275R.attr.actionBarTabStyle, C5275R.attr.actionBarTabTextStyle, C5275R.attr.actionBarTheme, C5275R.attr.actionBarWidgetTheme, C5275R.attr.actionButtonStyle, C5275R.attr.actionDropDownStyle, C5275R.attr.actionMenuTextAppearance, C5275R.attr.actionMenuTextColor, C5275R.attr.actionModeBackground, C5275R.attr.actionModeCloseButtonStyle, C5275R.attr.actionModeCloseContentDescription, C5275R.attr.actionModeCloseDrawable, C5275R.attr.actionModeCopyDrawable, C5275R.attr.actionModeCutDrawable, C5275R.attr.actionModeFindDrawable, C5275R.attr.actionModePasteDrawable, C5275R.attr.actionModePopupWindowStyle, C5275R.attr.actionModeSelectAllDrawable, C5275R.attr.actionModeShareDrawable, C5275R.attr.actionModeSplitBackground, C5275R.attr.actionModeStyle, C5275R.attr.actionModeTheme, C5275R.attr.actionModeWebSearchDrawable, C5275R.attr.actionOverflowButtonStyle, C5275R.attr.actionOverflowMenuStyle, C5275R.attr.activityChooserViewStyle, C5275R.attr.alertDialogButtonGroupStyle, C5275R.attr.alertDialogCenterButtons, C5275R.attr.alertDialogStyle, C5275R.attr.alertDialogTheme, C5275R.attr.autoCompleteTextViewStyle, C5275R.attr.borderlessButtonStyle, C5275R.attr.buttonBarButtonStyle, C5275R.attr.buttonBarNegativeButtonStyle, C5275R.attr.buttonBarNeutralButtonStyle, C5275R.attr.buttonBarPositiveButtonStyle, C5275R.attr.buttonBarStyle, C5275R.attr.buttonStyle, C5275R.attr.buttonStyleSmall, C5275R.attr.checkboxStyle, C5275R.attr.checkedTextViewStyle, C5275R.attr.colorAccent, C5275R.attr.colorBackgroundFloating, C5275R.attr.colorButtonNormal, C5275R.attr.colorControlActivated, C5275R.attr.colorControlHighlight, C5275R.attr.colorControlNormal, C5275R.attr.colorError, C5275R.attr.colorPrimary, C5275R.attr.colorPrimaryDark, C5275R.attr.colorSwitchThumbNormal, C5275R.attr.controlBackground, C5275R.attr.dialogCornerRadius, C5275R.attr.dialogPreferredPadding, C5275R.attr.dialogTheme, C5275R.attr.dividerHorizontal, C5275R.attr.dividerVertical, C5275R.attr.dropDownListViewStyle, C5275R.attr.dropdownListPreferredItemHeight, C5275R.attr.editTextBackground, C5275R.attr.editTextColor, C5275R.attr.editTextStyle, C5275R.attr.homeAsUpIndicator, C5275R.attr.imageButtonStyle, C5275R.attr.listChoiceBackgroundIndicator, C5275R.attr.listChoiceIndicatorMultipleAnimated, C5275R.attr.listChoiceIndicatorSingleAnimated, C5275R.attr.listDividerAlertDialog, C5275R.attr.listMenuViewStyle, C5275R.attr.listPopupWindowStyle, C5275R.attr.listPreferredItemHeight, C5275R.attr.listPreferredItemHeightLarge, C5275R.attr.listPreferredItemHeightSmall, C5275R.attr.listPreferredItemPaddingEnd, C5275R.attr.listPreferredItemPaddingLeft, C5275R.attr.listPreferredItemPaddingRight, C5275R.attr.listPreferredItemPaddingStart, C5275R.attr.panelBackground, C5275R.attr.panelMenuListTheme, C5275R.attr.panelMenuListWidth, C5275R.attr.popupMenuStyle, C5275R.attr.popupWindowStyle, C5275R.attr.radioButtonStyle, C5275R.attr.ratingBarStyle, C5275R.attr.ratingBarStyleIndicator, C5275R.attr.ratingBarStyleSmall, C5275R.attr.searchViewStyle, C5275R.attr.seekBarStyle, C5275R.attr.selectableItemBackground, C5275R.attr.selectableItemBackgroundBorderless, C5275R.attr.spinnerDropDownItemStyle, C5275R.attr.spinnerStyle, C5275R.attr.switchStyle, C5275R.attr.textAppearanceLargePopupMenu, C5275R.attr.textAppearanceListItem, C5275R.attr.textAppearanceListItemSecondary, C5275R.attr.textAppearanceListItemSmall, C5275R.attr.textAppearancePopupMenuHeader, C5275R.attr.textAppearanceSearchResultSubtitle, C5275R.attr.textAppearanceSearchResultTitle, C5275R.attr.textAppearanceSmallPopupMenu, C5275R.attr.textColorAlertDialogListItem, C5275R.attr.textColorSearchUrl, C5275R.attr.toolbarNavigationButtonStyle, C5275R.attr.toolbarStyle, C5275R.attr.tooltipForegroundColor, C5275R.attr.tooltipFrameBackground, C5275R.attr.viewInflaterClass, C5275R.attr.windowActionBar, C5275R.attr.windowActionBarOverlay, C5275R.attr.windowActionModeOverlay, C5275R.attr.windowFixedHeightMajor, C5275R.attr.windowFixedHeightMinor, C5275R.attr.windowFixedWidthMajor, C5275R.attr.windowFixedWidthMinor, C5275R.attr.windowMinWidthMajor, C5275R.attr.windowMinWidthMinor, C5275R.attr.windowNoTitle};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f37597k = {C5275R.attr.allowStacking};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f37598l = {R.attr.checkMark, C5275R.attr.checkMarkCompat, C5275R.attr.checkMarkTint, C5275R.attr.checkMarkTintMode};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f37599m = {R.attr.button, C5275R.attr.buttonCompat, C5275R.attr.buttonTint, C5275R.attr.buttonTintMode};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f37600n = {C5275R.attr.arrowHeadLength, C5275R.attr.arrowShaftLength, C5275R.attr.barLength, C5275R.attr.color, C5275R.attr.drawableSize, C5275R.attr.gapBetweenBars, C5275R.attr.spinBars, C5275R.attr.thickness};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f37601o = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, C5275R.attr.divider, C5275R.attr.dividerPadding, C5275R.attr.measureWithLargestChild, C5275R.attr.showDividers};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f37602p = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f37603q = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f37604r = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, C5275R.attr.actionLayout, C5275R.attr.actionProviderClass, C5275R.attr.actionViewClass, C5275R.attr.alphabeticModifiers, C5275R.attr.contentDescription, C5275R.attr.iconTint, C5275R.attr.iconTintMode, C5275R.attr.numericModifiers, C5275R.attr.showAsAction, C5275R.attr.tooltipText};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f37605s = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, C5275R.attr.preserveIconSpacing, C5275R.attr.subMenuArrow};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f37606t = {R.attr.popupBackground, R.attr.popupAnimationStyle, C5275R.attr.overlapAnchor};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f37607u = {C5275R.attr.paddingBottomNoButtons, C5275R.attr.paddingTopNoTitle};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f37608v = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, C5275R.attr.popupTheme};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f37609w = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, C5275R.attr.fontFamily, C5275R.attr.fontVariationSettings, C5275R.attr.textAllCaps, C5275R.attr.textLocale};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f37610x = {R.attr.gravity, R.attr.minHeight, C5275R.attr.buttonGravity, C5275R.attr.collapseContentDescription, C5275R.attr.collapseIcon, C5275R.attr.contentInsetEnd, C5275R.attr.contentInsetEndWithActions, C5275R.attr.contentInsetLeft, C5275R.attr.contentInsetRight, C5275R.attr.contentInsetStart, C5275R.attr.contentInsetStartWithNavigation, C5275R.attr.logo, C5275R.attr.logoDescription, C5275R.attr.maxButtonHeight, C5275R.attr.menu, C5275R.attr.navigationContentDescription, C5275R.attr.navigationIcon, C5275R.attr.popupTheme, C5275R.attr.subtitle, C5275R.attr.subtitleTextAppearance, C5275R.attr.subtitleTextColor, C5275R.attr.title, C5275R.attr.titleMargin, C5275R.attr.titleMarginBottom, C5275R.attr.titleMarginEnd, C5275R.attr.titleMarginStart, C5275R.attr.titleMarginTop, C5275R.attr.titleMargins, C5275R.attr.titleTextAppearance, C5275R.attr.titleTextColor};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f37611y = {R.attr.theme, R.attr.focusable, C5275R.attr.paddingEnd, C5275R.attr.paddingStart, C5275R.attr.theme};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f37612z = {R.attr.background, C5275R.attr.backgroundTint, C5275R.attr.backgroundTintMode};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f37587A = {R.attr.id, R.attr.layout, R.attr.inflatedId};
}
