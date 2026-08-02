package com.squareup.cash.cdf.moneybothome;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class MoneybotHomeBrowseViewPage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EntryPointSurface entry_point;
    public final Gesture gesture;
    public final String home_session_id;
    public final LinkedHashMap parameters;

    public MoneybotHomeBrowseViewPage(String str, EntryPointSurface entryPointSurface, Gesture gesture) {
        this.home_session_id = str;
        this.entry_point = entryPointSurface;
        this.gesture = gesture;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "MoneybotHome", "cdf_action", "Browse");
        Countries.putSafe(m, "home_session_id", str);
        Countries.putSafe(m, "entry_point", entryPointSurface);
        Countries.putSafe(m, "gesture", gesture);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotHomeBrowseViewPage)) {
            return false;
        }
        MoneybotHomeBrowseViewPage moneybotHomeBrowseViewPage = (MoneybotHomeBrowseViewPage) obj;
        return this.home_session_id.equals(moneybotHomeBrowseViewPage.home_session_id) && this.entry_point == moneybotHomeBrowseViewPage.entry_point && this.gesture == moneybotHomeBrowseViewPage.gesture;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MoneybotHome Browse ViewPage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.home_session_id.hashCode() * 31;
        EntryPointSurface entryPointSurface = this.entry_point;
        return this.gesture.hashCode() + ((hashCode + (entryPointSurface == null ? 0 : entryPointSurface.hashCode())) * 31);
    }

    public final String toString() {
        return "MoneybotHomeBrowseViewPage(home_session_id=" + this.home_session_id + ", entry_point=" + this.entry_point + ", gesture=" + this.gesture + ")";
    }
}
