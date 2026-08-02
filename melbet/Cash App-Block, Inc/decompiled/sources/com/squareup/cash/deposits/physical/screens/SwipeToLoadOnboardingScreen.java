package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SwipeToLoadOnboardingScreen implements BlockersScreens.ChildBlockersScreens, Screen {
    public static final Parcelable.Creator<SwipeToLoadOnboardingScreen> CREATOR = new Recipient.Creator(28);
    public final FormBlocker blocker;
    public final BlockersData blockersData;

    public SwipeToLoadOnboardingScreen(FormBlocker formBlocker, BlockersData blockersData) {
        formBlocker.getClass();
        blockersData.getClass();
        this.blocker = formBlocker;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeToLoadOnboardingScreen)) {
            return false;
        }
        SwipeToLoadOnboardingScreen swipeToLoadOnboardingScreen = (SwipeToLoadOnboardingScreen) obj;
        return Intrinsics.areEqual(this.blocker, swipeToLoadOnboardingScreen.blocker) && Intrinsics.areEqual(this.blockersData, swipeToLoadOnboardingScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode() + (this.blocker.hashCode() * 31);
    }

    public final String toString() {
        return "SwipeToLoadOnboardingScreen(blocker=" + this.blocker + ", blockersData=" + this.blockersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blocker, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
