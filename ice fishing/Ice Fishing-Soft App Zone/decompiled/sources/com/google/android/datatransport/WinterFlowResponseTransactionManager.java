package com.google.android.datatransport;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseTransactionManager extends WinterFlowThreadPoolSystem {
    public static final WinterFlowModuleFunction WinterFlowArrayNetwork = new WinterFlowModuleFunction(0);
    public static WinterFlowResponseTransactionManager WinterFlowCacheManagerAgent;
    public final Application WinterFlowHookDataSource;

    public WinterFlowResponseTransactionManager(Application application) {
        this.WinterFlowHookDataSource = application;
    }

    public final WinterFlowTransactionVariable WinterFlowArrayNetwork(Class cls, Application application) {
        if (!WinterFlowRouterPipeline.class.isAssignableFrom(cls)) {
            return WinterFlowHandlerWebsocket.WinterFlowOrchestrationSubsystem(cls);
        }
        try {
            WinterFlowTransactionVariable winterFlowTransactionVariable = (WinterFlowTransactionVariable) cls.getConstructor(Application.class).newInstance(application);
            winterFlowTransactionVariable.getClass();
            return winterFlowTransactionVariable;
        } catch (IllegalAccessException e) {
            WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolSystem, com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowCacheManagerAgent(Class cls, WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool) {
        if (this.WinterFlowHookDataSource != null) {
            return WinterFlowRouterStructure(cls);
        }
        Application application = (Application) winterFlowServiceProviderThreadPool.WinterFlowRouterStructure.get(WinterFlowArrayNetwork);
        if (application != null) {
            return WinterFlowArrayNetwork(cls, application);
        }
        if (!WinterFlowRouterPipeline.class.isAssignableFrom(cls)) {
            return WinterFlowHandlerWebsocket.WinterFlowOrchestrationSubsystem(cls);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolSystem, com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowRouterStructure(Class cls) {
        Application application = this.WinterFlowHookDataSource;
        if (application != null) {
            return WinterFlowArrayNetwork(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
