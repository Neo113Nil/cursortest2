package com.fidesmo.sec.delivery;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/TransceiveResult;", "", "()V", "ApduError", "ApduResponse", "Lcom/fidesmo/sec/delivery/TransceiveResult$ApduError;", "Lcom/fidesmo/sec/delivery/TransceiveResult$ApduResponse;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TransceiveResult {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/delivery/TransceiveResult$ApduError;", "Lcom/fidesmo/sec/delivery/TransceiveResult;", "message", "", "fatal", "", "description", "(Ljava/lang/String;ZLjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getFatal", "()Z", "getMessage", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApduError extends TransceiveResult {
        private final String description;
        private final boolean fatal;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApduError(String str, boolean z, String str2) {
            super(null);
            str.getClass();
            this.message = str;
            this.fatal = z;
            this.description = str2;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean getFatal() {
            return this.fatal;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fidesmo/sec/delivery/TransceiveResult$ApduResponse;", "Lcom/fidesmo/sec/delivery/TransceiveResult;", "apduResponse", "", "", "(Ljava/util/List;)V", "getApduResponse", "()Ljava/util/List;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApduResponse extends TransceiveResult {
        private final List<byte[]> apduResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApduResponse(List<byte[]> list) {
            super(null);
            list.getClass();
            this.apduResponse = list;
        }

        public final List<byte[]> getApduResponse() {
            return this.apduResponse;
        }
    }

    public /* synthetic */ TransceiveResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransceiveResult() {
    }
}
