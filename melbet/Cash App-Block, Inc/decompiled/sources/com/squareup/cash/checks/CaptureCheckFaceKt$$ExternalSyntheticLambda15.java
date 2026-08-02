package com.squareup.cash.checks;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel;
import com.squareup.cash.cashapplite.viewmodels.AddMoneyRowId;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantClicked;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapUndo;
import com.squareup.cash.checks.CaptureCheckFaceViewEvent;
import com.squareup.cash.checks.ConfirmBackOfCheckEvent;
import com.squareup.cash.checks.ConfirmFrontOfCheckEvent;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.directDeposit.DirectDepositRouter;
import com.squareup.cash.filepicker.MimeType;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda15 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (com.squareup.cash.util.money.Moneys.compareTo((com.squareup.protos.common.Money) r3.getValue(), r6) <= 0) goto L19;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = true;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((MiSnapState) obj2).torchEnabled$delegate.setValue(Boolean.FALSE);
                ((Function1) obj).invoke(CaptureCheckFaceViewEvent.GoBack.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                ((Function1) obj).invoke(new BorrowHomeViewEvent.TapUpsellCard((BorrowAppletBulletinsTile.Data.UpsellCard) obj2));
                return Unit.INSTANCE;
            case 2:
                BorrowAppletCreditLimitAndBorrowButtonTile.Data data = ((BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel) obj2).tileData;
                InitiateLoanData initiateLoanData = data.picker_data;
                initiateLoanData.getClass();
                Money money = data.available_credit_amount;
                money.getClass();
                ((Function1) obj).invoke(new BorrowHomeViewEvent.TapCreditLimitAndBorrowPrimaryButton(initiateLoanData, money));
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj).invoke(new FirstTimeBorrowViewEvent.SecondaryButtonClick(((FirstTimeBorrowViewModel.Content.SecondaryButton) obj2).submitId));
                return Unit.INSTANCE;
            case 4:
                ((Function1) obj).invoke(new BorrowHomeOverlayEvent.RepaymentSheetEvent.InitiateRepayment(((BorrowHomeOverlayViewModel.SheetButton) obj2).action));
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj).invoke((BorrowHomeOverlayEvent.RepaymentSheetEvent.TapAction) obj2);
                return Unit.INSTANCE;
            case 6:
                BorrowAppletLoanHistoryTile.Data.Loan.Details details = ((BorrowAppletLoanHistoryTile.Data.Loan) obj2).loan_details;
                details.getClass();
                ((Function1) obj).invoke(details);
                return Unit.INSTANCE;
            case 7:
                ((Function1) obj).invoke(new BorrowHomeViewEvent.TapPaymentTimelinePrimaryButton(((BorrowHomeViewModel.Tile.PaymentTimelineTileModel) obj2).buttonAction));
                return Unit.INSTANCE;
            case 8:
                ((BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj2).invoke(new BorrowHomeOverlayEvent.RepaymentSheetEvent.InitiateRepayment(((BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice) obj).tapAction));
                return Unit.INSTANCE;
            case 9:
                RealFilePicker realFilePicker = (RealFilePicker) obj2;
                realFilePicker.getClass();
                realFilePicker.tryLaunch(new MimeType("image/*,video/*"));
                NavAction$$ExternalSyntheticOutline0.m(1, (ParcelableSnapshotMutableIntState) obj);
                return Unit.INSTANCE;
            case 10:
                ((Function1) obj).invoke(new BugReportingViewEvent.RemoveScreenshot(((Screenshot) obj2).uri));
                return Unit.INSTANCE;
            case 11:
                ((Function1) obj).invoke(new AfterPayOrderDetailsViewEvent.PayEarlyButtonClicked(((ActionButton) obj2).actionUrl));
                return Unit.INSTANCE;
            case 12:
                ((Function1) obj).invoke(new AfterPayOrderDetailsViewEvent.OverflowMenuClicked(((AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel) ((AfterPayOrderDetailsViewModel) obj2)).overflowActions));
                return Unit.INSTANCE;
            case 13:
                ((Function1) obj).invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndo(Boolean.FALSE)));
                ((PatternStampState) obj2).undo();
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj).invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndo(Boolean.FALSE)));
                ((StampState) obj2).undo();
                return Unit.INSTANCE;
            case 15:
                ((SnapshotStateList) obj2).add(new SsnViewKt$$ExternalSyntheticLambda4((PatternStampState) obj, 11));
                return Unit.INSTANCE;
            case 16:
                CardDesignLibraryState cardDesignLibraryState = (CardDesignLibraryState) obj2;
                Function1 function1 = (Function1) obj;
                if (cardDesignLibraryState.getZoomLevel() == ZoomLevel.NEAR) {
                    Function0 function0 = cardDesignLibraryState.onZoomOut;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    function1.invoke(PaymentDeviceCustomizationViewEvent.Close.INSTANCE);
                }
                return Unit.INSTANCE;
            case 17:
                CardDesignLibraryState cardDesignLibraryState2 = (CardDesignLibraryState) obj2;
                MutableState mutableState = (MutableState) obj;
                ZoomLevel zoomLevel = cardDesignLibraryState2.getZoomLevel();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardDesignLibraryState2.focusedCardIndex$delegate;
                if (zoomLevel != ZoomLevel.NEAR) {
                    return null;
                }
                int intValue = parcelableSnapshotMutableIntState.getIntValue();
                int i2 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                if (intValue < ((List) mutableState.getValue()).size()) {
                    return (PaymentDeviceItemViewModel) ((List) mutableState.getValue()).get(parcelableSnapshotMutableIntState.getIntValue());
                }
                return null;
            case 18:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj2;
                int ordinal = ((ZoomLevel) ((MutableState) obj).getValue()).ordinal();
                if (ordinal == 0) {
                    cardDesignLibraryScene.zoomIn();
                } else if (ordinal == 1) {
                    cardDesignLibraryScene.zoomOut();
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 19:
                MutableState mutableState2 = (MutableState) obj2;
                return new Vector4(((LightSource) mutableState2.getValue()).x, ((LightSource) mutableState2.getValue()).y, ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj)).getFloatValue(), RecyclerView.DECELERATION_RATE);
            case 20:
                ((Function1) obj).invoke(((SpendingInsightDetailViewModel.Content.Button) obj2).action);
                return Unit.INSTANCE;
            case 21:
                ((Function1) obj).invoke(new SpendingInsightDetailViewEvent.MerchantRowTapped(((StackedBarChartViewModel.Bar) obj2).action));
                return Unit.INSTANCE;
            case 22:
                ((Function1) obj).invoke(((SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow) obj2).action);
                return Unit.INSTANCE;
            case 23:
                ((Function1) obj).invoke(new LiteAddMoneyViewEvent.RowClicked((AddMoneyRowId) obj2));
                return Unit.INSTANCE;
            case 24:
                ((Function1) obj).invoke(new LiteBalanceHomeViewEvent.RowClicked(((LiteBalanceHomeViewModel.AccountDetailRow) obj2).id));
                return Unit.INSTANCE;
            case 25:
                ((Function1) obj).invoke(new BusinessGrantClicked((CashAppPaySettingsRowViewModel$BusinessViewModel) obj2));
                return Unit.INSTANCE;
            case 26:
                CheckDepositAmountPresenter checkDepositAmountPresenter = (CheckDepositAmountPresenter) obj2;
                MutableState mutableState3 = (MutableState) obj;
                if (((Money) mutableState3.getValue()) != null) {
                    Money money2 = new Money((Long) 1L, CurrencyCode.USD, 4);
                    CheckDepositBlocker.AmountEntryData amountEntryData = checkDepositAmountPresenter.args.checkDepositBlocker.amount_entry_data;
                    amountEntryData.getClass();
                    Money money3 = amountEntryData.maximum_amount;
                    money3.getClass();
                    if (Moneys.compareTo((Money) mutableState3.getValue(), money2) >= 0) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 27:
                ((Function1) obj).invoke(new ConfirmBackOfCheckEvent.ConfirmCheckChange(!((ConfirmBackOfCheckViewModel) obj2).isConfirmationChecked));
                return Unit.INSTANCE;
            case 28:
                ((Function1) obj).invoke(new ConfirmFrontOfCheckEvent.ConfirmCheckChange(!((ConfirmFrontOfCheckViewModel) obj2).isConfirmationChecked));
                return Unit.INSTANCE;
            default:
                return ((RealRouter$Factory$Impl) obj2).create$1(((DirectDepositRouter) obj).navigator);
        }
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda15(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }
}
