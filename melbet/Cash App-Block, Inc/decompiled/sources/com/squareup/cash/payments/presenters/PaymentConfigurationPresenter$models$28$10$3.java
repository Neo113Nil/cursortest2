package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.SignalsContext;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$28$10$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $instruments$delegate;
    public final /* synthetic */ PaymentConfigurationViewEvent $it;
    public final /* synthetic */ MutableState $paymentRouterData$delegate;
    public final /* synthetic */ PaymentConfigurationViewModel.ReviewPayment $reviewPayment;
    public final /* synthetic */ PaymentScheduleSelection $schedule;
    public RealPaymentInitiator L$1;
    public Screen L$10;
    public Screen L$11;
    public SignalsContext L$12;
    public PersonalizationInput L$13;
    public String L$14;
    public BlockersData.MoneybotContext L$15;
    public State L$16;
    public ListBuilder L$17;
    public ListBuilder L$18;
    public UUID L$2;
    public Money L$3;
    public String L$4;
    public List L$5;
    public InstrumentSelectionData L$6;
    public Orientation L$7;
    public AppCreationActivity L$8;
    public int label;
    public final /* synthetic */ PaymentConfigurationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$28$10$3(PaymentConfigurationPresenter paymentConfigurationPresenter, PaymentConfigurationViewModel.ReviewPayment reviewPayment, PaymentConfigurationViewEvent paymentConfigurationViewEvent, PaymentScheduleSelection paymentScheduleSelection, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentConfigurationPresenter;
        this.$reviewPayment = reviewPayment;
        this.$it = paymentConfigurationViewEvent;
        this.$schedule = paymentScheduleSelection;
        this.$paymentRouterData$delegate = mutableState;
        this.$instruments$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentConfigurationPresenter$models$28$10$3(this.this$0, this.$reviewPayment, this.$it, this.$schedule, this.$paymentRouterData$delegate, this.$instruments$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentConfigurationPresenter$models$28$10$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PersonalizationDraftStore personalizationDraftStore;
        InstrumentSelectionData instrumentSelectionData;
        Screen screen;
        Screen screen2;
        PersonalizationDraft personalizationDraft;
        PaymentScreens.PaymentConfiguration paymentConfiguration;
        RealPaymentInitiator realPaymentInitiator;
        Object firstOrNull;
        CoroutineSingletons coroutineSingletons;
        Money money;
        PersonalizationInput personalizationInput;
        String str;
        Orientation orientation;
        BlockersData.MoneybotContext moneybotContext;
        Screen screen3;
        List list;
        SignalsContext signalsContext;
        AppCreationActivity appCreationActivity;
        ListBuilder listBuilder;
        UUID uuid;
        State state;
        String str2;
        ListBuilder listBuilder2;
        InstrumentSelection instrumentSelection;
        String str3;
        Object obj2;
        InstrumentSelection instrumentSelection2;
        CoroutineSingletons coroutineSingletons2;
        ListBuilder listBuilder3;
        UUID uuid2;
        String str4;
        UUID uuid3;
        ScenarioInitiator scenarioInitiator;
        PersonalizationDraftStore personalizationDraftStore2;
        PaymentConfigurationPresenter paymentConfigurationPresenter;
        Object initiate;
        PaymentConfigurationPresenter paymentConfigurationPresenter2 = this.this$0;
        PersonalizationDraftStore personalizationDraftStore3 = paymentConfigurationPresenter2.draftStore;
        PaymentScreens.PaymentConfiguration paymentConfiguration2 = paymentConfigurationPresenter2.args;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PersonalizationDraft personalizationDraft2 = (PersonalizationDraft) personalizationDraftStore3.draft.$$delegate_0.getValue();
            MutableState mutableState = this.$paymentRouterData$delegate;
            if (personalizationDraft2 == null || ((PaymentRouterData) mutableState.getValue()).expressivePreview == null) {
                personalizationDraft2 = null;
            }
            RealPaymentInitiator realPaymentInitiator2 = paymentConfigurationPresenter2.paymentInitiator;
            UUID uuid4 = paymentConfigurationPresenter2.paymentToken;
            Money money2 = ((PaymentRouterData) mutableState.getValue()).amount;
            PaymentConfigurationViewModel.ReviewPayment reviewPayment = this.$reviewPayment;
            String str5 = reviewPayment.note;
            RecipientViewModel recipientViewModel = reviewPayment.recipient;
            recipientViewModel.getClass();
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(TextFieldValueKt.toPaymentRecipient(recipientViewModel.recipient));
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
            State state2 = this.$instruments$delegate;
            if (instrumentSelectionRowViewModel != null && (instrumentSelection = instrumentSelectionRowViewModel.instrumentSelection) != null && (str3 = instrumentSelection.instrument_token) != null) {
                if (str3.equals("GOOGLE_PAY")) {
                    instrumentSelectionData = new InstrumentSelectionData("GOOGLE_PAY", null, CashInstrumentType.GOOGLE_PAY, null);
                    personalizationDraftStore = personalizationDraftStore3;
                } else {
                    List list2 = (List) state2.getValue();
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                personalizationDraftStore = personalizationDraftStore3;
                                obj2 = null;
                                break;
                            }
                            Object next = it.next();
                            personalizationDraftStore = personalizationDraftStore3;
                            if (Intrinsics.areEqual(((Instrument) next).token, str3)) {
                                obj2 = next;
                                break;
                            }
                            personalizationDraftStore3 = personalizationDraftStore;
                        }
                        Instrument instrument = (Instrument) obj2;
                        if (instrument != null) {
                            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                            instrumentSelectionData = new InstrumentSelectionData(instrument.token, instrument.cardBrand, instrument.cashInstrumentType, (instrumentSelectionRowViewModel2 == null || (instrumentSelection2 = instrumentSelectionRowViewModel2.instrumentSelection) == null) ? null : instrumentSelection2.accepted_fee_amount);
                        }
                        instrumentSelectionData = null;
                    }
                }
                Orientation orientation2 = paymentConfiguration2.orientation;
                AppCreationActivity appCreationActivity2 = paymentConfiguration2.appCreationActivity;
                ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                screen = paymentConfiguration2.exitScreen;
                screen2 = PaymentScreens$HomeScreens$Home.INSTANCE;
                Screen screen4 = screen != null ? screen2 : screen;
                if (screen != null) {
                    screen2 = screen;
                }
                SignalsContext buildSignalsContext = paymentConfigurationPresenter2.securitySignalsAggregator.buildSignalsContext(((PaymentConfigurationViewEvent.PayTapped) this.$it).lastGesturesSignal);
                PersonalizationInput personalizationInput2 = personalizationDraft2 == null ? personalizationDraft2.remotePersonalization : null;
                personalizationDraft = personalizationDraft2;
                String str6 = paymentConfigurationPresenter2.flowToken;
                if (personalizationDraft == null) {
                    str6 = null;
                }
                BlockersData.MoneybotContext moneybotContext2 = paymentConfiguration2.moneybotContext;
                paymentConfiguration = paymentConfiguration2;
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                ChannelFlowTransformLatest select = paymentConfigurationPresenter2.balanceSnapshotManager.select();
                this.L$1 = realPaymentInitiator2;
                this.L$2 = uuid4;
                this.L$3 = money2;
                this.L$4 = str5;
                realPaymentInitiator = realPaymentInitiator2;
                this.L$5 = listOf;
                this.L$6 = instrumentSelectionData;
                this.L$7 = orientation2;
                this.L$8 = appCreationActivity2;
                this.L$10 = screen4;
                this.L$11 = screen2;
                this.L$12 = buildSignalsContext;
                this.L$13 = personalizationInput2;
                this.L$14 = str6;
                this.L$15 = moneybotContext2;
                this.L$16 = state2;
                this.L$17 = createListBuilder;
                this.L$18 = createListBuilder;
                this.label = 1;
                firstOrNull = FlowKt.firstOrNull(select, this);
                if (firstOrNull != coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                Screen screen5 = screen4;
                coroutineSingletons = coroutineSingletons3;
                money = money2;
                personalizationInput = personalizationInput2;
                str = str5;
                orientation = orientation2;
                moneybotContext = moneybotContext2;
                screen3 = screen5;
                list = listOf;
                signalsContext = buildSignalsContext;
                appCreationActivity = appCreationActivity2;
                listBuilder = createListBuilder;
                uuid = uuid4;
                state = state2;
                str2 = str6;
                listBuilder2 = listBuilder;
            }
            personalizationDraftStore = personalizationDraftStore3;
            instrumentSelectionData = null;
            Orientation orientation22 = paymentConfiguration2.orientation;
            AppCreationActivity appCreationActivity22 = paymentConfiguration2.appCreationActivity;
            ClientScenario clientScenario2 = ClientScenario.PAYMENT_FLOW;
            screen = paymentConfiguration2.exitScreen;
            screen2 = PaymentScreens$HomeScreens$Home.INSTANCE;
            if (screen != null) {
            }
            if (screen != null) {
            }
            SignalsContext buildSignalsContext2 = paymentConfigurationPresenter2.securitySignalsAggregator.buildSignalsContext(((PaymentConfigurationViewEvent.PayTapped) this.$it).lastGesturesSignal);
            if (personalizationDraft2 == null) {
            }
            personalizationDraft = personalizationDraft2;
            String str62 = paymentConfigurationPresenter2.flowToken;
            if (personalizationDraft == null) {
            }
            BlockersData.MoneybotContext moneybotContext22 = paymentConfiguration2.moneybotContext;
            paymentConfiguration = paymentConfiguration2;
            ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            ChannelFlowTransformLatest select2 = paymentConfigurationPresenter2.balanceSnapshotManager.select();
            this.L$1 = realPaymentInitiator2;
            this.L$2 = uuid4;
            this.L$3 = money2;
            this.L$4 = str5;
            realPaymentInitiator = realPaymentInitiator2;
            this.L$5 = listOf;
            this.L$6 = instrumentSelectionData;
            this.L$7 = orientation22;
            this.L$8 = appCreationActivity22;
            this.L$10 = screen4;
            this.L$11 = screen2;
            this.L$12 = buildSignalsContext2;
            this.L$13 = personalizationInput2;
            this.L$14 = str62;
            this.L$15 = moneybotContext22;
            this.L$16 = state2;
            this.L$17 = createListBuilder2;
            this.L$18 = createListBuilder2;
            this.label = 1;
            firstOrNull = FlowKt.firstOrNull(select2, this);
            if (firstOrNull != coroutineSingletons3) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                paymentConfigurationPresenter = paymentConfigurationPresenter2;
                personalizationDraftStore2 = personalizationDraftStore3;
                initiate = obj;
                paymentConfigurationPresenter.navigator.goTo((Screen) initiate);
                personalizationDraftStore2._draft.setValue(null);
                return Unit.INSTANCE;
            }
            ListBuilder listBuilder4 = this.L$18;
            listBuilder = this.L$17;
            state = this.L$16;
            BlockersData.MoneybotContext moneybotContext3 = this.L$15;
            String str7 = this.L$14;
            PersonalizationInput personalizationInput3 = this.L$13;
            SignalsContext signalsContext2 = this.L$12;
            Screen screen6 = this.L$11;
            Screen screen7 = this.L$10;
            AppCreationActivity appCreationActivity3 = this.L$8;
            Orientation orientation3 = this.L$7;
            InstrumentSelectionData instrumentSelectionData2 = this.L$6;
            list = this.L$5;
            String str8 = this.L$4;
            Money money3 = this.L$3;
            uuid = this.L$2;
            RealPaymentInitiator realPaymentInitiator3 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            paymentConfiguration = paymentConfiguration2;
            money = money3;
            coroutineSingletons = coroutineSingletons3;
            str = str8;
            moneybotContext = moneybotContext3;
            personalizationInput = personalizationInput3;
            orientation = orientation3;
            str2 = str7;
            screen2 = screen6;
            screen3 = screen7;
            realPaymentInitiator = realPaymentInitiator3;
            listBuilder2 = listBuilder4;
            signalsContext = signalsContext2;
            appCreationActivity = appCreationActivity3;
            instrumentSelectionData = instrumentSelectionData2;
            personalizationDraftStore = personalizationDraftStore3;
            firstOrNull = obj;
        }
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) firstOrNull;
        if (balanceSnapshot != null) {
            listBuilder2.add(balanceSnapshot.token);
        }
        List list3 = (List) state.getValue();
        if (list3 != null) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                listBuilder2.add(((Instrument) it2.next()).token);
            }
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(listBuilder);
        String str9 = paymentConfigurationPresenter2.flowToken;
        PaymentScreens.PaymentConfiguration paymentConfiguration3 = paymentConfiguration;
        if (InputState_androidKt.getPayLinkToken(paymentConfiguration3.paymentConfigurationFlow) != null) {
            CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
            listBuilder3 = build;
            uuid2 = uuid;
            str4 = "PAY_LINK";
            coroutineSingletons2 = coroutineSingletons4;
        } else {
            coroutineSingletons2 = coroutineSingletons;
            listBuilder3 = build;
            uuid2 = uuid;
            str4 = null;
        }
        String payLinkToken = InputState_androidKt.getPayLinkToken(paymentConfiguration3.paymentConfigurationFlow);
        if (payLinkToken != null) {
            uuid3 = uuid2;
            scenarioInitiator = new ScenarioInitiator(ScenarioInitiatorType.PAY_LINK, payLinkToken);
        } else {
            uuid3 = uuid2;
            scenarioInitiator = null;
        }
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$10 = null;
        this.L$11 = null;
        this.L$12 = null;
        this.L$13 = null;
        this.L$14 = null;
        this.L$15 = null;
        this.L$16 = null;
        this.L$17 = null;
        this.L$18 = null;
        this.label = 2;
        CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
        personalizationDraftStore2 = personalizationDraftStore;
        paymentConfigurationPresenter = paymentConfigurationPresenter2;
        initiate = realPaymentInitiator.initiate(uuid3, money, str, list, instrumentSelectionData, (r57 & 32) != 0 ? null : personalizationInput, (r57 & 64) != 0 ? null : str2, (r57 & 128) != 0 ? null : null, (r57 & 256) != 0 ? null : null, (r57 & 512) != 0 ? EmptyList.INSTANCE : listBuilder3, orientation, appCreationActivity, screen3, (32768 & r57) != 0 ? PaymentScreens$HomeScreens$Home.INSTANCE : screen2, false, true, signalsContext, null, null, (2097152 & r57) != 0 ? null : moneybotContext, (4194304 & r57) != 0 ? null : str9, (8388608 & r57) != 0 ? null : str4, (16777216 & r57) != 0 ? null : scenarioInitiator, (33554432 & r57) != 0 ? null : null, (r57 & 67108864) != 0 ? null : this.$schedule, this);
        if (initiate == coroutineSingletons5) {
            return coroutineSingletons5;
        }
        paymentConfigurationPresenter.navigator.goTo((Screen) initiate);
        personalizationDraftStore2._draft.setValue(null);
        return Unit.INSTANCE;
    }
}
