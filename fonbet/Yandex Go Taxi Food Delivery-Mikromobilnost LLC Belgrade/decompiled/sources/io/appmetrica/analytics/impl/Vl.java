package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider;

/* loaded from: classes9.dex */
public final class Vl implements RtmDefaultValuesProvider {
    @Override // io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider
    public final String getDeviceType(Context context) {
        return Jb.I.v().getSdkEnvironment().getDeviceType();
    }

    @Override // io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider
    public final String getVersion(Context context) {
        return Jb.I.v().getSdkEnvironment().getAppVersionInfo().getAppVersionName();
    }
}
