package com.squareup.cash.cdf.personalprofile;

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
public final class PersonalProfileManageUpgradeToBusiness implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_upgrade_flow_token;
    public final UpgradeToBusinessEntrypoint entry_point;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UpgradeToBusinessEntrypoint {
        public static final /* synthetic */ UpgradeToBusinessEntrypoint[] $VALUES;
        public static final UpgradeToBusinessEntrypoint ACCOUNT_INFO_SETTING;
        public static final UpgradeToBusinessEntrypoint PROFILE;

        static {
            UpgradeToBusinessEntrypoint upgradeToBusinessEntrypoint = new UpgradeToBusinessEntrypoint("PROFILE", 0);
            PROFILE = upgradeToBusinessEntrypoint;
            UpgradeToBusinessEntrypoint upgradeToBusinessEntrypoint2 = new UpgradeToBusinessEntrypoint("ACCOUNT_INFO_SETTING", 1);
            ACCOUNT_INFO_SETTING = upgradeToBusinessEntrypoint2;
            $VALUES = new UpgradeToBusinessEntrypoint[]{upgradeToBusinessEntrypoint, upgradeToBusinessEntrypoint2};
        }

        public static UpgradeToBusinessEntrypoint valueOf(String str) {
            return (UpgradeToBusinessEntrypoint) Enum.valueOf(UpgradeToBusinessEntrypoint.class, str);
        }

        public static UpgradeToBusinessEntrypoint[] values() {
            return (UpgradeToBusinessEntrypoint[]) $VALUES.clone();
        }
    }

    public PersonalProfileManageUpgradeToBusiness(UpgradeToBusinessEntrypoint upgradeToBusinessEntrypoint, String str) {
        this.entry_point = upgradeToBusinessEntrypoint;
        this.business_upgrade_flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "Manage");
        Countries.putSafe(m, "entry_point", upgradeToBusinessEntrypoint);
        Countries.putSafe(m, "business_upgrade_flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileManageUpgradeToBusiness)) {
            return false;
        }
        PersonalProfileManageUpgradeToBusiness personalProfileManageUpgradeToBusiness = (PersonalProfileManageUpgradeToBusiness) obj;
        return this.entry_point == personalProfileManageUpgradeToBusiness.entry_point && Intrinsics.areEqual(this.business_upgrade_flow_token, personalProfileManageUpgradeToBusiness.business_upgrade_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile Manage UpgradeToBusiness";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.entry_point.hashCode() * 31;
        String str = this.business_upgrade_flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PersonalProfileManageUpgradeToBusiness(entry_point=" + this.entry_point + ", business_upgrade_flow_token=" + this.business_upgrade_flow_token + ")";
    }
}
