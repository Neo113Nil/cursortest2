package A4;

import kotlin.jvm.internal.e;

/* loaded from: classes2.dex */
public final class a {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public a(int i, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i;
        this.payload = str;
        this.throwable = th;
        this.retryAfterSeconds = num;
        this.retryLimit = num2;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final Integer getRetryLimit() {
        return this.retryLimit;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isClientError() {
        int i = this.statusCode;
        return 400 <= i && i < 500;
    }

    public final boolean isSuccess() {
        int i = this.statusCode;
        return i == 200 || i == 202 || i == 304 || i == 201;
    }

    public /* synthetic */ a(int i, String str, Throwable th, Integer num, Integer num2, int i4, e eVar) {
        this(i, str, (i4 & 4) != 0 ? null : th, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : num2);
    }
}
