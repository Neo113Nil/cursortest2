package com.squareup.cash.cdf.passkey;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PasskeyLoadPasskeysResultSuccess implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Integer passkey_count;

    public PasskeyLoadPasskeysResultSuccess(Integer num) {
        this.passkey_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Passkey", "cdf_action", "LoadPasskeys");
        Countries.putSafe(m, "passkey_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasskeyLoadPasskeysResultSuccess) && this.passkey_count.equals(((PasskeyLoadPasskeysResultSuccess) obj).passkey_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Passkey LoadPasskeys ResultSuccess";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.passkey_count.hashCode();
    }

    public final String toString() {
        return "PasskeyLoadPasskeysResultSuccess(passkey_count=" + this.passkey_count + ")";
    }
}
