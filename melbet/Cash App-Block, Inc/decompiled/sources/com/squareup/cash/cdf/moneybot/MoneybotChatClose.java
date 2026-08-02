package com.squareup.cash.cdf.moneybot;

import com.google.mlkit.common.internal.zzc;
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
public final class MoneybotChatClose implements Event {
    public static final zzc Companion = new zzc(25);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final ChatContentState content_state;
    public final String goose_session_id;
    public final LinkedHashMap parameters;

    public MoneybotChatClose(String str, ChatContentState chatContentState, String str2) {
        this.client_chat_id = str;
        this.content_state = chatContentState;
        this.goose_session_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Moneybot", "cdf_action", "Chat");
        Countries.putSafe(m, "client_chat_id", str);
        Countries.putSafe(m, "content_state", chatContentState);
        Countries.putSafe(m, "goose_session_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotChatClose)) {
            return false;
        }
        MoneybotChatClose moneybotChatClose = (MoneybotChatClose) obj;
        return Intrinsics.areEqual(this.client_chat_id, moneybotChatClose.client_chat_id) && this.content_state == moneybotChatClose.content_state && Intrinsics.areEqual(this.goose_session_id, moneybotChatClose.goose_session_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Chat Close";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_chat_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChatContentState chatContentState = this.content_state;
        int hashCode2 = (hashCode + (chatContentState == null ? 0 : chatContentState.hashCode())) * 31;
        String str2 = this.goose_session_id;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotChatClose(client_chat_id=");
        sb.append(this.client_chat_id);
        sb.append(", content_state=");
        sb.append(this.content_state);
        sb.append(", goose_session_id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.goose_session_id, ")");
    }
}
