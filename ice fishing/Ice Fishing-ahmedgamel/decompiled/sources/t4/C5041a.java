package t4;

import kotlin.jvm.internal.e;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5041a extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ C5041a(int i, String str, Integer num, int i4, e eVar) {
        this(i, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : num);
    }

    public final String getResponse() {
        return this.response;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C5041a(int i, String str, Integer num) {
        this.statusCode = i;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
