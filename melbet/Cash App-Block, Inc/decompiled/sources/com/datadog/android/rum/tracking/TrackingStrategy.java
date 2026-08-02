package com.datadog.android.rum.tracking;

import android.content.Context;
import com.datadog.android.core.InternalSdkCore;

/* loaded from: classes4.dex */
public interface TrackingStrategy {
    void register(InternalSdkCore internalSdkCore, Context context);

    void unregister(Context context);
}
