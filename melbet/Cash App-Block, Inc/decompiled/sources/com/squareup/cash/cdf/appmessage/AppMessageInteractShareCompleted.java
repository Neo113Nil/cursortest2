package com.squareup.cash.cdf.appmessage;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AppMessageInteractShareCompleted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String message_token;
    public final LinkedHashMap parameters;
    public final String share_option;

    public AppMessageInteractShareCompleted(String str, String str2, String str3) {
        AppMessageFormat appMessageFormat = AppMessageFormat.HALF_SHEET;
        Boolean bool = Boolean.TRUE;
        this.external_id = str;
        this.message_token = str2;
        this.share_option = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "AppMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "format", appMessageFormat);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "share_option", str3);
        Countries.putSafe(m, "completed", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMessageInteractShareCompleted)) {
            return false;
        }
        AppMessageInteractShareCompleted appMessageInteractShareCompleted = (AppMessageInteractShareCompleted) obj;
        if (!Intrinsics.areEqual(this.external_id, appMessageInteractShareCompleted.external_id)) {
            return false;
        }
        AppMessageFormat appMessageFormat = AppMessageFormat.FULL_SCREEN;
        if (!Intrinsics.areEqual(this.message_token, appMessageInteractShareCompleted.message_token) || !Intrinsics.areEqual(this.share_option, appMessageInteractShareCompleted.share_option)) {
            return false;
        }
        Object obj2 = Boolean.TRUE;
        return obj2.equals(obj2);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppMessage Interact ShareCompleted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (AppMessageFormat.HALF_SHEET.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.message_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.share_option;
        return Boolean.TRUE.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        AppMessageFormat appMessageFormat = AppMessageFormat.HALF_SHEET;
        Boolean bool = Boolean.TRUE;
        StringBuilder sb = new StringBuilder("AppMessageInteractShareCompleted(external_id=");
        sb.append(this.external_id);
        sb.append(", format=");
        sb.append(appMessageFormat);
        sb.append(", message_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.message_token, ", share_option=", this.share_option, ", completed=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, bool, ")");
    }
}
