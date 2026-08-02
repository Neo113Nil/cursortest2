package com.squareup.cash.family.familyhub.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferLoadingScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.screens.Back;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CurrencyCode $currency$inlined;
    public final /* synthetic */ MutableState $currentAmount$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ MutableState $inputMode$delegate$inlined;
    public final /* synthetic */ State $principalToken$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MutableState $selectedInstrumentFromPicker$delegate$inlined;
    public final /* synthetic */ State $sponsorInstrument$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ManagedAccountTransferPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1(Flow flow, Continuation continuation, ManagedAccountTransferPresenter managedAccountTransferPresenter, CurrencyCode currencyCode, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, State state2) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = managedAccountTransferPresenter;
        this.$currency$inlined = currencyCode;
        this.$currentAmount$delegate$inlined = mutableState;
        this.$inputMode$delegate$inlined = mutableState2;
        this.$selectedInstrumentFromPicker$delegate$inlined = mutableState3;
        this.$sponsorInstrument$delegate$inlined = state;
        this.$principalToken$delegate$inlined = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1 managedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1 = new ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1(this.$flow, continuation, this.$currency$inlined, this.this$0, this.$currentAmount$delegate$inlined, this.$sponsorInstrument$delegate$inlined, this.$inputMode$delegate$inlined, this.$principalToken$delegate$inlined, this.$selectedInstrumentFromPicker$delegate$inlined);
                managedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1.L$0 = obj;
                return managedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1;
            default:
                ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1 managedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$12 = new ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1(this.$flow, continuation, this.this$0, this.$currency$inlined, this.$currentAmount$delegate$inlined, this.$inputMode$delegate$inlined, this.$selectedInstrumentFromPicker$delegate$inlined, this.$sponsorInstrument$delegate$inlined, this.$principalToken$delegate$inlined);
                managedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$12.L$0 = obj;
                return managedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$currency$inlined, this.this$0, this.$currentAmount$delegate$inlined, this.$sponsorInstrument$delegate$inlined, this.$inputMode$delegate$inlined, this.$principalToken$delegate$inlined, this.$selectedInstrumentFromPicker$delegate$inlined);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(coroutineScope2, this.this$0, this.$currency$inlined, this.$currentAmount$delegate$inlined, this.$inputMode$delegate$inlined, this.$selectedInstrumentFromPicker$delegate$inlined, this.$sponsorInstrument$delegate$inlined, this.$principalToken$delegate$inlined);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ CurrencyCode $currency$inlined;
        public final /* synthetic */ MutableState $currentAmount$delegate$inlined;
        public final /* synthetic */ MutableState $inputMode$delegate$inlined;
        public final /* synthetic */ State $principalToken$delegate$inlined;
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ MutableState $selectedInstrumentFromPicker$delegate$inlined;
        public final /* synthetic */ State $sponsorInstrument$delegate$inlined;
        public final /* synthetic */ ManagedAccountTransferPresenter this$0;

        public AnonymousClass1(CoroutineScope coroutineScope, ManagedAccountTransferPresenter managedAccountTransferPresenter, CurrencyCode currencyCode, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, State state2) {
            this.this$0 = managedAccountTransferPresenter;
            this.$currency$inlined = currencyCode;
            this.$currentAmount$delegate$inlined = mutableState;
            this.$inputMode$delegate$inlined = mutableState2;
            this.$selectedInstrumentFromPicker$delegate$inlined = mutableState3;
            this.$sponsorInstrument$delegate$inlined = state;
            this.$principalToken$delegate$inlined = state2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            BalanceSnapshot balanceSnapshot;
            String str;
            int i = this.$r8$classId;
            State state = this.$principalToken$delegate$inlined;
            State state2 = this.$sponsorInstrument$delegate$inlined;
            MutableState mutableState = this.$inputMode$delegate$inlined;
            CurrencyCode currencyCode = this.$currency$inlined;
            Back back = Back.INSTANCE;
            MutableState mutableState2 = this.$currentAmount$delegate$inlined;
            ManagedAccountTransferPresenter managedAccountTransferPresenter = this.this$0;
            MutableState mutableState3 = this.$selectedInstrumentFromPicker$delegate$inlined;
            switch (i) {
                case 0:
                    BetterNavigator.ScreenNavigator screenNavigator = managedAccountTransferPresenter.navigator;
                    AddMoneyViewEvent addMoneyViewEvent = (AddMoneyViewEvent) obj;
                    if (addMoneyViewEvent instanceof AddMoneyViewEvent.AmountPickerItemSelected) {
                        AddMoneyViewModel.AtmPicker.AmountPickerItem amountPickerItem = ((AddMoneyViewEvent.AmountPickerItemSelected) addMoneyViewEvent).item;
                        if (!(amountPickerItem instanceof AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount)) {
                            if (!(amountPickerItem instanceof AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else if (((AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom) amountPickerItem).enabled) {
                                Money zero = Moneys.zero(currencyCode);
                                List list = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                                mutableState2.setValue(zero);
                            }
                        } else {
                            AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount amount = (AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount) amountPickerItem;
                            if (amount.enabled) {
                                Money money = amount.amount;
                                List list2 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                                mutableState2.setValue(money);
                            }
                        }
                    } else if (addMoneyViewEvent instanceof AddMoneyViewEvent.AmountKeypadEntered) {
                        Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(((AddMoneyViewEvent.AmountKeypadEntered) addMoneyViewEvent).amount, currencyCode);
                        List list3 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        mutableState2.setValue(parseMoneyFromString$default);
                    } else if (addMoneyViewEvent instanceof AddMoneyViewEvent.CtaClick) {
                        List list4 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        if (!Moneys.isZero((Money) mutableState2.getValue()) && ((Instrument) state2.getValue()) != null) {
                            ManagedAccountTransferScreen.TransferType transferType = ManagedAccountTransferScreen.TransferType.ADD_MONEY;
                            Money money2 = (Money) mutableState2.getValue();
                            Instrument instrument = (Instrument) state2.getValue();
                            instrument.getClass();
                            screenNavigator.goTo(new ManagedAccountTransferLoadingScreen(transferType, money2, instrument.token, null, new MoneyTabScreen(null)));
                        }
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.CloseClick.INSTANCE)) {
                        List list5 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        if (((ManagedAccountTransferPresenter.InputMode) mutableState.getValue()) == ManagedAccountTransferPresenter.InputMode.INSTRUMENT_PICKER) {
                            mutableState.setValue(ManagedAccountTransferPresenter.InputMode.ATM_PICKER);
                        } else {
                            screenNavigator.goTo(back);
                        }
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.Expanded.INSTANCE)) {
                        ManagedAccountTransferPresenter.InputMode inputMode = ManagedAccountTransferPresenter.InputMode.KEYPAD;
                        List list6 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        mutableState.setValue(inputMode);
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.Peeking.INSTANCE)) {
                        Money zero2 = Moneys.zero(currencyCode);
                        List list7 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        mutableState2.setValue(zero2);
                        mutableState.setValue(ManagedAccountTransferPresenter.InputMode.ATM_PICKER);
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.ChangeInstrumentClick.INSTANCE)) {
                        List list8 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        if (((Instrument) state2.getValue()) == null) {
                            PrincipalAccountToken principalAccountToken = (PrincipalAccountToken) state.getValue();
                            PrincipalAccountToken.Some some = principalAccountToken instanceof PrincipalAccountToken.Some ? (PrincipalAccountToken.Some) principalAccountToken : null;
                            if (some == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Expected PrincipalAccountToken.Some while handling managed account add money");
                                break;
                            } else {
                                RealRouter.route$default(managedAccountTransferPresenter.router, new ClientRoute.ViewLinkBankAccount(ClientRoute.ViewLinkBankAccount.spec, ClientRoute.ViewLinkBankAccount.deepLinkSpecs, some.switchingIdentifier));
                            }
                        } else {
                            mutableState.setValue(ManagedAccountTransferPresenter.InputMode.INSTRUMENT_PICKER);
                        }
                    } else if (addMoneyViewEvent instanceof AddMoneyViewEvent.InstrumentSelected) {
                        String str2 = ((AddMoneyViewEvent.InstrumentSelected) addMoneyViewEvent).token;
                        List list9 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        mutableState3.setValue(str2);
                    } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.InstrumentPickerDoneClick.INSTANCE)) {
                        ManagedAccountTransferPresenter.InputMode inputMode2 = ManagedAccountTransferPresenter.InputMode.ATM_PICKER;
                        List list10 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        mutableState.setValue(inputMode2);
                    }
                    break;
                default:
                    BetterNavigator.ScreenNavigator screenNavigator2 = managedAccountTransferPresenter.navigator;
                    WithdrawViewEvent withdrawViewEvent = (WithdrawViewEvent) obj;
                    if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CloseClick.INSTANCE)) {
                        screenNavigator2.goTo(back);
                    } else if (withdrawViewEvent instanceof WithdrawViewEvent.OnAmountChanged) {
                        Money parseMoneyFromString$default2 = Moneys.parseMoneyFromString$default(((WithdrawViewEvent.OnAmountChanged) withdrawViewEvent).amount, currencyCode);
                        List list11 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        mutableState2.setValue(parseMoneyFromString$default2);
                        mutableState.setValue(Boolean.TRUE);
                    } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CtaClick.INSTANCE)) {
                        List list12 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        if (((ManagedAccountTransferPresenter.InputMode) mutableState3.getValue()) == ManagedAccountTransferPresenter.InputMode.VIEW_AMOUNT && !Moneys.isZero((Money) mutableState2.getValue()) && (balanceSnapshot = (BalanceSnapshot) state2.getValue()) != null && (str = balanceSnapshot.token) != null) {
                            ManagedAccountTransferScreen.TransferType transferType2 = ManagedAccountTransferScreen.TransferType.WITHDRAW;
                            Money money3 = (Money) mutableState2.getValue();
                            Instrument instrument2 = (Instrument) state.getValue();
                            screenNavigator2.goTo(new ManagedAccountTransferLoadingScreen(transferType2, money3, instrument2 != null ? instrument2.token : null, str, new MoneyTabScreen(null)));
                        }
                    } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.SaveAmountClick.INSTANCE)) {
                        List list13 = ManagedAccountTransferPresenter.PRESET_AMOUNTS;
                        if (!Moneys.isZero((Money) mutableState2.getValue())) {
                            mutableState3.setValue(ManagedAccountTransferPresenter.InputMode.VIEW_AMOUNT);
                        }
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        public AnonymousClass1(CoroutineScope coroutineScope, CurrencyCode currencyCode, ManagedAccountTransferPresenter managedAccountTransferPresenter, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3) {
            this.$currency$inlined = currencyCode;
            this.this$0 = managedAccountTransferPresenter;
            this.$currentAmount$delegate$inlined = mutableState;
            this.$sponsorInstrument$delegate$inlined = state;
            this.$inputMode$delegate$inlined = mutableState2;
            this.$principalToken$delegate$inlined = state2;
            this.$selectedInstrumentFromPicker$delegate$inlined = mutableState3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1(Flow flow, Continuation continuation, CurrencyCode currencyCode, ManagedAccountTransferPresenter managedAccountTransferPresenter, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3) {
        super(2, continuation);
        this.$flow = flow;
        this.$currency$inlined = currencyCode;
        this.this$0 = managedAccountTransferPresenter;
        this.$currentAmount$delegate$inlined = mutableState;
        this.$sponsorInstrument$delegate$inlined = state;
        this.$inputMode$delegate$inlined = mutableState2;
        this.$principalToken$delegate$inlined = state2;
        this.$selectedInstrumentFromPicker$delegate$inlined = mutableState3;
    }
}
