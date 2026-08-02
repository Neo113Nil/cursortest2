package com.squareup.cash.data.contacts;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class ContactDetailsSyncState$ContactRow {
    public final long row;

    public /* synthetic */ ContactDetailsSyncState$ContactRow(long j) {
        this.row = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContactDetailsSyncState$ContactRow m3510boximpl(long j) {
        return new ContactDetailsSyncState$ContactRow(j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactDetailsSyncState$ContactRow) {
            return this.row == ((ContactDetailsSyncState$ContactRow) obj).row;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.row);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.row, "ContactRow(row=", ")");
    }
}
