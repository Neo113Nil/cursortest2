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
public final class MoneybotTemplateCardTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.KAFKA});
    public final ActionType action_type;
    public final ButtonRole button;
    public final String goose_session_id;
    public final LinkedHashMap parameters;
    public final String source;
    public final String target;
    public final String tool_name;
    public final String tool_request_id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ActionType {
        public static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType CLIENT_ROUTE;
        public static final ActionType SERVER_TOOL_CALL;

        static {
            ActionType actionType = new ActionType("SERVER_TOOL_CALL", 0);
            SERVER_TOOL_CALL = actionType;
            ActionType actionType2 = new ActionType("CLIENT_ROUTE", 1);
            CLIENT_ROUTE = actionType2;
            $VALUES = new ActionType[]{actionType, actionType2};
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ButtonRole {
        public static final /* synthetic */ ButtonRole[] $VALUES;
        public static final ButtonRole CARD;
        public static final ButtonRole PRIMARY;
        public static final ButtonRole SECONDARY;

        static {
            ButtonRole buttonRole = new ButtonRole("PRIMARY", 0);
            PRIMARY = buttonRole;
            ButtonRole buttonRole2 = new ButtonRole("SECONDARY", 1);
            SECONDARY = buttonRole2;
            ButtonRole buttonRole3 = new ButtonRole("CARD", 2);
            CARD = buttonRole3;
            $VALUES = new ButtonRole[]{buttonRole, buttonRole2, buttonRole3};
        }

        public static ButtonRole valueOf(String str) {
            return (ButtonRole) Enum.valueOf(ButtonRole.class, str);
        }

        public static ButtonRole[] values() {
            return (ButtonRole[]) $VALUES.clone();
        }
    }

    public MoneybotTemplateCardTap(String str, String str2, String str3, ButtonRole buttonRole, ActionType actionType, String str4, String str5) {
        this.goose_session_id = str;
        this.tool_request_id = str2;
        this.tool_name = str3;
        this.button = buttonRole;
        this.action_type = actionType;
        this.source = str4;
        this.target = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Moneybot", "cdf_action", "TemplateCard");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "tool_request_id", str2);
        Countries.putSafe(m, "tool_name", str3);
        Countries.putSafe(m, "button", buttonRole);
        Countries.putSafe(m, "action_type", actionType);
        Countries.putSafe(m, "source", str4);
        Countries.putSafe(m, "target", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotTemplateCardTap)) {
            return false;
        }
        MoneybotTemplateCardTap moneybotTemplateCardTap = (MoneybotTemplateCardTap) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotTemplateCardTap.goose_session_id) && Intrinsics.areEqual(this.tool_request_id, moneybotTemplateCardTap.tool_request_id) && Intrinsics.areEqual(this.tool_name, moneybotTemplateCardTap.tool_name) && this.button == moneybotTemplateCardTap.button && this.action_type == moneybotTemplateCardTap.action_type && Intrinsics.areEqual(this.source, moneybotTemplateCardTap.source) && Intrinsics.areEqual(this.target, moneybotTemplateCardTap.target);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot TemplateCard Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tool_request_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tool_name;
        int hashCode3 = (this.action_type.hashCode() + ((this.button.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.source;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.target;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotTemplateCardTap(goose_session_id=", this.goose_session_id, ", tool_request_id=", this.tool_request_id, ", tool_name=");
        m.append(this.tool_name);
        m.append(", button=");
        m.append(this.button);
        m.append(", action_type=");
        m.append(this.action_type);
        m.append(", source=");
        m.append(this.source);
        m.append(", target=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.target, ")");
    }
}
