package com.squareup.cash.data.contacts;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ContactRepository$AliasBySyncState {
    public final ArrayList added;
    public final ArrayList removed;

    public ContactRepository$AliasBySyncState(ArrayList arrayList, ArrayList arrayList2) {
        this.added = arrayList;
        this.removed = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactRepository$AliasBySyncState)) {
            return false;
        }
        ContactRepository$AliasBySyncState contactRepository$AliasBySyncState = (ContactRepository$AliasBySyncState) obj;
        return this.added.equals(contactRepository$AliasBySyncState.added) && this.removed.equals(contactRepository$AliasBySyncState.removed);
    }

    public final List getAdded() {
        return this.added;
    }

    public final List getRemoved() {
        return this.removed;
    }

    public final int hashCode() {
        return this.removed.hashCode() + (this.added.hashCode() * 31);
    }

    public final boolean isEmpty() {
        return this.added.isEmpty() && this.removed.isEmpty();
    }

    public final String toString() {
        return "AliasBySyncState(added=" + this.added + ", removed=" + this.removed + ")";
    }
}
