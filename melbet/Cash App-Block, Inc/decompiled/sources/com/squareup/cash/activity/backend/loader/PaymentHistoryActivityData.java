package com.squareup.cash.activity.backend.loader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PaymentHistoryActivityData implements ActivityData, PaymentHistoryActivityItem {
    public static final Parcelable.Creator<PaymentHistoryActivityData> CREATOR = new ActivityScreen.Creator(5);
    public final ActivityItemGlobalId activityItemGlobalId;
    public final Lazy displayInstant$delegate;
    public final boolean isBadged;
    public final UiPayment payment;
    public final Set productClassifiers;
    public final UiCustomer recipient;
    public final ActivityItemGlobalId referenceItemId;
    public final Role role;
    public final String rowId;
    public final ActivityRowSection section;
    public final UiCustomer sender;
    public final PaymentState state;
    public final TransactionType transactionType;
    public final UiPayment uiPayment;
    public final UiCustomer uiRecipient;
    public final UiCustomer uiSender;
    public final long version;

    public PaymentHistoryActivityData(long j, ActivityItemGlobalId activityItemGlobalId, ActivityItemGlobalId activityItemGlobalId2, ActivityRowSection activityRowSection, UiCustomer uiCustomer, UiCustomer uiCustomer2, UiPayment uiPayment, String str, Set set, boolean z) {
        uiPayment.getClass();
        uiCustomer.getClass();
        uiCustomer2.getClass();
        activityItemGlobalId.getClass();
        str.getClass();
        set.getClass();
        this.payment = uiPayment;
        this.sender = uiCustomer;
        this.recipient = uiCustomer2;
        this.activityItemGlobalId = activityItemGlobalId;
        this.isBadged = z;
        this.version = j;
        this.rowId = str;
        this.section = activityRowSection;
        this.productClassifiers = set;
        this.referenceItemId = activityItemGlobalId2;
        this.displayInstant$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new yf$$ExternalSyntheticLambda2(this, 20));
        this.role = uiPayment.role;
        this.state = uiPayment.state;
        this.transactionType = uiPayment.transaction_type;
        uiPayment.render_data.getClass();
        this.uiPayment = uiPayment;
        uiCustomer.render_data.getClass();
        this.uiSender = uiCustomer;
        uiCustomer2.render_data.getClass();
        this.uiRecipient = uiCustomer2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryActivityData)) {
            return false;
        }
        PaymentHistoryActivityData paymentHistoryActivityData = (PaymentHistoryActivityData) obj;
        return Intrinsics.areEqual(this.payment, paymentHistoryActivityData.payment) && Intrinsics.areEqual(this.sender, paymentHistoryActivityData.sender) && Intrinsics.areEqual(this.recipient, paymentHistoryActivityData.recipient) && Intrinsics.areEqual(this.activityItemGlobalId, paymentHistoryActivityData.activityItemGlobalId) && this.isBadged == paymentHistoryActivityData.isBadged && this.version == paymentHistoryActivityData.version && Intrinsics.areEqual(this.rowId, paymentHistoryActivityData.rowId) && this.section == paymentHistoryActivityData.section && Intrinsics.areEqual(this.productClassifiers, paymentHistoryActivityData.productClassifiers) && Intrinsics.areEqual(this.referenceItemId, paymentHistoryActivityData.referenceItemId);
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

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Set getProductClassifiers() {
        return this.productClassifiers;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getReferenceItemId() {
        return this.referenceItemId;
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

    @Override // com.squareup.cash.activity.backend.loader.ActivityData
    public final String getToken() {
        String str = this.payment.token;
        str.getClass();
        return str;
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

    @Override // com.squareup.cash.activity.backend.loader.ActivityData, com.squareup.cash.activity.backend.ActivityItem
    public final long getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.activityItemGlobalId.hashCode() + ((this.recipient.hashCode() + ((this.sender.hashCode() + (this.payment.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.isBadged), 31, this.version), 31, this.rowId);
        ActivityRowSection activityRowSection = this.section;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (activityRowSection == null ? 0 : activityRowSection.hashCode())) * 31, 31, this.productClassifiers);
        ActivityItemGlobalId activityItemGlobalId = this.referenceItemId;
        return m2 + (activityItemGlobalId != null ? activityItemGlobalId.hashCode() : 0);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData, com.squareup.cash.activity.backend.ActivityItem
    public final boolean isBadged() {
        return this.isBadged;
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final boolean isOffline() {
        return false;
    }

    public final String toString() {
        return "PaymentHistoryActivityData(payment=" + this.payment + ", sender=" + this.sender + ", recipient=" + this.recipient + ", activityItemGlobalId=" + this.activityItemGlobalId + ", isBadged=" + this.isBadged + ", version=" + this.version + ", rowId=" + this.rowId + ", section=" + this.section + ", productClassifiers=" + this.productClassifiers + ", referenceItemId=" + this.referenceItemId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.payment, i);
        parcel.writeParcelable(this.sender, i);
        parcel.writeParcelable(this.recipient, i);
        parcel.writeParcelable(this.activityItemGlobalId, i);
        parcel.writeInt(this.isBadged ? 1 : 0);
        parcel.writeLong(this.version);
        parcel.writeString(this.rowId);
        ActivityRowSection activityRowSection = this.section;
        if (activityRowSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(activityRowSection.name());
        }
        Set set = this.productClassifiers;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(((ActivityProductClassifier) it.next()).name());
        }
        parcel.writeParcelable(this.referenceItemId, i);
    }
}
