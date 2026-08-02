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
public final class MoneybotChatViewHistory implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final LinkedHashMap parameters;

    public MoneybotChatViewHistory(String str) {
        this.client_chat_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Moneybot", "cdf_action", "Chat");
        Countries.putSafe(m, "client_chat_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneybotChatViewHistory) && Intrinsics.areEqual(this.client_chat_id, ((MoneybotChatViewHistory) obj).client_chat_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Chat ViewHistory";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_chat_id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotChatViewHistory(client_chat_id=", this.client_chat_id, ")");
    }
}
