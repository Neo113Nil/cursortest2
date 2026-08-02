package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.cdc;
import defpackage.dl40;
import defpackage.evu0;
import defpackage.fl40;
import defpackage.gdc;
import defpackage.hdc;
import defpackage.hg;
import defpackage.ijs;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.s8o;
import defpackage.sls;
import defpackage.ssu;
import defpackage.tje;
import defpackage.vng;
import defpackage.vql;
import defpackage.xw31;
import defpackage.zuc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.DebounceClickListener;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.accessibility.AccessibilityButtonFrameLayout;
import ru.yandex.taxi.widget.accessibility.AccessibilityButtonLinearLayout;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ³\u00012\u00020\u00012\u00020\u0002:\u0006´\u0001µ\u0001¶\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010 J\u0017\u0010\"\u001a\u00020\f2\b\b\u0001\u0010#\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010**\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b-\u0010.J\u0017\u0010\u001f\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b\u001f\u00101J\u0017\u00103\u001a\u00020\f2\b\b\u0001\u00102\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00105\u001a\u00020\f2\b\b\u0001\u00104\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\u000eJ\u0017\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000106¢\u0006\u0004\b5\u00107J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\f2\b\b\u0001\u0010<\u001a\u00020\u0007¢\u0006\u0004\b=\u0010\u000eJ\u0015\u0010@\u001a\u00020\f2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\f2\b\b\u0001\u0010<\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\u000eJ\u0017\u0010D\u001a\u00020\f2\b\b\u0001\u0010C\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\u000eJ\u0017\u0010E\u001a\u00020\f2\b\b\u0001\u0010C\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\u000eJ\u0017\u0010F\u001a\u00020\f2\b\b\u0001\u0010C\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\u000eJ\u0015\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\f2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bK\u0010JJ\u0017\u0010N\u001a\u00020\f2\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010\u000eJ\u0017\u0010R\u001a\u00020\f2\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bR\u0010OJ\u0017\u0010N\u001a\u00020\f2\b\b\u0001\u0010S\u001a\u00020\u0007¢\u0006\u0004\bN\u0010\u000eJ\u0015\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u0007¢\u0006\u0004\bU\u0010\u000eJ\u0015\u0010V\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u0007¢\u0006\u0004\bV\u0010\u000eJ\u0015\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u0007¢\u0006\u0004\bX\u0010\u000eJ\u0015\u0010Y\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u0007¢\u0006\u0004\bY\u0010\u000eJ\u0015\u0010[\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\u000eJ\u0015\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0019\u0010a\u001a\u00020\f2\b\u0010`\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\ba\u0010OJ\u001d\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0007¢\u0006\u0004\bc\u0010dJ-\u0010i\u001a\u00020\f2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0007¢\u0006\u0004\bi\u0010jJ\u0015\u0010l\u001a\u00020\f2\u0006\u0010k\u001a\u00020\u0007¢\u0006\u0004\bl\u0010\u000eJ\u001d\u0010l\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007¢\u0006\u0004\bl\u0010dJ-\u0010m\u001a\u00020\f2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0007¢\u0006\u0004\bm\u0010jJ\u001d\u0010n\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007¢\u0006\u0004\bn\u0010dJ\u0015\u0010q\u001a\u00020\f2\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bq\u0010rJ\u0019\u0010t\u001a\u00020\f2\b\u0010p\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bt\u0010uJ\u001d\u0010t\u001a\u00020\f2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010v¢\u0006\u0004\bt\u0010wJ\u0015\u0010z\u001a\u00020\f2\u0006\u0010y\u001a\u00020x¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\f2\b\b\u0001\u00109\u001a\u00020\u0007¢\u0006\u0004\b|\u0010\u000eJ\r\u0010}\u001a\u00020\f¢\u0006\u0004\b}\u0010\u0012J\r\u0010~\u001a\u00020\f¢\u0006\u0004\b~\u0010\u0012J\u001b\u0010\u0081\u0001\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0014¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J5\u0010\u0087\u0001\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\u00072\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00020\u0007H\u0014¢\u0006\u0005\b\u0087\u0001\u0010jJ\u001c\u0010\u008a\u0001\u001a\u00020\f2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J$\u0010\u008e\u0001\u001a\u00020\f2\u0007\u0010\u008c\u0001\u001a\u00020\u00162\u0007\u0010\u008d\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0019J\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b\u0093\u0001\u0010)J\u0011\u0010\u0094\u0001\u001a\u00020$H\u0002¢\u0006\u0005\b\u0094\u0001\u0010&J\u0011\u0010\u0095\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0095\u0001\u0010\u0012J\u0011\u0010\u0096\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0012J\u0011\u0010\u0097\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0012J\u0012\u0010\u0098\u0001\u001a\u00020xH\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0012R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R*\u0010¤\u0001\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010&\"\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010ª\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0019\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010¬\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010¯\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010«\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001¨\u0006·\u0001"}, d2 = {"Lru/yandex/taxi/design/ListItemSideContainer;", "Lru/yandex/taxi/widget/accessibility/AccessibilityButtonLinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paddingEnd", "Lzy11;", "setCompanionTextPaddingEnd", "(I)V", "paddingStart", "setCompanionTextPaddingStart", "switchToCompanionTextMode", "()V", "switchToCompanionImageMode", "startCompanionTextProgressAnimation", "stopCompanionTextProgressAnimation", "Landroid/view/View;", "view", "setView", "(Landroid/view/View;)V", "clearView", "layout", "(I)Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "drawable", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "res", "setCompanionImage", "drawableRes", "Landroid/widget/ImageView;", "getCompanionImageView", "()Landroid/widget/ImageView;", "Lru/yandex/taxi/design/ClickableImageView;", "getAsImageView", "()Lru/yandex/taxi/design/ClickableImageView;", CA20Status.STATUS_CERTIFICATE_V, "Ljava/lang/Class;", "viewType", "getAsView", "(Ljava/lang/Class;)Landroid/view/View;", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)V", "colorRes", "setImageTintColorRes", "tint", "setImageTintColor", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "Lkdc;", "color", "setImageColor", "(Lkdc;)V", "textSize", "setCompanionTextSize", "", "letterSpacing", "setCompanionLetterSpacing", "(F)V", "setCompanionSubtextSize", "colorInt", "setCompanionTextColor", "setCompanionSubtextColor", "setCompanionStrongTextColor", "Lru/yandex/taxi/design/CompanionTextStyle;", "style", "setCompanionTextStyle", "(Lru/yandex/taxi/design/CompanionTextStyle;)V", "setCompanionSubtextStyle", "", "text", "setCompanionText", "(Ljava/lang/CharSequence;)V", "lines", "setCompanionTextMaxLines", "setCompanionSubtext", "resId", "typeface", "setCompanionTextTypeface", "setCompanionSubtextTypeface", "alignment", "setCompanionTextAlignment", "setCompanionSubtextAlignment", "width", "setMaxCompanionTextWidth", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "setCompanionTextEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "contentDescription", "setContentDescription", "height", "setIconHolderSize", "(II)V", "left", "top", "right", "bottom", "setIconPadding", "(IIII)V", "size", "setIconSize", "setCompanionImagePadding", "setCompanionImageSize", "Landroid/view/View$OnClickListener;", "listener", "setOnImageClickListener", "(Landroid/view/View$OnClickListener;)V", "Ljava/lang/Runnable;", "setDebounceClickListener", "(Ljava/lang/Runnable;)V", "Lkotlin/Function0;", "(Lsls;)V", "", "clip", "clipChildren", "(Z)V", "setLeftDividerColor", "showStartDivider", "hideStartDivider", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldW", "oldH", "onSizeChanged", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "original", "replacement", "replaceLeadingView", "(Landroid/view/View;Landroid/view/View;)V", "setViewToContainer", "provideImageView", "(Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;", "instantiateImageView", "instantiateCompanionImageView", "invalidateCompanionTextHolder", "invalidateImageProps", "invalidateCompanionImageProps", "hasContent", "()Z", "invalidateAccessibilityImportance", "Landroid/widget/FrameLayout;", "viewsContainer", "Landroid/widget/FrameLayout;", "Lzuc;", "companionTextHolder", "Lzuc;", "companionPaddingEnd", CA20Status.STATUS_USER_I, "companionPaddingStart", "companionImageView", "Landroid/widget/ImageView;", "getCompanionImageView$design_components", "setCompanionImageView$design_components", "(Landroid/widget/ImageView;)V", "Lru/yandex/taxi/design/ListItemSideContainer$b;", "companionImageProps", "Lru/yandex/taxi/design/ListItemSideContainer$b;", "Lkdc;", "imageView", "Lru/yandex/taxi/design/ClickableImageView;", "imageProps", "Lvql;", "dividerDrawDelegate", "Lvql;", "Companion", "a", "b", "ru/yandex/taxi/design/j", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ListItemSideContainer extends AccessibilityButtonLinearLayout implements nwy0 {
    public static final j Companion = new j();
    private kdc color;
    private final b companionImageProps;
    private ImageView companionImageView;
    private int companionPaddingEnd;
    private int companionPaddingStart;
    private final zuc companionTextHolder;
    private final vql dividerDrawDelegate;
    private final b imageProps;
    private ClickableImageView imageView;
    private final FrameLayout viewsContainer;

    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public static final class b extends a {
        public int f;
    }

    public ListItemSideContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        setMinimumWidth(tje.r(mrg0.go_design_m_space, getContext()));
        this.companionPaddingEnd = tje.r(mrg0.go_design_m_space, getContext());
        this.companionPaddingStart = tje.r(mrg0.go_design_m_space, getContext());
        zuc zucVar = new zuc(context);
        this.companionTextHolder = zucVar;
        addView(zucVar.a, new LinearLayout.LayoutParams(-2, -1));
        AccessibilityButtonFrameLayout accessibilityButtonFrameLayout = new AccessibilityButtonFrameLayout(context, null, 0, 6, null);
        this.viewsContainer = accessibilityButtonFrameLayout;
        addView(accessibilityButtonFrameLayout, -2, -1);
        Companion.getClass();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mrg0.component_safe_image_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(mrg0.component_image_holder_size);
        b bVar = new b();
        bVar.b = dimensionPixelSize;
        bVar.c = dimensionPixelSize;
        bVar.d = dimensionPixelSize;
        bVar.e = dimensionPixelSize;
        bVar.a = dimensionPixelSize2;
        bVar.f = dimensionPixelSize2;
        this.imageProps = bVar;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(mrg0.component_safe_image_padding);
        int u = tje.u(56, context);
        int u2 = tje.u(32, context);
        b bVar2 = new b();
        bVar2.b = dimensionPixelSize3;
        bVar2.c = dimensionPixelSize3;
        bVar2.d = dimensionPixelSize3;
        bVar2.e = dimensionPixelSize3;
        bVar2.a = u;
        bVar2.f = u2;
        this.companionImageProps = bVar2;
        this.dividerDrawDelegate = new vql(context, null, new ssu(2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean hasContent() {
        boolean z;
        RobotoTextView robotoTextView;
        boolean z2;
        CharSequence contentDescription;
        CharSequence text;
        CharSequence text2;
        zuc zucVar = this.companionTextHolder;
        ShimmeringRobotoTextView shimmeringRobotoTextView = zucVar.b;
        if (shimmeringRobotoTextView != null) {
            Rect rect = xw31.a;
            if (shimmeringRobotoTextView.getVisibility() == 0 && (text2 = shimmeringRobotoTextView.getText()) != null && !evu0.J(text2)) {
                z = true;
                robotoTextView = zucVar.c;
                if (robotoTextView != null) {
                    Rect rect2 = xw31.a;
                    if (robotoTextView.getVisibility() == 0 && (text = robotoTextView.getText()) != null && !evu0.J(text)) {
                        z2 = true;
                        return (z && !z2 && getCompanionImageView().getDrawable() == null && (this.viewsContainer.getChildCount() == 0 || jl40.l(this.viewsContainer.getChildAt(0), this.imageView)) && ((contentDescription = getContentDescription()) == null || evu0.J(contentDescription))) ? false : true;
                    }
                }
                z2 = false;
                if (z) {
                }
            }
        }
        z = false;
        robotoTextView = zucVar.c;
        if (robotoTextView != null) {
        }
        z2 = false;
        if (z) {
        }
    }

    private final ImageView instantiateCompanionImageView() {
        ImageView imageView = this.companionImageView;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.companionImageView = imageView2;
        invalidateCompanionImageProps();
        return imageView2;
    }

    private final ClickableImageView instantiateImageView() {
        ClickableImageView clickableImageView = this.imageView;
        if (clickableImageView != null) {
            return clickableImageView;
        }
        ClickableImageView clickableImageView2 = new ClickableImageView(getContext(), null, 0, 6, null);
        clickableImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        clickableImageView2.setVisibility(0);
        this.imageView = clickableImageView2;
        invalidateImageProps();
        return clickableImageView2;
    }

    private final void invalidateAccessibilityImportance() {
        setImportantForAccessibility(hasContent() ? 1 : 2);
    }

    private final void invalidateCompanionImageProps() {
        ImageView imageView = this.companionImageView;
        if (imageView == null) {
            return;
        }
        b bVar = this.companionImageProps;
        imageView.setPadding(bVar.b, bVar.c, bVar.d, bVar.e);
        b bVar2 = this.companionImageProps;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bVar2.a, bVar2.f);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void invalidateCompanionTextHolder() {
        boolean z;
        RobotoTextView robotoTextView;
        boolean z2;
        zuc zucVar;
        int i;
        zuc zucVar2;
        int i2;
        CharSequence text;
        CharSequence text2;
        zuc zucVar3 = this.companionTextHolder;
        ShimmeringRobotoTextView shimmeringRobotoTextView = zucVar3.b;
        boolean z3 = true;
        if (shimmeringRobotoTextView != null) {
            Rect rect = xw31.a;
            if (shimmeringRobotoTextView.getVisibility() == 0 || ((text2 = shimmeringRobotoTextView.getText()) != null && !evu0.J(text2))) {
                z = true;
                robotoTextView = zucVar3.c;
                if (robotoTextView != null) {
                    Rect rect2 = xw31.a;
                    if (robotoTextView.getVisibility() == 0 || ((text = robotoTextView.getText()) != null && !evu0.J(text))) {
                        z2 = true;
                        if (!z && !z2) {
                            z3 = false;
                        }
                        zucVar = this.companionTextHolder;
                        i = (this.viewsContainer.getChildCount() == 0 || !z3) ? 0 : this.companionPaddingEnd;
                        if (zucVar.b == null || zucVar.c != null) {
                            xw31.J(zucVar.a, null, null, Integer.valueOf(i), null);
                        }
                        zucVar2 = this.companionTextHolder;
                        i2 = z3 ? this.companionPaddingStart : 0;
                        if (zucVar2.b == null || zucVar2.c != null) {
                            xw31.J(zucVar2.a, Integer.valueOf(i2), null, null, null);
                        }
                        requestLayout();
                    }
                }
                z2 = false;
                if (!z) {
                    z3 = false;
                }
                zucVar = this.companionTextHolder;
                if (this.viewsContainer.getChildCount() == 0) {
                }
                if (zucVar.b == null) {
                }
                xw31.J(zucVar.a, null, null, Integer.valueOf(i), null);
                zucVar2 = this.companionTextHolder;
                if (z3) {
                }
                if (zucVar2.b == null) {
                }
                xw31.J(zucVar2.a, Integer.valueOf(i2), null, null, null);
                requestLayout();
            }
        }
        z = false;
        robotoTextView = zucVar3.c;
        if (robotoTextView != null) {
        }
        z2 = false;
        if (!z) {
        }
        zucVar = this.companionTextHolder;
        if (this.viewsContainer.getChildCount() == 0) {
        }
        if (zucVar.b == null) {
        }
        xw31.J(zucVar.a, null, null, Integer.valueOf(i), null);
        zucVar2 = this.companionTextHolder;
        if (z3) {
        }
        if (zucVar2.b == null) {
        }
        xw31.J(zucVar2.a, Integer.valueOf(i2), null, null, null);
        requestLayout();
    }

    private final void invalidateImageProps() {
        ClickableImageView clickableImageView = this.imageView;
        if (clickableImageView == null) {
            return;
        }
        b bVar = this.imageProps;
        clickableImageView.setPadding(bVar.b, bVar.c, bVar.d, bVar.e);
        b bVar2 = this.imageProps;
        clickableImageView.setLayoutParams(new FrameLayout.LayoutParams(bVar2.a, bVar2.f, 17));
        invalidateCompanionTextHolder();
    }

    private final ImageView provideImageView(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        ClickableImageView instantiateImageView = instantiateImageView();
        instantiateImageView.setImageDrawable(drawable);
        return instantiateImageView;
    }

    private final void replaceLeadingView(View original, View replacement) {
        removeView(original);
        if (replacement.getParent() != null) {
            return;
        }
        addView(replacement, 0);
    }

    private final void setViewToContainer(View view) {
        FrameLayout frameLayout = this.viewsContainer;
        if (view == null) {
            frameLayout.removeAllViews();
            invalidateCompanionTextHolder();
            return;
        }
        int childCount = frameLayout.getChildCount();
        FrameLayout frameLayout2 = this.viewsContainer;
        if (childCount > 1) {
            frameLayout2.removeAllViews();
            this.viewsContainer.addView(view);
            invalidateCompanionTextHolder();
        } else {
            if (frameLayout2.getChildCount() == 1 && jl40.l(this.viewsContainer.getChildAt(0), view)) {
                return;
            }
            if (this.viewsContainer.getChildCount() == 1 && !jl40.l(this.viewsContainer.getChildAt(0), view)) {
                this.viewsContainer.removeAllViews();
            }
            this.viewsContainer.addView(view);
            xw31.C(16, view);
            invalidateCompanionTextHolder();
            invalidateAccessibilityImportance();
            hg.a(this.viewsContainer);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        kdc kdcVar = this.color;
        if (kdcVar != null) {
            setImageColor(kdcVar);
        }
        this.dividerDrawDelegate.b(getContext());
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void clearView() {
        this.viewsContainer.removeAllViews();
    }

    public final void clipChildren(boolean clip) {
        setClipChildren(clip);
        this.viewsContainer.setClipChildren(clip);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.dividerDrawDelegate.a(canvas);
    }

    public final ClickableImageView getAsImageView() {
        ClickableImageView instantiateImageView = instantiateImageView();
        setViewToContainer(instantiateImageView);
        return instantiateImageView;
    }

    public final <V extends View> V getAsView(Class<V> viewType) {
        if (this.viewsContainer.getChildCount() != 1) {
            return null;
        }
        View childAt = this.viewsContainer.getChildAt(0);
        if (viewType.isInstance(childAt)) {
            return viewType.cast(childAt);
        }
        return null;
    }

    public final ImageView getCompanionImageView() {
        return instantiateCompanionImageView();
    }

    /* renamed from: getCompanionImageView$design_components, reason: from getter */
    public final ImageView getCompanionImageView() {
        return this.companionImageView;
    }

    public final void hideStartDivider() {
        this.dividerDrawDelegate.e(DividerPosition.NONE, DividerType.NONE);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldW, int oldH) {
        super.onSizeChanged(w, h, oldW, oldH);
        this.dividerDrawDelegate.d(w, h);
    }

    public final void setCompanionImage(int drawableRes) {
        setCompanionImage(drawableRes == 0 ? null : vng.t(drawableRes, getContext()));
    }

    public final void setCompanionImagePadding(int left, int top, int right, int bottom) {
        b bVar = this.companionImageProps;
        bVar.b = left;
        bVar.c = top;
        bVar.d = right;
        bVar.e = bottom;
        invalidateCompanionImageProps();
    }

    public final void setCompanionImageSize(int width, int height) {
        b bVar = this.companionImageProps;
        bVar.a = width;
        bVar.f = height;
        invalidateCompanionImageProps();
    }

    public final void setCompanionImageView$design_components(ImageView imageView) {
        this.companionImageView = imageView;
    }

    public final void setCompanionLetterSpacing(float letterSpacing) {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.companionTextHolder.b;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setLetterSpacing(letterSpacing);
        }
    }

    public final void setCompanionStrongTextColor(int colorInt) {
        zuc zucVar = this.companionTextHolder;
        zucVar.g = colorInt;
        zucVar.f(zucVar.b, zucVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r0.setVisibility(r1);
        r0.setText(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        invalidateCompanionTextHolder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000f, code lost:
    
        if (r0.c == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3.length() != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCompanionSubtext(CharSequence text) {
        zuc zucVar = this.companionTextHolder;
        if (text != null) {
            zucVar.getClass();
        }
    }

    public final void setCompanionSubtextAlignment(int alignment) {
        RobotoTextView b2 = this.companionTextHolder.b();
        if (alignment == 0) {
            b2.setTextAlignment(5);
            b2.setGravity(8388611);
        } else if (alignment == 1) {
            b2.setTextAlignment(4);
            b2.setGravity(1);
        } else if (alignment == 2) {
            b2.setTextAlignment(6);
            b2.setGravity(8388613);
        } else if (alignment != 3) {
            b2.setTextAlignment(5);
            b2.setGravity(8388611);
        } else {
            b2.setTextAlignment(2);
            b2.setGravity(8388611);
        }
        zuc.a(alignment, b2);
    }

    public final void setCompanionSubtextColor(int colorInt) {
        zuc zucVar = this.companionTextHolder;
        zucVar.h = colorInt;
        zucVar.e(zucVar.c, zucVar.e);
    }

    public final void setCompanionSubtextSize(int textSize) {
        zuc zucVar = this.companionTextHolder;
        zucVar.j = textSize;
        RobotoTextView robotoTextView = zucVar.c;
        if (robotoTextView != null) {
            robotoTextView.setTextSize(0, textSize);
        }
    }

    public final void setCompanionSubtextStyle(CompanionTextStyle style) {
        zuc zucVar = this.companionTextHolder;
        zucVar.e = style;
        zucVar.e(zucVar.c, style);
    }

    public final void setCompanionSubtextTypeface(int typeface) {
        this.companionTextHolder.b().setTextTypeface(typeface);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
    
        if (r0.b == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = r0.c();
        r0.setVisibility(0);
        r0.setText(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        invalidateCompanionTextHolder();
        invalidateAccessibilityImportance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCompanionText(CharSequence text) {
        zuc zucVar = this.companionTextHolder;
        if (text != null) {
            zucVar.getClass();
        }
    }

    public final void setCompanionTextAlignment(int alignment) {
        ShimmeringRobotoTextView c = this.companionTextHolder.c();
        if (alignment == 0) {
            c.setTextAlignment(5);
            c.setGravity(8388611);
        } else if (alignment == 1) {
            c.setTextAlignment(4);
            c.setGravity(1);
        } else if (alignment == 2) {
            c.setTextAlignment(6);
            c.setGravity(8388613);
        } else if (alignment != 3) {
            c.setTextAlignment(5);
            c.setGravity(8388611);
        } else {
            c.setTextAlignment(2);
            c.setGravity(8388611);
        }
        zuc.a(alignment, c);
    }

    public final void setCompanionTextColor(int colorInt) {
        zuc zucVar = this.companionTextHolder;
        zucVar.f = colorInt;
        zucVar.f(zucVar.b, zucVar.d);
    }

    public final void setCompanionTextEllipsize(TextUtils.TruncateAt ellipsize) {
        this.companionTextHolder.c().setEllipsize(ellipsize);
    }

    public final void setCompanionTextMaxLines(int lines) {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.companionTextHolder.b;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setMaxLines(lines);
        }
        invalidateCompanionTextHolder();
    }

    public final void setCompanionTextPaddingEnd(int paddingEnd) {
        this.companionPaddingEnd = paddingEnd;
        invalidateCompanionTextHolder();
    }

    public final void setCompanionTextPaddingStart(int paddingStart) {
        this.companionPaddingStart = paddingStart;
        invalidateCompanionTextHolder();
    }

    public final void setCompanionTextSize(int textSize) {
        zuc zucVar = this.companionTextHolder;
        zucVar.i = textSize;
        ShimmeringRobotoTextView shimmeringRobotoTextView = zucVar.b;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setTextSize(0, textSize);
        }
    }

    public final void setCompanionTextStyle(CompanionTextStyle style) {
        zuc zucVar = this.companionTextHolder;
        zucVar.d = style;
        zucVar.f(zucVar.b, style);
    }

    public final void setCompanionTextTypeface(int typeface) {
        this.companionTextHolder.c().setTextTypeface(typeface);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence contentDescription) {
        super.setContentDescription(contentDescription);
        invalidateAccessibilityImportance();
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

    public final void setIconHolderSize(int height, int width) {
        b bVar = this.imageProps;
        bVar.a = width;
        bVar.f = height;
        invalidateImageProps();
    }

    public final void setIconPadding(int left, int top, int right, int bottom) {
        b bVar = this.imageProps;
        bVar.b = left;
        bVar.c = top;
        bVar.d = right;
        bVar.e = bottom;
        invalidateImageProps();
    }

    public final void setIconSize(int width, int height) {
        b bVar = this.imageProps;
        bVar.a = width;
        bVar.f = height;
        invalidateImageProps();
    }

    public final void setImage(Bitmap bitmap) {
        setImage(bitmap != null ? new BitmapDrawable(getResources(), bitmap) : null);
    }

    public final void setImageColor(kdc color) {
        this.color = color;
        instantiateImageView().setImageTintList(color instanceof hdc ? ((hdc) color).a : color == null ? null : ColorStateList.valueOf(s8o.m(color, getContext())));
    }

    public final void setImageTintColor(ColorStateList tint) {
        setImageColor(tint == null ? null : new hdc(tint));
    }

    public final void setImageTintColorRes(int colorRes) {
        setImageColor(new gdc(colorRes));
    }

    public final void setLeftDividerColor(int color) {
        vql vqlVar = this.dividerDrawDelegate;
        vqlVar.n = true;
        Paint paint = vqlVar.h;
        if (color != paint.getColor()) {
            paint.setColor(color);
            vqlVar.a.run();
        }
    }

    public final void setMaxCompanionTextWidth(int width) {
        this.companionTextHolder.c().setMaxWidth(width);
    }

    public final void setOnImageClickListener(View.OnClickListener listener) {
        ClickableImageView clickableImageView = this.imageView;
        if (clickableImageView != null) {
            clickableImageView.setOnClickListener(listener);
        }
    }

    public final View setView(int layout) {
        View inflate = LayoutInflater.from(getContext()).inflate(layout, (ViewGroup) this, false);
        setView(inflate);
        return inflate;
    }

    public final void showStartDivider() {
        this.dividerDrawDelegate.e(DividerPosition.START, DividerType.MARGIN_0_75);
    }

    public final void startCompanionTextProgressAnimation() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.companionTextHolder.b;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setAnimateFullWidth(true);
            shimmeringRobotoTextView.startAnimation();
        }
    }

    public final void stopCompanionTextProgressAnimation() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.companionTextHolder.b;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.stopAnimation();
        }
    }

    public final void switchToCompanionImageMode() {
        replaceLeadingView(this.companionTextHolder.a, instantiateCompanionImageView());
    }

    public final void switchToCompanionTextMode() {
        replaceLeadingView(instantiateCompanionImageView(), this.companionTextHolder.a);
    }

    public final void setIconSize(int size) {
        setIconSize(size, size);
    }

    public final void setImageTintColor(int tint) {
        setImageColor(new cdc(tint));
    }

    public final void setCompanionImage(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        instantiateCompanionImageView().setImageDrawable(drawable);
    }

    public final void setImage(int res) {
        setImage(res == 0 ? null : vng.t(res, getContext()));
    }

    public final void setView(View view) {
        this.imageView = null;
        setViewToContainer(view);
    }

    public final void setImage(Drawable drawable) {
        setViewToContainer(provideImageView(drawable));
    }

    public final void setCompanionText(int resId) {
        ShimmeringRobotoTextView c = this.companionTextHolder.c();
        c.setVisibility(0);
        c.setText(resId);
        invalidateCompanionTextHolder();
    }

    public final void setDebounceClickListener(sls listener) {
        setDebounceClickListener(listener != null ? new ijs(7, listener) : null);
    }

    public ListItemSideContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListItemSideContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListItemSideContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
