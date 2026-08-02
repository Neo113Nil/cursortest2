package com.squareup.cash.appintro.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SponsorshipRequestReferralIntroScreen implements BlockersScreens {
    public static final Parcelable.Creator<SponsorshipRequestReferralIntroScreen> CREATOR = new ActivityScreen.Creator(24);
    public final BlockersData blockersData;
    public final SponsorshipRequestContent content;
    public final String deepLinkPayload;
    public final String flowToken;

    public SponsorshipRequestReferralIntroScreen(BlockersData blockersData, SponsorshipRequestContent sponsorshipRequestContent, String str) {
        blockersData.getClass();
        sponsorshipRequestContent.getClass();
        this.blockersData = blockersData;
        this.content = sponsorshipRequestContent;
        this.deepLinkPayload = str;
        this.flowToken = blockersData.flowToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorshipRequestReferralIntroScreen)) {
            return false;
        }
        SponsorshipRequestReferralIntroScreen sponsorshipRequestReferralIntroScreen = (SponsorshipRequestReferralIntroScreen) obj;
        return Intrinsics.areEqual(this.blockersData, sponsorshipRequestReferralIntroScreen.blockersData) && Intrinsics.areEqual(this.content, sponsorshipRequestReferralIntroScreen.content) && Intrinsics.areEqual(this.deepLinkPayload, sponsorshipRequestReferralIntroScreen.deepLinkPayload);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int hashCode = (this.content.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
        String str = this.deepLinkPayload;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SponsorshipRequestReferralIntroScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", deepLinkPayload=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.deepLinkPayload, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.content, i);
        parcel.writeString(this.deepLinkPayload);
    }
}
