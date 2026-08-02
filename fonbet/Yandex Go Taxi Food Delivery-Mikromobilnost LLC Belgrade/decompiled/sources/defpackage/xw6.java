package defpackage;

import android.net.Uri;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final /* synthetic */ class xw6 implements nw6 {
    public final /* synthetic */ zw6 a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ xw6(zw6 zw6Var, Uri uri) {
        this.a = zw6Var;
        this.b = uri;
    }

    public final void a(tmr0 tmr0Var) {
        SharedPaymentsOpenReason sharedPaymentsOpenReason;
        Object obj;
        Uri uri = this.b;
        zw6 zw6Var = this.a;
        zw6Var.c.getClass();
        try {
            String queryParameter = uri.getQueryParameter("open_reason");
            if (queryParameter == null) {
                queryParameter = "";
            }
            Iterator<E> it = SharedPaymentsOpenReason.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((SharedPaymentsOpenReason) obj).getAnalyticsName(), queryParameter)) {
                        break;
                    }
                }
            }
            sharedPaymentsOpenReason = (SharedPaymentsOpenReason) obj;
            if (sharedPaymentsOpenReason == null) {
                xby.l(jst.e, "B2B.TOKEN_ERROR:ONBOARDING_URL", null, new IllegalArgumentException(), "open reason not found param: " + queryParameter, 2);
                sharedPaymentsOpenReason = SharedPaymentsOpenReason.MENU;
            }
        } catch (Throwable th) {
            xby.l(jst.e, "B2B.TOKEN_ERROR:ONBOARDING_URL", null, th, "Error getting open reason", 2);
            sharedPaymentsOpenReason = SharedPaymentsOpenReason.MENU;
        }
        zw6Var.d(new d1(5, zw6Var, tmr0Var, sharedPaymentsOpenReason));
    }
}
