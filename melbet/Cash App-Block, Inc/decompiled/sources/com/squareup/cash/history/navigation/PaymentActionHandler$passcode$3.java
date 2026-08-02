package com.squareup.cash.history.navigation;

import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.google.crypto.tink.subtle.Hkdf;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.instruments.backend.api.PaymentInstrument;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ConfirmBlocker;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$passcode$3 extends SuspendLambda implements Function5 {
    public final /* synthetic */ PaymentAction.PasscodeAction $action;
    public final /* synthetic */ RenderedPayment $payment;
    public /* synthetic */ InstrumentLinkingConfig L$0;
    public /* synthetic */ Recipient L$1;
    public /* synthetic */ BalanceSnapshot L$2;
    public /* synthetic */ List L$3;
    public int label;
    public final /* synthetic */ PaymentActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionHandler$passcode$3(PaymentActionHandler paymentActionHandler, PaymentAction.PasscodeAction passcodeAction, RenderedPayment renderedPayment, Continuation continuation) {
        super(5, continuation);
        this.this$0 = paymentActionHandler;
        this.$action = passcodeAction;
        this.$payment = renderedPayment;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        PaymentAction.PasscodeAction passcodeAction = this.$action;
        RenderedPayment renderedPayment = this.$payment;
        PaymentActionHandler$passcode$3 paymentActionHandler$passcode$3 = new PaymentActionHandler$passcode$3(this.this$0, passcodeAction, renderedPayment, (Continuation) obj5);
        paymentActionHandler$passcode$3.L$0 = (InstrumentLinkingConfig) obj;
        paymentActionHandler$passcode$3.L$1 = (Recipient) obj2;
        paymentActionHandler$passcode$3.L$2 = (BalanceSnapshot) obj3;
        paymentActionHandler$passcode$3.L$3 = (List) obj4;
        return paymentActionHandler$passcode$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        HistoryScreens.PaymentPasscodeDialog paymentPasscodeDialog;
        Parcelable parcelable;
        List<BlockerDescriptor> list;
        ConfirmBlocker confirmBlocker;
        InstrumentLinkingConfig instrumentLinkingConfig = this.L$0;
        Recipient recipient = this.L$1;
        BalanceSnapshot balanceSnapshot = this.L$2;
        List list2 = this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Parcelable parcelable2 = null;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        RenderedPayment renderedPayment = this.$payment;
        Orientation orientation = renderedPayment.orientation;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 1;
        PaymentActionHandler paymentActionHandler = this.this$0;
        paymentActionHandler.getClass();
        PaymentHistoryData paymentHistoryData = renderedPayment.historyData;
        String str2 = renderedPayment.token;
        Money money = renderedPayment.amount;
        ScenarioPlan scenarioPlan = paymentHistoryData.scenario_plan;
        if (scenarioPlan != null && (list = scenarioPlan.blocker_descriptors) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    confirmBlocker = null;
                    break;
                }
                Blockers blockers = ((BlockerDescriptor) it.next()).blocker;
                confirmBlocker = blockers != null ? blockers.confirm : null;
                if (confirmBlocker != null) {
                    break;
                }
            }
            if (confirmBlocker != null) {
                str = confirmBlocker.instrument_token;
                if (str != null) {
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Passcode confirmation required with no confirm blocker (", str2, ")");
                    Timber.Forest.e(m, new Object[0], new IllegalStateException(m));
                } else {
                    boolean equals = "CUSTOMER_PASSCODE".equals(str);
                    boolean z = orientation == Orientation.CASH && renderedPayment.role == Role.SENDER;
                    long j = instrumentLinkingConfig.credit_card_fee_bps;
                    if (list2.isEmpty()) {
                        Timber.Forest.e("No instruments.", new Object[0], new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No instruments. (", str2, ")")));
                        paymentPasscodeDialog = null;
                        JobKt.launch$default(paymentActionHandler.scope, null, CoroutineStart.UNDISPATCHED, new RealKeyStoreProvider$load$2(paymentActionHandler, false ? 1 : 0, 6), 1);
                    } else {
                        PaymentAction.PasscodeAction passcodeAction = this.$action;
                        if (z || !Hkdf.needToSelectInstrumentForCash(balanceSnapshot, list2, money, j)) {
                            PaymentInstrument instrumentForCashPayment = z ? null : Hkdf.instrumentForCashPayment(balanceSnapshot, list2, money, j);
                            if (equals || instrumentForCashPayment == null) {
                                paymentPasscodeDialog = new HistoryScreens.PaymentPasscodeDialog(passcodeAction.flowToken, renderedPayment.token, instrumentForCashPayment != null ? Hkdf.token(instrumentForCashPayment) : null, str, (InstrumentType) null, (String) null);
                            } else {
                                String str3 = passcodeAction.flowToken;
                                String str4 = renderedPayment.token;
                                String str5 = Hkdf.token(instrumentForCashPayment);
                                String str6 = Hkdf.token(instrumentForCashPayment);
                                boolean z2 = instrumentForCashPayment instanceof PaymentInstrument.ExternalPaymentInstrument;
                                PaymentInstrument.ExternalPaymentInstrument externalPaymentInstrument = z2 ? (PaymentInstrument.ExternalPaymentInstrument) instrumentForCashPayment : null;
                                InstrumentType instrumentType = externalPaymentInstrument != null ? externalPaymentInstrument.instrument.cardBrand : null;
                                PaymentInstrument.ExternalPaymentInstrument externalPaymentInstrument2 = z2 ? (PaymentInstrument.ExternalPaymentInstrument) instrumentForCashPayment : null;
                                parcelable = new HistoryScreens.PaymentPasscodeDialog(str3, str4, str5, str6, instrumentType, externalPaymentInstrument2 != null ? externalPaymentInstrument2.instrument.suffix : null);
                            }
                        } else {
                            if (Hkdf.needToSelectInstrumentForCash(balanceSnapshot, list2, money, j)) {
                                CashInstrumentType cashInstrumentType = CashInstrumentType.DEBIT_CARD;
                                if (Hkdf.findInstrument(list2, cashInstrumentType) == null && Hkdf.findInstrument(list2, CashInstrumentType.CREDIT_CARD) == null) {
                                    parcelable2 = ((RealFlowStarter) paymentActionHandler.flowStarter).startActivityLinkingFlow(passcodeAction.flowToken, cashInstrumentType, false, false, renderedPayment.role, renderedPayment.token, (Screen) paymentActionHandler.activeArgs.invoke());
                                }
                            }
                            SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                            List list3 = list2;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((Instrument) it2.next()).token);
                            }
                            parcelable = new HistoryScreens.SelectPaymentInstrument(arrayList, CollectionsKt__CollectionsJVMKt.listOf(CreditcardTypeValidator.getPaymentInfo(recipient)), renderedPayment.amount, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.cash_balance_enabled, instrumentLinkingConfig.credit_card_fee_bps, null, orientation == Orientation.BILL, passcodeAction.flowToken, renderedPayment.role, renderedPayment.token, equals ? "CUSTOMER_PASSCODE" : null, HistoryScreens.SelectPaymentInstrument.NextScreen.PASSCODE, 1920);
                        }
                        parcelable2 = parcelable;
                    }
                    parcelable2 = paymentPasscodeDialog;
                }
                return parcelable2 != coroutineSingletons ? coroutineSingletons : parcelable2;
            }
        }
        str = null;
        if (str != null) {
        }
        if (parcelable2 != coroutineSingletons) {
        }
    }
}
