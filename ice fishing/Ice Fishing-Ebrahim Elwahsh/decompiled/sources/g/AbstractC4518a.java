package g;

import android.R;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4518a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f37818a = {C5284R.attr.background, C5284R.attr.backgroundSplit, C5284R.attr.backgroundStacked, C5284R.attr.contentInsetEnd, C5284R.attr.contentInsetEndWithActions, C5284R.attr.contentInsetLeft, C5284R.attr.contentInsetRight, C5284R.attr.contentInsetStart, C5284R.attr.contentInsetStartWithNavigation, C5284R.attr.customNavigationLayout, C5284R.attr.displayOptions, C5284R.attr.divider, C5284R.attr.elevation, C5284R.attr.height, C5284R.attr.hideOnContentScroll, C5284R.attr.homeAsUpIndicator, C5284R.attr.homeLayout, C5284R.attr.icon, C5284R.attr.indeterminateProgressStyle, C5284R.attr.itemPadding, C5284R.attr.logo, C5284R.attr.navigationMode, C5284R.attr.popupTheme, C5284R.attr.progressBarPadding, C5284R.attr.progressBarStyle, C5284R.attr.subtitle, C5284R.attr.subtitleTextStyle, C5284R.attr.title, C5284R.attr.titleTextStyle};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f37819b = {R.attr.layout_gravity};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f37820c = {R.attr.minWidth};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f37821d = {C5284R.attr.background, C5284R.attr.backgroundSplit, C5284R.attr.closeItemLayout, C5284R.attr.height, C5284R.attr.subtitleTextStyle, C5284R.attr.titleTextStyle};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f37822e = {R.attr.layout, C5284R.attr.buttonIconDimen, C5284R.attr.buttonPanelSideLayout, C5284R.attr.listItemLayout, C5284R.attr.listLayout, C5284R.attr.multiChoiceItemLayout, C5284R.attr.showTitle, C5284R.attr.singleChoiceItemLayout};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f37823f = {R.attr.src, C5284R.attr.srcCompat, C5284R.attr.tint, C5284R.attr.tintMode};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f37824g = {R.attr.thumb, C5284R.attr.tickMark, C5284R.attr.tickMarkTint, C5284R.attr.tickMarkTintMode};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f37825h = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};
    public static final int[] i = {R.attr.textAppearance, C5284R.attr.autoSizeMaxTextSize, C5284R.attr.autoSizeMinTextSize, C5284R.attr.autoSizePresetSizes, C5284R.attr.autoSizeStepGranularity, C5284R.attr.autoSizeTextType, C5284R.attr.drawableBottomCompat, C5284R.attr.drawableEndCompat, C5284R.attr.drawableLeftCompat, C5284R.attr.drawableRightCompat, C5284R.attr.drawableStartCompat, C5284R.attr.drawableTint, C5284R.attr.drawableTintMode, C5284R.attr.drawableTopCompat, C5284R.attr.emojiCompatEnabled, C5284R.attr.firstBaselineToTopHeight, C5284R.attr.fontFamily, C5284R.attr.fontVariationSettings, C5284R.attr.lastBaselineToBottomHeight, C5284R.attr.lineHeight, C5284R.attr.textAllCaps, C5284R.attr.textLocale};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f37826j = {R.attr.windowIsFloating, R.attr.windowAnimationStyle, C5284R.attr.actionBarDivider, C5284R.attr.actionBarItemBackground, C5284R.attr.actionBarPopupTheme, C5284R.attr.actionBarSize, C5284R.attr.actionBarSplitStyle, C5284R.attr.actionBarStyle, C5284R.attr.actionBarTabBarStyle, C5284R.attr.actionBarTabStyle, C5284R.attr.actionBarTabTextStyle, C5284R.attr.actionBarTheme, C5284R.attr.actionBarWidgetTheme, C5284R.attr.actionButtonStyle, C5284R.attr.actionDropDownStyle, C5284R.attr.actionMenuTextAppearance, C5284R.attr.actionMenuTextColor, C5284R.attr.actionModeBackground, C5284R.attr.actionModeCloseButtonStyle, C5284R.attr.actionModeCloseContentDescription, C5284R.attr.actionModeCloseDrawable, C5284R.attr.actionModeCopyDrawable, C5284R.attr.actionModeCutDrawable, C5284R.attr.actionModeFindDrawable, C5284R.attr.actionModePasteDrawable, C5284R.attr.actionModePopupWindowStyle, C5284R.attr.actionModeSelectAllDrawable, C5284R.attr.actionModeShareDrawable, C5284R.attr.actionModeSplitBackground, C5284R.attr.actionModeStyle, C5284R.attr.actionModeTheme, C5284R.attr.actionModeWebSearchDrawable, C5284R.attr.actionOverflowButtonStyle, C5284R.attr.actionOverflowMenuStyle, C5284R.attr.activityChooserViewStyle, C5284R.attr.alertDialogButtonGroupStyle, C5284R.attr.alertDialogCenterButtons, C5284R.attr.alertDialogStyle, C5284R.attr.alertDialogTheme, C5284R.attr.autoCompleteTextViewStyle, C5284R.attr.borderlessButtonStyle, C5284R.attr.buttonBarButtonStyle, C5284R.attr.buttonBarNegativeButtonStyle, C5284R.attr.buttonBarNeutralButtonStyle, C5284R.attr.buttonBarPositiveButtonStyle, C5284R.attr.buttonBarStyle, C5284R.attr.buttonStyle, C5284R.attr.buttonStyleSmall, C5284R.attr.checkboxStyle, C5284R.attr.checkedTextViewStyle, C5284R.attr.colorAccent, C5284R.attr.colorBackgroundFloating, C5284R.attr.colorButtonNormal, C5284R.attr.colorControlActivated, C5284R.attr.colorControlHighlight, C5284R.attr.colorControlNormal, C5284R.attr.colorError, C5284R.attr.colorPrimary, C5284R.attr.colorPrimaryDark, C5284R.attr.colorSwitchThumbNormal, C5284R.attr.controlBackground, C5284R.attr.dialogCornerRadius, C5284R.attr.dialogPreferredPadding, C5284R.attr.dialogTheme, C5284R.attr.dividerHorizontal, C5284R.attr.dividerVertical, C5284R.attr.dropDownListViewStyle, C5284R.attr.dropdownListPreferredItemHeight, C5284R.attr.editTextBackground, C5284R.attr.editTextColor, C5284R.attr.editTextStyle, C5284R.attr.homeAsUpIndicator, C5284R.attr.imageButtonStyle, C5284R.attr.listChoiceBackgroundIndicator, C5284R.attr.listChoiceIndicatorMultipleAnimated, C5284R.attr.listChoiceIndicatorSingleAnimated, C5284R.attr.listDividerAlertDialog, C5284R.attr.listMenuViewStyle, C5284R.attr.listPopupWindowStyle, C5284R.attr.listPreferredItemHeight, C5284R.attr.listPreferredItemHeightLarge, C5284R.attr.listPreferredItemHeightSmall, C5284R.attr.listPreferredItemPaddingEnd, C5284R.attr.listPreferredItemPaddingLeft, C5284R.attr.listPreferredItemPaddingRight, C5284R.attr.listPreferredItemPaddingStart, C5284R.attr.panelBackground, C5284R.attr.panelMenuListTheme, C5284R.attr.panelMenuListWidth, C5284R.attr.popupMenuStyle, C5284R.attr.popupWindowStyle, C5284R.attr.radioButtonStyle, C5284R.attr.ratingBarStyle, C5284R.attr.ratingBarStyleIndicator, C5284R.attr.ratingBarStyleSmall, C5284R.attr.searchViewStyle, C5284R.attr.seekBarStyle, C5284R.attr.selectableItemBackground, C5284R.attr.selectableItemBackgroundBorderless, C5284R.attr.spinnerDropDownItemStyle, C5284R.attr.spinnerStyle, C5284R.attr.switchStyle, C5284R.attr.textAppearanceLargePopupMenu, C5284R.attr.textAppearanceListItem, C5284R.attr.textAppearanceListItemSecondary, C5284R.attr.textAppearanceListItemSmall, C5284R.attr.textAppearancePopupMenuHeader, C5284R.attr.textAppearanceSearchResultSubtitle, C5284R.attr.textAppearanceSearchResultTitle, C5284R.attr.textAppearanceSmallPopupMenu, C5284R.attr.textColorAlertDialogListItem, C5284R.attr.textColorSearchUrl, C5284R.attr.toolbarNavigationButtonStyle, C5284R.attr.toolbarStyle, C5284R.attr.tooltipForegroundColor, C5284R.attr.tooltipFrameBackground, C5284R.attr.viewInflaterClass, C5284R.attr.windowActionBar, C5284R.attr.windowActionBarOverlay, C5284R.attr.windowActionModeOverlay, C5284R.attr.windowFixedHeightMajor, C5284R.attr.windowFixedHeightMinor, C5284R.attr.windowFixedWidthMajor, C5284R.attr.windowFixedWidthMinor, C5284R.attr.windowMinWidthMajor, C5284R.attr.windowMinWidthMinor, C5284R.attr.windowNoTitle};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f37827k = {C5284R.attr.allowStacking};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f37828l = {R.attr.checkMark, C5284R.attr.checkMarkCompat, C5284R.attr.checkMarkTint, C5284R.attr.checkMarkTintMode};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f37829m = {R.attr.button, C5284R.attr.buttonCompat, C5284R.attr.buttonTint, C5284R.attr.buttonTintMode};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f37830n = {C5284R.attr.arrowHeadLength, C5284R.attr.arrowShaftLength, C5284R.attr.barLength, C5284R.attr.color, C5284R.attr.drawableSize, C5284R.attr.gapBetweenBars, C5284R.attr.spinBars, C5284R.attr.thickness};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f37831o = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, C5284R.attr.divider, C5284R.attr.dividerPadding, C5284R.attr.measureWithLargestChild, C5284R.attr.showDividers};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f37832p = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f37833q = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f37834r = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, C5284R.attr.actionLayout, C5284R.attr.actionProviderClass, C5284R.attr.actionViewClass, C5284R.attr.alphabeticModifiers, C5284R.attr.contentDescription, C5284R.attr.iconTint, C5284R.attr.iconTintMode, C5284R.attr.numericModifiers, C5284R.attr.showAsAction, C5284R.attr.tooltipText};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f37835s = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, C5284R.attr.preserveIconSpacing, C5284R.attr.subMenuArrow};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f37836t = {R.attr.popupBackground, R.attr.popupAnimationStyle, C5284R.attr.overlapAnchor};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f37837u = {C5284R.attr.paddingBottomNoButtons, C5284R.attr.paddingTopNoTitle};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f37838v = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, C5284R.attr.popupTheme};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f37839w = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, C5284R.attr.fontFamily, C5284R.attr.fontVariationSettings, C5284R.attr.textAllCaps, C5284R.attr.textLocale};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f37840x = {R.attr.gravity, R.attr.minHeight, C5284R.attr.buttonGravity, C5284R.attr.collapseContentDescription, C5284R.attr.collapseIcon, C5284R.attr.contentInsetEnd, C5284R.attr.contentInsetEndWithActions, C5284R.attr.contentInsetLeft, C5284R.attr.contentInsetRight, C5284R.attr.contentInsetStart, C5284R.attr.contentInsetStartWithNavigation, C5284R.attr.logo, C5284R.attr.logoDescription, C5284R.attr.maxButtonHeight, C5284R.attr.menu, C5284R.attr.navigationContentDescription, C5284R.attr.navigationIcon, C5284R.attr.popupTheme, C5284R.attr.subtitle, C5284R.attr.subtitleTextAppearance, C5284R.attr.subtitleTextColor, C5284R.attr.title, C5284R.attr.titleMargin, C5284R.attr.titleMarginBottom, C5284R.attr.titleMarginEnd, C5284R.attr.titleMarginStart, C5284R.attr.titleMarginTop, C5284R.attr.titleMargins, C5284R.attr.titleTextAppearance, C5284R.attr.titleTextColor};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f37841y = {R.attr.theme, R.attr.focusable, C5284R.attr.paddingEnd, C5284R.attr.paddingStart, C5284R.attr.theme};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f37842z = {R.attr.background, C5284R.attr.backgroundTint, C5284R.attr.backgroundTintMode};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f37817A = {R.attr.id, R.attr.layout, R.attr.inflatedId};
}
