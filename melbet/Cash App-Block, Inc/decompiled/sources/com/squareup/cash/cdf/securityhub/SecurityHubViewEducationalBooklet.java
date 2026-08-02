package com.squareup.cash.cdf.securityhub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SecurityHubViewEducationalBooklet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final BookletType booklet_type;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class BookletType {
        public static final /* synthetic */ BookletType[] $VALUES;
        public static final BookletType BUILT_IN_PROTECTIONS;
        public static final BookletType COMMON_SCAMS;
        public static final BookletType PREVENT_FRAUD;
        public static final BookletType SECURITY_FEATURES;
        public static final BookletType SPOT_SCAMS;

        static {
            BookletType bookletType = new BookletType("BUILT_IN_PROTECTIONS", 0);
            BUILT_IN_PROTECTIONS = bookletType;
            BookletType bookletType2 = new BookletType("COMMON_SCAMS", 1);
            COMMON_SCAMS = bookletType2;
            BookletType bookletType3 = new BookletType("SPOT_SCAMS", 2);
            SPOT_SCAMS = bookletType3;
            BookletType bookletType4 = new BookletType("PREVENT_FRAUD", 3);
            PREVENT_FRAUD = bookletType4;
            BookletType bookletType5 = new BookletType("SECURITY_FEATURES", 4);
            SECURITY_FEATURES = bookletType5;
            $VALUES = new BookletType[]{bookletType, bookletType2, bookletType3, bookletType4, bookletType5};
        }

        public static BookletType valueOf(String str) {
            return (BookletType) Enum.valueOf(BookletType.class, str);
        }

        public static BookletType[] values() {
            return (BookletType[]) $VALUES.clone();
        }
    }

    public SecurityHubViewEducationalBooklet(BookletType bookletType) {
        this.booklet_type = bookletType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SecurityHub", "cdf_action", "View");
        Countries.putSafe(m, "booklet_type", bookletType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityHubViewEducationalBooklet) && this.booklet_type == ((SecurityHubViewEducationalBooklet) obj).booklet_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SecurityHub View EducationalBooklet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.booklet_type.hashCode();
    }

    public final String toString() {
        return "SecurityHubViewEducationalBooklet(booklet_type=" + this.booklet_type + ")";
    }
}
