package com.squareup.cash.clientrouting.observability;

import com.squareup.cash.clientroutes.UriSyntaxException;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/cash/clientrouting/observability/ClientRoutingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "InvalidRouteUriError", "InvalidDeepLinkUriError", "Lcom/squareup/cash/clientrouting/observability/ClientRoutingError$InvalidDeepLinkUriError;", "Lcom/squareup/cash/clientrouting/observability/ClientRoutingError$InvalidRouteUriError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ClientRoutingError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.ClientRouting.INSTANCE);
    public final String message;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/observability/ClientRoutingError$InvalidDeepLinkUriError;", "Lcom/squareup/cash/clientrouting/observability/ClientRoutingError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidDeepLinkUriError extends ClientRoutingError {
        public final UriSyntaxException cause;

        public InvalidDeepLinkUriError(UriSyntaxException uriSyntaxException) {
            super("Invalid deep link Uri.");
            this.cause = uriSyntaxException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidDeepLinkUriError) && Intrinsics.areEqual(this.cause, ((InvalidDeepLinkUriError) obj).cause);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidDeepLinkUriError(cause=" + this.cause + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/observability/ClientRoutingError$InvalidRouteUriError;", "Lcom/squareup/cash/clientrouting/observability/ClientRoutingError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidRouteUriError extends ClientRoutingError {
        public final UriSyntaxException cause;

        public InvalidRouteUriError(UriSyntaxException uriSyntaxException) {
            super("Invalid client route uri.");
            this.cause = uriSyntaxException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidRouteUriError) && Intrinsics.areEqual(this.cause, ((InvalidRouteUriError) obj).cause);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidRouteUriError(cause=" + this.cause + ")";
        }
    }

    public ClientRoutingError(String str) {
        this.message = str;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
