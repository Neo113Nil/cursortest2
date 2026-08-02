package com.squareup.cash.phoneplans;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/phoneplans/IosDeviceModelPredicateOnAndroidError;", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IosDeviceModelPredicateOnAndroidError extends ReportedError {
    public final String message = "Received iOS-only compatibility check method on Android; falling back to platform API";
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Flows.INSTANCE);
    public final String groupingDescriptor = "ios_device_model_predicate_on_android";

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
