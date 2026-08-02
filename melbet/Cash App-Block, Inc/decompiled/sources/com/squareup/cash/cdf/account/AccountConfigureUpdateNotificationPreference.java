package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountConfigureUpdateNotificationPreference implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final Boolean enabled;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class AliasType {
        public static final /* synthetic */ AliasType[] $VALUES;
        public static final AliasType APP;
        public static final AliasType EMAIL;
        public static final AliasType SMS;

        static {
            AliasType aliasType = new AliasType("SMS", 0);
            SMS = aliasType;
            AliasType aliasType2 = new AliasType("EMAIL", 1);
            EMAIL = aliasType2;
            AliasType aliasType3 = new AliasType("APP", 2);
            APP = aliasType3;
            $VALUES = new AliasType[]{aliasType, aliasType2, aliasType3, new AliasType("STOCK", 3), new AliasType("BITCOIN", 4)};
        }

        public static AliasType valueOf(String str) {
            return (AliasType) Enum.valueOf(AliasType.class, str);
        }

        public static AliasType[] values() {
            return (AliasType[]) $VALUES.clone();
        }
    }

    public AccountConfigureUpdateNotificationPreference(AliasType aliasType, Boolean bool) {
        this.alias_type = aliasType;
        this.enabled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "Configure");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "enabled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountConfigureUpdateNotificationPreference)) {
            return false;
        }
        AccountConfigureUpdateNotificationPreference accountConfigureUpdateNotificationPreference = (AccountConfigureUpdateNotificationPreference) obj;
        return this.alias_type == accountConfigureUpdateNotificationPreference.alias_type && this.enabled.equals(accountConfigureUpdateNotificationPreference.enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Configure UpdateNotificationPreference";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AliasType aliasType = this.alias_type;
        return this.enabled.hashCode() + ((aliasType == null ? 0 : aliasType.hashCode()) * 31);
    }

    public final String toString() {
        return "AccountConfigureUpdateNotificationPreference(alias_type=" + this.alias_type + ", enabled=" + this.enabled + ")";
    }
}
