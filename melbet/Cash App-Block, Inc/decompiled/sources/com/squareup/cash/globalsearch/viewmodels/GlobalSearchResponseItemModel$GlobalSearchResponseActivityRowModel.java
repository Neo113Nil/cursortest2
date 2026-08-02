package com.squareup.cash.globalsearch.viewmodels;

import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import java.time.Instant;
import java.util.Set;

/* loaded from: classes5.dex */
public final class GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel implements FormattedPaymentHistoryActivityItem {
    public final FormattedPaymentHistoryActivityItem delegate;

    public GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        this.delegate = formattedPaymentHistoryActivityItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel) && this.delegate.equals(((GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel) obj).delegate);
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getActivityItemGlobalId() {
        return this.delegate.getActivityItemGlobalId();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Instant getDisplayInstant() {
        return this.delegate.getDisplayInstant();
    }

    @Override // com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem
    public final PaymentHistoryData getPaymentHistoryData() {
        return this.delegate.getPaymentHistoryData();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Set getProductClassifiers() {
        return this.delegate.getProductClassifiers();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getReferenceItemId() {
        return this.delegate.getReferenceItemId();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final Role getRole() {
        return this.delegate.getRole();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final String getRowId() {
        return this.delegate.getRowId();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityRowSection getSection() {
        return this.delegate.getSection();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final PaymentState getState() {
        return this.delegate.getState();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final TransactionType getTransactionType() {
        return this.delegate.getTransactionType();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiPayment getUiPayment() {
        return this.delegate.getUiPayment();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiCustomer getUiRecipient() {
        return this.delegate.getUiRecipient();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiCustomer getUiSender() {
        return this.delegate.getUiSender();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final long getVersion() {
        return this.delegate.getVersion();
    }

    public final int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final boolean isBadged() {
        return this.delegate.isBadged();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final boolean isOffline() {
        return this.delegate.isOffline();
    }

    public final String toString() {
        return "GlobalSearchResponseActivityRowModel(delegate=" + this.delegate + ")";
    }
}
