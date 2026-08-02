package com.squareup.cash.deviceintegrity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/deviceintegrity/IntegrityCheckException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IntegrityCheckException extends Exception {
    public final Exception cause;
    public final IntegrityErrorType errorType;
    public final Integer integrityCheckStatusCode;
    public final Integer playIntegrityErrorCode;

    public IntegrityCheckException(Exception exc, IntegrityErrorType integrityErrorType, Integer num, Integer num2) {
        super("Integrity check failed with status code: " + num + ", error code: " + num2);
        this.cause = exc;
        this.errorType = integrityErrorType;
        this.integrityCheckStatusCode = num;
        this.playIntegrityErrorCode = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrityCheckException)) {
            return false;
        }
        IntegrityCheckException integrityCheckException = (IntegrityCheckException) obj;
        return Intrinsics.areEqual(this.cause, integrityCheckException.cause) && this.errorType == integrityCheckException.errorType && Intrinsics.areEqual(this.integrityCheckStatusCode, integrityCheckException.integrityCheckStatusCode) && Intrinsics.areEqual(this.playIntegrityErrorCode, integrityCheckException.playIntegrityErrorCode);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public final int hashCode() {
        Exception exc = this.cause;
        int hashCode = (exc == null ? 0 : exc.hashCode()) * 31;
        IntegrityErrorType integrityErrorType = this.errorType;
        int hashCode2 = (hashCode + (integrityErrorType == null ? 0 : integrityErrorType.hashCode())) * 31;
        Integer num = this.integrityCheckStatusCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.playIntegrityErrorCode;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "IntegrityCheckException(cause=" + this.cause + ", errorType=" + this.errorType + ", integrityCheckStatusCode=" + this.integrityCheckStatusCode + ", playIntegrityErrorCode=" + this.playIntegrityErrorCode + ")";
    }
}
