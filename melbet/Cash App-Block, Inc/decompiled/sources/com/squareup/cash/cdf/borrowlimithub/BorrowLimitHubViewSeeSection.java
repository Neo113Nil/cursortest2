package com.squareup.cash.cdf.borrowlimithub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BorrowLimitHubViewSeeSection implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final SectionType source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SectionType {
        public static final /* synthetic */ SectionType[] $VALUES;
        public static final SectionType DISCLAIMER;
        public static final SectionType INCREASE_LIMIT_ACTIONS;
        public static final SectionType LIMIT_INFO_BULLETS;
        public static final SectionType LIMIT_PROGRESS;

        static {
            SectionType sectionType = new SectionType("LIMIT_PROGRESS", 0);
            LIMIT_PROGRESS = sectionType;
            SectionType sectionType2 = new SectionType("INCREASE_LIMIT_ACTIONS", 1);
            INCREASE_LIMIT_ACTIONS = sectionType2;
            SectionType sectionType3 = new SectionType("LIMIT_INFO_BULLETS", 2);
            LIMIT_INFO_BULLETS = sectionType3;
            SectionType sectionType4 = new SectionType("DISCLAIMER", 3);
            DISCLAIMER = sectionType4;
            $VALUES = new SectionType[]{sectionType, sectionType2, sectionType3, sectionType4};
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
        }
    }

    public BorrowLimitHubViewSeeSection(SectionType sectionType) {
        this.source = sectionType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BorrowLimitHub", "cdf_action", "View");
        Countries.putSafe(m, "source", sectionType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubViewSeeSection) && this.source == ((BorrowLimitHubViewSeeSection) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowLimitHub View SeeSection";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "BorrowLimitHubViewSeeSection(source=" + this.source + ")";
    }
}
