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
public final class MoneybotMessageClientSend implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final String goose_session_id;
    public final String message_id;
    public final LinkedHashMap parameters;

    public MoneybotMessageClientSend(String str, String str2, String str3) {
        this.client_chat_id = str;
        this.goose_session_id = str2;
        this.message_id = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Moneybot", "cdf_action", "Message");
        Countries.putSafe(m, "client_chat_id", str);
        Countries.putSafe(m, "goose_session_id", str2);
        Countries.putSafe(m, "message_id", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotMessageClientSend)) {
            return false;
        }
        MoneybotMessageClientSend moneybotMessageClientSend = (MoneybotMessageClientSend) obj;
        return Intrinsics.areEqual(this.client_chat_id, moneybotMessageClientSend.client_chat_id) && Intrinsics.areEqual(this.goose_session_id, moneybotMessageClientSend.goose_session_id) && Intrinsics.areEqual(this.message_id, moneybotMessageClientSend.message_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Message ClientSend";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_chat_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.goose_session_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message_id;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotMessageClientSend(client_chat_id=", this.client_chat_id, ", goose_session_id=", this.goose_session_id, ", message_id="), this.message_id, ")");
    }
}
