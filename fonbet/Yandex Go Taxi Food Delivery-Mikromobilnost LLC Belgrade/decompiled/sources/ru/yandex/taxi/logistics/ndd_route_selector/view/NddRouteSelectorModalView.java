package ru.yandex.taxi.logistics.ndd_route_selector.view;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.ai50;
import defpackage.cc2;
import defpackage.cma1;
import defpackage.d240;
import defpackage.d43;
import defpackage.d6z;
import defpackage.e100;
import defpackage.ej40;
import defpackage.ej50;
import defpackage.evu0;
import defpackage.f5v0;
import defpackage.feh0;
import defpackage.fki;
import defpackage.fl10;
import defpackage.gai;
import defpackage.gh00;
import defpackage.gki;
import defpackage.h8;
import defpackage.hj50;
import defpackage.hki;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.iu0;
import defpackage.ji50;
import defpackage.jqh0;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.kyx;
import defpackage.lbi;
import defpackage.li50;
import defpackage.lsg0;
import defpackage.m7x0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nfh0;
import defpackage.ny61;
import defpackage.nzg0;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.q5z;
import defpackage.qdb1;
import defpackage.sf30;
import defpackage.si50;
import defpackage.ti50;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tyx;
import defpackage.uc4;
import defpackage.uli;
import defpackage.uva;
import defpackage.ve30;
import defpackage.vng;
import defpackage.wi50;
import defpackage.x240;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yi50;
import defpackage.yvf0;
import defpackage.zgv;
import defpackage.zh50;
import defpackage.zi50;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.logistics.ndd_route_selector.domain.NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$start$1;
import ru.yandex.taxi.logistics.ndd_route_selector.view.filters.DeliveryFloatFilterButtonComponent;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.ui.DeliveryTooltipPopup;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002YjBY\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0014¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020#¢\u0006\u0004\b+\u0010%J\u0017\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0014¢\u0006\u0004\b/\u0010%J\u0017\u00101\u001a\u00020#2\u0006\u00100\u001a\u00020 H\u0014¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020#H\u0014¢\u0006\u0004\b2\u0010%J\u000f\u00103\u001a\u00020'H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020#H\u0014¢\u0006\u0004\b5\u0010%J\u000f\u00106\u001a\u00020#H\u0002¢\u0006\u0004\b6\u0010%J\u000f\u00107\u001a\u00020#H\u0002¢\u0006\u0004\b7\u0010%J\u000f\u00108\u001a\u00020#H\u0002¢\u0006\u0004\b8\u0010%J[\u0010E\u001a\u00020#\"\u0004\b\u0000\u001092\u0006\u0010;\u001a\u00020:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020?0>2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020B2\u0006\u0010G\u001a\u00020?H\u0002¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\u0004\u0018\u00010K*\u00020:2\u0006\u0010J\u001a\u00020'H\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010O\u001a\u00020 *\u00020NH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010SR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010WR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0018\u0010Z\u001a\u00060YR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u001b\u0010c\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lru/yandex/taxi/logistics/ndd_route_selector/view/NddRouteSelectorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lsi50;", "Landroid/content/Context;", "context", "La3v;", "focusCoordinator", "Lyi50;", "presenter", "Luli;", "pvzMapFiltersExperimentProvider", "Lyvf0;", "Lzc;", "filterRouter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lai50;", "nddAnalytics", "Loep0;", "screenStackNavigator", "<init>", "(Landroid/content/Context;La3v;Lyi50;Luli;Lyvf0;Lpav;Lk7x0;Lai50;Loep0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lsi50;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "updateFocusRect", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "onModalViewDisappear", "settle", "updateAnchoredHeight", "onArrowClick", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onBackPressed", "prepareErrorButton", "prepareRouteSwitch", "prepareSuccessButton", "T", "Lru/yandex/taxi/design/SegmentedComponent;", "component", "", "buttons", "Lkotlin/Function1;", "", "titleProvider", "Ljava/util/function/Consumer;", "Lru/yandex/taxi/widget/RobotoTextView;", "onSelected", "onUnselected", "renderSegmentTabs", "(Lru/yandex/taxi/design/SegmentedComponent;Ljava/util/List;Ltls;Ljava/util/function/Consumer;Ljava/util/function/Consumer;)V", "title", "createSegmentTab", "(Ljava/lang/String;)Lru/yandex/taxi/widget/RobotoTextView;", "index", "Landroid/view/View;", "getCustomTabView", "(Lru/yandex/taxi/design/SegmentedComponent;I)Landroid/view/View;", "Lzi50;", "isPvzNotFound", "(Lzi50;)Z", "La3v;", "Lyi50;", "Luli;", "Lyvf0;", "Lpav;", "Lk7x0;", "Lai50;", "Loep0;", "Lru/yandex/taxi/logistics/ndd_route_selector/view/a;", "mvpView", "Lru/yandex/taxi/logistics/ndd_route_selector/view/a;", "smallMargin", CA20Status.STATUS_USER_I, "buttonSpacing", "routeSwitchSegment$delegate", "Li3y;", "getRouteSwitchSegment", "()Lru/yandex/taxi/design/SegmentedComponent;", "routeSwitchSegment", "Lru/yandex/taxi/logistics/ndd_route_selector/view/filters/DeliveryFloatFilterButtonComponent;", "floatFilterButtonComponent", "Lru/yandex/taxi/logistics/ndd_route_selector/view/filters/DeliveryFloatFilterButtonComponent;", "Lru/yandex/taxi/ui/DeliveryTooltipPopup;", "notAllowedPopup", "Lru/yandex/taxi/ui/DeliveryTooltipPopup;", "yh50", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NddRouteSelectorModalView extends SlideableBindingModalView<si50> {
    private final int buttonSpacing;
    private final yvf0 filterRouter;
    private DeliveryFloatFilterButtonComponent floatFilterButtonComponent;
    private final a3v focusCoordinator;
    private final pav imageLoader;
    private final a mvpView;
    private final ai50 nddAnalytics;
    private final DeliveryTooltipPopup notAllowedPopup;
    private final yi50 presenter;
    private final uli pvzMapFiltersExperimentProvider;

    /* renamed from: routeSwitchSegment$delegate, reason: from kotlin metadata */
    private final i3y routeSwitchSegment;
    private final oep0 screenStackNavigator;
    private final int smallMargin;
    private final k7x0 tagUrlFormatter;

    public NddRouteSelectorModalView(Context context, a3v a3vVar, yi50 yi50Var, uli uliVar, yvf0 yvf0Var, pav pavVar, k7x0 k7x0Var, ai50 ai50Var, oep0 oep0Var) {
        super(context);
        this.focusCoordinator = a3vVar;
        this.presenter = yi50Var;
        this.pvzMapFiltersExperimentProvider = uliVar;
        this.filterRouter = yvf0Var;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.nddAnalytics = ai50Var;
        this.screenStackNavigator = oep0Var;
        this.mvpView = new a(this);
        this.smallMargin = tje.r(mrg0.go_design_s_space, getContext());
        this.buttonSpacing = tje.u(4, getContext());
        this.routeSwitchSegment = kotlin.a.b(LazyThreadSafetyMode.NONE, new ve30(28, context, this));
        this.notAllowedPopup = new DeliveryTooltipPopup(this);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setId(nfh0.route_selector_modal_view);
        setDismissOnTouchOutside(false);
        setElevation(tje.r(lsg0.route_selector_elevation, getContext()));
        setArrowState(ArrowsView.State.GONE);
        setDismissOnBackPressed(false);
        qdb1.b(this, new ti50(this, 3));
        qdb1.d(this, new sf30(13, yi50Var));
        prepareRouteSwitch();
        prepareErrorButton();
        prepareSuccessButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onLocationClicked(yi50 yi50Var) {
        yi50Var.M.k();
    }

    private final RobotoTextView createSegmentTab(String title) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        robotoTextView.setGravity(17);
        robotoTextView.setText(title);
        robotoTextView.setSingleLine();
        robotoTextView.setPadding(tje.u(12, robotoTextView.getContext()), 0, tje.u(12, robotoTextView.getContext()), 0);
        robotoTextView.setTextSize(0, tje.r(mrg0.component_text_size_body, robotoTextView.getContext()));
        return robotoTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getCustomTabView(SegmentedComponent segmentedComponent, int i) {
        TabLayout.a tabAt;
        ArrayList arrayList = new ArrayList();
        h8 h8Var = new h8(3, segmentedComponent);
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            if (next instanceof TabLayout) {
                arrayList.add(next);
            }
        }
        TabLayout tabLayout = (TabLayout) kotlin.collections.a.R(arrayList);
        if (tabLayout == null || (tabAt = tabLayout.getTabAt(i)) == null) {
            return null;
        }
        return tabAt.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SegmentedComponent getRouteSwitchSegment() {
        return (SegmentedComponent) this.routeSwitchSegment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPvzNotFound(zi50 zi50Var) {
        return zi50Var.l.a && zi50Var.a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(NddRouteSelectorModalView nddRouteSelectorModalView) {
        yi50 yi50Var = nddRouteSelectorModalView.presenter;
        ai50 ai50Var = yi50Var.C;
        zi50 zi50Var = yi50Var.S;
        boolean z = zi50Var.f;
        String str = zi50Var.a;
        ji50 ji50Var = yi50Var.H;
        ai50Var.getClass();
        ai50Var.c(new zh50(ai50Var, z, str, ji50Var, 1), "SuperApp.Delivery.FinalSelectedStation");
        ((wi50) yi50Var.Dg()).K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(NddRouteSelectorModalView nddRouteSelectorModalView) {
        yi50 yi50Var = nddRouteSelectorModalView.presenter;
        String str = yi50Var.E.b().f;
        if (str != null) {
            ai50 ai50Var = yi50Var.C;
            boolean z = yi50Var.S.f;
            ji50 ji50Var = yi50Var.H;
            i d = ((j) ai50Var.b).d("SuperApp.Delivery.ListOfStations");
            d.d("type", ai50.a(z));
            String d2 = ai50.d(ji50Var);
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("origin", d2);
            pex0 m = ((k) ai50Var.a).m();
            linkedHashMap.put(ClidProvider.STATE, m != null ? m.b : null);
            d.m();
            fl10 fl10Var = yi50Var.I;
            Context context = yi50Var.F;
            fl10Var.getClass();
            if (evu0.J(str)) {
                return;
            }
            q5z.b0(context, Uri.parse(str).buildUpon().appendQueryParameter("tariffClass", ((ji50) fl10Var.a).c()).build().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(NddRouteSelectorModalView nddRouteSelectorModalView, View view) {
        Object value;
        hki fkiVar;
        yi50 yi50Var = nddRouteSelectorModalView.presenter;
        Integer num = yi50Var.x;
        PointType pointType = yi50Var.G.b.b() ? PointType.SOURCE : PointType.DESTINATION;
        r0 r0Var = yi50Var.M.l.a;
        do {
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.TRUE));
        if (pointType == PointType.SOURCE) {
            fkiVar = gki.a;
        } else {
            fkiVar = new fki(num != null ? num.intValue() : 0);
        }
        ((pep0) yi50Var.P).f(new uva((gai) yi50Var.N.get(), new x240(24, yi50Var), new d240(17, yi50Var)), new lbi(fkiVar, new iu0(num != null ? num.intValue() : 0), null, null, null, false, null, false, 504), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$3(NddRouteSelectorModalView nddRouteSelectorModalView) {
        yi50 yi50Var = nddRouteSelectorModalView.presenter;
        zi50 zi50Var = yi50Var.S;
        kyx kyxVar = zi50Var.l;
        uc4 uc4Var = kyxVar.d;
        if (uc4Var != null) {
            ai50 ai50Var = yi50Var.C;
            boolean z = zi50Var.f;
            d43 d43Var = zi50Var.m;
            ai50Var.getClass();
            if (d43Var != null) {
                ai50Var.c(new cc2(ai50Var, d43Var, z, kyxVar, 4), "Delivery.NddFlow.RouteCard.UnavailableAddressButton.Tapped");
            }
            ah00 ah00Var = yi50Var.A;
            zzs zzsVar = uc4Var.a;
            Point point = new Point(zzsVar.a, zzsVar.b);
            zzs zzsVar2 = uc4Var.b;
            ((gh00) ah00Var).A(new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b)), null);
        }
    }

    private final void prepareErrorButton() {
        ButtonComponent buttonComponent = getBinding().e;
        buttonComponent.setEnabled(true);
        buttonComponent.setAccent(true);
        buttonComponent.setButtonSize(3);
    }

    private final void prepareRouteSwitch() {
        getBinding().j.setTrailView(getRouteSwitchSegment());
        xw31.F(getBinding().j, null, null, Integer.valueOf(tje.u(10, getContext())), null);
        ViewGroup.LayoutParams layoutParams = getRouteSwitchSegment().getLayoutParams();
        layoutParams.height = tje.u(38, getContext());
        getRouteSwitchSegment().setLayoutParams(layoutParams);
    }

    private final void prepareSuccessButton() {
        getBinding().d.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void renderSegmentTabs(SegmentedComponent component, List<? extends T> buttons, tls titleProvider, Consumer<RobotoTextView> onSelected, Consumer<RobotoTextView> onUnselected) {
        component.clearTabs();
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            component.addCustomViewTab(createSegmentTab((String) titleProvider.invoke(it.next())), onSelected, onUnselected);
        }
        component.setTabsPadding(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SegmentedComponent routeSwitchSegment_delegate$lambda$0(Context context, NddRouteSelectorModalView nddRouteSelectorModalView) {
        SegmentedComponent segmentedComponent = new SegmentedComponent(context, null, 2, 0 == true ? 1 : 0);
        segmentedComponent.setTabMode(2);
        segmentedComponent.setBackgroundWithOutline(ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, nddRouteSelectorModalView), ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, nddRouteSelectorModalView));
        return segmentedComponent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public si50 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(jqh0.ndd_route_selector, parent, false);
        int i = feh0.address_component;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = feh0.address_flow_switch;
            SegmentedComponent segmentedComponent = (SegmentedComponent) cma1.O(i, inflate);
            if (segmentedComponent != null) {
                i = feh0.done_component;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent2 != null) {
                    i = feh0.error_button_component;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = feh0.error_title_component;
                        ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                        if (listTitleComponent != null) {
                            i = feh0.layout_error;
                            LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                            if (linearLayout != null) {
                                i = feh0.layout_view;
                                LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                                if (linearLayout2 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) inflate;
                                    i = feh0.share_component;
                                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                    if (listItemComponent3 != null) {
                                        i = feh0.title_component;
                                        ListTitleComponent listTitleComponent2 = (ListTitleComponent) cma1.O(i, inflate);
                                        if (listTitleComponent2 != null) {
                                            return new si50(linearLayout3, listItemComponent, segmentedComponent, listItemComponent2, buttonComponent, listTitleComponent, linearLayout, linearLayout2, listItemComponent3, listTitleComponent2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object value;
        PointType pointType;
        super.onAttachedToWindow();
        yi50 yi50Var = this.presenter;
        a aVar = this.mvpView;
        uli uliVar = yi50Var.L;
        yi50Var.Bg(aVar);
        e100 e100Var = yi50Var.z;
        tpr a = ((ru.yandex.taxi.logistics.experiments.k) e100Var.b).a.a();
        li50 li50Var = yi50Var.G;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        int i5 = 4;
        kotlinx.coroutines.flow.e.H(yi50Var.Jg(), new jqr(new h(new tpr[]{a, li50Var.b.b, kotlinx.coroutines.flow.e.t(yi50Var.y.a), new ru.yandex.taxi.logistics.ndd_map.domain.e(vng.l(li50Var.d.b, new ej40(26), vng.c)), ((ej50) e100Var.c).b, com.yandex.go.coroutines.b.d(new ru.yandex.taxi.logistics.ndd_route_selector.domain.b(((tyx) yi50Var.J.a).b), new NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$start$1(null, null)), ((hj50) e100Var.w).b, yi50Var.Q.b}, yi50Var), new NddRouteSelectorPresenter$launchUiStateUpdaterJob$1(yi50Var, null), i4));
        tje.N(yi50Var.Jg(), null, null, new NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1(yi50Var, null), 3);
        f5v0 f5v0Var = yi50Var.B;
        Address a2 = li50Var.b.a();
        zzs B = a2 != null ? a2.B() : null;
        r0 r0Var = f5v0Var.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, B));
        PointType pointType2 = li50Var.b.b() ? PointType.SOURCE : PointType.DESTINATION;
        if (uliVar.b().b && (pointType2 != (pointType = PointType.SOURCE) ? uliVar.b().f != null : uliVar.b().e != null)) {
            if ((pointType2 == pointType ? uliVar.b().e : uliVar.b().f) != null) {
                NddRouteSelectorModalView nddRouteSelectorModalView = aVar.a;
                DeliveryFloatFilterButtonComponent deliveryFloatFilterButtonComponent = new DeliveryFloatFilterButtonComponent(nddRouteSelectorModalView.getContext(), null, 0, 6, null);
                deliveryFloatFilterButtonComponent.setDebounceClickListener(new ti50(nddRouteSelectorModalView, i5));
                String str = nddRouteSelectorModalView.pvzMapFiltersExperimentProvider.b().d.b;
                if (str == null) {
                    deliveryFloatFilterButtonComponent.getLeadImageView().setImageResource(nzg0.ic_settings_fill);
                } else {
                    nac nacVar = (nac) nddRouteSelectorModalView.imageLoader.a(deliveryFloatFilterButtonComponent.getLeadImageView());
                    nacVar.e(nzg0.ic_settings_fill);
                    nacVar.c(((m7x0) nddRouteSelectorModalView.tagUrlFormatter).a(str));
                }
                uli uliVar2 = nddRouteSelectorModalView.pvzMapFiltersExperimentProvider;
                deliveryFloatFilterButtonComponent.setTitle(d6z.Y(uliVar2.b(), uliVar2.b().d.a));
                nddRouteSelectorModalView.addFloatButton(deliveryFloatFilterButtonComponent, 1);
                nddRouteSelectorModalView.floatFilterButtonComponent = deliveryFloatFilterButtonComponent;
                kotlinx.coroutines.flow.e.H(yi50Var.Jg(), new jqr(kotlinx.coroutines.flow.e.d(yi50Var.K.a), new NddRouteSelectorPresenter$launchCountUpdaterJob$1(yi50Var, null), i4));
            }
        }
        getBinding().d.setDebounceClickListener(new ti50(this, i));
        getBinding().i.setDebounceClickListener(new ti50(this, i2));
        getBinding().b.setOnClickListener(new zgv(20, this));
        getBinding().e.setDebounceClickListener(new ti50(this, i3));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.Kg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.floatFilterButtonComponent = null;
        this.notAllowedPopup.dismiss();
        this.presenter.Cg();
        getBinding().d.setOnClickListener(null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        updateFocusRect();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.focusCoordinator.Lc(NddRouteSelectorModalView.class, null);
        this.notAllowedPopup.dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        boolean z = enabled && !isEnabled();
        super.setEnabled(enabled);
        if (z) {
            updateFocusRect();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateAnchoredHeight(boolean settle) {
        super.updateAnchoredHeight(settle);
        if (isEnabled()) {
            updateFocusRect();
        }
    }

    public final void updateFocusRect() {
        this.focusCoordinator.Td(tje.u(48, getContext()) + getContentHeight(), NddRouteSelectorModalView.class);
    }
}
