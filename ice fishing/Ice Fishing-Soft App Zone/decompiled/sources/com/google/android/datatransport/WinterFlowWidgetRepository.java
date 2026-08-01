package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetRepository {
    public float WinterFlowCacheManagerAgent;
    public final WinterFlowXMLStack WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowWidgetRepository(int i, WinterFlowXMLStack winterFlowXMLStack) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = winterFlowXMLStack;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(float f, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowQueryHandler winterFlowQueryHandler;
        int i;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowQueryHandler) {
            winterFlowQueryHandler = (WinterFlowQueryHandler) winterFlowOrchestrationCompiler;
            int i2 = winterFlowQueryHandler.WinterFlowResponseEngine;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowQueryHandler.WinterFlowResponseEngine = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowQueryHandler.WinterFlowRouterRouter;
                i = winterFlowQueryHandler.WinterFlowResponseEngine;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    Float f2 = new Float(f);
                    winterFlowQueryHandler.WinterFlowResponseEngine = 1;
                    obj = this.WinterFlowHookDataSource.WinterFlowVariableVersionControl(f2, winterFlowQueryHandler);
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                this.WinterFlowCacheManagerAgent += ((Number) obj).floatValue();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        }
        winterFlowQueryHandler = new WinterFlowQueryHandler(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowQueryHandler.WinterFlowRouterRouter;
        i = winterFlowQueryHandler.WinterFlowResponseEngine;
        if (i != 0) {
        }
        this.WinterFlowCacheManagerAgent += ((Number) obj2).floatValue();
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
