package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProtocolEntity {
    public final WinterFlowJavaServiceProvider WinterFlowRouterStructure;

    public WinterFlowProtocolEntity(WinterFlowObjectUI winterFlowObjectUI) {
        this.WinterFlowRouterStructure = new WinterFlowJavaServiceProvider(winterFlowObjectUI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WinterFlowFunctionThreadPool WinterFlowCacheManagerAgent(WinterFlowRepositoryWorker winterFlowRepositoryWorker, WinterFlowFunctionThreadPool winterFlowFunctionThreadPool) {
        WinterFlowListenerBackend winterFlowListenerBackend = null;
        if (winterFlowFunctionThreadPool instanceof WinterFlowListenerBackend) {
            if (winterFlowRepositoryWorker.WinterFlowArrayNetwork) {
                winterFlowListenerBackend = (WinterFlowListenerBackend) winterFlowFunctionThreadPool;
                winterFlowListenerBackend.WinterFlowRouterStructure.setValue(winterFlowRepositoryWorker.WinterFlowRouterStructure());
            }
        } else if (winterFlowFunctionThreadPool instanceof WinterFlowInterfaceXML) {
            if ((winterFlowRepositoryWorker.WinterFlowHookDataSource || winterFlowRepositoryWorker.WinterFlowVariableVersionControl != null) && !winterFlowRepositoryWorker.WinterFlowArrayNetwork) {
                WinterFlowInterfaceXML winterFlowInterfaceXML = (WinterFlowInterfaceXML) winterFlowFunctionThreadPool;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRepositoryWorker.WinterFlowRouterStructure(), winterFlowInterfaceXML.WinterFlowRouterStructure)) {
                    winterFlowListenerBackend = winterFlowInterfaceXML;
                }
            }
        } else if (winterFlowFunctionThreadPool instanceof WinterFlowParserSerializer) {
            winterFlowRepositoryWorker.getClass();
        }
        if (winterFlowListenerBackend != null) {
            return winterFlowListenerBackend;
        }
        if (!winterFlowRepositoryWorker.WinterFlowArrayNetwork) {
            return new WinterFlowInterfaceXML(winterFlowRepositoryWorker.WinterFlowRouterStructure());
        }
        Object obj = winterFlowRepositoryWorker.WinterFlowVariableVersionControl;
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = winterFlowRepositoryWorker.WinterFlowCacheManagerAgent;
        if (winterFlowSessionManagerProcess == null) {
            winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowResolverController;
        }
        return new WinterFlowListenerBackend(new WinterFlowResolverSubsystem(obj, winterFlowSessionManagerProcess));
    }

    public WinterFlowFunctionThreadPool WinterFlowHookDataSource() {
        return this.WinterFlowRouterStructure;
    }

    public abstract WinterFlowRepositoryWorker WinterFlowRouterStructure(Object obj);
}
