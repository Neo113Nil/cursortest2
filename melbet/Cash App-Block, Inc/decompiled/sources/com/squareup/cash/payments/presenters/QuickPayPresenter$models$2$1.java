package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.ContactsStatus;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class QuickPayPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $profile$delegate;
    public final /* synthetic */ MutableState $state$delegate;
    public int I$0;
    public InstrumentLinkingConfig L$0;
    public Region L$1;
    public BalanceSnapshot L$2;
    public List L$3;
    public Object L$4;
    public QuickPayPresenter L$6;
    public Iterator L$7;
    public PaymentRecipient L$9;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ QuickPayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayPresenter$models$2$1(QuickPayPresenter quickPayPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickPayPresenter;
        this.$profile$delegate = mutableState;
        this.$state$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickPayPresenter$models$2$1(this.this$0, this.$profile$delegate, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickPayPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0168, code lost:
    
        if (r2 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d1, code lost:
    
        if (r10 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        if (r9 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a1, code lost:
    
        if (r4 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x01c2 -> B:7:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01d9 -> B:11:0x01dd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        InstrumentLinkingConfig instrumentLinkingConfig;
        Object first2;
        Region region;
        Object first3;
        Object first4;
        InstrumentLinkingConfig instrumentLinkingConfig2;
        BalanceSnapshot balanceSnapshot;
        List list;
        Object first5;
        InstrumentLinkingConfig instrumentLinkingConfig3;
        Region region2;
        BalanceSnapshot balanceSnapshot2;
        MutableState mutableState;
        Object first6;
        boolean booleanValue;
        List list2;
        InstrumentLinkingConfig instrumentLinkingConfig4;
        int i;
        Iterator it;
        Region region3;
        List list3;
        BalanceSnapshot balanceSnapshot3;
        PaymentRecipient paymentRecipient;
        List list4;
        ContactsStatus contactsStatus;
        Object contactStatus;
        QuickPayPresenter quickPayPresenter;
        int i2;
        QuickPayPresenter$models$2$1 quickPayPresenter$models$2$1 = this;
        QuickPayPresenter quickPayPresenter2 = quickPayPresenter$models$2$1.this$0;
        RealProfileManager realProfileManager = quickPayPresenter2.profileManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = quickPayPresenter$models$2$1.label;
        MutableState mutableState2 = quickPayPresenter$models$2$1.$profile$delegate;
        MutableState mutableState3 = quickPayPresenter$models$2$1.$state$delegate;
        switch (i3) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                FinishSetupTileBadgeCounter instrumentLinkingConfig5 = ((RealAppConfigManager) quickPayPresenter2.appConfigManager).instrumentLinkingConfig();
                quickPayPresenter$models$2$1.label = 1;
                first = FlowKt.first(instrumentLinkingConfig5, quickPayPresenter$models$2$1);
                break;
            case 1:
                SafeTrace.throwOnFailure(obj);
                first = obj;
                instrumentLinkingConfig = (InstrumentLinkingConfig) first;
                FlowQuery$mapToList$$inlined$map$1 region4 = realProfileManager.region();
                quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig;
                quickPayPresenter$models$2$1.label = 2;
                first2 = FlowKt.first(region4, quickPayPresenter$models$2$1);
                break;
            case 2:
                instrumentLinkingConfig = quickPayPresenter$models$2$1.L$0;
                SafeTrace.throwOnFailure(obj);
                first2 = obj;
                region = ((SelectRegion) first2).region;
                if (region == null) {
                    region = Region.USA;
                }
                ChannelFlowTransformLatest select = quickPayPresenter2.balanceSnapshotManager.select();
                quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig;
                quickPayPresenter$models$2$1.L$1 = region;
                quickPayPresenter$models$2$1.label = 3;
                first3 = FlowKt.first(select, quickPayPresenter$models$2$1);
                break;
            case 3:
                Region region5 = quickPayPresenter$models$2$1.L$1;
                InstrumentLinkingConfig instrumentLinkingConfig6 = quickPayPresenter$models$2$1.L$0;
                SafeTrace.throwOnFailure(obj);
                region = region5;
                instrumentLinkingConfig = instrumentLinkingConfig6;
                first3 = obj;
                BalanceSnapshot balanceSnapshot4 = (BalanceSnapshot) first3;
                RealInstrumentManager realInstrumentManager = quickPayPresenter2.instrumentManager;
                EnumEntries entries = CashInstrumentType.getEntries();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : entries) {
                    if (((CashInstrumentType) obj2) != CashInstrumentType.CASH_BALANCE) {
                        arrayList.add(obj2);
                    }
                }
                CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
                Flow forTypes = realInstrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length));
                quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig;
                quickPayPresenter$models$2$1.L$1 = region;
                quickPayPresenter$models$2$1.L$2 = balanceSnapshot4;
                quickPayPresenter$models$2$1.label = 4;
                first4 = FlowKt.first(forTypes, quickPayPresenter$models$2$1);
                if (first4 != coroutineSingletons) {
                    instrumentLinkingConfig2 = instrumentLinkingConfig;
                    balanceSnapshot = balanceSnapshot4;
                    list = (List) first4;
                    FlowQuery$mapToList$$inlined$map$1 profile = realProfileManager.profile();
                    quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig2;
                    quickPayPresenter$models$2$1.L$1 = region;
                    quickPayPresenter$models$2$1.L$2 = balanceSnapshot;
                    quickPayPresenter$models$2$1.L$3 = list;
                    quickPayPresenter$models$2$1.L$4 = mutableState2;
                    quickPayPresenter$models$2$1.label = 5;
                    first5 = FlowKt.first(profile, quickPayPresenter$models$2$1);
                    if (first5 != coroutineSingletons) {
                        instrumentLinkingConfig3 = instrumentLinkingConfig2;
                        region2 = region;
                        balanceSnapshot2 = balanceSnapshot;
                        mutableState = mutableState2;
                        mutableState.setValue((Profile) first5);
                        Flow hasPassedIdv = quickPayPresenter2.statusAndLimitsManager.hasPassedIdv();
                        quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig3;
                        quickPayPresenter$models$2$1.L$1 = region2;
                        quickPayPresenter$models$2$1.L$2 = balanceSnapshot2;
                        quickPayPresenter$models$2$1.L$3 = list;
                        quickPayPresenter$models$2$1.L$4 = null;
                        quickPayPresenter$models$2$1.label = 6;
                        first6 = FlowKt.first(hasPassedIdv, quickPayPresenter$models$2$1);
                        break;
                    }
                }
                return coroutineSingletons;
            case 4:
                balanceSnapshot = quickPayPresenter$models$2$1.L$2;
                region = quickPayPresenter$models$2$1.L$1;
                instrumentLinkingConfig2 = quickPayPresenter$models$2$1.L$0;
                SafeTrace.throwOnFailure(obj);
                first4 = obj;
                list = (List) first4;
                FlowQuery$mapToList$$inlined$map$1 profile2 = realProfileManager.profile();
                quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig2;
                quickPayPresenter$models$2$1.L$1 = region;
                quickPayPresenter$models$2$1.L$2 = balanceSnapshot;
                quickPayPresenter$models$2$1.L$3 = list;
                quickPayPresenter$models$2$1.L$4 = mutableState2;
                quickPayPresenter$models$2$1.label = 5;
                first5 = FlowKt.first(profile2, quickPayPresenter$models$2$1);
                if (first5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                MutableState mutableState4 = (MutableState) quickPayPresenter$models$2$1.L$4;
                List list5 = quickPayPresenter$models$2$1.L$3;
                balanceSnapshot2 = quickPayPresenter$models$2$1.L$2;
                region2 = quickPayPresenter$models$2$1.L$1;
                instrumentLinkingConfig3 = quickPayPresenter$models$2$1.L$0;
                SafeTrace.throwOnFailure(obj);
                list = list5;
                mutableState = mutableState4;
                first5 = obj;
                mutableState.setValue((Profile) first5);
                Flow hasPassedIdv2 = quickPayPresenter2.statusAndLimitsManager.hasPassedIdv();
                quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig3;
                quickPayPresenter$models$2$1.L$1 = region2;
                quickPayPresenter$models$2$1.L$2 = balanceSnapshot2;
                quickPayPresenter$models$2$1.L$3 = list;
                quickPayPresenter$models$2$1.L$4 = null;
                quickPayPresenter$models$2$1.label = 6;
                first6 = FlowKt.first(hasPassedIdv2, quickPayPresenter$models$2$1);
                break;
            case 6:
                List list6 = quickPayPresenter$models$2$1.L$3;
                BalanceSnapshot balanceSnapshot5 = quickPayPresenter$models$2$1.L$2;
                Region region6 = quickPayPresenter$models$2$1.L$1;
                InstrumentLinkingConfig instrumentLinkingConfig7 = quickPayPresenter$models$2$1.L$0;
                SafeTrace.throwOnFailure(obj);
                instrumentLinkingConfig3 = instrumentLinkingConfig7;
                region2 = region6;
                balanceSnapshot2 = balanceSnapshot5;
                list = list6;
                first6 = obj;
                booleanValue = ((Boolean) first6).booleanValue();
                ArrayList arrayList2 = new ArrayList();
                list2 = list;
                instrumentLinkingConfig4 = instrumentLinkingConfig3;
                i = 0;
                it = ((QuickPayState) mutableState3.getValue()).paymentGetters.iterator();
                region3 = region2;
                list3 = arrayList2;
                balanceSnapshot3 = balanceSnapshot2;
                if (!it.hasNext()) {
                    paymentRecipient = (PaymentRecipient) it.next();
                    String str = paymentRecipient.sendableUiCustomer.id;
                    if (str != null) {
                        RealRecipientRepository realRecipientRepository = quickPayPresenter2.recipientRepository;
                        quickPayPresenter$models$2$1.L$0 = instrumentLinkingConfig4;
                        quickPayPresenter$models$2$1.L$1 = region3;
                        quickPayPresenter$models$2$1.L$2 = balanceSnapshot3;
                        quickPayPresenter$models$2$1.L$3 = list2;
                        quickPayPresenter$models$2$1.L$4 = list3;
                        quickPayPresenter$models$2$1.L$6 = quickPayPresenter2;
                        quickPayPresenter$models$2$1.L$7 = it;
                        quickPayPresenter$models$2$1.L$9 = paymentRecipient;
                        quickPayPresenter$models$2$1.Z$0 = booleanValue;
                        quickPayPresenter$models$2$1.I$0 = i;
                        quickPayPresenter$models$2$1.label = 7;
                        contactStatus = realRecipientRepository.getContactStatus(str, quickPayPresenter$models$2$1);
                        if (contactStatus != coroutineSingletons) {
                            int i4 = i;
                            quickPayPresenter = quickPayPresenter2;
                            i2 = i4;
                            list4 = list2;
                            com.squareup.cash.data.contacts.ContactsStatus contactsStatus2 = (com.squareup.cash.data.contacts.ContactsStatus) contactStatus;
                            QuickPayPresenter quickPayPresenter3 = quickPayPresenter;
                            i = i2;
                            quickPayPresenter2 = quickPayPresenter3;
                            contactsStatus = contactsStatus2 == null ? UtilsKt.toProto(contactsStatus2) : null;
                            UiCustomer copy$default = UiCustomer.copy$default(paymentRecipient.sendableUiCustomer, null, null, null, null, null, null, null, null, null, contactsStatus, null, -1073741825);
                            Redacted redacted = paymentRecipient.displayName;
                            RecipientPaymentInfo recipientPaymentInfo = paymentRecipient.paymentInfo;
                            RecipientType recipientType = paymentRecipient.recipientType;
                            Recipient.CryptoRecipientPayment cryptoRecipientPayment = paymentRecipient.cryptoInvoice;
                            redacted.getClass();
                            recipientPaymentInfo.getClass();
                            recipientType.getClass();
                            list3.add(new PaymentRecipient(copy$default, redacted, recipientPaymentInfo, recipientType, cryptoRecipientPayment));
                            quickPayPresenter$models$2$1 = this;
                            list2 = list4;
                            if (!it.hasNext()) {
                                QuickPayState quickPayState = (QuickPayState) mutableState3.getValue();
                                Money money = ((QuickPayState) mutableState3.getValue()).acceptedFee;
                                if (money == null) {
                                    money = Moneys.zero(CurrencyCode.USD);
                                }
                                Profile profile3 = (Profile) mutableState2.getValue();
                                mutableState3.setValue(QuickPayState.copy$default(quickPayState, null, null, region3, false, money, null, null, balanceSnapshot3, list2, instrumentLinkingConfig4, Boolean.valueOf(booleanValue), profile3 != null ? profile3.country_code : null, false, null, false, list3, null, 180422));
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutineSingletons;
                    }
                    list4 = list2;
                    contactsStatus = null;
                    UiCustomer copy$default2 = UiCustomer.copy$default(paymentRecipient.sendableUiCustomer, null, null, null, null, null, null, null, null, null, contactsStatus, null, -1073741825);
                    Redacted redacted2 = paymentRecipient.displayName;
                    RecipientPaymentInfo recipientPaymentInfo2 = paymentRecipient.paymentInfo;
                    RecipientType recipientType2 = paymentRecipient.recipientType;
                    Recipient.CryptoRecipientPayment cryptoRecipientPayment2 = paymentRecipient.cryptoInvoice;
                    redacted2.getClass();
                    recipientPaymentInfo2.getClass();
                    recipientType2.getClass();
                    list3.add(new PaymentRecipient(copy$default2, redacted2, recipientPaymentInfo2, recipientType2, cryptoRecipientPayment2));
                    quickPayPresenter$models$2$1 = this;
                    list2 = list4;
                    if (!it.hasNext()) {
                    }
                }
            case 7:
                i2 = quickPayPresenter$models$2$1.I$0;
                booleanValue = quickPayPresenter$models$2$1.Z$0;
                PaymentRecipient paymentRecipient2 = quickPayPresenter$models$2$1.L$9;
                it = quickPayPresenter$models$2$1.L$7;
                QuickPayPresenter quickPayPresenter4 = quickPayPresenter$models$2$1.L$6;
                list3 = (List) quickPayPresenter$models$2$1.L$4;
                list4 = quickPayPresenter$models$2$1.L$3;
                balanceSnapshot3 = quickPayPresenter$models$2$1.L$2;
                region3 = quickPayPresenter$models$2$1.L$1;
                instrumentLinkingConfig4 = quickPayPresenter$models$2$1.L$0;
                SafeTrace.throwOnFailure(obj);
                quickPayPresenter = quickPayPresenter4;
                paymentRecipient = paymentRecipient2;
                contactStatus = obj;
                com.squareup.cash.data.contacts.ContactsStatus contactsStatus22 = (com.squareup.cash.data.contacts.ContactsStatus) contactStatus;
                QuickPayPresenter quickPayPresenter32 = quickPayPresenter;
                i = i2;
                quickPayPresenter2 = quickPayPresenter32;
                contactsStatus = contactsStatus22 == null ? UtilsKt.toProto(contactsStatus22) : null;
                UiCustomer copy$default22 = UiCustomer.copy$default(paymentRecipient.sendableUiCustomer, null, null, null, null, null, null, null, null, null, contactsStatus, null, -1073741825);
                Redacted redacted22 = paymentRecipient.displayName;
                RecipientPaymentInfo recipientPaymentInfo22 = paymentRecipient.paymentInfo;
                RecipientType recipientType22 = paymentRecipient.recipientType;
                Recipient.CryptoRecipientPayment cryptoRecipientPayment22 = paymentRecipient.cryptoInvoice;
                redacted22.getClass();
                recipientPaymentInfo22.getClass();
                recipientType22.getClass();
                list3.add(new PaymentRecipient(copy$default22, redacted22, recipientPaymentInfo22, recipientType22, cryptoRecipientPayment22));
                quickPayPresenter$models$2$1 = this;
                list2 = list4;
                if (!it.hasNext()) {
                }
                break;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
