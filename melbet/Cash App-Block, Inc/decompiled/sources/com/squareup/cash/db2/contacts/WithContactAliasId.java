package com.squareup.cash.db2.contacts;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WithContactAliasId {
    public final String email;
    public final String hashed_alias;
    public final String hashed_alias_id;
    public final String lookup_key;
    public final String sms;

    public WithContactAliasId(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.lookup_key = str;
        this.hashed_alias = str2;
        this.hashed_alias_id = str3;
        this.sms = str4;
        this.email = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithContactAliasId)) {
            return false;
        }
        WithContactAliasId withContactAliasId = (WithContactAliasId) obj;
        return Intrinsics.areEqual(this.lookup_key, withContactAliasId.lookup_key) && Intrinsics.areEqual(this.hashed_alias, withContactAliasId.hashed_alias) && Intrinsics.areEqual(this.hashed_alias_id, withContactAliasId.hashed_alias_id) && Intrinsics.areEqual(this.sms, withContactAliasId.sms) && Intrinsics.areEqual(this.email, withContactAliasId.email);
    }

    public final int hashCode() {
        int hashCode = this.lookup_key.hashCode() * 31;
        String str = this.hashed_alias;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hashed_alias_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sms;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithContactAliasId(lookup_key=", this.lookup_key, ", hashed_alias=", this.hashed_alias, ", hashed_alias_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.hashed_alias_id, ", sms=", this.sms, ", email=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.email, ")");
    }
}
