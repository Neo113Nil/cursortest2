package com.squareup.cash.activity.backend;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/activity/backend/ActivityFormattingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityFormattingError extends ReportedError {
    public final Exception cause;
    public final Map metadata;
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Activity.INSTANCE);
    public final Set targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.LOGS, ReportedError.ErrorReportingTarget.BUGSNAG, ReportedError.ErrorReportingTarget.DATADOG});
    public final String message = "Activity item formatting failed";

    public ActivityFormattingError(Exception exc, PaymentHistoryActivityItem paymentHistoryActivityItem) {
        Map m;
        this.cause = exc;
        if (paymentHistoryActivityItem == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        } else {
            Pair pair = new Pair("Item ID", ActivityItemKt.getItemId(paymentHistoryActivityItem));
            ActivityItemType itemType = ActivityItemKt.getItemType(paymentHistoryActivityItem);
            m = BalanceFeedKt$$ExternalSyntheticOutline0.m("Activity", MapsKt__MapsKt.mapOf(pair, new Pair("Item Type", itemType != null ? itemType.toString() : null)));
        }
        this.metadata = m;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }
}
