package ru.yandex.taxi.tooltips;

import defpackage.eb5;
import defpackage.fb5;
import defpackage.gvz0;
import defpackage.hrx0;
import defpackage.k4c0;
import defpackage.sls;
import defpackage.ux31;
import defpackage.xb5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.TooltipView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0018R\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/tooltips/CashbackTariffTooltipPopup;", "Lru/yandex/taxi/tooltips/BaseTariffTooltipPopup;", "Lru/yandex/taxi/widget/TooltipView;", "tooltip", "Lhrx0;", "cashbackPresenter", "", "text", "<init>", "(Lru/yandex/taxi/widget/TooltipView;Lhrx0;Ljava/lang/String;)V", "Lzy11;", "attach", "()V", "detach", "dismiss", "", "selectedTariffPosition", "showTooltip", "(I)V", "Lux31;", "visibleState", "invalidateVisibleState", "(Lux31;)V", "Lhrx0;", "Lfb5;", "Lru/yandex/taxi/tooltips/BaseSummaryTooltipPopup;", "innerMvpView", "Lfb5;", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackTariffTooltipPopup extends BaseTariffTooltipPopup {
    private final hrx0 cashbackPresenter;
    private final fb5 innerMvpView;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.tooltips.CashbackTariffTooltipPopup$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((xb5) this.receiver).Kg();
            return zy11.a;
        }
    }

    public CashbackTariffTooltipPopup(TooltipView tooltipView, hrx0 hrx0Var, String str) {
        super(tooltipView, hrx0Var, str);
        this.cashbackPresenter = hrx0Var;
        this.innerMvpView = new fb5(this);
        c.z(new AnonymousClass1(0, this.presenter, xb5.class, "tooltipClicked", "tooltipClicked()V", 0), asView());
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

    @Override // android.widget.PopupWindow
    public void dismiss() {
        Object value;
        LinkedHashMap linkedHashMap;
        super.dismiss();
        hrx0 hrx0Var = this.cashbackPresenter;
        gvz0 gvz0Var = hrx0Var.z;
        k4c0 k4c0Var = hrx0Var.A;
        r0 r0Var = gvz0Var.a;
        do {
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.remove(k4c0Var);
        } while (!r0Var.k(value, linkedHashMap));
    }

    @Override // ru.yandex.taxi.tooltips.BaseTariffTooltipPopup
    public void invalidateVisibleState(ux31 visibleState) {
        xb5 xb5Var = this.presenter;
        int i = xb5Var.w;
        if (i >= 0) {
            if (visibleState.a > i || i > visibleState.b) {
                ((eb5) xb5Var.Dg()).dismiss();
            }
        }
    }

    @Override // ru.yandex.taxi.tooltips.BaseTariffTooltipPopup
    public void showTooltip(int selectedTariffPosition) {
        this.presenter.Jg(selectedTariffPosition);
    }
}
