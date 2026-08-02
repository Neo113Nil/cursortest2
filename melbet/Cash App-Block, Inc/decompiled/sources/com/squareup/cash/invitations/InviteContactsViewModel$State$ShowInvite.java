package com.squareup.cash.invitations;

/* loaded from: classes6.dex */
public final class InviteContactsViewModel$State$ShowInvite extends InviteErrorDialogKt {
    public final boolean buttonEnabled;
    public final InviteContactsViewEvent onInvite;

    public InviteContactsViewModel$State$ShowInvite(InviteContactsViewEvent inviteContactsViewEvent, boolean z) {
        this.onInvite = inviteContactsViewEvent;
        this.buttonEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteContactsViewModel$State$ShowInvite)) {
            return false;
        }
        InviteContactsViewModel$State$ShowInvite inviteContactsViewModel$State$ShowInvite = (InviteContactsViewModel$State$ShowInvite) obj;
        return this.onInvite.equals(inviteContactsViewModel$State$ShowInvite.onInvite) && this.buttonEnabled == inviteContactsViewModel$State$ShowInvite.buttonEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.buttonEnabled) + (this.onInvite.hashCode() * 31);
    }

    public final String toString() {
        return "ShowInvite(onInvite=" + this.onInvite + ", buttonEnabled=" + this.buttonEnabled + ")";
    }
}
