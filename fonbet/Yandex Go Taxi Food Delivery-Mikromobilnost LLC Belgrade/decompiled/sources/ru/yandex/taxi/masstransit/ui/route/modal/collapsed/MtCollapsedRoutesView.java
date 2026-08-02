package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.i;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.summary.analytics.SummaryAnalytics$AddressPlacement;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.taxi.analytics.HubOpenReason;
import defpackage.adc;
import defpackage.b0b;
import defpackage.bdc;
import defpackage.c040;
import defpackage.c6w;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.dd30;
import defpackage.dv1;
import defpackage.e040;
import defpackage.ei;
import defpackage.ezy;
import defpackage.f540;
import defpackage.g18;
import defpackage.hzy;
import defpackage.i0z;
import defpackage.igl0;
import defpackage.jl40;
import defpackage.kd60;
import defpackage.kk31;
import defpackage.kyh0;
import defpackage.lk31;
import defpackage.lwu0;
import defpackage.m950;
import defpackage.mgl0;
import defpackage.n;
import defpackage.ny61;
import defpackage.ob31;
import defpackage.ob60;
import defpackage.od8;
import defpackage.pi30;
import defpackage.pzt0;
import defpackage.qe30;
import defpackage.qgu0;
import defpackage.qn30;
import defpackage.qoi0;
import defpackage.qy30;
import defpackage.reh0;
import defpackage.rx30;
import defpackage.ry30;
import defpackage.sc20;
import defpackage.scc;
import defpackage.se30;
import defpackage.sf30;
import defpackage.sg0;
import defpackage.su30;
import defpackage.t1w;
import defpackage.tcc;
import defpackage.te30;
import defpackage.tje;
import defpackage.ue30;
import defpackage.uqh0;
import defpackage.vsq;
import defpackage.vx30;
import defpackage.w440;
import defpackage.w511;
import defpackage.ww30;
import defpackage.x440;
import defpackage.xe30;
import defpackage.xm2;
import defpackage.xng0;
import defpackage.y57;
import defpackage.y6i0;
import defpackage.ye30;
import defpackage.ys0;
import defpackage.z50;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.promo.NotificationState;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002KNB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u0019\u0010\u001e\u001a\u00020\u000e2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010\u001fJ\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u00060KR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/MtCollapsedRoutesView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/d;", "presenter", "Lw440;", "mtSummaryCommunicationsDelegateFactory", "Lqgu0;", "stopPointsDelegate", "Landroid/content/Context;", "context", "Llk31;", "verticalsViewFactory", "<init>", "(Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/d;Lw440;Lqgu0;Landroid/content/Context;Llk31;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "slideOffset", "bottomContainerAlpha", "onSlide", "(FF)V", "Lt1w;", "insets", "applyInsets", "(Lt1w;)V", "applyLoadingButtonState", "", "textResId", "applyDefaultButtonState", "(I)V", "titleResId", "subtitleResId", "buttonTextResId", "renderErrorState", "(III)V", ClidProvider.STATE, "onTariffViewPagerScrollChanged", "position", "verticalsCount", "initVerticalHeaderAndViewPagerPosition", "(II)V", "selectedPosition", "scrollToSelectedRoute", "Le040;", "renderRoutesState", "(Le040;)V", "handleTransportCardLayoutAccessibility", "Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/d;", "Lqgu0;", "Lye30;", "binding", "Lye30;", "Lru/yandex/taxi/masstransit/promo/a;", "communicationsDelegate", "Lru/yandex/taxi/masstransit/promo/a;", "Lww30;", "routesAdapter", "Lww30;", "Lry30;", "routesViewPagerAdapter", "Lry30;", "Lg18;", "insetsCancellable", "Lg18;", "bottomButtonContainerShadowPadding", CA20Status.STATUS_USER_I, "", "isPagerScrolling", "Z", "targetSelectedPage", "Lkk31;", "verticalsView", "Lkk31;", "Lxe30;", "inner", "Lxe30;", "ze30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtCollapsedRoutesView extends GoLinearLayout {
    public static final int $stable = 8;
    private final ye30 binding;
    private int bottomButtonContainerShadowPadding;
    private final ru.yandex.taxi.masstransit.promo.a communicationsDelegate;
    private final xe30 inner;
    private final g18 insetsCancellable;
    private boolean isPagerScrolling;
    private final d presenter;
    private final ww30 routesAdapter;
    private final ry30 routesViewPagerAdapter;
    private final qgu0 stopPointsDelegate;
    private int targetSelectedPage;
    private final kk31 verticalsView;

    public MtCollapsedRoutesView(d dVar, w440 w440Var, qgu0 qgu0Var, Context context, lk31 lk31Var) {
        super(context, null, 0, 0, 14, null);
        MtCollapsedRoutesView mtCollapsedRoutesView;
        String str;
        View O;
        View O2;
        this.presenter = dVar;
        this.stopPointsDelegate = qgu0Var;
        LayoutInflater.from(context).inflate(uqh0.mt_collapsed_routes_view, this);
        int i = reh0.addresses;
        SourceDestinationComponent sourceDestinationComponent = (SourceDestinationComponent) cma1.O(i, this);
        if (sourceDestinationComponent != null) {
            i = reh0.bottom_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout != null) {
                i = reh0.bottom_container_with_shadow;
                GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, this);
                if (goLinearLayout2 != null) {
                    i = reh0.button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                    if (buttonComponent != null && (O = cma1.O((i = reh0.error_layout), this)) != null) {
                        int i2 = reh0.brick_image;
                        if (((GoImageView) cma1.O(i2, O)) != null) {
                            i2 = reh0.error_subtitle;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                            if (robotoTextView != null) {
                                i2 = reh0.error_title;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                                if (robotoTextView2 != null) {
                                    str = "Missing required view with ID: ";
                                    ConstraintLayout constraintLayout = (ConstraintLayout) O;
                                    dv1 dv1Var = new dv1(constraintLayout, robotoTextView, robotoTextView2, 1);
                                    int i3 = reh0.mt_summary_order_button_shadow;
                                    ImageView imageView = (ImageView) cma1.O(i3, this);
                                    if (imageView != null) {
                                        i3 = reh0.tariffPager;
                                        ViewPager2 viewPager2 = (ViewPager2) cma1.O(i3, this);
                                        if (viewPager2 != null) {
                                            i3 = reh0.transport_card_image;
                                            GoImageButton goImageButton = (GoImageButton) cma1.O(i3, this);
                                            if (goImageButton != null) {
                                                i3 = reh0.transport_card_image_placeholder;
                                                PlaceholderView placeholderView = (PlaceholderView) cma1.O(i3, this);
                                                if (placeholderView != null) {
                                                    i3 = reh0.transport_card_layout;
                                                    GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i3, this);
                                                    if (goConstraintLayout != null) {
                                                        i3 = reh0.transport_card_placeholder;
                                                        GoConstraintLayout goConstraintLayout2 = (GoConstraintLayout) cma1.O(i3, this);
                                                        if (goConstraintLayout2 != null) {
                                                            i3 = reh0.transport_card_status_image;
                                                            GoImageButton goImageButton2 = (GoImageButton) cma1.O(i3, this);
                                                            if (goImageButton2 != null) {
                                                                i3 = reh0.transport_card_text;
                                                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, this);
                                                                if (robotoTextView3 != null) {
                                                                    i3 = reh0.transport_card_text_placeholder;
                                                                    ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i3, this);
                                                                    if (shimmeringRobotoTextView != null && (O2 = cma1.O((i3 = reh0.verticals_stub), this)) != null) {
                                                                        i3 = reh0.walking_duration;
                                                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i3, this);
                                                                        if (robotoTextView4 != null) {
                                                                            i3 = reh0.walking_duration_container;
                                                                            FrameLayout frameLayout = (FrameLayout) cma1.O(i3, this);
                                                                            if (frameLayout != null) {
                                                                                i3 = reh0.walking_duration_placeholder;
                                                                                PlaceholderView placeholderView2 = (PlaceholderView) cma1.O(i3, this);
                                                                                if (placeholderView2 != null) {
                                                                                    ye30 ye30Var = new ye30(this, sourceDestinationComponent, goLinearLayout, goLinearLayout2, buttonComponent, dv1Var, imageView, viewPager2, goImageButton, placeholderView, goConstraintLayout, goConstraintLayout2, goImageButton2, robotoTextView3, shimmeringRobotoTextView, O2, robotoTextView4, frameLayout, placeholderView2);
                                                                                    this.binding = ye30Var;
                                                                                    int i4 = 0;
                                                                                    se30 se30Var = new se30(this, i4);
                                                                                    ((x440) w440Var).a.getClass();
                                                                                    this.communicationsDelegate = new ru.yandex.taxi.masstransit.promo.a(context, goLinearLayout2, imageView, se30Var);
                                                                                    MtCollapsedRoutesView$routesAdapter$1 mtCollapsedRoutesView$routesAdapter$1 = new MtCollapsedRoutesView$routesAdapter$1(1, dVar, d.class, "onRouteClick", "onRouteClick(Lru/yandex/taxi/masstransit/model/MtSimpleRoute;)V", 0);
                                                                                    int i5 = y57.Z;
                                                                                    zxs zxsVar = new zxs(qoi0.a(c040.class).a(), 0, null, n.v(null), null, new sg0(17, mtCollapsedRoutesView$routesAdapter$1));
                                                                                    int i6 = b0b.e0;
                                                                                    ww30 ww30Var = new ww30(scc.g(zxsVar, new zxs(qoi0.a(qn30.class).a(), 0, null, EmptyList.a, null, new i0z(23))));
                                                                                    this.routesAdapter = ww30Var;
                                                                                    ry30 ry30Var = new ry30(new mgl0(ww30Var));
                                                                                    this.routesViewPagerAdapter = ry30Var;
                                                                                    this.targetSelectedPage = -1;
                                                                                    kk31 a = lk31Var.a(new sc20(9, this));
                                                                                    this.verticalsView = a;
                                                                                    this.inner = new xe30(this);
                                                                                    setOrientation(1);
                                                                                    setClipChildren(false);
                                                                                    setClipToPadding(false);
                                                                                    this.insetsCancellable = tje.i(goLinearLayout, 119, new se30(this, 1));
                                                                                    ru.yandex.taxi.design.utils.c.w(O2, a.asView());
                                                                                    goImageButton2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(24));
                                                                                    goImageButton2.setClipToOutline(true);
                                                                                    viewPager2.setAdapter(ry30Var);
                                                                                    viewPager2.registerOnPageChangeCallback(new te30(this, ye30Var));
                                                                                    frameLayout.setOnClickListener(new od8(3));
                                                                                    constraintLayout.setOnClickListener(new od8(4));
                                                                                    sourceDestinationComponent.setStopPointsDelegate(qgu0Var);
                                                                                    sourceDestinationComponent.setSourceDestinationListener(new ue30(this));
                                                                                    sourceDestinationComponent.setDestinationTrailClickListener(new qe30(i4, this));
                                                                                    handleTransportCardLayoutAccessibility();
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    mtCollapsedRoutesView = this;
                                    i = i3;
                                    ny61.t(str.concat(mtCollapsedRoutesView.getResources().getResourceName(i)));
                                    throw null;
                                }
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                        throw null;
                    }
                }
            }
        }
        mtCollapsedRoutesView = this;
        str = "Missing required view with ID: ";
        ny61.t(str.concat(mtCollapsedRoutesView.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(MtCollapsedRoutesView mtCollapsedRoutesView, t1w t1wVar) {
        mtCollapsedRoutesView.applyInsets(t1wVar);
        return false;
    }

    private final void applyDefaultButtonState(int textResId) {
        ButtonComponent buttonComponent = this.binding.e;
        buttonComponent.setClickable(true);
        buttonComponent.setAlpha(1.0f);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
        buttonComponent.setText(textResId);
        buttonComponent.setTextTypeface(3);
        buttonComponent.setLetterSpacing(-0.005f);
        buttonComponent.finishProgress();
    }

    private final void applyLoadingButtonState() {
        ButtonComponent buttonComponent = this.binding.e;
        buttonComponent.setClickable(false);
        buttonComponent.setAlpha(0.5f);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.setText(kyh0.mt_routes_button_loading_text);
        buttonComponent.setTextTypeface(0);
        buttonComponent.setLetterSpacing(0.0f);
        buttonComponent.startProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 communicationsDelegate$lambda$0(MtCollapsedRoutesView mtCollapsedRoutesView, dd30 dd30Var) {
        d dVar = mtCollapsedRoutesView.presenter;
        pzt0 pzt0Var = dVar.Z;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.Z = tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$onNotificationShown$1(dd30Var, null), 3);
        return zy11.a;
    }

    private final void handleTransportCardLayoutAccessibility() {
        androidx.core.view.b.p(this.binding.j, new ei(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initVerticalHeaderAndViewPagerPosition(int position, int verticalsCount) {
        this.verticalsView.updateHeaderState(position, 0.0f);
        ry30 ry30Var = this.routesViewPagerAdapter;
        ys0 ys0Var = new ys0(this, position, 7);
        ry30Var.getClass();
        d6w n = y6i0.n(0, verticalsCount);
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add(it.nextInt() == position ? ry30Var.z : lwu0.a);
        }
        ry30Var.submitList(arrayList, new sf30(6, ys0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initVerticalHeaderAndViewPagerPosition$lambda$0(MtCollapsedRoutesView mtCollapsedRoutesView, int i) {
        mtCollapsedRoutesView.binding.g.setCurrentItem(i, false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$2(MtCollapsedRoutesView mtCollapsedRoutesView, View view) {
        d dVar = mtCollapsedRoutesView.presenter;
        dVar.I.c(SummaryAnalytics$SummaryExpandingState.Collapsed, SummaryAnalytics$AddressPlacement.AddressHeader, SummaryAnalytics$SummaryAction.AddressSuggest);
        vx30 vx30Var = (vx30) dVar.x.a;
        vx30Var.z((m950) vx30Var.O.get(), new rx30(vx30Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTariffViewPagerScrollChanged(int state) {
        ob31 vertical;
        if (state == 0 && (vertical = this.verticalsView.getVertical(this.targetSelectedPage)) != null) {
            d dVar = this.presenter;
            dVar.getClass();
            ob31 ob31Var = !vertical.c ? vertical : null;
            if (ob31Var != null) {
                dVar.Ng(vertical, VerticalSelectorAnalytics$SelectionChangeReason.Swipe);
                dVar.J.a(HubOpenReason.SWIPE);
                ((vx30) dVar.x.a).r(new vsq(ob31Var.a, 29));
            }
        }
    }

    private final void renderErrorState(int titleResId, int subtitleResId, int buttonTextResId) {
        ye30 ye30Var = this.binding;
        ye30Var.g.setVisibility(8);
        ye30Var.p.setVisibility(8);
        ye30Var.q.setVisibility(8);
        dv1 dv1Var = ye30Var.f;
        dv1Var.b.setVisibility(0);
        dv1Var.d.setText(titleResId);
        dv1Var.c.setText(subtitleResId);
        applyDefaultButtonState(buttonTextResId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderRoutesState(e040 state) {
        ye30 ye30Var = this.binding;
        final int i = 0;
        if (state instanceof igl0) {
            dv1 dv1Var = ye30Var.f;
            RobotoTextView robotoTextView = ye30Var.p;
            dv1Var.b.setVisibility(8);
            ye30Var.q.setVisibility(8);
            robotoTextView.setVisibility(0);
            igl0 igl0Var = (igl0) state;
            ArrayList arrayList = igl0Var.a;
            robotoTextView.setText(igl0Var.b);
            ye30Var.g.setVisibility(0);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((c040) it.next()).f) {
                    break;
                } else {
                    i++;
                }
            }
            this.routesAdapter.submitList(arrayList, new xm2(this, i, 13));
            applyDefaultButtonState(kyh0.mt_routes_button_show_route);
            ye30Var.e.setDebounceClickListener(new z50(this, igl0Var, i, 10));
            return;
        }
        if (state instanceof ezy) {
            ye30Var.f.b.setVisibility(8);
            ye30Var.p.setVisibility(8);
            ye30Var.q.setVisibility(0);
            ye30Var.g.setVisibility(0);
            this.routesAdapter.submitList(((ezy) state).a, null);
            applyLoadingButtonState();
            ye30Var.e.setDebounceClickListener(null);
            return;
        }
        if (jl40.l(state, hzy.a)) {
            renderErrorState(kyh0.mt_routes_loading_error, kyh0.mt_try_later, kyh0.mt_routes_button_switch_to_taxi);
            ButtonComponent buttonComponent = ye30Var.e;
            final d dVar = this.presenter;
            buttonComponent.setDebounceClickListener(new Runnable() { // from class: re30
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    d dVar2 = dVar;
                    switch (i2) {
                        case 0:
                            MtCollapsedRoutesView.renderRoutesState$lambda$0$onGoToTaxiClick(dVar2);
                            break;
                        case 1:
                            MtCollapsedRoutesView.renderRoutesState$lambda$0$onShowAddresses(dVar2);
                            break;
                        default:
                            MtCollapsedRoutesView.renderRoutesState$lambda$0$onChangeAddress(dVar2);
                            break;
                    }
                }
            });
            return;
        }
        if (jl40.l(state, ob60.a)) {
            renderErrorState(kyh0.mt_select_destination_address, kyh0.mt_will_show_routes, kyh0.mt_routes_button_to_addresses);
            ButtonComponent buttonComponent2 = ye30Var.e;
            final d dVar2 = this.presenter;
            final int i2 = 1;
            buttonComponent2.setDebounceClickListener(new Runnable() { // from class: re30
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    d dVar22 = dVar2;
                    switch (i22) {
                        case 0:
                            MtCollapsedRoutesView.renderRoutesState$lambda$0$onGoToTaxiClick(dVar22);
                            break;
                        case 1:
                            MtCollapsedRoutesView.renderRoutesState$lambda$0$onShowAddresses(dVar22);
                            break;
                        default:
                            MtCollapsedRoutesView.renderRoutesState$lambda$0$onChangeAddress(dVar22);
                            break;
                    }
                }
            });
            return;
        }
        if (!jl40.l(state, kd60.a)) {
            w511.b();
            return;
        }
        renderErrorState(kyh0.mt_no_routes, kyh0.mt_try_other_addresses, kyh0.mt_routes_button_change_address);
        ButtonComponent buttonComponent3 = ye30Var.e;
        final d dVar3 = this.presenter;
        final int i3 = 2;
        buttonComponent3.setDebounceClickListener(new Runnable() { // from class: re30
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                d dVar22 = dVar3;
                switch (i22) {
                    case 0:
                        MtCollapsedRoutesView.renderRoutesState$lambda$0$onGoToTaxiClick(dVar22);
                        break;
                    case 1:
                        MtCollapsedRoutesView.renderRoutesState$lambda$0$onShowAddresses(dVar22);
                        break;
                    default:
                        MtCollapsedRoutesView.renderRoutesState$lambda$0$onChangeAddress(dVar22);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderRoutesState$lambda$0$2(MtCollapsedRoutesView mtCollapsedRoutesView, e040 e040Var, int i) {
        d dVar = mtCollapsedRoutesView.presenter;
        su30 su30Var = ((c040) ((igl0) e040Var).a.get(i)).e;
        dVar.getClass();
        dVar.Mg(su30Var, MtDetailRouteCardOpenReason.BUTTON_TAP);
        MtRoutesModalView mtRoutesModalView = ((vx30) dVar.x.a).U;
        if (mtRoutesModalView != null) {
            mtRoutesModalView.expand();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderRoutesState$lambda$0$onChangeAddress(d dVar) {
        dVar.x.B(PointType.DESTINATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderRoutesState$lambda$0$onGoToTaxiClick(d dVar) {
        ((vx30) dVar.x.a).r(new pi30(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderRoutesState$lambda$0$onShowAddresses(d dVar) {
        dVar.x.B(PointType.DESTINATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToSelectedRoute(int selectedPosition) {
        ry30 ry30Var = this.routesViewPagerAdapter;
        ViewPager2 viewPager2 = this.binding.g;
        mgl0 mgl0Var = (mgl0) kotlin.collections.a.R(adc.D(ry30Var.x.f, mgl0.class));
        x0 a = i.a(viewPager2, mgl0Var == null ? -1 : ry30Var.x.f.indexOf(mgl0Var));
        qy30 qy30Var = a instanceof qy30 ? (qy30) a : null;
        RecyclerView recyclerView = qy30Var != null ? qy30Var.S : null;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(selectedPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 verticalsView$lambda$0(MtCollapsedRoutesView mtCollapsedRoutesView, int i, ob31 ob31Var) {
        mtCollapsedRoutesView.targetSelectedPage = i;
        mtCollapsedRoutesView.binding.g.setCurrentItem(i, true);
        d dVar = mtCollapsedRoutesView.presenter;
        dVar.getClass();
        ob31 ob31Var2 = !ob31Var.c ? ob31Var : null;
        if (ob31Var2 != null) {
            dVar.Ng(ob31Var, VerticalSelectorAnalytics$SelectionChangeReason.Tap);
            dVar.J.a(HubOpenReason.TAP);
            ((vx30) dVar.x.a).r(new vsq(ob31Var2.a, 29));
        }
        return zy11.a;
    }

    public final void applyInsets(t1w insets) {
        GoLinearLayout goLinearLayout = this.binding.c;
        goLinearLayout.setPadding(goLinearLayout.getPaddingLeft(), goLinearLayout.getPaddingTop(), goLinearLayout.getPaddingRight(), this.bottomButtonContainerShadowPadding + insets.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.presenter;
        xe30 xe30Var = this.inner;
        dVar.Bg(xe30Var);
        dVar.E.d = true;
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$1(dVar, xe30Var, null), 3);
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$2(dVar, xe30Var, null), 3);
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$3(dVar, xe30Var, null), 3);
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$4(null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$5(null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$6(dVar, xe30Var, null), 3);
        tje.N(dVar.Jg(), null, null, new MtCollapsedRoutesPresenter$attachView$7(null, dVar), 3);
        ru.yandex.taxi.masstransit.promo.a aVar = this.communicationsDelegate;
        aVar.a.addOnLayoutChangeListener(aVar.i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.insetsCancellable.cancel();
        ru.yandex.taxi.masstransit.promo.a aVar = this.communicationsDelegate;
        aVar.a.removeOnLayoutChangeListener(aVar.i);
    }

    public final void onSlide(float slideOffset, float bottomContainerAlpha) {
        this.binding.d.setTranslationY(slideOffset);
        this.binding.d.setAlpha(bottomContainerAlpha);
        ru.yandex.taxi.masstransit.promo.a aVar = this.communicationsDelegate;
        NotificationState notificationState = aVar.e;
        ImageView imageView = aVar.b;
        f540 f540Var = aVar.d;
        if (notificationState == NotificationState.SHOWED) {
            float height = (1.0f - bottomContainerAlpha) * f540Var.b.getHeight();
            f540Var.b.setTranslationY(height);
            imageView.setTranslationY(height);
            return;
        }
        if (notificationState == NotificationState.HIDDEN) {
            f540Var.b.setTranslationY(0.0f);
            imageView.setTranslationY(0.0f);
        }
    }
}
