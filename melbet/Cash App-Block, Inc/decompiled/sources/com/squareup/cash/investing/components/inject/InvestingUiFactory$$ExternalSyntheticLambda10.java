package com.squareup.cash.investing.components.inject;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingUiFactory$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ InvestingRecurringPurchaseReceiptViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingUiFactory$$ExternalSyntheticLambda10(InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel, Function1 function1) {
        this.f$0 = investingRecurringPurchaseReceiptViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    AutoInvestPurchaseKt.AutoInvestPurchase(investingRecurringPurchaseReceiptViewModel, function1, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AutoInvestPurchaseKt.AutoInvestPurchase(investingRecurringPurchaseReceiptViewModel, function1, Modifier.Companion.$$INSTANCE, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(377737606, new AutoInvestPurchaseKt$$ExternalSyntheticLambda4(investingRecurringPurchaseReceiptViewModel, function1), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingUiFactory$$ExternalSyntheticLambda10(InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel, Function1 function1, int i) {
        this.f$0 = investingRecurringPurchaseReceiptViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ InvestingUiFactory$$ExternalSyntheticLambda10(Function1 function1, InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel) {
        this.f$1 = function1;
        this.f$0 = investingRecurringPurchaseReceiptViewModel;
    }
}
