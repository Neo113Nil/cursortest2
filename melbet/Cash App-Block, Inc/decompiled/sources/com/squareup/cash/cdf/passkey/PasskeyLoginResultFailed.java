package com.squareup.cash.cdf.passkey;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PasskeyLoginResultFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public PasskeyLoginResultFailed(String str, String str2) {
        this.client_scenario = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Passkey", "cdf_action", "Login");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyLoginResultFailed)) {
            return false;
        }
        PasskeyLoginResultFailed passkeyLoginResultFailed = (PasskeyLoginResultFailed) obj;
        return this.client_scenario.equals(passkeyLoginResultFailed.client_scenario) && this.flow_token.equals(passkeyLoginResultFailed.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Passkey Login ResultFailed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + (this.client_scenario.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PasskeyLoginResultFailed(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ")");
    }
}
