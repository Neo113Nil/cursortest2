package ru.yandex.taxi.exception;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b1k0;
import defpackage.bvu0;
import defpackage.bzd0;
import defpackage.l76;
import defpackage.meu;
import defpackage.qv10;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/exception/HttpRetryAfterException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "getCode", "()I", "Lb1k0;", "retryAction", "Lb1k0;", "getRetryAction", "()Lb1k0;", "", "delayMs", "J", "b", "()J", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "go-client-android.libs:network_utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpRetryAfterException extends RuntimeException {
    private final int code;
    private final long delayMs;
    private final String message;
    private final b1k0 retryAction;

    public HttpRetryAfterException(int i, meu meuVar) {
        b1k0 bzd0Var;
        this.code = i;
        String a = meuVar.a("X-YaTaxi-Retry-Action");
        if (a == null) {
            bzd0Var = new bzd0(((long) Math.pow(2.0d, 0)) * 500, 3);
        } else if (a.equals("stop")) {
            bzd0Var = l76.S;
        } else {
            String a2 = meuVar.a("Retry-After");
            String a3 = meuVar.a("X-YaTaxi-Retry-Interval-Ms");
            Long m = a3 != null ? bvu0.m(10, a3) : null;
            bzd0Var = a2 != null ? new bzd0(a2, meuVar.a("Date")) : (m == null || m.longValue() <= 0) ? new bzd0(((long) Math.pow(2.0d, 0)) * 500, 3) : new bzd0(m.longValue(), 3);
        }
        this.retryAction = bzd0Var;
        this.delayMs = bzd0Var.d();
        long d = bzd0Var.d();
        this.message = d == 0 ? "The request processing has not been completed and delay was not specified" : d == -1 ? "The request processing has not been completed with bad formatted delay" : d == -2 ? "The request processing has not been completed and server date header was missing" : qv10.k(d, "The request processing has not been completed retry after ", " seconds");
    }

    public final int a() {
        return (int) this.delayMs;
    }

    /* renamed from: b, reason: from getter */
    public final long getDelayMs() {
        return this.delayMs;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
