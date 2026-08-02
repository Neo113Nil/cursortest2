package com.datadog.android.core.internal.data.upload;

/* loaded from: classes4.dex */
public abstract class UploadStatus {
    public final int code;
    public final boolean shouldRetry;
    public final Throwable throwable;

    public final class DNSError extends UploadStatus {
    }

    public final class HttpClientError extends UploadStatus {
    }

    public final class HttpClientRateLimiting extends UploadStatus {
    }

    public final class HttpServerError extends UploadStatus {
    }

    public final class InvalidTokenError extends UploadStatus {
        public InvalidTokenError(int i) {
            super(i, 4, null, false);
        }
    }

    public final class NetworkError extends UploadStatus {
    }

    public final class RequestCreationError extends UploadStatus {
    }

    public final class Success extends UploadStatus {
    }

    public final class UnknownException extends UploadStatus {
    }

    public final class UnknownHttpError extends UploadStatus {
    }

    public final class UnknownStatus extends UploadStatus {
        public static final UnknownStatus INSTANCE = new UnknownStatus(0, 4, null, false);
    }

    public UploadStatus(int i, int i2, Throwable th, boolean z) {
        i = (i2 & 2) != 0 ? 0 : i;
        th = (i2 & 4) != 0 ? null : th;
        this.shouldRetry = z;
        this.code = i;
        this.throwable = th;
    }
}
