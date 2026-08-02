package com.squareup.cash.benefits.utils;

import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/benefits/utils/BankingBenefitsError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/observability/types/FeatureError;", "Lcom/squareup/cash/benefits/utils/GeneralBankingBenefitsError;", "utils"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BankingBenefitsError extends ReportedError {
    public final /* synthetic */ BankingBenefitsFeatureError $$delegate_0 = BankingBenefitsFeatureError.INSTANCE;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        this.$$delegate_0.getClass();
        return BankingBenefitsFeatureError.features;
    }
}
