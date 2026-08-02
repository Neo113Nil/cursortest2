package defpackage;

import com.yandex.go.payments.shared.SharedAccountUnavailableException;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.io.InterruptedIOException;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.exception.ApiException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes13.dex */
public final class zor0 {
    public final zuj0 a;
    public final wnt b;

    public zor0(zuj0 zuj0Var, wnt wntVar) {
        this.a = zuj0Var;
        this.b = wntVar;
    }

    public final String a(Throwable th) {
        String str;
        BufferedInputStream N;
        Throwable cause;
        String str2 = null;
        SharedAccountUnavailableException sharedAccountUnavailableException = th instanceof SharedAccountUnavailableException ? (SharedAccountUnavailableException) th : null;
        Throwable th2 = (sharedAccountUnavailableException == null || (cause = sharedAccountUnavailableException.getCause()) == null) ? th : cause;
        boolean z = th2 instanceof GoApiOtherException;
        Throwable original = z ? ((GoApiOtherException) th2).getOriginal() : th2;
        boolean z2 = original instanceof ApiException;
        zuj0 zuj0Var = this.a;
        if (z2) {
            str = original.getMessage();
        } else if (s8o.A(original)) {
            str = ((avj0) zuj0Var).h(kyh0.network_error);
        } else {
            if (s8o.x(original) && (N = s8o.N(original)) != null) {
                try {
                    b bVar = (b) ((c) ((xnt) this.b).b(N, c.Companion.serializer())).get(Constants.KEY_MESSAGE);
                    if (bVar != null) {
                        str = qcx.n(bVar).a();
                    }
                } catch (Exception e) {
                    jst.e.k(e, "SharedPayments: can't parse exception description");
                }
            }
            str = null;
        }
        if (str != null && str.length() > 0) {
            str2 = str;
        }
        if (str2 != null) {
            return str2;
        }
        if (!s8o.E(th2)) {
            if (!(z ? ((GoApiOtherException) th2).getOriginal() instanceof InterruptedIOException : th2 instanceof InterruptedIOException)) {
                xby.l(jst.e, "B2B.TOKEN_ERROR:UNRECOGNIZED_ERROR", null, th2, "Shared payments error without a server message", 2);
                return ((avj0) zuj0Var).h(kyh0.common_unknown_error);
            }
        }
        return ((avj0) zuj0Var).h(kyh0.common_server_error);
    }
}
