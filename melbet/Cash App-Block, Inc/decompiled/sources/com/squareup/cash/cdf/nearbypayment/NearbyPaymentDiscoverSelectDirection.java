package com.squareup.cash.cdf.nearbypayment;

import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NearbyPaymentDiscoverSelectDirection implements Event {
    public static final zzc Companion = new zzc(26);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final SelectionDirection selection;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class SelectionDirection {
        public static final /* synthetic */ SelectionDirection[] $VALUES;
        public static final SelectionDirection GET_PAID;
        public static final SelectionDirection PAY;

        static {
            SelectionDirection selectionDirection = new SelectionDirection("PAY", 0);
            PAY = selectionDirection;
            SelectionDirection selectionDirection2 = new SelectionDirection("GET_PAID", 1);
            GET_PAID = selectionDirection2;
            $VALUES = new SelectionDirection[]{selectionDirection, selectionDirection2};
        }

        public static SelectionDirection valueOf(String str) {
            return (SelectionDirection) Enum.valueOf(SelectionDirection.class, str);
        }

        public static SelectionDirection[] values() {
            return (SelectionDirection[]) $VALUES.clone();
        }
    }

    public NearbyPaymentDiscoverSelectDirection(SelectionDirection selectionDirection, String str) {
        this.selection = selectionDirection;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NearbyPayment", "cdf_action", "Discover");
        Countries.putSafe(m, "selection", selectionDirection);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentDiscoverSelectDirection)) {
            return false;
        }
        NearbyPaymentDiscoverSelectDirection nearbyPaymentDiscoverSelectDirection = (NearbyPaymentDiscoverSelectDirection) obj;
        return this.selection == nearbyPaymentDiscoverSelectDirection.selection && Intrinsics.areEqual(this.flow_token, nearbyPaymentDiscoverSelectDirection.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment Discover SelectDirection";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.selection.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NearbyPaymentDiscoverSelectDirection(selection=" + this.selection + ", flow_token=" + this.flow_token + ")";
    }
}
