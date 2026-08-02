package com.fidesmo.sec.delivery;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/UiResponseError;", "", "()V", "NotValidResponse", "UnencryptedField", "Lcom/fidesmo/sec/delivery/UiResponseError$NotValidResponse;", "Lcom/fidesmo/sec/delivery/UiResponseError$UnencryptedField;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UiResponseError {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/UiResponseError$NotValidResponse;", "Lcom/fidesmo/sec/delivery/UiResponseError;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotValidResponse extends UiResponseError {
        private final String reason;

        public NotValidResponse(String str) {
            super(null);
            this.reason = str;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/UiResponseError$UnencryptedField;", "Lcom/fidesmo/sec/delivery/UiResponseError;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnencryptedField extends UiResponseError {
        private final String message;

        public UnencryptedField(String str) {
            super(null);
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ UiResponseError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiResponseError() {
    }
}
