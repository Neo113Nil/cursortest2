package com.squareup.cash.moneybot.backend.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/moneybot/backend/api/GeneralMoneybotError;", "Lcom/squareup/cash/moneybot/backend/api/MoneybotError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneralMoneybotError extends MoneybotError {
    public final String message;

    public GeneralMoneybotError(String str) {
        super(null);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public GeneralMoneybotError(String str, Exception exc) {
        super(exc);
        this.message = str;
    }
}
