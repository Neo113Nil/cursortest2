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
public final class MoneybotQuickActionTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.KAFKA});
    public final QuickActionType action;
    public final String goose_message_id;
    public final String goose_session_id;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class QuickActionType {
        public static final /* synthetic */ QuickActionType[] $VALUES;
        public static final QuickActionType CLEAR_THUMBS_DOWN;
        public static final QuickActionType CLEAR_THUMBS_UP;
        public static final QuickActionType COPY;
        public static final QuickActionType THUMBS_DOWN;
        public static final QuickActionType THUMBS_UP;

        static {
            QuickActionType quickActionType = new QuickActionType("THUMBS_UP", 0);
            THUMBS_UP = quickActionType;
            QuickActionType quickActionType2 = new QuickActionType("THUMBS_DOWN", 1);
            THUMBS_DOWN = quickActionType2;
            QuickActionType quickActionType3 = new QuickActionType("REDO", 2);
            QuickActionType quickActionType4 = new QuickActionType("COPY", 3);
            COPY = quickActionType4;
            QuickActionType quickActionType5 = new QuickActionType("CLEAR_THUMBS_UP", 4);
            CLEAR_THUMBS_UP = quickActionType5;
            QuickActionType quickActionType6 = new QuickActionType("CLEAR_THUMBS_DOWN", 5);
            CLEAR_THUMBS_DOWN = quickActionType6;
            $VALUES = new QuickActionType[]{quickActionType, quickActionType2, quickActionType3, quickActionType4, quickActionType5, quickActionType6};
        }

        public static QuickActionType valueOf(String str) {
            return (QuickActionType) Enum.valueOf(QuickActionType.class, str);
        }

        public static QuickActionType[] values() {
            return (QuickActionType[]) $VALUES.clone();
        }
    }

    public MoneybotQuickActionTap(String str, String str2, QuickActionType quickActionType) {
        this.goose_session_id = str;
        this.goose_message_id = str2;
        this.action = quickActionType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Moneybot", "cdf_action", "QuickAction");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "goose_message_id", str2);
        Countries.putSafe(m, "action", quickActionType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotQuickActionTap)) {
            return false;
        }
        MoneybotQuickActionTap moneybotQuickActionTap = (MoneybotQuickActionTap) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotQuickActionTap.goose_session_id) && this.goose_message_id.equals(moneybotQuickActionTap.goose_message_id) && this.action == moneybotQuickActionTap.action;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot QuickAction Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.goose_message_id);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotQuickActionTap(goose_session_id=", this.goose_session_id, ", goose_message_id=", this.goose_message_id, ", action=");
        m.append(this.action);
        m.append(")");
        return m.toString();
    }
}
