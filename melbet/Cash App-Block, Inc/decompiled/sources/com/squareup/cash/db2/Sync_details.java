package com.squareup.cash.db2;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Sync_details {
    public final String detailed_sync_token;
    public final Long rate_limited_time;
    public final String sync_token;

    public Sync_details(Long l, String str, String str2) {
        this.rate_limited_time = l;
        this.sync_token = str;
        this.detailed_sync_token = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sync_details)) {
            return false;
        }
        Sync_details sync_details = (Sync_details) obj;
        return Intrinsics.areEqual(this.rate_limited_time, sync_details.rate_limited_time) && Intrinsics.areEqual(this.sync_token, sync_details.sync_token) && Intrinsics.areEqual(this.detailed_sync_token, sync_details.detailed_sync_token);
    }

    public final String getDetailed_sync_token() {
        return this.detailed_sync_token;
    }

    public final Long getRate_limited_time() {
        return this.rate_limited_time;
    }

    public final String getSync_token() {
        return this.sync_token;
    }

    public final int hashCode() {
        Long l = this.rate_limited_time;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.sync_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.detailed_sync_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sync_details(rate_limited_time=");
        sb.append(this.rate_limited_time);
        sb.append(", sync_token=");
        sb.append(this.sync_token);
        sb.append(", detailed_sync_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.detailed_sync_token, ")");
    }
}
