package com.squareup.cash.cdf.moneybot;

import com.google.mlkit.common.internal.zze;
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

/* loaded from: classes.dex */
public final class MoneybotErrorChatError implements Event {
    public static final zze Companion = new zze(25);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final String endpoint;
    public final String error_name;
    public final String goose_session_id;
    public final LinkedHashMap parameters;

    public MoneybotErrorChatError(String str, String str2, String str3, String str4) {
        this.goose_session_id = str;
        this.client_chat_id = str2;
        this.error_name = str3;
        this.endpoint = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Moneybot", "cdf_action", "Error");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "client_chat_id", str2);
        Countries.putSafe(m, "error_name", str3);
        Countries.putSafe(m, "endpoint", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotErrorChatError)) {
            return false;
        }
        MoneybotErrorChatError moneybotErrorChatError = (MoneybotErrorChatError) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotErrorChatError.goose_session_id) && Intrinsics.areEqual(this.client_chat_id, moneybotErrorChatError.client_chat_id) && this.error_name.equals(moneybotErrorChatError.error_name) && this.endpoint.equals(moneybotErrorChatError.endpoint);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Error ChatError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.client_chat_id;
        return this.endpoint.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.error_name);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotErrorChatError(goose_session_id=", this.goose_session_id, ", client_chat_id=", this.client_chat_id, ", error_name="), this.error_name, ", endpoint=", this.endpoint, ")");
    }
}
