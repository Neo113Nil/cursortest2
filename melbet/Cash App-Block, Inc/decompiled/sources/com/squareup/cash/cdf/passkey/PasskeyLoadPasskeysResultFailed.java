package com.squareup.cash.cdf.passkey;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PasskeyLoadPasskeysResultFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer code;
    public final String error_message;
    public final LinkedHashMap parameters;

    public PasskeyLoadPasskeysResultFailed(Integer num, String str) {
        this.error_message = str;
        this.code = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Passkey", "cdf_action", "LoadPasskeys");
        Countries.putSafe(m, "error_message", str);
        Countries.putSafe(m, "code", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyLoadPasskeysResultFailed)) {
            return false;
        }
        PasskeyLoadPasskeysResultFailed passkeyLoadPasskeysResultFailed = (PasskeyLoadPasskeysResultFailed) obj;
        return Intrinsics.areEqual(this.error_message, passkeyLoadPasskeysResultFailed.error_message) && Intrinsics.areEqual(this.code, passkeyLoadPasskeysResultFailed.code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Passkey LoadPasskeys ResultFailed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.error_message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PasskeyLoadPasskeysResultFailed(error_message=" + this.error_message + ", code=" + this.code + ")";
    }
}
