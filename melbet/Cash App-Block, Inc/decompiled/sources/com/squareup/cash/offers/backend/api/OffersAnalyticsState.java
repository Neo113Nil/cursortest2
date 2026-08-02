package com.squareup.cash.offers.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.nearby.viewmodels.ListSection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersAnalyticsState implements Parcelable {
    public static final Parcelable.Creator<OffersAnalyticsState> CREATOR = new ListSection.Creator(3);
    public static final EmptySet EMPTY;
    public final Set cachedImpressionAnalyticsEvents;

    static {
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        EMPTY = emptySet;
    }

    public /* synthetic */ OffersAnalyticsState(Set set) {
        this.cachedImpressionAnalyticsEvents = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OffersAnalyticsState) {
            return Intrinsics.areEqual(this.cachedImpressionAnalyticsEvents, ((OffersAnalyticsState) obj).cachedImpressionAnalyticsEvents);
        }
        return false;
    }

    public final int hashCode() {
        return this.cachedImpressionAnalyticsEvents.hashCode();
    }

    public final String toString() {
        return "OffersAnalyticsState(cachedImpressionAnalyticsEvents=" + this.cachedImpressionAnalyticsEvents + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        Set set = this.cachedImpressionAnalyticsEvents;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
    }
}
