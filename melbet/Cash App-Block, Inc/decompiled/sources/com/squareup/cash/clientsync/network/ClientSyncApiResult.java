package com.squareup.cash.clientsync.network;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class ClientSyncApiResult {

    public abstract class Failure extends ClientSyncApiResult {
        public final boolean isRetryable;

        public final class HttpFailure extends Failure {
            public final int code;

            public HttpFailure(int i) {
                super(i == 429 || (500 <= i && i < 600));
                this.code = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HttpFailure) && this.code == ((HttpFailure) obj).code;
            }

            public final int hashCode() {
                return Integer.hashCode(this.code);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code, "HttpFailure(code=", ")");
            }
        }

        public final class NetworkFailure extends Failure {
            public final Throwable error;

            public NetworkFailure(Throwable th) {
                super(true);
                this.error = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NetworkFailure) && this.error.equals(((NetworkFailure) obj).error);
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("NetworkFailure(error=", ")", this.error);
            }
        }

        public Failure(boolean z) {
            this.isRetryable = z;
        }
    }

    /* loaded from: classes8.dex */
    public final class Success extends ClientSyncApiResult {
        public final GatewayResponse response;

        public Success(GatewayResponse gatewayResponse) {
            this.response = gatewayResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.response.equals(((Success) obj).response);
        }

        public final Object getResponse() {
            return this.response;
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "Success(response=" + this.response + ")";
        }
    }
}
