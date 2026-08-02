package com.squareup.cash.activity.backend.loader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
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
public final class FormattingFailedPaymentHistoryActivityData implements ActivityData, FormattingFailedActivityItem {
    public static final Parcelable.Creator<FormattingFailedPaymentHistoryActivityData> CREATOR = new ActivityScreen.Creator(3);
    public final ActivityItemGlobalId activityItemGlobalId;
    public final Lazy displayInstant$delegate;
    public final boolean isBadged;
    public final Set productClassifiers;
    public final ActivityItemGlobalId referenceItemId;
    public final String rowId;
    public final ActivityRowSection section;
    public final UiPayment uiPayment;
    public final UiCustomer uiRecipient;
    public final UiCustomer uiSender;
    public final long version;

    public FormattingFailedPaymentHistoryActivityData(long j, ActivityItemGlobalId activityItemGlobalId, ActivityItemGlobalId activityItemGlobalId2, ActivityRowSection activityRowSection, UiCustomer uiCustomer, UiCustomer uiCustomer2, UiPayment uiPayment, String str, Set set, boolean z) {
        uiPayment.getClass();
        uiCustomer.getClass();
        uiCustomer2.getClass();
        activityItemGlobalId.getClass();
        str.getClass();
        set.getClass();
        this.uiPayment = uiPayment;
        this.uiSender = uiCustomer;
        this.uiRecipient = uiCustomer2;
        this.isBadged = z;
        this.version = j;
        this.section = activityRowSection;
        this.activityItemGlobalId = activityItemGlobalId;
        this.rowId = str;
        this.productClassifiers = set;
        this.referenceItemId = activityItemGlobalId2;
        this.displayInstant$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new yf$$ExternalSyntheticLambda2(this, 18));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattingFailedPaymentHistoryActivityData)) {
            return false;
        }
        FormattingFailedPaymentHistoryActivityData formattingFailedPaymentHistoryActivityData = (FormattingFailedPaymentHistoryActivityData) obj;
        return Intrinsics.areEqual(this.uiPayment, formattingFailedPaymentHistoryActivityData.uiPayment) && Intrinsics.areEqual(this.uiSender, formattingFailedPaymentHistoryActivityData.uiSender) && Intrinsics.areEqual(this.uiRecipient, formattingFailedPaymentHistoryActivityData.uiRecipient) && this.isBadged == formattingFailedPaymentHistoryActivityData.isBadged && this.version == formattingFailedPaymentHistoryActivityData.version && this.section == formattingFailedPaymentHistoryActivityData.section && Intrinsics.areEqual(this.activityItemGlobalId, formattingFailedPaymentHistoryActivityData.activityItemGlobalId) && Intrinsics.areEqual(this.rowId, formattingFailedPaymentHistoryActivityData.rowId) && Intrinsics.areEqual(this.productClassifiers, formattingFailedPaymentHistoryActivityData.productClassifiers) && Intrinsics.areEqual(this.referenceItemId, formattingFailedPaymentHistoryActivityData.referenceItemId);
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
        return this.uiPayment.role;
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
        return this.uiPayment.state;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData
    public final String getToken() {
        return ActivityItemKt.getItemId(this);
    }

    @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
    public final TransactionType getTransactionType() {
        return this.uiPayment.transaction_type;
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
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.uiRecipient.hashCode() + ((this.uiSender.hashCode() + (this.uiPayment.hashCode() * 31)) * 31)) * 31, 31, this.isBadged), 31, this.version);
        ActivityRowSection activityRowSection = this.section;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.activityItemGlobalId.hashCode() + ((m + (activityRowSection == null ? 0 : activityRowSection.hashCode())) * 31)) * 31, 31, this.rowId), 31, this.productClassifiers);
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
        return "FormattingFailedPaymentHistoryActivityData(uiPayment=" + this.uiPayment + ", uiSender=" + this.uiSender + ", uiRecipient=" + this.uiRecipient + ", isBadged=" + this.isBadged + ", version=" + this.version + ", section=" + this.section + ", activityItemGlobalId=" + this.activityItemGlobalId + ", rowId=" + this.rowId + ", productClassifiers=" + this.productClassifiers + ", referenceItemId=" + this.referenceItemId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.uiPayment, i);
        parcel.writeParcelable(this.uiSender, i);
        parcel.writeParcelable(this.uiRecipient, i);
        parcel.writeInt(this.isBadged ? 1 : 0);
        parcel.writeLong(this.version);
        ActivityRowSection activityRowSection = this.section;
        if (activityRowSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(activityRowSection.name());
        }
        parcel.writeParcelable(this.activityItemGlobalId, i);
        parcel.writeString(this.rowId);
        Set set = this.productClassifiers;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(((ActivityProductClassifier) it.next()).name());
        }
        parcel.writeParcelable(this.referenceItemId, i);
    }

    public /* synthetic */ FormattingFailedPaymentHistoryActivityData(UiPayment uiPayment, UiCustomer uiCustomer, UiCustomer uiCustomer2, boolean z, long j, ActivityRowSection activityRowSection, ActivityItemGlobalId activityItemGlobalId, String str, Set set) {
        this(j, activityItemGlobalId, null, activityRowSection, uiCustomer, uiCustomer2, uiPayment, str, set, z);
    }
}
