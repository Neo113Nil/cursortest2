package com.squareup.cash.appintro.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.cdf.outofnetworksponsor.Inviter;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AlternativeNewSponsorAliasScreen implements DialogScreen {
    public static final Parcelable.Creator<AlternativeNewSponsorAliasScreen> CREATOR = new ActivityScreen.Creator(21);
    public final String deepLinkPayload;
    public final GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog dialogData;
    public final Inviter inviter;

    public AlternativeNewSponsorAliasScreen(GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog, String str, Inviter inviter) {
        closeScreenDialog.getClass();
        this.dialogData = closeScreenDialog;
        this.deepLinkPayload = str;
        this.inviter = inviter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlternativeNewSponsorAliasScreen)) {
            return false;
        }
        AlternativeNewSponsorAliasScreen alternativeNewSponsorAliasScreen = (AlternativeNewSponsorAliasScreen) obj;
        return Intrinsics.areEqual(this.dialogData, alternativeNewSponsorAliasScreen.dialogData) && Intrinsics.areEqual(this.deepLinkPayload, alternativeNewSponsorAliasScreen.deepLinkPayload) && this.inviter == alternativeNewSponsorAliasScreen.inviter;
    }

    public final int hashCode() {
        int hashCode = this.dialogData.hashCode() * 31;
        String str = this.deepLinkPayload;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Inviter inviter = this.inviter;
        return hashCode2 + (inviter != null ? inviter.hashCode() : 0);
    }

    public final String toString() {
        return "AlternativeNewSponsorAliasScreen(dialogData=" + this.dialogData + ", deepLinkPayload=" + this.deepLinkPayload + ", inviter=" + this.inviter + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.dialogData, i);
        parcel.writeString(this.deepLinkPayload);
        Inviter inviter = this.inviter;
        if (inviter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(inviter.name());
        }
    }
}
