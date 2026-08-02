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
public final class AppMessageInteractTapShareButton implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String message_token;
    public final LinkedHashMap parameters;

    public AppMessageInteractTapShareButton(String str, String str2) {
        AppMessageFormat appMessageFormat = AppMessageFormat.HALF_SHEET;
        this.external_id = str;
        this.message_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "AppMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "format", appMessageFormat);
        Countries.putSafe(m, "message_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMessageInteractTapShareButton)) {
            return false;
        }
        AppMessageInteractTapShareButton appMessageInteractTapShareButton = (AppMessageInteractTapShareButton) obj;
        if (!Intrinsics.areEqual(this.external_id, appMessageInteractTapShareButton.external_id)) {
            return false;
        }
        AppMessageFormat appMessageFormat = AppMessageFormat.FULL_SCREEN;
        return Intrinsics.areEqual(this.message_token, appMessageInteractTapShareButton.message_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppMessage Interact TapShareButton";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (AppMessageFormat.HALF_SHEET.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.message_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        AppMessageFormat appMessageFormat = AppMessageFormat.HALF_SHEET;
        StringBuilder sb = new StringBuilder("AppMessageInteractTapShareButton(external_id=");
        sb.append(this.external_id);
        sb.append(", format=");
        sb.append(appMessageFormat);
        sb.append(", message_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.message_token, ")");
    }
}
