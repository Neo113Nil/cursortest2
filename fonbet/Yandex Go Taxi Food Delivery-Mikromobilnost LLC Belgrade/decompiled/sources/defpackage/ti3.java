package defpackage;

import com.yandex.messenger.websdk.api.Authentication;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ti3 extends vg41 {
    public static final List d = scc.g("expired_token", "account has been globally logged out", "account is disabled", "account not found");
    public final ew2 c;

    public ti3(ew2 ew2Var, qu quVar) {
        super("onAuthError", false);
        this.c = ew2Var;
    }

    @Override // defpackage.vg41
    public final void a(fqv fqvVar) {
        JSONObject f;
        Object failure;
        Object failure2;
        Object failure3;
        JSONObject a = fqvVar.a();
        int i = 23;
        ew2 ew2Var = this.c;
        if (a == null || (f = hbb1.f(Constants.KEY_DATA, a)) == null) {
            vx21.b(new t7j(i, ew2Var, "No data on onAuthError listener call", new Exception("onAuthError call must contain data")));
            return;
        }
        try {
            failure = Integer.valueOf(f.getInt(ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            vx21.b(new t7j(i, ew2Var, "No httpCode sent on onAuthError listener call", new Exception("onAuthError call must contain httpCode")));
            return;
        }
        int intValue = ((Number) failure).intValue();
        try {
            failure2 = f.getString("responseMessage");
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (Result.a(failure2) != null) {
            vx21.b(new t7j(i, ew2Var, "No responseMessage sent on onAuthError listener call", new Exception("onAuthError call must contain responseMessage")));
            return;
        }
        String str = (String) failure2;
        try {
            failure3 = f.getString("responseBody");
        } catch (Throwable th3) {
            failure3 = new Result.Failure(th3);
        }
        if (failure3 instanceof Result.Failure) {
            failure3 = null;
        }
        String str2 = (String) failure3;
        if (intValue == 401) {
            if ("need_reset".equals(str)) {
                Authentication.NeedTokenRefreshReason needTokenRefreshReason = Authentication.NeedTokenRefreshReason.UNAUTHORIZED;
                return;
            } else if ("unauthorized".equals(str) && a.G(d, str2)) {
                Authentication.NeedTokenRefreshReason needTokenRefreshReason2 = Authentication.NeedTokenRefreshReason.UNAUTHORIZED;
                return;
            }
        }
        if (intValue == 403 && "invalid_auth_scope".equals(str)) {
            Authentication.NeedTokenRefreshReason needTokenRefreshReason3 = Authentication.NeedTokenRefreshReason.UNAUTHORIZED;
        }
    }
}
