package t4;

import kotlin.jvm.internal.e;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5040a extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ C5040a(int i, String str, Integer num, int i6, e eVar) {
        this(i, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : num);
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

    public C5040a(int i, String str, Integer num) {
        this.statusCode = i;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
