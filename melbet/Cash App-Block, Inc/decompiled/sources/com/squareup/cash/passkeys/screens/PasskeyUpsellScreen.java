package com.squareup.cash.passkeys.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.protos.franklin.api.PasskeyUpsellBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PasskeyUpsellScreen implements BlockersScreens {
    public static final Parcelable.Creator<PasskeyUpsellScreen> CREATOR = new P2PListScreen.Creator(12);
    public final PasskeyUpsellBlocker blocker;
    public final BlockersData blockersData;
    public final boolean skippable;

    public PasskeyUpsellScreen(BlockersData blockersData, PasskeyUpsellBlocker passkeyUpsellBlocker, boolean z) {
        blockersData.getClass();
        passkeyUpsellBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = passkeyUpsellBlocker;
        this.skippable = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyUpsellScreen)) {
            return false;
        }
        PasskeyUpsellScreen passkeyUpsellScreen = (PasskeyUpsellScreen) obj;
        return Intrinsics.areEqual(this.blockersData, passkeyUpsellScreen.blockersData) && Intrinsics.areEqual(this.blocker, passkeyUpsellScreen.blocker) && this.skippable == passkeyUpsellScreen.skippable;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.skippable) + ((this.blocker.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasskeyUpsellScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", blocker=");
        sb.append(this.blocker);
        sb.append(", skippable=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.skippable, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
        parcel.writeInt(this.skippable ? 1 : 0);
    }
}
