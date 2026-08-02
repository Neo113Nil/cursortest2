package com.squareup.cash.buynowpaylater.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseStart;

/* loaded from: classes.dex */
public final class AfterPayOrderHubScreen implements AfterPayScreen {
    public static final Parcelable.Creator<AfterPayOrderHubScreen> CREATOR = new BorrowLimitHub.Creator(12);
    public final AfterpayHubBrowseStart.AppLocation fromLocation;
    public final boolean isBlockerExitScreen;

    public AfterPayOrderHubScreen(AfterpayHubBrowseStart.AppLocation appLocation, boolean z) {
        this.fromLocation = appLocation;
        this.isBlockerExitScreen = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPayOrderHubScreen)) {
            return false;
        }
        AfterPayOrderHubScreen afterPayOrderHubScreen = (AfterPayOrderHubScreen) obj;
        return this.fromLocation == afterPayOrderHubScreen.fromLocation && this.isBlockerExitScreen == afterPayOrderHubScreen.isBlockerExitScreen;
    }

    public final int hashCode() {
        AfterpayHubBrowseStart.AppLocation appLocation = this.fromLocation;
        return Boolean.hashCode(this.isBlockerExitScreen) + ((appLocation == null ? 0 : appLocation.hashCode()) * 31);
    }

    @Override // com.squareup.cash.buynowpaylater.screens.AfterPayScreen
    public final boolean isBlockerExitScreen() {
        return this.isBlockerExitScreen;
    }

    public final String toString() {
        return "AfterPayOrderHubScreen(fromLocation=" + this.fromLocation + ", isBlockerExitScreen=" + this.isBlockerExitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        AfterpayHubBrowseStart.AppLocation appLocation = this.fromLocation;
        if (appLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(appLocation.name());
        }
        parcel.writeInt(this.isBlockerExitScreen ? 1 : 0);
    }
}
