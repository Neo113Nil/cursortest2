package defpackage;

import android.os.SystemClock;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechApiCallAttemptResultResult;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.FailDataResponse;
import com.ybsdk.core.utils.dto.OldDataWithStatusResponse;
import com.ybsdk.core.utils.dto.OldFailDataResponse;
import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.RequestStatus;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import java.util.LinkedHashMap;
import retrofit2.Call;

/* loaded from: classes8.dex */
public final class u0k0 implements lp50 {
    public final AppAnalyticsReporter a;
    public final y8j0 b;

    public u0k0(AppAnalyticsReporter appAnalyticsReporter, y8j0 y8j0Var) {
        this.a = appAnalyticsReporter;
        this.b = y8j0Var;
    }

    public static void c(FailDataResponse failDataResponse, String str, String str2) {
        trp0 trp0Var = trp0.a;
        trp0.e(new vqp0(str, failDataResponse != null ? failDataResponse.getDescription() : null, failDataResponse != null ? failDataResponse.getSupportUrl() : null, str2, failDataResponse != null ? failDataResponse.getTechInfo() : null, failDataResponse != null ? failDataResponse.getTitle() : null));
    }

    public static void d(OldFailDataResponse oldFailDataResponse, String str, String str2) {
        trp0 trp0Var = trp0.a;
        trp0.e(new vqp0(str, oldFailDataResponse != null ? oldFailDataResponse.getDescription() : null, oldFailDataResponse != null ? oldFailDataResponse.getSupportUrl() : null, str2, null, oldFailDataResponse != null ? oldFailDataResponse.getError() : null));
    }

