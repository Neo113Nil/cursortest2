package com.squareup.cash.cdf.p2pallowlist;

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
public final class P2PAllowListEditStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AllowListAction action;
    public final LinkedHashMap parameters;
    public final String subject_customer_token;
    public final String target_customer_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AllowListAction {
        public static final /* synthetic */ AllowListAction[] $VALUES;
        public static final AllowListAction ADD;
        public static final AllowListAction REMOVE;

        static {
            AllowListAction allowListAction = new AllowListAction("ADD", 0);
            ADD = allowListAction;
            AllowListAction allowListAction2 = new AllowListAction("REMOVE", 1);
            REMOVE = allowListAction2;
            $VALUES = new AllowListAction[]{allowListAction, allowListAction2};
        }

        public static AllowListAction valueOf(String str) {
            return (AllowListAction) Enum.valueOf(AllowListAction.class, str);
        }

        public static AllowListAction[] values() {
            return (AllowListAction[]) $VALUES.clone();
        }
    }

    public P2PAllowListEditStart(String str, String str2, AllowListAction allowListAction) {
        this.subject_customer_token = str;
        this.target_customer_token = str2;
        this.action = allowListAction;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "P2PAllowList", "cdf_action", "Edit");
        Countries.putSafe(m, "subject_customer_token", str);
        Countries.putSafe(m, "target_customer_token", str2);
        Countries.putSafe(m, "action", allowListAction);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PAllowListEditStart)) {
            return false;
        }
        P2PAllowListEditStart p2PAllowListEditStart = (P2PAllowListEditStart) obj;
        return Intrinsics.areEqual(this.subject_customer_token, p2PAllowListEditStart.subject_customer_token) && Intrinsics.areEqual(this.target_customer_token, p2PAllowListEditStart.target_customer_token) && this.action == p2PAllowListEditStart.action;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "P2PAllowList Edit Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.subject_customer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.target_customer_token;
        return this.action.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("P2PAllowListEditStart(subject_customer_token=", this.subject_customer_token, ", target_customer_token=", this.target_customer_token, ", action=");
        m.append(this.action);
        m.append(")");
        return m.toString();
    }
}
