package com.google.android.datatransport;

import android.os.Looper;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowNetworkMechanism {
    public static final long WinterFlowRouterStructure;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        WinterFlowRouterStructure = j;
    }
}
