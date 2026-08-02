package com.squareup.cash.cdf.moneybot;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotErrorNextBestActionError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String endpoint;
    public final String error_name;
    public final String home_session_id;
    public final LinkedHashMap parameters;

    public MoneybotErrorNextBestActionError(String str, String str2, String str3) {
        this.home_session_id = str;
        this.error_name = str2;
        this.endpoint = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Moneybot", "cdf_action", "Error");
        Countries.putSafe(m, "home_session_id", str);
        Countries.putSafe(m, "error_name", str2);
        Countries.putSafe(m, "endpoint", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotErrorNextBestActionError)) {
            return false;
        }
        MoneybotErrorNextBestActionError moneybotErrorNextBestActionError = (MoneybotErrorNextBestActionError) obj;
        return Intrinsics.areEqual(this.home_session_id, moneybotErrorNextBestActionError.home_session_id) && this.error_name.equals(moneybotErrorNextBestActionError.error_name) && this.endpoint.equals(moneybotErrorNextBestActionError.endpoint);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Error NextBestActionError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.home_session_id;
        return this.endpoint.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.error_name);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotErrorNextBestActionError(home_session_id=", this.home_session_id, ", error_name=", this.error_name, ", endpoint="), this.endpoint, ")");
    }
}
