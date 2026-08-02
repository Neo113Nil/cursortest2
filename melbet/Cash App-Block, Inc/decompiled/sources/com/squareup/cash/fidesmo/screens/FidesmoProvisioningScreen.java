package com.squareup.cash.fidesmo.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FidesmoProvisioningScreen implements Screen {
    public static final Parcelable.Creator<FidesmoProvisioningScreen> CREATOR = new UriString.Creator(8);
    public final FidesmoProvisioningBlocker blocker;
    public final BlockersData blockersData;
    public final FidesmoFlowType flowType;

    public FidesmoProvisioningScreen(BlockersData blockersData, FidesmoProvisioningBlocker fidesmoProvisioningBlocker, FidesmoFlowType fidesmoFlowType) {
        blockersData.getClass();
        fidesmoProvisioningBlocker.getClass();
        fidesmoFlowType.getClass();
        this.blockersData = blockersData;
        this.blocker = fidesmoProvisioningBlocker;
        this.flowType = fidesmoFlowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FidesmoProvisioningScreen)) {
            return false;
        }
        FidesmoProvisioningScreen fidesmoProvisioningScreen = (FidesmoProvisioningScreen) obj;
        return Intrinsics.areEqual(this.blockersData, fidesmoProvisioningScreen.blockersData) && Intrinsics.areEqual(this.blocker, fidesmoProvisioningScreen.blocker) && this.flowType == fidesmoProvisioningScreen.flowType;
    }

    public final int hashCode() {
        return this.flowType.hashCode() + ((this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FidesmoProvisioningScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ", flowType=" + this.flowType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
        parcel.writeString(this.flowType.name());
    }
}
