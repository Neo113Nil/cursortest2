package w8;

import pc.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public a(int i10, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i10;
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

    public final boolean isSuccess() {
        int i10 = this.statusCode;
        return i10 == 200 || i10 == 202 || i10 == 304 || i10 == 201;
    }

    public /* synthetic */ a(int i10, String str, Throwable th, Integer num, Integer num2, int i11, f fVar) {
        this(i10, str, (i11 & 4) != 0 ? null : th, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2);
    }
}
