package com.google.android.datatransport;

import android.os.Build;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowObjectCache {
    public static final /* synthetic */ int WinterFlowRouterStructure = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            WinterFlowDebugPlatform.WinterFlowCacheManagerAgent(30);
        }
        if (i >= 30) {
            WinterFlowDebugPlatform.WinterFlowCacheManagerAgent(31);
        }
        if (i >= 30) {
            WinterFlowDebugPlatform.WinterFlowCacheManagerAgent(33);
        }
        if (i >= 30) {
            WinterFlowDebugPlatform.WinterFlowCacheManagerAgent(1000000);
        }
    }
}
