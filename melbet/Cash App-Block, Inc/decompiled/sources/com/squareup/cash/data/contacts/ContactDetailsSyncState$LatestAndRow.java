package com.squareup.cash.data.contacts;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ContactDetailsSyncState$LatestAndRow {
    public final String latestLookupKey;
    public final ContactDetailsSyncState$ContactRow row;

    public ContactDetailsSyncState$LatestAndRow(String str, ContactDetailsSyncState$ContactRow contactDetailsSyncState$ContactRow) {
        str.getClass();
        this.latestLookupKey = str;
        this.row = contactDetailsSyncState$ContactRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetailsSyncState$LatestAndRow)) {
            return false;
        }
        ContactDetailsSyncState$LatestAndRow contactDetailsSyncState$LatestAndRow = (ContactDetailsSyncState$LatestAndRow) obj;
        return Intrinsics.areEqual(this.latestLookupKey, contactDetailsSyncState$LatestAndRow.latestLookupKey) && Intrinsics.areEqual(this.row, contactDetailsSyncState$LatestAndRow.row);
    }

    public final int hashCode() {
        int hashCode = this.latestLookupKey.hashCode() * 31;
        ContactDetailsSyncState$ContactRow contactDetailsSyncState$ContactRow = this.row;
        return hashCode + (contactDetailsSyncState$ContactRow == null ? 0 : Long.hashCode(contactDetailsSyncState$ContactRow.row));
    }

    public final String toString() {
        return "LatestAndRow(latestLookupKey=" + ContactDetailsSyncState$LatestLookupKey.m3513toStringimpl(this.latestLookupKey) + ", row=" + this.row + ")";
    }
}
