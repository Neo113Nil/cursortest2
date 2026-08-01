package com.google.android.datatransport;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowLibraryModule {
    public static final List WinterFlowRouterStructure = WinterFlowUnitTestLibrary.WinterFlowPackageIDE(Application.class, WinterFlowOrchestrationMapper.class);
    public static final List WinterFlowHookDataSource = WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(WinterFlowOrchestrationMapper.class);

    public static final WinterFlowTransactionVariable WinterFlowHookDataSource(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (WinterFlowTransactionVariable) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    public static final Constructor WinterFlowRouterStructure(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List WinterFlowOrchestrationConfiguration = WinterFlowProtocolPipeline.WinterFlowOrchestrationConfiguration(parameterTypes);
            if (list.equals(WinterFlowOrchestrationConfiguration)) {
                return constructor;
            }
            if (list.size() == WinterFlowOrchestrationConfiguration.size() && WinterFlowOrchestrationConfiguration.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
