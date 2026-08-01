package com.google.android.datatransport;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowThreadPoolBatch {
    public static final List WinterFlowRouterStructure;

    static {
        try {
            WinterFlowRouterStructure = WinterFlowFrontendSubsystem.WinterFlowBandwidthObject(WinterFlowFrontendSubsystem.WinterFlowThreadListener(Arrays.asList(new WinterFlowUIStructure()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
