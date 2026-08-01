package com.google.android.datatransport;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerDatabase extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowCacheManagerDatabase(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowSyntaxTransactionManager;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = ((WinterFlowDeserializationEventEmitter) obj).WinterFlowRouterStructure;
                WinterFlowHookMechanism winterFlowHookMechanism = (WinterFlowHookMechanism) winterFlowSyntaxTransactionManager.getFocusOwner();
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2 = winterFlowHookMechanism.WinterFlowRouterStructure;
                WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                if (WinterFlowTransactionManagerStrategy == null || !WinterFlowTransactionManagerStrategy.WinterFlowVariableBandwidth || !winterFlowSyntaxTransactionManager2.WinterFlowSerializerStructure(i2)) {
                    WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                    winterFlowBandwidthCache.WinterFlowVariableVersionControl = Boolean.FALSE;
                    WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy2 = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                    Boolean WinterFlowVariableVersionControl = winterFlowHookMechanism.WinterFlowVariableVersionControl(i2, winterFlowSyntaxTransactionManager2.getEmbeddedViewFocusRect(), new WinterFlowInterfaceBackend(winterFlowBandwidthCache, i2));
                    if ((!WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowVariableVersionControl, Boolean.TRUE) || WinterFlowTransactionManagerStrategy2 == winterFlowHookMechanism.WinterFlowTransactionManagerStrategy()) && WinterFlowVariableVersionControl != null && winterFlowBandwidthCache.WinterFlowVariableVersionControl != null && WinterFlowVariableVersionControl.booleanValue()) {
                        ((Boolean) winterFlowBandwidthCache.WinterFlowVariableVersionControl).getClass();
                        break;
                    }
                }
                break;
            default:
                WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) obj;
                winterFlowSyntaxTransactionManager.getUncaughtExceptionHandler$ui();
                Handler handler = winterFlowSyntaxTransactionManager.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = winterFlowSyntaxTransactionManager.getHandler();
                    if (handler2 != null) {
                        handler2.post(new WinterFlowUserManagerFramework(1, winterFlowObjectUI));
                        break;
                    }
                } else {
                    winterFlowObjectUI.WinterFlowRouterStructure();
                    break;
                }
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
