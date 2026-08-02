package ru.yandex.taxi.banners;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.arx;
import defpackage.b64;
import defpackage.bdc;
import defpackage.c230;
import defpackage.c90;
import defpackage.cb8;
import defpackage.cdc;
import defpackage.chb1;
import defpackage.ci2;
import defpackage.drc;
import defpackage.dzg0;
import defpackage.e230;
import defpackage.e48;
import defpackage.eja1;
import defpackage.erc;
import defpackage.evu0;
import defpackage.fb8;
import defpackage.gbv;
import defpackage.hb8;
import defpackage.hi2;
import defpackage.hr4;
import defpackage.ht4;
import defpackage.ib8;
import defpackage.idh0;
import defpackage.ir4;
import defpackage.isf0;
import defpackage.jb8;
import defpackage.jl40;
import defpackage.kb8;
import defpackage.lb8;
import defpackage.lc0;
import defpackage.lrg0;
import defpackage.mg;
import defpackage.mph0;
import defpackage.mtc;
import defpackage.mzh0;
import defpackage.nac;
import defpackage.nm7;
import defpackage.nph0;
import defpackage.nsz;
import defpackage.ntc;
import defpackage.otc;
import defpackage.pav;
import defpackage.pdc;
import defpackage.ptc;
import defpackage.pwy0;
import defpackage.qa0;
import defpackage.qbv;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.qwh0;
import defpackage.rp31;
import defpackage.ssz;
import defpackage.t1z;
import defpackage.tbv;
import defpackage.tje;
import defpackage.uz;
import defpackage.v1i0;
import defpackage.w511;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yzo;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.ThemedTextAppearanceSpan;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u0002:\u0002\u008c\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\"\u0010\u0018J\u001f\u0010'\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0016H\u0014¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0016H\u0014¢\u0006\u0004\b*\u0010\u0018J'\u0010/\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u0010\u0018J\u001f\u00106\u001a\u00020\u00162\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010A\u001a\u00020\u0016*\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u0013\u0010C\u001a\u00020\u0016*\u00020@H\u0002¢\u0006\u0004\bC\u0010BJ%\u0010F\u001a\u00020\u00162\f\u0010E\u001a\b\u0012\u0004\u0012\u00020+0D2\u0006\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0016H\u0002¢\u0006\u0004\bH\u0010\u0018J\u001f\u0010L\u001a\u00020\u00162\u0006\u0010I\u001a\u00020+2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020J2\u0006\u0010I\u001a\u00020+H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020J2\u0006\u0010I\u001a\u00020+H\u0002¢\u0006\u0004\bP\u0010OJ!\u0010U\u001a\u00020\u00162\u0006\u0010R\u001a\u00020Q2\b\u0010T\u001a\u0004\u0018\u00010SH\u0002¢\u0006\u0004\bU\u0010VJ!\u0010Y\u001a\u00020\u00162\u0006\u0010W\u001a\u00020Q2\b\u0010T\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bY\u0010ZR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\\R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010]R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010^R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010kR\u0014\u0010m\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010eR\u0014\u0010n\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010eR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010sR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020+0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001f\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00020%8TX\u0094\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008d\u0001"}, d2 = {"Lru/yandex/taxi/banners/CardBannerV2ModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lfb8;", "Landroid/app/Activity;", "context", "Lru/yandex/taxi/banners/d;", "presenter", "Lpav;", "imageLoader", "Lpdc;", "colorConverter", "Lru/yandex/taxi/banners/model/h;", "promotionsProvider", "Lptc;", "communicationsFontPropertiesProvider", "Lir4;", "assetsStorage", "<init>", "(Landroid/app/Activity;Lru/yandex/taxi/banners/d;Lpav;Lpdc;Lru/yandex/taxi/banners/model/h;Lptc;Lir4;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onDetachedFromWindow", "Lcb8;", "banner", "setData", "(Lcb8;)V", "updateCurrentBackground", "", "text", "", "viewId", "updateText", "(Ljava/lang/CharSequence;I)V", "onDismissManually", "onModalViewDisappear", "Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;", "oldActionButton", "newActionButton", "bottomWidgetsCount", "updateButton", "(Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;I)V", "dismiss", "Ltbv;", "model", "", "id", "setImage", "(Ltbv;Ljava/lang/String;)V", "Lci2;", "extraAnimation", "showAnimation", "(Lci2;)V", "Landroid/view/ViewParent;", "parent", "removeClipping", "(Landroid/view/ViewParent;)V", "Lcom/airbnb/lottie/LottieAnimationView;", "hideAndReset", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "showAndPlay", "", "actionButtons", "addButtons", "(Ljava/util/List;I)V", "addCloseButton", "actionButtonInfo", "", "isLast", "addActionButton", "(Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;Z)V", "buttonHasCopyAction", "(Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;)Z", "buttonHasSaveBenefitAction", "Lru/yandex/taxi/communications/api/dto/TypedContentWidget;", "title", "Lntc;", "properties", "setupTitle", "(Lru/yandex/taxi/communications/api/dto/TypedContentWidget;Lntc;)V", "typedText", "Lmtc;", "setupSubtitle", "(Lru/yandex/taxi/communications/api/dto/TypedContentWidget;Lmtc;)V", "Lru/yandex/taxi/banners/d;", "Lpav;", "Lru/yandex/taxi/banners/model/h;", "Lptc;", "Lir4;", "Larx;", "labelUtils", "Larx;", "Landroid/view/ViewGroup;", "contentContainer", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/BadgeView;", "label", "Lru/yandex/taxi/design/BadgeView;", "Landroidx/appcompat/widget/AppCompatTextView;", "titleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "subtitleTextView", "bottomContainerInScroll", "bottomContainer", "Landroid/widget/ImageView;", "bannerImageView", "Landroid/widget/ImageView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "scrollView", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "extraAnimationView", "", "Ljava/util/List;", "Lru/yandex/taxi/banners/a;", "bannerAnimationHeightController", "Lru/yandex/taxi/banners/a;", "Ljava/util/function/Consumer;", "Lisf0;", "promotionsListener", "Ljava/util/function/Consumer;", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "closeView", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "", "getZOrder", "()F", "zOrder", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "Companion", "kb8", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardBannerV2ModalView extends SlideableModalView implements fb8 {
    private static final float DISABLED_BUTTON_ALPHA = 0.5f;
    private static final int MAX_BUTTONS_COUNT = 2;
    private final List<BannerWidgets.b> actionButtons;
    private final LottieAnimationView animationView;
    private final ir4 assetsStorage;
    private final a bannerAnimationHeightController;
    private final ImageView bannerImageView;
    private final ViewGroup bottomContainer;
    private final ViewGroup bottomContainerInScroll;
    private CircleButtonImageView closeView;
    private final ptc communicationsFontPropertiesProvider;
    private final ViewGroup contentContainer;
    private final LottieAnimationView extraAnimationView;
    private final pav imageLoader;
    private final BadgeView label;
    private final arx labelUtils;
    private final d presenter;
    private Consumer<isf0> promotionsListener;
    private final h promotionsProvider;
    private final NestedScrollViewAdvanced scrollView;
    private final AppCompatTextView subtitleTextView;
    private final AppCompatTextView titleTextView;
    public static final kb8 Companion = new kb8();
    private static final int CLOSE_BUTTON_IMAGE_RES = dzg0.ic_cross_close;

    public CardBannerV2ModalView(Activity activity, d dVar, pav pavVar, pdc pdcVar, h hVar, ptc ptcVar, ir4 ir4Var) {
        super(activity);
        this.presenter = dVar;
        this.imageLoader = pavVar;
        this.promotionsProvider = hVar;
        this.communicationsFontPropertiesProvider = ptcVar;
        this.assetsStorage = ir4Var;
        this.labelUtils = new arx(pdcVar);
        int i = idh0.banner_content_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.contentContainer = (ViewGroup) ((View) rp31.d(this, i));
        this.label = (BadgeView) ((View) rp31.d(this, idh0.banner_label));
        this.titleTextView = (AppCompatTextView) ((View) rp31.d(this, idh0.banner_header));
        this.subtitleTextView = (AppCompatTextView) ((View) rp31.d(this, idh0.banner_text));
        this.bottomContainerInScroll = (ViewGroup) ((View) rp31.d(this, idh0.banner_bottom_container_in_scroll));
        this.bottomContainer = (ViewGroup) ((View) rp31.d(this, idh0.banner_bottom_container));
        this.bannerImageView = (ImageView) ((View) rp31.d(this, idh0.banner_image));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) rp31.d(this, idh0.banner_animation_view));
        this.animationView = lottieAnimationView;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) ((View) rp31.d(this, idh0.banner_scroll_view));
        this.scrollView = nestedScrollViewAdvanced;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((View) rp31.d(this, idh0.extra_animation_view));
        lottieAnimationView2.addAnimatorListener(new AnimUtils$AnimationEndListener(new nm7(20, this, lottieAnimationView2)));
        this.extraAnimationView = lottieAnimationView2;
        this.actionButtons = new ArrayList();
        this.bannerAnimationHeightController = new a(lottieAnimationView, nestedScrollViewAdvanced);
        removeClipping(lottieAnimationView2.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.TextView, ru.yandex.taxi.design.ButtonComponent] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.ViewGroup] */
    private final void addActionButton(BannerWidgets.b actionButtonInfo, boolean isLast) {
        ?? r10;
        BannerWidgets.c cVar;
        BannerWidgets.c cVar2;
        ?? r0 = (ButtonComponent) LayoutInflater.from(getContext()).inflate(nph0.banner_action_button, this.bottomContainer, false);
        if (buttonHasCopyAction(actionButtonInfo)) {
            d dVar = this.presenter;
            pwy0 pwy0Var = dVar.s;
            Activity activity = dVar.j;
            BannerWidgets.a aVar = actionButtonInfo.g;
            if (aVar == null || (cVar2 = aVar.b) == null) {
                r10 = 0;
            } else {
                String str = cVar2.i;
                String str2 = cVar2.h;
                if (actionButtonInfo.i) {
                    Pair pair = isLast ? new Pair(Integer.valueOf(v1i0.PromoCodeCopyLastButtonTitleTextAppearance), Integer.valueOf(v1i0.PromoCodeCopyLastButtonSubtitleTextAppearance)) : new Pair(Integer.valueOf(v1i0.PromoCodeCopyButtonTitleTextAppearance), Integer.valueOf(v1i0.PromoCodeCopyButtonSubtitleTextAppearance));
                    int intValue = ((Number) pair.getFirst()).intValue();
                    int intValue2 = ((Number) pair.getSecond()).intValue();
                    r10 = new SpannableStringBuilder();
                    if (str2 != null && !evu0.J(str2)) {
                        r10.append(str2, new ThemedTextAppearanceSpan(activity, pwy0Var, intValue), 33);
                    }
                    if (str2 != null && str != null) {
                        r10.append("\n");
                    }
                    if (str != null && !evu0.J(str)) {
                        r10.append(str, new ThemedTextAppearanceSpan(activity, pwy0Var, intValue2), 33);
                    }
                } else {
                    r10 = cVar2.g;
                }
            }
        } else if (buttonHasSaveBenefitAction(actionButtonInfo)) {
            d dVar2 = this.presenter;
            pwy0 pwy0Var2 = dVar2.s;
            Activity activity2 = dVar2.j;
            BannerWidgets.a aVar2 = actionButtonInfo.g;
            String str3 = actionButtonInfo.c;
            if (aVar2 != null && (cVar = aVar2.b) != null) {
                String str4 = cVar.i;
                String str5 = cVar.h;
                if (aVar2.a == BannerWidgets.ActionType.SAVE_BENEFIT && ((str5 != null && !evu0.J(str5)) || (str4 != null && !evu0.J(str4)))) {
                    Pair pair2 = isLast ? new Pair(Integer.valueOf(v1i0.PromoCodeCopyLastButtonTitleTextAppearance), Integer.valueOf(v1i0.PromoCodeCopyLastButtonSubtitleTextAppearance)) : new Pair(Integer.valueOf(v1i0.PromoCodeCopyButtonTitleTextAppearance), Integer.valueOf(v1i0.PromoCodeCopyButtonSubtitleTextAppearance));
                    int intValue3 = ((Number) pair2.getFirst()).intValue();
                    int intValue4 = ((Number) pair2.getSecond()).intValue();
                    r10 = new SpannableStringBuilder();
                    if (str5 != null && !evu0.J(str5)) {
                        r10.append(str5, new ThemedTextAppearanceSpan(activity2, pwy0Var2, intValue3), 33);
                    }
                    if (str5 != null && !evu0.J(str5) && str4 != null && !evu0.J(str4)) {
                        r10.append("\n");
                    }
                    if (str4 != null && !evu0.J(str4)) {
                        r10.append(str4, new ThemedTextAppearanceSpan(activity2, pwy0Var2, intValue4), 33);
                    }
                }
            }
            r10 = str3;
        } else {
            r10 = actionButtonInfo.c;
        }
        r0.setText(r10);
        if (isLast) {
            r0.setButtonTitleColor(new bdc(xng0.textOnControl));
            r0.setButtonBackground(new bdc(xng0.controlMain));
        } else {
            r0.setButtonTitleColor(new bdc(xng0.textMain));
            r0.setButtonBackground(new bdc(xng0.controlMinor));
        }
        if (actionButtonInfo.i) {
            r0.setDebounceClickListener(new nm7(18, this, actionButtonInfo));
        } else {
            r0.setAlpha(0.5f);
            r0.setRippleColor(new cdc(0));
        }
        if (actionButtonInfo.l) {
            r0.setProgressing(true);
        } else {
            r0.setProgressing(false);
        }
        this.actionButtons.add(actionButtonInfo);
        this.bottomContainer.addView(r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addActionButton$lambda$0(CardBannerV2ModalView cardBannerV2ModalView, BannerWidgets.b bVar) {
        cardBannerV2ModalView.presenter.h(bVar);
    }

    private final void addButtons(List<BannerWidgets.b> actionButtons, int bottomWidgetsCount) {
        this.bottomContainer.removeAllViews();
        this.actionButtons.clear();
        for (BannerWidgets.b bVar : actionButtons) {
            boolean z = true;
            if (bVar != b64.c(1, actionButtons)) {
                z = false;
            }
            addActionButton(bVar, z);
        }
        ViewGroup viewGroup = this.bottomContainer;
        ViewGroup viewGroup2 = this.contentContainer;
        ViewGroup viewGroup3 = this.bottomContainerInScroll;
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.getParent();
        if (bottomWidgetsCount > 2) {
            viewGroup2 = viewGroup3;
        }
        if (viewGroup4.equals(viewGroup2)) {
            return;
        }
        viewGroup4.removeView(viewGroup);
        viewGroup2.addView(viewGroup);
    }

    private final void addCloseButton() {
        CircleButtonImageView circleButtonImageView = new CircleButtonImageView(getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tje.u(48, circleButtonImageView.getContext()), tje.u(48, circleButtonImageView.getContext()));
        layoutParams.bottomMargin = tje.u(8, circleButtonImageView.getContext());
        if (xw31.n(circleButtonImageView.getContext())) {
            layoutParams.leftMargin = tje.u(20, circleButtonImageView.getContext());
        } else {
            layoutParams.rightMargin = tje.u(20, circleButtonImageView.getContext());
        }
        circleButtonImageView.setLayoutParams(layoutParams);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(qje.t(xng0.bgFloating, circleButtonImageView.getContext()));
        circleButtonImageView.setBackground(shapeDrawable);
        circleButtonImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        circleButtonImageView.setContentDescription(circleButtonImageView.getContext().getString(mzh0.common_close));
        androidx.core.view.b.p(circleButtonImageView, new mg(8, circleButtonImageView));
        circleButtonImageView.setImageResource(CLOSE_BUTTON_IMAGE_RES);
        ru.yandex.taxi.design.utils.c.z(new hb8(this, 0), circleButtonImageView);
        circleButtonImageView.setId(idh0.card_banner_close);
        SlideableModalView.addViewAboveCard$default(this, circleButtonImageView, 8388661, 0, 4, null);
        this.closeView = circleButtonImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addCloseButton$lambda$0$2(CardBannerV2ModalView cardBannerV2ModalView) {
        d dVar = cardBannerV2ModalView.presenter;
        dVar.l();
        ((fb8) dVar.a).dismiss();
        return zy11.a;
    }

    private final boolean buttonHasCopyAction(BannerWidgets.b actionButtonInfo) {
        BannerWidgets.a aVar = actionButtonInfo.g;
        return aVar != null && aVar.a == BannerWidgets.ActionType.CLIPBOARD_COPY;
    }

    private final boolean buttonHasSaveBenefitAction(BannerWidgets.b actionButtonInfo) {
        BannerWidgets.a aVar = actionButtonInfo.g;
        return aVar != null && aVar.a == BannerWidgets.ActionType.SAVE_BENEFIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideAndReset(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.pauseAnimation();
        lottieAnimationView.setImageDrawable(null);
    }

    private final void removeClipping(ViewParent parent) {
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || viewGroup.equals(getContent().getParent())) {
            return;
        }
        viewGroup.setClipChildren(false);
        viewGroup.setClipToOutline(false);
        removeClipping(viewGroup.getParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$0(cb8 cb8Var, CardBannerV2ModalView cardBannerV2ModalView, isf0 isf0Var) {
        String str;
        String a;
        for (cb8 cb8Var2 : isf0Var.b) {
            if (jl40.l(cb8Var.b, cb8Var2.b) && (str = cb8Var2.o) != null && (a = cardBannerV2ModalView.assetsStorage.a(str)) != null) {
                cardBannerV2ModalView.setImage(new gbv(Uri.fromFile(new File(a))), cb8Var.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$2(CardBannerV2ModalView cardBannerV2ModalView, List list) {
        cardBannerV2ModalView.presenter.j(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$6(CardBannerV2ModalView cardBannerV2ModalView, cb8 cb8Var, long j) {
        cardBannerV2ModalView.presenter.i(j);
        hi2 hi2Var = cb8Var.u;
        cardBannerV2ModalView.showAnimation(hi2Var != null ? (ci2) hi2Var.d.getValue() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$7$0(CardBannerV2ModalView cardBannerV2ModalView, BannerWidgets.f fVar) {
        cardBannerV2ModalView.presenter.k(fVar);
    }

    private final void setImage(tbv model, String id) {
        ImageView imageView = this.bannerImageView;
        LottieAnimationView lottieAnimationView = this.animationView;
        int i = qwh0.placeholder_banner_animation;
        pav pavVar = this.imageLoader;
        qa0 qa0Var = new qa0(3, this);
        imageView.setVisibility(8);
        lottieAnimationView.setVisibility(8);
        if (model != null) {
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setAnimation(i);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setProgress(0.0f);
            lottieAnimationView.playAnimation();
            imageView.setImageDrawable(null);
            nac nacVar = (nac) pavVar.a(imageView);
            nacVar.h = new lc0(lottieAnimationView, imageView, qa0Var, id, 4);
            nacVar.b(model);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setImage$lambda$0(CardBannerV2ModalView cardBannerV2ModalView, long j) {
        cardBannerV2ModalView.presenter.i(j);
    }

    private final void setupSubtitle(TypedContentWidget typedText, mtc properties) {
        if (properties != null) {
            this.subtitleTextView.setTextAlignment(4);
        }
        CharSequence m = this.presenter.m(typedText, idh0.banner_text);
        this.subtitleTextView.setText(m);
        boolean d = qeb1.d(m);
        AppCompatTextView appCompatTextView = this.subtitleTextView;
        if (!d) {
            appCompatTextView.setMovementMethod(null);
            return;
        }
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.subtitleTextView.setLinkTextColor(qje.t(xng0.textMain, getContext()));
    }

    private final void setupTitle(TypedContentWidget title, ntc properties) {
        if (properties != null) {
            Typeface typeface = properties.a;
            if (typeface != null) {
                this.titleTextView.setTypeface(typeface);
            }
            this.titleTextView.setLineSpacing(0.0f, properties.d);
            this.titleTextView.setTextSize(properties.b);
            this.titleTextView.setTextAlignment(properties.g);
            Float f = properties.h;
            if (f != null) {
                this.titleTextView.setLetterSpacing(f.floatValue());
            }
        }
        CharSequence m = this.presenter.m(title, idh0.banner_header);
        this.titleTextView.setText(m);
        this.titleTextView.setMovementMethod(qeb1.d(m) ? LinkMovementMethod.getInstance() : null);
        this.titleTextView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAndPlay(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.playAnimation();
    }

    private final void showAnimation(ci2 extraAnimation) {
        Integer valueOf = extraAnimation != null ? Integer.valueOf(extraAnimation.getLoopCount()) : null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return;
        }
        ib8 ib8Var = new ib8(0, this, valueOf, extraAnimation);
        c90 c90Var = new c90(1);
        if (extraAnimation instanceof t1z) {
            chb1.e(getContext(), ((t1z) extraAnimation).a, ib8Var, c90Var, 16);
        } else if (extraAnimation instanceof yzo) {
            chb1.b(ssz.i(getContext(), ((yzo) extraAnimation).a, null), ib8Var, c90Var);
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAnimation$lambda$0(CardBannerV2ModalView cardBannerV2ModalView, Integer num, ci2 ci2Var, nsz nszVar) {
        cardBannerV2ModalView.extraAnimationView.setComposition(nszVar);
        cardBannerV2ModalView.extraAnimationView.setRepeatCount(num.intValue() < 0 ? -1 : num.intValue() - 1);
        cardBannerV2ModalView.extraAnimationView.postDelayed(new uz(7, cardBannerV2ModalView), Math.max(0L, ci2Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAnimation$lambda$1(Throwable th) {
        xby.d.j(th);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        CircleButtonImageView circleButtonImageView = this.closeView;
        if (circleButtonImageView != null) {
            circleButtonImageView.setImageResource(CLOSE_BUTTON_IMAGE_RES);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return mph0.card_banner_v2_modal_view;
    }

    @Override // defpackage.fb8
    public float getZOrder() {
        return getZ();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new hb8(this, 1), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.f(this);
        a aVar = this.bannerAnimationHeightController;
        View view = aVar.a;
        BannerAnimationHeightController$LayoutChangeListener bannerAnimationHeightController$LayoutChangeListener = aVar.c;
        view.addOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        aVar.b.addOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.d();
        this.closeView = null;
        a aVar = this.bannerAnimationHeightController;
        View view = aVar.a;
        BannerAnimationHeightController$LayoutChangeListener bannerAnimationHeightController$LayoutChangeListener = aVar.c;
        view.removeOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        aVar.b.removeOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.presenter.l();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        Consumer<isf0> consumer = this.promotionsListener;
        if (consumer != null) {
            this.promotionsProvider.o.remove(consumer);
        }
        this.promotionsListener = null;
    }

    @Override // defpackage.fb8
    public void setData(cb8 banner) {
        boolean z = banner.q;
        TypedContentWidget typedContentWidget = banner.m;
        BannerWidgets bannerWidgets = banner.s;
        if (z) {
            addCloseButton();
        }
        jb8 jb8Var = new jb8(banner, this);
        this.promotionsListener = jb8Var;
        h hVar = this.promotionsProvider;
        hVar.o.add(jb8Var);
        isf0 isf0Var = hVar.s;
        if (isf0Var != null) {
            jb8Var.accept(isf0Var);
        }
        this.titleTextView.setVisibility(8);
        hideAndReset(this.extraAnimationView);
        this.labelUtils.a(this.label, bannerWidgets.d, new e48(5, this));
        erc ercVar = ((drc) this.communicationsFontPropertiesProvider).a;
        otc a = erc.a(ercVar) ? ercVar.c.a(ercVar.a) : null;
        TypedContentWidget typedContentWidget2 = banner.l;
        if (typedContentWidget2 != null) {
            setupTitle(typedContentWidget2, a != null ? a.a : null);
        }
        this.subtitleTextView.setVisibility((typedContentWidget == null || (!typedContentWidget.d.d() && evu0.J(typedContentWidget.a))) ? 8 : 0);
        if (typedContentWidget != null) {
            setupSubtitle(typedContentWidget, a != null ? a.b : null);
        }
        String a2 = hr4.a(this.assetsStorage, banner.n);
        if ((a2 == null || evu0.J(a2)) && !banner.t) {
            ViewGroup viewGroup = (ViewGroup) this.label.getParent();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.rightMargin = getResources().getDimensionPixelSize(lrg0.card_banner_advertisement_badge_padding);
            layoutParams.topMargin = getResources().getDimensionPixelSize(lrg0.card_banner_advertisement_badge_padding);
            viewGroup.setLayoutParams(layoutParams);
        }
        String str = banner.b;
        ImageView imageView = this.bannerImageView;
        LottieAnimationView lottieAnimationView = this.animationView;
        String str2 = banner.o;
        qbv qbvVar = str2 != null ? new qbv(str2) : null;
        int i = qwh0.placeholder_banner_animation;
        pav pavVar = this.imageLoader;
        jb8 jb8Var2 = new jb8(this, banner);
        imageView.setVisibility(8);
        lottieAnimationView.setVisibility(8);
        if (qbvVar != null) {
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setAnimation(i);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setProgress(0.0f);
            lottieAnimationView.playAnimation();
            imageView.setImageDrawable(null);
            nac nacVar = (nac) pavVar.a(imageView);
            nacVar.h = new lc0(lottieAnimationView, imageView, jb8Var2, str, 4);
            nacVar.b(qbvVar);
        }
        addButtons(kotlin.collections.a.A0(bannerWidgets.c, 2), bannerWidgets.a());
        BannerWidgets.f fVar = bannerWidgets.e;
        if (fVar != null) {
            ht4.a(fVar, this.bottomContainer, new nm7(19, this, fVar));
        }
        boolean z2 = banner.q || bannerWidgets.c.isEmpty();
        setCardMode(z2 ? SlideableModalView.CardMode.SLIDEABLE_CARD : SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnBackPressed(z2);
    }

    @Override // defpackage.fb8
    public void updateButton(BannerWidgets.b oldActionButton, BannerWidgets.b newActionButton, int bottomWidgetsCount) {
        this.actionButtons.set(this.actionButtons.indexOf(oldActionButton), newActionButton);
        List<BannerWidgets.b> list = this.actionButtons;
        ArrayList arrayList = new ArrayList(list.size());
        for (BannerWidgets.b bVar : list) {
            Objects.requireNonNull(bVar);
            arrayList.add(bVar);
        }
        addButtons(Collections.unmodifiableList(arrayList), bottomWidgetsCount);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateCurrentBackground() {
        if (getHasCustomBackgroundColor()) {
            return;
        }
        if (lb8.a[get_cardMode().ordinal()] == 1) {
            getBottomSheet().setBackgroundColor(qje.t(getFullscreenBackgroundAttrRes(), getContext()));
            return;
        }
        int t = qje.t(getSlideableBackgroundAttrRes(), getContext());
        float cornersRadius = getCornersRadius();
        b.a aVar = new b.a();
        aVar.i(eja1.m(0));
        aVar.j(cornersRadius);
        aVar.k(eja1.m(0));
        aVar.l(cornersRadius);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar.a());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(t));
        getBottomSheet().setBackground(materialShapeDrawable);
    }

    @Override // defpackage.fb8
    public void updateText(CharSequence text, int viewId) {
        if (viewId == idh0.banner_header) {
            this.titleTextView.setText(text);
        } else if (viewId == idh0.banner_text) {
            this.subtitleTextView.setText(text);
        }
    }
}
