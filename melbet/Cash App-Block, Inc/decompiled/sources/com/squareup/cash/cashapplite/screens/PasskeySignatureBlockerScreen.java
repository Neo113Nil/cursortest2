package com.squareup.cash.cashapplite.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.franklin.api.PasskeySignatureBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PasskeySignatureBlockerScreen implements BlockersScreens {
    public static final Parcelable.Creator<PasskeySignatureBlockerScreen> CREATOR = new CheckCaptureQuestion.Creator(17);
    public final PasskeySignatureBlocker blocker;
    public final BlockersData blockersData;

    public PasskeySignatureBlockerScreen(BlockersData blockersData, PasskeySignatureBlocker passkeySignatureBlocker) {
        blockersData.getClass();
        passkeySignatureBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = passkeySignatureBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeySignatureBlockerScreen)) {
            return false;
        }
        PasskeySignatureBlockerScreen passkeySignatureBlockerScreen = (PasskeySignatureBlockerScreen) obj;
        return Intrinsics.areEqual(this.blockersData, passkeySignatureBlockerScreen.blockersData) && Intrinsics.areEqual(this.blocker, passkeySignatureBlockerScreen.blocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "PasskeySignatureBlockerScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
    }
}
