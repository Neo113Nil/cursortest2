package com.squareup.cash.savings.backend.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/savings/backend/api/GeneralSavingsError;", "Lcom/squareup/cash/savings/backend/api/SavingsError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GeneralSavingsError extends SavingsError {
    public final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSavingsError(String str, Throwable th) {
        super(th);
        str.getClass();
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
