package com.squareup.cash.appintro.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.cdf.outofnetworksponsor.Inviter;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class SponsorshipRequestContent implements Parcelable {
    public final Inviter inviter;

    public final class Sponsor extends SponsorshipRequestContent {
        public static final Parcelable.Creator<Sponsor> CREATOR = new ActivityScreen.Creator(22);
        public final GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sponsor(GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent) {
            super(Inviter.sponsor);
            sponsorSponsorshipRequestContent.getClass();
            this.content = sponsorSponsorshipRequestContent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sponsor) && Intrinsics.areEqual(this.content, ((Sponsor) obj).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final String toString() {
            return "Sponsor(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.content, i);
        }
    }

    public final class Teen extends SponsorshipRequestContent {
        public static final Parcelable.Creator<Teen> CREATOR = new ActivityScreen.Creator(23);
        public final GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Teen(GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent) {
            super(Inviter.dependent);
            teenSponsorshipRequestContent.getClass();
            this.content = teenSponsorshipRequestContent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Teen) && Intrinsics.areEqual(this.content, ((Teen) obj).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final String toString() {
            return "Teen(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.content, i);
        }
    }

    public SponsorshipRequestContent(Inviter inviter) {
        this.inviter = inviter;
    }
}
