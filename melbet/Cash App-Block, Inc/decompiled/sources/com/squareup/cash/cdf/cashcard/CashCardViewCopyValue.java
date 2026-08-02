package com.squareup.cash.cdf.cashcard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashCardViewCopyValue implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CopiedValue {
        public static final /* synthetic */ CopiedValue[] $VALUES;
        public static final CopiedValue PAN;

        static {
            CopiedValue copiedValue = new CopiedValue("PAN", 0);
            PAN = copiedValue;
            $VALUES = new CopiedValue[]{copiedValue};
        }

        public static CopiedValue valueOf(String str) {
            return (CopiedValue) Enum.valueOf(CopiedValue.class, str);
        }

        public static CopiedValue[] values() {
            return (CopiedValue[]) $VALUES.clone();
        }
    }

    public CashCardViewCopyValue() {
        CopiedValue copiedValue = CopiedValue.PAN;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "CashCard", "cdf_action", "View");
        Countries.putSafe(m, "copied_value", copiedValue);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardViewCopyValue)) {
            return false;
        }
        CopiedValue copiedValue = CopiedValue.PAN;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard View CopyValue";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return CopiedValue.PAN.hashCode();
    }

    public final String toString() {
        return "CashCardViewCopyValue(copied_value=" + CopiedValue.PAN + ")";
    }
}
