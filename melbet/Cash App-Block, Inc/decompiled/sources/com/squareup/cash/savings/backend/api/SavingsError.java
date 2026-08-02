package com.squareup.cash.savings.backend.api;

import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/savings/backend/api/SavingsError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/observability/types/FeatureError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SavingsError extends ReportedError {
    public final /* synthetic */ SavingsFeatureError $$delegate_0 = SavingsFeatureError.INSTANCE;
    public final Throwable cause;

    public SavingsError(Throwable th) {
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        this.$$delegate_0.getClass();
        return SavingsFeatureError.features;
    }
}
