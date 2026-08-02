package com.squareup.cash.cdf.document;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class DocumentUploadReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String document_category;
    public final String error_message;
    public final String flow_token;
    public final String mime_type;
    public final Boolean network_error;
    public final LinkedHashMap parameters;
    public final Integer response_code;
    public final String source;
    public final Trigger trigger;

    public DocumentUploadReceiveError(String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, Trigger trigger, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        num = (i & 64) != 0 ? null : num;
        String str6 = (i & 128) != 0 ? null : "FilesetUpload";
        trigger = (i & 256) != 0 ? null : trigger;
        this.client_scenario = str;
        this.document_category = str2;
        this.error_message = str3;
        this.flow_token = str4;
        this.mime_type = str5;
        this.network_error = bool;
        this.response_code = num;
        this.source = str6;
        this.trigger = trigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "Document", "cdf_action", "Upload");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "document_category", str2);
        Countries.putSafe(m, "error_message", str3);
        Countries.putSafe(m, "flow_token", str4);
        Countries.putSafe(m, "mime_type", str5);
        Countries.putSafe(m, "network_error", bool);
        Countries.putSafe(m, "response_code", num);
        Countries.putSafe(m, "source", str6);
        Countries.putSafe(m, "trigger", trigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentUploadReceiveError)) {
            return false;
        }
        DocumentUploadReceiveError documentUploadReceiveError = (DocumentUploadReceiveError) obj;
        return Intrinsics.areEqual(this.client_scenario, documentUploadReceiveError.client_scenario) && Intrinsics.areEqual(this.document_category, documentUploadReceiveError.document_category) && Intrinsics.areEqual(this.error_message, documentUploadReceiveError.error_message) && Intrinsics.areEqual(this.flow_token, documentUploadReceiveError.flow_token) && Intrinsics.areEqual(this.mime_type, documentUploadReceiveError.mime_type) && this.network_error.equals(documentUploadReceiveError.network_error) && Intrinsics.areEqual(this.response_code, documentUploadReceiveError.response_code) && Intrinsics.areEqual(this.source, documentUploadReceiveError.source) && this.trigger == documentUploadReceiveError.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Document Upload ReceiveError";
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
        String str3 = this.error_message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mime_type;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.network_error, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Integer num = this.response_code;
        int hashCode5 = (m + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.source;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Trigger trigger = this.trigger;
        return hashCode6 + (trigger != null ? trigger.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentUploadReceiveError(client_scenario=", this.client_scenario, ", document_category=", this.document_category, ", error_message=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.error_message, ", flow_token=", this.flow_token, ", mime_type=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.mime_type, ", network_error=", this.network_error, ", response_code=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.response_code, ", source=", this.source, ", trigger=");
        m.append(this.trigger);
        m.append(")");
        return m.toString();
    }
}
