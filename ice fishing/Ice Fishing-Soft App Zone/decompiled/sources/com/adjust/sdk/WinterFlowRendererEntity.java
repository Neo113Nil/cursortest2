package com.adjust.sdk;

import com.adjust.sdk.AdjustLinkResolution;
import java.net.URL;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererEntity implements Runnable {
    public final /* synthetic */ AdjustLinkResolution.AdjustLinkResolutionCallback WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ URL WinterFlowVariableVersionControl;

    public WinterFlowRendererEntity(URL url, AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        this.WinterFlowVariableVersionControl = url;
        this.WinterFlowTransactionManagerStrategy = adjustLinkResolutionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustLinkResolution.requestAndResolve(this.WinterFlowVariableVersionControl, 0, this.WinterFlowTransactionManagerStrategy);
    }
}
