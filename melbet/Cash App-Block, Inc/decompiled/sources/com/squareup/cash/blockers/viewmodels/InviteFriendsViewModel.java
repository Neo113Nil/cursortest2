package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InviteFriendsViewModel {
    public final ButtonOrder buttonOrder;
    public final String inviteButton;
    public final String skipButton;
    public final String subtitle;
    public final String title;

    public InviteFriendsViewModel(String str, String str2, String str3, String str4, ButtonOrder buttonOrder) {
        this.skipButton = str;
        this.inviteButton = str2;
        this.title = str3;
        this.subtitle = str4;
        this.buttonOrder = buttonOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteFriendsViewModel)) {
            return false;
        }
        InviteFriendsViewModel inviteFriendsViewModel = (InviteFriendsViewModel) obj;
        return Intrinsics.areEqual(this.skipButton, inviteFriendsViewModel.skipButton) && Intrinsics.areEqual(this.inviteButton, inviteFriendsViewModel.inviteButton) && Intrinsics.areEqual(this.title, inviteFriendsViewModel.title) && Intrinsics.areEqual(this.subtitle, inviteFriendsViewModel.subtitle) && this.buttonOrder == inviteFriendsViewModel.buttonOrder;
    }

    public final int hashCode() {
        String str = this.skipButton;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inviteButton;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        return this.buttonOrder.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InviteFriendsViewModel(skipButton=", this.skipButton, ", inviteButton=", this.inviteButton, ", title=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", subtitle=", this.subtitle, ", buttonOrder=");
        m.append(this.buttonOrder);
        m.append(")");
        return m.toString();
    }
}
