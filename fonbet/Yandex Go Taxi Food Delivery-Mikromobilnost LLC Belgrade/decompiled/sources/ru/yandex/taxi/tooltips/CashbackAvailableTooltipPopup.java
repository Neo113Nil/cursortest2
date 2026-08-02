package ru.yandex.taxi.tooltips;

import kotlin.Metadata;
import ru.yandex.taxi.widget.TooltipView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/tooltips/CashbackAvailableTooltipPopup;", "Lru/yandex/taxi/tooltips/BaseSummaryTooltipPopup;", "Lru/yandex/taxi/widget/TooltipView;", "tooltipView", "", "text", "<init>", "(Lru/yandex/taxi/widget/TooltipView;Ljava/lang/String;)V", "Lzy11;", "showTooltip", "()V", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CashbackAvailableTooltipPopup extends BaseSummaryTooltipPopup {
    public CashbackAvailableTooltipPopup(TooltipView tooltipView, String str) {
        super(tooltipView, str);
    }

    public abstract void showTooltip();
}
