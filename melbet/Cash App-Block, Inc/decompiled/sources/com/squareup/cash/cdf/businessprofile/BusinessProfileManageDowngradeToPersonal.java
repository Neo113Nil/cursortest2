package com.squareup.cash.cdf.businessprofile;

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
public final class BusinessProfileManageDowngradeToPersonal implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_downgrade_flow_token;
    public final DowngradeToPersonalEntrypoint entry_point;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DowngradeToPersonalEntrypoint {
        public static final /* synthetic */ DowngradeToPersonalEntrypoint[] $VALUES;
        public static final DowngradeToPersonalEntrypoint BUSINESS_INFO;
        public static final DowngradeToPersonalEntrypoint EDIT_PROFILE;
        public static final DowngradeToPersonalEntrypoint PERSONAL;

        static {
            DowngradeToPersonalEntrypoint downgradeToPersonalEntrypoint = new DowngradeToPersonalEntrypoint("EDIT_PROFILE", 0);
            EDIT_PROFILE = downgradeToPersonalEntrypoint;
            DowngradeToPersonalEntrypoint downgradeToPersonalEntrypoint2 = new DowngradeToPersonalEntrypoint("PERSONAL", 1);
            PERSONAL = downgradeToPersonalEntrypoint2;
            DowngradeToPersonalEntrypoint downgradeToPersonalEntrypoint3 = new DowngradeToPersonalEntrypoint("BUSINESS_INFO", 2);
            BUSINESS_INFO = downgradeToPersonalEntrypoint3;
            $VALUES = new DowngradeToPersonalEntrypoint[]{downgradeToPersonalEntrypoint, downgradeToPersonalEntrypoint2, downgradeToPersonalEntrypoint3};
        }

        public static DowngradeToPersonalEntrypoint valueOf(String str) {
            return (DowngradeToPersonalEntrypoint) Enum.valueOf(DowngradeToPersonalEntrypoint.class, str);
        }

        public static DowngradeToPersonalEntrypoint[] values() {
            return (DowngradeToPersonalEntrypoint[]) $VALUES.clone();
        }
    }

    public BusinessProfileManageDowngradeToPersonal(DowngradeToPersonalEntrypoint downgradeToPersonalEntrypoint, String str) {
        this.entry_point = downgradeToPersonalEntrypoint;
        this.business_downgrade_flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BusinessProfile", "cdf_action", "Manage");
        Countries.putSafe(m, "entry_point", downgradeToPersonalEntrypoint);
        Countries.putSafe(m, "business_downgrade_flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessProfileManageDowngradeToPersonal)) {
            return false;
        }
        BusinessProfileManageDowngradeToPersonal businessProfileManageDowngradeToPersonal = (BusinessProfileManageDowngradeToPersonal) obj;
        return this.entry_point == businessProfileManageDowngradeToPersonal.entry_point && Intrinsics.areEqual(this.business_downgrade_flow_token, businessProfileManageDowngradeToPersonal.business_downgrade_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BusinessProfile Manage DowngradeToPersonal";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.entry_point.hashCode() * 31;
        String str = this.business_downgrade_flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BusinessProfileManageDowngradeToPersonal(entry_point=" + this.entry_point + ", business_downgrade_flow_token=" + this.business_downgrade_flow_token + ")";
    }
}
