package com.squareup.cash.activity.backend.offline;

import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes5.dex */
public final class OfflineTransferActivityItem extends OfflineFormattedActivityItem {
    public final TransferFundsRequest transferFundsRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineTransferActivityItem(String str, UiPayment uiPayment, PaymentHistoryData paymentHistoryData, UiCustomer uiCustomer, UiCustomer uiCustomer2, ActivityItemType activityItemType, Role role, TransactionType transactionType, TransferFundsRequest transferFundsRequest) {
        super(new ActivityItemGlobalId(new ActivityItemGlobalId.ActivityId.ActivityItemId(new ActivityItemId(str, activityItemType, 4)), (ActivityToken) null, 6), uiPayment, paymentHistoryData, uiCustomer, uiCustomer2, role, transactionType, SetsKt__SetsJVMKt.setOf(role == Role.SENDER ? ActivityProductClassifier.APC_CASH_OUT : ActivityProductClassifier.APC_CASH_IN));
        uiCustomer.getClass();
        uiCustomer2.getClass();
        activityItemType.getClass();
        this.transferFundsRequest = transferFundsRequest;
    }
}
