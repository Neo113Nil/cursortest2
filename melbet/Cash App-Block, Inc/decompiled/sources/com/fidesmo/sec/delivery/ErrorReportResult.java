package com.fidesmo.sec.delivery;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/delivery/ErrorReportResult;", "", "()V", "FatalError", "NextOperation", "NonFatalError", "Lcom/fidesmo/sec/delivery/ErrorReportResult$FatalError;", "Lcom/fidesmo/sec/delivery/ErrorReportResult$NextOperation;", "Lcom/fidesmo/sec/delivery/ErrorReportResult$NonFatalError;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ErrorReportResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/delivery/ErrorReportResult$FatalError;", "Lcom/fidesmo/sec/delivery/ErrorReportResult;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FatalError extends ErrorReportResult {
        public static final FatalError INSTANCE = new FatalError();

        private FatalError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/ErrorReportResult$NextOperation;", "Lcom/fidesmo/sec/delivery/ErrorReportResult;", "secResponse", "Lcom/fidesmo/sec/delivery/SecResponse;", "(Lcom/fidesmo/sec/delivery/SecResponse;)V", "getSecResponse", "()Lcom/fidesmo/sec/delivery/SecResponse;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NextOperation extends ErrorReportResult {
        private final SecResponse secResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NextOperation(SecResponse secResponse) {
            super(null);
            secResponse.getClass();
            this.secResponse = secResponse;
        }

        public final SecResponse getSecResponse() {
            return this.secResponse;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/delivery/ErrorReportResult$NonFatalError;", "Lcom/fidesmo/sec/delivery/ErrorReportResult;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NonFatalError extends ErrorReportResult {
        public static final NonFatalError INSTANCE = new NonFatalError();

        private NonFatalError() {
            super(null);
        }
    }

    public /* synthetic */ ErrorReportResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorReportResult() {
    }
}
