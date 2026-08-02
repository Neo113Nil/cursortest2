package com.squareup.cash.activity.backend.offline;

import androidx.room.util.DBUtil;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.OfflineQueries$PendingQuery;
import com.squareup.cash.db2.payment.OfflineQueries$pending$2;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.OfflinePaymentHistoryData;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealOfflineActivitiesManager implements OfflineActivitiesManager {
    public static final UiCustomer C_INCOMING_TRANSFER = new UiCustomer("C_INCOMING_TRANSFER", "My Cash", "{\"id\":\"C_INCOMING_TRANSFER\",\"full_name\":\"My Cash\",\"is_new_customer\":true,\"block_state\":\"NOT_APPLICABLE\",\"is_business\":false,\"is_verified_account\":false,\"photo_url\":\"https://franklin-assets.s3.amazonaws.com/images/profile/transaction-avatar-v2.png\",\"is_verification_required\":false,\"region\":\"USA\",\"display_units\":\"SATOSHIS\"}", 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, -65610);
    public static final UiCustomer C_OUTGOING_TRANSFER = new UiCustomer("C_OUTGOING_TRANSFER", "My Cash", "{\"id\":\"C_OUTGOING_TRANSFER\",\"full_name\":\"My Cash\",\"is_new_customer\":true,\"block_state\":\"NOT_APPLICABLE\",\"is_business\":false,\"is_verified_account\":false,\"photo_url\":\"https://franklin-assets.s3.amazonaws.com/images/profile/transaction-avatar-v2.png\",\"is_verification_required\":false,\"region\":\"USA\",\"display_units\":\"BITCOIN\"}", null, null, null, -65610);
    public final Flow historyDataJavaScripter;
    public final CoroutineContext ioDispatcher;
    public final CoroutineContext jsDispatcher;
    public final FlowQuery$mapToList$$inlined$map$1 pending;

    public RealOfflineActivitiesManager(Flow flow, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.historyDataJavaScripter = flow;
        this.jsDispatcher = coroutineContext;
        this.ioDispatcher = coroutineContext2;
        RewardSlotQueries rewardSlotQueries = cashAccountDatabaseImpl.offlineQueries;
        rewardSlotQueries.getClass();
        OfflineQueries$pending$2 offlineQueries$pending$2 = OfflineQueries$pending$2.INSTANCE;
        this.pending = DBUtil.mapToList(DBUtil.toFlow(new OfflineQueries$PendingQuery(rewardSlotQueries, new OfflineQueries$$ExternalSyntheticLambda0(rewardSlotQueries, (byte) 0))), coroutineContext2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$makePaymentItem(RealOfflineActivitiesManager realOfflineActivitiesManager, InitiatePaymentRequest initiatePaymentRequest, int i, ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, ContinuationImpl continuationImpl) {
        RealOfflineActivitiesManager$makePaymentItem$1 realOfflineActivitiesManager$makePaymentItem$1;
        int i2;
        InitiatePaymentRequest initiatePaymentRequest2;
        int i3;
        UiCustomer uiCustomer;
        UiPayment uiPayment;
        PaymentHistoryData paymentHistoryData;
        if (continuationImpl instanceof RealOfflineActivitiesManager$makePaymentItem$1) {
            realOfflineActivitiesManager$makePaymentItem$1 = (RealOfflineActivitiesManager$makePaymentItem$1) continuationImpl;
            int i4 = realOfflineActivitiesManager$makePaymentItem$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realOfflineActivitiesManager$makePaymentItem$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realOfflineActivitiesManager$makePaymentItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realOfflineActivitiesManager$makePaymentItem$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOfflineActivitiesManager$makePaymentItem$1.L$0 = initiatePaymentRequest;
                    realOfflineActivitiesManager$makePaymentItem$1.I$0 = i;
                    realOfflineActivitiesManager$makePaymentItem$1.label = 1;
                    Object offlinePaymentHistoryData = ziplineHistoryDataJavaScripter.offlinePaymentHistoryData(initiatePaymentRequest, realOfflineActivitiesManager$makePaymentItem$1);
                    if (offlinePaymentHistoryData == obj2) {
                        return obj2;
                    }
                    initiatePaymentRequest2 = initiatePaymentRequest;
                    i3 = i;
                    obj = offlinePaymentHistoryData;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = realOfflineActivitiesManager$makePaymentItem$1.I$0;
                    InitiatePaymentRequest initiatePaymentRequest3 = realOfflineActivitiesManager$makePaymentItem$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    initiatePaymentRequest2 = initiatePaymentRequest3;
                }
                OfflinePaymentHistoryData offlinePaymentHistoryData2 = (OfflinePaymentHistoryData) obj;
                Role role = initiatePaymentRequest2.orientation != Orientation.CASH ? Role.SENDER : Role.RECIPIENT;
                uiCustomer = (UiCustomer) CollectionsKt.getOrNull(i3, initiatePaymentRequest2.payment_getters);
                if (uiCustomer == null || (uiPayment = (UiPayment) CollectionsKt.getOrNull(i3, offlinePaymentHistoryData2.payments)) == null) {
                    return null;
                }
                String str = uiPayment.token;
                str.getClass();
                paymentHistoryData = uiPayment.history_data;
                if (paymentHistoryData == null) {
                    return new OfflinePaymentActivityItem(str, uiPayment, paymentHistoryData, role == Role.SENDER ? new UiCustomer(null, null, null, null, null, null, -1) : uiCustomer, role == Role.RECIPIENT ? new UiCustomer(null, null, null, null, null, null, -1) : uiCustomer, ActivityItemType.P2P_FIAT_PAYMENT, role, initiatePaymentRequest2, uiCustomer);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Offline UiPayment's history_data was null!");
                return null;
            }
        }
        realOfflineActivitiesManager$makePaymentItem$1 = new RealOfflineActivitiesManager$makePaymentItem$1(realOfflineActivitiesManager, continuationImpl);
        Object obj3 = realOfflineActivitiesManager$makePaymentItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = realOfflineActivitiesManager$makePaymentItem$1.label;
        if (i2 != 0) {
        }
        OfflinePaymentHistoryData offlinePaymentHistoryData22 = (OfflinePaymentHistoryData) obj3;
        Role role2 = initiatePaymentRequest2.orientation != Orientation.CASH ? Role.SENDER : Role.RECIPIENT;
        uiCustomer = (UiCustomer) CollectionsKt.getOrNull(i3, initiatePaymentRequest2.payment_getters);
        if (uiCustomer == null) {
            String str2 = uiPayment.token;
            str2.getClass();
            paymentHistoryData = uiPayment.history_data;
            if (paymentHistoryData == null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$makeTransferItem(RealOfflineActivitiesManager realOfflineActivitiesManager, TransferFundsRequest transferFundsRequest, ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, ContinuationImpl continuationImpl) {
        RealOfflineActivitiesManager$makeTransferItem$1 realOfflineActivitiesManager$makeTransferItem$1;
        int i;
        PaymentHistoryData paymentHistoryData;
        TransferFundsRequest transferFundsRequest2 = transferFundsRequest;
        if (continuationImpl instanceof RealOfflineActivitiesManager$makeTransferItem$1) {
            realOfflineActivitiesManager$makeTransferItem$1 = (RealOfflineActivitiesManager$makeTransferItem$1) continuationImpl;
            int i2 = realOfflineActivitiesManager$makeTransferItem$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOfflineActivitiesManager$makeTransferItem$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOfflineActivitiesManager$makeTransferItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOfflineActivitiesManager$makeTransferItem$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOfflineActivitiesManager$makeTransferItem$1.L$0 = transferFundsRequest2;
                    realOfflineActivitiesManager$makeTransferItem$1.label = 1;
                    obj = ziplineHistoryDataJavaScripter.offlinePaymentHistoryData(transferFundsRequest2, realOfflineActivitiesManager$makeTransferItem$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    transferFundsRequest2 = realOfflineActivitiesManager$makeTransferItem$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                UiPayment uiPayment = (UiPayment) CollectionsKt.single((List) ((OfflinePaymentHistoryData) obj).payments);
                Instrument instrument = transferFundsRequest2.target;
                boolean z = instrument == null && instrument.cash_instrument_type == CashInstrumentType.CASH_BALANCE;
                String str = transferFundsRequest2.external_id;
                str.getClass();
                paymentHistoryData = uiPayment.history_data;
                if (paymentHistoryData == null) {
                    return new OfflineTransferActivityItem(str, uiPayment, paymentHistoryData, z ? C_INCOMING_TRANSFER : new UiCustomer(null, null, null, null, null, null, -1), !z ? C_OUTGOING_TRANSFER : new UiCustomer(null, null, null, null, null, null, -1), z ? ActivityItemType.CASH_IN : ActivityItemType.CASH_OUT, z ? Role.RECIPIENT : Role.SENDER, z ? TransactionType.CASH_IN : TransactionType.CASH_OUT, transferFundsRequest2);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Offline UiPayment's history_data was null!");
                return null;
            }
        }
        realOfflineActivitiesManager$makeTransferItem$1 = new RealOfflineActivitiesManager$makeTransferItem$1(realOfflineActivitiesManager, continuationImpl);
        Object obj3 = realOfflineActivitiesManager$makeTransferItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOfflineActivitiesManager$makeTransferItem$1.label;
        if (i != 0) {
        }
        UiPayment uiPayment2 = (UiPayment) CollectionsKt.single((List) ((OfflinePaymentHistoryData) obj3).payments);
        Instrument instrument2 = transferFundsRequest2.target;
        if (instrument2 == null) {
        }
        String str2 = transferFundsRequest2.external_id;
        str2.getClass();
        paymentHistoryData = uiPayment2.history_data;
        if (paymentHistoryData == null) {
        }
    }
}
