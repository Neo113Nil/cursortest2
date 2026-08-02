package com.squareup.cash.payments;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.screen.Screen;
import app.cash.payment.asset.PaymentData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.subtle.Hkdf;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.scenarioplans.models.InitiateStablecoinWithdrawalScenarioPlanInput;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.instruments.backend.api.Instruments$WhenMappings;
import com.squareup.cash.instruments.backend.api.PaymentInstrument;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.PaymentInitiator$Result;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SignalsContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPaymentInitiator {
    public final AppConfigManager appConfigManager;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final FlowStarter flowStarter;
    public final RealInstrumentManager instrumentManager;
    public final OfflineManager offlineManager;

    public RealPaymentInitiator(CryptoFlowStarter cryptoFlowStarter, FlowStarter flowStarter, OfflineManager offlineManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, AppConfigManager appConfigManager, RealUuidGenerator realUuidGenerator) {
        this.flowStarter = flowStarter;
        this.offlineManager = offlineManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.appConfigManager = appConfigManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012f A[LOOP:0: B:12:0x0129->B:14:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiate(UUID uuid, Money money, String str, List list, InstrumentSelectionData instrumentSelectionData, PersonalizationInput personalizationInput, String str2, String str3, String str4, List list2, Orientation orientation, AppCreationActivity appCreationActivity, Screen screen, Screen screen2, boolean z, boolean z2, SignalsContext signalsContext, String str5, String str6, BlockersData.MoneybotContext moneybotContext, String str7, String str8, ScenarioInitiator scenarioInitiator, String str9, PaymentScheduleSelection paymentScheduleSelection, ContinuationImpl continuationImpl) {
        RealPaymentInitiator$initiate$2 realPaymentInitiator$initiate$2;
        int i;
        Money money2;
        boolean z3;
        List list3;
        boolean z4;
        Object obj;
        InstrumentSelectionData instrumentSelectionData2;
        List list4;
        PaymentInitiator$Result paymentInitiator$Result;
        InstrumentSelectionData instrumentSelectionData3;
        Money money3;
        List list5;
        List list6;
        Iterator it;
        if (continuationImpl instanceof RealPaymentInitiator$initiate$2) {
            realPaymentInitiator$initiate$2 = (RealPaymentInitiator$initiate$2) continuationImpl;
            int i2 = realPaymentInitiator$initiate$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentInitiator$initiate$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realPaymentInitiator$initiate$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentInitiator$initiate$2.label;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    PaymentInitiatorData paymentInitiatorData = new PaymentInitiatorData(str, orientation, list, money, instrumentSelectionData, z2, uuid, signalsContext, str5, str6, appCreationActivity, null, personalizationInput, str2, str3, str4, moneybotContext, str7, str8, scenarioInitiator, str9, paymentScheduleSelection, 8394752);
                    ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                    Screen screen3 = PaymentScreens$HomeScreens$Home.INSTANCE;
                    Screen screen4 = screen == null ? screen3 : screen;
                    if (screen2 != null) {
                        screen3 = screen2;
                    }
                    money2 = money;
                    realPaymentInitiator$initiate$2.L$1 = money2;
                    realPaymentInitiator$initiate$2.L$3 = list;
                    realPaymentInitiator$initiate$2.L$4 = instrumentSelectionData;
                    realPaymentInitiator$initiate$2.L$9 = list2;
                    realPaymentInitiator$initiate$2.Z$1 = z;
                    z3 = z2;
                    realPaymentInitiator$initiate$2.Z$2 = z3;
                    realPaymentInitiator$initiate$2.label = 1;
                    Object initiate = initiate(paymentInitiatorData, clientScenario, screen4, screen3, z, realPaymentInitiator$initiate$2);
                    if (initiate != coroutineSingletons) {
                        list3 = list2;
                        z4 = z;
                        obj = initiate;
                        instrumentSelectionData2 = instrumentSelectionData;
                        list4 = list;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list6 = realPaymentInitiator$initiate$2.L$9;
                    instrumentSelectionData3 = realPaymentInitiator$initiate$2.L$4;
                    list5 = realPaymentInitiator$initiate$2.L$3;
                    money3 = realPaymentInitiator$initiate$2.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj2;
                    SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                    List list7 = list5;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PaymentRecipient) it.next()).paymentInfo);
                    }
                    return new PaymentScreens.SelectPaymentInstrument(list6, arrayList, money3, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.cash_balance_enabled, instrumentLinkingConfig.credit_card_fee_bps, EmptyList.INSTANCE, false, instrumentSelectionData3 != null ? instrumentSelectionData3.token : null);
                }
                boolean z5 = realPaymentInitiator$initiate$2.Z$2;
                z4 = realPaymentInitiator$initiate$2.Z$1;
                list3 = realPaymentInitiator$initiate$2.L$9;
                InstrumentSelectionData instrumentSelectionData4 = realPaymentInitiator$initiate$2.L$4;
                list4 = realPaymentInitiator$initiate$2.L$3;
                Money money4 = realPaymentInitiator$initiate$2.L$1;
                SafeTrace.throwOnFailure(obj2);
                z3 = z5;
                obj = obj2;
                instrumentSelectionData2 = instrumentSelectionData4;
                money2 = money4;
                paymentInitiator$Result = (PaymentInitiator$Result) obj;
                if (!(paymentInitiator$Result instanceof PaymentInitiator$Result.InitiatePayment)) {
                    return ((PaymentInitiator$Result.InitiatePayment) paymentInitiator$Result).screen;
                }
                if (!(paymentInitiator$Result instanceof PaymentInitiator$Result.SelectCard)) {
                    if (paymentInitiator$Result instanceof PaymentInitiator$Result.ConfirmDuplicate) {
                        return new PaymentScreens.ConfirmDuplicate(money2, DBUtil.redactList(list4));
                    }
                    if (paymentInitiator$Result instanceof PaymentInitiator$Result.LongerNote) {
                        return new PaymentScreens.NoteRequired(DBUtil.redactList(list4), (Orientation) (objArr == true ? 1 : 0), 6);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                FinishSetupTileBadgeCounter instrumentLinkingConfig2 = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
                realPaymentInitiator$initiate$2.L$1 = money2;
                realPaymentInitiator$initiate$2.L$3 = list4;
                realPaymentInitiator$initiate$2.L$4 = instrumentSelectionData2;
                realPaymentInitiator$initiate$2.L$9 = list3;
                realPaymentInitiator$initiate$2.Z$1 = z4;
                realPaymentInitiator$initiate$2.Z$2 = z3;
                realPaymentInitiator$initiate$2.label = 2;
                Object first = FlowKt.first(instrumentLinkingConfig2, realPaymentInitiator$initiate$2);
                if (first != coroutineSingletons) {
                    instrumentSelectionData3 = instrumentSelectionData2;
                    money3 = money2;
                    list5 = list4;
                    obj2 = first;
                    list6 = list3;
                    InstrumentLinkingConfig instrumentLinkingConfig3 = (InstrumentLinkingConfig) obj2;
                    SelectPaymentInstrumentType selectPaymentInstrumentType2 = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                    List list72 = list5;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
                    it = list72.iterator();
                    while (it.hasNext()) {
                    }
                    return new PaymentScreens.SelectPaymentInstrument(list6, arrayList2, money3, instrumentLinkingConfig3.credit_card_linking_enabled, instrumentLinkingConfig3.cash_balance_enabled, instrumentLinkingConfig3.credit_card_fee_bps, EmptyList.INSTANCE, false, instrumentSelectionData3 != null ? instrumentSelectionData3.token : null);
                }
                return coroutineSingletons;
            }
        }
        realPaymentInitiator$initiate$2 = new RealPaymentInitiator$initiate$2(this, continuationImpl);
        Object obj22 = realPaymentInitiator$initiate$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentInitiator$initiate$2.label;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        paymentInitiator$Result = (PaymentInitiator$Result) obj;
        if (!(paymentInitiator$Result instanceof PaymentInitiator$Result.InitiatePayment)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendPayment(PaymentInitiatorData paymentInitiatorData, ClientScenario clientScenario, Screen screen, Screen screen2, ContinuationImpl continuationImpl) {
        RealPaymentInitiator$sendPayment$1 realPaymentInitiator$sendPayment$1;
        int i;
        ClientScenario clientScenario2;
        PaymentInitiatorData paymentInitiatorData2;
        Screen screen3;
        Screen screen4;
        InstrumentType instrumentType;
        if (continuationImpl instanceof RealPaymentInitiator$sendPayment$1) {
            realPaymentInitiator$sendPayment$1 = (RealPaymentInitiator$sendPayment$1) continuationImpl;
            int i2 = realPaymentInitiator$sendPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentInitiator$sendPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPaymentInitiator$sendPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentInitiator$sendPayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest select = this.balanceSnapshotManager.select();
                    EnumEntries entries = CashInstrumentType.getEntries();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : entries) {
                        if (((CashInstrumentType) obj2) != CashInstrumentType.CASH_BALANCE) {
                            arrayList.add(obj2);
                        }
                    }
                    CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
                    FinishSetupTileBadgeCounter combine = FlowKt.combine(select, this.instrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length)), ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig(), RealPaymentInitiator$sendPayment$5.INSTANCE);
                    realPaymentInitiator$sendPayment$1.L$0 = paymentInitiatorData;
                    clientScenario2 = clientScenario;
                    realPaymentInitiator$sendPayment$1.L$1 = clientScenario2;
                    realPaymentInitiator$sendPayment$1.L$2 = screen;
                    realPaymentInitiator$sendPayment$1.L$3 = screen2;
                    realPaymentInitiator$sendPayment$1.label = 1;
                    obj = FlowKt.first(combine, realPaymentInitiator$sendPayment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    paymentInitiatorData2 = paymentInitiatorData;
                    screen3 = screen;
                    screen4 = screen2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    screen4 = realPaymentInitiator$sendPayment$1.L$3;
                    screen3 = realPaymentInitiator$sendPayment$1.L$2;
                    clientScenario2 = realPaymentInitiator$sendPayment$1.L$1;
                    paymentInitiatorData2 = realPaymentInitiator$sendPayment$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Triple triple = (Triple) obj;
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) triple.first;
                List list = (List) triple.second;
                InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) triple.third;
                if (paymentInitiatorData2 != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Initiator data must be of type PaymentInitiatorData");
                    return null;
                }
                Orientation orientation = paymentInitiatorData2.orientation;
                Money money = paymentInitiatorData2.amount;
                UUID generate = RealUuidGenerator.generate();
                if (screen3 instanceof ListFavorites) {
                    screen3 = new ListFavorites(generate);
                }
                if (screen4 instanceof ListFavorites) {
                    screen4 = new ListFavorites(generate);
                }
                Orientation orientation2 = Orientation.BILL;
                FlowStarter flowStarter = this.flowStarter;
                if (orientation == orientation2 || paymentInitiatorData2.selection != null) {
                    return new PaymentInitiator$Result.InitiatePayment(((RealFlowStarter) flowStarter).startPaymentFlow(paymentInitiatorData2, screen3, screen4, clientScenario2));
                }
                long j = instrumentLinkingConfig.credit_card_fee_bps;
                CashInstrumentType cashInstrumentType = CashInstrumentType.CASH_BALANCE;
                list.getClass();
                money.getClass();
                cashInstrumentType.getClass();
                PaymentInstrument instrumentForCashPayment = Hkdf.instrumentForCashPayment(balanceSnapshot, list, money, j);
                if (instrumentForCashPayment == null) {
                    if (Instruments$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()] == 1) {
                        if (balanceSnapshot != null) {
                            instrumentForCashPayment = new PaymentInstrument.BalancePaymentInstrument(balanceSnapshot);
                        }
                        instrumentForCashPayment = null;
                    } else {
                        Instrument findInstrument = Hkdf.findInstrument(list, cashInstrumentType);
                        if (findInstrument != null) {
                            instrumentForCashPayment = new PaymentInstrument.ExternalPaymentInstrument(findInstrument);
                        }
                        instrumentForCashPayment = null;
                    }
                }
                if (instrumentForCashPayment == null) {
                    return PaymentInitiator$Result.SelectCard.INSTANCE;
                }
                String str = Hkdf.token(instrumentForCashPayment);
                boolean z = instrumentForCashPayment instanceof PaymentInstrument.BalancePaymentInstrument;
                if (z) {
                    instrumentType = null;
                } else {
                    if (!(instrumentForCashPayment instanceof PaymentInstrument.ExternalPaymentInstrument)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    instrumentType = ((PaymentInstrument.ExternalPaymentInstrument) instrumentForCashPayment).instrument.cardBrand;
                }
                if (!z) {
                    if (!(instrumentForCashPayment instanceof PaymentInstrument.ExternalPaymentInstrument)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    cashInstrumentType = ((PaymentInstrument.ExternalPaymentInstrument) instrumentForCashPayment).instrument.cashInstrumentType;
                }
                CurrencyCode currencyCode = money.currency_code;
                InstrumentSelectionData instrumentSelectionData = new InstrumentSelectionData(str, instrumentType, cashInstrumentType, currencyCode != null ? Moneys.zero(currencyCode) : null);
                String str2 = paymentInitiatorData2.note;
                List list2 = paymentInitiatorData2.getters;
                boolean z2 = paymentInitiatorData2.ignoreDuplicate;
                UUID uuid = paymentInitiatorData2.paymentToken;
                SignalsContext signalsContext = paymentInitiatorData2.signals;
                String str3 = paymentInitiatorData2.referrer;
                String str4 = paymentInitiatorData2.launchUrl;
                AppCreationActivity appCreationActivity = paymentInitiatorData2.appCreationActivity;
                boolean z3 = paymentInitiatorData2.allowRetry;
                String str5 = paymentInitiatorData2.exchangeRatesToken;
                PersonalizationInput personalizationInput = paymentInitiatorData2.personalizationInput;
                String str6 = paymentInitiatorData2.personalizationFlowToken;
                String str7 = paymentInitiatorData2.poolToken;
                String str8 = paymentInitiatorData2.poolContributorComment;
                BlockersData.MoneybotContext moneybotContext = paymentInitiatorData2.moneybotContext;
                String str9 = paymentInitiatorData2.flowToken;
                String str10 = paymentInitiatorData2.creationMechanism;
                ScenarioInitiator scenarioInitiator = paymentInitiatorData2.scenarioInitiator;
                String str11 = paymentInitiatorData2.nearbySessionToken;
                PaymentScheduleSelection paymentScheduleSelection = paymentInitiatorData2.scheduleSelection;
                PaymentData paymentData = paymentInitiatorData2.paymentData;
                str2.getClass();
                orientation.getClass();
                list2.getClass();
                uuid.getClass();
                appCreationActivity.getClass();
                return new PaymentInitiator$Result.InitiatePayment(((RealFlowStarter) flowStarter).startPaymentFlow(new PaymentInitiatorData(str2, orientation, list2, money, instrumentSelectionData, z2, uuid, signalsContext, str3, str4, appCreationActivity, z3, str5, personalizationInput, str6, str7, str8, moneybotContext, str9, str10, scenarioInitiator, str11, paymentScheduleSelection, paymentData), screen3, screen3, clientScenario2));
            }
        }
        realPaymentInitiator$sendPayment$1 = new RealPaymentInitiator$sendPayment$1(this, continuationImpl);
        Object obj3 = realPaymentInitiator$sendPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentInitiator$sendPayment$1.label;
        if (i != 0) {
        }
        Triple triple2 = (Triple) obj3;
        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) triple2.first;
        List list3 = (List) triple2.second;
        InstrumentLinkingConfig instrumentLinkingConfig2 = (InstrumentLinkingConfig) triple2.third;
        if (paymentInitiatorData2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiate(PaymentInitiatorData paymentInitiatorData, ClientScenario clientScenario, Screen screen, Screen screen2, boolean z, ContinuationImpl continuationImpl) {
        RealPaymentInitiator$initiate$1 realPaymentInitiator$initiate$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScenarioPlanScreens.ScenarioPlanLoadingScreen scenarioPlanLoadingScreen;
        ClientScenario clientScenario2;
        Screen screen3;
        PaymentInitiatorData paymentInitiatorData2;
        boolean z2;
        Screen screen4 = screen;
        if (continuationImpl instanceof RealPaymentInitiator$initiate$1) {
            realPaymentInitiator$initiate$1 = (RealPaymentInitiator$initiate$1) continuationImpl;
            int i2 = realPaymentInitiator$initiate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentInitiator$initiate$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realPaymentInitiator$initiate$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentInitiator$initiate$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentRecipient paymentRecipient = (PaymentRecipient) CollectionsKt.singleOrNull(paymentInitiatorData.getters);
                    if (paymentRecipient != null) {
                        Recipient.CryptoRecipientPayment cryptoRecipientPayment = paymentRecipient.cryptoInvoice;
                        Recipient.CryptoRecipientPayment.Stablecoin stablecoin = cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Stablecoin ? (Recipient.CryptoRecipientPayment.Stablecoin) cryptoRecipientPayment : null;
                        if (stablecoin != null) {
                            StablecoinWithdrawalOption stablecoinWithdrawalOption = stablecoin.option;
                            Money money = paymentInitiatorData.amount;
                            String uuid = paymentInitiatorData.paymentToken.toString();
                            String str = paymentInitiatorData.flowToken;
                            InstrumentSelectionData instrumentSelectionData = paymentInitiatorData.selection;
                            stablecoinWithdrawalOption.getClass();
                            screen4.getClass();
                            scenarioPlanLoadingScreen = new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.INITIATE_STABLECOIN_WITHDRAWAL, new InitiateStablecoinWithdrawalScenarioPlanInput(null, stablecoinWithdrawalOption, uuid, str, money, instrumentSelectionData, 1), screen4, null);
                            if (scenarioPlanLoadingScreen == null) {
                                return new PaymentInitiator$Result.InitiatePayment(scenarioPlanLoadingScreen);
                            }
                            if (!z && StringsKt.isBlank(paymentInitiatorData.note)) {
                                return PaymentInitiator$Result.LongerNote.INSTANCE;
                            }
                            if (!paymentInitiatorData.ignoreDuplicate) {
                                Money money2 = paymentInitiatorData.amount;
                                Orientation orientation = paymentInitiatorData.orientation;
                                List list = paymentInitiatorData.getters;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((PaymentRecipient) it.next()).sendableUiCustomer);
                                }
                                realPaymentInitiator$initiate$1.L$0 = paymentInitiatorData;
                                clientScenario2 = clientScenario;
                                realPaymentInitiator$initiate$1.L$1 = clientScenario2;
                                realPaymentInitiator$initiate$1.L$2 = screen4;
                                screen3 = screen2;
                                realPaymentInitiator$initiate$1.L$3 = screen3;
                                realPaymentInitiator$initiate$1.Z$0 = z;
                                realPaymentInitiator$initiate$1.label = 1;
                                obj = ((RealOfflineManager) this.offlineManager).isDuplicatePayment(money2, orientation, arrayList, realPaymentInitiator$initiate$1);
                                if (obj != coroutineSingletons) {
                                    paymentInitiatorData2 = paymentInitiatorData;
                                    z2 = z;
                                }
                            }
                            clientScenario2 = clientScenario;
                            screen3 = screen2;
                            paymentInitiatorData2 = paymentInitiatorData;
                            z2 = z;
                            realPaymentInitiator$initiate$1.L$0 = null;
                            realPaymentInitiator$initiate$1.L$1 = null;
                            realPaymentInitiator$initiate$1.L$2 = null;
                            realPaymentInitiator$initiate$1.L$3 = null;
                            realPaymentInitiator$initiate$1.Z$0 = z2;
                            realPaymentInitiator$initiate$1.label = 2;
                            Object sendPayment = sendPayment(paymentInitiatorData2, clientScenario2, screen4, screen3, realPaymentInitiator$initiate$1);
                            return sendPayment == coroutineSingletons ? coroutineSingletons : sendPayment;
                        }
                    }
                    scenarioPlanLoadingScreen = null;
                    if (scenarioPlanLoadingScreen == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = realPaymentInitiator$initiate$1.Z$0;
                    Screen screen5 = realPaymentInitiator$initiate$1.L$3;
                    Screen screen6 = realPaymentInitiator$initiate$1.L$2;
                    ClientScenario clientScenario3 = realPaymentInitiator$initiate$1.L$1;
                    paymentInitiatorData2 = realPaymentInitiator$initiate$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    screen3 = screen5;
                    screen4 = screen6;
                    clientScenario2 = clientScenario3;
                }
                if (((Boolean) obj).booleanValue()) {
                    return PaymentInitiator$Result.ConfirmDuplicate.INSTANCE;
                }
                realPaymentInitiator$initiate$1.L$0 = null;
                realPaymentInitiator$initiate$1.L$1 = null;
                realPaymentInitiator$initiate$1.L$2 = null;
                realPaymentInitiator$initiate$1.L$3 = null;
                realPaymentInitiator$initiate$1.Z$0 = z2;
                realPaymentInitiator$initiate$1.label = 2;
                Object sendPayment2 = sendPayment(paymentInitiatorData2, clientScenario2, screen4, screen3, realPaymentInitiator$initiate$1);
                if (sendPayment2 == coroutineSingletons) {
                }
            }
        }
        realPaymentInitiator$initiate$1 = new RealPaymentInitiator$initiate$1(this, continuationImpl);
        obj = realPaymentInitiator$initiate$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentInitiator$initiate$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        realPaymentInitiator$initiate$1.L$0 = null;
        realPaymentInitiator$initiate$1.L$1 = null;
        realPaymentInitiator$initiate$1.L$2 = null;
        realPaymentInitiator$initiate$1.L$3 = null;
        realPaymentInitiator$initiate$1.Z$0 = z2;
        realPaymentInitiator$initiate$1.label = 2;
        Object sendPayment22 = sendPayment(paymentInitiatorData2, clientScenario2, screen4, screen3, realPaymentInitiator$initiate$1);
        if (sendPayment22 == coroutineSingletons) {
        }
    }
}
