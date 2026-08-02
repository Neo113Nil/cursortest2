package com.squareup.cash.integration.contacts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactBook$ContactAccountDetails {
    public final String accountName;
    public final String accountType;
    public final long contactId;

    public ContactBook$ContactAccountDetails(long j, String str, String str2) {
        this.contactId = j;
        this.accountName = str;
        this.accountType = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactBook$ContactAccountDetails)) {
            return false;
        }
        ContactBook$ContactAccountDetails contactBook$ContactAccountDetails = (ContactBook$ContactAccountDetails) obj;
        return this.contactId == contactBook$ContactAccountDetails.contactId && Intrinsics.areEqual(this.accountName, contactBook$ContactAccountDetails.accountName) && Intrinsics.areEqual(this.accountType, contactBook$ContactAccountDetails.accountType);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.contactId) * 31;
        String str = this.accountName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m("ContactAccountDetails(contactId=", this.contactId, ", accountName=", this.accountName), ", accountType=", this.accountType, ")");
    }
}
