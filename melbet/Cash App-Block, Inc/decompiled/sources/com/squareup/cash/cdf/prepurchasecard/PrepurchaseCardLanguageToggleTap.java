package com.squareup.cash.cdf.prepurchasecard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PrepurchaseCardLanguageToggleTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String selected_locale;
    public final Surface surface;

    public PrepurchaseCardLanguageToggleTap(String str, Surface surface) {
        this.selected_locale = str;
        this.surface = surface;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PrepurchaseCard", "cdf_action", "LanguageToggle");
        Countries.putSafe(m, "selected_locale", str);
        Countries.putSafe(m, "surface", surface);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCardLanguageToggleTap)) {
            return false;
        }
        PrepurchaseCardLanguageToggleTap prepurchaseCardLanguageToggleTap = (PrepurchaseCardLanguageToggleTap) obj;
        return Intrinsics.areEqual(this.selected_locale, prepurchaseCardLanguageToggleTap.selected_locale) && this.surface == prepurchaseCardLanguageToggleTap.surface;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PrepurchaseCard LanguageToggle Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.selected_locale;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Surface surface = this.surface;
        return hashCode + (surface != null ? surface.hashCode() : 0);
    }

    public final String toString() {
        return "PrepurchaseCardLanguageToggleTap(selected_locale=" + this.selected_locale + ", surface=" + this.surface + ")";
    }
}
