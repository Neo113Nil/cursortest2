package com.squareup.cash.cdf.boost;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BoostAddSelect implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AppLocation app_location;
    public final AppPresentation app_presentation;
    public final String boost_flow_token;
    public final String boost_token;
    public final Integer column;
    public final String current_boost_token;
    public final String flow_token;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final Integer row;

    public BoostAddSelect(AppLocation appLocation, Origin origin, String str, String str2, String str3, String str4, String str5, AppPresentation appPresentation, Integer num, Integer num2) {
        this.app_location = appLocation;
        this.origin = origin;
        this.boost_token = str;
        this.flow_token = str2;
        this.boost_flow_token = str3;
        this.referrer_flow_token = str4;
        this.current_boost_token = str5;
        this.app_presentation = appPresentation;
        this.row = num;
        this.column = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "Boost", "cdf_action", "Add");
        Countries.putSafe(m, "app_location", appLocation);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "boost_token", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "boost_flow_token", str3);
        Countries.putSafe(m, "referrer_flow_token", str4);
        Countries.putSafe(m, "current_boost_token", str5);
        Countries.putSafe(m, "app_presentation", appPresentation);
        Countries.putSafe(m, "row", num);
        Countries.putSafe(m, "column", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostAddSelect)) {
            return false;
        }
        BoostAddSelect boostAddSelect = (BoostAddSelect) obj;
        return this.app_location == boostAddSelect.app_location && this.origin == boostAddSelect.origin && Intrinsics.areEqual(this.boost_token, boostAddSelect.boost_token) && Intrinsics.areEqual(this.flow_token, boostAddSelect.flow_token) && this.boost_flow_token.equals(boostAddSelect.boost_flow_token) && Intrinsics.areEqual(this.referrer_flow_token, boostAddSelect.referrer_flow_token) && Intrinsics.areEqual(this.current_boost_token, boostAddSelect.current_boost_token) && this.app_presentation == boostAddSelect.app_presentation && Intrinsics.areEqual(this.row, boostAddSelect.row) && Intrinsics.areEqual(this.column, boostAddSelect.column);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Boost Add Select";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.app_location.hashCode() * 31;
        Origin origin = this.origin;
        int hashCode2 = (hashCode + (origin == null ? 0 : origin.hashCode())) * 31;
        String str = this.boost_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961, 31, this.boost_flow_token);
        String str3 = this.referrer_flow_token;
        int hashCode4 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.current_boost_token;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppPresentation appPresentation = this.app_presentation;
        int hashCode6 = (hashCode5 + (appPresentation == null ? 0 : appPresentation.hashCode())) * 31;
        Integer num = this.row;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.column;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoostAddSelect(app_location=");
        sb.append(this.app_location);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", boost_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.boost_token, ", flow_token=", this.flow_token, ", profile_directory_flow_token=null, boost_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.boost_flow_token, ", referrer_flow_token=", this.referrer_flow_token, ", current_boost_token=");
        sb.append(this.current_boost_token);
        sb.append(", app_presentation=");
        sb.append(this.app_presentation);
        sb.append(", row=");
        sb.append(this.row);
        sb.append(", column=");
        sb.append(this.column);
        sb.append(")");
        return sb.toString();
    }
}
