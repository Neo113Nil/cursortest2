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
public final class DirectDepositAccountViewStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AppLocation app_location;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AppLocation {
        public static final /* synthetic */ AppLocation[] $VALUES;
        public static final AppLocation FORM_BLOCKER;
        public static final AppLocation SETUP_DIRECT_DEPOSIT;

        /* JADX INFO: Fake field, exist only in values array */
        AppLocation EF0;

        static {
            AppLocation appLocation = new AppLocation("BANKING_TAB_SHEET", 0);
            AppLocation appLocation2 = new AppLocation("FORM_BLOCKER", 1);
            FORM_BLOCKER = appLocation2;
            AppLocation appLocation3 = new AppLocation("RECURRING_DEPOSITS", 2);
            AppLocation appLocation4 = new AppLocation("SETUP_DIRECT_DEPOSIT", 3);
            SETUP_DIRECT_DEPOSIT = appLocation4;
            $VALUES = new AppLocation[]{appLocation, appLocation2, appLocation3, appLocation4};
        }

        public static AppLocation valueOf(String str) {
            return (AppLocation) Enum.valueOf(AppLocation.class, str);
        }

        public static AppLocation[] values() {
            return (AppLocation[]) $VALUES.clone();
        }
    }

    public DirectDepositAccountViewStart(AppLocation appLocation) {
        this.app_location = appLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "DirectDepositAccount", "cdf_action", "View");
        Countries.putSafe(m, "app_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectDepositAccountViewStart) && this.app_location == ((DirectDepositAccountViewStart) obj).app_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DirectDepositAccount View Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.app_location.hashCode();
    }

    public final String toString() {
        return "DirectDepositAccountViewStart(app_location=" + this.app_location + ")";
    }
}
