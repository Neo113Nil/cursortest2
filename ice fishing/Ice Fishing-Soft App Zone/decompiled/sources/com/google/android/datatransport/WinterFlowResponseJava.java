package com.google.android.datatransport;

import android.content.Context;
import android.os.Build;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseJava implements WinterFlowWorkerHelper {
    public static boolean WinterFlowTransactionManagerStrategy = true;
    public boolean WinterFlowArrayNetwork;
    public WinterFlowOrchestrationHelper WinterFlowCacheManagerAgent;
    public final Object WinterFlowHookDataSource = new Object();
    public final WinterFlowSyntaxTransactionManager WinterFlowRouterStructure;
    public final WinterFlowVariableLayer WinterFlowVariableVersionControl;

    public WinterFlowResponseJava(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        this.WinterFlowRouterStructure = winterFlowSyntaxTransactionManager;
        WinterFlowVariableLayer winterFlowVariableLayer = new WinterFlowVariableLayer();
        this.WinterFlowVariableVersionControl = winterFlowVariableLayer;
        if (winterFlowSyntaxTransactionManager.isAttachedToWindow()) {
            Context context = winterFlowSyntaxTransactionManager.getContext();
            if (!this.WinterFlowArrayNetwork) {
                context.getApplicationContext().registerComponentCallbacks(winterFlowVariableLayer);
                this.WinterFlowArrayNetwork = true;
            }
        }
        winterFlowSyntaxTransactionManager.addOnAttachStateChangeListener(new WinterFlowMapperComponent(0, this));
    }

    public final WinterFlowProtocolDataSource WinterFlowCacheManagerAgent(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        WinterFlowOrchestrationHelper winterFlowOrchestrationHelper = this.WinterFlowCacheManagerAgent;
        if (winterFlowOrchestrationHelper != null) {
            return winterFlowOrchestrationHelper;
        }
        WinterFlowOrchestrationHelper winterFlowOrchestrationHelper2 = new WinterFlowOrchestrationHelper(winterFlowSyntaxTransactionManager.getContext());
        winterFlowOrchestrationHelper2.setClipChildren(false);
        winterFlowOrchestrationHelper2.setClipToPadding(false);
        winterFlowOrchestrationHelper2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        winterFlowSyntaxTransactionManager.addView(winterFlowOrchestrationHelper2, -1);
        this.WinterFlowCacheManagerAgent = winterFlowOrchestrationHelper2;
        return winterFlowOrchestrationHelper2;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerHelper
    public final WinterFlowObjectMicroservice WinterFlowHookDataSource() {
        WinterFlowProtocolVersion winterFlowInvokerProtocol;
        WinterFlowProtocolVersion winterFlowProtocolVersion;
        WinterFlowObjectMicroservice winterFlowObjectMicroservice;
        synchronized (this.WinterFlowHookDataSource) {
            try {
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowRouterStructure;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    winterFlowSyntaxTransactionManager.getUniqueDrawingId();
                }
                if (i >= 29) {
                    winterFlowProtocolVersion = new WinterFlowDecoratorValidator();
                } else {
                    if (WinterFlowTransactionManagerStrategy) {
                        try {
                            winterFlowInvokerProtocol = new WinterFlowStackEntity(this.WinterFlowRouterStructure, new WinterFlowGatewayDeserialization(), new WinterFlowCacheThread());
                        } catch (Throwable unused) {
                            WinterFlowTransactionManagerStrategy = false;
                            winterFlowInvokerProtocol = new WinterFlowInvokerProtocol(WinterFlowCacheManagerAgent(this.WinterFlowRouterStructure));
                        }
                    } else {
                        winterFlowInvokerProtocol = new WinterFlowInvokerProtocol(WinterFlowCacheManagerAgent(this.WinterFlowRouterStructure));
                    }
                    winterFlowProtocolVersion = winterFlowInvokerProtocol;
                }
                winterFlowObjectMicroservice = new WinterFlowObjectMicroservice(winterFlowProtocolVersion);
            } catch (Throwable th) {
                throw th;
            }
        }
        return winterFlowObjectMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerHelper
    public final void WinterFlowRouterStructure(WinterFlowObjectMicroservice winterFlowObjectMicroservice) {
        synchronized (this.WinterFlowHookDataSource) {
            if (!winterFlowObjectMicroservice.WinterFlowVariableBandwidth) {
                winterFlowObjectMicroservice.WinterFlowVariableBandwidth = true;
                winterFlowObjectMicroservice.WinterFlowHookDataSource();
            }
        }
    }
}
