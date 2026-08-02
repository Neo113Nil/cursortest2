package com.squareup.cash.benefits.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/benefits/utils/GeneralBankingBenefitsError;", "Lcom/squareup/cash/benefits/utils/BankingBenefitsError;", "utils"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GeneralBankingBenefitsError extends BankingBenefitsError {
    public final String message;

    public GeneralBankingBenefitsError(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
