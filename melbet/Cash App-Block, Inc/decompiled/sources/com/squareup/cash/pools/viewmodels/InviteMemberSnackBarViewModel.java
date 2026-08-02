package com.squareup.cash.pools.viewmodels;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InviteMemberSnackBarViewModel {
    public final String body;
    public final Icons icon;
    public final boolean isCopyLink;
    public final String title;

    public InviteMemberSnackBarViewModel(String str, String str2, Icons icons, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        boolean z = (i & 8) == 0;
        str.getClass();
        this.title = str;
        this.body = str2;
        this.icon = icons;
        this.isCopyLink = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteMemberSnackBarViewModel)) {
            return false;
        }
        InviteMemberSnackBarViewModel inviteMemberSnackBarViewModel = (InviteMemberSnackBarViewModel) obj;
        return Intrinsics.areEqual(this.title, inviteMemberSnackBarViewModel.title) && Intrinsics.areEqual(this.body, inviteMemberSnackBarViewModel.body) && this.icon == inviteMemberSnackBarViewModel.icon && this.isCopyLink == inviteMemberSnackBarViewModel.isCopyLink;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        return Boolean.hashCode(this.isCopyLink) + ((this.icon.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InviteMemberSnackBarViewModel(title=", this.title, ", body=", this.body, ", icon=");
        m.append(this.icon);
        m.append(", isCopyLink=");
        m.append(this.isCopyLink);
        m.append(")");
        return m.toString();
    }
}
