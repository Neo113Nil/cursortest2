package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.model.BasePushMessage;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes9.dex */
public final class N1 implements D {
    @Override // io.appmetrica.analytics.push.impl.D
    public final void a(Context context, Bundle bundle) {
        C1080v c1080v = r.a(context).f;
        if (c1080v.c == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.c == null) {
                        c1080v.c = new C1084w0();
                    }
                } finally {
                }
            }
        }
        c1080v.c.getClass();
        if (bundle == null) {
            PublicLogger.INSTANCE.warning("Received push message with empty data bundle", new Object[0]);
            TrackersHub.getInstance().reportError("Receive push message with empty bundle", null);
        } else {
            if (!new BasePushMessage(bundle).getIsOwnPush()) {
                PublicLogger.INSTANCE.info("Receive not recognized push message", new Object[0]);
                return;
            }
            PushMessage pushMessage = new PushMessage(context, bundle);
            try {
                C1084w0.a(context, pushMessage);
            } catch (Throwable th) {
                C1084w0.a(pushMessage, "Failed to process push", th.getMessage());
            }
        }
    }
}
