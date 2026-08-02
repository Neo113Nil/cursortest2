package defpackage;

import android.app.Application;
import io.appmetrica.analytics.AppMetrica;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class y60 {
    public final oxa a;

    public y60(Application application, vm7 vm7Var) {
        this.a = new oxa(application, vm7Var);
    }

    public final void a(y70 y70Var) {
        oxa oxaVar = this.a;
        try {
            oxaVar.getClass();
            Map map = y70Var.b;
            String str = y70Var.a;
            if (map != null && !map.isEmpty()) {
                AppMetrica.reportEvent(str, (Map<String, Object>) map);
                return;
            }
            AppMetrica.reportEvent(str);
        } catch (Exception e) {
            ssg.a(7, null, "failed to send " + y70Var + " to " + oxaVar.getClass().getName(), e);
        }
    }

    public final void b(a4f a4fVar) {
        oxa oxaVar = this.a;
        try {
            oxaVar.getClass();
            String str = a4fVar.b;
            String str2 = a4fVar.a;
            if (str != null && !StringsKt.U(str)) {
                AppMetrica.reportEvent(str2, str);
                return;
            }
            AppMetrica.reportEvent(str2);
        } catch (Exception e) {
            ssg.a(7, null, "failed to send " + a4fVar + " to " + oxaVar.getClass().getName(), e);
        }
    }

    public final void c(y70 y70Var, String str) {
        oxa oxaVar = this.a;
        try {
            oxaVar.I(y70Var, str);
        } catch (Exception e) {
            ssg.a(7, null, hrg.r("failed to send ", y70Var.a, " to ", oxaVar.getClass().getName()), e);
        }
    }
}
