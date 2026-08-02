package com.squareup.cash.cdf.moneybot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class MoneybotChatStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final String client_suggestion_id;
    public final String goose_session_id;
    public final String home_item_id;
    public final HomeItemType home_item_type;
    public final String home_session_id;
    public final LinkedHashMap parameters;
    public final String suggestion_id;

    public MoneybotChatStart(String str, String str2, String str3, String str4, String str5, HomeItemType homeItemType, String str6) {
        this.client_chat_id = str;
        this.goose_session_id = str2;
        this.suggestion_id = str3;
        this.client_suggestion_id = str4;
        this.home_session_id = str5;
        this.home_item_type = homeItemType;
        this.home_item_id = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Moneybot", "cdf_action", "Chat");
        Countries.putSafe(m, "client_chat_id", str);
        Countries.putSafe(m, "goose_session_id", str2);
        Countries.putSafe(m, "suggestion_id", str3);
        Countries.putSafe(m, "client_suggestion_id", str4);
        Countries.putSafe(m, "home_session_id", str5);
        Countries.putSafe(m, "home_item_type", homeItemType);
        Countries.putSafe(m, "home_item_id", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotChatStart)) {
            return false;
        }
        MoneybotChatStart moneybotChatStart = (MoneybotChatStart) obj;
        return Intrinsics.areEqual(this.client_chat_id, moneybotChatStart.client_chat_id) && Intrinsics.areEqual(this.goose_session_id, moneybotChatStart.goose_session_id) && Intrinsics.areEqual(this.suggestion_id, moneybotChatStart.suggestion_id) && Intrinsics.areEqual(this.client_suggestion_id, moneybotChatStart.client_suggestion_id) && Intrinsics.areEqual(this.home_session_id, moneybotChatStart.home_session_id) && this.home_item_type == moneybotChatStart.home_item_type && Intrinsics.areEqual(this.home_item_id, moneybotChatStart.home_item_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Chat Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_chat_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.goose_session_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.suggestion_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.client_suggestion_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.home_session_id;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HomeItemType homeItemType = this.home_item_type;
        int hashCode6 = (hashCode5 + (homeItemType == null ? 0 : homeItemType.hashCode())) * 31;
        String str6 = this.home_item_id;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotChatStart(client_chat_id=", this.client_chat_id, ", goose_session_id=", this.goose_session_id, ", campaign_token=null, suggestion_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.suggestion_id, ", client_suggestion_id=", this.client_suggestion_id, ", home_session_id=");
        m.append(this.home_session_id);
        m.append(", home_item_type=");
        m.append(this.home_item_type);
        m.append(", home_item_id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.home_item_id, ")");
    }
}
