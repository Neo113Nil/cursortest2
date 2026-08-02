package com.squareup.cash.checks;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/checks/MiSnapIntegrationError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MiSnapIntegrationError extends RuntimeException {
    public final String message;

    public MiSnapIntegrationError(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
