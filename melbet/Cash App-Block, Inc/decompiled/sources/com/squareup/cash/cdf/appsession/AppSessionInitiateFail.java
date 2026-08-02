package com.squareup.cash.cdf.appsession;

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
public final class AppSessionInitiateFail implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer http_error_code;
    public final Boolean is_network_failure;
    public final LinkedHashMap parameters;

    public AppSessionInitiateFail(Integer num, Boolean bool) {
        this.http_error_code = num;
        this.is_network_failure = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "AppSession", "cdf_action", "Initiate");
        Countries.putSafe(m, "http_error_code", num);
        Countries.putSafe(m, "is_network_failure", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSessionInitiateFail)) {
            return false;
        }
        AppSessionInitiateFail appSessionInitiateFail = (AppSessionInitiateFail) obj;
        return Intrinsics.areEqual(this.http_error_code, appSessionInitiateFail.http_error_code) && Intrinsics.areEqual(this.is_network_failure, appSessionInitiateFail.is_network_failure);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppSession Initiate Fail";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.http_error_code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.is_network_failure;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AppSessionInitiateFail(http_error_code=" + this.http_error_code + ", is_network_failure=" + this.is_network_failure + ")";
    }

    public /* synthetic */ AppSessionInitiateFail() {
        this(null, Boolean.FALSE);
    }
}
