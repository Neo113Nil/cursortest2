package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowListenerProtocol {
    public static final WinterFlowOrchestrationSystem WinterFlowRouterStructure;

    static {
        WinterFlowOrchestrationSystem winterFlowOrchestrationSystem = null;
        try {
            winterFlowOrchestrationSystem = (WinterFlowOrchestrationSystem) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (winterFlowOrchestrationSystem == null) {
            winterFlowOrchestrationSystem = new WinterFlowOrchestrationSystem();
        }
        WinterFlowRouterStructure = winterFlowOrchestrationSystem;
    }

    public static WinterFlowEventEmitterCacheManager WinterFlowRouterStructure(Class cls) {
        WinterFlowRouterStructure.getClass();
        return new WinterFlowEventEmitterCacheManager(cls);
    }
}
