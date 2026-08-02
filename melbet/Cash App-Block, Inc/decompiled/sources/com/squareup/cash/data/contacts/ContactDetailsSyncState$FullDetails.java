package com.squareup.cash.data.contacts;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactDetailsSyncState$FullDetails {
    public final String hash;
    public final String latestLookupKey;
    public final String primaryKey;

    public ContactDetailsSyncState$FullDetails(String str, String str2, String str3, int i) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.primaryKey = str;
        this.latestLookupKey = str2;
        this.hash = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetailsSyncState$FullDetails)) {
            return false;
        }
        ContactDetailsSyncState$FullDetails contactDetailsSyncState$FullDetails = (ContactDetailsSyncState$FullDetails) obj;
        return Intrinsics.areEqual(this.primaryKey, contactDetailsSyncState$FullDetails.primaryKey) && Intrinsics.areEqual(this.latestLookupKey, contactDetailsSyncState$FullDetails.latestLookupKey) && Intrinsics.areEqual(this.hash, contactDetailsSyncState$FullDetails.hash);
    }

    /* renamed from: getHash-0vX-zpQ, reason: not valid java name */
    public final String m3511getHash0vXzpQ() {
        return this.hash;
    }

    public final int hashCode() {
        return this.hash.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.primaryKey.hashCode() * 31, 961, this.latestLookupKey);
    }

    public final String toString() {
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrimaryKey(key=", this.primaryKey, ")");
        String m3513toStringimpl = ContactDetailsSyncState$LatestLookupKey.m3513toStringimpl(this.latestLookupKey);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FullDetails(primaryKey=", m, ", latestLookupKey=", m3513toStringimpl, ", row=null, hash="), JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Hash(hash=", this.hash, ")"), ")");
    }

    public /* synthetic */ ContactDetailsSyncState$FullDetails(String str, String str2, String str3) {
        this(str, str2, str3, 0);
    }
}
