package ru.yandex.taxi.design.action;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.e;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b64;
import defpackage.bdc;
import defpackage.bjz0;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.djz0;
import defpackage.dl40;
import defpackage.dzg0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.fl40;
import defpackage.ika1;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.sph0;
import defpackage.tje;
import defpackage.up11;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw31;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.DebounceClickListener;
import ru.yandex.taxi.widget.RoundedCornersImageView;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004¢\u0001£\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b$\u0010\u0018J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020%¢\u0006\u0004\b*\u0010(J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020%¢\u0006\u0004\b,\u0010(J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020%¢\u0006\u0004\b-\u0010(J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b2\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b3\u00101J\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020%¢\u0006\u0004\b9\u0010(J\u0017\u0010;\u001a\u00020\u00002\b\u0010:\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b;\u0010\u0018J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0017\u0010;\u001a\u00020\u00002\b\b\u0001\u0010@\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\u001aJ\u0017\u0010C\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0019\u0010G\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\u001aJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010K\u001a\u00020%¢\u0006\u0004\bL\u0010(J\u000f\u0010M\u001a\u00020FH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020F2\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u0007H\u0014¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020F2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020%H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020FH\u0002¢\u0006\u0004\bY\u0010NJ!\u0010Z\u001a\u00020F2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020FH\u0002¢\u0006\u0004\b\\\u0010NJ\u000f\u0010]\u001a\u00020FH\u0002¢\u0006\u0004\b]\u0010NJ\u0019\u0010_\u001a\u00020F2\b\u0010^\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020FH\u0002¢\u0006\u0004\ba\u0010NJ!\u0010c\u001a\u00020F2\b\u0010^\u001a\u0004\u0018\u00010\u000b2\u0006\u0010b\u001a\u00020%H\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020FH\u0002¢\u0006\u0004\be\u0010NR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010fR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010gR\u0014\u0010h\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u0014\u0010l\u001a\u00020k8\u0002X\u0082D¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010oR\u0014\u0010q\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010fR\u0016\u0010\u001f\u001a\u00020k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010mR\u0016\u0010r\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010oR\u0016\u0010!\u001a\u00020k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010mR\u0016\u0010s\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010oR\u0014\u0010t\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010oR\u0016\u0010u\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0016\u0010v\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010iR\u0014\u0010{\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010iR\u0014\u0010|\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010iR\u0014\u0010}\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010iR\u0014\u0010~\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010iR\u0014\u0010\u007f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010iR\u0016\u0010\u0080\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010iR\u0016\u0010\u0081\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010iR\u0016\u0010\u0082\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010iR\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010wR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010wR\u0018\u0010\u0083\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010wR\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010fR\u001f\u0010\u009d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010i\u0012\u0005\b\u009e\u0001\u0010NR\u0018\u0010\u009f\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010wR\u0018\u0010 \u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010iR\u0018\u0010¡\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010i¨\u0006¤\u0001"}, d2 = {"Lru/yandex/taxi/design/action/ActionComponent;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "subtitle", "setSubtitle", "(Ljava/lang/CharSequence;)Lru/yandex/taxi/design/action/ActionComponent;", "titleVariant", "setTitleVariant", "", "titleVariants", "setTitleVariants", "(Ljava/util/List;)Lru/yandex/taxi/design/action/ActionComponent;", "Landroid/graphics/drawable/Drawable;", "leadImage", "setLeadImage", "(Landroid/graphics/drawable/Drawable;)Lru/yandex/taxi/design/action/ActionComponent;", "imageRes", "(I)Lru/yandex/taxi/design/action/ActionComponent;", "Lru/yandex/taxi/design/action/ActionComponent$Mode;", "mode", "setMode", "(Lru/yandex/taxi/design/action/ActionComponent$Mode;)Lru/yandex/taxi/design/action/ActionComponent;", "titleSize", "setTitleSize", "subtitleSize", "setSubtitleSize", "componentBackground", "setComponentBackground", "", "isEnabled", "setComponentEnabled", "(Z)Lru/yandex/taxi/design/action/ActionComponent;", "autoHideIconToFitText", "setAutoHideIconToFitText", BackendConfig.Restrictions.ENABLED, "setProgressAnimation", "enableProgressAnimation", "Lkdc;", "color", "setTitleColor", "(Lkdc;)Lru/yandex/taxi/design/action/ActionComponent;", "setSubtitleColor", "setComponentBackgroundTint", "Lru/yandex/taxi/design/action/ActionComponent$ImageSize;", "imageSize", "setLeadImageSize", "(Lru/yandex/taxi/design/action/ActionComponent$ImageSize;)Lru/yandex/taxi/design/action/ActionComponent;", "importantForAccessibility", "setTrailImportantForAccessibility", "icon", "setTrailIcon", "", "text", "setTrailTextAccessibility", "(Ljava/lang/String;)Lru/yandex/taxi/design/action/ActionComponent;", "iconId", "Ljava/lang/Runnable;", "trailOnClickAction", "setTrailOnClickAction", "(Ljava/lang/Runnable;)Lru/yandex/taxi/design/action/ActionComponent;", "listener", "Lzy11;", "setDebounceClickListener", "(Ljava/lang/Runnable;)V", "alignment", "setTextsAlignment", "hidden", "setSeparatorHidden", "invalidateComponent", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "initStaticStyles", "initAttributes", "(Landroid/util/AttributeSet;I)V", "invalidateTrail", "invalidateLayout", "title", "invalidateTextViews", "(Ljava/lang/CharSequence;)V", "invalidateImage", "withLeadImage", "invalidatePadding", "(Ljava/lang/CharSequence;Z)V", "updateAdditionalTextsPaddings", "Landroid/graphics/drawable/Drawable;", "Lru/yandex/taxi/design/action/ActionComponent$Mode;", "DEFAULT_TITLE_TEXT_SIZE", CA20Status.STATUS_USER_I, "DEFAULT_SUBTITLE_TEXT_SIZE", "", "DISABLED_IMAGE_ALPHA", "F", "DEFAULT_TITLE_COLOR", "Lkdc;", "DISABLED_TITLE_COLOR", "DEFAULT_COMPONENT_BACKGROUND", "titleColor", "subTitleColor", "DEFAULT_BACKGROUND_COLOR", "backgroundTint", "backgroundTintChanged", "Z", "leadImageSize", "Lru/yandex/taxi/design/action/ActionComponent$ImageSize;", "paddingEndWithoutImage", "paddingStartWithoutImage", "paddingWithoutTitle", "minHeight", "imagePadding", "withImageStartPadding", "withImageEndPadding", "smallImageSize", "bigImageCornerRadius", "hasProgressAnimation", "Lru/yandex/taxi/design/action/ActionComponentContainer;", "container", "Lru/yandex/taxi/design/action/ActionComponentContainer;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "subTitleView", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "leadImageView", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "Landroid/widget/ImageView;", "trailImageView", "Landroid/widget/ImageView;", "Landroid/view/View;", "trailDividerView", "Landroid/view/View;", "Lbjz0;", "textFitChecker", "Lbjz0;", "Ldjz0;", "titleVariantsFinder", "Ldjz0;", "subTitle", "Ljava/lang/CharSequence;", "trailImage", "textsAlignment", "getTextsAlignment$annotations", "isSeparatorHidden", "additionalTextsStartPadding", "additionalTextsEndPadding", "Mode", "ImageSize", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ActionComponent extends FrameLayout implements nwy0 {
    private final kdc DEFAULT_BACKGROUND_COLOR;
    private final Drawable DEFAULT_COMPONENT_BACKGROUND;
    private final int DEFAULT_SUBTITLE_TEXT_SIZE;
    private final kdc DEFAULT_TITLE_COLOR;
    private final int DEFAULT_TITLE_TEXT_SIZE;
    private final float DISABLED_IMAGE_ALPHA;
    private final kdc DISABLED_TITLE_COLOR;
    private int additionalTextsEndPadding;
    private int additionalTextsStartPadding;
    private boolean autoHideIconToFitText;
    private kdc backgroundTint;
    private boolean backgroundTintChanged;
    private final int bigImageCornerRadius;
    private Drawable componentBackground;
    private final ActionComponentContainer container;
    private boolean hasProgressAnimation;
    private final int imagePadding;
    private boolean isEnabled;
    private boolean isSeparatorHidden;
    private Drawable leadImage;
    private ImageSize leadImageSize;
    private final RoundedCornersImageView leadImageView;
    private final int minHeight;
    private Mode mode;
    private final int paddingEndWithoutImage;
    private final int paddingStartWithoutImage;
    private final int paddingWithoutTitle;
    private final int smallImageSize;
    private CharSequence subTitle;
    private kdc subTitleColor;
    private final TextView subTitleView;
    private float subtitleSize;
    private final bjz0 textFitChecker;
    private int textsAlignment;
    private kdc titleColor;
    private float titleSize;
    private djz0 titleVariantsFinder;
    private final TextView titleView;
    private final View trailDividerView;
    private Drawable trailImage;
    private final ImageView trailImageView;
    private final int withImageEndPadding;
    private final int withImageStartPadding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/design/action/ActionComponent$ImageSize;", "", "Companion", "ru/yandex/taxi/design/action/a", "SMALL", "BIG", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ImageSize {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ImageSize[] $VALUES;
        public static final ImageSize BIG;
        public static final a Companion;
        public static final ImageSize SMALL;

        static {
            ImageSize imageSize = new ImageSize("SMALL", 0);
            SMALL = imageSize;
            ImageSize imageSize2 = new ImageSize("BIG", 1);
            BIG = imageSize2;
            ImageSize[] imageSizeArr = {imageSize, imageSize2};
            $VALUES = imageSizeArr;
            $ENTRIES = kotlin.enums.a.a(imageSizeArr);
            Companion = new a();
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static ImageSize valueOf(String str) {
            return (ImageSize) Enum.valueOf(ImageSize.class, str);
        }

        public static ImageSize[] values() {
            return (ImageSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/design/action/ActionComponent$Mode;", "", "Companion", "ru/yandex/taxi/design/action/b", "NORMAL", "BUTTON", "ICON", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode BUTTON;
        public static final b Companion;
        public static final Mode ICON;
        public static final Mode NORMAL;

        static {
            Mode mode = new Mode("NORMAL", 0);
            NORMAL = mode;
            Mode mode2 = new Mode("BUTTON", 1);
            BUTTON = mode2;
            Mode mode3 = new Mode("ICON", 2);
            ICON = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = kotlin.enums.a.a(modeArr);
            Companion = new b();
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public ActionComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c.q(this, sph0.component_action, true);
        this.mode = Mode.NORMAL;
        int r = tje.r(mrg0.component_text_size_body, getContext());
        this.DEFAULT_TITLE_TEXT_SIZE = r;
        int r2 = tje.r(mrg0.component_text_size_caption, getContext());
        this.DEFAULT_SUBTITLE_TEXT_SIZE = r2;
        this.DISABLED_IMAGE_ALPHA = 0.4f;
        bdc bdcVar = new bdc(xng0.textMain);
        this.DEFAULT_TITLE_COLOR = bdcVar;
        this.DISABLED_TITLE_COLOR = new bdc(xng0.textMinor);
        Drawable y = tje.y(dzg0.bg_action_component, getContext());
        this.DEFAULT_COMPONENT_BACKGROUND = y;
        this.componentBackground = y;
        this.titleSize = r;
        this.titleColor = bdcVar;
        this.subtitleSize = r2;
        this.subTitleColor = bdcVar;
        bdc bdcVar2 = new bdc(xng0.controlMinor);
        this.DEFAULT_BACKGROUND_COLOR = bdcVar2;
        this.backgroundTint = bdcVar2;
        this.backgroundTintChanged = true;
        this.leadImageSize = ImageSize.SMALL;
        this.paddingEndWithoutImage = tje.r(mrg0.go_design_m_space, getContext());
        this.paddingStartWithoutImage = tje.r(mrg0.go_design_m_space, getContext());
        this.paddingWithoutTitle = tje.u(12, getContext());
        this.minHeight = tje.u(48, getContext());
        this.imagePadding = tje.r(mrg0.go_design_s_space, getContext());
        this.withImageStartPadding = tje.u(12, getContext());
        this.withImageEndPadding = tje.r(mrg0.go_design_s_space, getContext());
        this.smallImageSize = tje.u(24, getContext());
        this.bigImageCornerRadius = tje.r(mrg0.go_design_m_space, getContext());
        this.isEnabled = true;
        int i2 = ndh0.action_component_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.container = (ActionComponentContainer) ((View) rp31.d(this, i2));
        TextView textView = (TextView) ((View) rp31.d(this, ndh0.action_component_title));
        this.titleView = textView;
        this.subTitleView = (TextView) ((View) rp31.d(this, ndh0.action_component_subtitle));
        this.leadImageView = (RoundedCornersImageView) ((View) rp31.d(this, ndh0.action_component_image));
        this.trailImageView = (ImageView) ((View) rp31.d(this, ndh0.action_component_trail_icon));
        this.trailDividerView = (View) rp31.d(this, ndh0.action_component_trail_divider);
        bjz0 bjz0Var = new bjz0(textView);
        this.textFitChecker = bjz0Var;
        this.titleVariantsFinder = new djz0(Collections.EMPTY_LIST, bjz0Var);
        initAttributes(attributeSet, i);
        initStaticStyles();
    }

    private static /* synthetic */ void getTextsAlignment$annotations() {
    }

    private final void initAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ActionComponent, defStyleAttr, 0);
        try {
            CharSequence text = obtainStyledAttributes.getText(c4i0.ActionComponent_component_action_title);
            if (text == null) {
                text = "";
            }
            setTitleVariant(text);
            setSubtitle(obtainStyledAttributes.getText(c4i0.ActionComponent_component_action_subtitle));
            int resourceId = obtainStyledAttributes.getResourceId(c4i0.ActionComponent_component_action_image, 0);
            if (resourceId != 0) {
                this.leadImage = vng.t(resourceId, getContext());
            }
            a aVar = ImageSize.Companion;
            int integer = obtainStyledAttributes.getInteger(c4i0.ActionComponent_component_action_image_size, 0);
            aVar.getClass();
            this.leadImageSize = (ImageSize) ika1.c(ImageSize.a(), integer, ImageSize.SMALL);
            b bVar = Mode.Companion;
            int integer2 = obtainStyledAttributes.getInteger(c4i0.ActionComponent_component_action_mode, 0);
            bVar.getClass();
            this.mode = (Mode) ika1.c(Mode.a(), integer2, Mode.NORMAL);
            Drawable drawable = obtainStyledAttributes.getDrawable(c4i0.ActionComponent_component_action_background);
            if (drawable != null) {
                this.componentBackground = drawable;
            }
            this.titleSize = obtainStyledAttributes.getDimensionPixelSize(c4i0.ActionComponent_component_action_title_size, this.DEFAULT_TITLE_TEXT_SIZE);
            int color = obtainStyledAttributes.getColor(c4i0.ActionComponent_component_action_title_color, 0);
            this.titleColor = color != 0 ? new cdc(color) : this.DEFAULT_TITLE_COLOR;
            int color2 = obtainStyledAttributes.getColor(c4i0.ActionComponent_component_action_background_tint, 0);
            this.backgroundTint = color2 != 0 ? new cdc(color2) : this.DEFAULT_BACKGROUND_COLOR;
            int color3 = obtainStyledAttributes.getColor(c4i0.ActionComponent_component_action_subtitle_color, 0);
            this.subTitleColor = color3 != 0 ? new cdc(color3) : this.DEFAULT_TITLE_COLOR;
            setComponentEnabled(obtainStyledAttributes.getBoolean(c4i0.ActionComponent_component_action_enabled, true));
            setAutoHideIconToFitText(obtainStyledAttributes.getBoolean(c4i0.ActionComponent_component_action_auto_hide_icon, false));
            obtainStyledAttributes.recycle();
            invalidateComponent();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void initStaticStyles() {
        this.container.setMinHeight(this.minHeight);
    }

    private final void invalidateImage() {
        if (this.leadImage != null) {
            if (this.leadImageSize == ImageSize.SMALL) {
                this.leadImageView.setCornerRadius(0.0f);
                this.leadImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                float f = this.mode == Mode.ICON ? this.bigImageCornerRadius : 0.0f;
                boolean n = xw31.n(getContext());
                RoundedCornersImageView roundedCornersImageView = this.leadImageView;
                if (n) {
                    roundedCornersImageView.setRotationY(180.0f);
                    RoundedCornersImageView roundedCornersImageView2 = this.leadImageView;
                    int i = this.bigImageCornerRadius;
                    roundedCornersImageView2.setCornerRadius(f, i, i, f);
                } else {
                    roundedCornersImageView.setRotationY(0.0f);
                    RoundedCornersImageView roundedCornersImageView3 = this.leadImageView;
                    int i2 = this.bigImageCornerRadius;
                    roundedCornersImageView3.setCornerRadius(i2, f, f, i2);
                }
                this.leadImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            this.leadImageView.setAlpha(this.isEnabled ? 1.0f : this.DISABLED_IMAGE_ALPHA);
            this.leadImageView.setVisibility(0);
        } else {
            this.leadImageView.setVisibility(8);
        }
        this.leadImageView.setImageDrawable(this.leadImage);
    }

    private final void invalidateLayout() {
        ImageSize imageSize = this.leadImageSize;
        ImageSize imageSize2 = ImageSize.SMALL;
        RoundedCornersImageView roundedCornersImageView = this.leadImageView;
        if (imageSize == imageSize2) {
            int i = this.smallImageSize;
            Rect rect = xw31.a;
            c.E(i, roundedCornersImageView);
            c.C(this.smallImageSize, this.leadImageView);
        } else {
            Rect rect2 = xw31.a;
            c.E(0, roundedCornersImageView);
            c.C(0, this.leadImageView);
        }
        e eVar = new e();
        eVar.g(this.container);
        Mode mode = this.mode;
        Mode mode2 = Mode.ICON;
        RoundedCornersImageView roundedCornersImageView2 = this.leadImageView;
        if (mode == mode2) {
            eVar.i(roundedCornersImageView2.getId(), 7, 0, 7);
        } else {
            eVar.e(roundedCornersImageView2.getId(), 7);
        }
        eVar.b(this.container);
    }

    private final void invalidatePadding(CharSequence title, boolean withLeadImage) {
        this.titleView.setPaddingRelative(0, 0, 0, 0);
        this.subTitleView.setPaddingRelative(0, 0, 0, 0);
        this.container.setPaddingRelative(0, 0, 0, 0);
        if (title == null || evu0.J(title)) {
            this.container.setPaddingRelative(this.leadImageSize == ImageSize.SMALL ? this.paddingWithoutTitle : 0, 0, this.mode == Mode.NORMAL ? 0 : this.paddingWithoutTitle, 0);
            return;
        }
        TextView textView = this.titleView;
        if (!withLeadImage) {
            textView.setPaddingRelative(this.paddingStartWithoutImage + this.additionalTextsStartPadding, 0, this.paddingEndWithoutImage + this.additionalTextsEndPadding, 0);
            this.subTitleView.setPaddingRelative(this.paddingStartWithoutImage + this.additionalTextsStartPadding, 0, this.paddingEndWithoutImage + this.additionalTextsEndPadding, 0);
        } else {
            textView.setPaddingRelative(this.imagePadding + this.additionalTextsStartPadding, 0, this.withImageEndPadding + this.additionalTextsEndPadding, 0);
            this.subTitleView.setPaddingRelative(this.imagePadding + this.additionalTextsStartPadding, 0, this.withImageEndPadding + this.additionalTextsEndPadding, 0);
            this.container.setPaddingRelative(this.leadImageSize == ImageSize.SMALL ? this.withImageStartPadding : 0, 0, 0, 0);
        }
    }

    private final void invalidateTextViews(CharSequence title) {
        this.titleView.setTextSize(0, this.titleSize);
        this.subTitleView.setTextSize(0, this.subtitleSize);
        boolean z = this.isEnabled;
        TextView textView = this.titleView;
        if (z) {
            textView.setTextColor(s8o.m(this.titleColor, getContext()));
            this.subTitleView.setTextColor(s8o.m(this.subTitleColor, getContext()));
        } else {
            textView.setTextColor(s8o.m(this.DISABLED_TITLE_COLOR, getContext()));
            this.subTitleView.setTextColor(s8o.m(this.DISABLED_TITLE_COLOR, getContext()));
        }
        this.titleView.setText(title);
        jx81.c(this.titleView, this.textsAlignment);
        int i = 8;
        this.titleView.setVisibility((title == null || evu0.J(title)) ? 8 : 0);
        this.subTitleView.setText(this.subTitle);
        jx81.c(this.subTitleView, this.textsAlignment);
        TextView textView2 = this.subTitleView;
        CharSequence charSequence = this.subTitle;
        if (charSequence != null && !evu0.J(charSequence)) {
            i = 0;
        }
        textView2.setVisibility(i);
        Mode mode = this.mode;
        Mode mode2 = Mode.NORMAL;
        TextView textView3 = this.titleView;
        if (mode == mode2) {
            int[] iArr = up11.a;
            textView3.setTypeface(eja1.w(3, 0));
        } else {
            int[] iArr2 = up11.a;
            textView3.setTypeface(eja1.w(0, 0));
        }
    }

    private final void invalidateTrail() {
        if (this.mode == Mode.ICON || this.trailImage == null) {
            this.trailDividerView.setVisibility(8);
            this.trailImageView.setVisibility(8);
            return;
        }
        boolean n = xw31.n(getContext());
        ImageView imageView = this.trailImageView;
        if (n) {
            imageView.setRotationY(180.0f);
        } else {
            imageView.setRotationY(0.0f);
        }
        this.trailDividerView.setVisibility(this.isSeparatorHidden ? 8 : 0);
        this.trailImageView.setVisibility(this.trailImage != null ? 0 : 8);
        this.trailImageView.setImageDrawable(this.trailImage);
    }

    private final void updateAdditionalTextsPaddings() {
        if (this.textsAlignment != 1) {
            this.additionalTextsStartPadding = 0;
            this.additionalTextsEndPadding = 0;
            return;
        }
        int measuredWidth = this.leadImageView.getMeasuredWidth();
        int measuredWidth2 = this.trailImageView.getMeasuredWidth();
        if (measuredWidth > 0 && measuredWidth2 > 0) {
            this.additionalTextsStartPadding = 0;
            this.additionalTextsEndPadding = 0;
        } else if (measuredWidth2 > 0) {
            this.additionalTextsStartPadding = measuredWidth2;
        } else if (measuredWidth > 0) {
            this.additionalTextsEndPadding = measuredWidth;
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final ActionComponent enableProgressAnimation(boolean enabled) {
        this.hasProgressAnimation = enabled;
        return this;
    }

    public void invalidateComponent() {
        Drawable drawable = this.componentBackground;
        if (drawable != null && this.backgroundTintChanged) {
            drawable.mutate().setTint(s8o.m(this.backgroundTint, getContext()));
            this.backgroundTintChanged = false;
        }
        this.container.setBackground(this.componentBackground);
        if (this.mode == Mode.ICON) {
            this.titleView.setVisibility(8);
            this.subTitleView.setVisibility(8);
            invalidateImage();
            int i = this.leadImageSize == ImageSize.SMALL ? this.withImageStartPadding : 0;
            this.container.setPaddingRelative(i, 0, i, 0);
            this.container.setProgressAnimation$design_components(false);
        } else {
            CharSequence charSequence = (CharSequence) kotlin.collections.a.R(this.titleVariantsFinder.b);
            invalidateTextViews(charSequence);
            invalidateImage();
            invalidatePadding(charSequence, this.leadImage != null);
            this.container.setProgressAnimation$design_components(this.hasProgressAnimation);
        }
        invalidateTrail();
        invalidateLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        CharSequence charSequence;
        int i = getLayoutParams().width;
        ActionComponentContainer actionComponentContainer = this.container;
        if (i == -2) {
            Rect rect = xw31.a;
            c.E(-2, actionComponentContainer);
            c.E(-2, this.titleView);
            c.E(-2, this.subTitleView);
        } else {
            Rect rect2 = xw31.a;
            c.E(-1, actionComponentContainer);
            c.E(0, this.titleView);
            c.E(0, this.subTitleView);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.titleView.getVisibility() == 8) {
            return;
        }
        djz0 djz0Var = this.titleVariantsFinder;
        List list = djz0Var.b;
        if (!list.isEmpty()) {
            if (list.size() != 1) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        charSequence = (CharSequence) b64.c(1, list);
                        break;
                    }
                    CharSequence charSequence2 = (CharSequence) it.next();
                    if (djz0Var.a.e(charSequence2)) {
                        charSequence = charSequence2;
                        break;
                    }
                }
            } else {
                charSequence = (CharSequence) list.get(0);
            }
        } else {
            charSequence = null;
        }
        String obj = charSequence != null ? charSequence.toString() : null;
        CharSequence text = this.titleView.getText();
        if (!jl40.l(obj, text != null ? text.toString() : null)) {
            this.titleView.setText(charSequence);
        }
        updateAdditionalTextsPaddings();
        CharSequence text2 = this.titleView.getText();
        if (!this.autoHideIconToFitText) {
            invalidatePadding(text2, this.leadImage != null);
            return;
        }
        if (this.leadImageView.getVisibility() != 0 || this.textFitChecker.e(text2)) {
            return;
        }
        this.leadImageView.setVisibility(8);
        RoundedCornersImageView roundedCornersImageView = this.leadImageView;
        Rect rect3 = xw31.a;
        c.E(0, roundedCornersImageView);
        invalidatePadding(text2, false);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final ActionComponent setAutoHideIconToFitText(boolean autoHideIconToFitText) {
        this.autoHideIconToFitText = autoHideIconToFitText;
        return this;
    }

    public final ActionComponent setComponentBackground(Drawable componentBackground) {
        this.componentBackground = componentBackground;
        return this;
    }

    public final ActionComponent setComponentBackgroundTint(kdc color) {
        this.backgroundTint = color;
        this.backgroundTintChanged = true;
        return this;
    }

    public final ActionComponent setComponentEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    public void setDebounceClickListener(Runnable listener) {
        if (listener == null) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            Object context = getContext();
            setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), listener));
        }
    }

    public final ActionComponent setLeadImage(int imageRes) {
        this.leadImage = imageRes == 0 ? null : vng.t(imageRes, getContext());
        return this;
    }

    public final ActionComponent setLeadImageSize(ImageSize imageSize) {
        this.leadImageSize = imageSize;
        return this;
    }

    public final ActionComponent setMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    public final ActionComponent setProgressAnimation(boolean enabled) {
        this.hasProgressAnimation = enabled;
        return this;
    }

    public final ActionComponent setSeparatorHidden(boolean hidden) {
        this.isSeparatorHidden = hidden;
        return this;
    }

    public final ActionComponent setSubtitle(CharSequence subtitle) {
        this.subTitle = subtitle;
        return this;
    }

    public final ActionComponent setSubtitleColor(kdc color) {
        this.subTitleColor = color;
        return this;
    }

    public final ActionComponent setSubtitleSize(int subtitleSize) {
        this.subtitleSize = subtitleSize;
        return this;
    }

    public final ActionComponent setTextsAlignment(int alignment) {
        this.textsAlignment = alignment;
        return this;
    }

    public final ActionComponent setTitleColor(kdc color) {
        this.titleColor = color;
        return this;
    }

    public final ActionComponent setTitleSize(int titleSize) {
        this.titleSize = titleSize;
        return this;
    }

    public final ActionComponent setTitleVariant(CharSequence titleVariant) {
        return setTitleVariants(Collections.singletonList(titleVariant));
    }

    public final ActionComponent setTitleVariants(List<? extends CharSequence> titleVariants) {
        this.titleVariantsFinder = new djz0(titleVariants, this.textFitChecker);
        return this;
    }

    public final ActionComponent setTrailIcon(int iconId) {
        this.trailImage = vng.t(iconId, getContext());
        return this;
    }

    public final ActionComponent setTrailImportantForAccessibility(boolean importantForAccessibility) {
        this.trailImageView.setImportantForAccessibility(importantForAccessibility ? 1 : 2);
        return this;
    }

    public final ActionComponent setTrailOnClickAction(Runnable trailOnClickAction) {
        if (trailOnClickAction == null) {
            this.trailImageView.setOnClickListener(null);
            this.trailImageView.setClickable(false);
            return this;
        }
        Object context = getContext();
        this.trailImageView.setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), trailOnClickAction));
        return this;
    }

    public final ActionComponent setTrailTextAccessibility(String text) {
        this.trailImageView.setContentDescription(text);
        return this;
    }

    public final ActionComponent setTrailIcon(Drawable icon) {
        this.trailImage = icon != null ? icon.mutate() : null;
        return this;
    }

    public final ActionComponent setLeadImage(Drawable leadImage) {
        this.leadImage = leadImage != null ? leadImage.mutate() : null;
        return this;
    }

    public ActionComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ActionComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ActionComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.actionComponentStyle : i);
    }
}
