package com.squareup.cash.investing.presenters.errors;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/investing/presenters/errors/InvestingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/investing/presenters/errors/FailedToStartTradeFlowError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InvestingError extends ReportedError {
    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return SetsKt__SetsJVMKt.setOf(ErrorFeature.Investing.INSTANCE);
    }
}
