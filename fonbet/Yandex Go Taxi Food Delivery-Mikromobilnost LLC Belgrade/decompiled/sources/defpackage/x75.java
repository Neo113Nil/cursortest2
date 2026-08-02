package defpackage;

import android.content.Context;
import com.yandex.plus.metrica.utils.BaseMetricaFacade$Status;
import io.appmetrica.analytics.AppMetrica;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class x75 {
    public final /* synthetic */ oa20 a;
    public final /* synthetic */ y75 b;

    public x75(oa20 oa20Var, y75 y75Var) {
        this.a = oa20Var;
        this.b = y75Var;
    }

    public final String a() {
        Object failure;
        Context context = this.b.a;
        Object obj = null;
        if (!((BaseMetricaFacade$Status) this.a.a.getValue()).getAvailable()) {
            return null;
        }
        try {
            failure = AppMetrica.getDeviceId(context);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            obj = failure;
        } else {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("Metrica8Facade");
            d5z0Var.p(a, "AppMetrica.getDeviceId()".concat(" failed!"), new Object[0]);
        }
        return (String) obj;
    }

    public final String b() {
        Object failure;
        Context context = this.b.a;
        Object obj = null;
        if (!((BaseMetricaFacade$Status) this.a.a.getValue()).getAvailable()) {
            return null;
        }
        try {
            failure = AppMetrica.getUuid(context);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            obj = failure;
        } else {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("Metrica8Facade");
            d5z0Var.p(a, "AppMetrica.getUuid()".concat(" failed!"), new Object[0]);
        }
        return (String) obj;
    }
}
