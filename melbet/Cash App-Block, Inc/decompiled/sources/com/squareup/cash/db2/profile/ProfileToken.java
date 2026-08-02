package com.squareup.cash.db2.profile;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ProfileToken {
    public final String profile_token;

    public ProfileToken(String str) {
        this.profile_token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileToken) && Intrinsics.areEqual(this.profile_token, ((ProfileToken) obj).profile_token);
    }

    public final int hashCode() {
        String str = this.profile_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileToken(profile_token=", this.profile_token, ")");
    }
}
