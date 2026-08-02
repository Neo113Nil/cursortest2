package com.squareup.cash.cdf.appmessage;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppMessageInteractView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;

    /* renamed from: format, reason: collision with root package name */
    public final AppMessageFormat f1068format;
    public final String message_token;
    public final LinkedHashMap parameters;
    public final Long viewed_at;

    public AppMessageInteractView(String str, AppMessageFormat appMessageFormat, String str2, Long l, int i) {
        str = (i & 2) != 0 ? null : str;
        l = (i & 16) != 0 ? null : l;
        this.external_id = str;
        this.f1068format = appMessageFormat;
        this.message_token = str2;
        this.viewed_at = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "AppMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "format", appMessageFormat);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "viewed_at", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMessageInteractView)) {
            return false;
        }
        AppMessageInteractView appMessageInteractView = (AppMessageInteractView) obj;
        return Intrinsics.areEqual(this.external_id, appMessageInteractView.external_id) && this.f1068format == appMessageInteractView.f1068format && Intrinsics.areEqual(this.message_token, appMessageInteractView.message_token) && Intrinsics.areEqual(this.viewed_at, appMessageInteractView.viewed_at);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppMessage Interact View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (this.f1068format.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.message_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.viewed_at;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AppMessageInteractView(customer_token=null, external_id=" + this.external_id + ", format=" + this.f1068format + ", message_token=" + this.message_token + ", viewed_at=" + this.viewed_at + ")";
    }
}
