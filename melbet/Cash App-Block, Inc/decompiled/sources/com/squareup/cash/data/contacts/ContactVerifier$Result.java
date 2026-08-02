package com.squareup.cash.data.contacts;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ContactVerifier$Result {

    /* loaded from: classes5.dex */
    public final class Loading extends ContactVerifier$Result {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 566438028;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NetworkFailure extends ContactVerifier$Result {
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

    /* loaded from: classes5.dex */
    public final class NotSuccessful extends ContactVerifier$Result {
        public final String failureMessage;
        public final ResponseContext responseContext;
        public final Status status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
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

        public NotSuccessful(ResponseContext responseContext, Status status) {
            String str = responseContext != null ? responseContext.failure_message : null;
            this.responseContext = responseContext;
            this.status = status;
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
            return Intrinsics.areEqual(this.responseContext, notSuccessful.responseContext) && this.status == notSuccessful.status && Intrinsics.areEqual(this.failureMessage, notSuccessful.failureMessage);
        }

        public final int hashCode() {
            ResponseContext responseContext = this.responseContext;
            int hashCode = (this.status.hashCode() + ((responseContext == null ? 0 : responseContext.hashCode()) * 31)) * 31;
            String str = this.failureMessage;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotSuccessful(responseContext=");
            sb.append(this.responseContext);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", failureMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.failureMessage, ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class Successful extends ContactVerifier$Result {
        public final String failureMessage;
        public final ResponseContext responseContext;

        public Successful(ResponseContext responseContext) {
            String str = responseContext.failure_message;
            responseContext.getClass();
            this.responseContext = responseContext;
            this.failureMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Successful)) {
                return false;
            }
            Successful successful = (Successful) obj;
            return Intrinsics.areEqual(this.responseContext, successful.responseContext) && Intrinsics.areEqual(this.failureMessage, successful.failureMessage);
        }

        public final int hashCode() {
            int hashCode = this.responseContext.hashCode() * 31;
            String str = this.failureMessage;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Successful(responseContext=" + this.responseContext + ", failureMessage=" + this.failureMessage + ")";
        }
    }
}
