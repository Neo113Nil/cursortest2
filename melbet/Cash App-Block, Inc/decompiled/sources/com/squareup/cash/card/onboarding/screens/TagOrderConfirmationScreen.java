package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TagOrderConfirmationScreen implements BlockersScreens {
    public static final Parcelable.Creator<TagOrderConfirmationScreen> CREATOR = new CheckCaptureQuestion.Creator(8);
    public final TagConfirmationBlocker blocker;
    public final BlockersData blockersData;

    public TagOrderConfirmationScreen(BlockersData blockersData, TagConfirmationBlocker tagConfirmationBlocker) {
        blockersData.getClass();
        tagConfirmationBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = tagConfirmationBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagOrderConfirmationScreen)) {
            return false;
        }
        TagOrderConfirmationScreen tagOrderConfirmationScreen = (TagOrderConfirmationScreen) obj;
        return Intrinsics.areEqual(this.blockersData, tagOrderConfirmationScreen.blockersData) && Intrinsics.areEqual(this.blocker, tagOrderConfirmationScreen.blocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "TagOrderConfirmationScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
    }
}
