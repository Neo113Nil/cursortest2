package com.squareup.cash.gcl;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/gcl/RefreshTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RefreshTimeoutException extends Exception {
    public static final RefreshTimeoutException INSTANCE = new RefreshTimeoutException("GCF Error: Timeout on refreshing Semaphore onboarding config.");

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RefreshTimeoutException);
    }

    public final int hashCode() {
        return -1631005127;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RefreshTimeoutException";
    }
}
