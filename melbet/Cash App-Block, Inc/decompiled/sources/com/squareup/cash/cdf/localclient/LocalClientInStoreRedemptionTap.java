package com.squareup.cash.cdf.localclient;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LocalClientInStoreRedemptionTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InStoreRedemptionElement {
        public static final /* synthetic */ InStoreRedemptionElement[] $VALUES;
        public static final InStoreRedemptionElement DoneButton;

        static {
            InStoreRedemptionElement inStoreRedemptionElement = new InStoreRedemptionElement("DoneButton", 0);
            DoneButton = inStoreRedemptionElement;
            $VALUES = new InStoreRedemptionElement[]{inStoreRedemptionElement};
        }

        public static InStoreRedemptionElement valueOf(String str) {
            return (InStoreRedemptionElement) Enum.valueOf(InStoreRedemptionElement.class, str);
        }

        public static InStoreRedemptionElement[] values() {
            return (InStoreRedemptionElement[]) $VALUES.clone();
        }
    }

    public LocalClientInStoreRedemptionTap() {
        InStoreRedemptionElement inStoreRedemptionElement = InStoreRedemptionElement.DoneButton;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "LocalClient", "cdf_action", "InStoreRedemption");
        Countries.putSafe(m, "element", inStoreRedemptionElement);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientInStoreRedemptionTap)) {
            return false;
        }
        InStoreRedemptionElement inStoreRedemptionElement = InStoreRedemptionElement.DoneButton;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient InStoreRedemption Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return InStoreRedemptionElement.DoneButton.hashCode();
    }

    public final String toString() {
        return "LocalClientInStoreRedemptionTap(element=" + InStoreRedemptionElement.DoneButton + ")";
    }
}
