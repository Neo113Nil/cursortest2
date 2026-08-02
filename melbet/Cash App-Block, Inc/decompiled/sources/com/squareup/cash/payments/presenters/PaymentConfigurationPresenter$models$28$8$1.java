package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.backend.CartBuilder;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahg;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.Orientation;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$28$8$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $hasPassedIdv;
    public final /* synthetic */ State $instruments$delegate;
    public final /* synthetic */ MutableState $paymentRouterData$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $reviewPayment;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$28$8$1(Flow flow, Continuation continuation, LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, CartBuilder cartBuilder, LocationMenu locationMenu, CartEntryWithQuantity cartEntryWithQuantity, ArrayList arrayList, MenuItem menuItem, MutableState mutableState, MutableState mutableState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state, MutableState mutableState3, State state2, State state3, MutableState mutableState4) {
        super(2, continuation);
        this.L$1 = flow;
        this.L$2 = localMenuComboDetailsPresenter;
        this.L$3 = cartBuilder;
        this.L$4 = locationMenu;
        this.L$5 = cartEntryWithQuantity;
        this.L$6 = arrayList;
        this.L$7 = menuItem;
        this.$paymentRouterData$delegate = mutableState;
        this.L$10 = mutableState2;
        this.L$8 = parcelableSnapshotMutableIntState;
        this.$hasPassedIdv = state;
        this.L$9 = mutableState3;
        this.$instruments$delegate = state2;
        this.this$0 = state3;
        this.$reviewPayment = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$reviewPayment;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new PaymentConfigurationPresenter$models$28$8$1((PaymentConfigurationPresenter) obj3, (PaymentConfigurationViewModel.ReviewPayment) obj2, this.$hasPassedIdv, this.$paymentRouterData$delegate, this.$instruments$delegate, continuation);
            case 1:
                PaymentConfigurationPresenter$models$28$8$1 paymentConfigurationPresenter$models$28$8$1 = new PaymentConfigurationPresenter$models$28$8$1((Flow) this.L$1, continuation, (LocalMenuComboDetailsPresenter) this.L$2, (CartBuilder) this.L$3, (LocationMenu) this.L$4, (CartEntryWithQuantity) this.L$5, (ArrayList) this.L$6, (MenuItem) this.L$7, this.$paymentRouterData$delegate, (MutableState) this.L$10, (ParcelableSnapshotMutableIntState) this.L$8, this.$hasPassedIdv, (MutableState) this.L$9, this.$instruments$delegate, (State) obj3, (MutableState) obj2);
                paymentConfigurationPresenter$models$28$8$1.L$0 = obj;
                return paymentConfigurationPresenter$models$28$8$1;
            default:
                MutableState mutableState = (MutableState) this.$hasPassedIdv;
                MutableState mutableState2 = (MutableState) this.$instruments$delegate;
                PaymentConfigurationPresenter$models$28$8$1 paymentConfigurationPresenter$models$28$8$12 = new PaymentConfigurationPresenter$models$28$8$1((Flow) this.L$1, continuation, (LocalHomePresenter) this.L$2, (CoroutineScope) this.L$3, this.$paymentRouterData$delegate, (MutableState) this.L$4, (MutableState) this.L$5, (MutableState) this.L$6, (MutableState) this.L$7, (MutableState) this.L$10, (MutableState) this.L$8, (MutableState) this.L$9, (MutableState) obj3, (RealBugReportSender) obj2, mutableState, mutableState2);
                paymentConfigurationPresenter$models$28$8$12.L$0 = obj;
                return paymentConfigurationPresenter$models$28$8$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentConfigurationPresenter$models$28$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02b2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Navigator navigator;
        UUID uuid;
        Money money;
        Money money2;
        Orientation orientation;
        CashInstrumentType cashInstrumentType;
        State state;
        Object first;
        InstrumentSelection instrumentSelection;
        List list;
        State state2;
        Object firstOrNull;
        Profile profile;
        InstrumentSelection instrumentSelection2;
        Money money3;
        Orientation orientation2;
        CashInstrumentType cashInstrumentType2;
        List list2;
        BalanceSnapshot balanceSnapshot;
        Object first2;
        List list3;
        Navigator navigator2;
        InstrumentSelection instrumentSelection3;
        int i = this.$r8$classId;
        State state3 = this.$instruments$delegate;
        State state4 = this.$hasPassedIdv;
        Object obj2 = this.$reviewPayment;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                PaymentConfigurationViewModel.ReviewPayment reviewPayment = (PaymentConfigurationViewModel.ReviewPayment) obj2;
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj3;
                PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = this.$paymentRouterData$delegate;
                    if (((PaymentRouterData) mutableState.getValue()).expressivePreview == null) {
                        paymentConfigurationPresenter.draftStore._draft.setValue(null);
                    }
                    navigator = paymentConfigurationPresenter.navigator;
                    uuid = paymentConfigurationPresenter.paymentToken;
                    money = ((PaymentRouterData) mutableState.getValue()).amount;
                    money2 = ((PaymentRouterData) mutableState.getValue()).amount;
                    orientation = paymentConfiguration.orientation;
                    InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                    instrumentSelectionRowViewModel.getClass();
                    cashInstrumentType = instrumentSelectionRowViewModel.cashInstrumentType;
                    InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = ((PaymentRouterData) mutableState.getValue()).instrumentRowModel;
                    instrumentSelectionRowViewModel2.getClass();
                    InstrumentSelection instrumentSelection4 = instrumentSelectionRowViewModel2.instrumentSelection;
                    RecipientViewModel recipientViewModel = reviewPayment.recipient;
                    recipientViewModel.getClass();
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(recipientViewModel.recipient);
                    FlowQuery$mapToList$$inlined$map$1 profile2 = paymentConfigurationPresenter.profileManager.profile();
                    this.L$0 = navigator;
                    this.L$1 = uuid;
                    this.L$2 = money;
                    this.L$3 = money2;
                    this.L$4 = orientation;
                    this.L$5 = cashInstrumentType;
                    this.L$6 = instrumentSelection4;
                    state = state3;
                    this.L$7 = listOf;
                    this.label = 1;
                    first = FlowKt.first(profile2, this);
                    if (first != coroutineSingletons) {
                        instrumentSelection = instrumentSelection4;
                        list = listOf;
                    }
                } else if (i2 == 1) {
                    list = (List) this.L$7;
                    instrumentSelection = (InstrumentSelection) this.L$6;
                    cashInstrumentType = (CashInstrumentType) this.L$5;
                    orientation = (Orientation) this.L$4;
                    money2 = (Money) this.L$3;
                    money = (Money) this.L$2;
                    uuid = (UUID) this.L$1;
                    navigator = (Navigator) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    state = state3;
                    first = obj;
                } else if (i2 == 2) {
                    Profile profile3 = (Profile) this.L$8;
                    List list4 = (List) this.L$7;
                    InstrumentSelection instrumentSelection5 = (InstrumentSelection) this.L$6;
                    cashInstrumentType2 = (CashInstrumentType) this.L$5;
                    Orientation orientation3 = (Orientation) this.L$4;
                    Money money4 = (Money) this.L$3;
                    Money money5 = (Money) this.L$2;
                    UUID uuid2 = (UUID) this.L$1;
                    Navigator navigator3 = (Navigator) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    navigator = navigator3;
                    orientation2 = orientation3;
                    money3 = money4;
                    money = money5;
                    uuid = uuid2;
                    state = state3;
                    state2 = state4;
                    instrumentSelection2 = instrumentSelection5;
                    firstOrNull = obj;
                    list2 = list4;
                    profile = profile3;
                    balanceSnapshot = (BalanceSnapshot) firstOrNull;
                    List list5 = (List) state.getValue();
                    list5.getClass();
                    FinishSetupTileBadgeCounter instrumentLinkingConfig = ((RealAppConfigManager) paymentConfigurationPresenter.appConfigManager).instrumentLinkingConfig();
                    this.L$0 = navigator;
                    this.L$1 = uuid;
                    this.L$2 = money;
                    this.L$3 = money3;
                    this.L$4 = orientation2;
                    this.L$5 = cashInstrumentType2;
                    this.L$6 = instrumentSelection2;
                    InstrumentSelection instrumentSelection6 = instrumentSelection2;
                    this.L$7 = list2;
                    this.L$8 = profile;
                    this.L$9 = balanceSnapshot;
                    this.L$10 = list5;
                    this.label = 3;
                    first2 = FlowKt.first(instrumentLinkingConfig, this);
                    if (first2 != coroutineSingletons) {
                        list3 = list5;
                        navigator2 = navigator;
                        instrumentSelection3 = instrumentSelection6;
                        BalanceSnapshot balanceSnapshot2 = balanceSnapshot;
                        Profile profile4 = profile;
                        List list6 = list2;
                        CashInstrumentType cashInstrumentType3 = cashInstrumentType2;
                        Orientation orientation4 = orientation2;
                        Money money6 = money3;
                        Money money7 = money;
                        UUID uuid3 = uuid;
                        InstrumentLinkingConfig instrumentLinkingConfig2 = (InstrumentLinkingConfig) first2;
                        Object value = state2.getValue();
                        value.getClass();
                        zzahg.openPersonalizePayments$default(navigator2, uuid3, money7, money6, orientation4, cashInstrumentType3, instrumentSelection3, list6, profile4, balanceSnapshot2, list3, instrumentLinkingConfig2, ((Boolean) value).booleanValue(), reviewPayment.note, paymentConfigurationPresenter.moneyFormatter, paymentConfigurationPresenter.networkInfo, paymentConfigurationPresenter.stringManager, paymentConfigurationPresenter.flowToken, paymentConfigurationPresenter.analytics, paymentConfiguration.referrer, paymentConfiguration.launchUrl, paymentConfiguration.appCreationActivity, null, PersonalizationOrigin.BOTTOM_SHEET_CORE_FLOW, paymentConfiguration.moneybotContext, 4194304);
                    }
                    break;
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    List list7 = (List) this.L$10;
                    balanceSnapshot = (BalanceSnapshot) this.L$9;
                    profile = (Profile) this.L$8;
                    list2 = (List) this.L$7;
                    InstrumentSelection instrumentSelection7 = (InstrumentSelection) this.L$6;
                    cashInstrumentType2 = (CashInstrumentType) this.L$5;
                    orientation2 = (Orientation) this.L$4;
                    money3 = (Money) this.L$3;
                    money = (Money) this.L$2;
                    uuid = (UUID) this.L$1;
                    Navigator navigator4 = (Navigator) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    navigator2 = navigator4;
                    list3 = list7;
                    state2 = state4;
                    instrumentSelection3 = instrumentSelection7;
                    first2 = obj;
                    BalanceSnapshot balanceSnapshot22 = balanceSnapshot;
                    Profile profile42 = profile;
                    List list62 = list2;
                    CashInstrumentType cashInstrumentType32 = cashInstrumentType2;
                    Orientation orientation42 = orientation2;
                    Money money62 = money3;
                    Money money72 = money;
                    UUID uuid32 = uuid;
                    InstrumentLinkingConfig instrumentLinkingConfig22 = (InstrumentLinkingConfig) first2;
                    Object value2 = state2.getValue();
                    value2.getClass();
                    zzahg.openPersonalizePayments$default(navigator2, uuid32, money72, money62, orientation42, cashInstrumentType32, instrumentSelection3, list62, profile42, balanceSnapshot22, list3, instrumentLinkingConfig22, ((Boolean) value2).booleanValue(), reviewPayment.note, paymentConfigurationPresenter.moneyFormatter, paymentConfigurationPresenter.networkInfo, paymentConfigurationPresenter.stringManager, paymentConfigurationPresenter.flowToken, paymentConfigurationPresenter.analytics, paymentConfiguration.referrer, paymentConfiguration.launchUrl, paymentConfiguration.appCreationActivity, null, PersonalizationOrigin.BOTTOM_SHEET_CORE_FLOW, paymentConfiguration.moneybotContext, 4194304);
                    break;
                }
                Profile profile5 = (Profile) first;
                ChannelFlowTransformLatest select = paymentConfigurationPresenter.balanceSnapshotManager.select();
                this.L$0 = navigator;
                this.L$1 = uuid;
                this.L$2 = money;
                this.L$3 = money2;
                this.L$4 = orientation;
                this.L$5 = cashInstrumentType;
                this.L$6 = instrumentSelection;
                state2 = state4;
                this.L$7 = list;
                this.L$8 = profile5;
                this.label = 2;
                firstOrNull = FlowKt.firstOrNull(select, this);
                if (firstOrNull != coroutineSingletons) {
                    InstrumentSelection instrumentSelection8 = instrumentSelection;
                    profile = profile5;
                    instrumentSelection2 = instrumentSelection8;
                    money3 = money2;
                    orientation2 = orientation;
                    cashInstrumentType2 = cashInstrumentType;
                    list2 = list;
                    balanceSnapshot = (BalanceSnapshot) firstOrNull;
                    List list52 = (List) state.getValue();
                    list52.getClass();
                    FinishSetupTileBadgeCounter instrumentLinkingConfig3 = ((RealAppConfigManager) paymentConfigurationPresenter.appConfigManager).instrumentLinkingConfig();
                    this.L$0 = navigator;
                    this.L$1 = uuid;
                    this.L$2 = money;
                    this.L$3 = money3;
                    this.L$4 = orientation2;
                    this.L$5 = cashInstrumentType2;
                    this.L$6 = instrumentSelection2;
                    InstrumentSelection instrumentSelection62 = instrumentSelection2;
                    this.L$7 = list2;
                    this.L$8 = profile;
                    this.L$9 = balanceSnapshot;
                    this.L$10 = list52;
                    this.label = 3;
                    first2 = FlowKt.first(instrumentLinkingConfig3, this);
                    if (first2 != coroutineSingletons) {
                    }
                }
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    BugReportingPresenter$models$$inlined$CollectEffect$1$1 bugReportingPresenter$models$$inlined$CollectEffect$1$1 = new BugReportingPresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (LocalMenuComboDetailsPresenter) this.L$2, (CartBuilder) this.L$3, (LocationMenu) this.L$4, (CartEntryWithQuantity) this.L$5, (ArrayList) this.L$6, (MenuItem) this.L$7, this.$paymentRouterData$delegate, (MutableState) this.L$10, (ParcelableSnapshotMutableIntState) this.L$8, this.$hasPassedIdv, (MutableState) this.L$9, this.$instruments$delegate, (State) obj3, (MutableState) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(bugReportingPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    BugReportingPresenter$models$$inlined$CollectEffect$1$1 bugReportingPresenter$models$$inlined$CollectEffect$1$12 = new BugReportingPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (LocalHomePresenter) this.L$2, (CoroutineScope) this.L$3, this.$paymentRouterData$delegate, (MutableState) this.L$4, (MutableState) this.L$5, (MutableState) this.L$6, (MutableState) this.L$7, (MutableState) this.L$10, (MutableState) this.L$8, (MutableState) this.L$9, (MutableState) obj3, (RealBugReportSender) obj2, (MutableState) state4, (MutableState) state3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(bugReportingPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$28$8$1(PaymentConfigurationPresenter paymentConfigurationPresenter, PaymentConfigurationViewModel.ReviewPayment reviewPayment, State state, MutableState mutableState, State state2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentConfigurationPresenter;
        this.$reviewPayment = reviewPayment;
        this.$hasPassedIdv = state;
        this.$paymentRouterData$delegate = mutableState;
        this.$instruments$delegate = state2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$28$8$1(Flow flow, Continuation continuation, LocalHomePresenter localHomePresenter, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, RealBugReportSender realBugReportSender, MutableState mutableState10, MutableState mutableState11) {
        super(2, continuation);
        this.L$1 = flow;
        this.L$2 = localHomePresenter;
        this.L$3 = coroutineScope;
        this.$paymentRouterData$delegate = mutableState;
        this.L$4 = mutableState2;
        this.L$5 = mutableState3;
        this.L$6 = mutableState4;
        this.L$7 = mutableState5;
        this.L$10 = mutableState6;
        this.L$8 = mutableState7;
        this.L$9 = mutableState8;
        this.this$0 = mutableState9;
        this.$reviewPayment = realBugReportSender;
        this.$hasPassedIdv = mutableState10;
        this.$instruments$delegate = mutableState11;
    }
}
