package com.squareup.cash.db2.profile;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalContactProfile {
    public final String display_name;
    public final String email;
    public final String lookup_key;
    public final String sms;

    public LocalContactProfile(String str, String str2, String str3, String str4) {
        this.lookup_key = str;
        this.display_name = str2;
        this.email = str3;
        this.sms = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalContactProfile)) {
            return false;
        }
        LocalContactProfile localContactProfile = (LocalContactProfile) obj;
        return Intrinsics.areEqual(this.lookup_key, localContactProfile.lookup_key) && Intrinsics.areEqual(this.display_name, localContactProfile.display_name) && Intrinsics.areEqual(this.email, localContactProfile.email) && Intrinsics.areEqual(this.sms, localContactProfile.sms);
    }

    public final int hashCode() {
        String str = this.lookup_key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.display_name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sms;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalContactProfile(lookup_key=", this.lookup_key, ", display_name=", this.display_name, ", email="), this.email, ", sms=", this.sms, ")");
    }
}
