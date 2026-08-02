package com.squareup.cash.history.navigation;

import android.os.Parcelable;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceDetails;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceSummary;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceSummaryAndDetails;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
import com.squareup.protos.cash.woodrow.syncvalues.AcquisitionSummary;
import com.squareup.protos.cash.woodrow.syncvalues.DispositionSummary;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetails;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$confirmPayment$1$2 extends SuspendLambda implements Function5 {
    public final /* synthetic */ Object $payment;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Parcelable L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentActionHandler$confirmPayment$1$2(Object obj, Continuation continuation, int i) {
        super(5, continuation);
        this.$r8$classId = i;
        this.$payment = obj;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.$r8$classId;
        Object obj6 = this.$payment;
        switch (i) {
            case 0:
                PaymentActionHandler$confirmPayment$1$2 paymentActionHandler$confirmPayment$1$2 = new PaymentActionHandler$confirmPayment$1$2((RenderedPayment) obj6, (Continuation) obj5, 0);
                paymentActionHandler$confirmPayment$1$2.L$0 = (InstrumentLinkingConfig) obj;
                paymentActionHandler$confirmPayment$1$2.L$1 = (Recipient) obj2;
                paymentActionHandler$confirmPayment$1$2.L$2 = (BalanceSnapshot) obj3;
                paymentActionHandler$confirmPayment$1$2.L$3 = (List) obj4;
                return paymentActionHandler$confirmPayment$1$2.invokeSuspend(Unit.INSTANCE);
            default:
                PaymentActionHandler$confirmPayment$1$2 paymentActionHandler$confirmPayment$1$22 = new PaymentActionHandler$confirmPayment$1$2((RealBitcoinPerformanceDataRepo) obj6, (Continuation) obj5, 1);
                paymentActionHandler$confirmPayment$1$22.L$0 = (PerformanceDetails) obj;
                paymentActionHandler$confirmPayment$1$22.L$1 = (Money) obj2;
                paymentActionHandler$confirmPayment$1$22.L$2 = (BitcoinPerformanceSummary) obj3;
                paymentActionHandler$confirmPayment$1$22.L$3 = (PerformanceDetailsUi) obj4;
                return paymentActionHandler$confirmPayment$1$22.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BitcoinPerformanceDetails empty;
        switch (this.$r8$classId) {
            case 0:
                InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) this.L$0;
                Recipient recipient = (Recipient) this.L$1;
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) this.L$2;
                List list = (List) this.L$3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PaymentActionHandler.ConfirmPaymentData((RenderedPayment) this.$payment, instrumentLinkingConfig, recipient, list, balanceSnapshot);
            default:
                PerformanceDetails performanceDetails = (PerformanceDetails) this.L$0;
                Money money = (Money) this.L$1;
                BitcoinPerformanceSummary bitcoinPerformanceSummary = (BitcoinPerformanceSummary) this.L$2;
                PerformanceDetailsUi performanceDetailsUi = (PerformanceDetailsUi) this.L$3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CurrencyCode currencyCode = money.currency_code;
                if (performanceDetails != null) {
                    List list2 = performanceDetails.disposition_summaries;
                    List list3 = performanceDetails.acquisition_summaries;
                    if (currencyCode != null) {
                        List list4 = list3;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list4) {
                            if (((AcquisitionSummary) obj2).acquisition_type == AssetAcquisition$AcquisitionType.TRADE) {
                                arrayList.add(obj2);
                            }
                        }
                        Money money2 = new Money((Long) 0L, (CurrencyCode) null, 6);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Money money3 = ((AcquisitionSummary) it.next()).amount;
                            if (money3 == null) {
                                money3 = new Money((Long) 0L, (CurrencyCode) null, 6);
                            }
                            money2 = Moneys.plus(money2, money3);
                        }
                        Money copy$default = Money.copy$default(money2, null, currencyCode, null, 5);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list4) {
                            AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType = ((AcquisitionSummary) obj3).acquisition_type;
                            if (assetAcquisition$AcquisitionType == AssetAcquisition$AcquisitionType.DEPOSIT || assetAcquisition$AcquisitionType == AssetAcquisition$AcquisitionType.TRANSFER) {
                                arrayList2.add(obj3);
                            }
                        }
                        Money money4 = new Money((Long) 0L, (CurrencyCode) null, 6);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Money money5 = ((AcquisitionSummary) it2.next()).amount;
                            if (money5 == null) {
                                money5 = new Money((Long) 0L, (CurrencyCode) null, 6);
                            }
                            money4 = Moneys.plus(money4, money5);
                        }
                        Money copy$default2 = Money.copy$default(money4, null, currencyCode, null, 5);
                        List list5 = list2;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : list5) {
                            if (((DispositionSummary) obj4).disposition_type == AssetDisposition$DispositionType.TRADE) {
                                arrayList3.add(obj4);
                            }
                        }
                        Money money6 = new Money((Long) 0L, (CurrencyCode) null, 6);
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Money money7 = ((DispositionSummary) it3.next()).amount;
                            if (money7 == null) {
                                money7 = new Money((Long) 0L, (CurrencyCode) null, 6);
                            }
                            money6 = Moneys.plus(money6, money7);
                        }
                        Money copy$default3 = Money.copy$default(money6, null, currencyCode, null, 5);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : list5) {
                            AssetDisposition$DispositionType assetDisposition$DispositionType = ((DispositionSummary) obj5).disposition_type;
                            if (assetDisposition$DispositionType == AssetDisposition$DispositionType.TRANSFER || assetDisposition$DispositionType == AssetDisposition$DispositionType.WITHDRAW) {
                                arrayList4.add(obj5);
                            }
                        }
                        Money money8 = new Money((Long) 0L, (CurrencyCode) null, 6);
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            Money money9 = ((DispositionSummary) it4.next()).amount;
                            if (money9 == null) {
                                money9 = new Money((Long) 0L, (CurrencyCode) null, 6);
                            }
                            money8 = Moneys.plus(money8, money9);
                        }
                        empty = new BitcoinPerformanceDetails.Loaded(copy$default, copy$default2, copy$default3, Money.copy$default(money8, null, currencyCode, null, 5), performanceDetailsUi);
                        return new BitcoinPerformanceSummaryAndDetails(bitcoinPerformanceSummary, empty, money);
                    }
                }
                empty = new BitcoinPerformanceDetails.Empty(performanceDetailsUi);
                return new BitcoinPerformanceSummaryAndDetails(bitcoinPerformanceSummary, empty, money);
        }
    }
}
