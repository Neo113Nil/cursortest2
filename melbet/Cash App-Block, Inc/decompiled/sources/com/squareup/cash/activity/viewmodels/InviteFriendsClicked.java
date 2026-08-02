package com.squareup.cash.activity.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class InviteFriendsClicked implements ActivityTabViewEvent {
    public final boolean fromQab;

    public InviteFriendsClicked(boolean z) {
        this.fromQab = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InviteFriendsClicked) && this.fromQab == ((InviteFriendsClicked) obj).fromQab;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.fromQab);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("InviteFriendsClicked(fromQab=", ")", this.fromQab);
    }
}
