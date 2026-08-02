package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider;

/* loaded from: classes5.dex */
public final class Kl implements RtmDefaultValuesProvider {
    @Override // io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider
    public final String getDeviceType(Context context) {
        return C0747wb.I.v().getSdkEnvironment().getDeviceType();
    }

    @Override // io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider
    public final String getVersion(Context context) {
        return C0747wb.I.v().getSdkEnvironment().getAppVersionInfo().getAppVersionName();
    }
}
