package com.squareup.cash.db2.contacts;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Contact_detailed_sync_state {
    public final String hash;
    public final String latest_lookup_key;
    public final String primary_key;
    public final Long row_id;

    public Contact_detailed_sync_state(String str, String str2, String str3, Long l) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.primary_key = str;
        this.latest_lookup_key = str2;
        this.row_id = l;
        this.hash = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact_detailed_sync_state)) {
            return false;
        }
        Contact_detailed_sync_state contact_detailed_sync_state = (Contact_detailed_sync_state) obj;
        return Intrinsics.areEqual(this.primary_key, contact_detailed_sync_state.primary_key) && Intrinsics.areEqual(this.latest_lookup_key, contact_detailed_sync_state.latest_lookup_key) && Intrinsics.areEqual(this.row_id, contact_detailed_sync_state.row_id) && Intrinsics.areEqual(this.hash, contact_detailed_sync_state.hash);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getLatest_lookup_key() {
        return this.latest_lookup_key;
    }

    public final String getPrimary_key() {
        return this.primary_key;
    }

    public final Long getRow_id() {
        return this.row_id;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.primary_key.hashCode() * 31, 31, this.latest_lookup_key);
        Long l = this.row_id;
        return this.hash.hashCode() + ((m + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Contact_detailed_sync_state(primary_key=", this.primary_key, ", latest_lookup_key=", this.latest_lookup_key, ", row_id=");
        m.append(this.row_id);
        m.append(", hash=");
        m.append(this.hash);
        m.append(")");
        return m.toString();
    }
}
