package io.appmetrica.analytics.rtmwrapper.impl;

import android.content.Context;
import io.appmetrica.analytics.rtm.internal.service.DefaultValuesProvider;
import io.appmetrica.analytics.rtmwrapper.internal.RtmDefaultValuesProvider;

/* loaded from: classes9.dex */
public final class b implements DefaultValuesProvider {
    public final RtmDefaultValuesProvider a;

    public b(RtmDefaultValuesProvider rtmDefaultValuesProvider) {
        this.a = rtmDefaultValuesProvider;
    }

    @Override // io.appmetrica.analytics.rtm.internal.service.DefaultValuesProvider
    public final String getDeviceType(Context context) {
        return this.a.getDeviceType(context);
    }

    @Override // io.appmetrica.analytics.rtm.internal.service.DefaultValuesProvider
    public final String getVersion(Context context) {
        return this.a.getVersion(context);
    }
}
