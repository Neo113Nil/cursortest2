package com.squareup.cash.cdf.directdepositaccount;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class DirectDepositAccountViewCopy implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final CopiedValue copied_value;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CopiedValue {
        public static final /* synthetic */ CopiedValue[] $VALUES;
        public static final CopiedValue ACCOUNT_NUMBER;
        public static final CopiedValue ROUTING_NUMBER;

        static {
            CopiedValue copiedValue = new CopiedValue("ACCOUNT_NUMBER", 0);
            ACCOUNT_NUMBER = copiedValue;
            CopiedValue copiedValue2 = new CopiedValue("ROUTING_NUMBER", 1);
            ROUTING_NUMBER = copiedValue2;
            $VALUES = new CopiedValue[]{copiedValue, copiedValue2};
        }

        public static CopiedValue valueOf(String str) {
            return (CopiedValue) Enum.valueOf(CopiedValue.class, str);
        }

        public static CopiedValue[] values() {
            return (CopiedValue[]) $VALUES.clone();
        }
    }

    public DirectDepositAccountViewCopy(CopiedValue copiedValue) {
        this.copied_value = copiedValue;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "DirectDepositAccount", "cdf_action", "View");
        Countries.putSafe(m, "copied_value", copiedValue);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectDepositAccountViewCopy) && this.copied_value == ((DirectDepositAccountViewCopy) obj).copied_value;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DirectDepositAccount View Copy";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.copied_value.hashCode();
    }

    public final String toString() {
        return "DirectDepositAccountViewCopy(copied_value=" + this.copied_value + ")";
    }
}
