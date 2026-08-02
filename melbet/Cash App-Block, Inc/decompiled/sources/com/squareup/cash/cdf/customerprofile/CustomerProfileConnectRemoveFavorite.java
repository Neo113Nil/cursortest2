package com.squareup.cash.cdf.customerprofile;

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
public final class CustomerProfileConnectRemoveFavorite implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String favorited_customer_token;
    public final Origin origin;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Origin {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Origin CUSTOMER_PROFILE;
        public static final Origin FAVORITES_MANAGEMENT;

        static {
            Origin origin = new Origin("CUSTOMER_PROFILE", 0);
            CUSTOMER_PROFILE = origin;
            Origin origin2 = new Origin("FAVORITES_MANAGEMENT", 1);
            FAVORITES_MANAGEMENT = origin2;
            $VALUES = new Origin[]{origin, origin2};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public CustomerProfileConnectRemoveFavorite(String str, Origin origin) {
        this.favorited_customer_token = str;
        this.origin = origin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerProfile", "cdf_action", "Connect");
        Countries.putSafe(m, "favorited_customer_token", str);
        Countries.putSafe(m, "origin", origin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileConnectRemoveFavorite)) {
            return false;
        }
        CustomerProfileConnectRemoveFavorite customerProfileConnectRemoveFavorite = (CustomerProfileConnectRemoveFavorite) obj;
        return Intrinsics.areEqual(this.favorited_customer_token, customerProfileConnectRemoveFavorite.favorited_customer_token) && this.origin == customerProfileConnectRemoveFavorite.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerProfile Connect RemoveFavorite";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.favorited_customer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Origin origin = this.origin;
        return hashCode + (origin != null ? origin.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerProfileConnectRemoveFavorite(favorited_customer_token=" + this.favorited_customer_token + ", origin=" + this.origin + ")";
    }
}
