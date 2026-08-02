package com.squareup.cash.history.navigation;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.history.screens.HistoryScreens;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.google.crypto.tink.subtle.Hkdf;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.instruments.backend.api.PaymentInstrument;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.utils.HasNotPassedIdvSortRanking;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOptions;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ PaymentAction.ConfirmAction $action$inlined;
    public final /* synthetic */ int $r8$classId = 0;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public FlowCollector L$2;
    public int label;
    public final /* synthetic */ PaymentActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1(Continuation continuation, PaymentActionHandler paymentActionHandler, PaymentAction.ConfirmAction confirmAction) {
        super(3, continuation);
        this.this$0 = paymentActionHandler;
        this.$action$inlined = confirmAction;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1 paymentActionHandler$confirmPayment$$inlined$flatMapLatest$1 = new PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1(continuation, this.this$0, this.$action$inlined);
                paymentActionHandler$confirmPayment$$inlined$flatMapLatest$1.L$0 = flowCollector;
                paymentActionHandler$confirmPayment$$inlined$flatMapLatest$1.L$1 = obj2;
                return paymentActionHandler$confirmPayment$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1 paymentActionHandler$confirmPayment$$inlined$flatMapLatest$12 = new PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1(continuation, this.$action$inlined, this.this$0);
                paymentActionHandler$confirmPayment$$inlined$flatMapLatest$12.L$0 = flowCollector;
                paymentActionHandler$confirmPayment$$inlined$flatMapLatest$12.L$1 = obj2;
                return paymentActionHandler$confirmPayment$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c1, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r9, r0, r44) == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0148, code lost:
    
        if (r44.this$0.sendConfirm(r0, r2, r3, r4, r44) == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a1, code lost:
    
        if (r44.this$0.sendConfirm(r0, r2, r3, r4, r44) == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0297, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r6, r0, r44) != r7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0215, code lost:
    
        if (r2.sendConfirm(r1, r2, null, r0, r44) == r7) goto L96;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow take;
        FlowCollector flowCollector2;
        FlowCollector flowCollector3;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22;
        PaymentInstrument instrumentForCashPayment;
        int i = this.$r8$classId;
        PaymentAction.ConfirmAction confirmAction = this.$action$inlined;
        switch (i) {
            case 0:
                FlowCollector flowCollector4 = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        flowCollector4 = this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector2 = null;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    RenderedPayment renderedPayment = (RenderedPayment) obj2;
                    int i3 = PaymentActionHandler.WhenMappings.$EnumSwitchMapping$0[renderedPayment.role.ordinal()];
                    PaymentActionHandler paymentActionHandler = this.this$0;
                    if (i3 == 1) {
                        String str = confirmAction.flowToken;
                        String str2 = renderedPayment.token;
                        Role role = Role.RECIPIENT;
                        flowCollector2 = null;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = flowCollector4;
                        this.label = 1;
                        break;
                    } else {
                        FinishSetupTileBadgeCounter instrumentLinkingConfig = ((RealAppConfigManager) paymentActionHandler.appConfig).instrumentLinkingConfig();
                        PaymentActionHandler paymentActionHandler2 = this.this$0;
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(paymentActionHandler2.customerStore.getCustomerForId(renderedPayment.theirId), 24);
                        ChannelFlowTransformLatest select = paymentActionHandler2.balanceSnapshotManager.select();
                        RealInstrumentManager realInstrumentManager = paymentActionHandler2.instrumentManager;
                        EnumEntries entries = CashInstrumentType.getEntries();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : entries) {
                            if (((CashInstrumentType) obj3) != CashInstrumentType.CASH_BALANCE) {
                                arrayList.add(obj3);
                            }
                        }
                        CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
                        flowCollector = null;
                        take = FlowKt.take(FlowKt.combine(instrumentLinkingConfig, realBadger2$setup$lambda$0$$inlined$mapNotNull$1, select, realInstrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length)), new PaymentActionHandler$confirmPayment$1$2(renderedPayment, null, 0)), 1);
                        this.L$0 = flowCollector;
                        this.L$1 = flowCollector;
                        this.L$2 = flowCollector;
                        this.label = 2;
                        break;
                    }
                }
                take = new AppLockMonitor$special$$inlined$map$2(flowCollector2, 19);
                flowCollector = flowCollector2;
                this.L$0 = flowCollector;
                this.L$1 = flowCollector;
                this.L$2 = flowCollector;
                this.label = 2;
            default:
                FlowCollector flowCollector5 = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            flowCollector5 = this.L$2;
                            SafeTrace.throwOnFailure(obj);
                            flowCollector3 = null;
                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(flowCollector3, 19);
                        }
                    } else {
                        flowCollector5 = this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector3 = null;
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(flowCollector3, 19);
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    PaymentActionHandler.ConfirmPaymentData confirmPaymentData = (PaymentActionHandler.ConfirmPaymentData) obj4;
                    if (confirmPaymentData != null) {
                        RenderedPayment renderedPayment2 = confirmPaymentData.payment;
                        InstrumentLinkingConfig instrumentLinkingConfig2 = confirmPaymentData.config;
                        Recipient recipient = confirmPaymentData.recipient;
                        List list = confirmPaymentData.instruments;
                        BalanceSnapshot balanceSnapshot = confirmPaymentData.balanceSnapshot;
                        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Instrument) it.next()).token);
                        }
                        createListBuilder.addAll(arrayList2);
                        if (balanceSnapshot != null) {
                            createListBuilder.add(balanceSnapshot.token);
                        }
                        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                        SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_ALL;
                        String str3 = confirmAction.flowToken;
                        Role role2 = renderedPayment2.role;
                        Orientation orientation = renderedPayment2.orientation;
                        Money money = renderedPayment2.amount;
                        String str4 = renderedPayment2.token;
                        HistoryScreens.SelectPaymentInstrument.NextScreen nextScreen = HistoryScreens.SelectPaymentInstrument.NextScreen.CONFIRM_PAYMENT;
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(CreditcardTypeValidator.getPaymentInfo(recipient));
                        Money money2 = renderedPayment2.amount;
                        boolean z = instrumentLinkingConfig2.cash_balance_enabled;
                        long j = instrumentLinkingConfig2.credit_card_fee_bps;
                        boolean z2 = instrumentLinkingConfig2.credit_card_linking_enabled;
                        HistoryScreens.SelectPaymentInstrument selectPaymentInstrument = new HistoryScreens.SelectPaymentInstrument(build, listOf, money2, z2, z, j, null, orientation == Orientation.BILL, str3, role2, str4, null, nextScreen, 34432);
                        int i5 = PaymentActionHandler.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                        if (i5 == 1) {
                            PaymentInstrument instrumentTokenForBillPayment = Hkdf.instrumentTokenForBillPayment(balanceSnapshot, money, list);
                            if (instrumentTokenForBillPayment != null) {
                                String str5 = confirmAction.flowToken;
                                String str6 = renderedPayment2.token;
                                String str7 = Hkdf.token(instrumentTokenForBillPayment);
                                CurrencyCode currencyCode = money.currency_code;
                                flowCollector3 = null;
                                InstrumentSelection instrumentSelection = new InstrumentSelection(str7, currencyCode != null ? Moneys.zero(currencyCode) : null, (CashInstrumentType) null, 12);
                                Role role3 = renderedPayment2.role;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = flowCollector5;
                                this.label = 1;
                                break;
                            } else {
                                appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(selectPaymentInstrument, 19);
                                appLockMonitor$special$$inlined$map$2 = appLockMonitor$special$$inlined$map$22;
                                flowCollector3 = null;
                            }
                        } else if (i5 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else if (new SelectPaymentInstrumentOptions(selectPaymentInstrumentType, balanceSnapshot, list, selectPaymentInstrument.instrumentTypes, money2, listOf, z2, z, j, false, (HasNotPassedIdvSortRanking) null, 3584).options.size() != 1 || (instrumentForCashPayment = Hkdf.instrumentForCashPayment(balanceSnapshot, list, money, instrumentLinkingConfig2.credit_card_fee_bps)) == null) {
                            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(selectPaymentInstrument, 19);
                            appLockMonitor$special$$inlined$map$2 = appLockMonitor$special$$inlined$map$22;
                            flowCollector3 = null;
                        } else if (!(instrumentForCashPayment instanceof PaymentInstrument.ExternalPaymentInstrument) || ((PaymentInstrument.ExternalPaymentInstrument) instrumentForCashPayment).instrument.cashInstrumentType != CashInstrumentType.CREDIT_CARD) {
                            String str8 = confirmAction.flowToken;
                            String str9 = renderedPayment2.token;
                            String str10 = Hkdf.token(instrumentForCashPayment);
                            CurrencyCode currencyCode2 = money.currency_code;
                            flowCollector3 = null;
                            InstrumentSelection instrumentSelection2 = new InstrumentSelection(str10, currencyCode2 != null ? Moneys.zero(currencyCode2) : null, (CashInstrumentType) null, 12);
                            Role role4 = renderedPayment2.role;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = flowCollector5;
                            this.label = 2;
                            break;
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            break;
                        }
                    } else {
                        flowCollector3 = null;
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    }
                }
                this.L$0 = flowCollector3;
                this.L$1 = flowCollector3;
                this.L$2 = flowCollector3;
                this.label = 3;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1(Continuation continuation, PaymentAction.ConfirmAction confirmAction, PaymentActionHandler paymentActionHandler) {
        super(3, continuation);
        this.$action$inlined = confirmAction;
        this.this$0 = paymentActionHandler;
    }
}
