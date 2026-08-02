package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.b7;
import defpackage.bgc;
import defpackage.c4i0;
import defpackage.dzg0;
import defpackage.ejp;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.opr;
import defpackage.ppr;
import defpackage.qje;
import defpackage.qpr;
import defpackage.sls;
import defpackage.sph0;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0002\u009c\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\rJ\u0017\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\rJ\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b*\u0010\rJ\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020!¢\u0006\u0004\b,\u0010$J\u0017\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010!¢\u0006\u0004\b.\u0010$J\u0017\u00100\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\b2\u00101J\u0017\u00103\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\b3\u00101J\u0017\u00104\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\b4\u00101J\u0017\u00107\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u000b¢\u0006\u0004\b9\u0010\rJ\u0017\u0010;\u001a\u00020\u000b2\b\b\u0001\u0010:\u001a\u00020\u0007¢\u0006\u0004\b;\u00101J\u0017\u0010;\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b;\u0010$J\u0017\u0010=\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u000105¢\u0006\u0004\b=\u00108J\u0015\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u000b¢\u0006\u0004\bE\u0010\rJ\r\u0010F\u001a\u00020\u000b¢\u0006\u0004\bF\u0010\rJ\u0015\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u0007¢\u0006\u0004\bH\u00101J\u0017\u0010J\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010J\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\bJ\u00101J\r\u0010L\u001a\u00020\u000b¢\u0006\u0004\bL\u0010\rJ\u0017\u0010N\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010!¢\u0006\u0004\bN\u0010$J\u0017\u0010P\u001a\u00020\u000b2\b\b\u0001\u0010O\u001a\u00020\u0007¢\u0006\u0004\bP\u00101J\u0017\u0010R\u001a\u00020\u000b2\b\u0010Q\u001a\u0004\u0018\u000105¢\u0006\u0004\bR\u00108J\u0015\u0010S\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0004\bS\u0010@J\u0017\u0010T\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\bT\u00101J\u0015\u0010U\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0007¢\u0006\u0004\bU\u00101J\u0017\u0010V\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\bV\u00101J\r\u0010W\u001a\u00020\u0012¢\u0006\u0004\bW\u0010\u0014J\u0017\u0010Z\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bZ\u0010[J\u0015\u0010]\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u0012¢\u0006\u0004\b]\u0010@J)\u0010^\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010\nJ\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ!\u0010d\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bf\u0010\rJ\u000f\u0010g\u001a\u00020\u000bH\u0002¢\u0006\u0004\bg\u0010\rJ\u000f\u0010h\u001a\u00020\u000bH\u0002¢\u0006\u0004\bh\u0010\rJ\u0017\u0010k\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020i2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bm\u0010nJ\u0011\u0010p\u001a\u0004\u0018\u00010oH\u0002¢\u0006\u0004\bp\u0010qJ\u0019\u0010r\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\br\u00101J\u0017\u0010s\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bs\u0010bJ\u0017\u0010t\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bt\u0010bJ\u0019\u0010u\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\bu\u00101J\u0017\u0010v\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\bv\u00101J\u0019\u0010w\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\bw\u00101J\u001f\u0010x\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\bx\u0010eJ\u001f\u0010y\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\by\u0010eJ\u001f\u0010z\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\bz\u0010eJ\u001f\u0010{\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\b{\u0010eJ\u001f\u0010|\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\b|\u0010eJ\u001f\u0010}\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\b}\u0010eJ\u0017\u0010~\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020_H\u0002¢\u0006\u0004\b~\u0010bR\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\"\u0010\u0085\u0001\u001a\r \u0084\u0001*\u0005\u0018\u00010\u0083\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\"\u001a\u000b \u0084\u0001*\u0004\u0018\u00010%0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0087\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008c\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008c\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009d\u0001"}, d2 = {"Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "reInit", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Lru/yandex/taxi/design/ListItemComponent;", "newTitle", "setTitleView", "(Lru/yandex/taxi/design/ListItemComponent;)V", "showTitleTrailShimmering", "hideTitleTrailShimmering", "contentDescription", "setTitleContentDescription", "subtitle", "setSubtitle", "color", "setTitleColor", "(I)V", "setTitleColorAttr", "setSubtitleColor", "setSubtitleColorAttr", "Ljava/lang/Runnable;", "onBackClick", "setOnBackClickListener", "(Ljava/lang/Runnable;)V", "requestToolbarAccessibilityFocus", "titleResId", "setToolbarItemTitle", "action", "setToolbarItemAction", "visible", "setToolbarItemVisibility", "(Z)V", "Landroid/view/View;", "trackedView", "setTrackedView", "(Landroid/view/View;)V", "enableBackButton", "disableBackButton", "drawable", "setClickableTrailImage", "Landroid/content/res/ColorStateList;", "setTrailImageTint", "(Landroid/content/res/ColorStateList;)V", "clearTrailView", "text", "setTrailCompanionText", "attrId", "setTrailCompanionTextColorAttr", "onClick", "setTrailContainerClickListener", "setTrailVisibility", "setNavigationIconsColor", "setExpandedToolbarBackgroundColor", "setTrailImageTintAttr", "actionTitleIsAccessibilityFocused", "", "trailContentDescription", "setTrailContentDescription", "(Ljava/lang/String;)V", "isHeading", "setTitleAccessibilityHeading", "applyAttrs", "Landroid/content/res/TypedArray;", "attribute", "initAttributes", "(Landroid/content/res/TypedArray;)V", "attributes", "resolveThemeAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "initScrollTracker", "saveBottomMargin", "onFactorChange", "", "factor", "animateByFactor", "(F)V", "calculateCurveOfAnimation", "(F)F", "Landroid/widget/TextView;", "getActionTextView", "()Landroid/widget/TextView;", "setNavigationIconsColorAttr", "initTitleAttributes", "initLeadAttributes", "setExpandedToolbarBackgroundColorAttr", "setCollapsedToolbarBackgroundColor", "setCollapsedToolbarBackgroundColorAttr", "resolveAttrForToolbarTitleColor", "resolveAttrForToolbarSubtitleColor", "resolveAttrForToolbarNavigationColor", "resolveAttrForToolbarBackgroundCollapsed", "resolveAttrForToolbarBackgroundExpanded", "resolveAttrForToolbarTrailClickableImageTint", "createClickableTrailImage", "Landroid/graphics/Paint;", "barPaint", "Landroid/graphics/Paint;", "bgPaint", "Lru/yandex/taxi/design/ToolbarComponent;", "kotlin.jvm.PlatformType", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/g;", "scrollTracker", "Lru/yandex/taxi/design/g;", "trackedViewResId", CA20Status.STATUS_USER_I, "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "shadowDrawable", "Landroid/graphics/drawable/Drawable;", "savedBottomMargin", "actionTextView", "Landroid/widget/TextView;", "isRtl", "Z", "hideOrShowImageOnTitleFloating", "hideSubtitleInCollapsedState", "navigationColor", "trailImageTint", "Landroid/content/res/ColorStateList;", "Companion", "qpr", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FloatingTitleToolbarComponent extends FrameLayout implements nwy0 {
    private static final int ANIMATION_CURVE_DEGREE = 5;
    private static final int DEFAULT_MIN_HEIGHT = 0;
    private static final float SUBTITLE_HIDING_THRESHOLD = 0.99f;
    private TextView actionTextView;
    private final Paint barPaint;
    private final Paint bgPaint;
    private boolean hideOrShowImageOnTitleFloating;
    private boolean hideSubtitleInCollapsedState;
    private final boolean isRtl;
    private int navigationColor;
    private int savedBottomMargin;
    private g scrollTracker;
    private final Drawable shadowDrawable;
    private ListItemComponent title;
    private final ToolbarComponent toolbar;
    private View trackedView;
    private int trackedViewResId;
    private ColorStateList trailImageTint;
    public static final qpr Companion = new qpr();
    private static final int TITLE_TEXT_TAG = ndh0.main_text_id;
    private static final int SUBTITLE_TEXT_TAG = ndh0.minor_text_id;
    private static final int EXPANDED_BACKGROUND_TAG = ndh0.toolbar_expanded_bg_id;
    private static final int COLLAPSED_BACKGROUND_TAG = ndh0.toolbar_collapsed_bg_id;
    private static final int TRAIL_TINT_TAG = ndh0.toolbar_trail_tint_id;
    private static final int NAVIGATION_TAG = ndh0.floating_toolbar_navigation_id;

    public FloatingTitleToolbarComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, sph0.floating_title_toolbar, this);
        this.barPaint = new Paint();
        this.bgPaint = new Paint();
        this.toolbar = (ToolbarComponent) findViewById(ndh0.toolbar_inner);
        this.title = (ListItemComponent) findViewById(ndh0.title_inner);
        this.trackedViewResId = -1;
        this.shadowDrawable = tje.y(dzg0.shadow_bottom, getContext());
        this.isRtl = xw31.n(getContext());
        applyAttrs(context, attributeSet, i);
        setWillNotDraw(false);
    }

    private final void animateByFactor(float factor) {
        if (this.hideSubtitleInCollapsedState) {
            this.title.subtitle().setAlpha(1.0f - factor);
            this.title.subtitle().setVisibility((factor > SUBTITLE_HIDING_THRESHOLD ? 1 : (factor == SUBTITLE_HIDING_THRESHOLD ? 0 : -1)) <= 0 ? 0 : 8);
        }
        if (this.hideOrShowImageOnTitleFloating) {
            this.title.leadFrame.setAlpha(calculateCurveOfAnimation(1.0f - factor));
            boolean z = this.isRtl;
            ListItemComponent listItemComponent = this.title;
            this.title.getCenter().setTranslationX((z ? listItemComponent.leadFrame.getWidth() : -listItemComponent.leadFrame.getWidth()) * calculateCurveOfAnimation(factor));
        }
    }

    private final void applyAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, c4i0.FloatingTitleToolbarComponent, defStyleAttr, 0);
        try {
            initAttributes(obtainStyledAttributes);
            resolveThemeAttrs(attrs, obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final float calculateCurveOfAnimation(float factor) {
        return (float) Math.pow(factor, 5.0d);
    }

    private final void createClickableTrailImage(TypedArray attributes) {
        setClickableTrailImage(attributes.getResourceId(c4i0.FloatingTitleToolbarComponent_component_floating_title_toolbar_trail_clickable_image, 0));
    }

    private final TextView getActionTextView() {
        if (this.actionTextView == null) {
            this.actionTextView = (TextView) this.toolbar.inflateTrailView(sph0.floating_title_action_text_view);
        }
        TextView textView = this.actionTextView;
        if (textView != null) {
            textView.setTextColor(this.navigationColor);
            if (!jl40.l(this.toolbar.getTrailViewAs(TextView.class), textView)) {
                this.toolbar.setTrailView(textView);
            }
        }
        return this.actionTextView;
    }

    private final void initAttributes(TypedArray attribute) {
        this.trackedViewResId = attribute.getResourceId(c4i0.FloatingTitleToolbarComponent_component_tracked_view, -1);
        setTranslationZ(tje.u(5, getContext()));
        initTitleAttributes(attribute);
        initLeadAttributes(attribute);
        this.hideSubtitleInCollapsedState = attribute.getBoolean(c4i0.FloatingTitleToolbarComponent_component_enable_subtitle_hiding_in_collapsed_state, false);
        setToolbarItemTitle(attribute.getText(c4i0.FloatingTitleToolbarComponent_component_toolbar_item_title));
    }

    private final void initLeadAttributes(TypedArray attribute) {
        this.title.setLeadImage(attribute.getResourceId(c4i0.FloatingTitleToolbarComponent_component_title_image, 0));
        this.title.setLeadBackground(attribute.getResourceId(c4i0.FloatingTitleToolbarComponent_component_title_image_background, 0));
        this.title.setLeadImageSize(attribute.getDimensionPixelOffset(c4i0.FloatingTitleToolbarComponent_component_title_image_size, tje.u(48, getContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initScrollTracker() {
        if (this.scrollTracker != null) {
            return;
        }
        g gVar = new g(this.title, this.toolbar.getLeadImageView());
        this.scrollTracker = gVar;
        gVar.d = new ppr(0, this);
        View view = this.trackedView;
        if (view != null) {
            gVar.b(view);
        } else if (this.trackedViewResId != -1 && getParent() != null) {
            Object parent = getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            View findViewById = view2 != null ? view2.findViewById(this.trackedViewResId) : null;
            this.trackedView = findViewById;
            if (findViewById != null) {
                gVar.b(findViewById);
            }
        }
        saveBottomMargin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initScrollTracker$lambda$0$0(FloatingTitleToolbarComponent floatingTitleToolbarComponent) {
        floatingTitleToolbarComponent.onFactorChange();
        return zy11.a;
    }

    private final void initTitleAttributes(TypedArray attribute) {
        this.title.setTitle(attribute.getText(c4i0.FloatingTitleToolbarComponent_component_floating_title));
        this.title.setTitleTextSizePx(attribute.getDimensionPixelSize(c4i0.FloatingTitleToolbarComponent_component_title_text_size, tje.r(mrg0.component_floating_toolbar_title_size, getContext())));
        this.title.setTitleTypeface(attribute.getInteger(c4i0.FloatingTitleToolbarComponent_component_title_text_typeface, 5));
        this.title.setMinimumHeight(attribute.getDimensionPixelSize(c4i0.FloatingTitleToolbarComponent_component_title_min_height, 0));
        this.hideOrShowImageOnTitleFloating = attribute.getBoolean(c4i0.FloatingTitleToolbarComponent_component_enable_image_hiding, false);
    }

    private final void onFactorChange() {
        g gVar = this.scrollTracker;
        if (gVar != null) {
            animateByFactor(gVar.k);
            invalidate();
        }
    }

    private final void resolveAttrForToolbarBackgroundCollapsed(AttributeSet attrs, TypedArray attributes) {
        qje.S(attrs, attributes, "component_floating_title_toolbar_background_collapsed", c4i0.FloatingTitleToolbarComponent_component_floating_title_toolbar_background_collapsed, xng0.bgMain, new opr(this, 8), new opr(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveAttrForToolbarBackgroundCollapsed$lambda$1(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        floatingTitleToolbarComponent.setCollapsedToolbarBackgroundColor(ru.yandex.taxi.design.utils.c.a(i, floatingTitleToolbarComponent));
    }

    private final void resolveAttrForToolbarBackgroundExpanded(AttributeSet attrs, TypedArray attributes) {
        qje.S(attrs, attributes, "component_floating_title_toolbar_background_expanded", c4i0.FloatingTitleToolbarComponent_component_floating_title_toolbar_background_expanded, xng0.bgMain, new opr(this, 6), new opr(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveAttrForToolbarBackgroundExpanded$lambda$1(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        floatingTitleToolbarComponent.setExpandedToolbarBackgroundColor(ru.yandex.taxi.design.utils.c.a(i, floatingTitleToolbarComponent));
    }

    private final void resolveAttrForToolbarNavigationColor(AttributeSet attrs, TypedArray attributes) {
        qje.S(attrs, attributes, "component_floating_title_toolbar_navigation_color", c4i0.FloatingTitleToolbarComponent_component_floating_title_toolbar_navigation_color, xng0.textMain, new opr(this, 3), new opr(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveAttrForToolbarNavigationColor$lambda$1(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        floatingTitleToolbarComponent.setNavigationIconsColor(ru.yandex.taxi.design.utils.c.a(i, floatingTitleToolbarComponent));
    }

    private final void resolveAttrForToolbarSubtitleColor(AttributeSet attrs, TypedArray attributes) {
        qje.S(attrs, attributes, "component_floating_subtitle_toolbar_title_color", c4i0.FloatingTitleToolbarComponent_component_floating_subtitle_toolbar_title_color, xng0.textMain, new opr(this, 0), new opr(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveAttrForToolbarSubtitleColor$lambda$1(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        floatingTitleToolbarComponent.setSubtitleColor(ru.yandex.taxi.design.utils.c.a(i, floatingTitleToolbarComponent));
    }

    private final void resolveAttrForToolbarTitleColor(AttributeSet attrs, TypedArray attributes) {
        qje.S(attrs, attributes, "component_floating_title_toolbar_title_color", c4i0.FloatingTitleToolbarComponent_component_floating_title_toolbar_title_color, xng0.textMain, new opr(this, 1), new opr(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveAttrForToolbarTitleColor$lambda$1(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        floatingTitleToolbarComponent.setTitleColor(ru.yandex.taxi.design.utils.c.a(i, floatingTitleToolbarComponent));
    }

    private final void resolveAttrForToolbarTrailClickableImageTint(AttributeSet attrs, TypedArray attributes) {
        qje.S(attrs, attributes, "component_floating_title_toolbar_trail_clickable_image_tint", c4i0.FloatingTitleToolbarComponent_component_floating_title_toolbar_trail_clickable_image_tint, xng0.textMain, new opr(this, 10), new opr(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveAttrForToolbarTrailClickableImageTint$lambda$1(FloatingTitleToolbarComponent floatingTitleToolbarComponent, int i) {
        floatingTitleToolbarComponent.setTrailImageTint(ru.yandex.taxi.design.utils.c.a(i, floatingTitleToolbarComponent));
    }

    private final void resolveThemeAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setTitleColorAttr(xng0.textMain);
            setSubtitleColorAttr(xng0.textMain);
            setNavigationIconsColorAttr(xng0.textMain);
            setCollapsedToolbarBackgroundColorAttr(xng0.bgMain);
            setExpandedToolbarBackgroundColorAttr(xng0.bgMain);
            setTrailImageTintAttr(xng0.textMain);
            return;
        }
        resolveAttrForToolbarTitleColor(attrs, attributes);
        resolveAttrForToolbarSubtitleColor(attrs, attributes);
        resolveAttrForToolbarNavigationColor(attrs, attributes);
        resolveAttrForToolbarBackgroundCollapsed(attrs, attributes);
        resolveAttrForToolbarBackgroundExpanded(attrs, attributes);
        resolveAttrForToolbarTrailClickableImageTint(attrs, attributes);
        createClickableTrailImage(attributes);
    }

    private final void saveBottomMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i = marginLayoutParams.bottomMargin;
            this.savedBottomMargin = i;
            marginLayoutParams.bottomMargin = i - this.title.getHeight();
        }
    }

    private final void setCollapsedToolbarBackgroundColor(int color) {
        this.barPaint.setColor(color);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCollapsedToolbarBackgroundColorAttr(int color) {
        setTag(COLLAPSED_BACKGROUND_TAG, Integer.valueOf(color));
        setCollapsedToolbarBackgroundColor(qje.t(color, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpandedToolbarBackgroundColorAttr(int color) {
        setTag(EXPANDED_BACKGROUND_TAG, Integer.valueOf(color));
        setExpandedToolbarBackgroundColor(qje.t(color, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNavigationIconsColorAttr(int color) {
        setTag(NAVIGATION_TAG, Integer.valueOf(color));
        setNavigationIconsColor(qje.t(color, getContext()));
    }

    public final boolean actionTitleIsAccessibilityFocused() {
        TextView actionTextView = getActionTextView();
        return actionTextView != null && actionTextView.isAccessibilityFocused();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(TITLE_TEXT_TAG);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setTitleColorAttr(num.intValue());
        }
        Object tag2 = getTag(SUBTITLE_TEXT_TAG);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            setSubtitleColorAttr(num2.intValue());
        }
        Object tag3 = getTag(EXPANDED_BACKGROUND_TAG);
        Integer num3 = tag3 instanceof Integer ? (Integer) tag3 : null;
        if (num3 != null) {
            setExpandedToolbarBackgroundColorAttr(num3.intValue());
        }
        Object tag4 = getTag(COLLAPSED_BACKGROUND_TAG);
        Integer num4 = tag4 instanceof Integer ? (Integer) tag4 : null;
        if (num4 != null) {
            setCollapsedToolbarBackgroundColorAttr(num4.intValue());
        }
        Object tag5 = getTag(NAVIGATION_TAG);
        Integer num5 = tag5 instanceof Integer ? (Integer) tag5 : null;
        if (num5 != null) {
            setNavigationIconsColorAttr(num5.intValue());
        }
        Object tag6 = getTag(TRAIL_TINT_TAG);
        Integer num6 = tag6 instanceof Integer ? (Integer) tag6 : null;
        if (num6 != null) {
            setTrailImageTintAttr(num6.intValue());
        }
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void clearTrailView() {
        this.toolbar.clearTrailView();
    }

    public final void disableBackButton() {
        this.toolbar.disableNavigationButton();
    }

    public final void enableBackButton() {
        this.toolbar.enableNavigationButton();
    }

    public final void hideTitleTrailShimmering() {
        this.title.clearTrailView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ru.yandex.taxi.design.utils.c.e(this, new b7(26, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.scrollTracker;
        if (gVar != null) {
            gVar.c(0.0f);
            sls slsVar = gVar.c;
            gVar.c = new bgc(12);
            slsVar.invoke();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = this.savedBottomMargin;
            }
        }
        this.scrollTracker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        g gVar = this.scrollTracker;
        if (gVar == null) {
            return;
        }
        int round = Math.round(gVar.k * 255.0f);
        int i = gVar.j;
        int width = getWidth();
        this.barPaint.setAlpha(round);
        float f = width;
        float f2 = i;
        canvas.drawRect(0.0f, 0.0f, f, f2, this.bgPaint);
        canvas.drawRect(0.0f, 0.0f, f, f2, this.barPaint);
        this.shadowDrawable.setAlpha(round);
        canvas.save();
        canvas.rotate(180.0f, this.shadowDrawable.getBounds().width() / 2.0f, this.shadowDrawable.getBounds().height() / 2.0f);
        canvas.translate(0.0f, -f2);
        this.shadowDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        g gVar = this.scrollTracker;
        if (gVar != null && gVar.k == 0.0f) {
            reInit();
        }
        this.shadowDrawable.setBounds(0, 0, w, tje.r(mrg0.go_design_l_space, getContext()));
    }

    public final void reInit() {
        g gVar = this.scrollTracker;
        if (gVar != null) {
            gVar.c(0.0f);
            sls slsVar = gVar.c;
            gVar.c = new bgc(12);
            slsVar.invoke();
        }
        this.scrollTracker = null;
        ru.yandex.taxi.design.utils.c.e(this, new ejp(6, this));
    }

    public final void requestToolbarAccessibilityFocus() {
        this.toolbar.requestAccessibilityFocus();
    }

    public final void setClickableTrailImage(int drawable) {
        this.toolbar.setClickableTrailImage(drawable);
        setTrailImageTint(this.trailImageTint);
    }

    public final void setExpandedToolbarBackgroundColor(int color) {
        this.bgPaint.setColor(color);
        invalidate();
    }

    public final void setNavigationIconsColor(int color) {
        this.navigationColor = color;
        this.toolbar.setIconsColor(color);
        TextView textView = this.actionTextView;
        if (textView != null) {
            textView.setTextColor(this.navigationColor);
        }
    }

    public final void setOnBackClickListener(Runnable onBackClick) {
        this.toolbar.setOnNavigationClickListener(onBackClick);
    }

    public final void setSubtitle(CharSequence subtitle) {
        this.title.setSubtitle(subtitle);
    }

    public final void setSubtitleColor(int color) {
        this.title.setSubtitleTextColor(color);
    }

    public final void setSubtitleColorAttr(int color) {
        setTag(SUBTITLE_TEXT_TAG, Integer.valueOf(color));
        setSubtitleColor(qje.t(color, getContext()));
    }

    public final void setTitle(CharSequence title) {
        this.title.setTitle(title);
    }

    public final void setTitleAccessibilityHeading(boolean isHeading) {
        androidx.core.view.b.q(this.title, isHeading);
    }

    public final void setTitleColor(int color) {
        this.title.setTitleTextColor(color);
    }

    public final void setTitleColorAttr(int color) {
        setTag(TITLE_TEXT_TAG, Integer.valueOf(color));
        setTitleColor(qje.t(color, getContext()));
    }

    public final void setTitleContentDescription(CharSequence contentDescription) {
        this.title.setContentDescription(contentDescription);
    }

    public final void setTitleView(ListItemComponent newTitle) {
        newTitle.setTitleTextColor(this.title.titleTextColor);
        newTitle.setLayoutParams(this.title.getLayoutParams());
        removeView(this.title);
        this.title = newTitle;
        addView(newTitle);
    }

    public final void setToolbarItemAction(Runnable action) {
        TextView actionTextView = getActionTextView();
        if (actionTextView != null) {
            ru.yandex.taxi.design.utils.c.B(actionTextView, action);
        }
    }

    public final void setToolbarItemTitle(CharSequence title) {
        TextView actionTextView = getActionTextView();
        if (actionTextView != null) {
            actionTextView.setText(title);
            actionTextView.setVisibility(title != null && title.length() != 0 ? 0 : 8);
        }
    }

    public final void setToolbarItemVisibility(boolean visible) {
        TextView actionTextView = getActionTextView();
        if (actionTextView != null) {
            actionTextView.setVisibility(visible ? 0 : 8);
        }
    }

    public final void setTrackedView(View trackedView) {
        this.trackedView = trackedView;
    }

    public final void setTrailCompanionText(CharSequence text) {
        this.toolbar.setTrailCompanionText(text);
    }

    public final void setTrailCompanionTextColorAttr(int attrId) {
        this.toolbar.setTrailCompanionTextColorAttr(attrId);
    }

    public final void setTrailContainerClickListener(Runnable onClick) {
        this.toolbar.setTrailContainerClickListener(onClick);
    }

    public final void setTrailContentDescription(String trailContentDescription) {
        this.toolbar.setTrailContentDescription(trailContentDescription);
    }

    public final void setTrailImageTint(ColorStateList color) {
        this.trailImageTint = color;
        this.toolbar.setTrailTint(color);
    }

    public final void setTrailImageTintAttr(int color) {
        setTag(TRAIL_TINT_TAG, Integer.valueOf(color));
        setTrailImageTint(qje.t(color, getContext()));
    }

    public final void setTrailVisibility(boolean visible) {
        this.toolbar.setTrailVisibility(visible ? 0 : 8);
    }

    public final void showTitleTrailShimmering() {
        ShimmeringBar shimmeringBar = new ShimmeringBar(getContext(), null, 0, 0, 14, null);
        shimmeringBar.setLayoutParams(new ViewGroup.LayoutParams(-1, tje.r(mrg0.component_text_size_header, getContext())));
        int r = tje.r(mrg0.go_design_m_space, getContext());
        shimmeringBar.setPadding(r, 0, r, 0);
        this.title.setTrailView(shimmeringBar);
    }

    public final void setTrailImageTint(int color) {
        setTrailImageTint(ColorStateList.valueOf(color));
    }

    public final void setToolbarItemTitle(int titleResId) {
        setToolbarItemTitle(getResources().getString(titleResId));
    }

    public FloatingTitleToolbarComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FloatingTitleToolbarComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FloatingTitleToolbarComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.floatingTitleToolbarComponentStyle : i);
    }
}
