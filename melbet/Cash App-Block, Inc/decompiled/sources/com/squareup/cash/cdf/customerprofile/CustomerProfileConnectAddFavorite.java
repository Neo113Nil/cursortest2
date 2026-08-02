package com.squareup.cash.cdf.customerprofile;

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
public final class CustomerProfileConnectAddFavorite implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String app_message_token;
    public final Boolean contact_enabled;
    public final String favorited_customer_token;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final SuggestionStrategy suggestion_strategy;

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SuggestionStrategy {
        public static final /* synthetic */ SuggestionStrategy[] $VALUES;
        public static final SuggestionStrategy CONTACTS;
        public static final SuggestionStrategy SEARCH;
        public static final SuggestionStrategy SUGGESTED;

        static {
            SuggestionStrategy suggestionStrategy = new SuggestionStrategy("SEARCH", 0);
            SEARCH = suggestionStrategy;
            SuggestionStrategy suggestionStrategy2 = new SuggestionStrategy("SUGGESTED", 1);
            SUGGESTED = suggestionStrategy2;
            SuggestionStrategy suggestionStrategy3 = new SuggestionStrategy("CONTACTS", 2);
            CONTACTS = suggestionStrategy3;
            $VALUES = new SuggestionStrategy[]{suggestionStrategy, suggestionStrategy2, suggestionStrategy3};
        }

        public static SuggestionStrategy valueOf(String str) {
            return (SuggestionStrategy) Enum.valueOf(SuggestionStrategy.class, str);
        }

        public static SuggestionStrategy[] values() {
            return (SuggestionStrategy[]) $VALUES.clone();
        }
    }

    public CustomerProfileConnectAddFavorite(String str, String str2, Origin origin, Boolean bool, SuggestionStrategy suggestionStrategy) {
        this.favorited_customer_token = str;
        this.app_message_token = str2;
        this.origin = origin;
        this.contact_enabled = bool;
        this.suggestion_strategy = suggestionStrategy;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CustomerProfile", "cdf_action", "Connect");
        Countries.putSafe(m, "favorited_customer_token", str);
        Countries.putSafe(m, "app_message_token", str2);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "contact_enabled", bool);
        Countries.putSafe(m, "suggestion_strategy", suggestionStrategy);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileConnectAddFavorite)) {
            return false;
        }
        CustomerProfileConnectAddFavorite customerProfileConnectAddFavorite = (CustomerProfileConnectAddFavorite) obj;
        return Intrinsics.areEqual(this.favorited_customer_token, customerProfileConnectAddFavorite.favorited_customer_token) && Intrinsics.areEqual(this.app_message_token, customerProfileConnectAddFavorite.app_message_token) && this.origin == customerProfileConnectAddFavorite.origin && Intrinsics.areEqual(this.contact_enabled, customerProfileConnectAddFavorite.contact_enabled) && this.suggestion_strategy == customerProfileConnectAddFavorite.suggestion_strategy;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerProfile Connect AddFavorite";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.favorited_customer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.app_message_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode3 = (hashCode2 + (origin == null ? 0 : origin.hashCode())) * 31;
        Boolean bool = this.contact_enabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestion_strategy;
        return hashCode4 + (suggestionStrategy != null ? suggestionStrategy.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerProfileConnectAddFavorite(favorited_customer_token=", this.favorited_customer_token, ", app_message_token=", this.app_message_token, ", origin=");
        m.append(this.origin);
        m.append(", contact_enabled=");
        m.append(this.contact_enabled);
        m.append(", suggestion_strategy=");
        m.append(this.suggestion_strategy);
        m.append(")");
        return m.toString();
    }
}
