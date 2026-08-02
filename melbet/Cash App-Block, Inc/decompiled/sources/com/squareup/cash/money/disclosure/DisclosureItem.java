package com.squareup.cash.money.disclosure;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.google.android.gms.internal.mlkit_genai_prompt.zzade;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionItemViewModel;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.viewmodels.api.Item;
import kotlin.jvm.functions.Function2;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes6.dex */
public final class DisclosureItem implements Item {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object disclosure;
    public final Object moneyAnalyticsService;
    public final Object router;

    public DisclosureItem(MoreWaysToAddMoneySectionItemViewModel moreWaysToAddMoneySectionItemViewModel, BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5) {
        moreWaysToAddMoneySectionItemViewModel.getClass();
        this.disclosure = moreWaysToAddMoneySectionItemViewModel;
        this.router = bankingDialogKt$$ExternalSyntheticLambda5;
        this.moneyAnalyticsService = new ItemId.DEPOSIT(moreWaysToAddMoneySectionItemViewModel.id);
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final void UI(Composer composer, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.disclosure;
        int i3 = 4;
        switch (i2) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(1782380149);
                int i4 = (gapComposer.changed(this) ? 4 : 2) | i;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 3) != 2)) {
                    DisclosureItemModel disclosureItemModel = (DisclosureItemModel) obj;
                    boolean z = (i4 & 14) == 4;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new DisclosureItem$$ExternalSyntheticLambda0(this);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    OverdraftStatus.State_.DisclosureUI(disclosureItemModel, (Function2) rememberedValue, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new DisclosureItem$$ExternalSyntheticLambda0(this, i);
                    break;
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-1364760156);
                int i5 = (gapComposer2.changed(this) ? 4 : 2) | i;
                if (gapComposer2.shouldExecute(i5 & 1, (i5 & 3) != 2)) {
                    MoreWaysToAddMoneySectionItemViewModel moreWaysToAddMoneySectionItemViewModel = (MoreWaysToAddMoneySectionItemViewModel) obj;
                    zzade.AddMoneyOptionRow(moreWaysToAddMoneySectionItemViewModel.icon, moreWaysToAddMoneySectionItemViewModel.title, (BankingDialogKt$$ExternalSyntheticLambda5) this.router, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new CashtagViewKt$$ExternalSyntheticLambda10(this, i, i3);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final ItemId getId() {
        switch (this.$r8$classId) {
            case 0:
                return ItemId.DISCLOSURE.INSTANCE;
            default:
                return (ItemId.DEPOSIT) this.moneyAnalyticsService;
        }
    }

    public DisclosureItem(DisclosureItemModel disclosureItemModel, RealRouter realRouter, MoneyAnalyticsService moneyAnalyticsService) {
        disclosureItemModel.getClass();
        realRouter.getClass();
        this.disclosure = disclosureItemModel;
        this.router = realRouter;
        this.moneyAnalyticsService = moneyAnalyticsService;
    }
}
