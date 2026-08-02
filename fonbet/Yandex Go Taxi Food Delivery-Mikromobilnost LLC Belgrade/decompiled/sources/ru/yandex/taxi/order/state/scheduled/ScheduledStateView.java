package ru.yandex.taxi.order.state.scheduled;

import android.content.Context;
import android.view.View;
import com.yandex.go.taxi.order.provider.a0;
import com.yandex.go.taxi.order.provider.y;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.state.o;
import com.yandex.go.taxi.order.state.scheduled.ScheduledStatePresenter$attachView$$inlined$safeCollectIn$1;
import defpackage.b980;
import defpackage.bu1;
import defpackage.c0g;
import defpackage.dgb;
import defpackage.fxx0;
import defpackage.g6y0;
import defpackage.gom0;
import defpackage.h4w;
import defpackage.h980;
import defpackage.hom0;
import defpackage.htc;
import defpackage.l0g;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.q48;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vd00;
import defpackage.zkh0;
import defpackage.zzf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.view.CarDescriptionTextView;
import ru.yandex.taxi.widget.InstructionsView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/taxi/order/state/scheduled/ScheduledStateView;", "Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Lgom0;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lcom/yandex/go/taxi/order/state/o;", "getPresenter", "()Lcom/yandex/go/taxi/order/state/o;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "Lh4w;", "models", "setOrderInstructionModels", "(Ljava/util/List;)V", "Landroid/view/View;", "getPeekView", "()Landroid/view/View;", "inflateStateView", "", "title", "showSafetyCenterButton", "(Ljava/lang/String;)V", "hideSafetyCenterButton", "Lb980;", "orderTitles", "setTitles", "(Lb980;)V", "Lhom0;", "presenter", "Lhom0;", "Lru/yandex/taxi/widget/InstructionsView;", "instructionsView", "Lru/yandex/taxi/widget/InstructionsView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScheduledStateView extends TaxiOnTheWayStateView<gom0> implements gom0 {
    public static final int $stable = 8;
    private final InstructionsView instructionsView;
    private final hom0 presenter;

    public ScheduledStateView(Context context, fxx0 fxx0Var) {
        super(context);
        n0g n0gVar = (n0g) fxx0Var;
        c0g c0gVar = n0gVar.c;
        this.presenter = new hom0(n0gVar, (ney) c0gVar.E0.get(), (h980) c0gVar.Zl.get(), new bu1((c) n0gVar.b.bb.get()));
        InstructionsView instructionsView = (InstructionsView) nonNullViewById(p8h0.instructions_view);
        this.instructionsView = instructionsView;
        n0g n0gVar2 = (n0g) fxx0Var;
        zzf zzfVar = n0gVar2.b;
        instructionsView.init((pav) zzfVar.p3.get());
        c0g c0gVar2 = n0gVar2.c;
        this.activity = c0gVar2.w;
        this.component = n0gVar2;
        this.horizontalButtonsViewPresenter = n0gVar2.b();
        l0g l0gVar = n0gVar2.f;
        o2y0 o2y0Var = l0gVar.a.a;
        q5z.i(o2y0Var);
        this.orderHolder = o2y0Var;
        this.cancelPresenter = n0gVar2.c();
        this.makeAnotherOrderButtonPresenter = (vd00) n0gVar2.i.get();
        this.detailsCardHeightAnimationsInteractor = l0gVar.a();
        this.imageLoader = (pav) zzfVar.p3.get();
        this.storiesUiHolderFactory = (qnu0) zzfVar.hk.get();
        this.travelCompanionDetailPresenter = n0gVar2.g();
        this.travelCompanionStatusViewProvider = n0gVar2.v;
        this.communicationsAdapterFactory = (htc) n0gVar2.e.R5.a;
        this.carDescriptionTextViewProvider = n0gVar2.w;
        this.sessionTimelineTracker = (g6y0) zzfVar.lh.get();
        this.coroutineScope = (tse) c0gVar2.B.get();
        afterConstruction();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getPeekView */
    public View getTitlesContainer() {
        return this.titleView;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public o getPresenter() {
        return this.presenter;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.k780
    public void hideSafetyCenterButton() {
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void inflateStateView() {
        inflate(zkh0.scheduled_state_view);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        hom0 hom0Var = this.presenter;
        hom0Var.Ng(this);
        bu1 bu1Var = hom0Var.R;
        tpr t = e.t(new a0(new y(bu1Var.a.b(hom0Var.A), bu1Var), bu1Var));
        tje.N(hom0Var.D, null, null, new ScheduledStatePresenter$attachView$$inlined$safeCollectIn$1(t, null, hom0Var), 3);
        hom0Var.T.c(hom0Var.A, true, true, false, new dgb(3, hom0Var));
        super.onAttachedToWindow();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.gom0
    public void setOrderInstructionModels(List<h4w> models) {
        this.instructionsView.setInstructions(models);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.jxx0
    public void setTitles(b980 orderTitles) {
        super.setTitles(orderTitles);
        q48 q48Var = orderTitles.e;
        CarDescriptionTextView carDescriptionTextView = this.carDescription;
        if (carDescriptionTextView != null) {
            if ((q48Var == null || q48Var.e == null) && carDescriptionTextView != null) {
                carDescriptionTextView.setVisibility(8);
            }
        }
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.k780
    public void showSafetyCenterButton(String title) {
    }
}
