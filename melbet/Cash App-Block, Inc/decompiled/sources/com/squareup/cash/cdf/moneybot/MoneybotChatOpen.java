package com.squareup.cash.cdf.moneybot;

import com.google.mlkit.common.internal.zzd;
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
public final class MoneybotChatOpen implements Event {
    public static final zzd Companion = new zzd(25);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_chat_id;
    public final String goose_session_id;
    public final String home_item_id;
    public final HomeItemType home_item_type;
    public final String home_session_id;
    public final LinkedHashMap parameters;
    public final EntryPointSurface surface;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class EntryPointSurface {
        public static final /* synthetic */ EntryPointSurface[] $VALUES;
        public static final EntryPointSurface DEEP_LINK;
        public static final EntryPointSurface HISTORY;
        public static final EntryPointSurface IN_APP_MESSAGE;
        public static final EntryPointSurface MONEY;
        public static final EntryPointSurface MONEYBOT_HOME;
        public static final EntryPointSurface NEW_CHAT;
        public static final EntryPointSurface NULL_STATE;
        public static final EntryPointSurface PUSH_NOTIFICATION;

        /* JADX INFO: Fake field, exist only in values array */
        EntryPointSurface EF0;

        static {
            EntryPointSurface entryPointSurface = new EntryPointSurface("ACTIVITY", 0);
            EntryPointSurface entryPointSurface2 = new EntryPointSurface("DEEP_LINK", 1);
            DEEP_LINK = entryPointSurface2;
            EntryPointSurface entryPointSurface3 = new EntryPointSurface("HISTORY", 2);
            HISTORY = entryPointSurface3;
            EntryPointSurface entryPointSurface4 = new EntryPointSurface("IN_APP_MESSAGE", 3);
            IN_APP_MESSAGE = entryPointSurface4;
            EntryPointSurface entryPointSurface5 = new EntryPointSurface("MONEY", 4);
            MONEY = entryPointSurface5;
            EntryPointSurface entryPointSurface6 = new EntryPointSurface("MONEYBOT_HOME", 5);
            MONEYBOT_HOME = entryPointSurface6;
            EntryPointSurface entryPointSurface7 = new EntryPointSurface("NEIGHBORHOODS", 6);
            EntryPointSurface entryPointSurface8 = new EntryPointSurface("NEW_CHAT", 7);
            NEW_CHAT = entryPointSurface8;
            EntryPointSurface entryPointSurface9 = new EntryPointSurface("NULL_STATE", 8);
            NULL_STATE = entryPointSurface9;
            EntryPointSurface entryPointSurface10 = new EntryPointSurface("PAYMENT_PAD", 9);
            EntryPointSurface entryPointSurface11 = new EntryPointSurface("PUSH_NOTIFICATION", 10);
            PUSH_NOTIFICATION = entryPointSurface11;
            $VALUES = new EntryPointSurface[]{entryPointSurface, entryPointSurface2, entryPointSurface3, entryPointSurface4, entryPointSurface5, entryPointSurface6, entryPointSurface7, entryPointSurface8, entryPointSurface9, entryPointSurface10, entryPointSurface11};
        }

        public static EntryPointSurface valueOf(String str) {
            return (EntryPointSurface) Enum.valueOf(EntryPointSurface.class, str);
        }

        public static EntryPointSurface[] values() {
            return (EntryPointSurface[]) $VALUES.clone();
        }
    }

    public MoneybotChatOpen(String str, String str2, EntryPointSurface entryPointSurface, String str3, HomeItemType homeItemType, String str4) {
        this.client_chat_id = str;
        this.goose_session_id = str2;
        this.surface = entryPointSurface;
        this.home_session_id = str3;
        this.home_item_type = homeItemType;
        this.home_item_id = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Moneybot", "cdf_action", "Chat");
        Countries.putSafe(m, "client_chat_id", str);
        Countries.putSafe(m, "goose_session_id", str2);
        Countries.putSafe(m, "surface", entryPointSurface);
        Countries.putSafe(m, "home_session_id", str3);
        Countries.putSafe(m, "home_item_type", homeItemType);
        Countries.putSafe(m, "home_item_id", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotChatOpen)) {
            return false;
        }
        MoneybotChatOpen moneybotChatOpen = (MoneybotChatOpen) obj;
        return Intrinsics.areEqual(this.client_chat_id, moneybotChatOpen.client_chat_id) && Intrinsics.areEqual(this.goose_session_id, moneybotChatOpen.goose_session_id) && this.surface == moneybotChatOpen.surface && Intrinsics.areEqual(this.home_session_id, moneybotChatOpen.home_session_id) && this.home_item_type == moneybotChatOpen.home_item_type && Intrinsics.areEqual(this.home_item_id, moneybotChatOpen.home_item_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot Chat Open";
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
        EntryPointSurface entryPointSurface = this.surface;
        int hashCode3 = (hashCode2 + (entryPointSurface == null ? 0 : entryPointSurface.hashCode())) * 961;
        String str3 = this.home_session_id;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HomeItemType homeItemType = this.home_item_type;
        int hashCode5 = (hashCode4 + (homeItemType == null ? 0 : homeItemType.hashCode())) * 31;
        String str4 = this.home_item_id;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotChatOpen(client_chat_id=", this.client_chat_id, ", goose_session_id=", this.goose_session_id, ", surface=");
        m.append(this.surface);
        m.append(", nux_id=null, home_session_id=");
        m.append(this.home_session_id);
        m.append(", home_item_type=");
        m.append(this.home_item_type);
        m.append(", home_item_id=");
        m.append(this.home_item_id);
        m.append(")");
        return m.toString();
    }
}
