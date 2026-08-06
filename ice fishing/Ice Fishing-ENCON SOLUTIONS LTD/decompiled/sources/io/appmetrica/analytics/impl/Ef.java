package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.Application;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

@DoNotInline
@TargetApi(28)
/* loaded from: classes.dex */
public final class Ef implements Cf {
    @Override // io.appmetrica.analytics.impl.Cf
    public String a() {
        String processName;
        processName = Application.getProcessName();
        return processName;
    }
}
