package com.squareup.cash.invitations.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.invitations.SmsInvitation;
import com.squareup.protos.franklin.api.InviteFriendsEnableReferralText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InviteReferralsRulesBottomSheet implements BottomSheetScreen, Screen {
    public static final Parcelable.Creator<InviteReferralsRulesBottomSheet> CREATOR = new SmsInvitation.Creator(27);
    public final InviteFriendsEnableReferralText enableReferralText;

    public InviteReferralsRulesBottomSheet(InviteFriendsEnableReferralText inviteFriendsEnableReferralText) {
        this.enableReferralText = inviteFriendsEnableReferralText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InviteReferralsRulesBottomSheet) && Intrinsics.areEqual(this.enableReferralText, ((InviteReferralsRulesBottomSheet) obj).enableReferralText);
    }

    public final int hashCode() {
        InviteFriendsEnableReferralText inviteFriendsEnableReferralText = this.enableReferralText;
        if (inviteFriendsEnableReferralText == null) {
            return 0;
        }
        return inviteFriendsEnableReferralText.hashCode();
    }

    public final String toString() {
        return "InviteReferralsRulesBottomSheet(enableReferralText=" + this.enableReferralText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.enableReferralText, i);
    }
}
