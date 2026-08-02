package com.squareup.cash.cdf.afterpayhub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AfterpayHubBrowseStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AppLocation app_location;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AppLocation {
        public static final /* synthetic */ AppLocation[] $VALUES;
        public static final AppLocation ActivityTab;
        public static final AppLocation OrderDetails;

        static {
            AppLocation appLocation = new AppLocation("ActivityTab", 0);
            ActivityTab = appLocation;
            AppLocation appLocation2 = new AppLocation("OrderDetails", 1);
            OrderDetails = appLocation2;
            $VALUES = new AppLocation[]{appLocation, appLocation2};
        }

        public static AppLocation valueOf(String str) {
            return (AppLocation) Enum.valueOf(AppLocation.class, str);
        }

        public static AppLocation[] values() {
            return (AppLocation[]) $VALUES.clone();
        }
    }

    public AfterpayHubBrowseStart(AppLocation appLocation) {
        this.app_location = appLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "AfterpayHub", "cdf_action", "Browse");
        Countries.putSafe(m, "app_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayHubBrowseStart) && this.app_location == ((AfterpayHubBrowseStart) obj).app_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayHub Browse Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AppLocation appLocation = this.app_location;
        if (appLocation == null) {
            return 0;
        }
        return appLocation.hashCode();
    }

    public final String toString() {
        return "AfterpayHubBrowseStart(app_location=" + this.app_location + ")";
    }
}
