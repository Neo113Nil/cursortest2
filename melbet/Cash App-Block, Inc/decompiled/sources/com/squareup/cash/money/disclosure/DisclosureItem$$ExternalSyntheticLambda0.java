package com.squareup.cash.money.disclosure;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DisclosureItem$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DisclosureItem f$0;

    public /* synthetic */ DisclosureItem$$ExternalSyntheticLambda0(DisclosureItem disclosureItem) {
        this.f$0 = disclosureItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        DisclosureItem disclosureItem = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) disclosureItem.moneyAnalyticsService)).submitSelectItemEvent(ItemId.DISCLOSURE.INSTANCE, null, MoneySelectAction.TAP);
                ((RealRouter) disclosureItem.router).route(new RoutingParams(null, null, null, null, null, null, 511), str);
                break;
            default:
                ((Integer) obj2).getClass();
                disclosureItem.UI((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DisclosureItem$$ExternalSyntheticLambda0(DisclosureItem disclosureItem, int i) {
        this.f$0 = disclosureItem;
    }
}
