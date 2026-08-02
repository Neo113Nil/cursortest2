package com.squareup.cash.cdf.taptopay;

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
public final class TapToPayInteractViewError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String error_internal_message;
    public final String error_message;
    public final ErrorType error_type;
    public final FlowType flow_type;
    public final String packaged_ecr_logs;
    public final LinkedHashMap parameters;

    public TapToPayInteractViewError(FlowType flowType, ErrorType errorType, String str, String str2, String str3) {
        this.flow_type = flowType;
        this.error_type = errorType;
        this.error_internal_message = str;
        this.error_message = str2;
        this.packaged_ecr_logs = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "TapToPay", "cdf_action", "Interact");
        Countries.putSafe(m, "flow_type", flowType);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "error_internal_message", str);
        Countries.putSafe(m, "error_message", str2);
        Countries.putSafe(m, "packaged_ecr_logs", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapToPayInteractViewError)) {
            return false;
        }
        TapToPayInteractViewError tapToPayInteractViewError = (TapToPayInteractViewError) obj;
        return this.flow_type == tapToPayInteractViewError.flow_type && this.error_type == tapToPayInteractViewError.error_type && Intrinsics.areEqual(this.error_internal_message, tapToPayInteractViewError.error_internal_message) && Intrinsics.areEqual(this.error_message, tapToPayInteractViewError.error_message) && Intrinsics.areEqual(this.packaged_ecr_logs, tapToPayInteractViewError.packaged_ecr_logs);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TapToPay Interact ViewError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        FlowType flowType = this.flow_type;
        int hashCode = (flowType == null ? 0 : flowType.hashCode()) * 31;
        ErrorType errorType = this.error_type;
        int hashCode2 = (hashCode + (errorType == null ? 0 : errorType.hashCode())) * 961;
        String str = this.error_internal_message;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_message;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packaged_ecr_logs;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TapToPayInteractViewError(flow_type=");
        sb.append(this.flow_type);
        sb.append(", error_type=");
        sb.append(this.error_type);
        sb.append(", error_code=null, error_internal_message=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.error_internal_message, ", error_message=", this.error_message, ", packaged_ecr_logs=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.packaged_ecr_logs, ")");
    }
}
