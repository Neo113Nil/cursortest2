package com.squareup.cash.invitations;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvitationSuccessToastViewModel {
    public final boolean delayPresentation;
    public final boolean dismiss;
    public final String inviteeName;
    public final String subtitle;

    public InvitationSuccessToastViewModel(String str, String str2, boolean z, boolean z2) {
        this.inviteeName = str;
        this.subtitle = str2;
        this.dismiss = z;
        this.delayPresentation = z2;
    }

    public static InvitationSuccessToastViewModel copy$default(InvitationSuccessToastViewModel invitationSuccessToastViewModel, int i) {
        String str = invitationSuccessToastViewModel.inviteeName;
        String str2 = invitationSuccessToastViewModel.subtitle;
        boolean z = (i & 4) != 0 ? invitationSuccessToastViewModel.dismiss : true;
        boolean z2 = (i & 8) != 0 ? invitationSuccessToastViewModel.delayPresentation : false;
        invitationSuccessToastViewModel.getClass();
        return new InvitationSuccessToastViewModel(str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitationSuccessToastViewModel)) {
            return false;
        }
        InvitationSuccessToastViewModel invitationSuccessToastViewModel = (InvitationSuccessToastViewModel) obj;
        return this.inviteeName.equals(invitationSuccessToastViewModel.inviteeName) && Intrinsics.areEqual(this.subtitle, invitationSuccessToastViewModel.subtitle) && this.dismiss == invitationSuccessToastViewModel.dismiss && this.delayPresentation == invitationSuccessToastViewModel.delayPresentation;
    }

    public final int hashCode() {
        int hashCode = this.inviteeName.hashCode() * 31;
        String str = this.subtitle;
        return Boolean.hashCode(this.delayPresentation) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.dismiss);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvitationSuccessToastViewModel(inviteeName=", this.inviteeName, ", subtitle=", this.subtitle, ", dismiss="), this.dismiss, ", delayPresentation=", this.delayPresentation, ")");
    }
}
