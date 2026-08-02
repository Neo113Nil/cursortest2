package io.appmetrica.analytics.rtmwrapper.internal;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface RtmDefaultValuesProvider {
    @NonNull
    String getDeviceType(@NonNull Context context);

    @NonNull
    String getVersion(@NonNull Context context);
}
