package ru.yandex.taxi.order.state.complete;

import android.content.Context;
import android.view.View;
import com.yandex.go.taxi.order.provider.c0;
import com.yandex.go.taxi.order.quality_question.presentation.a;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.go.taxi.order.state.complete.CompletePresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.state.complete.CompletePresenter$attachView$$inlined$safeCollectIn$2;
import defpackage.bt00;
import defpackage.c0g;
import defpackage.fxx0;
import defpackage.g7i0;
import defpackage.hbp0;
import defpackage.iey;
import defpackage.ixx0;
import defpackage.jqb0;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.ozc;
import defpackage.p4j;
import defpackage.pzc;
import defpackage.q5z;
import defpackage.qim;
import defpackage.spl0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xyc;
import defpackage.zzf;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bR\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/yandex/taxi/order/state/complete/CompleteStateView;", "Lcom/yandex/go/taxi/order/state/OrderStateView;", "Lozc;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "getAnchorView", "()Landroid/view/View;", "", "onBackPressed", "()Z", "getPeekView", "resetScroll", "Lqim;", "driver", "showDriver", "(Lqim;)V", "Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;", "mode", "handleOrderViewMode", "(Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;)V", "", "title", "showSafetyCenterButton", "(Ljava/lang/String;)V", "hideSafetyCenterButton", "Lg7i0$a;", "uiDelegate", "Lg7i0$a;", "getUiDelegate", "()Lg7i0$a;", "setUiDelegate", "(Lg7i0$a;)V", "Lney;", "lifecycleObservable", "Lney;", "getLifecycleObservable", "()Lney;", "setLifecycleObservable", "(Lney;)V", "Lxyc;", "completePresenter", "Lxyc;", "getCompletePresenter", "()Lxyc;", "setCompletePresenter", "(Lxyc;)V", "Lcom/yandex/go/taxi/order/quality_question/presentation/a;", "qualityQuestionButtonPresenter", "Lcom/yandex/go/taxi/order/quality_question/presentation/a;", "getQualityQuestionButtonPresenter", "()Lcom/yandex/go/taxi/order/quality_question/presentation/a;", "setQualityQuestionButtonPresenter", "(Lcom/yandex/go/taxi/order/quality_question/presentation/a;)V", "Lcom/yandex/go/taxi/order/rate/RateView;", "rateView", "Lcom/yandex/go/taxi/order/rate/RateView;", "Liey;", "lifecycleObserver", "Liey;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CompleteStateView extends OrderStateView implements ozc {
    public static final int $stable = 8;
    public xyc completePresenter;
    public ney lifecycleObservable;
    private final iey lifecycleObserver;
    public a qualityQuestionButtonPresenter;
    private final RateView rateView;
    public g7i0.a uiDelegate;

    public CompleteStateView(Context context, fxx0 fxx0Var) {
        super(context);
        RateView rateView = new RateView(context, fxx0Var);
        this.rateView = rateView;
        this.lifecycleObserver = new pzc(this);
        n0g n0gVar = (n0g) fxx0Var;
        this.uiDelegate = n0gVar.a.a;
        c0g c0gVar = n0gVar.c;
        this.lifecycleObservable = (ney) c0gVar.E0.get();
        ney neyVar = (ney) c0gVar.E0.get();
        zzf zzfVar = n0gVar.b;
        tt2 tt2Var = (tt2) zzfVar.n.get();
        o2y0 o2y0Var = n0gVar.f.a.a;
        q5z.i(o2y0Var);
        this.completePresenter = new xyc(neyVar, tt2Var, o2y0Var, (p4j) n0gVar.h.get(), (spl0) c0gVar.fm.get(), new ixx0(new jqb0()), (bt00) zzfVar.Ok.get());
        this.qualityQuestionButtonPresenter = n0gVar.e();
        addView(rateView, -1, -2);
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getAnchorView */
    public View getAnchorTarget() {
        return this.rateView.getFeedbackView().getStarsView();
    }

    public final xyc getCompletePresenter() {
        xyc xycVar = this.completePresenter;
        if (xycVar != null) {
            return xycVar;
        }
        return null;
    }

    public final ney getLifecycleObservable() {
        ney neyVar = this.lifecycleObservable;
        if (neyVar != null) {
            return neyVar;
        }
        return null;
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getPeekView */
    public View getTitlesContainer() {
        return this.rateView.getTitlesContainer();
    }

    public final a getQualityQuestionButtonPresenter() {
        a aVar = this.qualityQuestionButtonPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final g7i0.a getUiDelegate() {
        g7i0.a aVar = this.uiDelegate;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    public void handleOrderViewMode(OrderStateView.Mode mode) {
        this.rateView.handleOrderViewMode(mode);
    }

    @Override // defpackage.k780
    public void hideSafetyCenterButton() {
        this.rateView.hideSafetyCenter();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xyc completePresenter = getCompletePresenter();
        completePresenter.Mg(this);
        ixx0 ixx0Var = completePresenter.F;
        o2y0 o2y0Var = completePresenter.A;
        c0 a = ixx0Var.a(o2y0Var);
        hbp0 hbp0Var = completePresenter.D;
        tje.N(hbp0Var, null, null, new CompletePresenter$attachView$$inlined$safeCollectIn$1(a, null, completePresenter), 3);
        g a2 = o2y0Var.a();
        completePresenter.E.getClass();
        tje.N(hbp0Var, null, null, new CompletePresenter$attachView$$inlined$safeCollectIn$2(e.F(a2, uyj.a), null, completePresenter), 3);
        getQualityQuestionButtonPresenter().Kg(this.rateView);
        getLifecycleObservable().a(this.lifecycleObserver, this);
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    public boolean onBackPressed() {
        this.rateView.closeView();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycleObservable().d(this);
        getCompletePresenter().Cg();
        getQualityQuestionButtonPresenter().Cg();
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    public void resetScroll() {
        this.rateView.resetScroll();
    }

    public final void setCompletePresenter(xyc xycVar) {
        this.completePresenter = xycVar;
    }

    public final void setLifecycleObservable(ney neyVar) {
        this.lifecycleObservable = neyVar;
    }

    public final void setQualityQuestionButtonPresenter(a aVar) {
        this.qualityQuestionButtonPresenter = aVar;
    }

    public final void setUiDelegate(g7i0.a aVar) {
        this.uiDelegate = aVar;
    }

    @Override // defpackage.ozc
    public void showDriver(qim driver) {
        this.rateView.showDriver(driver);
    }

    @Override // defpackage.k780
    public void showSafetyCenterButton(String title) {
        this.rateView.showSafetyCenter(title);
        getCompletePresenter().B.b("SafetyCenter");
    }
}
