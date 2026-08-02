package com.squareup.cash.card.onboarding;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/card/onboarding/CardStudioError;", "Lcom/squareup/cash/observability/types/ReportedError;", "views"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardStudioError extends ReportedError {
    public final Exception cause;
    public final Set features;
    public final Set targets;

    public CardStudioError(Exception exc) {
        Set of = SetsKt__SetsJVMKt.setOf(ErrorFeature.CardOnboarding.INSTANCE);
        Set set = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.LOGS, ReportedError.ErrorReportingTarget.BUGSNAG});
        of.getClass();
        set.getClass();
        this.cause = exc;
        this.features = of;
        this.targets = set;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }
}
