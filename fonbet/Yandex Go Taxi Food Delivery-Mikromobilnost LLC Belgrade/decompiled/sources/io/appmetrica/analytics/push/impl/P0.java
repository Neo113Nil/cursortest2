package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.PushServiceFacade;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.provider.api.PushServiceController;

/* loaded from: classes9.dex */
public final class P0 implements D {
    @Override // io.appmetrica.analytics.push.impl.D
    public final void a(Context context, Bundle bundle) {
        r a = r.a(context);
        C1018c2 c1018c2 = a.d;
        if (c1018c2 != null) {
            for (PushServiceController pushServiceController : c1018c2.b.values()) {
                if (pushServiceController.register()) {
                    PushServiceFacade.initToken(c1018c2.a, pushServiceController.getTransportId());
                }
            }
        } else {
            PublicLogger.INSTANCE.info("PushServiceController is null", new Object[0]);
        }
        PushServiceFacade.sendSystemInfo(context, null);
        y2 y2Var = a.e;
        if (y2Var == null) {
            PublicLogger.INSTANCE.info("TokenManager is null", new Object[0]);
            return;
        }
        synchronized (y2Var) {
            y2Var.c();
        }
    }
}
