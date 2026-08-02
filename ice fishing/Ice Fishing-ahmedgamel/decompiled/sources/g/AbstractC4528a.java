package g;

import android.R;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4528a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f37550a = {C5248R.attr.background, C5248R.attr.backgroundSplit, C5248R.attr.backgroundStacked, C5248R.attr.contentInsetEnd, C5248R.attr.contentInsetEndWithActions, C5248R.attr.contentInsetLeft, C5248R.attr.contentInsetRight, C5248R.attr.contentInsetStart, C5248R.attr.contentInsetStartWithNavigation, C5248R.attr.customNavigationLayout, C5248R.attr.displayOptions, C5248R.attr.divider, C5248R.attr.elevation, C5248R.attr.height, C5248R.attr.hideOnContentScroll, C5248R.attr.homeAsUpIndicator, C5248R.attr.homeLayout, C5248R.attr.icon, C5248R.attr.indeterminateProgressStyle, C5248R.attr.itemPadding, C5248R.attr.logo, C5248R.attr.navigationMode, C5248R.attr.popupTheme, C5248R.attr.progressBarPadding, C5248R.attr.progressBarStyle, C5248R.attr.subtitle, C5248R.attr.subtitleTextStyle, C5248R.attr.title, C5248R.attr.titleTextStyle};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f37551b = {R.attr.layout_gravity};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f37552c = {R.attr.minWidth};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f37553d = {C5248R.attr.background, C5248R.attr.backgroundSplit, C5248R.attr.closeItemLayout, C5248R.attr.height, C5248R.attr.subtitleTextStyle, C5248R.attr.titleTextStyle};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f37554e = {R.attr.layout, C5248R.attr.buttonIconDimen, C5248R.attr.buttonPanelSideLayout, C5248R.attr.listItemLayout, C5248R.attr.listLayout, C5248R.attr.multiChoiceItemLayout, C5248R.attr.showTitle, C5248R.attr.singleChoiceItemLayout};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f37555f = {R.attr.src, C5248R.attr.srcCompat, C5248R.attr.tint, C5248R.attr.tintMode};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f37556g = {R.attr.thumb, C5248R.attr.tickMark, C5248R.attr.tickMarkTint, C5248R.attr.tickMarkTintMode};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f37557h = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};
    public static final int[] i = {R.attr.textAppearance, C5248R.attr.autoSizeMaxTextSize, C5248R.attr.autoSizeMinTextSize, C5248R.attr.autoSizePresetSizes, C5248R.attr.autoSizeStepGranularity, C5248R.attr.autoSizeTextType, C5248R.attr.drawableBottomCompat, C5248R.attr.drawableEndCompat, C5248R.attr.drawableLeftCompat, C5248R.attr.drawableRightCompat, C5248R.attr.drawableStartCompat, C5248R.attr.drawableTint, C5248R.attr.drawableTintMode, C5248R.attr.drawableTopCompat, C5248R.attr.emojiCompatEnabled, C5248R.attr.firstBaselineToTopHeight, C5248R.attr.fontFamily, C5248R.attr.fontVariationSettings, C5248R.attr.lastBaselineToBottomHeight, C5248R.attr.lineHeight, C5248R.attr.textAllCaps, C5248R.attr.textLocale};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f37558j = {R.attr.windowIsFloating, R.attr.windowAnimationStyle, C5248R.attr.actionBarDivider, C5248R.attr.actionBarItemBackground, C5248R.attr.actionBarPopupTheme, C5248R.attr.actionBarSize, C5248R.attr.actionBarSplitStyle, C5248R.attr.actionBarStyle, C5248R.attr.actionBarTabBarStyle, C5248R.attr.actionBarTabStyle, C5248R.attr.actionBarTabTextStyle, C5248R.attr.actionBarTheme, C5248R.attr.actionBarWidgetTheme, C5248R.attr.actionButtonStyle, C5248R.attr.actionDropDownStyle, C5248R.attr.actionMenuTextAppearance, C5248R.attr.actionMenuTextColor, C5248R.attr.actionModeBackground, C5248R.attr.actionModeCloseButtonStyle, C5248R.attr.actionModeCloseContentDescription, C5248R.attr.actionModeCloseDrawable, C5248R.attr.actionModeCopyDrawable, C5248R.attr.actionModeCutDrawable, C5248R.attr.actionModeFindDrawable, C5248R.attr.actionModePasteDrawable, C5248R.attr.actionModePopupWindowStyle, C5248R.attr.actionModeSelectAllDrawable, C5248R.attr.actionModeShareDrawable, C5248R.attr.actionModeSplitBackground, C5248R.attr.actionModeStyle, C5248R.attr.actionModeTheme, C5248R.attr.actionModeWebSearchDrawable, C5248R.attr.actionOverflowButtonStyle, C5248R.attr.actionOverflowMenuStyle, C5248R.attr.activityChooserViewStyle, C5248R.attr.alertDialogButtonGroupStyle, C5248R.attr.alertDialogCenterButtons, C5248R.attr.alertDialogStyle, C5248R.attr.alertDialogTheme, C5248R.attr.autoCompleteTextViewStyle, C5248R.attr.borderlessButtonStyle, C5248R.attr.buttonBarButtonStyle, C5248R.attr.buttonBarNegativeButtonStyle, C5248R.attr.buttonBarNeutralButtonStyle, C5248R.attr.buttonBarPositiveButtonStyle, C5248R.attr.buttonBarStyle, C5248R.attr.buttonStyle, C5248R.attr.buttonStyleSmall, C5248R.attr.checkboxStyle, C5248R.attr.checkedTextViewStyle, C5248R.attr.colorAccent, C5248R.attr.colorBackgroundFloating, C5248R.attr.colorButtonNormal, C5248R.attr.colorControlActivated, C5248R.attr.colorControlHighlight, C5248R.attr.colorControlNormal, C5248R.attr.colorError, C5248R.attr.colorPrimary, C5248R.attr.colorPrimaryDark, C5248R.attr.colorSwitchThumbNormal, C5248R.attr.controlBackground, C5248R.attr.dialogCornerRadius, C5248R.attr.dialogPreferredPadding, C5248R.attr.dialogTheme, C5248R.attr.dividerHorizontal, C5248R.attr.dividerVertical, C5248R.attr.dropDownListViewStyle, C5248R.attr.dropdownListPreferredItemHeight, C5248R.attr.editTextBackground, C5248R.attr.editTextColor, C5248R.attr.editTextStyle, C5248R.attr.homeAsUpIndicator, C5248R.attr.imageButtonStyle, C5248R.attr.listChoiceBackgroundIndicator, C5248R.attr.listChoiceIndicatorMultipleAnimated, C5248R.attr.listChoiceIndicatorSingleAnimated, C5248R.attr.listDividerAlertDialog, C5248R.attr.listMenuViewStyle, C5248R.attr.listPopupWindowStyle, C5248R.attr.listPreferredItemHeight, C5248R.attr.listPreferredItemHeightLarge, C5248R.attr.listPreferredItemHeightSmall, C5248R.attr.listPreferredItemPaddingEnd, C5248R.attr.listPreferredItemPaddingLeft, C5248R.attr.listPreferredItemPaddingRight, C5248R.attr.listPreferredItemPaddingStart, C5248R.attr.panelBackground, C5248R.attr.panelMenuListTheme, C5248R.attr.panelMenuListWidth, C5248R.attr.popupMenuStyle, C5248R.attr.popupWindowStyle, C5248R.attr.radioButtonStyle, C5248R.attr.ratingBarStyle, C5248R.attr.ratingBarStyleIndicator, C5248R.attr.ratingBarStyleSmall, C5248R.attr.searchViewStyle, C5248R.attr.seekBarStyle, C5248R.attr.selectableItemBackground, C5248R.attr.selectableItemBackgroundBorderless, C5248R.attr.spinnerDropDownItemStyle, C5248R.attr.spinnerStyle, C5248R.attr.switchStyle, C5248R.attr.textAppearanceLargePopupMenu, C5248R.attr.textAppearanceListItem, C5248R.attr.textAppearanceListItemSecondary, C5248R.attr.textAppearanceListItemSmall, C5248R.attr.textAppearancePopupMenuHeader, C5248R.attr.textAppearanceSearchResultSubtitle, C5248R.attr.textAppearanceSearchResultTitle, C5248R.attr.textAppearanceSmallPopupMenu, C5248R.attr.textColorAlertDialogListItem, C5248R.attr.textColorSearchUrl, C5248R.attr.toolbarNavigationButtonStyle, C5248R.attr.toolbarStyle, C5248R.attr.tooltipForegroundColor, C5248R.attr.tooltipFrameBackground, C5248R.attr.viewInflaterClass, C5248R.attr.windowActionBar, C5248R.attr.windowActionBarOverlay, C5248R.attr.windowActionModeOverlay, C5248R.attr.windowFixedHeightMajor, C5248R.attr.windowFixedHeightMinor, C5248R.attr.windowFixedWidthMajor, C5248R.attr.windowFixedWidthMinor, C5248R.attr.windowMinWidthMajor, C5248R.attr.windowMinWidthMinor, C5248R.attr.windowNoTitle};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f37559k = {C5248R.attr.allowStacking};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f37560l = {R.attr.checkMark, C5248R.attr.checkMarkCompat, C5248R.attr.checkMarkTint, C5248R.attr.checkMarkTintMode};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f37561m = {R.attr.button, C5248R.attr.buttonCompat, C5248R.attr.buttonTint, C5248R.attr.buttonTintMode};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f37562n = {C5248R.attr.arrowHeadLength, C5248R.attr.arrowShaftLength, C5248R.attr.barLength, C5248R.attr.color, C5248R.attr.drawableSize, C5248R.attr.gapBetweenBars, C5248R.attr.spinBars, C5248R.attr.thickness};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f37563o = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, C5248R.attr.divider, C5248R.attr.dividerPadding, C5248R.attr.measureWithLargestChild, C5248R.attr.showDividers};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f37564p = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f37565q = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f37566r = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, C5248R.attr.actionLayout, C5248R.attr.actionProviderClass, C5248R.attr.actionViewClass, C5248R.attr.alphabeticModifiers, C5248R.attr.contentDescription, C5248R.attr.iconTint, C5248R.attr.iconTintMode, C5248R.attr.numericModifiers, C5248R.attr.showAsAction, C5248R.attr.tooltipText};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f37567s = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, C5248R.attr.preserveIconSpacing, C5248R.attr.subMenuArrow};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f37568t = {R.attr.popupBackground, R.attr.popupAnimationStyle, C5248R.attr.overlapAnchor};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f37569u = {C5248R.attr.paddingBottomNoButtons, C5248R.attr.paddingTopNoTitle};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f37570v = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, C5248R.attr.popupTheme};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f37571w = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, C5248R.attr.fontFamily, C5248R.attr.fontVariationSettings, C5248R.attr.textAllCaps, C5248R.attr.textLocale};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f37572x = {R.attr.gravity, R.attr.minHeight, C5248R.attr.buttonGravity, C5248R.attr.collapseContentDescription, C5248R.attr.collapseIcon, C5248R.attr.contentInsetEnd, C5248R.attr.contentInsetEndWithActions, C5248R.attr.contentInsetLeft, C5248R.attr.contentInsetRight, C5248R.attr.contentInsetStart, C5248R.attr.contentInsetStartWithNavigation, C5248R.attr.logo, C5248R.attr.logoDescription, C5248R.attr.maxButtonHeight, C5248R.attr.menu, C5248R.attr.navigationContentDescription, C5248R.attr.navigationIcon, C5248R.attr.popupTheme, C5248R.attr.subtitle, C5248R.attr.subtitleTextAppearance, C5248R.attr.subtitleTextColor, C5248R.attr.title, C5248R.attr.titleMargin, C5248R.attr.titleMarginBottom, C5248R.attr.titleMarginEnd, C5248R.attr.titleMarginStart, C5248R.attr.titleMarginTop, C5248R.attr.titleMargins, C5248R.attr.titleTextAppearance, C5248R.attr.titleTextColor};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f37573y = {R.attr.theme, R.attr.focusable, C5248R.attr.paddingEnd, C5248R.attr.paddingStart, C5248R.attr.theme};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f37574z = {R.attr.background, C5248R.attr.backgroundTint, C5248R.attr.backgroundTintMode};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f37549A = {R.attr.id, R.attr.layout, R.attr.inflatedId};
}
