package com.google.android.datatransport;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheCache implements OnBackAnimationCallback {
    public final /* synthetic */ WinterFlowScriptEngine WinterFlowRouterStructure;

    public WinterFlowCacheCache(WinterFlowScriptEngine winterFlowScriptEngine) {
        this.WinterFlowRouterStructure = winterFlowScriptEngine;
    }

    public final void onBackCancelled() {
        WinterFlowScriptEngine winterFlowScriptEngine = this.WinterFlowRouterStructure;
        WinterFlowStackProvider winterFlowStackProvider = winterFlowScriptEngine.WinterFlowRouterStructure;
        if (winterFlowStackProvider == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This input is not added to any dispatcher.");
            return;
        }
        if (!winterFlowScriptEngine.WinterFlowHookDataSource) {
            winterFlowStackProvider.WinterFlowRouterRouter(winterFlowScriptEngine, null);
        }
        WinterFlowProtocolInterface winterFlowProtocolInterface = (WinterFlowProtocolInterface) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
        if (winterFlowScriptEngine.equals(winterFlowProtocolInterface.WinterFlowRouterRouter) && -1 == winterFlowProtocolInterface.WinterFlowUnitTestResponse) {
            WinterFlowStackIDE winterFlowStackIDE = winterFlowProtocolInterface.WinterFlowTransactionManagerStrategy;
            if (winterFlowStackIDE == null) {
                winterFlowStackIDE = winterFlowProtocolInterface.WinterFlowCacheManagerAgent(-1);
            }
            winterFlowProtocolInterface.WinterFlowTransactionManagerStrategy = null;
            winterFlowProtocolInterface.WinterFlowUnitTestResponse = 0;
            winterFlowProtocolInterface.WinterFlowRouterRouter = null;
            if (winterFlowStackIDE != null) {
                winterFlowStackIDE.WinterFlowRouterStructure();
            }
            winterFlowProtocolInterface.WinterFlowRouterStructure.WinterFlowTransactionAgent(null, WinterFlowFunctionModule.WinterFlowSingletonPlatform);
        }
        winterFlowScriptEngine.WinterFlowHookDataSource = false;
    }

    public final void onBackInvoked() {
        this.WinterFlowRouterStructure.WinterFlowRouterStructure();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        WinterFlowSessionUserManager WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowResponseEngine(backEvent);
        WinterFlowScriptEngine winterFlowScriptEngine = this.WinterFlowRouterStructure;
        WinterFlowStackProvider winterFlowStackProvider = winterFlowScriptEngine.WinterFlowRouterStructure;
        if (winterFlowStackProvider == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This input is not added to any dispatcher.");
            return;
        }
        if (winterFlowScriptEngine.WinterFlowHookDataSource) {
            WinterFlowProtocolInterface winterFlowProtocolInterface = (WinterFlowProtocolInterface) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
            if (winterFlowScriptEngine.equals(winterFlowProtocolInterface.WinterFlowRouterRouter) && -1 == winterFlowProtocolInterface.WinterFlowUnitTestResponse) {
                WinterFlowStackIDE winterFlowStackIDE = winterFlowProtocolInterface.WinterFlowTransactionManagerStrategy;
                if (winterFlowStackIDE == null) {
                    winterFlowStackIDE = winterFlowProtocolInterface.WinterFlowCacheManagerAgent(-1);
                }
                if (winterFlowStackIDE != null) {
                    winterFlowStackIDE.WinterFlowCacheManagerAgent(WinterFlowResponseEngine);
                }
                winterFlowProtocolInterface.WinterFlowRouterStructure.WinterFlowTransactionAgent(null, new WinterFlowSyntaxPlatform(WinterFlowResponseEngine));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        WinterFlowSessionUserManager WinterFlowResponseEngine = WinterFlowInvokerComponent.WinterFlowResponseEngine(backEvent);
        WinterFlowScriptEngine winterFlowScriptEngine = this.WinterFlowRouterStructure;
        WinterFlowStackProvider winterFlowStackProvider = winterFlowScriptEngine.WinterFlowRouterStructure;
        if (winterFlowStackProvider == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This input is not added to any dispatcher.");
        } else {
            if (winterFlowScriptEngine.WinterFlowHookDataSource) {
                return;
            }
            winterFlowStackProvider.WinterFlowRouterRouter(winterFlowScriptEngine, WinterFlowResponseEngine);
            winterFlowScriptEngine.WinterFlowHookDataSource = true;
        }
    }
}
