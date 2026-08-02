package ru.yandex.taxi.tooltips;

import defpackage.eb5;
import defpackage.ux31;
import defpackage.xb5;
import kotlin.Metadata;
import ru.yandex.taxi.widget.TooltipView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/tooltips/BaseTariffTooltipPopup;", "Lru/yandex/taxi/tooltips/BaseSummaryTooltipPopup;", "Lru/yandex/taxi/widget/TooltipView;", "tooltip", "Lxb5;", "presenter", "", "text", "<init>", "(Lru/yandex/taxi/widget/TooltipView;Lxb5;Ljava/lang/String;)V", "Lux31;", "visibleState", "Lzy11;", "invalidateVisibleState", "(Lux31;)V", "", "selectedTariff", "showTooltip", "(I)V", "Lxb5;", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseTariffTooltipPopup extends BaseSummaryTooltipPopup {
    protected final xb5 presenter;

    public BaseTariffTooltipPopup(TooltipView tooltipView, xb5 xb5Var, String str) {
        super(tooltipView, str);
        this.presenter = xb5Var;
    }

    public void invalidateVisibleState(ux31 visibleState) {
        xb5 xb5Var = this.presenter;
        int i = xb5Var.w;
        if (i >= 0) {
            if (visibleState.a > i || i > visibleState.b) {
                ((eb5) xb5Var.Dg()).dismiss();
            }
        }
    }

    public void showTooltip(int selectedTariff) {
        this.presenter.Jg(selectedTariff);
    }
}
