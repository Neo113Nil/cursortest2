package ru.yandex.taxi.order.state.transporting;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.quality_question.presentation.a;
import com.yandex.go.taxi.order.quality_question.ui.QualityQuestionButton;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.go.taxi.order.state.o;
import com.yandex.go.taxi.order.state.transporting.TransportingStateViewPresenter$attachView$$inlined$safeCollectIn$1;
import defpackage.avj0;
import defpackage.c0g;
import defpackage.ci70;
import defpackage.cjw0;
import defpackage.csq;
import defpackage.d980;
import defpackage.dgb;
import defpackage.eg01;
import defpackage.evu0;
import defpackage.fc11;
import defpackage.fxx0;
import defpackage.g6y0;
import defpackage.gs70;
import defpackage.hc11;
import defpackage.htc;
import defpackage.hxx;
import defpackage.ic11;
import defpackage.ixx0;
import defpackage.jqb0;
import defpackage.kyh0;
import defpackage.kz8;
import defpackage.l0g;
import defpackage.lg21;
import defpackage.lgg0;
import defpackage.m950;
import defpackage.mg21;
import defpackage.n0g;
import defpackage.n4h0;
import defpackage.nac;
import defpackage.ney;
import defpackage.nw8;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.obv;
import defpackage.oep0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.qyy0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vd00;
import defpackage.vmu0;
import defpackage.wpy0;
import defpackage.xw;
import defpackage.y7z0;
import defpackage.zkh0;
import defpackage.zuj0;
import defpackage.zxs0;
import defpackage.zzf;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.state.transporting.TransportingStateView;
import ru.yandex.taxi.order.view.FeedbackView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ%\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u0010\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/yandex/taxi/order/state/transporting/TransportingStateView;", "Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Lfc11;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lzy11;", "afterConstruction", "()V", "onAttachedToWindow", "onDetachedFromWindow", "inflateStateView", "Lcom/yandex/go/taxi/order/state/o;", "getPresenter", "()Lcom/yandex/go/taxi/order/state/o;", "Landroid/view/View;", "getPeekView", "()Landroid/view/View;", "Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;", "mode", "handleOrderViewMode", "(Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;)V", "Llgg0;", "qualityQuestion", "showQualityQuestionButton", "(Llgg0;)V", "hideQualityQuestionButton", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "Lxw;", "actionModels", "updateActions", "(Ljava/lang/String;Ljava/util/List;)V", "Lhc11;", "presenter", "Lhc11;", "()Lhc11;", "setPresenter", "(Lhc11;)V", "Lcom/yandex/go/taxi/order/quality_question/presentation/a;", "qualityQuestionButtonPresenter", "Lcom/yandex/go/taxi/order/quality_question/presentation/a;", "getQualityQuestionButtonPresenter", "()Lcom/yandex/go/taxi/order/quality_question/presentation/a;", "setQualityQuestionButtonPresenter", "(Lcom/yandex/go/taxi/order/quality_question/presentation/a;)V", "Lru/yandex/taxi/order/view/FeedbackView;", "feedbackView", "Lru/yandex/taxi/order/view/FeedbackView;", "titlesContainer", "Landroid/view/View;", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "topCircleButtonsView", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportingStateView extends TaxiOnTheWayStateView<fc11> implements fc11 {
    public static final int $stable = 8;
    private final FeedbackView feedbackView;
    public hc11 presenter;
    public a qualityQuestionButtonPresenter;
    private final View titlesContainer;
    private final TopCircleButtonsView topCircleButtonsView;

    public TransportingStateView(Context context, fxx0 fxx0Var) {
        super(context);
        FeedbackView feedbackView = (FeedbackView) nonNullViewById(p8h0.feedback_transporting);
        this.feedbackView = feedbackView;
        this.titlesContainer = nonNullViewById(p8h0.titles_container);
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
        ney neyVar = (ney) c0gVar.E0.get();
        ixx0 ixx0Var = new ixx0(new jqb0());
        ci70 ci70Var = (ci70) zzfVar.Ma.get();
        d980 d980Var = (d980) n0gVar.x.get();
        zzf zzfVar2 = c0gVar.z;
        this.presenter = new hc11(n0gVar, neyVar, ixx0Var, ci70Var, d980Var, new zxs0((zuj0) zzfVar2.W.get(), new nw8((zuj0) zzfVar2.W.get())), (lg21) zzfVar.u5.get(), (ic11) n0gVar.z.a, c0gVar.Dw, (oep0) c0gVar.T.get());
        this.qualityQuestionButtonPresenter = n0gVar.e();
        feedbackView.init(fxx0Var);
        feedbackView.setOnCommentClickListener(new vmu0(23, this));
        feedbackView.setRatingBarChangeListener(new FeedbackView.a() { // from class: gc11
            @Override // defpackage.w7i0
            public final void h(float f, boolean z) {
                TransportingStateView._init_$lambda$1(TransportingStateView.this, f, z);
            }
        });
        feedbackView.setOnRatingReasonClickListener(new eg01(this));
        afterConstruction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TransportingStateView transportingStateView, View view) {
        hc11 presenter = transportingStateView.getPresenter();
        ci70 ci70Var = presenter.W;
        o2y0 o2y0Var = presenter.A;
        ci70Var.e(o2y0Var.b().a);
        ((pep0) presenter.d0).f((m950) presenter.c0.get(), new csq(o2y0Var, null), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TransportingStateView transportingStateView, float f, boolean z) {
        if (z) {
            hc11 presenter = transportingStateView.getPresenter();
            presenter.G.a(f, presenter.A.b().a);
            presenter.E.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQualityQuestionButton$lambda$0(TransportingStateView transportingStateView, lgg0 lgg0Var, View view) {
        hc11 presenter = transportingStateView.getPresenter();
        ((mg21) presenter.b0).c(lgg0Var.a);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void afterConstruction() {
        super.afterConstruction();
        this.topCircleButtonsView.init(getCoroutineScope(), getImageLoader());
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getPeekView, reason: from getter */
    public View getTitlesContainer() {
        return this.titlesContainer;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public final hc11 getPresenter() {
        hc11 hc11Var = this.presenter;
        if (hc11Var != null) {
            return hc11Var;
        }
        return null;
    }

    public final a getQualityQuestionButtonPresenter() {
        a aVar = this.qualityQuestionButtonPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    public void handleOrderViewMode(OrderStateView.Mode mode) {
        cjw0 cjw0Var = getPresenter().f0;
        int rateSubtitleId = mode.getRateSubtitleId();
        gs70 gs70Var = (gs70) cjw0Var.b;
        TaxiOrder b = ((o2y0) cjw0Var.c).b();
        gs70Var.getClass();
        if (gs70.a(b).b) {
            return;
        }
        d980 d980Var = (d980) cjw0Var.a;
        d980Var.c(((avj0) d980Var.f).h(rateSubtitleId));
    }

    @Override // defpackage.ogg0
    public void hideQualityQuestionButton() {
        QualityQuestionButton qualityQuestionButton = this.qualityQuestionButton;
        if (qualityQuestionButton != null) {
            qualityQuestionButton.setVisibility(8);
        }
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void inflateStateView() {
        inflate(zkh0.transporting_state_view);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        hc11 presenter = getPresenter();
        presenter.Ng(this);
        tje.N(presenter.D, null, null, new TransportingStateViewPresenter$attachView$$inlined$safeCollectIn$1(presenter.V.a(presenter.A), null, presenter), 3);
        d980 d980Var = presenter.Z;
        d980Var.p = new dgb(6, presenter);
        d980Var.u = true;
        d980Var.x = true;
        boolean z = false;
        qyy0.c(new kz8(2, d980Var, z, z));
        cjw0 cjw0Var = presenter.f0;
        int i = kyh0.order_screens_rate_subtitle_your;
        gs70 gs70Var = (gs70) cjw0Var.b;
        TaxiOrder b = ((o2y0) cjw0Var.c).b();
        gs70Var.getClass();
        if (!gs70.a(b).b) {
            d980 d980Var2 = (d980) cjw0Var.a;
            d980Var2.c(((avj0) d980Var2.f).h(i));
        }
        super.onAttachedToWindow();
        this.topCircleButtonsView.setActionClickListener(new wpy0(16, this));
        getQualityQuestionButtonPresenter().Kg(this);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.topCircleButtonsView.setActionClickListener(null);
        getPresenter().Cg();
        getQualityQuestionButtonPresenter().Cg();
    }

    public final void setPresenter(hc11 hc11Var) {
        this.presenter = hc11Var;
    }

    public final void setQualityQuestionButtonPresenter(a aVar) {
        this.qualityQuestionButtonPresenter = aVar;
    }

    @Override // defpackage.ogg0
    public void showQualityQuestionButton(lgg0 qualityQuestion) {
        QualityQuestionButton qualityQuestionButton = this.qualityQuestionButton;
        if (qualityQuestionButton == null) {
            ny61.g("Required value was null.");
            return;
        }
        qualityQuestionButton.setVisibility(0);
        qualityQuestionButton.setOnClickListener(new y7z0(9, this, qualityQuestion));
        String str = qualityQuestion.b;
        if (str != null && !evu0.J(str)) {
            nac nacVar = (nac) getImageLoader().a(qualityQuestionButton.getLeadImageView());
            nacVar.e(n4h0.ic_secret_shopper);
            nacVar.b(new obv(str, null, 6, 0));
        }
        String str2 = qualityQuestion.c;
        if (evu0.J(str2)) {
            return;
        }
        qualityQuestionButton.setTitle(str2);
    }

    @Override // defpackage.t0b
    public void updateActions(String orderId, List<xw> actionModels) {
        this.topCircleButtonsView.updateActions(orderId, actionModels);
        getPresenter().Og(actionModels);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public o getPresenter() {
        return getPresenter();
    }
}
