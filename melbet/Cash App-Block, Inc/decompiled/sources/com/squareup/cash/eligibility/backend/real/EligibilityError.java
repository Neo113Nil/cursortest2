package com.squareup.cash.eligibility.backend.real;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/eligibility/backend/real/EligibilityError;", "Lcom/squareup/cash/observability/types/ReportedError;", "MalformedFeatureEligibilityRefreshPolicyError", "Lcom/squareup/cash/eligibility/backend/real/EligibilityError$MalformedFeatureEligibilityRefreshPolicyError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EligibilityError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Eligibility.INSTANCE);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/eligibility/backend/real/EligibilityError$MalformedFeatureEligibilityRefreshPolicyError;", "Lcom/squareup/cash/eligibility/backend/real/EligibilityError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MalformedFeatureEligibilityRefreshPolicyError extends EligibilityError {
        public final String message;

        public MalformedFeatureEligibilityRefreshPolicyError(FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy) {
            featureEligibilityRefreshPolicy.getClass();
            this.message = "Malformed FeatureEligibilityRefreshPolicy: " + featureEligibilityRefreshPolicy;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
