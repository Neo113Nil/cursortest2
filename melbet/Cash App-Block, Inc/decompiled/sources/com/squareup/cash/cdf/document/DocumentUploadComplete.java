package com.squareup.cash.cdf.document;

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
public final class DocumentUploadComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String document_category;
    public final String flow_token;
    public final String mime_type;
    public final LinkedHashMap parameters;
    public final String rate_plan;
    public final String source;
    public final Trigger trigger;

    public DocumentUploadComplete(String str, String str2, String str3, String str4, String str5, String str6, Trigger trigger, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        trigger = (i & 64) != 0 ? null : trigger;
        this.client_scenario = str;
        this.document_category = str2;
        this.flow_token = str3;
        this.mime_type = str4;
        this.rate_plan = str5;
        this.source = str6;
        this.trigger = trigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Document", "cdf_action", "Upload");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "document_category", str2);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "mime_type", str4);
        Countries.putSafe(m, "rate_plan", str5);
        Countries.putSafe(m, "source", str6);
        Countries.putSafe(m, "trigger", trigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentUploadComplete)) {
            return false;
        }
        DocumentUploadComplete documentUploadComplete = (DocumentUploadComplete) obj;
        return Intrinsics.areEqual(this.client_scenario, documentUploadComplete.client_scenario) && Intrinsics.areEqual(this.document_category, documentUploadComplete.document_category) && Intrinsics.areEqual(this.flow_token, documentUploadComplete.flow_token) && Intrinsics.areEqual(this.mime_type, documentUploadComplete.mime_type) && Intrinsics.areEqual(this.rate_plan, documentUploadComplete.rate_plan) && Intrinsics.areEqual(this.source, documentUploadComplete.source) && this.trigger == documentUploadComplete.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Document Upload Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.document_category;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mime_type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rate_plan;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.source;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Trigger trigger = this.trigger;
        return hashCode6 + (trigger != null ? trigger.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentUploadComplete(client_scenario=", this.client_scenario, ", document_category=", this.document_category, ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", mime_type=", this.mime_type, ", rate_plan=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.rate_plan, ", source=", this.source, ", trigger=");
        m.append(this.trigger);
        m.append(")");
        return m.toString();
    }
}
