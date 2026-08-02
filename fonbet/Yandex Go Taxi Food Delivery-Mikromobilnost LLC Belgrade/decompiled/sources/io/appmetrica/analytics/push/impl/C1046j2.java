package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.provider.api.PushServiceController;
import io.appmetrica.analytics.push.provider.api.PushServiceExecutionRestrictions;

/* renamed from: io.appmetrica.analytics.push.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1046j2 implements F {
    @Override // io.appmetrica.analytics.push.impl.F
    public final long a(Context context, Bundle bundle) {
        Long maxTaskExecutionDurationSeconds;
        C1018c2 c1018c2 = r.a(context).d;
        if (c1018c2 == null) {
            return 0L;
        }
        PushServiceController pushServiceController = (PushServiceController) c1018c2.b.get(bundle.getString(CoreConstants.EXTRA_TRANSPORT, "unknown"));
        PushServiceExecutionRestrictions executionRestrictions = pushServiceController != null ? pushServiceController.getExecutionRestrictions() : null;
        if (executionRestrictions == null || (maxTaskExecutionDurationSeconds = executionRestrictions.getMaxTaskExecutionDurationSeconds()) == null) {
            return 0L;
        }
        return maxTaskExecutionDurationSeconds.longValue() / 2;
    }
}
