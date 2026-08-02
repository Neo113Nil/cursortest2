package com.squareup.cash.observability.protovalidation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/observability/protovalidation/IllegalArgumentCountException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "proto-validation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IllegalArgumentCountException extends Exception {
    public final String field;
    public final String message;

    public IllegalArgumentCountException(String str, String str2) {
        this.message = str;
        this.field = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
