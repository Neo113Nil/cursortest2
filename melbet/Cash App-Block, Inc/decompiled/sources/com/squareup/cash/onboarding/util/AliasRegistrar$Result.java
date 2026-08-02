package com.squareup.cash.onboarding.util;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class AliasRegistrar$Result {

    /* loaded from: classes6.dex */
    public final class NetworkFailure extends AliasRegistrar$Result {
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

        public final ApiResult.Failure getFailure() {
            return this.failure;
        }

        public final int hashCode() {
            return this.failure.hashCode();
        }

        public final String toString() {
            return "NetworkFailure(failure=" + this.failure + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class NotSuccessful extends AliasRegistrar$Result {
        public final String failureMessage;
        public final ResponseContext responseContext;
        public final Status status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Status {
            public static final /* synthetic */ Status[] $VALUES;
            public static final Status DUPLICATE_ALIAS;
            public static final Status INVALID_ALIAS;
            public static final Status TOO_MANY_REQUESTS;

            static {
                Status status = new Status("INVALID_ALIAS", 0);
                INVALID_ALIAS = status;
                Status status2 = new Status("TOO_MANY_REQUESTS", 1);
                TOO_MANY_REQUESTS = status2;
                Status status3 = new Status("DUPLICATE_ALIAS", 2);
                DUPLICATE_ALIAS = status3;
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
            String str = responseContext != null ? responseContext.failure_message : null;
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

        public final ResponseContext getResponseContext() {
            return this.responseContext;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            ResponseContext responseContext = this.responseContext;
            int hashCode2 = (hashCode + (responseContext == null ? 0 : responseContext.hashCode())) * 31;
            String str = this.failureMessage;
            return hashCode2 + (str != null ? str.hashCode() : 0);
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

    /* loaded from: classes6.dex */
    public final class Successful extends AliasRegistrar$Result {
        public final ResponseContext responseContext;

        public Successful(ResponseContext responseContext) {
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Successful) && Intrinsics.areEqual(this.responseContext, ((Successful) obj).responseContext);
        }

        public final ResponseContext getResponseContext() {
            return this.responseContext;
        }

        public final int hashCode() {
            ResponseContext responseContext = this.responseContext;
            if (responseContext == null) {
                return 0;
            }
            return responseContext.hashCode();
        }

        public final String toString() {
            return "Successful(responseContext=" + this.responseContext + ")";
        }
    }
}
