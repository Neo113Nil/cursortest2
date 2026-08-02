package ru.yandex.taxi.banners.presentation.fullscreen;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.b;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.coroutines.h;
import defpackage.arx;
import defpackage.bdp;
import defpackage.cay0;
import defpackage.chb1;
import defpackage.drc;
import defpackage.eis;
import defpackage.ejp;
import defpackage.erc;
import defpackage.evu0;
import defpackage.fis;
import defpackage.g16;
import defpackage.g18;
import defpackage.gbv;
import defpackage.gep0;
import defpackage.gis;
import defpackage.gr4;
import defpackage.gt4;
import defpackage.his;
import defpackage.hr4;
import defpackage.ht4;
import defpackage.idh0;
import defpackage.iis;
import defpackage.ir4;
import defpackage.iux0;
import defpackage.jis;
import defpackage.jl40;
import defpackage.jln;
import defpackage.kgx;
import defpackage.kis;
import defpackage.kqg0;
import defpackage.l8x;
import defpackage.lls;
import defpackage.lrg0;
import defpackage.ltc;
import defpackage.m810;
import defpackage.mph0;
import defpackage.mqg0;
import defpackage.mtc;
import defpackage.n9y0;
import defpackage.nph0;
import defpackage.nsz;
import defpackage.ntc;
import defpackage.nuz;
import defpackage.ny61;
import defpackage.ois;
import defpackage.ot4;
import defpackage.otc;
import defpackage.ou4;
import defpackage.owd0;
import defpackage.pav;
import defpackage.pdc;
import defpackage.ptc;
import defpackage.q5z;
import defpackage.qeb1;
import defpackage.qf60;
import defpackage.qke;
import defpackage.qpo;
import defpackage.qwh0;
import defpackage.rp31;
import defpackage.ruc;
import defpackage.s1r;
import defpackage.scc;
import defpackage.shs;
import defpackage.sqx;
import defpackage.ssz;
import defpackage.t1w;
import defpackage.t7j;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uab1;
import defpackage.uh6;
import defpackage.vt4;
import defpackage.xbi0;
import defpackage.xby;
import defpackage.xen;
import defpackage.zhs;
import defpackage.zpf0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.banners.BannerAnimationHeightController$LayoutChangeListener;
import ru.yandex.taxi.banners.BannerType;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.communications.ui.LabelInfoModalView;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\n4BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010!J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u0018J\r\u0010)\u001a\u00020\u0016¢\u0006\u0004\b)\u0010\u0018J1\u00101\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010/H\u0082@¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u0002042\b\u00107\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0004\b8\u00109J\u001e\u0010:\u001a\u0002042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0082@¢\u0006\u0004\b:\u0010;J+\u0010A\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010@\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\bG\u0010HJ\u001e\u0010I\u001a\u0002042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0082@¢\u0006\u0004\bI\u0010;J\u001e\u0010J\u001a\u0002042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0082@¢\u0006\u0004\bJ\u0010;J\u001e\u0010K\u001a\u0002042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0082@¢\u0006\u0004\bK\u0010;J!\u0010O\u001a\u00020\u00162\u0006\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0016H\u0002¢\u0006\u0004\bQ\u0010\u0018J\u001f\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020R2\u0006\u0010=\u001a\u00020\u001eH\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010W\u001a\u00020R2\u0006\u0010V\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001eH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0016H\u0002¢\u0006\u0004\bY\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ZR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010^R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010_R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010rR\u0014\u0010t\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u0014\u0010z\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010uR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010}R\u0014\u0010\u007f\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010xR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R5\u0010\u0091\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006\u009f\u0001"}, d2 = {"Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerPage;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lpdc;", "colorConverter", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "Lgis;", "listener", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Lltc;", "communicationsErrorsInteractor", "Lptc;", "communicationsFontPropertiesProvider", "Lir4;", "assetsStorage", "<init>", "(Landroid/content/Context;Lpdc;Ltse;Lpav;Lgis;Lru/yandex/taxi/widget/c;Lltc;Lptc;Lir4;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lshs$a;", Constants.KEY_PAGE, "setData", "(Lshs$a;)V", "", "visible", "setBackgroundVisible", "(Z)V", "Landroid/graphics/Bitmap;", "bitmap", "setVideoFrame", "(Landroid/graphics/Bitmap;)V", "resumed", "setPlaybackResumed", "destroy", "horizontalScrollFinished", "", "Lru/yandex/taxi/promotions/model/PromotionBackground;", "backgrounds", "", "foregroundImageUrl", "Lgr4;", "animation", "setupMedia", "(Ljava/util/List;Ljava/lang/String;Lgr4;)V", "bannerAnimation", "Lkis;", "setupAnimation", "(Lgr4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "setupForegroundImage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupBackground", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/yandex/taxi/communications/api/dto/TypedContentWidget;", "title", "Lntc;", "properties", "isSubtitleEmpty", "setupTitle", "(Lru/yandex/taxi/communications/api/dto/TypedContentWidget;Lntc;Z)V", "subtitle", "Lmtc;", "setupSubtitle", "(Lru/yandex/taxi/communications/api/dto/TypedContentWidget;Lmtc;)V", "setColorBackground", "(Ljava/util/List;)V", "tryToSetVideoBackground", "tryToSetImageBackground", "tryToSetupAnimation", "Landroid/widget/ImageView;", "imageView", "promotionBackground", "updateAccessibility", "(Landroid/widget/ImageView;Lru/yandex/taxi/promotions/model/PromotionBackground;)V", "cancelTextsLoadJobs", "", "text", "updateText", "(Ljava/lang/CharSequence;Z)V", "content", "processTypedContent", "(Lru/yandex/taxi/communications/api/dto/TypedContentWidget;Z)Ljava/lang/CharSequence;", "removeLoadingAnimation", "Ltse;", "Lpav;", "Lgis;", "Lru/yandex/taxi/widget/c;", "Lltc;", "Lptc;", "Lir4;", "Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerPageContainer;", "contentContainer", "Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerPageContainer;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "scrollView", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Lru/yandex/taxi/design/BadgeView;", "label", "Lru/yandex/taxi/design/BadgeView;", "Lru/yandex/taxi/design/ListItemComponent;", "titleView", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "subtitleView", "Lru/yandex/taxi/design/ListTextComponent;", "Landroid/view/ViewGroup;", "bottomContainerInScroll", "Landroid/view/ViewGroup;", "bottomContainer", "bannerImageView", "Landroid/widget/ImageView;", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "loadingAnimationView", "bannerBackgroundImageView", "Lru/yandex/taxi/widget/scroll/ShadowScrollIndicator;", "topShadow", "Lru/yandex/taxi/widget/scroll/ShadowScrollIndicator;", "bottomShadow", "backgroundAnimationView", "Ll8x;", "mediaLoadingJob", "Ll8x;", "Larx;", "labelUtils", "Larx;", "", "textsLoadJobs", "Ljava/util/List;", "", "<set-?>", "defaultBackgroundColor$delegate", "Lxbi0;", "getDefaultBackgroundColor", "()I", "setDefaultBackgroundColor", "(I)V", "defaultBackgroundColor", "isAnimationFullyVisible", "Z", "isPlaybackResumed", "backgroundHiddenByPlayer", "Llls;", "fullyVisibleViewChecker", "Llls;", "Lru/yandex/taxi/banners/a;", "bannerAnimationHeightController", "Lru/yandex/taxi/banners/a;", "Lg18;", "insetsCancellable", "Lg18;", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenBannerPage extends FrameLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("defaultBackgroundColor", 0, "getDefaultBackgroundColor()I", FullScreenBannerPage.class)};
    private final LottieAnimationView animationView;
    private final ir4 assetsStorage;
    private final LottieAnimationView backgroundAnimationView;
    private boolean backgroundHiddenByPlayer;
    private final ru.yandex.taxi.banners.a bannerAnimationHeightController;
    private final ImageView bannerBackgroundImageView;
    private final ImageView bannerImageView;
    private final ViewGroup bottomContainer;
    private final ViewGroup bottomContainerInScroll;
    private final ShadowScrollIndicator bottomShadow;
    private final ltc communicationsErrorsInteractor;
    private final ptc communicationsFontPropertiesProvider;
    private final FullScreenBannerPageContainer contentContainer;
    private final tse coroutineScope;

    /* renamed from: defaultBackgroundColor$delegate, reason: from kotlin metadata */
    private final xbi0 defaultBackgroundColor;
    private final c formattedTextConverter;
    private final lls fullyVisibleViewChecker;
    private final pav imageLoader;
    private g18 insetsCancellable;
    private boolean isAnimationFullyVisible;
    private boolean isPlaybackResumed;
    private final BadgeView label;
    private final arx labelUtils;
    private final gis listener;
    private final LottieAnimationView loadingAnimationView;
    private l8x mediaLoadingJob;
    private final NestedScrollViewAdvanced scrollView;
    private final ListTextComponent subtitleView;
    private final List<l8x> textsLoadJobs;
    private final ListItemComponent titleView;
    private final ShadowScrollIndicator topShadow;

    public FullScreenBannerPage(Context context, pdc pdcVar, tse tseVar, pav pavVar, gis gisVar, c cVar, ltc ltcVar, ptc ptcVar, ir4 ir4Var) {
        super(context);
        this.coroutineScope = tseVar;
        this.imageLoader = pavVar;
        this.listener = gisVar;
        this.formattedTextConverter = cVar;
        this.communicationsErrorsInteractor = ltcVar;
        this.communicationsFontPropertiesProvider = ptcVar;
        this.assetsStorage = ir4Var;
        ru.yandex.taxi.design.utils.c.q(this, mph0.fullscreen_banner_page, true);
        int i = idh0.banner_content_container;
        WeakHashMap weakHashMap = b.a;
        FullScreenBannerPageContainer fullScreenBannerPageContainer = (FullScreenBannerPageContainer) ((View) rp31.d(this, i));
        this.contentContainer = fullScreenBannerPageContainer;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) ((View) rp31.d(this, idh0.banner_scroll_view));
        this.scrollView = nestedScrollViewAdvanced;
        this.label = (BadgeView) ((View) rp31.d(this, idh0.banner_label));
        this.titleView = (ListItemComponent) ((View) rp31.d(this, idh0.banner_title));
        this.subtitleView = (ListTextComponent) ((View) rp31.d(this, idh0.banner_text));
        this.bottomContainerInScroll = (ViewGroup) ((View) rp31.d(this, idh0.banner_bottom_container_in_scroll));
        this.bottomContainer = (ViewGroup) ((View) rp31.d(this, idh0.banner_bottom_container));
        this.bannerImageView = (ImageView) ((View) rp31.d(this, idh0.banner_image));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) rp31.d(this, idh0.banner_animation_view));
        this.animationView = lottieAnimationView;
        this.loadingAnimationView = (LottieAnimationView) ((View) rp31.d(this, idh0.banner_preload_animation));
        this.bannerBackgroundImageView = (ImageView) ((View) rp31.d(this, idh0.banner_background_image));
        this.topShadow = (ShadowScrollIndicator) ((View) rp31.d(this, idh0.banner_top_scroll_indicator_shadow));
        this.bottomShadow = (ShadowScrollIndicator) ((View) rp31.d(this, idh0.banner_bottom_scroll_indicator_shadow));
        this.backgroundAnimationView = (LottieAnimationView) ((View) rp31.d(this, idh0.banner_background_animation_view));
        this.labelUtils = new arx(pdcVar);
        this.textsLoadJobs = new ArrayList();
        this.defaultBackgroundColor = new qf60();
        this.fullyVisibleViewChecker = nestedScrollViewAdvanced.createFullyVisibleViewChecker(lottieAnimationView, new ejp(13, this));
        this.bannerAnimationHeightController = new ru.yandex.taxi.banners.a(lottieAnimationView, nestedScrollViewAdvanced);
        fullScreenBannerPageContainer.setListener(new jln(23, this));
    }

    private final void cancelTextsLoadJobs() {
        Iterator<T> it = this.textsLoadJobs.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        this.textsLoadJobs.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fullyVisibleViewChecker$lambda$0(FullScreenBannerPage fullScreenBannerPage) {
        fullScreenBannerPage.isAnimationFullyVisible = true;
        if (fullScreenBannerPage.isPlaybackResumed) {
            fullScreenBannerPage.animationView.playAnimation();
        }
    }

    private final int getDefaultBackgroundColor() {
        return ((Number) this.defaultBackgroundColor.getValue(this, $$delegatedProperties[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0(FullScreenBannerPage fullScreenBannerPage, t1w t1wVar) {
        fullScreenBannerPage.contentContainer.setPadding(0, t1wVar.b, 0, t1wVar.g);
        return false;
    }

    private final CharSequence processTypedContent(TypedContentWidget content, boolean title) {
        FormattedText formattedText = content.d;
        if (formattedText.a.isEmpty()) {
            return qeb1.c(content.a);
        }
        if (formattedText.e()) {
            return c.f(this.formattedTextConverter, formattedText, false, null, 14);
        }
        this.textsLoadJobs.add(tje.N(this.coroutineScope, null, null, new FullScreenBannerPage$processTypedContent$job$1(this, formattedText, title, content, null), 3));
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLoadingAnimation() {
        LottieAnimationView lottieAnimationView = this.loadingAnimationView;
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setColorBackground(List<PromotionBackground> backgrounds) {
        d dVar = PromotionBackground.Companion;
        PromotionBackground.Type type = PromotionBackground.Type.COLOR;
        dVar.getClass();
        PromotionBackground c = d.c(backgrounds, type);
        String str = c != null ? c.b : null;
        int defaultBackgroundColor = getDefaultBackgroundColor();
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    defaultBackgroundColor = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                defaultBackgroundColor = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        this.bannerBackgroundImageView.setBackgroundColor(defaultBackgroundColor);
        updateAccessibility(this.bannerBackgroundImageView, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$0(FullScreenBannerPage fullScreenBannerPage, List list) {
        a aVar = ((zhs) fullScreenBannerPage.listener).a.presenter;
        ViewGroup overlappingModalViewContainer = ((eis) aVar.a).getOverlappingModalViewContainer();
        if (overlappingModalViewContainer == null || list.isEmpty()) {
            return;
        }
        sqx sqxVar = aVar.w;
        ou4 ou4Var = new ou4(overlappingModalViewContainer, aVar, 4);
        sqxVar.getClass();
        LabelInfoModalView labelInfoModalView = new LabelInfoModalView(sqxVar.a, list);
        labelInfoModalView.setOnAppearingListener(ou4Var);
        labelInfoModalView.show(overlappingModalViewContainer, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$2$0(FullScreenBannerPage fullScreenBannerPage, BannerWidgets.f fVar) {
        a aVar = ((zhs) fullScreenBannerPage.listener).a.presenter;
        zpf0 zpf0Var = aVar.i;
        shs shsVar = aVar.f;
        int i = aVar.z + 1;
        cay0 cay0Var = (cay0) aVar.u;
        zpf0Var.b(shsVar, i, null, cay0Var.b());
        ((n9y0) aVar.h).c(aVar.f, cay0Var.b(), null, fVar.a, fVar.b, null, aVar.z, aVar.f.l.size(), aVar.h(), aVar.g());
        ruc rucVar = aVar.l;
        ru.yandex.taxi.communications.a aVar2 = aVar.m;
        BannerType bannerType = BannerType.FULLSCREEN;
        String str = fVar.a;
        String str2 = fVar.c;
        if (str != null && !evu0.J(str)) {
            if ("webview".equals(str2)) {
                ((n) rucVar).b(str, false);
            } else {
                aVar2.a(str, bannerType, null);
            }
        }
        aVar.p.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void setData$lambda$3(FullScreenBannerPage fullScreenBannerPage, BannerWidgets.b bVar) {
        BannerWidgets.c cVar;
        BannerWidgets.ActionType actionType;
        a aVar = ((zhs) fullScreenBannerPage.listener).a.presenter;
        gep0 gep0Var = aVar.u;
        Activity activity = aVar.e;
        BannerWidgets.OnCloseEffect onCloseEffect = bVar.k;
        BannerWidgets.a aVar2 = bVar.g;
        if (onCloseEffect != null) {
            aVar.x = onCloseEffect;
        }
        cay0 cay0Var = (cay0) gep0Var;
        aVar.i.b(aVar.f, aVar.z + 1, bVar.j, cay0Var.b());
        ((n9y0) aVar.h).c(aVar.f, cay0Var.b(), (aVar2 == null || (actionType = aVar2.a) == null) ? null : actionType.getAnalyticsName(), bVar.a, bVar.c, null, aVar.z, aVar.f.l.size(), aVar.h(), aVar.g());
        aVar.s.a(bVar.b);
        BannerWidgets.ActionType actionType2 = aVar2 != null ? aVar2.a : null;
        int i = 12;
        boolean z = false;
        if ((actionType2 == null ? -1 : ois.a[actionType2.ordinal()]) == 1) {
            if (!bVar.i || aVar2 == null || (cVar = aVar2.b) == null) {
                return;
            }
            qke.E(activity, HapticController$Effect.BZZ, false, 12);
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService(ClipboardManager.class);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("PROMOCODE", cVar.c));
            }
            BannerWidgets.b a = BannerWidgets.b.a(bVar, cVar.g, null, false, false, 3835);
            shs shsVar = aVar.f;
            List<shs.a> list = shsVar.l;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (shs.a aVar3 : list) {
                if (aVar3.e.c.contains(bVar)) {
                    BannerWidgets bannerWidgets = aVar3.e;
                    List<BannerWidgets.b> list2 = bannerWidgets.c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (BannerWidgets.b bVar2 : list2) {
                        if (jl40.l(bVar2, bVar)) {
                            bVar2 = a;
                        }
                        arrayList2.add(bVar2);
                    }
                    aVar3 = new shs.a(aVar3.a, aVar3.b, aVar3.c, aVar3.d, new BannerWidgets(bannerWidgets.a, bannerWidgets.b, arrayList2, bannerWidgets.d, bannerWidgets.e, bannerWidgets.f, bannerWidgets.g, bannerWidgets.h), aVar3.f, aVar3.g, aVar3.h);
                }
                arrayList.add(aVar3);
            }
            shs shsVar2 = new shs(shsVar.b, shsVar.c, shsVar.d, shsVar.e, shsVar.f, shsVar.g, shsVar.h, shsVar.i, shsVar.j, shsVar.k, arrayList, shsVar.m);
            aVar.f = shsVar2;
            ((eis) aVar.a).updateData(shsVar2);
            return;
        }
        ruc rucVar = aVar.l;
        ru.yandex.taxi.communications.a aVar4 = aVar.m;
        ltc ltcVar = aVar.r;
        BannerType bannerType = BannerType.FULLSCREEN;
        BannerWidgets.OnCloseEffect onCloseEffect2 = bVar.k;
        bdp bdpVar = onCloseEffect2 == null ? null : new bdp(i, aVar, onCloseEffect2);
        if (aVar2 != null) {
            BannerWidgets.ActionType actionType3 = aVar2.a;
            BannerWidgets.c cVar2 = aVar2.b;
            if (actionType3 != null && cVar2 != null) {
                String str = cVar2.a;
                int i2 = gt4.a[actionType3.ordinal()];
                if (i2 == 1) {
                    z = aVar4.a(str, bannerType, bdpVar);
                } else if (i2 != 2) {
                    ((iux0) ltcVar).d(actionType3);
                } else if (str != null && !evu0.J(str)) {
                    ((n) rucVar).b(str, cVar2.b);
                }
                for (vt4 vt4Var : bVar.h) {
                    if (vt4Var instanceof ot4) {
                        ClipData newPlainText = ClipData.newPlainText("PROMOCODE", ((ot4) vt4Var).a);
                        ClipboardManager clipboardManager2 = (ClipboardManager) activity.getSystemService(ClipboardManager.class);
                        if (clipboardManager2 != null) {
                            clipboardManager2.setPrimaryClip(newPlainText);
                        }
                    }
                }
                if (z) {
                    aVar.x = null;
                }
                aVar.q.c();
                aVar.f();
            }
        }
        String str2 = bVar.a;
        String str3 = bVar.d;
        if (str2 != null && !evu0.J(str2)) {
            if ("webview".equals(str3)) {
                ((n) rucVar).b(str2, false);
            } else {
                z = aVar4.a(str2, bannerType, bdpVar);
            }
        }
        while (r0.hasNext()) {
        }
        if (z) {
        }
        aVar.q.c();
        aVar.f();
    }

    private final void setDefaultBackgroundColor(int i) {
        this.defaultBackgroundColor.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupAnimation(gr4 gr4Var, Continuation<? super kis> continuation) {
        FullScreenBannerPage$setupAnimation$1 fullScreenBannerPage$setupAnimation$1;
        int i;
        try {
            if (continuation instanceof FullScreenBannerPage$setupAnimation$1) {
                fullScreenBannerPage$setupAnimation$1 = (FullScreenBannerPage$setupAnimation$1) continuation;
                int i2 = fullScreenBannerPage$setupAnimation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fullScreenBannerPage$setupAnimation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fullScreenBannerPage$setupAnimation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fullScreenBannerPage$setupAnimation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        LottieAnimationView lottieAnimationView = this.animationView;
                        lottieAnimationView.setVisibility(8);
                        lottieAnimationView.cancelAnimation();
                        if (gr4Var == null) {
                            return iis.a;
                        }
                        Context context = getContext();
                        String str = gr4Var.a;
                        nuz i3 = ssz.i(context, str, str);
                        fullScreenBannerPage$setupAnimation$1.L$0 = gr4Var;
                        fullScreenBannerPage$setupAnimation$1.label = 1;
                        obj = chb1.c(i3, fullScreenBannerPage$setupAnimation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gr4Var = (gr4) fullScreenBannerPage$setupAnimation$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return new jis(new t7j(11, this, (nsz) obj, gr4Var));
                }
            }
            if (i != 0) {
            }
            return new jis(new t7j(11, this, (nsz) obj, gr4Var));
        } catch (Throwable th) {
            ((iux0) this.communicationsErrorsInteractor).c("Error loading animation", th, "Error loading animation", "WTF");
            return his.a;
        }
        fullScreenBannerPage$setupAnimation$1 = new FullScreenBannerPage$setupAnimation$1(this, continuation);
        Object obj2 = fullScreenBannerPage$setupAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenBannerPage$setupAnimation$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupAnimation$lambda$1(FullScreenBannerPage fullScreenBannerPage, nsz nszVar, gr4 gr4Var) {
        LottieAnimationView lottieAnimationView = fullScreenBannerPage.animationView;
        lottieAnimationView.setComposition(nszVar);
        lottieAnimationView.setRepeatCount(gr4Var.b ? -1 : 0);
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.playAnimation();
        fullScreenBannerPage.fullyVisibleViewChecker.c();
        fullScreenBannerPage.fullyVisibleViewChecker.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        if (defpackage.jl40.l(r11, r3) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ad -> B:20:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupBackground(List<PromotionBackground> list, Continuation<? super kis> continuation) {
        FullScreenBannerPage$setupBackground$1 fullScreenBannerPage$setupBackground$1;
        int i;
        Iterator it;
        Object obj;
        if (continuation instanceof FullScreenBannerPage$setupBackground$1) {
            fullScreenBannerPage$setupBackground$1 = (FullScreenBannerPage$setupBackground$1) continuation;
            int i2 = fullScreenBannerPage$setupBackground$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullScreenBannerPage$setupBackground$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = fullScreenBannerPage$setupBackground$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullScreenBannerPage$setupBackground$1.label;
                iis iisVar = iis.a;
                kis kisVar = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.bannerBackgroundImageView.setImageDrawable(null);
                    this.bannerBackgroundImageView.setVisibility(0);
                    this.backgroundAnimationView.setVisibility(8);
                    it = scc.g(new h(new FullScreenBannerPage$setupBackground$backgroundResult$1(this, list, null)), new h(new FullScreenBannerPage$setupBackground$backgroundResult$2(this, list, null)), new h(new FullScreenBannerPage$setupBackground$backgroundResult$3(this, list, null))).iterator();
                    if (it.hasNext()) {
                        obj = it.next();
                        fullScreenBannerPage$setupBackground$1.L$0 = null;
                        fullScreenBannerPage$setupBackground$1.L$1 = null;
                        fullScreenBannerPage$setupBackground$1.L$2 = it;
                        fullScreenBannerPage$setupBackground$1.L$3 = obj;
                        fullScreenBannerPage$setupBackground$1.L$4 = null;
                        fullScreenBannerPage$setupBackground$1.label = 1;
                        obj2 = ((h) obj).a(fullScreenBannerPage$setupBackground$1);
                    } else {
                        obj = null;
                        h hVar = (h) obj;
                        if (hVar != null) {
                            fullScreenBannerPage$setupBackground$1.L$0 = null;
                            fullScreenBannerPage$setupBackground$1.L$1 = null;
                            fullScreenBannerPage$setupBackground$1.L$2 = null;
                            fullScreenBannerPage$setupBackground$1.L$3 = null;
                            fullScreenBannerPage$setupBackground$1.L$4 = null;
                            fullScreenBannerPage$setupBackground$1.label = 2;
                            obj2 = hVar.a(fullScreenBannerPage$setupBackground$1);
                        }
                        boolean l = jl40.l(kisVar, his.a);
                        this.topShadow.setEnabled(l);
                        this.bottomShadow.setEnabled(l);
                        if (kisVar != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        kisVar = (kis) obj2;
                        boolean l2 = jl40.l(kisVar, his.a);
                        this.topShadow.setEnabled(l2);
                        this.bottomShadow.setEnabled(l2);
                        return kisVar != null ? iisVar : kisVar;
                    }
                    obj = fullScreenBannerPage$setupBackground$1.L$3;
                    it = (Iterator) fullScreenBannerPage$setupBackground$1.L$2;
                    kotlin.b.b(obj2);
                }
            }
        }
        fullScreenBannerPage$setupBackground$1 = new FullScreenBannerPage$setupBackground$1(this, continuation);
        Object obj22 = fullScreenBannerPage$setupBackground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenBannerPage$setupBackground$1.label;
        iis iisVar2 = iis.a;
        kis kisVar2 = null;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupForegroundImage(String str, Continuation<? super kis> continuation) {
        FullScreenBannerPage$setupForegroundImage$1 fullScreenBannerPage$setupForegroundImage$1;
        int i;
        if (continuation instanceof FullScreenBannerPage$setupForegroundImage$1) {
            fullScreenBannerPage$setupForegroundImage$1 = (FullScreenBannerPage$setupForegroundImage$1) continuation;
            int i2 = fullScreenBannerPage$setupForegroundImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullScreenBannerPage$setupForegroundImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullScreenBannerPage$setupForegroundImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullScreenBannerPage$setupForegroundImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.bannerImageView.setImageDrawable(null);
                    if (str == null) {
                        return iis.a;
                    }
                    g16 b = this.imageLoader.b().b(str);
                    fullScreenBannerPage$setupForegroundImage$1.L$0 = null;
                    fullScreenBannerPage$setupForegroundImage$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(b, fullScreenBannerPage$setupForegroundImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                return bitmap != null ? his.a : new jis(new fis(this, bitmap, 0));
            }
        }
        fullScreenBannerPage$setupForegroundImage$1 = new FullScreenBannerPage$setupForegroundImage$1(this, continuation);
        Object obj2 = fullScreenBannerPage$setupForegroundImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenBannerPage$setupForegroundImage$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        if (bitmap2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupForegroundImage$lambda$0(FullScreenBannerPage fullScreenBannerPage, Bitmap bitmap) {
        ImageView imageView = fullScreenBannerPage.bannerImageView;
        imageView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
        return zy11.a;
    }

    private final void setupMedia(List<PromotionBackground> backgrounds, String foregroundImageUrl, gr4 animation) {
        this.bannerBackgroundImageView.setBackgroundColor(getDefaultBackgroundColor());
        LottieAnimationView lottieAnimationView = this.loadingAnimationView;
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setAnimation(qwh0.placeholder_banner_animation);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.playAnimation();
        this.mediaLoadingJob = tje.N(this.coroutineScope, null, null, new FullScreenBannerPage$setupMedia$2(this, backgrounds, foregroundImageUrl, animation, null), 3);
    }

    private final void setupSubtitle(TypedContentWidget subtitle, mtc properties) {
        if (subtitle == null || (subtitle.d.a.isEmpty() && evu0.J(subtitle.a))) {
            this.subtitleView.setVisibility(8);
            return;
        }
        if (properties != null) {
            this.subtitleView.setTextAlignment(1);
        }
        this.subtitleView.setHtmlText(processTypedContent(subtitle, false));
        Context context = getContext();
        String str = subtitle.b;
        int color = context.getColor(mqg0.component_black);
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    color = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                color = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        this.subtitleView.setTextColor(color);
        this.subtitleView.setLinkTextColor(color);
        this.subtitleView.setVisibility(0);
    }

    private final void setupTitle(TypedContentWidget title, ntc properties, boolean isSubtitleEmpty) {
        if (title == null || (title.d.a.isEmpty() && evu0.J(title.a))) {
            this.titleView.setVisibility(8);
            return;
        }
        CharSequence processTypedContent = processTypedContent(title, true);
        if (properties != null) {
            uab1.c(this.titleView, properties, processTypedContent, isSubtitleEmpty);
        }
        this.titleView.setTitle(processTypedContent);
        Context context = getContext();
        String str = title.b;
        int color = context.getColor(mqg0.component_black);
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    color = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                color = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        this.titleView.setTitleTextColor(color);
        this.titleView.setTitleLinkTextColor(color);
        this.titleView.setVisibility(0);
        this.titleView.setTitleMovementMethod(qeb1.d(processTypedContent) ? LinkMovementMethod.getInstance() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToSetImageBackground(List<PromotionBackground> list, Continuation<? super kis> continuation) {
        FullScreenBannerPage$tryToSetImageBackground$1 fullScreenBannerPage$tryToSetImageBackground$1;
        int i;
        PromotionBackground c;
        if (continuation instanceof FullScreenBannerPage$tryToSetImageBackground$1) {
            fullScreenBannerPage$tryToSetImageBackground$1 = (FullScreenBannerPage$tryToSetImageBackground$1) continuation;
            int i2 = fullScreenBannerPage$tryToSetImageBackground$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullScreenBannerPage$tryToSetImageBackground$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullScreenBannerPage$tryToSetImageBackground$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullScreenBannerPage$tryToSetImageBackground$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = PromotionBackground.Companion;
                    PromotionBackground.Type type = PromotionBackground.Type.IMAGE;
                    dVar.getClass();
                    c = d.c(list, type);
                    if (c == null) {
                        return iis.a;
                    }
                    g16 b = this.imageLoader.b().b(c.b);
                    fullScreenBannerPage$tryToSetImageBackground$1.L$0 = null;
                    fullScreenBannerPage$tryToSetImageBackground$1.L$1 = c;
                    fullScreenBannerPage$tryToSetImageBackground$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(b, fullScreenBannerPage$tryToSetImageBackground$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c = (PromotionBackground) fullScreenBannerPage$tryToSetImageBackground$1.L$1;
                    kotlin.b.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                return bitmap != null ? his.a : new jis(new t7j(12, this, c, bitmap));
            }
        }
        fullScreenBannerPage$tryToSetImageBackground$1 = new FullScreenBannerPage$tryToSetImageBackground$1(this, continuation);
        Object obj2 = fullScreenBannerPage$tryToSetImageBackground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenBannerPage$tryToSetImageBackground$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        if (bitmap2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 tryToSetImageBackground$lambda$0(FullScreenBannerPage fullScreenBannerPage, PromotionBackground promotionBackground, Bitmap bitmap) {
        ImageView imageView = fullScreenBannerPage.bannerBackgroundImageView;
        imageView.setVisibility(0);
        fullScreenBannerPage.updateAccessibility(imageView, promotionBackground);
        imageView.setImageBitmap(bitmap);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToSetVideoBackground(List<PromotionBackground> list, Continuation<? super kis> continuation) {
        FullScreenBannerPage$tryToSetVideoBackground$1 fullScreenBannerPage$tryToSetVideoBackground$1;
        int i;
        String a;
        Bitmap bitmap;
        if (continuation instanceof FullScreenBannerPage$tryToSetVideoBackground$1) {
            fullScreenBannerPage$tryToSetVideoBackground$1 = (FullScreenBannerPage$tryToSetVideoBackground$1) continuation;
            int i2 = fullScreenBannerPage$tryToSetVideoBackground$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullScreenBannerPage$tryToSetVideoBackground$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullScreenBannerPage$tryToSetVideoBackground$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullScreenBannerPage$tryToSetVideoBackground$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PromotionBackground b = hr4.b(list, this.assetsStorage, PromotionBackground.Type.VIDEO);
                    if (b == null) {
                        return iis.a;
                    }
                    String a2 = b.a();
                    if (a2 != null && (a = this.assetsStorage.a(a2)) != null) {
                        g16 i4 = this.imageLoader.b().i(new gbv(Uri.fromFile(new File(a))));
                        fullScreenBannerPage$tryToSetVideoBackground$1.L$0 = null;
                        fullScreenBannerPage$tryToSetVideoBackground$1.L$1 = null;
                        fullScreenBannerPage$tryToSetVideoBackground$1.L$2 = null;
                        fullScreenBannerPage$tryToSetVideoBackground$1.label = 1;
                        obj = ru.yandex.taxi.utils.a.b(i4, fullScreenBannerPage$tryToSetVideoBackground$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return his.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new jis(new fis(this, bitmap, i3));
                }
                return his.a;
            }
        }
        fullScreenBannerPage$tryToSetVideoBackground$1 = new FullScreenBannerPage$tryToSetVideoBackground$1(this, continuation);
        Object obj2 = fullScreenBannerPage$tryToSetVideoBackground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenBannerPage$tryToSetVideoBackground$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return his.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 tryToSetVideoBackground$lambda$1(FullScreenBannerPage fullScreenBannerPage, Bitmap bitmap) {
        ImageView imageView = fullScreenBannerPage.bannerBackgroundImageView;
        imageView.setImageBitmap(bitmap);
        if (!fullScreenBannerPage.backgroundHiddenByPlayer) {
            imageView.setVisibility(0);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToSetupAnimation(List<PromotionBackground> list, Continuation<? super kis> continuation) {
        FullScreenBannerPage$tryToSetupAnimation$1 fullScreenBannerPage$tryToSetupAnimation$1;
        int i;
        PromotionBackground c;
        try {
            if (continuation instanceof FullScreenBannerPage$tryToSetupAnimation$1) {
                fullScreenBannerPage$tryToSetupAnimation$1 = (FullScreenBannerPage$tryToSetupAnimation$1) continuation;
                int i2 = fullScreenBannerPage$tryToSetupAnimation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fullScreenBannerPage$tryToSetupAnimation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fullScreenBannerPage$tryToSetupAnimation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fullScreenBannerPage$tryToSetupAnimation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        d dVar = PromotionBackground.Companion;
                        PromotionBackground.Type type = PromotionBackground.Type.ANIMATION;
                        dVar.getClass();
                        c = d.c(list, type);
                        if (c == null) {
                            return iis.a;
                        }
                        LottieAnimationView lottieAnimationView = this.backgroundAnimationView;
                        lottieAnimationView.cancelAnimation();
                        lottieAnimationView.setVisibility(8);
                        Context context = getContext();
                        String str = c.b;
                        nuz i3 = ssz.i(context, str, str);
                        fullScreenBannerPage$tryToSetupAnimation$1.L$0 = null;
                        fullScreenBannerPage$tryToSetupAnimation$1.L$1 = c;
                        fullScreenBannerPage$tryToSetupAnimation$1.label = 1;
                        obj = chb1.c(i3, fullScreenBannerPage$tryToSetupAnimation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c = (PromotionBackground) fullScreenBannerPage$tryToSetupAnimation$1.L$1;
                        kotlin.b.b(obj);
                    }
                    return new jis(new t7j(13, this, (nsz) obj, c));
                }
            }
            if (i != 0) {
            }
            return new jis(new t7j(13, this, (nsz) obj, c));
        } catch (Throwable th) {
            ((iux0) this.communicationsErrorsInteractor).c("Error loading animation", th, "Error loading animation", "WTF");
            return his.a;
        }
        fullScreenBannerPage$tryToSetupAnimation$1 = new FullScreenBannerPage$tryToSetupAnimation$1(this, continuation);
        Object obj2 = fullScreenBannerPage$tryToSetupAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullScreenBannerPage$tryToSetupAnimation$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 tryToSetupAnimation$lambda$1(FullScreenBannerPage fullScreenBannerPage, nsz nszVar, PromotionBackground promotionBackground) {
        LottieAnimationView lottieAnimationView = fullScreenBannerPage.backgroundAnimationView;
        chb1.f(lottieAnimationView, nszVar, null);
        lottieAnimationView.setRepeatCount(promotionBackground.d ? -1 : 0);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(0.0f);
        fullScreenBannerPage.updateAccessibility(fullScreenBannerPage.backgroundAnimationView, promotionBackground);
        lottieAnimationView.playAnimation();
        return zy11.a;
    }

    private final void updateAccessibility(ImageView imageView, PromotionBackground promotionBackground) {
        String str = promotionBackground != null ? promotionBackground.c : null;
        if (str == null || evu0.J(str)) {
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setImportantForAccessibility(1);
        }
        imageView.setContentDescription(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateText(CharSequence text, boolean title) {
        if (title) {
            this.titleView.setTitle(text);
        } else {
            this.subtitleView.setText(text);
        }
    }

    public final void destroy() {
        this.fullyVisibleViewChecker.c();
        cancelTextsLoadJobs();
    }

    public final void horizontalScrollFinished() {
        this.fullyVisibleViewChecker.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ru.yandex.taxi.banners.a aVar = this.bannerAnimationHeightController;
        View view = aVar.a;
        BannerAnimationHeightController$LayoutChangeListener bannerAnimationHeightController$LayoutChangeListener = aVar.c;
        view.addOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        aVar.b.addOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        this.insetsCancellable = tje.i(this, 119, new s1r(16, this));
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ru.yandex.taxi.banners.a aVar = this.bannerAnimationHeightController;
        View view = aVar.a;
        BannerAnimationHeightController$LayoutChangeListener bannerAnimationHeightController$LayoutChangeListener = aVar.c;
        view.removeOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        aVar.b.removeOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        g18 g18Var = this.insetsCancellable;
        if (g18Var != null) {
            g18Var.cancel();
            this.insetsCancellable = null;
        }
        l8x l8xVar = this.mediaLoadingJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }

    public final void setBackgroundVisible(boolean visible) {
        this.backgroundHiddenByPlayer = !visible;
        this.bannerBackgroundImageView.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.ViewGroup] */
    public final void setData(shs.a page) {
        cancelTextsLoadJobs();
        l8x l8xVar = this.mediaLoadingJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.isPlaybackResumed = false;
        this.isAnimationFullyVisible = false;
        this.backgroundHiddenByPlayer = false;
        BannerWidgets bannerWidgets = page.e;
        this.labelUtils.a(this.label, bannerWidgets.d, new xen(14, this));
        this.scrollView.scrollTo(0, 0);
        TypedContentWidget typedContentWidget = page.a;
        TypedContentWidget typedContentWidget2 = page.b;
        erc ercVar = ((drc) this.communicationsFontPropertiesProvider).a;
        otc b = erc.a(ercVar) ? ercVar.c.b(ercVar.a) : null;
        setupTitle(typedContentWidget, b != null ? b.a : null, typedContentWidget2 == null || typedContentWidget2.a.length() == 0);
        setupSubtitle(typedContentWidget2, b != null ? b.b : null);
        setDefaultBackgroundColor(getContext().getColor(q5z.e(q5z.R(getContext(), mqg0.component_black, typedContentWidget != null ? typedContentWidget.b : null)) > 0.5f ? kqg0.banner_background_dark : kqg0.banner_background_light));
        setupMedia(page.f, page.c, page.d);
        this.bottomContainer.removeAllViews();
        owd0 owd0Var = page.g;
        if (owd0Var != null) {
            ViewGroup viewGroup = this.bottomContainer;
            int b2 = m810.b(uh6.o(24.0f));
            ListTextComponent listTextComponent = new ListTextComponent(viewGroup.getContext(), null, 0, 6, null);
            listTextComponent.setTextSizePx(viewGroup.getResources().getDimensionPixelOffset(lrg0.legal_font_size));
            ht4.b(listTextComponent, owd0Var.a, owd0Var.b);
            listTextComponent.setTextPaddings(b2, m810.b(tje.x(listTextComponent.getContext(), 12.0f)), b2, m810.b(tje.x(listTextComponent.getContext(), 20.0f)));
            listTextComponent.setBackgroundColor(0);
            viewGroup.addView(listTextComponent);
        }
        BannerWidgets.f fVar = bannerWidgets.e;
        if (fVar != null) {
            ht4.a(fVar, this.bottomContainer, new qpo(15, this, fVar));
        }
        for (BannerWidgets.b bVar : bannerWidgets.c) {
            ViewGroup viewGroup2 = this.bottomContainer;
            qpo qpoVar = new qpo(16, this, bVar);
            ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(viewGroup2.getContext()).inflate(nph0.banner_action_button, viewGroup2, false);
            buttonComponent.setText(bVar.c);
            buttonComponent.setButtonTitleColor(q5z.R(viewGroup2.getContext(), mqg0.accent_background_text_color, bVar.f));
            buttonComponent.setButtonBackground(q5z.R(viewGroup2.getContext(), mqg0.component_accent_color, bVar.e));
            buttonComponent.setDebounceClickListener(qpoVar);
            viewGroup2.addView(buttonComponent);
        }
        int a = bannerWidgets.a();
        ViewGroup viewGroup3 = this.bottomContainer;
        FullScreenBannerPageContainer fullScreenBannerPageContainer = this.contentContainer;
        ?? r10 = this.bottomContainerInScroll;
        ViewGroup viewGroup4 = (ViewGroup) viewGroup3.getParent();
        if (a > 2) {
            fullScreenBannerPageContainer = r10;
        }
        if (viewGroup4.equals(fullScreenBannerPageContainer)) {
            return;
        }
        viewGroup4.removeView(viewGroup3);
        fullScreenBannerPageContainer.addView(viewGroup3);
    }

    public final void setPlaybackResumed(boolean resumed) {
        if (this.isPlaybackResumed == resumed) {
            return;
        }
        this.isPlaybackResumed = resumed;
        LottieAnimationView lottieAnimationView = this.backgroundAnimationView;
        if (!resumed) {
            lottieAnimationView.pauseAnimation();
            this.animationView.pauseAnimation();
        } else {
            chb1.g(lottieAnimationView);
            if (this.isAnimationFullyVisible) {
                chb1.g(this.animationView);
            }
        }
    }

    public final void setVideoFrame(Bitmap bitmap) {
        this.bannerBackgroundImageView.setImageBitmap(bitmap);
    }
}
