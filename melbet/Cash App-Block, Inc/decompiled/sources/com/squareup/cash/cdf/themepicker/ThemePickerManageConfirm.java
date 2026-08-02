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
public final class ThemePickerManageConfirm implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer index;
    public final LinkedHashMap parameters;
    public final Theme theme;

    public ThemePickerManageConfirm(Theme theme, Integer num) {
        this.theme = theme;
        this.index = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ThemePicker", "cdf_action", "Manage");
        Countries.putSafe(m, "theme", theme);
        Countries.putSafe(m, "index", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemePickerManageConfirm)) {
            return false;
        }
        ThemePickerManageConfirm themePickerManageConfirm = (ThemePickerManageConfirm) obj;
        return this.theme == themePickerManageConfirm.theme && this.index.equals(themePickerManageConfirm.index);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ThemePicker Manage Confirm";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.index.hashCode() + (this.theme.hashCode() * 31);
    }

    public final String toString() {
        return "ThemePickerManageConfirm(theme=" + this.theme + ", index=" + this.index + ")";
    }
}
