package com.squareup.cash.activity.backend.loader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.backend.OrderActivityItem;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.franklin.ui.UiCustomer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OrderActivityData implements ActivityData, OrderActivityItem {
    public static final Parcelable.Creator<OrderActivityData> CREATOR = new Creator();
    public final long activityItemDisplayDateMs;
    public final ActivityItemGlobalId activityItemGlobalId;
    public final Instant displayInstant;
    public final UiCustomer orderDisplayUiCustomer;
    public final CashAppPayOrderRenderData orderRenderData;
    public final OrderRow.OrderRowLoanUiState orderRowState;
    public final Set productClassifiers;
    public final UiCustomer recipient;
    public final String recipientId;
    public final ActivityItemGlobalId referenceItemId;
    public final String rowId;
    public final ActivityRowSection section;
    public final UiCustomer sender;
    public final String senderId;
    public final long version;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CashAppPayOrderRenderData cashAppPayOrderRenderData = (CashAppPayOrderRenderData) NavAction$$ExternalSyntheticOutline0.m(parcel, OrderActivityData.class);
            OrderRow.OrderRowLoanUiState valueOf = OrderRow.OrderRowLoanUiState.valueOf(parcel.readString());
            long readLong = parcel.readLong();
            ActivityItemGlobalId activityItemGlobalId = (ActivityItemGlobalId) parcel.readParcelable(OrderActivityData.class.getClassLoader());
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            ActivityRowSection valueOf2 = parcel.readInt() == 0 ? null : ActivityRowSection.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(ActivityProductClassifier.valueOf(parcel.readString()));
            }
            return new OrderActivityData(cashAppPayOrderRenderData, valueOf, readLong, activityItemGlobalId, readLong2, readString, valueOf2, linkedHashSet, (UiCustomer) parcel.readParcelable(OrderActivityData.class.getClassLoader()), parcel.readString(), parcel.readString(), (UiCustomer) parcel.readParcelable(OrderActivityData.class.getClassLoader()), (UiCustomer) parcel.readParcelable(OrderActivityData.class.getClassLoader()), (ActivityItemGlobalId) parcel.readParcelable(OrderActivityData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderActivityData[i];
        }
    }

    public OrderActivityData(CashAppPayOrderRenderData cashAppPayOrderRenderData, OrderRow.OrderRowLoanUiState orderRowLoanUiState, long j, ActivityItemGlobalId activityItemGlobalId, long j2, String str, ActivityRowSection activityRowSection, Set set, UiCustomer uiCustomer, String str2, String str3, UiCustomer uiCustomer2, UiCustomer uiCustomer3, ActivityItemGlobalId activityItemGlobalId2) {
        cashAppPayOrderRenderData.getClass();
        orderRowLoanUiState.getClass();
        activityItemGlobalId.getClass();
        str.getClass();
        set.getClass();
        this.orderRenderData = cashAppPayOrderRenderData;
        this.orderRowState = orderRowLoanUiState;
        this.activityItemDisplayDateMs = j;
        this.activityItemGlobalId = activityItemGlobalId;
        this.version = j2;
        this.rowId = str;
        this.section = activityRowSection;
        this.productClassifiers = set;
        this.orderDisplayUiCustomer = uiCustomer;
        this.senderId = str2;
        this.recipientId = str3;
        this.recipient = uiCustomer2;
        this.sender = uiCustomer3;
        this.referenceItemId = activityItemGlobalId2;
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        ofEpochMilli.getClass();
        this.displayInstant = ofEpochMilli;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderActivityData)) {
            return false;
        }
        OrderActivityData orderActivityData = (OrderActivityData) obj;
        return Intrinsics.areEqual(this.orderRenderData, orderActivityData.orderRenderData) && this.orderRowState == orderActivityData.orderRowState && this.activityItemDisplayDateMs == orderActivityData.activityItemDisplayDateMs && Intrinsics.areEqual(this.activityItemGlobalId, orderActivityData.activityItemGlobalId) && this.version == orderActivityData.version && Intrinsics.areEqual(this.rowId, orderActivityData.rowId) && this.section == orderActivityData.section && Intrinsics.areEqual(this.productClassifiers, orderActivityData.productClassifiers) && Intrinsics.areEqual(this.orderDisplayUiCustomer, orderActivityData.orderDisplayUiCustomer) && Intrinsics.areEqual(this.senderId, orderActivityData.senderId) && Intrinsics.areEqual(this.recipientId, orderActivityData.recipientId) && Intrinsics.areEqual(this.recipient, orderActivityData.recipient) && Intrinsics.areEqual(this.sender, orderActivityData.sender) && Intrinsics.areEqual(this.referenceItemId, orderActivityData.referenceItemId);
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getActivityItemGlobalId() {
        return this.activityItemGlobalId;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Instant getDisplayInstant() {
        return this.displayInstant;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final Set getProductClassifiers() {
        throw null;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityItemGlobalId getReferenceItemId() {
        throw null;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final String getRowId() {
        return this.rowId;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityRowSection getSection() {
        return this.section;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData
    public final String getToken() {
        String str = this.orderRenderData.order_id;
        str.getClass();
        return str;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData, com.squareup.cash.activity.backend.ActivityItem
    public final long getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.activityItemGlobalId.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.orderRowState.hashCode() + (this.orderRenderData.hashCode() * 31)) * 31, 31, this.activityItemDisplayDateMs)) * 31, 31, this.version), 31, this.rowId);
        ActivityRowSection activityRowSection = this.section;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (activityRowSection == null ? 0 : activityRowSection.hashCode())) * 31, 31, this.productClassifiers);
        UiCustomer uiCustomer = this.orderDisplayUiCustomer;
        int hashCode = (m2 + (uiCustomer == null ? 0 : uiCustomer.hashCode())) * 31;
        String str = this.senderId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recipientId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiCustomer uiCustomer2 = this.recipient;
        int hashCode4 = (hashCode3 + (uiCustomer2 == null ? 0 : uiCustomer2.hashCode())) * 31;
        UiCustomer uiCustomer3 = this.sender;
        int hashCode5 = (hashCode4 + (uiCustomer3 == null ? 0 : uiCustomer3.hashCode())) * 31;
        ActivityItemGlobalId activityItemGlobalId = this.referenceItemId;
        return hashCode5 + (activityItemGlobalId != null ? activityItemGlobalId.hashCode() : 0);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData, com.squareup.cash.activity.backend.ActivityItem
    public final boolean isBadged() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderActivityData(orderRenderData=");
        sb.append(this.orderRenderData);
        sb.append(", orderRowState=");
        sb.append(this.orderRowState);
        sb.append(", activityItemDisplayDateMs=");
        sb.append(this.activityItemDisplayDateMs);
        sb.append(", activityItemGlobalId=");
        sb.append(this.activityItemGlobalId);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.version, ", version=", ", rowId=", sb);
        sb.append(this.rowId);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", productClassifiers=");
        sb.append(this.productClassifiers);
        sb.append(", orderDisplayUiCustomer=");
        sb.append(this.orderDisplayUiCustomer);
        sb.append(", senderId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.senderId, ", recipientId=", this.recipientId, ", recipient=");
        sb.append(this.recipient);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", referenceItemId=");
        sb.append(this.referenceItemId);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.orderRenderData, i);
        parcel.writeString(this.orderRowState.name());
        parcel.writeLong(this.activityItemDisplayDateMs);
        parcel.writeParcelable(this.activityItemGlobalId, i);
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
        parcel.writeParcelable(this.orderDisplayUiCustomer, i);
        parcel.writeString(this.senderId);
        parcel.writeString(this.recipientId);
        parcel.writeParcelable(this.recipient, i);
        parcel.writeParcelable(this.sender, i);
        parcel.writeParcelable(this.referenceItemId, i);
    }
}
