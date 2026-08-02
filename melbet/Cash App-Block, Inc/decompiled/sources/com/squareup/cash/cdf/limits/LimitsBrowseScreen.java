package com.squareup.cash.cdf.limits;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LimitsBrowseScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final ScreenType screen_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ScreenType {
        public static final /* synthetic */ ScreenType[] $VALUES;
        public static final ScreenType GROUPED_LIMITS;
        public static final ScreenType LIMITS;

        static {
            ScreenType screenType = new ScreenType("LIMITS", 0);
            LIMITS = screenType;
            ScreenType screenType2 = new ScreenType("GROUPED_LIMITS", 1);
            GROUPED_LIMITS = screenType2;
            $VALUES = new ScreenType[]{screenType, screenType2};
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    public LimitsBrowseScreen(ScreenType screenType) {
        this.screen_type = screenType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Limits", "cdf_action", "Browse");
        Countries.putSafe(m, "screen_type", screenType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LimitsBrowseScreen) && this.screen_type == ((LimitsBrowseScreen) obj).screen_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Limits Browse Screen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ScreenType screenType = this.screen_type;
        return (screenType == null ? 0 : screenType.hashCode()) * 31;
    }

    public final String toString() {
        return "LimitsBrowseScreen(screen_type=" + this.screen_type + ", flow_token=null)";
    }
}
