package com.google.android.datatransport;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowTransactionManagerEvent extends WinterFlowHandlerWebsocket {
    public WinterFlowNodeSerializer WinterFlowBatchUI;
    public long WinterFlowRouterAdapter = 9205357640488583168L;

    public abstract Shader WinterFlowCloudMicroservice(long j);

    @Override // com.google.android.datatransport.WinterFlowHandlerWebsocket
    public final void WinterFlowUnitTestResponse(float f, long j, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        Paint paint = (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource;
        WinterFlowNodeSerializer winterFlowNodeSerializer = this.WinterFlowBatchUI;
        if (winterFlowNodeSerializer == null || !WinterFlowModuleBandwidth.WinterFlowRouterStructure(this.WinterFlowRouterAdapter, j)) {
            if (WinterFlowModuleBandwidth.WinterFlowCacheManagerAgent(j)) {
                this.WinterFlowBatchUI = null;
                this.WinterFlowRouterAdapter = 9205357640488583168L;
                winterFlowNodeSerializer = null;
            } else {
                winterFlowNodeSerializer = this.WinterFlowBatchUI;
                if (winterFlowNodeSerializer == null) {
                    winterFlowNodeSerializer = new WinterFlowNodeSerializer();
                    this.WinterFlowBatchUI = winterFlowNodeSerializer;
                }
                winterFlowNodeSerializer.WinterFlowVariableVersionControl = WinterFlowCloudMicroservice(j);
                this.WinterFlowBatchUI = winterFlowNodeSerializer;
                this.WinterFlowRouterAdapter = j;
            }
        }
        long WinterFlowArrayNetwork = WinterFlowInvokerComponent.WinterFlowArrayNetwork(paint.getColor());
        long j2 = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource;
        if (!WinterFlowUnitTestSoftware.WinterFlowRouterStructure(WinterFlowArrayNetwork, j2)) {
            winterFlowProtocolPlatform.WinterFlowVariableVersionControl(j2);
        }
        if (!WinterFlowManagerRequest.WinterFlowThreadListener((Shader) winterFlowProtocolPlatform.WinterFlowCacheManagerAgent, winterFlowNodeSerializer != null ? (Shader) winterFlowNodeSerializer.WinterFlowVariableVersionControl : null)) {
            winterFlowProtocolPlatform.WinterFlowUnitTestResponse(winterFlowNodeSerializer != null ? (Shader) winterFlowNodeSerializer.WinterFlowVariableVersionControl : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        winterFlowProtocolPlatform.WinterFlowCacheManagerAgent(f);
    }
}
