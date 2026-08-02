package io.appmetrica.analytics.rtm.internal.service;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface DefaultValuesProvider {
    String getDeviceType(@NonNull Context context);

    String getVersion(@NonNull Context context);
}
