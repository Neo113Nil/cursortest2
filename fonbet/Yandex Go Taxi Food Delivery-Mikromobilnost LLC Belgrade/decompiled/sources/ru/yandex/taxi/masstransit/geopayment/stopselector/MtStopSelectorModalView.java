package ru.yandex.taxi.masstransit.geopayment.stopselector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.zone.model.Zone;
import defpackage.ahu0;
import defpackage.bhu0;
import defpackage.c2x0;
import defpackage.chu0;
import defpackage.cma1;
import defpackage.d2x0;
import defpackage.d411;
import defpackage.e230;
import defpackage.g0c;
import defpackage.he7;
import defpackage.jnb;
import defpackage.knb;
import defpackage.lnb;
import defpackage.m0o;
import defpackage.m440;
import defpackage.mnb;
import defpackage.ny61;
import defpackage.o340;
import defpackage.ohu0;
import defpackage.qdb1;
import defpackage.qls0;
import defpackage.qoi0;
import defpackage.reh0;
import defpackage.rhy;
import defpackage.s340;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sf30;
import defpackage.t1w;
import defpackage.tiu0;
import defpackage.tje;
import defpackage.tse0;
import defpackage.uqh0;
import defpackage.w130;
import defpackage.wfu0;
import defpackage.x240;
import defpackage.x8t0;
import defpackage.xfu0;
import defpackage.yfu0;
import defpackage.zgu0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$StopOptionsButtonActionType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.model.StopSelectionStage;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002>?B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0014¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020\rH\u0014¢\u0006\u0004\b&\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/stopselector/MtStopSelectorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Llnb;", "Landroid/content/Context;", "context", "Ls340;", "presenter", "Lc2x0;", "systemBarsCoordinator", "<init>", "(Landroid/content/Context;Ls340;Lc2x0;)V", "Lt1w;", "insets", "Lzy11;", "applyInsets", "(Lt1w;)V", "", "maxHeight", "capContentHeight", "(I)V", "Le230;", "insetsType", "()Le230;", "getMaxAnchoredHeight", "()I", "onBackPressed", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Llnb;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "onDetachedFromWindow", "Ls340;", "Lc2x0;", "Lm440;", "adapter", "Lm440;", "Lmnb;", "successState", "Lmnb;", "getSuccessState", "()Lmnb;", "Lknb;", "loadingState", "Lknb;", "getLoadingState", "()Lknb;", "Ljnb;", "errorState", "Ljnb;", "getErrorState", "()Ljnb;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "o340", "p340", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtStopSelectorModalView extends SlideableBindingModalView<lnb> {
    public static final int $stable = 8;
    private final m440 adapter;
    private FloatButtonIconComponent backButton;
    private final jnb errorState;
    private final knb loadingState;
    private final s340 presenter;
    private final mnb successState;
    private final c2x0 systemBarsCoordinator;

    public MtStopSelectorModalView(Context context, s340 s340Var, c2x0 c2x0Var) {
        super(context);
        this.presenter = s340Var;
        this.systemBarsCoordinator = c2x0Var;
        b bVar = new b(s340Var);
        int i = chu0.Z;
        g0c a = qoi0.a(ahu0.class);
        qls0 qls0Var = new qls0(13);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, qls0Var);
        int i2 = chu0.Z;
        zxs zxsVar2 = new zxs(qoi0.a(bhu0.class).a(), 0, null, emptyList, null, new qls0(12));
        int i3 = yfu0.Z;
        int i4 = 1;
        zxs zxsVar3 = new zxs(qoi0.a(wfu0.class).a(), 0, new x8t0(24), emptyList, new he7(i4, new x8t0(25)), null);
        int i5 = yfu0.Z;
        zxs zxsVar4 = new zxs(qoi0.a(zgu0.class).a(), 0, new x8t0(26), emptyList, new he7(i4, new x8t0(27)), null);
        int i6 = m0o.Z;
        m440 m440Var = new m440(bVar, scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, new zxs(qoi0.a(xfu0.class).a(), 0, new x8t0(22), emptyList, new he7(i4, new x8t0(23)), null)));
        this.adapter = m440Var;
        GoLinearLayout goLinearLayout = getBinding().a;
        int i7 = reh0.stops_list;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i7, goLinearLayout);
        if (recyclerView != null) {
            i7 = reh0.success_container;
            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i7, goLinearLayout);
            if (goConstraintLayout != null) {
                i7 = reh0.title;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i7, goLinearLayout);
                if (listItemComponent != null) {
                    this.successState = new mnb(goLinearLayout, recyclerView, goConstraintLayout, listItemComponent);
                    GoLinearLayout goLinearLayout2 = getBinding().a;
                    int i8 = reh0.first_placeholder;
                    if (((PlaceholderView) cma1.O(i8, goLinearLayout2)) != null) {
                        i8 = reh0.loading_container;
                        GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i8, goLinearLayout2);
                        if (goLinearLayout3 != null) {
                            this.loadingState = new knb(goLinearLayout2, goLinearLayout3);
                            GoLinearLayout goLinearLayout4 = getBinding().a;
                            int i9 = reh0.error_container;
                            GoLinearLayout goLinearLayout5 = (GoLinearLayout) cma1.O(i9, goLinearLayout4);
                            if (goLinearLayout5 != null) {
                                i9 = reh0.error_stops_image;
                                if (((GoImageView) cma1.O(i9, goLinearLayout4)) != null) {
                                    i9 = reh0.error_subtitle;
                                    if (((RobotoTextView) cma1.O(i9, goLinearLayout4)) != null) {
                                        i9 = reh0.error_title;
                                        if (((RobotoTextView) cma1.O(i9, goLinearLayout4)) != null) {
                                            i9 = reh0.image_and_texts_container;
                                            if (((GoLinearLayout) cma1.O(i9, goLinearLayout4)) != null) {
                                                i9 = reh0.refresh_button;
                                                ButtonsView buttonsView = (ButtonsView) cma1.O(i9, goLinearLayout4);
                                                if (buttonsView != null) {
                                                    i9 = reh0.refresh_button_container;
                                                    if (((GoFrameLayout) cma1.O(i9, goLinearLayout4)) != null) {
                                                        this.errorState = new jnb(goLinearLayout4, goLinearLayout5, buttonsView);
                                                        recyclerView.setAdapter(m440Var);
                                                        recyclerView.setLayoutManager(new LinearLayoutManager(context));
                                                        recyclerView.addItemDecoration(new rhy(context));
                                                        RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
                                                        b1 b1Var = itemAnimator instanceof b1 ? (b1) itemAnimator : null;
                                                        if (b1Var != null) {
                                                            b1Var.g = false;
                                                        }
                                                        goConstraintLayout.setVisibility(8);
                                                        goLinearLayout5.setVisibility(8);
                                                        goLinearLayout3.setVisibility(0);
                                                        setArrowState(ArrowsView.State.GONE);
                                                        getBottomSheetBehavior().W = false;
                                                        getBottomSheetBehavior().Z = false;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ny61.t("Missing required view with ID: ".concat(goLinearLayout4.getResources().getResourceName(i9)));
                            throw null;
                        }
                    }
                    ny61.t("Missing required view with ID: ".concat(goLinearLayout2.getResources().getResourceName(i8)));
                    throw null;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(goLinearLayout.getResources().getResourceName(i7)));
        throw null;
    }

    private final void applyInsets(t1w insets) {
        sb2.L(this.errorState.b, 0, 0, 0, insets.d, 7);
        GoLinearLayout goLinearLayout = this.loadingState.b;
        int i = insets.d;
        sb2.L(goLinearLayout, 0, 0, 0, i, 7);
        sb2.L(this.successState.b, 0, 0, 0, i, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capContentHeight(int maxHeight) {
        if (maxHeight <= 0) {
            return;
        }
        int i = maxHeight - getCurrentInsets().d;
        if (i < 0) {
            i = 0;
        }
        for (View view : scc.g(this.successState.b, this.loadingState.b, this.errorState.b)) {
            if (view.getLayoutParams().height > i) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams.height = i;
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(MtStopSelectorModalView mtStopSelectorModalView, t1w t1wVar) {
        mtStopSelectorModalView.applyInsets(t1wVar);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((d2x0) this.systemBarsCoordinator).e(0, qoi0.a(MtStopSelectorModalView.class));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public lnb bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uqh0.checkout_stops_selector_modal_view, parent, false);
        if (inflate != null) {
            return new lnb((GoLinearLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    public final jnb getErrorState() {
        return this.errorState;
    }

    public final knb getLoadingState() {
        return this.loadingState;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent == null) {
            return super.getMaxAnchoredHeight();
        }
        int maxAnchoredHeight = (super.getMaxAnchoredHeight() - getTopPadding()) - (floatButtonIconComponent.getHeight() + ((int) floatButtonIconComponent.getY()));
        if (maxAnchoredHeight < 0) {
            return 0;
        }
        return maxAnchoredHeight;
    }

    public final mnb getSuccessState() {
        return this.successState;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new x240(1, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object value;
        String str;
        Zone zone;
        super.onAttachedToWindow();
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        s340 s340Var = this.presenter;
        o340 o340Var = new o340(this);
        String str2 = s340Var.C;
        s340Var.Bg(o340Var);
        tiu0 tiu0Var = s340Var.E;
        String str3 = s340Var.y;
        r0 r0Var = tiu0Var.d;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, ohu0.a((ohu0) value, null, false, null, null, null, str3, null, null, 479)));
        String str4 = s340Var.z;
        while (true) {
            Object value2 = r0Var.getValue();
            String str5 = str4;
            if (r0Var.k(value2, ohu0.a((ohu0) value2, null, false, null, null, null, null, str5, null, 447))) {
                break;
            } else {
                str4 = str5;
            }
        }
        String str6 = s340Var.B;
        while (true) {
            Object value3 = r0Var.getValue();
            String str7 = str6;
            if (r0Var.k(value3, ohu0.a((ohu0) value3, null, false, null, null, str7, null, null, null, 495))) {
                break;
            } else {
                str6 = str7;
            }
        }
        if (str2 != null) {
            tiu0Var.e(StopSelectionStage.SELECT_DESTINATION_STOP);
            tiu0Var.d(str2);
        }
        d411 d411Var = s340Var.F;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = s340Var.A;
        String str8 = s340Var.y;
        ZoneAddress n = s340Var.G.n();
        if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
            str = "";
        }
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
        hashMap.put("vehicle_id", str8);
        d411Var.a.a("TransportPayment.StopOptions.Shown", hashMap, 3, tse0.r("zone_name", hashMap, str));
        tje.N(s340Var.Jg(), null, null, new MtStopSelectorPresenter$attachView$1(s340Var, null), 3);
        tje.N(s340Var.Jg(), null, null, new MtStopSelectorPresenter$attachView$2(s340Var, null), 3);
        BackButtonIconComponent b = qdb1.b(this, new sf30(7, this));
        if (!b.isLaidOut() || b.isLayoutRequested()) {
            b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorModalView$onAttachedToWindow$lambda$0$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    MtStopSelectorModalView mtStopSelectorModalView = MtStopSelectorModalView.this;
                    mtStopSelectorModalView.capContentHeight(mtStopSelectorModalView.getMaxAnchoredHeight());
                    MtStopSelectorModalView.this.updateAnchoredHeight(false);
                }
            });
        } else {
            capContentHeight(getMaxAnchoredHeight());
            updateAnchoredHeight(false);
        }
        this.backButton = b;
        setArrowState(ArrowsView.State.GONE);
        ((d2x0) this.systemBarsCoordinator).e(0, qoi0.a(MtStopSelectorModalView.class));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        String str;
        Zone zone;
        super.onBackPressed();
        s340 s340Var = this.presenter;
        d411 d411Var = s340Var.F;
        TransportPaymentAnalytics$StopOptionsButtonActionType transportPaymentAnalytics$StopOptionsButtonActionType = TransportPaymentAnalytics$StopOptionsButtonActionType.Back;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = s340Var.A;
        String str2 = s340Var.y;
        tiu0 tiu0Var = s340Var.E;
        String str3 = ((ohu0) tiu0Var.d.getValue()).a;
        ZoneAddress n = s340Var.G.n();
        if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
            str = "";
        }
        d411Var.b(transportPaymentAnalytics$StopOptionsButtonActionType, ((ohu0) tiu0Var.d.getValue()).h, transportPaymentAnalytics$VehicleType, str2, str3, str);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        ((d2x0) this.systemBarsCoordinator).b(qoi0.a(MtStopSelectorModalView.class));
    }
}
