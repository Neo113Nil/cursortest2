package ru.yandex.taxi.masstransit.geopayment.checkout;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.zone.model.Zone;
import defpackage.aw6;
import defpackage.c2x0;
import defpackage.ciu0;
import defpackage.cma1;
import defpackage.d2x0;
import defpackage.d411;
import defpackage.dwh0;
import defpackage.e230;
import defpackage.f4a0;
import defpackage.f83;
import defpackage.fbz;
import defpackage.ft20;
import defpackage.g0c;
import defpackage.gvu0;
import defpackage.h2x0;
import defpackage.h4z0;
import defpackage.je30;
import defpackage.jl40;
import defpackage.jr30;
import defpackage.kyh0;
import defpackage.ld30;
import defpackage.lg21;
import defpackage.mg;
import defpackage.mg21;
import defpackage.miu0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.pj40;
import defpackage.pm5;
import defpackage.q47;
import defpackage.q8j0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.reh0;
import defpackage.s57;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sd30;
import defpackage.t1w;
import defpackage.td30;
import defpackage.tje;
import defpackage.tkb;
import defpackage.u0f0;
import defpackage.ud30;
import defpackage.uhx;
import defpackage.ukb;
import defpackage.uqh0;
import defpackage.vd30;
import defpackage.vkb;
import defpackage.vz01;
import defpackage.w130;
import defpackage.w511;
import defpackage.wi30;
import defpackage.wkb;
import defpackage.wye;
import defpackage.x211;
import defpackage.xd30;
import defpackage.xi30;
import defpackage.xkb;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yi30;
import defpackage.z0a0;
import defpackage.z530;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CounterComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutButtonActionType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J!\u0010)\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J'\u00101\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\u00162\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJC\u0010F\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010.\u001a\u00020-2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u0002082\b\u0010D\u001a\u0004\u0018\u0001082\b\u0010E\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bF\u0010GJ3\u0010H\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-2\u0006\u0010C\u001a\u0002082\b\u0010D\u001a\u0004\u0018\u0001082\b\u0010E\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0016H\u0002¢\u0006\u0004\bJ\u0010\u0018J;\u0010K\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010.\u001a\u00020-2\u0006\u0010C\u001a\u0002082\b\u0010D\u001a\u0004\u0018\u0001082\b\u0010E\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00162\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00162\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bQ\u0010PJ'\u0010S\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u00105\u001a\u00020\r2\u0006\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bS\u0010TJ3\u0010[\u001a\u00020\u00162\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010W\u001a\u0004\u0018\u00010U2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010XH\u0002¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b]\u0010^J;\u0010`\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-2\u0006\u0010C\u001a\u0002082\u0006\u0010_\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u0001082\b\u0010E\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0016H\u0002¢\u0006\u0004\bb\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/MtCheckoutModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxkb;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/masstransit/geopayment/checkout/t;", "presenter", "Lc2x0;", "systemBarsCoordinator", "Lz0a0;", "paymentIconLoader", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/masstransit/geopayment/checkout/t;Lc2x0;Lz0a0;)V", "", "isArrowsPermanentlyHidden", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxkb;", "Lzy11;", "onAttachedToWindow", "()V", "Le230;", "insetsType", "()Le230;", "onDetachedFromWindow", "Lt1w;", "insets", "applyInsets", "(Lt1w;)V", "Lvz01;", "busState", "renderCheckoutPaymentTransport", "(Lvz01;)V", "renderDirectionSelectorTransport", "Lciu0;", "stops", "counterIsHidden", "renderStops", "(Lciu0;Z)V", "Lwye;", "counterState", "Lld30;", "analyticsData", "Lq8j0;", "requestState", "renderCounter", "(Lwye;Lld30;Lq8j0;)V", "Lu0f0;", "paymentState", "isPaymentMethodsEnabled", "renderPrice", "(Lu0f0;ZLld30;)V", "", "discountTotalPriceAccessibilityLabel", "(Lu0f0;)Ljava/lang/String;", "hasDiscountPrice", "applyPriceLayoutEndPaddingForDiscount", "(Z)V", "Lf4a0;", "paymentMethod", "renderLoadingPaymentMethod", "(Lf4a0;)V", "isListPaymentMethodsLoading", "source", "cardsDescription", "noCardsDescription", "renderSuccessPaymentMethod", "(Lf4a0;Lld30;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "renderUndefinedInfoView", "(Lld30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "renderShimmeringInfoView", "renderPaymentInfoView", "(Lf4a0;Lld30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/yandex/taxi/masstransit/model/CheckoutUIState$PaymentCheckoutUIState;", ClidProvider.STATE, "renderSuccessCheckoutPaymentState", "(Lru/yandex/taxi/masstransit/model/CheckoutUIState$PaymentCheckoutUIState;)V", "applyMosmetroLinkCardFlowLoadingUi", "isInitialLoading", "renderLoadingState", "(Lf4a0;ZZ)V", "", "title", "subtitle", "Lq47;", "Lyi30;", "button", "renderErrorState", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lq47;)V", "onBackButtonClicked", "(Lld30;)V", "isPaymentMethodSelected", "openPaymentList", "(Lld30;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "setBusInfoAccessibility", "Lru/yandex/taxi/masstransit/geopayment/checkout/t;", "Lc2x0;", "Lz0a0;", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "titleShimmeringFrame", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "priceShimmeringFrame", "Lvkb;", "loadingStateBinding", "Lvkb;", "Lwkb;", "paymentCheckoutStateBinding", "Lwkb;", "Ltkb;", "directionSelectionStateBinding", "Ltkb;", "Lukb;", "errorStateBinding", "Lukb;", "Lx211;", "transportImageAndPlateViewHolder", "Lx211;", "directionSelectorTransportImageAndPlateViewHolder", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkClickMovementMethod", "Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "xd30", "yd30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtCheckoutModalView extends SlideableBindingModalView<xkb> {
    public static final int $stable = 8;
    private final FloatButtonIconComponent backButton;
    private final tkb directionSelectionStateBinding;
    private final x211 directionSelectorTransportImageAndPlateViewHolder;
    private final ukb errorStateBinding;
    private final LinkMovementMethod linkClickMovementMethod;
    private final vkb loadingStateBinding;
    private final wkb paymentCheckoutStateBinding;
    private final z0a0 paymentIconLoader;
    private final t presenter;
    private final ShimmeringFrameLayout priceShimmeringFrame;
    private final c2x0 systemBarsCoordinator;
    private final ShimmeringFrameLayout titleShimmeringFrame;
    private final x211 transportImageAndPlateViewHolder;

    public MtCheckoutModalView(Context context, t tVar, c2x0 c2x0Var, z0a0 z0a0Var) {
        super(context);
        View O;
        View O2;
        this.presenter = tVar;
        this.systemBarsCoordinator = c2x0Var;
        this.paymentIconLoader = z0a0Var;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ShimmeringFrameLayout shimmeringFrameLayout = new ShimmeringFrameLayout(context, null, 0, 6, defaultConstructorMarker);
        shimmeringFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(tje.u(HProv.PP_CONTAINER_EXTENSION_DEL, getContext()), tje.u(17, getContext())));
        xw31.F(shimmeringFrameLayout, Integer.valueOf(tje.u(16, getContext())), null, null, null);
        shimmeringFrameLayout.setShimmeringCornerRadius(tje.w(100, getContext()));
        shimmeringFrameLayout.setColors(qje.t(xng0.bgMain, getContext()), qje.t(xng0.controlMinor, getContext()));
        this.titleShimmeringFrame = shimmeringFrameLayout;
        ShimmeringFrameLayout shimmeringFrameLayout2 = new ShimmeringFrameLayout(context, null, 0, 6, defaultConstructorMarker);
        shimmeringFrameLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(tje.u(61, getContext()), tje.u(20, getContext())));
        shimmeringFrameLayout2.setShimmeringCornerRadius(tje.w(100, getContext()));
        shimmeringFrameLayout2.setColors(qje.t(xng0.bgMain, getContext()), qje.t(xng0.controlMinor, getContext()));
        this.priceShimmeringFrame = shimmeringFrameLayout2;
        GoLinearLayout goLinearLayout = getBinding().a;
        int i = reh0.first_placeholder;
        if (((PlaceholderView) cma1.O(i, goLinearLayout)) != null) {
            i = reh0.initial_loading_additional_bottom_spacer;
            if (((Space) cma1.O(i, goLinearLayout)) != null) {
                i = reh0.loading_bottom_spacer;
                if (((Space) cma1.O(i, goLinearLayout)) != null) {
                    i = reh0.loading_payment_icon_container;
                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, goLinearLayout);
                    if (goFrameLayout != null) {
                        i = reh0.loading_payment_info_view;
                        CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) cma1.O(i, goLinearLayout);
                        if (compositePaymentIconsView != null) {
                            i = reh0.loading_state_container;
                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, goLinearLayout);
                            if (goLinearLayout2 != null) {
                                i = reh0.loading_undefined_card_view;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, goLinearLayout);
                                if (appCompatImageView != null) {
                                    i = reh0.second_placeholder;
                                    if (((PlaceholderView) cma1.O(i, goLinearLayout)) != null) {
                                        i = reh0.shimmering_button;
                                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, goLinearLayout);
                                        if (buttonComponent != null) {
                                            i = reh0.third_placeholder;
                                            if (((PlaceholderView) cma1.O(i, goLinearLayout)) != null) {
                                                this.loadingStateBinding = new vkb(goLinearLayout, goFrameLayout, compositePaymentIconsView, goLinearLayout2, appCompatImageView, buttonComponent);
                                                GoLinearLayout goLinearLayout3 = getBinding().a;
                                                int i2 = reh0.ble_divider;
                                                View O3 = cma1.O(i2, goLinearLayout3);
                                                if (O3 != null) {
                                                    i2 = reh0.bottom_payment_container;
                                                    if (((GoConstraintLayout) cma1.O(i2, goLinearLayout3)) != null) {
                                                        i2 = reh0.bus_container;
                                                        GoLinearLayout goLinearLayout4 = (GoLinearLayout) cma1.O(i2, goLinearLayout3);
                                                        if (goLinearLayout4 != null) {
                                                            i2 = reh0.bus_title;
                                                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, goLinearLayout3);
                                                            if (listItemComponent != null) {
                                                                i2 = reh0.card_placeholder;
                                                                PlaceholderView placeholderView = (PlaceholderView) cma1.O(i2, goLinearLayout3);
                                                                if (placeholderView != null) {
                                                                    i2 = reh0.counter_container;
                                                                    GoLinearLayout goLinearLayout5 = (GoLinearLayout) cma1.O(i2, goLinearLayout3);
                                                                    if (goLinearLayout5 != null) {
                                                                        i2 = reh0.destination_item;
                                                                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i2, goLinearLayout3);
                                                                        if (listItemComponent2 != null) {
                                                                            i2 = reh0.pay_button;
                                                                            ButtonsView buttonsView = (ButtonsView) cma1.O(i2, goLinearLayout3);
                                                                            if (buttonsView != null) {
                                                                                i2 = reh0.payment_container;
                                                                                GoLinearLayout goLinearLayout6 = (GoLinearLayout) cma1.O(i2, goLinearLayout3);
                                                                                if (goLinearLayout6 != null) {
                                                                                    i2 = reh0.payment_icon_container;
                                                                                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i2, goLinearLayout3);
                                                                                    if (goFrameLayout2 != null) {
                                                                                        i2 = reh0.payment_info_view;
                                                                                        CompositePaymentIconsView compositePaymentIconsView2 = (CompositePaymentIconsView) cma1.O(i2, goLinearLayout3);
                                                                                        if (compositePaymentIconsView2 != null) {
                                                                                            i2 = reh0.price_layout;
                                                                                            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i2, goLinearLayout3);
                                                                                            if (goConstraintLayout != null) {
                                                                                                i2 = reh0.starting_item;
                                                                                                ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i2, goLinearLayout3);
                                                                                                if (listItemComponent3 != null && (O = cma1.O((i2 = reh0.stops_divider), goLinearLayout3)) != null) {
                                                                                                    i2 = reh0.success_state_container;
                                                                                                    GoLinearLayout goLinearLayout7 = (GoLinearLayout) cma1.O(i2, goLinearLayout3);
                                                                                                    if (goLinearLayout7 != null) {
                                                                                                        i2 = reh0.tickets_counter;
                                                                                                        CounterComponent counterComponent = (CounterComponent) cma1.O(i2, goLinearLayout3);
                                                                                                        if (counterComponent != null) {
                                                                                                            i2 = reh0.tickets_title;
                                                                                                            ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i2, goLinearLayout3);
                                                                                                            if (listItemComponent4 != null) {
                                                                                                                i2 = reh0.total_price;
                                                                                                                ListItemComponent listItemComponent5 = (ListItemComponent) cma1.O(i2, goLinearLayout3);
                                                                                                                if (listItemComponent5 != null) {
                                                                                                                    i2 = reh0.total_price_discount;
                                                                                                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, goLinearLayout3);
                                                                                                                    if (robotoTextView != null) {
                                                                                                                        i2 = reh0.total_price_discount_accessibility_group;
                                                                                                                        GoLinearLayout goLinearLayout8 = (GoLinearLayout) cma1.O(i2, goLinearLayout3);
                                                                                                                        if (goLinearLayout8 != null) {
                                                                                                                            i2 = reh0.total_price_original;
                                                                                                                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, goLinearLayout3);
                                                                                                                            if (robotoTextView2 != null) {
                                                                                                                                i2 = reh0.total_price_original_container;
                                                                                                                                GoConstraintLayout goConstraintLayout2 = (GoConstraintLayout) cma1.O(i2, goLinearLayout3);
                                                                                                                                if (goConstraintLayout2 != null && (O2 = cma1.O((i2 = reh0.total_price_original_strikethrough), goLinearLayout3)) != null) {
                                                                                                                                    i2 = reh0.total_price_row;
                                                                                                                                    if (((GoLinearLayout) cma1.O(i2, goLinearLayout3)) != null) {
                                                                                                                                        i2 = reh0.total_title;
                                                                                                                                        ListItemComponent listItemComponent6 = (ListItemComponent) cma1.O(i2, goLinearLayout3);
                                                                                                                                        if (listItemComponent6 != null) {
                                                                                                                                            i2 = reh0.undefined_card_view;
                                                                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, goLinearLayout3);
                                                                                                                                            if (appCompatImageView2 != null) {
                                                                                                                                                i2 = reh0.user_agreement;
                                                                                                                                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, goLinearLayout3);
                                                                                                                                                if (robotoTextView3 != null) {
                                                                                                                                                    this.paymentCheckoutStateBinding = new wkb(goLinearLayout3, O3, goLinearLayout4, listItemComponent, placeholderView, goLinearLayout5, listItemComponent2, buttonsView, goLinearLayout6, goFrameLayout2, compositePaymentIconsView2, goConstraintLayout, listItemComponent3, O, goLinearLayout7, counterComponent, listItemComponent4, listItemComponent5, robotoTextView, goLinearLayout8, robotoTextView2, goConstraintLayout2, O2, listItemComponent6, appCompatImageView2, robotoTextView3);
                                                                                                                                                    GoLinearLayout goLinearLayout9 = getBinding().a;
                                                                                                                                                    int i3 = reh0.direction_bus_title;
                                                                                                                                                    ListItemComponent listItemComponent7 = (ListItemComponent) cma1.O(i3, goLinearLayout9);
                                                                                                                                                    if (listItemComponent7 != null) {
                                                                                                                                                        i3 = reh0.direction_selection_state_container;
                                                                                                                                                        GoLinearLayout goLinearLayout10 = (GoLinearLayout) cma1.O(i3, goLinearLayout9);
                                                                                                                                                        if (goLinearLayout10 != null) {
                                                                                                                                                            i3 = reh0.first_direction;
                                                                                                                                                            ListItemComponent listItemComponent8 = (ListItemComponent) cma1.O(i3, goLinearLayout9);
                                                                                                                                                            if (listItemComponent8 != null) {
                                                                                                                                                                i3 = reh0.second_direction;
                                                                                                                                                                ListItemComponent listItemComponent9 = (ListItemComponent) cma1.O(i3, goLinearLayout9);
                                                                                                                                                                if (listItemComponent9 != null) {
                                                                                                                                                                    i3 = reh0.title;
                                                                                                                                                                    RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i3, goLinearLayout9);
                                                                                                                                                                    if (robotoTextView4 != null) {
                                                                                                                                                                        this.directionSelectionStateBinding = new tkb(goLinearLayout9, listItemComponent7, goLinearLayout10, listItemComponent8, listItemComponent9, robotoTextView4);
                                                                                                                                                                        GoLinearLayout goLinearLayout11 = getBinding().a;
                                                                                                                                                                        int i4 = reh0.error_state_container;
                                                                                                                                                                        GoLinearLayout goLinearLayout12 = (GoLinearLayout) cma1.O(i4, goLinearLayout11);
                                                                                                                                                                        if (goLinearLayout12 != null) {
                                                                                                                                                                            i4 = reh0.retry_button;
                                                                                                                                                                            ButtonsView buttonsView2 = (ButtonsView) cma1.O(i4, goLinearLayout11);
                                                                                                                                                                            if (buttonsView2 != null) {
                                                                                                                                                                                i4 = reh0.subtitle;
                                                                                                                                                                                RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i4, goLinearLayout11);
                                                                                                                                                                                if (robotoTextView5 != null) {
                                                                                                                                                                                    i4 = reh0.title;
                                                                                                                                                                                    RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i4, goLinearLayout11);
                                                                                                                                                                                    if (robotoTextView6 != null) {
                                                                                                                                                                                        this.errorStateBinding = new ukb(goLinearLayout11, goLinearLayout12, buttonsView2, robotoTextView5, robotoTextView6);
                                                                                                                                                                                        this.transportImageAndPlateViewHolder = new x211(context, listItemComponent);
                                                                                                                                                                                        this.directionSelectorTransportImageAndPlateViewHolder = new x211(context, listItemComponent7);
                                                                                                                                                                                        this.backButton = qdb1.b(this, new fbz(29, this));
                                                                                                                                                                                        getBottomSheetBehavior().W = false;
                                                                                                                                                                                        getBottomSheetBehavior().Z = false;
                                                                                                                                                                                        this.linkClickMovementMethod = new LinkMovementMethod(new uhx(19, this));
                                                                                                                                                                                        return;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        ny61.t("Missing required view with ID: ".concat(goLinearLayout11.getResources().getResourceName(i4)));
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    ny61.t("Missing required view with ID: ".concat(goLinearLayout9.getResources().getResourceName(i3)));
                                                                                                                                                    throw null;
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
                                                }
                                                ny61.t("Missing required view with ID: ".concat(goLinearLayout3.getResources().getResourceName(i2)));
                                                throw null;
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
        ny61.t("Missing required view with ID: ".concat(goLinearLayout.getResources().getResourceName(i)));
        throw null;
    }

    private final void applyInsets(t1w insets) {
        sb2.L(this.errorStateBinding.b, 0, 0, 0, insets.d, 7);
        GoLinearLayout goLinearLayout = this.loadingStateBinding.d;
        int i = insets.d;
        sb2.L(goLinearLayout, 0, 0, 0, i, 7);
        sb2.L(this.directionSelectionStateBinding.c, 0, 0, 0, i, 7);
    }

    private final void applyMosmetroLinkCardFlowLoadingUi(CheckoutUIState$PaymentCheckoutUIState state) {
        if (state.q) {
            renderShimmeringInfoView();
        }
        ButtonsView buttonsView = this.paymentCheckoutStateBinding.h;
        buttonsView.setEnabled(false);
        buttonsView.setAlpha(0.6f);
    }

    private final void applyPriceLayoutEndPaddingForDiscount(boolean hasDiscountPrice) {
        wkb wkbVar = this.paymentCheckoutStateBinding;
        int dimensionPixelSize = hasDiscountPrice ? getResources().getDimensionPixelSize(mrg0.go_design_m_space) : 0;
        GoConstraintLayout goConstraintLayout = wkbVar.l;
        int paddingStart = goConstraintLayout.getPaddingStart();
        int paddingTop = goConstraintLayout.getPaddingTop();
        int paddingBottom = goConstraintLayout.getPaddingBottom();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        goConstraintLayout.setPaddingRelative(paddingStart, paddingTop, dimensionPixelSize, paddingBottom);
    }

    private final String discountTotalPriceAccessibilityLabel(u0f0 paymentState) {
        CharSequence charSequence = paymentState.c;
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        CharSequence charSequence2 = paymentState.b;
        String obj2 = charSequence2 != null ? charSequence2.toString() : null;
        String str = obj2 != null ? obj2 : "";
        return str.length() != 0 ? ru.yandex.taxi.design.utils.c.H(this, kyh0.masstransit_bus_checkout_price_with_discount, obj, str) : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(MtCheckoutModalView mtCheckoutModalView, t1w t1wVar) {
        mtCheckoutModalView.applyInsets(t1wVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean linkClickMovementMethod$lambda$0(MtCheckoutModalView mtCheckoutModalView, ClickableSpan clickableSpan) {
        if (!(clickableSpan instanceof URLSpan)) {
            return false;
        }
        t tVar = mtCheckoutModalView.presenter;
        ((mg21) ((lg21) ((je30) tVar.B.b).L.get())).c(((URLSpan) clickableSpan).getURL());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$0(MtCheckoutModalView mtCheckoutModalView, yi30 yi30Var) {
        if (yi30Var instanceof wi30) {
            wi30 wi30Var = (wi30) yi30Var;
            t.Og(mtCheckoutModalView.presenter, wi30Var.a, wi30Var.b, wi30Var.c, wi30Var.d, 16);
        } else if (!(yi30Var instanceof xi30)) {
            w511.b();
        } else {
            xi30 xi30Var = (xi30) yi30Var;
            mtCheckoutModalView.presenter.Lg(xi30Var.a, xi30Var.b, xi30Var.c, xi30Var.d, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackButtonClicked(ld30 analyticsData) {
        t tVar = this.presenter;
        tVar.getClass();
        tVar.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.Back, analyticsData);
        onBackPressed();
    }

    public static void onBackButtonClicked$default(MtCheckoutModalView mtCheckoutModalView, ld30 ld30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ld30 ld30Var2 = ld30.h;
            ld30Var = ld30.h;
        }
        mtCheckoutModalView.onBackButtonClicked(ld30Var);
    }

    private final void openPaymentList(ld30 analyticsData, String source, boolean isPaymentMethodSelected, String cardsDescription, String noCardsDescription) {
        this.presenter.Mg(source, cardsDescription, noCardsDescription, isPaymentMethodSelected);
        t tVar = this.presenter;
        tVar.getClass();
        tVar.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.PaymentMethod, analyticsData);
    }

    private final void renderCheckoutPaymentTransport(vz01 busState) {
        this.paymentCheckoutStateBinding.d.setTitle(busState.c);
        this.paymentCheckoutStateBinding.d.setSubtitle(busState.d);
        aw6 aw6Var = busState.e;
        String str = aw6Var.b;
        this.transportImageAndPlateViewHolder.Ug(aw6Var.a, str.length() >= 6 ? gvu0.A0(6, str) : "");
    }

    private final void renderCounter(wye counterState, ld30 analyticsData, q8j0 requestState) {
        wkb wkbVar = this.paymentCheckoutStateBinding;
        GoLinearLayout goLinearLayout = wkbVar.f;
        CounterComponent counterComponent = wkbVar.p;
        CharSequence charSequence = counterState.a;
        int i = counterState.b;
        goLinearLayout.setVisibility(charSequence != null ? 0 : 8);
        wkbVar.q.setTitle(charSequence);
        counterComponent.setValue(i);
        counterComponent.setDisableIfNoOption(false);
        boolean z = counterState.f;
        GoLinearLayout goLinearLayout2 = wkbVar.f;
        if (z) {
            goLinearLayout2.setVisibility(8);
        } else {
            goLinearLayout2.setVisibility(0);
        }
        if (counterState.e) {
            counterComponent.setMinMaxValues(1, counterState.d);
        } else {
            counterComponent.setMinMaxValues(i, i);
        }
        int i2 = kyh0.counter_component_plus_content_description;
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        counterComponent.setPlusButtonContentDescription(ru.yandex.taxi.design.utils.c.H(this, i2, obj));
        int i3 = kyh0.counter_component_minus_content_description;
        String obj2 = charSequence != null ? charSequence.toString() : null;
        counterComponent.setMinusButtonContentDescription(ru.yandex.taxi.design.utils.c.H(this, i3, obj2 != null ? obj2 : ""));
        counterComponent.setValueContentDescription(dwh0.tickets);
        counterComponent.invalidateComponent();
        counterComponent.setValueChangedListener(new f83(this, counterState, requestState, analyticsData, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderCounter$lambda$0$0(MtCheckoutModalView mtCheckoutModalView, wye wyeVar, q8j0 q8j0Var, ld30 ld30Var, int i) {
        Object value;
        t tVar = mtCheckoutModalView.presenter;
        String str = wyeVar.g;
        String str2 = wyeVar.h;
        k kVar = tVar.G;
        int a = kVar.a();
        h4z0 h4z0Var = new h4z0(i, q8j0Var);
        r0 r0Var = ((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) kVar.b).c;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, h4z0Var));
        if (str == null && (str2 == null || str2.length() == 0)) {
            return;
        }
        if (i > a) {
            tVar.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.AddTicket, ld30Var);
        } else {
            tVar.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.RemoveTicket, ld30Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderDirectionSelectorTransport(vz01 busState) {
        this.directionSelectionStateBinding.b.setTitle(busState.c);
        this.directionSelectionStateBinding.b.setSubtitle(busState.d);
        aw6 aw6Var = busState.e;
        String str = aw6Var.b;
        this.directionSelectorTransportImageAndPlateViewHolder.Ug(aw6Var.a, str.length() >= 6 ? gvu0.A0(6, str) : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderErrorState(CharSequence title, CharSequence subtitle, q47 button) {
        this.directionSelectionStateBinding.c.setVisibility(8);
        this.paymentCheckoutStateBinding.o.setVisibility(8);
        vkb vkbVar = this.loadingStateBinding;
        vkbVar.f.finishProgress();
        vkbVar.d.setVisibility(8);
        ukb ukbVar = this.errorStateBinding;
        ukbVar.b.setVisibility(0);
        this.errorStateBinding.e.setText(title);
        this.errorStateBinding.d.setText(subtitle);
        ButtonsView buttonsView = ukbVar.c;
        buttonsView.setVisibility(button != null ? 0 : 8);
        if (button != null) {
            ((pm5) buttonsView.buttonsContract()).d(button);
        }
    }

    private final void renderLoadingPaymentMethod(f4a0 paymentMethod) {
        this.loadingStateBinding.b.setVisibility(0);
        boolean a = paymentMethod.a();
        vkb vkbVar = this.loadingStateBinding;
        if (a) {
            vkbVar.c.setVisibility(8);
            this.loadingStateBinding.e.setVisibility(0);
            this.loadingStateBinding.e.setAlpha(0.5f);
            ru.yandex.taxi.design.utils.c.z(new z530(6), this);
            return;
        }
        vkbVar.e.setVisibility(8);
        CompositePaymentIconsView compositePaymentIconsView = this.loadingStateBinding.c;
        ru.yandex.taxi.design.utils.c.z(new z530(7), compositePaymentIconsView);
        compositePaymentIconsView.setAlpha(0.5f);
        compositePaymentIconsView.setEnabled(false);
        compositePaymentIconsView.setVisibility(0);
        compositePaymentIconsView.setTitleVisible(true);
        CompositePaymentIconsView.update$default(compositePaymentIconsView, paymentMethod.a, this.paymentIconLoader, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderLoadingState(f4a0 paymentMethod, boolean isPaymentMethodsEnabled, boolean isInitialLoading) {
        this.directionSelectionStateBinding.c.setVisibility(8);
        this.paymentCheckoutStateBinding.o.setVisibility(8);
        this.errorStateBinding.b.setVisibility(8);
        vkb vkbVar = this.loadingStateBinding;
        vkbVar.d.setVisibility(0);
        ButtonComponent buttonComponent = vkbVar.f;
        if (isInitialLoading) {
            buttonComponent.setVisibility(4);
            buttonComponent.finishProgress();
            return;
        }
        buttonComponent.setVisibility(0);
        buttonComponent.startProgress();
        if (isPaymentMethodsEnabled) {
            renderLoadingPaymentMethod(paymentMethod);
        }
    }

    private final void renderPaymentInfoView(f4a0 paymentMethod, ld30 analyticsData, String source, String cardsDescription, String noCardsDescription) {
        this.paymentCheckoutStateBinding.y.setVisibility(8);
        this.paymentCheckoutStateBinding.e.setVisibility(8);
        this.paymentCheckoutStateBinding.e.setShimmering(false);
        CompositePaymentIconsView compositePaymentIconsView = this.paymentCheckoutStateBinding.k;
        ru.yandex.taxi.design.utils.c.z(new vd30(this, analyticsData, source, cardsDescription, noCardsDescription, 0), compositePaymentIconsView);
        compositePaymentIconsView.setAlpha(1.0f);
        compositePaymentIconsView.setEnabled(true);
        compositePaymentIconsView.setVisibility(0);
        compositePaymentIconsView.setTitleVisible(true);
        CompositePaymentIconsView.update$default(compositePaymentIconsView, paymentMethod.a, this.paymentIconLoader, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderPaymentInfoView$lambda$0$0(MtCheckoutModalView mtCheckoutModalView, ld30 ld30Var, String str, String str2, String str3) {
        mtCheckoutModalView.openPaymentList(ld30Var, str, true, str2, str3);
        return zy11.a;
    }

    private final void renderPrice(u0f0 paymentState, boolean isPaymentMethodsEnabled, ld30 analyticsData) {
        wkb wkbVar = this.paymentCheckoutStateBinding;
        boolean z = paymentState.f;
        CharSequence charSequence = paymentState.c;
        CharSequence charSequence2 = paymentState.b;
        int i = 1;
        if (z) {
            ListItemComponent listItemComponent = wkbVar.x;
            GoLinearLayout goLinearLayout = wkbVar.t;
            ListItemComponent listItemComponent2 = wkbVar.r;
            listItemComponent.setTitle((CharSequence) null);
            wkbVar.x.setLeadView(this.titleShimmeringFrame);
            goLinearLayout.setVisibility(8);
            goLinearLayout.setContentDescription(null);
            wkbVar.s.setVisibility(8);
            wkbVar.v.setVisibility(8);
            wkbVar.w.setVisibility(8);
            listItemComponent2.setVisibility(0);
            listItemComponent2.setTitle((CharSequence) null);
            listItemComponent2.setLeadView(this.priceShimmeringFrame);
            applyPriceLayoutEndPaddingForDiscount(false);
            if (isPaymentMethodsEnabled) {
                renderLoadingPaymentMethod(paymentState.e);
            }
        } else {
            if (charSequence2 == null && charSequence == null) {
                GoConstraintLayout goConstraintLayout = wkbVar.l;
                GoLinearLayout goLinearLayout2 = wkbVar.t;
                goConstraintLayout.setVisibility(8);
                goLinearLayout2.setVisibility(8);
                goLinearLayout2.setContentDescription(null);
                applyPriceLayoutEndPaddingForDiscount(false);
            } else {
                GoConstraintLayout goConstraintLayout2 = wkbVar.l;
                View view = wkbVar.w;
                GoConstraintLayout goConstraintLayout3 = wkbVar.v;
                ListItemComponent listItemComponent3 = wkbVar.x;
                RobotoTextView robotoTextView = wkbVar.s;
                GoLinearLayout goLinearLayout3 = wkbVar.t;
                ListItemComponent listItemComponent4 = wkbVar.r;
                goConstraintLayout2.setVisibility(0);
                listItemComponent3.setTitle(paymentState.a);
                listItemComponent3.clearLeadView();
                if (charSequence != null) {
                    listItemComponent4.setVisibility(8);
                    listItemComponent4.clearLeadView();
                    listItemComponent4.setTitle((CharSequence) null);
                    goLinearLayout3.setVisibility(0);
                    robotoTextView.setVisibility(0);
                    boolean z2 = charSequence2 != null;
                    goConstraintLayout3.setVisibility(z2 ? 0 : 8);
                    view.setVisibility(z2 ? 0 : 8);
                    robotoTextView.setText(charSequence);
                    RobotoTextView robotoTextView2 = wkbVar.u;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    robotoTextView2.setText(charSequence2);
                    goLinearLayout3.setContentDescription(discountTotalPriceAccessibilityLabel(paymentState));
                    applyPriceLayoutEndPaddingForDiscount(true);
                } else {
                    goLinearLayout3.setVisibility(8);
                    goLinearLayout3.setContentDescription(null);
                    robotoTextView.setVisibility(8);
                    goConstraintLayout3.setVisibility(8);
                    view.setVisibility(8);
                    listItemComponent4.setVisibility(0);
                    listItemComponent4.setTitle(charSequence2);
                    listItemComponent4.clearLeadView();
                    applyPriceLayoutEndPaddingForDiscount(false);
                }
            }
            if (isPaymentMethodsEnabled) {
                renderSuccessPaymentMethod(paymentState.e, analyticsData, paymentState.g, paymentState.h, paymentState.j, paymentState.i);
            }
        }
        ((pm5) wkbVar.h.buttonsContract()).d(paymentState.d);
        ((pm5) wkbVar.h.buttonsContract()).f(new td30(this, analyticsData, i, paymentState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderPrice$lambda$0$0(MtCheckoutModalView mtCheckoutModalView, u0f0 u0f0Var, ld30 ld30Var, jr30 jr30Var) {
        mtCheckoutModalView.presenter.Lg(jr30Var, u0f0Var.h, u0f0Var.j, u0f0Var.i, ld30Var.f);
        t tVar = mtCheckoutModalView.presenter;
        tVar.getClass();
        tVar.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.GoToPayment, ld30Var);
    }

    private final void renderShimmeringInfoView() {
        this.paymentCheckoutStateBinding.k.setVisibility(8);
        this.paymentCheckoutStateBinding.y.setVisibility(8);
        this.paymentCheckoutStateBinding.e.setVisibility(0);
        this.paymentCheckoutStateBinding.e.updateColors(qje.t(xng0.bgMinor, getContext()), qje.t(xng0.bgFloating, getContext()));
        this.paymentCheckoutStateBinding.e.setShimmering(true);
    }

    private final void renderStops(ciu0 stops, boolean counterIsHidden) {
        wkb wkbVar = this.paymentCheckoutStateBinding;
        int i = stops == null ? 8 : 0;
        ListItemComponent listItemComponent = wkbVar.m;
        ListItemComponent listItemComponent2 = wkbVar.g;
        listItemComponent.setVisibility(i);
        listItemComponent2.setVisibility(i);
        wkbVar.n.setVisibility((stops == null || counterIsHidden) ? 8 : 0);
        if (stops != null) {
            miu0 miu0Var = stops.b;
            miu0 miu0Var2 = stops.a;
            ListItemComponent listItemComponent3 = wkbVar.m;
            listItemComponent3.setLeadImage(miu0Var2 != null ? miu0Var2.a : null);
            listItemComponent3.setTitle(miu0Var2 != null ? miu0Var2.b : null);
            listItemComponent3.setSubtitle(miu0Var2 != null ? miu0Var2.c : null);
            listItemComponent2.setAlpha(stops.c ? 1.0f : 0.5f);
            listItemComponent2.setLeadImage(miu0Var != null ? miu0Var.a : null);
            listItemComponent2.setTitle(miu0Var != null ? miu0Var.b : null);
            listItemComponent2.setSubtitle(miu0Var != null ? miu0Var.c : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void renderSuccessCheckoutPaymentState(CheckoutUIState$PaymentCheckoutUIState state) {
        miu0 miu0Var;
        this.directionSelectionStateBinding.c.setVisibility(8);
        this.errorStateBinding.b.setVisibility(8);
        vkb vkbVar = this.loadingStateBinding;
        vkbVar.f.finishProgress();
        vkbVar.d.setVisibility(8);
        ButtonsView buttonsView = this.paymentCheckoutStateBinding.h;
        buttonsView.setEnabled(true);
        buttonsView.setAlpha(1.0f);
        ciu0 ciu0Var = state.g;
        CharSequence charSequence = state.n;
        vz01 vz01Var = state.c;
        wye wyeVar = state.d;
        String valueOf = String.valueOf((ciu0Var == null || (miu0Var = ciu0Var.b) == null) ? null : miu0Var.c);
        String str = vz01Var.a;
        if (str == null) {
            str = "";
        }
        ld30 ld30Var = new ld30(state.k, valueOf, str, state.m, state.q, state.a, state.b);
        int i = 0;
        this.backButton.setDebounceClickListener(new sd30(i, this, ld30Var));
        wkb wkbVar = this.paymentCheckoutStateBinding;
        GoLinearLayout goLinearLayout = wkbVar.o;
        ListItemComponent listItemComponent = wkbVar.m;
        RobotoTextView robotoTextView = wkbVar.z;
        goLinearLayout.setVisibility(0);
        ((pm5) wkbVar.h.buttonsContract()).f(new td30(this, ld30Var, i, state));
        if (ciu0Var != null && ciu0Var.d && ciu0Var.c) {
            listItemComponent.setTrailMode(2);
        } else {
            listItemComponent.setTrailMode(0);
        }
        listItemComponent.setDebounceClickListener(new sd30(state, this));
        wkbVar.g.setDebounceClickListener(new ud30(i, state, this, ld30Var));
        robotoTextView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        robotoTextView.setText(charSequence);
        robotoTextView.setLinksClickable(true);
        robotoTextView.setMovementMethod(this.linkClickMovementMethod);
        renderCheckoutPaymentTransport(vz01Var);
        renderStops(ciu0Var, wyeVar.f);
        renderCounter(wyeVar, ld30Var, state.p);
        renderPrice(state.e, state.q, ld30Var);
        if ((ciu0Var != null ? ciu0Var.a : null) == null) {
            if ((ciu0Var != null ? ciu0Var.b : null) == null && wyeVar.f) {
                this.paymentCheckoutStateBinding.b.setVisibility(8);
                if (state.t) {
                    return;
                }
                applyMosmetroLinkCardFlowLoadingUi(state);
                return;
            }
        }
        this.paymentCheckoutStateBinding.b.setVisibility(0);
        if (state.t) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSuccessCheckoutPaymentState$lambda$3$0(MtCheckoutModalView mtCheckoutModalView, CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState, ld30 ld30Var, jr30 jr30Var) {
        t tVar = mtCheckoutModalView.presenter;
        u0f0 u0f0Var = checkoutUIState$PaymentCheckoutUIState.e;
        tVar.Lg(jr30Var, u0f0Var.h, u0f0Var.j, u0f0Var.i, checkoutUIState$PaymentCheckoutUIState.a);
        t tVar2 = mtCheckoutModalView.presenter;
        tVar2.getClass();
        tVar2.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.GoToPayment, ld30Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSuccessCheckoutPaymentState$lambda$3$1(CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState, MtCheckoutModalView mtCheckoutModalView) {
        ciu0 ciu0Var = checkoutUIState$PaymentCheckoutUIState.g;
        if (ciu0Var != null && ciu0Var.c && ciu0Var.d) {
            mtCheckoutModalView.presenter.Ng(checkoutUIState$PaymentCheckoutUIState.p.b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSuccessCheckoutPaymentState$lambda$3$2(CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState, MtCheckoutModalView mtCheckoutModalView, ld30 ld30Var) {
        ciu0 ciu0Var = checkoutUIState$PaymentCheckoutUIState.g;
        if (ciu0Var == null || !ciu0Var.c) {
            return;
        }
        t tVar = mtCheckoutModalView.presenter;
        q8j0 q8j0Var = checkoutUIState$PaymentCheckoutUIState.p;
        String str = q8j0Var.b;
        String str2 = checkoutUIState$PaymentCheckoutUIState.f;
        if (str2 == null) {
            str2 = q8j0Var.d;
        }
        tVar.Ng(str, str2);
        t tVar2 = mtCheckoutModalView.presenter;
        tVar2.getClass();
        tVar2.Kg(TransportPaymentAnalytics$CheckoutButtonActionType.FinalStop, ld30Var);
    }

    private final void renderSuccessPaymentMethod(f4a0 paymentMethod, ld30 analyticsData, boolean isListPaymentMethodsLoading, String source, String cardsDescription, String noCardsDescription) {
        this.paymentCheckoutStateBinding.j.setVisibility(0);
        if (isListPaymentMethodsLoading) {
            renderShimmeringInfoView();
        } else if (paymentMethod.a()) {
            renderUndefinedInfoView(analyticsData, source, cardsDescription, noCardsDescription);
        } else {
            renderPaymentInfoView(paymentMethod, analyticsData, source, cardsDescription, noCardsDescription);
        }
    }

    private final void renderUndefinedInfoView(ld30 analyticsData, String source, String cardsDescription, String noCardsDescription) {
        this.paymentCheckoutStateBinding.k.setVisibility(8);
        this.paymentCheckoutStateBinding.e.setVisibility(8);
        this.paymentCheckoutStateBinding.e.setShimmering(false);
        AppCompatImageView appCompatImageView = this.paymentCheckoutStateBinding.y;
        appCompatImageView.setVisibility(0);
        ru.yandex.taxi.design.utils.c.z(new vd30(this, analyticsData, source, cardsDescription, noCardsDescription, 1), appCompatImageView);
        appCompatImageView.setEnabled(true);
        appCompatImageView.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderUndefinedInfoView$lambda$0$0(MtCheckoutModalView mtCheckoutModalView, ld30 ld30Var, String str, String str2, String str3) {
        mtCheckoutModalView.openPaymentList(ld30Var, str, false, str2, str3);
        return zy11.a;
    }

    private final void setBusInfoAccessibility() {
        androidx.core.view.b.p(this.paymentCheckoutStateBinding.c, new mg(22, this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xkb bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uqh0.checkout_modal_view, parent, false);
        if (inflate != null) {
            return new xkb((GoLinearLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new ft20(11, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        Zone zone;
        super.onAttachedToWindow();
        t tVar = this.presenter;
        xd30 xd30Var = new xd30(this);
        tVar.Bg(xd30Var);
        d411 d411Var = tVar.K;
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = tVar.C;
        ZoneAddress n = tVar.O.n();
        if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
            str = "";
        }
        pj40 pj40Var = tVar.A;
        String str2 = pj40Var.a;
        String str3 = pj40Var.b;
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", transportPaymentAnalytics$CheckoutScreenOpenReason.getEventValue());
        hashMap.put("zone_name", str);
        if (str2 != null) {
            hashMap.put("utm_source", str2);
        }
        if (str3 != null) {
            hashMap.put("utm_medium", str3);
        }
        d411Var.a.a("TransportPayment.Checkout.Shown", hashMap, 6, new HashMap());
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$1(null, tVar), 3);
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$2(null, tVar), 3);
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$3(null, tVar), 3);
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$4(tVar, xd30Var, null), 3);
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$5(null, tVar), 3);
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$6(tVar, xd30Var, null), 3);
        tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$7(null, tVar), 3);
        t.Og(tVar, null, null, null, tVar.z, 23);
        ((d2x0) this.systemBarsCoordinator).b.d(qoi0.a(MtCheckoutModalView.class), false, null);
        setBusInfoAccessibility();
        ((pm5) this.errorStateBinding.c.buttonsContract()).f(new s57(4, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object value;
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.presenter.Cg();
        c2x0 c2x0Var = this.systemBarsCoordinator;
        g0c a = qoi0.a(MtCheckoutModalView.class);
        r0 r0Var = ((d2x0) c2x0Var).b.b;
        do {
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            int f = scc.f(arrayList);
            while (true) {
                if (-1 >= f) {
                    break;
                }
                if (jl40.l(((h2x0) arrayList.get(f)).a, a)) {
                    arrayList.remove(f);
                    break;
                }
                f--;
            }
        } while (!r0Var.k(value, arrayList));
    }
}
