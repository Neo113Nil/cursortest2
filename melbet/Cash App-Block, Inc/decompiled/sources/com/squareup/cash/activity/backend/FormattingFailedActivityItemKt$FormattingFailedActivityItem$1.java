package com.squareup.cash.activity.backend;

import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import java.time.Instant;
import java.util.Set;

/* loaded from: classes5.dex */
public final class FormattingFailedActivityItemKt$FormattingFailedActivityItem$1 implements FormattingFailedActivityItem, PaymentHistoryActivityItem {
    public final /* synthetic */ PaymentHistoryActivityItem $$delegate_0;

    public FormattingFailedActivityItemKt$FormattingFailedActivityItem$1(PaymentHistoryActivityItem paymentHistoryActivityItem) {
        this.$$delegate_0 = paymentHistoryActivityItem;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getActivityItemGlobalId() {
        return this.$$delegate_0.getActivityItemGlobalId();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Instant getDisplayInstant() {
        return this.$$delegate_0.getDisplayInstant();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Set getProductClassifiers() {
        return this.$$delegate_0.getProductClassifiers();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getReferenceItemId() {
        return this.$$delegate_0.getReferenceItemId();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final Role getRole() {
        return this.$$delegate_0.getRole();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final String getRowId() {
        return this.$$delegate_0.getRowId();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityRowSection getSection() {
        return this.$$delegate_0.getSection();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final PaymentState getState() {
        return this.$$delegate_0.getState();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final TransactionType getTransactionType() {
        return this.$$delegate_0.getTransactionType();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiPayment getUiPayment() {
        return this.$$delegate_0.getUiPayment();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiCustomer getUiRecipient() {
        return this.$$delegate_0.getUiRecipient();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final UiCustomer getUiSender() {
        return this.$$delegate_0.getUiSender();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final long getVersion() {
        return this.$$delegate_0.getVersion();
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final boolean isBadged() {
        return this.$$delegate_0.isBadged();
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final boolean isOffline() {
        return this.$$delegate_0.isOffline();
    }
}
