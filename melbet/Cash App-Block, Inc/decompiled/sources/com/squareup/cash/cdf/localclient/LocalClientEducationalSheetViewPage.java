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
public final class LocalClientEducationalSheetViewPage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String buyer_token;
    public final String flow_token;
    public final Long page_number;
    public final LinkedHashMap parameters;
    public final String sheet_token;

    public LocalClientEducationalSheetViewPage(String str, String str2, String str3, Long l) {
        this.sheet_token = str;
        this.buyer_token = str2;
        this.page_number = l;
        this.flow_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalClient", "cdf_action", "EducationalSheet");
        Countries.putSafe(m, "sheet_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "page_number", l);
        Countries.putSafe(m, "flow_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientEducationalSheetViewPage)) {
            return false;
        }
        LocalClientEducationalSheetViewPage localClientEducationalSheetViewPage = (LocalClientEducationalSheetViewPage) obj;
        return Intrinsics.areEqual(this.sheet_token, localClientEducationalSheetViewPage.sheet_token) && this.buyer_token.equals(localClientEducationalSheetViewPage.buyer_token) && this.page_number.equals(localClientEducationalSheetViewPage.page_number) && Intrinsics.areEqual(this.flow_token, localClientEducationalSheetViewPage.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient EducationalSheet ViewPage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.sheet_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.page_number, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.buyer_token), 31);
        String str2 = this.flow_token;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientEducationalSheetViewPage(sheet_token=", this.sheet_token, ", buyer_token=", this.buyer_token, ", page_number=");
        m.append(this.page_number);
        m.append(", flow_token=");
        m.append(this.flow_token);
        m.append(")");
        return m.toString();
    }
}
