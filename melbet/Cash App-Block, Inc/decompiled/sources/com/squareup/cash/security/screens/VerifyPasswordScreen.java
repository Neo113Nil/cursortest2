package com.squareup.cash.security.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.screens.BoostDetailsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class VerifyPasswordScreen implements Screen, BlockersScreens {
    public static final Parcelable.Creator<VerifyPasswordScreen> CREATOR = new BoostDetailsScreen.Creator(19);
    public final BlockersData blockersData;
    public final PasswordScreenData passwordScreenData;

    public VerifyPasswordScreen(BlockersData blockersData, PasswordScreenData passwordScreenData) {
        blockersData.getClass();
        passwordScreenData.getClass();
        this.blockersData = blockersData;
        this.passwordScreenData = passwordScreenData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPasswordScreen)) {
            return false;
        }
        VerifyPasswordScreen verifyPasswordScreen = (VerifyPasswordScreen) obj;
        return Intrinsics.areEqual(this.blockersData, verifyPasswordScreen.blockersData) && Intrinsics.areEqual(this.passwordScreenData, verifyPasswordScreen.passwordScreenData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.passwordScreenData.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "VerifyPasswordScreen(blockersData=" + this.blockersData + ", passwordScreenData=" + this.passwordScreenData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        this.passwordScreenData.writeToParcel(parcel, i);
    }
}
