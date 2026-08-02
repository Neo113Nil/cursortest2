package com.squareup.cash.instruments.backend.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InstrumentVerifier$Result {

    /* loaded from: classes4.dex */
    public final class Loading extends InstrumentVerifier$Result {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1584352102;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NetworkFailure extends InstrumentVerifier$Result {
        public final ApiResult.Failure failure;

        public NetworkFailure(ApiResult.Failure failure) {
            this.failure = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkFailure) && this.failure.equals(((NetworkFailure) obj).failure);
        }

        public final int hashCode() {
            return this.failure.hashCode();
        }

        public final String toString() {
            return "NetworkFailure(failure=" + this.failure + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class NotSuccessful extends InstrumentVerifier$Result {
        public final String failureMessage;
        public final ResponseContext responseContext;
        public final Status status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Status {
            public static final /* synthetic */ Status[] $VALUES;
            public static final Status CONCURRENT_MODIFICATION;
            public static final Status FAILURE;
            public static final Status TOO_MANY_ATTEMPTS;

            static {
                Status status = new Status("FAILURE", 0);
                FAILURE = status;
                Status status2 = new Status("TOO_MANY_ATTEMPTS", 1);
                TOO_MANY_ATTEMPTS = status2;
                Status status3 = new Status("CONCURRENT_MODIFICATION", 2);
                CONCURRENT_MODIFICATION = status3;
                $VALUES = new Status[]{status, status2, status3};
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public NotSuccessful(Status status, ResponseContext responseContext) {
            String str = responseContext.failure_message;
            responseContext.getClass();
            this.status = status;
            this.responseContext = responseContext;
            this.failureMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotSuccessful)) {
                return false;
            }
            NotSuccessful notSuccessful = (NotSuccessful) obj;
            return this.status == notSuccessful.status && Intrinsics.areEqual(this.responseContext, notSuccessful.responseContext) && Intrinsics.areEqual(this.failureMessage, notSuccessful.failureMessage);
        }

        public final int hashCode() {
            int hashCode = (this.responseContext.hashCode() + (this.status.hashCode() * 31)) * 31;
            String str = this.failureMessage;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotSuccessful(status=");
            sb.append(this.status);
            sb.append(", responseContext=");
            sb.append(this.responseContext);
            sb.append(", failureMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.failureMessage, ")");
        }
    }

    public final class Successful extends InstrumentVerifier$Result {
        public final ResponseContext responseContext;

        public Successful(ResponseContext responseContext) {
            responseContext.getClass();
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && Intrinsics.areEqual(this.responseContext, ((Successful) obj).responseContext);
        }

        public final int hashCode() {
            return this.responseContext.hashCode();
        }

        public final String toString() {
            return "Successful(responseContext=" + this.responseContext + ")";
        }
    }
}
