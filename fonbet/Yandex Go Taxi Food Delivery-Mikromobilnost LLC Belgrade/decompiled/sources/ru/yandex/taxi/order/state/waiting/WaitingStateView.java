package ru.yandex.taxi.order.state.waiting;

import android.content.Context;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.avj0;
import defpackage.c0g;
import defpackage.d980;
import defpackage.fxx0;
import defpackage.g6y0;
import defpackage.h2k0;
import defpackage.htc;
import defpackage.kyh0;
import defpackage.kz8;
import defpackage.l0g;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o041;
import defpackage.o2y0;
import defpackage.p041;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.qyy0;
import defpackage.tse;
import defpackage.vd00;
import defpackage.wpy0;
import defpackage.xw;
import defpackage.zkh0;
import defpackage.zzf;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.view.CarDescriptionTextView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/yandex/taxi/order/state/waiting/WaitingStateView;", "Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Lo041;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lp041;", "getPresenter", "()Lp041;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "inflateStateView", "afterConstruction", "", "title", "showSafetyCenterButton", "(Ljava/lang/String;)V", "hideSafetyCenterButton", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "Lxw;", "actionModels", "updateActions", "(Ljava/lang/String;Ljava/util/List;)V", "", BackendConfig.Restrictions.ENABLED, "enableA11yLiveRegionForTitle", "(Z)V", "waitingStateViewPresenter", "Lp041;", "getWaitingStateViewPresenter", "setWaitingStateViewPresenter", "(Lp041;)V", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "topCircleButtonsView", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WaitingStateView extends TaxiOnTheWayStateView<o041> implements o041 {
    public static final int $stable = 8;
    private final TopCircleButtonsView topCircleButtonsView;
    public p041 waitingStateViewPresenter;

    public WaitingStateView(Context context, fxx0 fxx0Var) {
        super(context);
        this.topCircleButtonsView = (TopCircleButtonsView) nonNullViewById(p8h0.top_circle_buttons_view);
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
        this.waitingStateViewPresenter = new p041(n0gVar, (ney) c0gVar.E0.get(), (d980) n0gVar.x.get());
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

    @Override // defpackage.o041
    public void enableA11yLiveRegionForTitle(boolean enabled) {
        this.titleView.setAccessibilityLiveRegion(enabled);
    }

    public final p041 getWaitingStateViewPresenter() {
        p041 p041Var = this.waitingStateViewPresenter;
        if (p041Var != null) {
            return p041Var;
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
        p041 waitingStateViewPresenter = getWaitingStateViewPresenter();
        waitingStateViewPresenter.Ng(this);
        enableA11yLiveRegionForTitle(false);
        d980 d980Var = waitingStateViewPresenter.V;
        d980Var.p = new h2k0(1, waitingStateViewPresenter);
        d980Var.u = true;
        d980Var.x = true;
        int i = 2;
        qyy0.c(new kz8(i, d980Var, true, false));
        d980Var.d(((avj0) d980Var.f).h(kyh0.taxiotw_waiting));
        super.onAttachedToWindow();
        this.topCircleButtonsView.setActionClickListener(new wpy0(28, this));
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.topCircleButtonsView.setActionClickListener(null);
        getWaitingStateViewPresenter().Cg();
    }

    public final void setWaitingStateViewPresenter(p041 p041Var) {
        this.waitingStateViewPresenter = p041Var;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.k780
    public void showSafetyCenterButton(String title) {
        this.bottomCircleButtonsView.showSafetyCenter(title);
        getWaitingStateViewPresenter().B.b("SafetyCenter");
    }

    @Override // defpackage.t0b
    public void updateActions(String orderId, List<xw> actionModels) {
        this.topCircleButtonsView.updateActions(orderId, actionModels);
        hideOrderButtonInBottomIfNeeded();
        getPresenter().Og(actionModels);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public p041 getPresenter() {
        return getWaitingStateViewPresenter();
    }
}