    public final void a(Call call, String str, int i) {
        fcy0 fcy0Var = this.a.m0;
        String C = vez0.C(call);
        if (str == null) {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (str != null) {
            linkedHashMap.put("retry_id", str);
        }
        linkedHashMap.put("url", C);
        linkedHashMap.put("attempt", Integer.valueOf(i));
        fcy0Var.a.a("tech.api_call.attempt.start", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Call call, Throwable th, ak7 ak7Var) {
        String str;
        crp0 tqp0Var;
        b7j0 b7j0Var = (b7j0) call.k().c(b7j0.class);
        String str2 = b7j0Var != null ? b7j0Var.a : null;
        kzz0 kzz0Var = (kzz0) this.b.get(str2 != null ? new b7j0(str2) : null);
        String str3 = kzz0Var != null ? kzz0Var.a : null;
        String str4 = str3 == null ? null : str3;
        String str5 = ak7Var.a;
        String str6 = str5 == null ? null : str5;
        if (th instanceof ErrorResponseException) {
            ErrorResponseException errorResponseException = (ErrorResponseException) th;
            int code = errorResponseException.getErrorResponse().getCode();
            d6w d6wVar = uuu.a;
            int i = code / 100;
            if (i == 5 || i == 4) {
                str = str6;
                tqp0Var = new nqp0(errorResponseException.getErrorResponse().getCode(), errorResponseException.getErrorResponse().getMessage(), str4, str, vez0.C(call));
                crp0 crp0Var = tqp0Var;
                fcy0 fcy0Var = this.a.m0;
                String C = vez0.C(call);
                String str7 = str4;
                int i2 = ak7Var.c;
                String str8 = str;
                TechEvents$TechApiCallAttemptResultResult techEvents$TechApiCallAttemptResultResult = TechEvents$TechApiCallAttemptResultResult.ERROR;
                String message = th.getMessage();
                k1k0 k1k0Var = ak7Var.b;
                fcy0Var.a(str8, C, i2, techEvents$TechApiCallAttemptResultResult, Double.valueOf(SystemClock.elapsedRealtime() - ak7Var.d), k1k0Var != null ? Boolean.valueOf(k1k0Var.c.a(th)) : null, message, str7);
                trp0 trp0Var = trp0.a;
                trp0.e(crp0Var);
            }
        }
        str = str6;
        tqp0Var = ((th instanceof JsonDataException) || (th instanceof JsonEncodingException)) ? new tqp0(vez0.C(call), str4, str, th) : z5b1.f(vez0.C(call), str4, str, th);
        crp0 crp0Var2 = tqp0Var;
        fcy0 fcy0Var2 = this.a.m0;
        String C2 = vez0.C(call);
        String str72 = str4;
        int i22 = ak7Var.c;
        String str82 = str;
        TechEvents$TechApiCallAttemptResultResult techEvents$TechApiCallAttemptResultResult2 = TechEvents$TechApiCallAttemptResultResult.ERROR;
        String message2 = th.getMessage();
        k1k0 k1k0Var2 = ak7Var.b;
        fcy0Var2.a(str82, C2, i22, techEvents$TechApiCallAttemptResultResult2, Double.valueOf(SystemClock.elapsedRealtime() - ak7Var.d), k1k0Var2 != null ? Boolean.valueOf(k1k0Var2.c.a(th)) : null, message2, str72);
        trp0 trp0Var2 = trp0.a;
        trp0.e(crp0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Call call, Object obj, ak7 ak7Var) {
        b7j0 b7j0Var = (b7j0) call.k().c(b7j0.class);
        String str = b7j0Var != null ? b7j0Var.a : null;
        kzz0 kzz0Var = (kzz0) this.b.get(str != null ? new b7j0(str) : null);
        String str2 = kzz0Var != null ? kzz0Var.a : null;
        String str3 = str2 == null ? null : str2;
        String C = vez0.C(call);
        if (obj instanceof TwoFactorAuthResponse) {
            TwoFactorAuthResponse twoFactorAuthResponse = (TwoFactorAuthResponse) obj;
            if (twoFactorAuthResponse.getStatus() == RequestStatus.FAIL) {
                c(twoFactorAuthResponse.getFailData(), C, str3);
                fcy0 fcy0Var = this.a.m0;
                String str4 = ak7Var.a;
                fcy0.b(fcy0Var, str4 != null ? null : str4, vez0.C(call), ak7Var.c, TechEvents$TechApiCallAttemptResultResult.OK, Double.valueOf(SystemClock.elapsedRealtime() - ak7Var.d), null, str3, 96);
            }
        }
        if (obj instanceof DataWithStatusResponse) {
            DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) obj;
            if (dataWithStatusResponse.getStatus() == DataWithStatusResponse.Status.FAIL) {
                c(dataWithStatusResponse.getFailData(), C, str3);
                fcy0 fcy0Var2 = this.a.m0;
                String str42 = ak7Var.a;
                fcy0.b(fcy0Var2, str42 != null ? null : str42, vez0.C(call), ak7Var.c, TechEvents$TechApiCallAttemptResultResult.OK, Double.valueOf(SystemClock.elapsedRealtime() - ak7Var.d), null, str3, 96);
            }
        }
        if (obj instanceof OldDataWithStatusResponse) {
            OldDataWithStatusResponse oldDataWithStatusResponse = (OldDataWithStatusResponse) obj;
            if (oldDataWithStatusResponse.getStatus() == OldDataWithStatusResponse.Status.FAILED) {
                d(oldDataWithStatusResponse.getFailData(), C, str3);
                fcy0 fcy0Var22 = this.a.m0;
                String str422 = ak7Var.a;
                fcy0.b(fcy0Var22, str422 != null ? null : str422, vez0.C(call), ak7Var.c, TechEvents$TechApiCallAttemptResultResult.OK, Double.valueOf(SystemClock.elapsedRealtime() - ak7Var.d), null, str3, 96);
            }
        }
        if (obj instanceof OldTwoFactorAuthResponse) {
            OldTwoFactorAuthResponse oldTwoFactorAuthResponse = (OldTwoFactorAuthResponse) obj;
            if (oldTwoFactorAuthResponse.getStatus() == RequestStatus.FAIL) {
                d(oldTwoFactorAuthResponse.getFailData(), C, str3);
            }
        }
        fcy0 fcy0Var222 = this.a.m0;
        String str4222 = ak7Var.a;
        fcy0.b(fcy0Var222, str4222 != null ? null : str4222, vez0.C(call), ak7Var.c, TechEvents$TechApiCallAttemptResultResult.OK, Double.valueOf(SystemClock.elapsedRealtime() - ak7Var.d), null, str3, 96);
    }
}
