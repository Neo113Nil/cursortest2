package com.squareup.cash.card.spendinginsights.backend.api;

import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/card/spendinginsights/backend/api/SpendingInsightsError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/observability/types/FeatureError;", "Lcom/squareup/cash/card/spendinginsights/backend/api/GeneralSpendingInsightsError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SpendingInsightsError extends ReportedError {
    public final /* synthetic */ SpendingInsightsFeatureError $$delegate_0 = SpendingInsightsFeatureError.INSTANCE;
    public final Throwable cause;

    public SpendingInsightsError(Throwable th) {
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        this.$$delegate_0.getClass();
        return SpendingInsightsFeatureError.features;
    }
}
