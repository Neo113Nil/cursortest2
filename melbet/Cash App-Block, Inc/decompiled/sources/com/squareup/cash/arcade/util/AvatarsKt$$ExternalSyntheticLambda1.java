package com.squareup.cash.arcade.util;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import coil3.compose.AsyncImagePainter;
import com.fillr.e;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.arcade.components.CopyCodeState;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewEvent;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewEvent;
import com.squareup.cash.banking.viewmodels.TransfersInstructionsEvent;
import com.squareup.cash.banking.viewmodels.TransfersViewModel$Companion$TransfersTab;
import com.squareup.cash.banking.views.RecurringDepositsView;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewEvent;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewEvent$GraphEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.news.BitcoinHomeNewsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerEvent;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewEvent$Exit;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewEvent;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.transfers.screens.BalanceBasedAddCashDisabledDialogScreen;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarsKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        BitcoinKeypadAmountPickerEvent.MaxButtonClicked maxButtonClicked = BitcoinKeypadAmountPickerEvent.MaxButtonClicked.INSTANCE;
        BitcoinKeypadAmountPickerEvent.NoteClicked noteClicked = BitcoinKeypadAmountPickerEvent.NoteClicked.INSTANCE;
        BitcoinKeypadAmountPickerEvent.ButtonClicked buttonClicked = BitcoinKeypadAmountPickerEvent.ButtonClicked.INSTANCE;
        BitcoinKeypadAmountPickerEvent.QrCodeScannerClicked qrCodeScannerClicked = BitcoinKeypadAmountPickerEvent.QrCodeScannerClicked.INSTANCE;
        BitcoinKeypadAmountPickerEvent.CloseButtonClicked closeButtonClicked = BitcoinKeypadAmountPickerEvent.CloseButtonClicked.INSTANCE;
        BitcoinKeypadAmountPickerEvent.ChangeCurrencyClicked changeCurrencyClicked = BitcoinKeypadAmountPickerEvent.ChangeCurrencyClicked.INSTANCE;
        Object obj2 = null;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) obj;
                error.getClass();
                function1.invoke(error.result.throwable);
                break;
            case 1:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                function1.invoke(new FilterBarScope(lazyListScope));
                break;
            case 2:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                function1.invoke(new LazyScaffoldContentScope(lazyListScope2));
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (function1 != null) {
                    function1.invoke(bool);
                }
                break;
            case 4:
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj;
                appMessageViewEvent.getClass();
                if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageActionTaken) {
                    function1.invoke(BalanceHomeViewEvent.OverdraftUpsellClicked.INSTANCE);
                }
                break;
            case 5:
                ((CopyCodeState) obj).getClass();
                function1.invoke(new BalanceHomeViewEvent.CopyNumber(BalanceHomeViewEvent.CopyNumber.Type.ROUTING));
                break;
            case 6:
                ((CopyCodeState) obj).getClass();
                function1.invoke(new BalanceHomeViewEvent.CopyNumber(BalanceHomeViewEvent.CopyNumber.Type.ACCOUNT));
                break;
            case 7:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new BenefitsLeafletViewEvent.CallToActionButtonClicked(str, BenefitsLeafletViewEvent.CallToActionButtonClicked.Level.Secondary));
                break;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new BenefitsLeafletViewEvent.CallToActionButtonClicked(str2, BenefitsLeafletViewEvent.CallToActionButtonClicked.Level.Primary));
                break;
            case 9:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                int i2 = RecurringDepositsView.$r8$clinit;
                dialogListenerEvent.getClass();
                if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                    Screen screen = onDialogResult.screen;
                    if (onDialogResult.result == AlertDialogResult.POSITIVE && (screen instanceof BalanceBasedAddCashDisabledDialogScreen)) {
                        function1.invoke(new RecurringDepositsViewEvent.BalanceBasedLockedConfirmedClick(((BalanceBasedAddCashDisabledDialogScreen) screen).clientRoute));
                    }
                }
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                TransfersViewModel$Companion$TransfersTab.Companion.getClass();
                function1.invoke(new TransfersInstructionsEvent.TabClick(e.fromId(intValue)));
                break;
            case 11:
                BitcoinKeypadAmountPickerEvent bitcoinKeypadAmountPickerEvent = (BitcoinKeypadAmountPickerEvent) obj;
                bitcoinKeypadAmountPickerEvent.getClass();
                if (!(bitcoinKeypadAmountPickerEvent instanceof BitcoinKeypadAmountPickerEvent.AmountEntered)) {
                    if (!bitcoinKeypadAmountPickerEvent.equals(buttonClicked)) {
                        if (!bitcoinKeypadAmountPickerEvent.equals(changeCurrencyClicked)) {
                            if (!bitcoinKeypadAmountPickerEvent.equals(closeButtonClicked)) {
                                if (!bitcoinKeypadAmountPickerEvent.equals(noteClicked)) {
                                    if (!bitcoinKeypadAmountPickerEvent.equals(qrCodeScannerClicked) && !bitcoinKeypadAmountPickerEvent.equals(maxButtonClicked)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    }
                                } else {
                                    obj2 = BitcoinAmountViewEvent.AddNote.INSTANCE;
                                }
                            } else {
                                obj2 = BitcoinAmountViewEvent.BackPressed.INSTANCE;
                            }
                        } else {
                            obj2 = BitcoinAmountViewEvent.SwitchCurrency.INSTANCE;
                        }
                    } else {
                        obj2 = BitcoinAmountViewEvent.ConfirmPressed.INSTANCE;
                    }
                } else {
                    obj2 = new BitcoinAmountViewEvent.AmountChanged(((BitcoinKeypadAmountPickerEvent.AmountEntered) bitcoinKeypadAmountPickerEvent).rawAmount);
                }
                if (obj2 != null) {
                    function1.invoke(obj2);
                }
                break;
            case 12:
                function1.invoke(Integer.valueOf((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax)));
                break;
            case 13:
                function1.invoke(new BitcoinHomeGraphWidgetViewEvent$GraphEvent(new InvestingGraphViewEvent.ScrubPoint((InvestingGraphContentModel.Point) obj)));
                break;
            case 14:
                HistoricalRange historicalRange = (HistoricalRange) obj;
                historicalRange.getClass();
                function1.invoke(new BitcoinHomeGraphWidgetViewEvent$GraphEvent(new InvestingGraphViewEvent.SelectRange(historicalRange)));
                break;
            case 15:
                InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = (InvestingCryptoNewsViewEvent) obj;
                investingCryptoNewsViewEvent.getClass();
                function1.invoke(new BitcoinHomeNewsWidgetViewEvent(investingCryptoNewsViewEvent));
                break;
            case 16:
                AmountSelection amountSelection = (AmountSelection) obj;
                amountSelection.getClass();
                function1.invoke(new BitcoinTransferViewEvent.ItemSelected(amountSelection));
                break;
            case 17:
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                FilterBarScope.legacyChip$default(filterBarScope, new BitcoinLocationViewKt$$ExternalSyntheticLambda1(12, function1), null, false, false, null, "25%", BitcoinExchangeViewKt.lambda$717609880, 22);
                FilterBarScope.legacyChip$default(filterBarScope, new BitcoinLocationViewKt$$ExternalSyntheticLambda1(13, function1), null, false, false, null, "50%", BitcoinExchangeViewKt.f261lambda$455661375, 22);
                FilterBarScope.legacyChip$default(filterBarScope, new BitcoinLocationViewKt$$ExternalSyntheticLambda1(14, function1), null, false, false, null, "Max", BitcoinExchangeViewKt.lambda$1041784736, 22);
                break;
            case 18:
                BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = (BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) obj;
                bitcoinPerformanceDetailsSectionInfoItem.getClass();
                function1.invoke(new BitcoinPerformanceDetailsViewEvent.InfoItemClicked(bitcoinPerformanceDetailsSectionInfoItem));
                break;
            case 19:
                BitcoinKeypadAmountPickerEvent bitcoinKeypadAmountPickerEvent2 = (BitcoinKeypadAmountPickerEvent) obj;
                bitcoinKeypadAmountPickerEvent2.getClass();
                if (!(bitcoinKeypadAmountPickerEvent2 instanceof BitcoinKeypadAmountPickerEvent.AmountEntered)) {
                    if (!bitcoinKeypadAmountPickerEvent2.equals(changeCurrencyClicked)) {
                        if (!bitcoinKeypadAmountPickerEvent2.equals(closeButtonClicked)) {
                            if (!bitcoinKeypadAmountPickerEvent2.equals(qrCodeScannerClicked)) {
                                if (!bitcoinKeypadAmountPickerEvent2.equals(buttonClicked)) {
                                    if (!bitcoinKeypadAmountPickerEvent2.equals(noteClicked)) {
                                        if (!bitcoinKeypadAmountPickerEvent2.equals(maxButtonClicked)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            obj2 = MoveBitcoinEvent.MaxSend.INSTANCE;
                                        }
                                    }
                                } else {
                                    obj2 = MoveBitcoinEvent.Withdraw.INSTANCE;
                                }
                            } else {
                                obj2 = MoveBitcoinEvent.ScanQrCode.INSTANCE;
                            }
                        } else {
                            obj2 = MoveBitcoinEvent.ClosePressed.INSTANCE;
                        }
                    } else {
                        obj2 = MoveBitcoinEvent.SwitchCurrency.INSTANCE;
                    }
                } else {
                    obj2 = new MoveBitcoinEvent.AmountChanged(((BitcoinKeypadAmountPickerEvent.AmountEntered) bitcoinKeypadAmountPickerEvent2).rawAmount);
                }
                if (obj2 != null) {
                    function1.invoke(obj2);
                }
                break;
            case 20:
                BitcoinTransferViewEvent bitcoinTransferViewEvent = (BitcoinTransferViewEvent) obj;
                bitcoinTransferViewEvent.getClass();
                if (bitcoinTransferViewEvent instanceof BitcoinTransferViewEvent.PercentageSelected) {
                    function1.invoke(new SendStablecoinEvent.PercentageSelected(((BitcoinTransferViewEvent.PercentageSelected) bitcoinTransferViewEvent).percentage));
                } else {
                    boolean equals = bitcoinTransferViewEvent.equals(BitcoinTransferViewEvent.CloseButtonClicked.INSTANCE);
                    SendStablecoinEvent.ClosePressed closePressed = SendStablecoinEvent.ClosePressed.INSTANCE;
                    if (equals) {
                        function1.invoke(closePressed);
                    } else if (bitcoinTransferViewEvent.equals(BitcoinTransferViewEvent.OnBackPressed.INSTANCE)) {
                        function1.invoke(closePressed);
                    }
                }
                break;
            case 21:
                FilePickerResult filePickerResult = (FilePickerResult) obj;
                filePickerResult.getClass();
                function1.invoke(new FilesetUploadViewEvent.SystemFileSelected(filePickerResult));
                break;
            case 22:
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                amountPickerViewEvent.getClass();
                if (!amountPickerViewEvent.equals(AmountPickerViewEvent$Full$Close.INSTANCE) && !amountPickerViewEvent.equals(AmountPickerViewEvent$Full$SystemBack.INSTANCE)) {
                    if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted)) {
                        if (!amountPickerViewEvent.equals(AmountPickerViewEvent$Full$HelpClicked.INSTANCE) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemSelected) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneyChanged) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        function1.invoke(new AtmPickerAmountBlockerViewEvent.ConfirmKeypadAmount(((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent).amount));
                    }
                } else {
                    function1.invoke(AtmPickerAmountBlockerViewEvent.Dismiss.INSTANCE);
                }
                break;
            case 23:
                ((DialogListenerEvent) obj).getClass();
                function1.invoke(AuthorizeGooglePayViewEvent$Exit.INSTANCE);
                break;
            case 24:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    Object obj3 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent2).result;
                    if (obj3 instanceof HelpItem) {
                        function1.invoke(new BankAccountLinkingViewEvent.HelpItemClick((HelpItem) obj3));
                    }
                }
                break;
            case 25:
                function1.invoke(new CalendarBlockerViewEvent.ToggleOption(((Boolean) obj).booleanValue()));
                break;
            case 26:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                function1.invoke(new CalendarBlockerViewEvent.DateSelected(localDate));
                break;
            case 27:
                function1.invoke(new EarnerEnrollmentBlockerViewEvent.IndividualCertificationChanged(((Boolean) obj).booleanValue()));
                break;
            case 28:
                function1.invoke(new EarnerEnrollmentBlockerViewEvent.LegalAgreementChanged(((Boolean) obj).booleanValue()));
                break;
            default:
                EarnerCategory earnerCategory = (EarnerCategory) obj;
                earnerCategory.getClass();
                function1.invoke(new EarnerEnrollmentBlockerViewEvent.EarnerCategorySelectionChanged(earnerCategory));
                break;
        }
        return Unit.INSTANCE;
    }
}
