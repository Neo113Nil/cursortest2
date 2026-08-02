package com.squareup.cash.cdf.themepicker;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ThemePickerManageView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final SourceLocation source;

    public ThemePickerManageView(SourceLocation sourceLocation) {
        this.source = sourceLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "ThemePicker", "cdf_action", "Manage");
        Countries.putSafe(m, "source", sourceLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThemePickerManageView) && this.source == ((ThemePickerManageView) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ThemePicker Manage View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "ThemePickerManageView(source=" + this.source + ")";
    }
}
