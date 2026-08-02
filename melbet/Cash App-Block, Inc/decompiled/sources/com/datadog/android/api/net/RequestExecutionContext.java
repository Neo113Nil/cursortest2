package com.datadog.android.api.net;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RequestExecutionContext {
    public final int attemptNumber;
    public final Integer previousResponseCode;

    public RequestExecutionContext(int i, Integer num) {
        this.attemptNumber = i;
        this.previousResponseCode = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestExecutionContext)) {
            return false;
        }
        RequestExecutionContext requestExecutionContext = (RequestExecutionContext) obj;
        return this.attemptNumber == requestExecutionContext.attemptNumber && Intrinsics.areEqual(this.previousResponseCode, requestExecutionContext.previousResponseCode);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.attemptNumber) * 31;
        Integer num = this.previousResponseCode;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RequestExecutionContext(attemptNumber=" + this.attemptNumber + ", previousResponseCode=" + this.previousResponseCode + ")";
    }
}
