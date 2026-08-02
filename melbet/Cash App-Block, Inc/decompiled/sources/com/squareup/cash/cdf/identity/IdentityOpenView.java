package com.squareup.cash.cdf.identity;

import com.google.mlkit.common.internal.zze;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class IdentityOpenView implements Event {
    public static final zze Companion = new zze(21);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE, EventDestination.BRAZE});
    public final String flow_token;
    public final Boolean is_entry_point_badged;
    public final LinkedHashMap parameters;
    public final ScreenType screen_type;
    public final Source source;

    public IdentityOpenView(String str, ScreenType screenType, Source source, Boolean bool) {
        this.flow_token = str;
        this.screen_type = screenType;
        this.source = source;
        this.is_entry_point_badged = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Identity", "cdf_action", "Open");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "screen_type", screenType);
        Countries.putSafe(m, "source", source);
        Countries.putSafe(m, "is_entry_point_badged", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityOpenView)) {
            return false;
        }
        IdentityOpenView identityOpenView = (IdentityOpenView) obj;
        return Intrinsics.areEqual(this.flow_token, identityOpenView.flow_token) && this.screen_type == identityOpenView.screen_type && this.source == identityOpenView.source && Intrinsics.areEqual(this.is_entry_point_badged, identityOpenView.is_entry_point_badged);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Identity Open View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ScreenType screenType = this.screen_type;
        int hashCode2 = (hashCode + (screenType == null ? 0 : screenType.hashCode())) * 31;
        Source source = this.source;
        int hashCode3 = (hashCode2 + (source == null ? 0 : source.hashCode())) * 31;
        Boolean bool = this.is_entry_point_badged;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "IdentityOpenView(flow_token=" + this.flow_token + ", screen_type=" + this.screen_type + ", source=" + this.source + ", is_entry_point_badged=" + this.is_entry_point_badged + ")";
    }

    public /* synthetic */ IdentityOpenView(String str, ScreenType screenType, int i) {
        this((i & 1) != 0 ? null : str, screenType, (i & 4) != 0 ? null : Source.SECURITY_HUB, (i & 8) != 0 ? null : Boolean.TRUE);
    }
}
