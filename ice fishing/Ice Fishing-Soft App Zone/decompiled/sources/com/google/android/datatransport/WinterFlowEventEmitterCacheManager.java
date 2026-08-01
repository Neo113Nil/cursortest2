package com.google.android.datatransport;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventEmitterCacheManager implements WinterFlowDeploymentProcess {
    public static final Map WinterFlowHookDataSource;
    public final Class WinterFlowRouterStructure;

    static {
        List WinterFlowPackageIDE = WinterFlowUnitTestLibrary.WinterFlowPackageIDE(WinterFlowObjectUI.class, WinterFlowObjectSession.class, WinterFlowEventEvent.class, WinterFlowControllerScript.class, WinterFlowVersionEngine.class, WinterFlowCacheRouter.class, WinterFlowSingletonSystem.class, WinterFlowEncryptionStructure.class, WinterFlowUnitTestResponse.class, WinterFlowDatabaseSchemaTool.class, WinterFlowViewBackend.class, WinterFlowCacheManagerLibrary.class, WinterFlowListenerEncryption.class, WinterFlowWebsocketSystem.class, WinterFlowDebugMicroservice.class, WinterFlowServerEngine.class, WinterFlowFrameworkRuntime.class, WinterFlowEventClass.class, WinterFlowHandlerEntity.class, WinterFlowProviderUtility.class, WinterFlowHandlerModule.class, WinterFlowCacheEvent.class, WinterFlowBatchJSON.class);
        ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(WinterFlowPackageIDE, 10));
        int i = 0;
        for (Object obj : WinterFlowPackageIDE) {
            int i2 = i + 1;
            if (i < 0) {
                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                throw null;
            }
            arrayList.add(new WinterFlowServerPlatform((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        WinterFlowHookDataSource = WinterFlowDataSourceUtility.WinterFlowModuleAgent(arrayList);
    }

    public WinterFlowEventEmitterCacheManager(Class cls) {
        cls.getClass();
        this.WinterFlowRouterStructure = cls;
    }

    public final boolean WinterFlowArrayNetwork(Object obj) {
        Class cls = this.WinterFlowRouterStructure;
        cls.getClass();
        Map map = WinterFlowHookDataSource;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return WinterFlowUnitTestLibrary.WinterFlowStrategyTool(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = WinterFlowEncryptionSubsystem.WinterFlowStrategyTool(WinterFlowListenerProtocol.WinterFlowRouterStructure(cls));
        }
        return cls.isInstance(obj);
    }

    public final String WinterFlowCacheManagerAgent() {
        String WinterFlowCacheManagerListener;
        Class cls = this.WinterFlowRouterStructure;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String WinterFlowCacheManagerListener2 = WinterFlowServerManager.WinterFlowCacheManagerListener(cls.getName());
                return WinterFlowCacheManagerListener2 == null ? cls.getSimpleName() : WinterFlowCacheManagerListener2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (WinterFlowCacheManagerListener = WinterFlowServerManager.WinterFlowCacheManagerListener(componentType.getName())) != null) {
                str = WinterFlowCacheManagerListener.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return WinterFlowFrameworkStrategy.WinterFlowStrategyTool(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int WinterFlowEventEmitterController = WinterFlowFrameworkStrategy.WinterFlowEventEmitterController(simpleName, '$', 0, 6);
            return WinterFlowEventEmitterController == -1 ? simpleName : simpleName.substring(WinterFlowEventEmitterController + 1, simpleName.length());
        }
        return WinterFlowFrameworkStrategy.WinterFlowStrategyTool(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String WinterFlowHookDataSource() {
        String WinterFlowSyntax;
        Class cls = this.WinterFlowRouterStructure;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String WinterFlowSyntax2 = WinterFlowServerManager.WinterFlowSyntax(cls.getName());
            return WinterFlowSyntax2 == null ? cls.getCanonicalName() : WinterFlowSyntax2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (WinterFlowSyntax = WinterFlowServerManager.WinterFlowSyntax(componentType.getName())) != null) {
            str = WinterFlowSyntax.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    @Override // com.google.android.datatransport.WinterFlowDeploymentProcess
    public final Class WinterFlowRouterStructure() {
        return this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WinterFlowEventEmitterCacheManager) && WinterFlowEncryptionSubsystem.WinterFlowStrategyTool(this).equals(WinterFlowEncryptionSubsystem.WinterFlowStrategyTool((WinterFlowEventEmitterCacheManager) obj));
    }

    public final int hashCode() {
        return WinterFlowEncryptionSubsystem.WinterFlowStrategyTool(this).hashCode();
    }

    public final String toString() {
        return this.WinterFlowRouterStructure.toString() + " (Kotlin reflection is not available)";
    }
}
