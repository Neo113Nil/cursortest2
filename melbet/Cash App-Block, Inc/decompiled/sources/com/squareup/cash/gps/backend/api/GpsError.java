package com.squareup.cash.gps.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/gps/backend/api/GpsError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/gps/backend/api/GpsAnalyticsParamParsingError;", "Lcom/squareup/cash/gps/backend/api/GpsLocalCacheError;", "Lcom/squareup/cash/gps/backend/api/GpsNetworkEnvironmentError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class GpsError extends ReportedError {
    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return SetsKt__SetsJVMKt.setOf(ErrorFeature.Gps.INSTANCE);
    }
}
