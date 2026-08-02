package com.squareup.cash.activity.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ContactHeaderViewModel {
    public final ActivityInviteItemViewModel inviteItemViewModel;
    public final List recipients;

    public ContactHeaderViewModel(List list, ActivityInviteItemViewModel activityInviteItemViewModel) {
        list.getClass();
        activityInviteItemViewModel.getClass();
        this.recipients = list;
        this.inviteItemViewModel = activityInviteItemViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactHeaderViewModel)) {
            return false;
        }
        ContactHeaderViewModel contactHeaderViewModel = (ContactHeaderViewModel) obj;
        return Intrinsics.areEqual(this.recipients, contactHeaderViewModel.recipients) && Intrinsics.areEqual(this.inviteItemViewModel, contactHeaderViewModel.inviteItemViewModel);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.inviteItemViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipients.hashCode() * 31, 31, false)) * 31, 31, false);
    }

    public final String toString() {
        return "ContactHeaderViewModel(recipients=" + this.recipients + ", isSearching=false, inviteItemViewModel=" + this.inviteItemViewModel + ", invitationConfigEnabled=false, showInvite=false)";
    }
}
