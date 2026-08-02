package ru.yandex.taxi.banners;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.arx;
import defpackage.bdc;
import defpackage.c230;
import defpackage.cb8;
import defpackage.dn7;
import defpackage.e230;
import defpackage.e48;
import defpackage.evu0;
import defpackage.fb8;
import defpackage.gr4;
import defpackage.hr4;
import defpackage.ht4;
import defpackage.idh0;
import defpackage.ir4;
import defpackage.iux0;
import defpackage.lls;
import defpackage.lrg0;
import defpackage.ltc;
import defpackage.mph0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nm7;
import defpackage.nph0;
import defpackage.pav;
import defpackage.pdc;
import defpackage.q5z;
import defpackage.qeb1;
import defpackage.rk6;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.tje;
import defpackage.ufu;
import defpackage.xng0;
import defpackage.xw31;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020\u001cH\u0003¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020\u001cH\u0003¢\u0006\u0004\b.\u0010-J#\u0010/\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020\u001cH\u0003¢\u0006\u0004\b/\u0010-J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0014H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0014H\u0014¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b6\u0010$J\u001f\u0010:\u001a\u00020\u00142\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0014¢\u0006\u0004\b<\u00104J\u000f\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0014H\u0014¢\u0006\u0004\b@\u00104J\u000f\u0010A\u001a\u00020\u0014H\u0016¢\u0006\u0004\bA\u00104J\u0017\u0010D\u001a\u00020\u00142\u0006\u0010C\u001a\u00020BH\u0014¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010PR\u0014\u0010a\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010PR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006y"}, d2 = {"Lru/yandex/taxi/banners/CardBannerV1ModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lfb8;", "Lnwy0;", "Landroid/app/Activity;", "context", "Lru/yandex/taxi/banners/d;", "presenter", "Lpav;", "imageLoader", "Lpdc;", "colorConverter", "Lltc;", "communicationsErrorsInteractor", "Lir4;", "assetsStorage", "<init>", "(Landroid/app/Activity;Lru/yandex/taxi/banners/d;Lpav;Lpdc;Lltc;Lir4;)V", "Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;", "actionButtonInfo", "Lzy11;", "addActionButton", "(Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;)V", "", "Lru/yandex/taxi/promotions/model/PromotionBackground;", "backgrounds", "setupBackground", "(Ljava/util/List;)V", "", "color", "Landroid/graphics/drawable/Drawable;", "createBackground", "(I)Landroid/graphics/drawable/Drawable;", "Lcb8;", "banner", "setupTitle", "(Lcb8;)V", "Lru/yandex/taxi/communications/api/dto/TypedContentWidget;", "title", "setupHeader", "(Lru/yandex/taxi/communications/api/dto/TypedContentWidget;)V", "", "hexColor", "fallbackColor", "resolveTextColor", "(Ljava/lang/String;I)I", "resolveControlColor", "resolveBgColor", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "setData", "", "text", "viewId", "updateText", "(Ljava/lang/CharSequence;I)V", "onAppearAnimationComplete", "", "hasCustomBackground", "()Z", "onDismissManually", "dismiss", "", "newOffset", "onDialogSlide", "(F)V", "Lru/yandex/taxi/banners/d;", "Lpav;", "Lpdc;", "Lltc;", "Lir4;", "Larx;", "labelUtils", "Larx;", "Landroid/view/ViewGroup;", "contentContainer", "Landroid/view/ViewGroup;", "Landroid/view/View;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/BadgeView;", "label", "Lru/yandex/taxi/design/BadgeView;", "Lru/yandex/taxi/design/ListItemComponent;", "titleView", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListHeaderComponent;", "headerView", "Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "descriptionView", "Lru/yandex/taxi/design/ListTextComponent;", "bottomContainerInScroll", "bottomContainer", "Landroid/widget/ImageView;", "bannerImageView", "Landroid/widget/ImageView;", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "scrollView", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Llls;", "fullyVisibleViewChecker", "Llls;", "Lru/yandex/taxi/banners/a;", "bannerAnimationHeightController", "Lru/yandex/taxi/banners/a;", "hasCustomBackgroundColor", "Z", "getZOrder", "()F", "zOrder", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardBannerV1ModalView extends SlideableModalView implements fb8 {
    private final LottieAnimationView animationView;
    private final ir4 assetsStorage;
    private final a bannerAnimationHeightController;
    private final ImageView bannerImageView;
    private final ViewGroup bottomContainer;
    private final ViewGroup bottomContainerInScroll;
    private final pdc colorConverter;
    private final ltc communicationsErrorsInteractor;
    private final View content;
    private final ViewGroup contentContainer;
    private final ListTextComponent descriptionView;
    private final lls fullyVisibleViewChecker;
    private boolean hasCustomBackgroundColor;
    private final ListHeaderComponent headerView;
    private final pav imageLoader;
    private final BadgeView label;
    private final arx labelUtils;
    private final d presenter;
    private final NestedScrollViewAdvanced scrollView;
    private final ListItemComponent titleView;

    public CardBannerV1ModalView(Activity activity, d dVar, pav pavVar, pdc pdcVar, ltc ltcVar, ir4 ir4Var) {
        super(activity);
        this.presenter = dVar;
        this.imageLoader = pavVar;
        this.colorConverter = pdcVar;
        this.communicationsErrorsInteractor = ltcVar;
        this.assetsStorage = ir4Var;
        this.labelUtils = new arx(pdcVar);
        int i = idh0.banner_content_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.contentContainer = (ViewGroup) ((View) rp31.d(this, i));
        this.content = (View) rp31.d(this, idh0.banner_content);
        this.label = (BadgeView) ((View) rp31.d(this, idh0.banner_label));
        this.titleView = (ListItemComponent) ((View) rp31.d(this, idh0.banner_title));
        this.headerView = (ListHeaderComponent) ((View) rp31.d(this, idh0.banner_header));
        this.descriptionView = (ListTextComponent) ((View) rp31.d(this, idh0.banner_text));
        this.bottomContainerInScroll = (ViewGroup) ((View) rp31.d(this, idh0.banner_bottom_container_in_scroll));
        this.bottomContainer = (ViewGroup) ((View) rp31.d(this, idh0.banner_bottom_container));
        this.bannerImageView = (ImageView) ((View) rp31.d(this, idh0.banner_image));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) rp31.d(this, idh0.banner_animation_view));
        this.animationView = lottieAnimationView;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) ((View) rp31.d(this, idh0.banner_scroll_view));
        this.scrollView = nestedScrollViewAdvanced;
        this.fullyVisibleViewChecker = nestedScrollViewAdvanced.createFullyVisibleViewChecker(lottieAnimationView, new dn7(12, this));
        this.bannerAnimationHeightController = new a(lottieAnimationView, nestedScrollViewAdvanced);
    }

    private final void addActionButton(BannerWidgets.b actionButtonInfo) {
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(getContext()).inflate(nph0.banner_action_button, this.bottomContainer, false);
        buttonComponent.setText(actionButtonInfo.c);
        buttonComponent.setButtonTitleColor(resolveTextColor(actionButtonInfo.f, xng0.textOnControl));
        buttonComponent.setButtonBackground(resolveControlColor(actionButtonInfo.e, xng0.controlMain));
        buttonComponent.setDebounceClickListener(new nm7(16, this, actionButtonInfo));
        this.bottomContainer.addView(buttonComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addActionButton$lambda$0(CardBannerV1ModalView cardBannerV1ModalView, BannerWidgets.b bVar) {
        cardBannerV1ModalView.presenter.h(bVar);
    }

    private final Drawable createBackground(int color) {
        float dimension = getResources().getDimension(lrg0.card_banner_background_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fullyVisibleViewChecker$lambda$0(CardBannerV1ModalView cardBannerV1ModalView) {
        cardBannerV1ModalView.animationView.playAnimation();
    }

    private final int resolveBgColor(String hexColor, int fallbackColor) {
        return s8o.m(((ufu) this.colorConverter).a(new bdc(fallbackColor), hexColor), getContext());
    }

    private final int resolveControlColor(String hexColor, int fallbackColor) {
        return s8o.m(((ufu) this.colorConverter).d(new bdc(fallbackColor), hexColor), getContext());
    }

    private final int resolveTextColor(String hexColor, int fallbackColor) {
        return s8o.m(((ufu) this.colorConverter).h(new bdc(fallbackColor), hexColor), getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$0(CardBannerV1ModalView cardBannerV1ModalView, List list) {
        cardBannerV1ModalView.presenter.j(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$1(CardBannerV1ModalView cardBannerV1ModalView, BannerWidgets.f fVar) {
        cardBannerV1ModalView.presenter.k(fVar);
    }

    private final void setupBackground(List<PromotionBackground> backgrounds) {
        Object obj;
        Iterator<T> it = backgrounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((PromotionBackground) obj).a == PromotionBackground.Type.COLOR) {
                    break;
                }
            }
        }
        PromotionBackground promotionBackground = (PromotionBackground) obj;
        if (promotionBackground != null) {
            this.hasCustomBackgroundColor = true;
            int resolveBgColor = resolveBgColor(promotionBackground.b, xng0.bgMain);
            this.contentContainer.setBackground(createBackground(resolveBgColor));
            this.content.setBackground(new ColorDrawable(resolveBgColor));
            this.bottomContainerInScroll.setBackground(new ColorDrawable(resolveBgColor));
        }
    }

    private final void setupHeader(TypedContentWidget title) {
        this.headerView.setVisibility(0);
        CharSequence m = this.presenter.m(title, idh0.banner_header);
        this.headerView.setTitle(m);
        boolean d = qeb1.d(m);
        ListHeaderComponent listHeaderComponent = this.headerView;
        if (d) {
            listHeaderComponent.setTitleMovementMethod(LinkMovementMethod.getInstance());
        } else {
            listHeaderComponent.setTitleMovementMethod(null);
        }
        int resolveTextColor = resolveTextColor(title.b, xng0.textMain);
        this.headerView.setTitleTextColor(resolveTextColor);
        this.headerView.setTitleLinkTextColor(resolveTextColor);
    }

    private final void setupTitle(cb8 banner) {
        TypedContentWidget typedContentWidget = banner.l;
        if (typedContentWidget != null && (typedContentWidget.d.d() || !evu0.J(typedContentWidget.a))) {
            this.titleView.setVisibility(0);
            CharSequence m = this.presenter.m(typedContentWidget, idh0.banner_title);
            this.titleView.setTitle(m);
            boolean d = qeb1.d(m);
            ListItemComponent listItemComponent = this.titleView;
            if (d) {
                listItemComponent.setTitleMovementMethod(LinkMovementMethod.getInstance());
            } else {
                listItemComponent.setTitleMovementMethod(null);
            }
            int resolveTextColor = resolveTextColor(typedContentWidget.b, xng0.textMain);
            this.titleView.setTitleTextColor(resolveTextColor);
            this.titleView.setTitleLinkTextColor(resolveTextColor);
        }
        String a = hr4.a(this.assetsStorage, banner.n);
        if (a == null || a.length() == 0) {
            this.titleView.clearLeadView();
            xw31.K(0, this.titleView);
            return;
        }
        this.titleView.setVisibility(0);
        xw31.K(getResources().getDimensionPixelSize(mrg0.go_design_m_space), this.titleView);
        ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(mph0.card_banner_icon, (ViewGroup) null);
        this.titleView.setLeadView(imageView);
        int u = tje.u(48, getContext());
        ru.yandex.taxi.design.utils.c.D(u, imageView.getLayoutParams().height, imageView);
        ru.yandex.taxi.design.utils.c.D(imageView.getLayoutParams().width, u, imageView);
        ((nac) this.imageLoader.a(imageView)).c(a);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return mph0.card_banner_v1_modal_view;
    }

    @Override // defpackage.fb8
    public float getZOrder() {
        return getZ();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground, reason: from getter */
    public boolean getHasCustomBackgroundColor() {
        return this.hasCustomBackgroundColor;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new rk6(17, this), false);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        this.fullyVisibleViewChecker.a();
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
        this.fullyVisibleViewChecker.c();
        a aVar = this.bannerAnimationHeightController;
        View view = aVar.a;
        BannerAnimationHeightController$LayoutChangeListener bannerAnimationHeightController$LayoutChangeListener = aVar.c;
        view.removeOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
        aVar.b.removeOnLayoutChangeListener(bannerAnimationHeightController$LayoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        this.fullyVisibleViewChecker.a();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.presenter.l();
    }

    @Override // defpackage.fb8
    public void setData(cb8 banner) {
        String str;
        setupBackground(banner.r);
        this.headerView.setVisibility(8);
        arx arxVar = this.labelUtils;
        BadgeView badgeView = this.label;
        BannerWidgets bannerWidgets = banner.s;
        arxVar.a(badgeView, bannerWidgets.d, new e48(4, this));
        this.titleView.setVisibility(8);
        TypedContentWidget typedContentWidget = banner.l;
        if (typedContentWidget == null || typedContentWidget.c != TypedContentWidget.Type.LARGE) {
            setupTitle(banner);
            xw31.K(0, this.descriptionView);
        } else {
            setupHeader(typedContentWidget);
            xw31.K(getResources().getDimensionPixelSize(mrg0.go_design_m_space), this.descriptionView);
        }
        TypedContentWidget typedContentWidget2 = banner.m;
        if (typedContentWidget2 == null) {
            this.descriptionView.setVisibility(8);
        } else {
            ht4.b(this.descriptionView, this.presenter.m(typedContentWidget2, idh0.banner_text), q5z.s(resolveTextColor(typedContentWidget2.b, xng0.textMain)));
        }
        ImageView imageView = this.bannerImageView;
        LottieAnimationView lottieAnimationView = this.animationView;
        String a = hr4.a(this.assetsStorage, banner.o);
        gr4 gr4Var = banner.p;
        lls llsVar = this.fullyVisibleViewChecker;
        pav pavVar = this.imageLoader;
        ltc ltcVar = this.communicationsErrorsInteractor;
        imageView.setVisibility(8);
        lottieAnimationView.setVisibility(8);
        if (gr4Var != null && (str = gr4Var.a) != null && str.length() != 0) {
            try {
                lottieAnimationView.setRepeatCount(gr4Var.b ? -1 : 0);
                lottieAnimationView.setAnimationFromUrl(str);
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.setProgress(0.0f);
                llsVar.c();
                llsVar.b();
            } catch (FileNotFoundException e) {
                ((iux0) ltcVar).c("Error loading animation", e, "Error loading animation", "WTF");
            }
        } else if (a != null && a.length() != 0) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(0);
            ((nac) pavVar.a(imageView)).c(a);
        }
        this.bottomContainer.removeAllViews();
        BannerWidgets.f fVar = bannerWidgets.e;
        if (fVar != null) {
            ht4.a(fVar, this.bottomContainer, new nm7(17, this, fVar));
        }
        Iterator it = bannerWidgets.c.iterator();
        while (it.hasNext()) {
            addActionButton((BannerWidgets.b) it.next());
        }
        int a2 = bannerWidgets.a();
        ViewGroup viewGroup = this.bottomContainer;
        ViewGroup viewGroup2 = this.contentContainer;
        ViewGroup viewGroup3 = this.bottomContainerInScroll;
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.getParent();
        if (a2 > 2) {
            viewGroup2 = viewGroup3;
        }
        if (!viewGroup4.equals(viewGroup2)) {
            viewGroup4.removeView(viewGroup);
            viewGroup2.addView(viewGroup);
        }
        boolean z = banner.q || bannerWidgets.c.isEmpty();
        setCardMode(z ? SlideableModalView.CardMode.SLIDEABLE_CARD : SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnBackPressed(z);
    }

    @Override // defpackage.fb8
    public /* bridge */ void updateButton(BannerWidgets.b bVar, BannerWidgets.b bVar2, int i) {
    }

    @Override // defpackage.fb8
    public void updateText(CharSequence text, int viewId) {
        if (viewId == idh0.banner_title) {
            this.titleView.setTitle(text);
        } else if (viewId == idh0.banner_header) {
            this.headerView.setTitle(text);
        } else if (viewId == idh0.banner_text) {
            this.descriptionView.setText(text);
        }
    }
}
