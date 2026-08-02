package com.squareup.cash.cashapppay.views;

import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.StampSheetViewEvent;
import com.squareup.cash.card.onboarding.TagOrderConfirmationViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.RecurringPaymentInfoEvent$Exit;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightHomeViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewEvent;
import com.squareup.cash.cashapppay.settings.viewmodels.GoBack;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewEvent;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewEvent;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewEvent;
import com.squareup.cash.cashapppay.viewmodels.GrantViewEvent;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StampSheetViewEvent.Cancel cancel = StampSheetViewEvent.Cancel.INSTANCE;
        GrantViewEvent.Dismiss dismiss = GrantViewEvent.Dismiss.INSTANCE;
        StatusInterstitialViewEvent.Finished finished = StatusInterstitialViewEvent.Finished.INSTANCE;
        LiteCashInViewEvent.BackClicked backClicked = LiteCashInViewEvent.BackClicked.INSTANCE;
        GrantViewEvent.OnDisplayInterstitialComplete onDisplayInterstitialComplete = GrantViewEvent.OnDisplayInterstitialComplete.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(onDisplayInterstitialComplete);
                break;
            case 1:
                function1.invoke(PaymentDeviceCustomizationViewEvent.Close.INSTANCE);
                break;
            case 2:
                function1.invoke(cancel);
                break;
            case 3:
                function1.invoke(cancel);
                break;
            case 4:
                function1.invoke(TagOrderConfirmationViewEvent.Close.INSTANCE);
                break;
            case 5:
                function1.invoke(TagOrderConfirmationViewEvent.Continue.INSTANCE);
                break;
            case 6:
                function1.invoke(PaymentDeviceCustomizationViewEvent.CloseProductDetailsPage.INSTANCE);
                break;
            case 7:
                function1.invoke(RecurringPaymentInfoEvent$Exit.INSTANCE);
                break;
            case 8:
                function1.invoke(SpendingInsightDetailViewEvent.Exit.INSTANCE);
                break;
            case 9:
                function1.invoke(SpendingInsightHomeViewEvent.Exit.INSTANCE);
                break;
            case 10:
                function1.invoke(LiteAddMoneyViewEvent.DismissClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(LiteBalanceHomeViewEvent.BackClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(backClicked);
                break;
            case 13:
                function1.invoke(backClicked);
                break;
            case 14:
                function1.invoke(backClicked);
                break;
            case 15:
                function1.invoke(GoBack.INSTANCE);
                break;
            case 16:
                function1.invoke(RemoveLinkedBusinessViewEvent.Remove.INSTANCE);
                break;
            case 17:
                function1.invoke(RemoveLinkedBusinessViewEvent.Cancel.INSTANCE);
                break;
            case 18:
                function1.invoke(LinkedBusinessDetailsViewEvent.Close.INSTANCE);
                break;
            case 19:
                function1.invoke(LinkedBusinessDetailsViewEvent.RemoveClick.INSTANCE);
                break;
            case 20:
                function1.invoke(UnlinkResultViewEvent.CloseClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(UnlinkResultViewEvent.CtaClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(dismiss);
                break;
            case 23:
                function1.invoke(onDisplayInterstitialComplete);
                break;
            case 24:
                function1.invoke(dismiss);
                break;
            case 25:
                function1.invoke(GrantViewEvent.InTransactionTopUpInfoClosed.INSTANCE);
                break;
            case 26:
                function1.invoke(onDisplayInterstitialComplete);
                break;
            case 27:
                int i2 = StatusInterstitialScreen.$r8$clinit;
                function1.invoke(finished);
                break;
            case 28:
                function1.invoke(StatusInterstitialViewEvent.Dismiss.INSTANCE);
                break;
            default:
                function1.invoke(finished);
                break;
        }
        return Unit.INSTANCE;
    }
}
