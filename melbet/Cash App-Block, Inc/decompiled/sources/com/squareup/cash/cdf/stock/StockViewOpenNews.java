package com.squareup.cash.cdf.stock;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class StockViewOpenNews implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Location location;
    public final String news_type;
    public final LinkedHashMap parameters;
    public final Integer position_in_list;
    public final String source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Location {
        public static final /* synthetic */ Location[] $VALUES;
        public static final Location CAROUSEL;
        public static final Location LIST;

        static {
            Location location = new Location("CAROUSEL", 0);
            CAROUSEL = location;
            Location location2 = new Location("LIST", 1);
            LIST = location2;
            $VALUES = new Location[]{location, location2};
        }

        public static Location valueOf(String str) {
            return (Location) Enum.valueOf(Location.class, str);
        }

        public static Location[] values() {
            return (Location[]) $VALUES.clone();
        }
    }

    public StockViewOpenNews(Location location, String str, Integer num, String str2) {
        this.location = location;
        this.news_type = str;
        this.position_in_list = num;
        this.source = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Stock", "cdf_action", "View");
        Countries.putSafe(m, "location", location);
        Countries.putSafe(m, "news_type", str);
        Countries.putSafe(m, "position_in_list", num);
        Countries.putSafe(m, "source", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockViewOpenNews)) {
            return false;
        }
        StockViewOpenNews stockViewOpenNews = (StockViewOpenNews) obj;
        return this.location == stockViewOpenNews.location && this.news_type.equals(stockViewOpenNews.news_type) && this.position_in_list.equals(stockViewOpenNews.position_in_list) && Intrinsics.areEqual(this.source, stockViewOpenNews.source);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock View OpenNews";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.location.hashCode() * 31, 31, this.news_type), 31, this.position_in_list);
        String str = this.source;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StockViewOpenNews(location=" + this.location + ", news_type=" + this.news_type + ", position_in_list=" + this.position_in_list + ", source=" + this.source + ")";
    }
}
