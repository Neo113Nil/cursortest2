package ru.yandex.taxi.order.state.checkin;

import android.content.Context;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.state.checkin.a;
import com.yandex.go.taxi.order.state.o;
import defpackage.agb;
import defpackage.bgb;
import defpackage.c0g;
import defpackage.cgb;
import defpackage.ci70;
import defpackage.d980;
import defpackage.e90;
import defpackage.f0g;
import defpackage.fc8;
import defpackage.fxx0;
import defpackage.g6y0;
import defpackage.hc8;
import defpackage.htc;
import defpackage.ic8;
import defpackage.j37;
import defpackage.kfb1;
import defpackage.l0g;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.tse;
import defpackage.vd00;
import defpackage.w511;
import defpackage.xw;
import defpackage.yfb;
import defpackage.zfb;
import defpackage.zkh0;
import defpackage.zzf;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.superapp.orders.models.ActionType;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/yandex/taxi/order/state/checkin/CheckInStateView;", "Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Lzfb;", "Landroid/content/Context;", "context", "Lfxx0;", "taxiOnTheWayComponent", "<init>", "(Landroid/content/Context;Lfxx0;)V", "", "instructionTitle", "Lzy11;", "applyCheckInInstruction", "(Ljava/lang/String;)V", "Lyfb;", "checkInState", "checkInTitle", "applyCheckInActionButtons", "(Lyfb;Ljava/lang/String;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "inflateStateView", "Lcom/yandex/go/taxi/order/state/o;", "getPresenter", "()Lcom/yandex/go/taxi/order/state/o;", "", "Lxw;", "actionModels", "updateTopActionButtons", "(Ljava/util/List;)V", ClidProvider.STATE, "applyCheckInState", "(Lyfb;)V", "Lcom/yandex/go/taxi/order/state/checkin/a;", "checkInStateViewPresenter", "Lcom/yandex/go/taxi/order/state/checkin/a;", "getCheckInStateViewPresenter", "()Lcom/yandex/go/taxi/order/state/checkin/a;", "setCheckInStateViewPresenter", "(Lcom/yandex/go/taxi/order/state/checkin/a;)V", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "topCircleButtonsView", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "Lru/yandex/taxi/design/ButtonComponent;", "checkInInstruction", "Lru/yandex/taxi/design/ButtonComponent;", "checkInDetailsButton", "checkInButton", "Lru/yandex/taxi/design/SliderButtonView;", "checkInSliderButton", "Lru/yandex/taxi/design/SliderButtonView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CheckInStateView extends TaxiOnTheWayStateView<zfb> implements zfb {
    public static final int $stable = 8;
    private final ButtonComponent checkInButton;
    private final ButtonComponent checkInDetailsButton;
    private final ButtonComponent checkInInstruction;
    private final SliderButtonView checkInSliderButton;
    public a checkInStateViewPresenter;
    private final TopCircleButtonsView topCircleButtonsView;

    public CheckInStateView(Context context, fxx0 fxx0Var) {
        super(context);
        this.topCircleButtonsView = (TopCircleButtonsView) nonNullViewById(p8h0.top_circle_buttons_view);
        this.checkInInstruction = (ButtonComponent) nonNullViewById(p8h0.check_in_instruction);
        this.checkInDetailsButton = (ButtonComponent) nonNullViewById(p8h0.check_in_details);
        this.checkInButton = (ButtonComponent) nonNullViewById(p8h0.check_in_button);
        this.checkInSliderButton = (SliderButtonView) nonNullViewById(p8h0.check_in_slider_button);
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
        f0g f0gVar = n0gVar.e;
        this.communicationsAdapterFactory = (htc) f0gVar.R5.a;
        this.carDescriptionTextViewProvider = n0gVar.w;
        this.sessionTimelineTracker = (g6y0) zzfVar.lh.get();
        this.coroutineScope = (tse) c0gVar.B.get();
        this.checkInStateViewPresenter = new a(n0gVar, (ney) c0gVar.E0.get(), (d980) n0gVar.x.get(), (c) zzfVar.bb.get(), (ci70) zzfVar.Ma.get(), f0gVar.a(), zzfVar.X0(), (ru.yandex.taxi.checkin.a) zzfVar.yn.get());
        afterConstruction();
    }

    private final void applyCheckInActionButtons(yfb checkInState, String checkInTitle) {
        int i = bgb.a[checkInState.d.ordinal()];
        int i2 = 0;
        if (i == 1) {
            j37 j37Var = checkInState.i;
            if (j37Var != null) {
                this.checkInButton.setTextIconTint(true);
                this.checkInButton.setButtonTitleColor(j37Var.b);
                this.checkInButton.setButtonBackground(j37Var.a);
            }
            this.checkInButton.setText(checkInTitle);
            checkInState.a.a(this.checkInButton, new agb(this, i2));
            this.checkInButton.setVisibility(0);
            this.checkInSliderButton.setVisibility(8);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                return;
            }
            w511.b();
        } else {
            this.checkInSliderButton.setTitleIdle(checkInTitle);
            this.checkInSliderButton.setSubtitleIdle(checkInState.g);
            this.checkInSliderButton.setSlideFinishedListener(new e90(9, this, checkInState));
            this.checkInSliderButton.setVisibility(0);
            this.checkInButton.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyCheckInActionButtons$lambda$1(CheckInStateView checkInStateView) {
        a checkInStateViewPresenter = checkInStateView.getCheckInStateViewPresenter();
        checkInStateViewPresenter.T.c(CheckInStateActionType.BUTTON.getAnalyticName());
        checkInStateViewPresenter.W.a(checkInStateViewPresenter.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyCheckInActionButtons$lambda$2(CheckInStateView checkInStateView, yfb yfbVar, int i, long j) {
        a checkInStateViewPresenter = checkInStateView.getCheckInStateViewPresenter();
        checkInStateViewPresenter.T.c(CheckInStateActionType.SLIDER.getAnalyticName());
        checkInStateViewPresenter.W.a(checkInStateViewPresenter.A);
        checkInStateView.checkInSliderButton.showProgressState();
        checkInStateView.checkInSliderButton.setTitleProgress(yfbVar.f);
        checkInStateView.checkInSliderButton.setSubtitleProgress(yfbVar.h);
    }

    private final void applyCheckInInstruction(String instructionTitle) {
        this.checkInInstruction.setVisibility(0);
        this.checkInInstruction.setText(instructionTitle);
        this.checkInInstruction.setDebounceClickListener(new agb(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyCheckInInstruction$lambda$0(CheckInStateView checkInStateView) {
        a checkInStateViewPresenter = checkInStateView.getCheckInStateViewPresenter();
        String str = checkInStateView.orderHolder().b().a;
        ActionType actionType = ActionType.CHECK_IN_INFO;
        checkInStateViewPresenter.T.c(actionType.getAnalyticAlias());
        checkInStateViewPresenter.U.a(str, actionType, ActionButtonsClickListener$SourceScreen.ORDER_DETAILS);
    }

    @Override // defpackage.zfb
    public void applyCheckInState(yfb state) {
        this.checkInDetailsButton.setVisibility(8);
        kfb1 kfb1Var = state.c;
        if (kfb1Var instanceof ic8) {
            ic8 ic8Var = (ic8) kfb1Var;
            applyCheckInInstruction(ic8Var.b);
            applyCheckInActionButtons(state, ic8Var.c);
        } else if (kfb1Var instanceof hc8) {
            hc8 hc8Var = (hc8) kfb1Var;
            applyCheckInInstruction(hc8Var.b);
            applyCheckInActionButtons(state, hc8Var.c);
        } else if (!(kfb1Var instanceof fc8)) {
            w511.b();
        } else {
            applyCheckInActionButtons(state, ((fc8) kfb1Var).b);
            this.checkInInstruction.setVisibility(8);
        }
    }

    public final a getCheckInStateViewPresenter() {
        a aVar = this.checkInStateViewPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public o getPresenter() {
        return getCheckInStateViewPresenter();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void inflateStateView() {
        inflate(zkh0.check_in_state_view);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        getCheckInStateViewPresenter().Rg(this);
        super.onAttachedToWindow();
        this.topCircleButtonsView.setActionClickListener(new cgb(0, this));
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getCheckInStateViewPresenter().Cg();
        this.checkInButton.finishProgress();
        this.checkInButton.setOnClickListener((Runnable) null);
        this.topCircleButtonsView.setActionClickListener(null);
    }

    public final void setCheckInStateViewPresenter(a aVar) {
        this.checkInStateViewPresenter = aVar;
    }

    @Override // defpackage.zfb
    public void updateTopActionButtons(List<xw> actionModels) {
        this.topCircleButtonsView.setVisibility(!actionModels.isEmpty() ? 0 : 8);
        this.topCircleButtonsView.updateActions(orderHolder().b().a, actionModels);
        getPresenter().Og(actionModels);
    }
}
