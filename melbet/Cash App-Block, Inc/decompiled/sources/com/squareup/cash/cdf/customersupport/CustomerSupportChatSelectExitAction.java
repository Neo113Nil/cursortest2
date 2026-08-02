package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportChatSelectExitAction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Action action;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes9.dex */
    public final class Action {
        public static final /* synthetic */ Action[] $VALUES;
        public static final Action CONTINUE;
        public static final Action END;

        static {
            Action action = new Action("END", 0);
            END = action;
            Action action2 = new Action("CONTINUE", 1);
            CONTINUE = action2;
            $VALUES = new Action[]{action, action2};
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public CustomerSupportChatSelectExitAction(Action action, String str) {
        this.action = action;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "action", action);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatSelectExitAction)) {
            return false;
        }
        CustomerSupportChatSelectExitAction customerSupportChatSelectExitAction = (CustomerSupportChatSelectExitAction) obj;
        return this.action == customerSupportChatSelectExitAction.action && Intrinsics.areEqual(this.flow_token, customerSupportChatSelectExitAction.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat SelectExitAction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CustomerSupportChatSelectExitAction(action=" + this.action + ", flow_token=" + this.flow_token + ")";
    }
}
