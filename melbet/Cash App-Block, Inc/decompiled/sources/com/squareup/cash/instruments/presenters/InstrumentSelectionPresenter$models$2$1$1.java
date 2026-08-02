package com.squareup.cash.instruments.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.R;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.screens.InstrumentSelectionResult;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class InstrumentSelectionPresenter$models$2$1$1 implements FlowCollector {
    public final /* synthetic */ MutableState $instruments$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState $selectedInstrument$delegate;
    public final /* synthetic */ MutableState $state$delegate;
    public final /* synthetic */ TransfersPresenter this$0;

    public InstrumentSelectionPresenter$models$2$1$1(TransfersPresenter transfersPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.this$0 = transfersPresenter;
        this.$instruments$delegate = mutableState;
        this.$selectedInstrument$delegate = mutableState2;
        this.$state$delegate = mutableState3;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Pair pair;
        BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow;
        int i = this.$r8$classId;
        MutableState mutableState = this.$selectedInstrument$delegate;
        MutableState mutableState2 = this.$instruments$delegate;
        TransfersPresenter transfersPresenter = this.this$0;
        str = "";
        MutableState mutableState3 = this.$state$delegate;
        switch (i) {
            case 0:
                List list = (List) obj;
                mutableState2.setValue(list);
                List list2 = (List) mutableState2.getValue();
                InstrumentSelectionScreen instrumentSelectionScreen = (InstrumentSelectionScreen) transfersPresenter.initialTab;
                AndroidStringManager androidStringManager = transfersPresenter.stringManager;
                String str2 = instrumentSelectionScreen.selectedInstrumentToken;
                int access$indexOfInstrument = TransfersPresenter.access$indexOfInstrument(transfersPresenter, list2, str2 != null ? str2 : "");
                if (access$indexOfInstrument < 0) {
                    access$indexOfInstrument = 0;
                }
                mutableState.setValue((SelectPaymentInstrumentViewModel.PaymentInstrument) list.get(access$indexOfInstrument));
                String str3 = instrumentSelectionScreen.pageTitle;
                if (str3 == null) {
                    str3 = androidStringManager.get(R.string.title_pay_from);
                }
                mutableState3.setValue(new InstrumentSelectionViewModel.Ready(access$indexOfInstrument, str3, androidStringManager.get(R.string.button_done), list));
                return Unit.INSTANCE;
            default:
                InstrumentSelectionScreen instrumentSelectionScreen2 = (InstrumentSelectionScreen) transfersPresenter.initialTab;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) transfersPresenter.navigator;
                InstrumentSelectionViewEvent instrumentSelectionViewEvent = (InstrumentSelectionViewEvent) obj;
                if (Intrinsics.areEqual(instrumentSelectionViewEvent, InstrumentSelectionViewEvent.Close.INSTANCE)) {
                    screenNavigator.goTo(Back.INSTANCE);
                } else {
                    if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.SelectInstrument) {
                        SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = ((InstrumentSelectionViewEvent.SelectInstrument) instrumentSelectionViewEvent).instrument;
                        if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) {
                            FlowStarter flowStarter = (FlowStarter) transfersPresenter.args;
                            CashInstrumentType cashInstrumentType = ((SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) paymentInstrument).f1148type;
                            if (cashInstrumentType == null) {
                                cashInstrumentType = CashInstrumentType.DEBIT_CARD;
                            }
                            startProfileLinkingFlow = ((RealFlowStarter) flowStarter).startProfileLinkingFlow(instrumentSelectionScreen2, cashInstrumentType, (String) null);
                            screenNavigator.goTo(startProfileLinkingFlow);
                        } else {
                            List list3 = (List) mutableState2.getValue();
                            paymentInstrument.getClass();
                            if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) {
                                str = ((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument).instrument.token;
                            } else if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) {
                                str = ((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument).balance.token;
                            } else if (!(paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int access$indexOfInstrument2 = TransfersPresenter.access$indexOfInstrument(transfersPresenter, list3, str);
                            InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) mutableState.getValue();
                            instrumentSelectionViewModel.getClass();
                            InstrumentSelectionViewModel.Ready ready = (InstrumentSelectionViewModel.Ready) instrumentSelectionViewModel;
                            String str4 = ready.title;
                            List list4 = ready.instruments;
                            String str5 = ready.nextButtonTitle;
                            str4.getClass();
                            list4.getClass();
                            str5.getClass();
                            mutableState.setValue(new InstrumentSelectionViewModel.Ready(access$indexOfInstrument2, str4, str5, list4));
                            mutableState3.setValue(paymentInstrument);
                        }
                    } else {
                        if (!Intrinsics.areEqual(instrumentSelectionViewEvent, InstrumentSelectionViewEvent.Submit.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument2 = (SelectPaymentInstrumentViewModel.PaymentInstrument) mutableState3.getValue();
                        if (paymentInstrument2 != null) {
                            if (paymentInstrument2 instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) {
                                SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument existingInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument2;
                                String str6 = existingInstrument.instrument.token;
                                Money money = existingInstrument.acceptedAmount;
                                if (money == null) {
                                    money = Moneys.zero(CurrencyCode.USD);
                                }
                                pair = new Pair(str6, money);
                            } else if (paymentInstrument2 instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) {
                                SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance existingCashBalance = (SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument2;
                                BalanceSnapshot balanceSnapshot = existingCashBalance.balance;
                                String str7 = balanceSnapshot.token;
                                Money money2 = existingCashBalance.acceptedAmount;
                                if (money2 == null) {
                                    CurrencyCode currencyCode = balanceSnapshot.balance.currency_code;
                                    Money zero = currencyCode != null ? Moneys.zero(currencyCode) : null;
                                    money2 = zero == null ? Moneys.zero(CurrencyCode.USD) : zero;
                                }
                                pair = new Pair(str7, money2);
                            } else {
                                if (!(paymentInstrument2 instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                pair = new Pair("", Moneys.zero(CurrencyCode.USD));
                            }
                            screenNavigator.giveAnswer(instrumentSelectionScreen2.question, new InstrumentSelectionResult((Money) pair.second, (String) pair.first));
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public InstrumentSelectionPresenter$models$2$1$1(CoroutineScope coroutineScope, TransfersPresenter transfersPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.this$0 = transfersPresenter;
        this.$instruments$delegate = mutableState;
        this.$selectedInstrument$delegate = mutableState2;
        this.$state$delegate = mutableState3;
    }
}
