package com.squareup.cash.cdf.booklet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BookletInteractScroll implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String content_token;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public BookletInteractScroll(String str, String str2, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        this.content_token = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Booklet", "cdf_action", "Interact");
        Countries.putSafe(m, "content_token", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookletInteractScroll)) {
            return false;
        }
        BookletInteractScroll bookletInteractScroll = (BookletInteractScroll) obj;
        return Intrinsics.areEqual(this.content_token, bookletInteractScroll.content_token) && Intrinsics.areEqual(this.flow_token, bookletInteractScroll.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Booklet Interact Scroll";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.content_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BookletInteractScroll(content_token=", this.content_token, ", flow_token=", this.flow_token, ", referrer_flow_token=null)");
    }
}
