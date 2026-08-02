package com.squareup.cash.cdf.localclient;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class LocalClientEducationalSheetViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String analytics_id;
    public final String buyer_token;
    public final String flow_token;
    public final Long page_number;
    public final LinkedHashMap parameters;
    public final String sheet_token;

    public LocalClientEducationalSheetViewItem(Long l, String str, String str2, String str3, String str4) {
        this.sheet_token = str;
        this.buyer_token = str2;
        this.page_number = l;
        this.analytics_id = str3;
        this.flow_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "LocalClient", "cdf_action", "EducationalSheet");
        Countries.putSafe(m, "sheet_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "page_number", l);
        Countries.putSafe(m, "analytics_id", str3);
        Countries.putSafe(m, "flow_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientEducationalSheetViewItem)) {
            return false;
        }
        LocalClientEducationalSheetViewItem localClientEducationalSheetViewItem = (LocalClientEducationalSheetViewItem) obj;
        return Intrinsics.areEqual(this.sheet_token, localClientEducationalSheetViewItem.sheet_token) && this.buyer_token.equals(localClientEducationalSheetViewItem.buyer_token) && this.page_number.equals(localClientEducationalSheetViewItem.page_number) && this.analytics_id.equals(localClientEducationalSheetViewItem.analytics_id) && Intrinsics.areEqual(this.flow_token, localClientEducationalSheetViewItem.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient EducationalSheet ViewItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.sheet_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.page_number, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.buyer_token), 31), 31, this.analytics_id);
        String str2 = this.flow_token;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientEducationalSheetViewItem(sheet_token=", this.sheet_token, ", buyer_token=", this.buyer_token, ", page_number=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.page_number, ", analytics_id=", this.analytics_id, ", flow_token=", m);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flow_token, ")");
    }
}
