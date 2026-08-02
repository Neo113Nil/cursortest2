package com.datadog.android.core.internal.system;

import android.content.Context;

/* loaded from: classes4.dex */
public interface SystemInfoProvider {
    SystemInfo getLatestSystemInfo();

    void unregister(Context context);
}
