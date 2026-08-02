package com.squareup.cash.db;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GetActiveLink {
    public final String account_token;
    public final Long created_at_ms;
    public final Long id;
    public final Long signin_group_id;

    public GetActiveLink(String str, Long l, Long l2, Long l3) {
        this.account_token = str;
        this.id = l;
        this.signin_group_id = l2;
        this.created_at_ms = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetActiveLink)) {
            return false;
        }
        GetActiveLink getActiveLink = (GetActiveLink) obj;
        return Intrinsics.areEqual(this.account_token, getActiveLink.account_token) && Intrinsics.areEqual(this.id, getActiveLink.id) && Intrinsics.areEqual(this.signin_group_id, getActiveLink.signin_group_id) && Intrinsics.areEqual(this.created_at_ms, getActiveLink.created_at_ms);
    }

    public final int hashCode() {
        String str = this.account_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.id;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.signin_group_id;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.created_at_ms;
        return hashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.id, "GetActiveLink(account_token=", this.account_token, ", id=", ", signin_group_id=");
        m.append(this.signin_group_id);
        m.append(", created_at_ms=");
        m.append(this.created_at_ms);
        m.append(")");
        return m.toString();
    }
}
