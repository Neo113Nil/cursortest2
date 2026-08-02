package com.squareup.cash.observability.backend.real;

import com.datadog.android.rum.RumMonitor;
import com.squareup.cash.observability.backend.api.ViewTracking;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RealDatadogViewTracking implements ViewTracking {
    public final RumMonitor rumMonitor;
    public final String viewKey;

    public RealDatadogViewTracking(String str, RumMonitor rumMonitor) {
        rumMonitor.getClass();
        this.viewKey = str;
        this.rumMonitor = rumMonitor;
    }

    public final void viewEnded(Map map) {
        map.getClass();
        this.rumMonitor.stopView(map, this.viewKey);
    }
}
