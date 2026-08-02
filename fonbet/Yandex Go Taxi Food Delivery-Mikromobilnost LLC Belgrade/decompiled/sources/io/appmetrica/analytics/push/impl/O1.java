package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.provider.api.PushServiceController;
import io.appmetrica.analytics.push.provider.api.PushServiceExecutionRestrictions;

/* loaded from: classes9.dex */
public final class O1 implements F {
    @Override // io.appmetrica.analytics.push.impl.F
    public final long a(Context context, Bundle bundle) {
        Long maxTaskExecutionDurationSeconds;
        long j = bundle.getLong(CoreConstants.MIN_PROCESSING_DELAY, -1L);
        String string = bundle.getString(CoreConstants.EXTRA_TRANSPORT, "unknown");
        Long valueOf = Long.valueOf(j);
        long j2 = 0;
        if (j < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0L;
        }
        long longValue = valueOf.longValue();
        C1018c2 c1018c2 = r.a(context).d;
        if (c1018c2 != null) {
            PushServiceController pushServiceController = (PushServiceController) c1018c2.b.get(string);
            PushServiceExecutionRestrictions executionRestrictions = pushServiceController != null ? pushServiceController.getExecutionRestrictions() : null;
            if (executionRestrictions != null && (maxTaskExecutionDurationSeconds = executionRestrictions.getMaxTaskExecutionDurationSeconds()) != null) {
                j2 = maxTaskExecutionDurationSeconds.longValue();
            }
        }
        return Math.min(longValue, j2);
    }
}
