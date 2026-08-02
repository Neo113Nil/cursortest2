package com.squareup.cash.blockers.views.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class FlowData implements Parcelable {
    public static final Parcelable.Creator<FlowData> CREATOR = new BorrowHome.Creator(22);
    public final BlockersData.Flow flow;

    public FlowData(BlockersData.Flow flow) {
        flow.getClass();
        this.flow = flow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowData) && this.flow == ((FlowData) obj).flow;
    }

    public final BlockersData.Flow getFlow() {
        return this.flow;
    }

    public final int hashCode() {
        return this.flow.hashCode();
    }

    public final String toString() {
        return "FlowData(flow=" + this.flow + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.flow.name());
    }
}
