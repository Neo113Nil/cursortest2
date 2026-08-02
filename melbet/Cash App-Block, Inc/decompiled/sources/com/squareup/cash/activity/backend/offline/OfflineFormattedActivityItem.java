package com.squareup.cash.activity.backend.offline;

import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import java.time.Instant;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class OfflineFormattedActivityItem implements FormattedPaymentHistoryActivityItem {
    public final ActivityItemGlobalId activityItemGlobalId;
    public final Lazy displayInstant$delegate;
    public final boolean isOffline;
    public final PaymentHistoryData paymentHistoryData;
    public final Set productClassifiers;
    public final Role role;
    public final String rowId;
    public final ActivityRowSection section;
    public final PaymentState state = PaymentState.PROCESSING;
    public final TransactionType transactionType;
    public final UiPayment uiPayment;
    public final UiCustomer uiRecipient;
    public final UiCustomer uiSender;

    public OfflineFormattedActivityItem(ActivityItemGlobalId activityItemGlobalId, UiPayment uiPayment, PaymentHistoryData paymentHistoryData, UiCustomer uiCustomer, UiCustomer uiCustomer2, Role role, TransactionType transactionType, Set set) {
        this.activityItemGlobalId = activityItemGlobalId;
        this.uiPayment = uiPayment;
        this.paymentHistoryData = paymentHistoryData;
        this.uiSender = uiCustomer;
        this.uiRecipient = uiCustomer2;
        this.role = role;
        this.transactionType = transactionType;
        this.productClassifiers = set;
        ActivityItemType itemType = ActivityItemKt.getItemType(this);
        Integer valueOf = itemType != null ? Integer.valueOf(itemType.getValue()) : null;
        this.rowId = valueOf + "-" + ActivityItemKt.getItemId(this);
        this.section = ActivityRowSection.PENDING;
        this.isOffline = true;
        this.displayInstant$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new yf$$ExternalSyntheticLambda2(this, 21));
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getActivityItemGlobalId() {
        return this.activityItemGlobalId;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Instant getDisplayInstant() {
        Object value = this.displayInstant$delegate.getValue();
        value.getClass();
        return (Instant) value;
    }

    @Override // com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem
    public final PaymentHistoryData getPaymentHistoryData() {
        return this.paymentHistoryData;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Set getProductClassifiers() {
        return this.productClassifiers;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getReferenceItemId() {
        return null;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final Role getRole() {
        return this.role;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final String getRowId() {
        return this.rowId;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityRowSection getSection() {
        return this.section;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final PaymentState getState() {
        return this.state;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiPayment getUiPayment() {
        return this.uiPayment;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiCustomer getUiRecipient() {
        return this.uiRecipient;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiCustomer getUiSender() {
        return this.uiSender;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final long getVersion() {
        return 0L;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final boolean isBadged() {
        return false;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final boolean isOffline() {
        return this.isOffline;
    }
}
