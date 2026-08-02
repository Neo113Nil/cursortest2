package com.squareup.cash.moneybot.backend.api.managers;

/* loaded from: classes6.dex */
public interface ChatSessionError {

    public final class NetworkError implements ChatSessionError {
        public static final NetworkError INSTANCE = new NetworkError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkError);
        }

        public final int hashCode() {
            return 1220511321;
        }

        public final String toString() {
            return "NetworkError";
        }
    }

    public final class RequestFailed implements ChatSessionError {
        public static final RequestFailed INSTANCE = new RequestFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestFailed);
        }

        public final int hashCode() {
            return 1544189357;
        }

        public final String toString() {
            return "RequestFailed";
        }
    }

    public final class StreamingInterrupted implements ChatSessionError {
        public static final StreamingInterrupted INSTANCE = new StreamingInterrupted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StreamingInterrupted);
        }

        public final int hashCode() {
            return -2009559201;
        }

        public final String toString() {
            return "StreamingInterrupted";
        }
    }
}
