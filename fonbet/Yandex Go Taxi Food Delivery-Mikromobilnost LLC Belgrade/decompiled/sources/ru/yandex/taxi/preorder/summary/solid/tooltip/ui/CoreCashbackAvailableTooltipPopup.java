package ru.yandex.taxi.preorder.summary.solid.tooltip.ui;

import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.b29;
import defpackage.cne0;
import defpackage.eb5;
import defpackage.fb5;
import defpackage.rpt0;
import defpackage.sls;
import defpackage.u49;
import defpackage.v4a;
import defpackage.xxc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.tooltips.CashbackAvailableTooltipPopup;
import ru.yandex.taxi.widget.TooltipView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0010R\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/preorder/summary/solid/tooltip/ui/CoreCashbackAvailableTooltipPopup;", "Lru/yandex/taxi/tooltips/CashbackAvailableTooltipPopup;", "Lru/yandex/taxi/widget/TooltipView;", "tooltip", "Lb29;", "presenter", "", "text", "<init>", "(Lru/yandex/taxi/widget/TooltipView;Lb29;Ljava/lang/String;)V", "Lzy11;", "showTooltip", "()V", "attach", "detach", "Lb29;", "Lfb5;", "Lru/yandex/taxi/tooltips/BaseSummaryTooltipPopup;", "innerMvpView", "Lfb5;", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoreCashbackAvailableTooltipPopup extends CashbackAvailableTooltipPopup {
    private final fb5 innerMvpView;
    private final b29 presenter;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.solid.tooltip.ui.CoreCashbackAvailableTooltipPopup$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            l lVar;
            b29 b29Var = (b29) this.receiver;
            xxc g = b29Var.y.b.g();
            if (g != null) {
                i iVar = (i) b29Var.x;
                iVar.getClass();
                if (!g.a()) {
                    iVar.i(g, null, true);
                }
                lVar = b29Var.z.a.presenter;
                ((rpt0) lVar.X2).b(null, null);
                ((eb5) b29Var.Dg()).dismiss();
            }
            return zy11.a;
        }
    }

    public CoreCashbackAvailableTooltipPopup(TooltipView tooltipView, b29 b29Var, String str) {
        super(tooltipView, str);
        this.presenter = b29Var;
        this.innerMvpView = new fb5(this);
        c.z(new AnonymousClass1(0, b29Var, b29.class, "onCashbackAvailableTooltipClicked", "onCashbackAvailableTooltipClicked()V", 0), asView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTooltip$tooltipShowed(b29 b29Var) {
        ((cne0) ((u49) b29Var.w).a.b).u("ru.yandex.taxi.cashback.onboarding.CASHBACK_PAYMENT_AVAILABLE_SHOWED", true);
    }

    @Override // ru.yandex.taxi.tooltips.BaseSummaryTooltipPopup
    public void attach() {
        this.presenter.Bg(this.innerMvpView);
    }

    @Override // ru.yandex.taxi.tooltips.BaseSummaryTooltipPopup
    public void detach() {
        super.detach();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.tooltips.CashbackAvailableTooltipPopup
    public void showTooltip() {
        this.innerMvpView.t8(5000L, new v4a(22, this.presenter));
    }
}
