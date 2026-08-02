package ru.yandex.taxi.order.state.driving;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.taxi.order.domain.repositories.f;
import com.yandex.go.taxi.order.state.driving.DrivingStateViewPresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.state.driving.a;
import com.yandex.go.taxi.order.state.o;
import defpackage.amm;
import defpackage.avj0;
import defpackage.c0g;
import defpackage.d980;
import defpackage.dgb;
import defpackage.dim;
import defpackage.dne0;
import defpackage.eim;
import defpackage.fxx0;
import defpackage.g6y0;
import defpackage.htc;
import defpackage.kyh0;
import defpackage.kz8;
import defpackage.l0g;
import defpackage.n0g;
import defpackage.n20;
import defpackage.ney;
import defpackage.nw8;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.qyy0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vd00;
import defpackage.wqj;
import defpackage.xw;
import defpackage.yzh;
import defpackage.zkh0;
import defpackage.zuj0;
import defpackage.zxs0;
import defpackage.zzf;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.view.CarDescriptionTextView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.superapp.orders.models.ActionType;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ%\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000e\u0010!\"\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/taxi/order/state/driving/DrivingStateView;", "Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Lamm;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/taxi/order/state/o;", "getPresenter", "()Lcom/yandex/go/taxi/order/state/o;", "inflateStateView", "afterConstruction", "", "title", "showSafetyCenterButton", "(Ljava/lang/String;)V", "hideSafetyCenterButton", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "Lxw;", "actionModels", "updateActions", "(Ljava/lang/String;Ljava/util/List;)V", "playDriverAcceptance", "Lcom/yandex/go/taxi/order/state/driving/a;", "presenter", "Lcom/yandex/go/taxi/order/state/driving/a;", "()Lcom/yandex/go/taxi/order/state/driving/a;", "setPresenter", "(Lcom/yandex/go/taxi/order/state/driving/a;)V", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "topCircleButtonsView", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "Landroid/view/View;", "travelCompanionView", "Landroid/view/View;", "Leim;", "driverDecorator", "Leim;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DrivingStateView extends TaxiOnTheWayStateView<amm> implements amm {
    public static final int $stable = 8;
    private final eim driverDecorator;
    public a presenter;
    private final TopCircleButtonsView topCircleButtonsView;
    private final View travelCompanionView;

    public DrivingStateView(Context context, fxx0 fxx0Var) {
        super(context);
        this.topCircleButtonsView = (TopCircleButtonsView) nonNullViewById(p8h0.top_circle_buttons_view);
        this.travelCompanionView = nonNullViewById(p8h0.travel_companion_detail_view);
        this.driverDecorator = new eim((ViewGroup) nonNullViewById(p8h0.top_container));
        n0g n0gVar = (n0g) fxx0Var;
        c0g c0gVar = n0gVar.c;
        this.activity = c0gVar.w;
        this.component = n0gVar;
        this.horizontalButtonsViewPresenter = n0gVar.b();
        l0g l0gVar = n0gVar.f;
        o2y0 o2y0Var = l0gVar.a.a;
        q5z.i(o2y0Var);
        this.orderHolder = o2y0Var;
        this.cancelPresenter = n0gVar.c();
        this.makeAnotherOrderButtonPresenter = (vd00) n0gVar.i.get();
        this.detailsCardHeightAnimationsInteractor = l0gVar.a();
        zzf zzfVar = n0gVar.b;
        this.imageLoader = (pav) zzfVar.p3.get();
        this.storiesUiHolderFactory = (qnu0) zzfVar.hk.get();
        this.travelCompanionDetailPresenter = n0gVar.g();
        this.travelCompanionStatusViewProvider = n0gVar.v;
        this.communicationsAdapterFactory = (htc) n0gVar.e.R5.a;
        this.carDescriptionTextViewProvider = n0gVar.w;
        this.sessionTimelineTracker = (g6y0) zzfVar.lh.get();
        this.coroutineScope = (tse) c0gVar.B.get();
        ney neyVar = (ney) c0gVar.E0.get();
        d980 d980Var = (d980) n0gVar.x.get();
        zzf zzfVar2 = c0gVar.z;
        this.presenter = new a(n0gVar, neyVar, d980Var, new zxs0((zuj0) zzfVar2.W.get(), new nw8((zuj0) zzfVar2.W.get())), new f((dne0) zzfVar2.d.get(), (n20) zzfVar2.o4.get()));
        afterConstruction();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void afterConstruction() {
        super.afterConstruction();
        this.topCircleButtonsView.init(getCoroutineScope(), getImageLoader());
        CarDescriptionTextView carDescriptionTextView = this.carDescription;
        if (carDescriptionTextView != null) {
            carDescriptionTextView.setVisibility(8);
        }
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public final a getPresenter() {
        a aVar = this.presenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.k780
    public void hideSafetyCenterButton() {
        this.bottomCircleButtonsView.hideSafetyCenter();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void inflateStateView() {
        inflate(zkh0.driving_waiting_state_view);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        a presenter = getPresenter();
        presenter.Ng(this);
        tje.N(presenter.D, null, null, new DrivingStateViewPresenter$attachView$$inlined$safeCollectIn$1(presenter.b0.a(presenter.A), null, presenter), 3);
        d980 d980Var = presenter.V;
        d980Var.p = new dgb(1, presenter);
        d980Var.u = true;
        d980Var.x = true;
        qyy0.c(new kz8(2, d980Var, 1 == true ? 1 : 0, false));
        d980Var.d(((avj0) d980Var.f).h(kyh0.taxiotw_driving));
        super.onAttachedToWindow();
        this.topCircleButtonsView.setActionClickListener(new yzh(this));
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.topCircleButtonsView.setActionClickListener(null);
        getPresenter().Cg();
    }

    @Override // defpackage.amm
    public void playDriverAcceptance() {
        this.driverDecorator.a(this.topCircleButtonsView.getButtonForActionType(ActionType.DRIVER));
        eim eimVar = this.driverDecorator;
        eimVar.getClass();
        dim dimVar = new dim(eimVar, 1);
        View view = (View) eimVar.d.get();
        if (view != null) {
            view.postDelayed(new wqj(8, eimVar, dimVar), 200L);
        }
    }

    public final void setPresenter(a aVar) {
        this.presenter = aVar;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.k780
    public void showSafetyCenterButton(String title) {
        this.bottomCircleButtonsView.showSafetyCenter(title);
        getPresenter().B.b("SafetyCenter");
    }

    @Override // defpackage.t0b
    public void updateActions(String orderId, List<xw> actionModels) {
        this.topCircleButtonsView.updateActions(orderId, actionModels);
        if (this.topCircleButtonsView.getButtonForActionType(ActionType.DRIVER) != null) {
            getPresenter().Rg();
        }
        hideOrderButtonInBottomIfNeeded();
        getPresenter().Og(actionModels);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public o getPresenter() {
        return getPresenter();
    }
}
