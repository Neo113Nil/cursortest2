package com.squareup.cash.cdf.document;

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
public final class DocumentUploadRemove implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public DocumentUploadRemove(String str, String str2) {
        this.client_scenario = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Document", "cdf_action", "Upload");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "source", "FilesetUpload");
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentUploadRemove)) {
            return false;
        }
        DocumentUploadRemove documentUploadRemove = (DocumentUploadRemove) obj;
        return this.client_scenario.equals(documentUploadRemove.client_scenario) && Intrinsics.areEqual(this.flow_token, documentUploadRemove.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Document Upload Remove";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.client_scenario.hashCode() * 31;
        return ((hashCode + (this.flow_token == null ? 0 : r1.hashCode())) * 31) - 1217000729;
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DocumentUploadRemove(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", source=FilesetUpload)");
    }
}
