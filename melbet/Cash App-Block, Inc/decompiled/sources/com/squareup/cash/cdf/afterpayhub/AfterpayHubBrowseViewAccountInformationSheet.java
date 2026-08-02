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
public final class AfterpayHubBrowseViewAccountInformationSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Information info;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Information {
        public static final /* synthetic */ Information[] $VALUES;
        public static final Information AvailableCredit;
        public static final Information TotalOwed;

        static {
            Information information = new Information("AvailableCredit", 0);
            AvailableCredit = information;
            Information information2 = new Information("TotalOwed", 1);
            TotalOwed = information2;
            $VALUES = new Information[]{information, information2};
        }

        public static Information valueOf(String str) {
            return (Information) Enum.valueOf(Information.class, str);
        }

        public static Information[] values() {
            return (Information[]) $VALUES.clone();
        }
    }

    public AfterpayHubBrowseViewAccountInformationSheet(Information information) {
        this.info = information;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "AfterpayHub", "cdf_action", "Browse");
        Countries.putSafe(m, "info", information);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayHubBrowseViewAccountInformationSheet) && this.info == ((AfterpayHubBrowseViewAccountInformationSheet) obj).info;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayHub Browse ViewAccountInformationSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.info.hashCode();
    }

    public final String toString() {
        return "AfterpayHubBrowseViewAccountInformationSheet(info=" + this.info + ")";
    }
}
