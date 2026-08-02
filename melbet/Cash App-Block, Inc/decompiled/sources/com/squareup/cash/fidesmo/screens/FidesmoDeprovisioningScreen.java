package com.squareup.cash.fidesmo.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FidesmoDeprovisioningScreen implements Screen {
    public static final Parcelable.Creator<FidesmoDeprovisioningScreen> CREATOR = new UriString.Creator(7);
    public final FidesmoProvisioningBlocker blocker;
    public final BlockersData blockersData;

    public FidesmoDeprovisioningScreen(BlockersData blockersData, FidesmoProvisioningBlocker fidesmoProvisioningBlocker) {
        blockersData.getClass();
        fidesmoProvisioningBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = fidesmoProvisioningBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FidesmoDeprovisioningScreen)) {
            return false;
        }
        FidesmoDeprovisioningScreen fidesmoDeprovisioningScreen = (FidesmoDeprovisioningScreen) obj;
        return Intrinsics.areEqual(this.blockersData, fidesmoDeprovisioningScreen.blockersData) && Intrinsics.areEqual(this.blocker, fidesmoDeprovisioningScreen.blocker);
    }

    public final int hashCode() {
        return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "FidesmoDeprovisioningScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
    }
}
