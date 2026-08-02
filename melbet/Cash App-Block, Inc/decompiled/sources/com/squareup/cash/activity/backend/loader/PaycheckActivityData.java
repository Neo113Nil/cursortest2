package com.squareup.cash.activity.backend.loader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes5.dex */
public final class PaycheckActivityData implements ActivityData, ActivityItem {
    public static final Parcelable.Creator<PaycheckActivityData> CREATOR = new ActivityScreen.Creator(4);
    public final ActivityItemGlobalId activityItemGlobalId;
    public final CalendarMonthPaychecksAggregation aggregation;
    public final Lazy displayInstant$delegate;
    public final Paycheck paycheck;
    public final Set productClassifiers;
    public final ActivityItemGlobalId referenceItemId;
    public final String rowId;
    public final ActivityRowSection section;
    public final long version;

    public PaycheckActivityData(Paycheck paycheck, ActivityItemGlobalId activityItemGlobalId, long j, CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation, String str, ActivityRowSection activityRowSection, Set set, ActivityItemGlobalId activityItemGlobalId2) {
        paycheck.getClass();
        activityItemGlobalId.getClass();
        str.getClass();
        set.getClass();
        this.paycheck = paycheck;
        this.activityItemGlobalId = activityItemGlobalId;
        this.version = j;
        this.aggregation = calendarMonthPaychecksAggregation;
        this.rowId = str;
        this.section = activityRowSection;
        this.productClassifiers = set;
        this.referenceItemId = activityItemGlobalId2;
        this.displayInstant$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new yf$$ExternalSyntheticLambda2(this, 19));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaycheckActivityData)) {
            return false;
        }
        PaycheckActivityData paycheckActivityData = (PaycheckActivityData) obj;
        return Intrinsics.areEqual(this.paycheck, paycheckActivityData.paycheck) && Intrinsics.areEqual(this.activityItemGlobalId, paycheckActivityData.activityItemGlobalId) && this.version == paycheckActivityData.version && Intrinsics.areEqual(this.aggregation, paycheckActivityData.aggregation) && Intrinsics.areEqual(this.rowId, paycheckActivityData.rowId) && this.section == paycheckActivityData.section && Intrinsics.areEqual(this.productClassifiers, paycheckActivityData.productClassifiers) && Intrinsics.areEqual(this.referenceItemId, paycheckActivityData.referenceItemId);
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
    public final String getRowId() {
        return this.rowId;
    }

    @Override // com.squareup.cash.activity.backend.ActivityItem
    public final ActivityRowSection getSection() {
        return this.section;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData
    public final String getToken() {
        String str = this.paycheck.paycheck_token;
        str.getClass();
        return str;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData, com.squareup.cash.activity.backend.ActivityItem
    public final long getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.activityItemGlobalId.hashCode() + (this.paycheck.hashCode() * 31)) * 31, 31, this.version);
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = this.aggregation;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (calendarMonthPaychecksAggregation == null ? 0 : calendarMonthPaychecksAggregation.hashCode())) * 31, 31, this.rowId);
        ActivityRowSection activityRowSection = this.section;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (activityRowSection == null ? 0 : activityRowSection.hashCode())) * 31, 31, this.productClassifiers);
        ActivityItemGlobalId activityItemGlobalId = this.referenceItemId;
        return m3 + (activityItemGlobalId != null ? activityItemGlobalId.hashCode() : 0);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivityData, com.squareup.cash.activity.backend.ActivityItem
    public final boolean isBadged() {
        return false;
    }

    public final String toString() {
        return "PaycheckActivityData(paycheck=" + this.paycheck + ", activityItemGlobalId=" + this.activityItemGlobalId + ", version=" + this.version + ", aggregation=" + this.aggregation + ", rowId=" + this.rowId + ", section=" + this.section + ", productClassifiers=" + this.productClassifiers + ", referenceItemId=" + this.referenceItemId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.paycheck, i);
        parcel.writeParcelable(this.activityItemGlobalId, i);
        parcel.writeLong(this.version);
        parcel.writeParcelable(this.aggregation, i);
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
