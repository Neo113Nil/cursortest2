package com.squareup.cash.cdf.appmessage;

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
public final class AppMessageInteractBuffer implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long buffer_time_millis;
    public final String message_token;
    public final LinkedHashMap parameters;

    public AppMessageInteractBuffer(Long l, String str) {
        this.buffer_time_millis = l;
        this.message_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "AppMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "buffer_time_millis", l);
        Countries.putSafe(m, "message_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMessageInteractBuffer)) {
            return false;
        }
        AppMessageInteractBuffer appMessageInteractBuffer = (AppMessageInteractBuffer) obj;
        return this.buffer_time_millis.equals(appMessageInteractBuffer.buffer_time_millis) && Intrinsics.areEqual(this.message_token, appMessageInteractBuffer.message_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppMessage Interact Buffer";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.buffer_time_millis.hashCode() * 31;
        String str = this.message_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMessageInteractBuffer(buffer_time_millis=" + this.buffer_time_millis + ", message_token=" + this.message_token + ")";
    }
}
