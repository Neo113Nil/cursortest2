package com.squareup.cash.cdf.cash;

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
public final class CashWithdrawViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class EntryMethod {
        public static final /* synthetic */ EntryMethod[] $VALUES;
        public static final EntryMethod KEYPAD;

        static {
            EntryMethod entryMethod = new EntryMethod("KEYPAD", 0);
            KEYPAD = entryMethod;
            $VALUES = new EntryMethod[]{entryMethod, new EntryMethod("SLIDER", 1)};
        }

        public static EntryMethod valueOf(String str) {
            return (EntryMethod) Enum.valueOf(EntryMethod.class, str);
        }

        public static EntryMethod[] values() {
            return (EntryMethod[]) $VALUES.clone();
        }
    }

    public CashWithdrawViewed(String str) {
        EntryMethod entryMethod = EntryMethod.KEYPAD;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "entry_method", entryMethod);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawViewed)) {
            return false;
        }
        EntryMethod entryMethod = EntryMethod.KEYPAD;
        return Intrinsics.areEqual(this.flow_token, ((CashWithdrawViewed) obj).flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw Viewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = EntryMethod.KEYPAD.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CashWithdrawViewed(entry_method=" + EntryMethod.KEYPAD + ", flow_token=" + this.flow_token + ")";
    }
}
