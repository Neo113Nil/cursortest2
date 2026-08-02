package com.squareup.cash.activity.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityItemKey implements Parcelable {
    public static final Parcelable.Creator<ActivityItemKey> CREATOR = new ActivityScreen.Creator(6);
    public final ActivityItemGlobalId activityItemGlobalId;
    public final ActivityScope activityScope;
    public final ActivityToken activityToken;

    public ActivityItemKey(ActivityItemGlobalId activityItemGlobalId, ActivityToken activityToken, ActivityScope activityScope) {
        activityItemGlobalId.getClass();
        this.activityItemGlobalId = activityItemGlobalId;
        this.activityToken = activityToken;
        this.activityScope = activityScope;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityItemKey)) {
            return false;
        }
        ActivityItemKey activityItemKey = (ActivityItemKey) obj;
        return Intrinsics.areEqual(this.activityItemGlobalId, activityItemKey.activityItemGlobalId) && Intrinsics.areEqual(this.activityToken, activityItemKey.activityToken) && this.activityScope == activityItemKey.activityScope;
    }

    public final ActivityScope getActivityScope() {
        return this.activityScope;
    }

    public final int hashCode() {
        int hashCode = this.activityItemGlobalId.hashCode() * 31;
        ActivityToken activityToken = this.activityToken;
        int hashCode2 = (hashCode + (activityToken == null ? 0 : activityToken.hashCode())) * 31;
        ActivityScope activityScope = this.activityScope;
        return hashCode2 + (activityScope != null ? activityScope.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityItemKey(activityItemGlobalId=" + this.activityItemGlobalId + ", activityToken=" + this.activityToken + ", activityScope=" + this.activityScope + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.activityItemGlobalId, i);
        parcel.writeParcelable(this.activityToken, i);
        ActivityScope activityScope = this.activityScope;
        if (activityScope == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(activityScope.name());
        }
    }
}
