package com.squareup.cash.cdf.performance;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PerformanceMeasureScrollPerformance implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Element element;
    public final LinkedHashMap parameters;
    public final Long scroll_duration_ms;
    public final Integer scroll_hitch_time_ratio;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Element {
        public static final /* synthetic */ Element[] $VALUES;
        public static final Element ACTIVITY_MAIN;
        public static final Element INVESTING_BITCOIN_MAIN;
        public static final Element INVESTING_EQUITY_DETAILS;
        public static final Element INVESTING_EQUITY_MAIN;
        public static final Element MONEY_MAIN;

        static {
            Element element = new Element("ACTIVITY_MAIN", 0);
            ACTIVITY_MAIN = element;
            Element element2 = new Element("BANKING_MAIN", 1);
            Element element3 = new Element("INVESTING_BITCOIN_MAIN", 2);
            INVESTING_BITCOIN_MAIN = element3;
            Element element4 = new Element("INVESTING_EQUITY_MAIN", 3);
            INVESTING_EQUITY_MAIN = element4;
            Element element5 = new Element("INVESTING_EQUITY_DETAILS", 4);
            INVESTING_EQUITY_DETAILS = element5;
            Element element6 = new Element("PROFILE_DIRECTORY_MAIN", 5);
            Element element7 = new Element("PROFILE_DIRECTORY_SECTION_LIST", 6);
            Element element8 = new Element("RECIPIENTS_LIST", 7);
            Element element9 = new Element("MONEY_MAIN", 8);
            MONEY_MAIN = element9;
            $VALUES = new Element[]{element, element2, element3, element4, element5, element6, element7, element8, element9, new Element("NEIGHBORHOODS_BRAND_MENU", 9)};
        }

        public static Element valueOf(String str) {
            return (Element) Enum.valueOf(Element.class, str);
        }

        public static Element[] values() {
            return (Element[]) $VALUES.clone();
        }
    }

    public PerformanceMeasureScrollPerformance(Element element, Long l, Integer num) {
        this.element = element;
        this.scroll_duration_ms = l;
        this.scroll_hitch_time_ratio = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Performance", "cdf_action", "Measure");
        Countries.putSafe(m, "element", element);
        Countries.putSafe(m, "scroll_duration_ms", l);
        Countries.putSafe(m, "scroll_hitch_time_ratio", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMeasureScrollPerformance)) {
            return false;
        }
        PerformanceMeasureScrollPerformance performanceMeasureScrollPerformance = (PerformanceMeasureScrollPerformance) obj;
        return this.element == performanceMeasureScrollPerformance.element && this.scroll_duration_ms.equals(performanceMeasureScrollPerformance.scroll_duration_ms) && this.scroll_hitch_time_ratio.equals(performanceMeasureScrollPerformance.scroll_hitch_time_ratio);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Performance Measure ScrollPerformance";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Element element = this.element;
        return this.scroll_hitch_time_ratio.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.scroll_duration_ms, (element == null ? 0 : element.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformanceMeasureScrollPerformance(element=");
        sb.append(this.element);
        sb.append(", scroll_duration_ms=");
        sb.append(this.scroll_duration_ms);
        sb.append(", scroll_hitch_time_ratio=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.scroll_hitch_time_ratio, ")");
    }
}
