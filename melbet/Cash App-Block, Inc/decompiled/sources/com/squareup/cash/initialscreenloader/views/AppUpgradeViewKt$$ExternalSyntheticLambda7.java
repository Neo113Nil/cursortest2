package com.squareup.cash.initialscreenloader.views;

import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.GenericErrorViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.InitiateSessionFailedViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.ScenarioPlanErrorViewEvent;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewEvent;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewEvent$KeyStatsDetailsClicked;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.PerformanceViewEvent$NavigationClick;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class AppUpgradeViewKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ AppUpgradeViewKt$$ExternalSyntheticLambda7(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AppUpgradeViewEvent.Close close = AppUpgradeViewEvent.Close.INSTANCE;
        AppUpgradeViewEvent.Upgrade upgrade = AppUpgradeViewEvent.Upgrade.INSTANCE;
        InstrumentSelectionBlockerViewEvent.CloseClick closeClick = InstrumentSelectionBlockerViewEvent.CloseClick.INSTANCE;
        TransferOptionPickerViewEvent.Dismissed dismissed = TransferOptionPickerViewEvent.Dismissed.INSTANCE;
        InvestingStockSelectionViewEvent.NavigationClicked navigationClicked = InvestingStockSelectionViewEvent.NavigationClicked.INSTANCE;
        InvestingExchangeViewEvent.DialogDismissed dialogDismissed = InvestingExchangeViewEvent.DialogDismissed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close);
                break;
            case 1:
                function1.invoke(close);
                break;
            case 2:
                function1.invoke(AppUpgradeViewEvent.OpenWebVersion.INSTANCE);
                break;
            case 3:
                function1.invoke(upgrade);
                break;
            case 4:
                function1.invoke(upgrade);
                break;
            case 5:
                function1.invoke(GenericErrorViewEvent.Close.INSTANCE);
                break;
            case 6:
                function1.invoke(GenericErrorViewEvent.SignOut.INSTANCE);
                break;
            case 7:
                function1.invoke(InitiateSessionFailedViewEvent.Close.INSTANCE);
                break;
            case 8:
                function1.invoke(InitiateSessionFailedViewEvent.Retry.INSTANCE);
                break;
            case 9:
                function1.invoke(ScenarioPlanErrorViewEvent.Retry.INSTANCE);
                break;
            case 10:
                function1.invoke(ScenarioPlanErrorViewEvent.Close.INSTANCE);
                break;
            case 11:
                function1.invoke(closeClick);
                break;
            case 12:
                function1.invoke(closeClick);
                break;
            case 13:
                function1.invoke(InstrumentSelectionBlockerViewEvent.CtaClick.INSTANCE);
                break;
            case 14:
                function1.invoke(InstrumentSelectionViewEvent.Submit.INSTANCE);
                break;
            case 15:
                function1.invoke(InstrumentSelectionViewEvent.Close.INSTANCE);
                break;
            case 16:
                function1.invoke(dismissed);
                break;
            case 17:
                function1.invoke(dismissed);
                break;
            case 18:
                function1.invoke(TransferOptionPickerViewEvent.ContinueTapped.INSTANCE);
                break;
            case 19:
                function1.invoke(dialogDismissed);
                break;
            case 20:
                function1.invoke(dialogDismissed);
                break;
            case 21:
                function1.invoke(dialogDismissed);
                break;
            case 22:
                function1.invoke(InvestingExchangeViewEvent.AgreeToSellAll.INSTANCE);
                function1.invoke(dialogDismissed);
                break;
            case 23:
                function1.invoke(InvestingDetailTileViewEvent$KeyStatsDetailsClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(PerformanceViewEvent$NavigationClick.INSTANCE);
                break;
            case 25:
                function1.invoke(navigationClicked);
                break;
            case 26:
                function1.invoke(navigationClicked);
                break;
            case 27:
                function1.invoke(new InvestingStockSelectionViewEvent.SubmitMultiSelection(EmptySet.INSTANCE));
                break;
            case 28:
                function1.invoke(InvestingStockDetailsViewEvent.FirstButtonTap.INSTANCE);
                break;
            default:
                function1.invoke(InvestingStockDetailsViewEvent.SecondButtonTap.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
