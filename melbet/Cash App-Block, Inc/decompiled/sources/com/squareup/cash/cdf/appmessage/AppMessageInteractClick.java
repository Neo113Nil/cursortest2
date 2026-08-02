package com.squareup.cash.cdf.appmessage;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AppMessageFormat;
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
public final class AppMessageInteractClick implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long clicked_at;
    public final String external_id;

    /* renamed from: format, reason: collision with root package name */
    public final AppMessageFormat f1067format;
    public final String message_token;
    public final LinkedHashMap parameters;
    public final String url_opened;

    public AppMessageInteractClick(Long l, String str, AppMessageFormat appMessageFormat, String str2, String str3, int i) {
        l = (i & 1) != 0 ? null : l;
        str = (i & 4) != 0 ? null : str;
        str3 = (i & 32) != 0 ? null : str3;
        this.clicked_at = l;
        this.external_id = str;
        this.f1067format = appMessageFormat;
        this.message_token = str2;
        this.url_opened = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "AppMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "clicked_at", l);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "format", appMessageFormat);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "url_opened", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMessageInteractClick)) {
            return false;
        }
        AppMessageInteractClick appMessageInteractClick = (AppMessageInteractClick) obj;
        return Intrinsics.areEqual(this.clicked_at, appMessageInteractClick.clicked_at) && Intrinsics.areEqual(this.external_id, appMessageInteractClick.external_id) && this.f1067format == appMessageInteractClick.f1067format && Intrinsics.areEqual(this.message_token, appMessageInteractClick.message_token) && Intrinsics.areEqual(this.url_opened, appMessageInteractClick.url_opened);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppMessage Interact Click";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Long l = this.clicked_at;
        int hashCode = (l == null ? 0 : l.hashCode()) * 961;
        String str = this.external_id;
        int hashCode2 = (this.f1067format.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.message_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url_opened;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMessageInteractClick(clicked_at=");
        sb.append(this.clicked_at);
        sb.append(", customer_token=null, external_id=");
        sb.append(this.external_id);
        sb.append(", format=");
        sb.append(this.f1067format);
        sb.append(", message_token=");
        sb.append(this.message_token);
        sb.append(", url_opened=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.url_opened, ")");
    }
}
