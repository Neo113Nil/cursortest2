package com.adjust.sdk;

import com.adjust.sdk.AdjustLinkResolution;
import java.net.URL;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class JadeCircuitPayloadBootstrapDYjhDdNBa1Qf3EboQE28857727008920 implements Runnable {
    public final /* synthetic */ AdjustLinkResolution.AdjustLinkResolutionCallback LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ URL RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public JadeCircuitPayloadBootstrapDYjhDdNBa1Qf3EboQE28857727008920(URL url, AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = url;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = adjustLinkResolutionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustLinkResolution.requestAndResolve(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, 0, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
    }
}
