package com.google.android.datatransport;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowVariableObject {
    public static final WinterFlowServerDeserialization WinterFlowCacheManagerAgent;
    public static final WinterFlowServerDeserialization WinterFlowHookDataSource;
    public static final Class WinterFlowRouterStructure;

    static {
        Class<?> cls;
        Class<?> cls2;
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        WinterFlowServerDeserialization winterFlowServerDeserialization = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        WinterFlowRouterStructure = cls;
        try {
            WinterFlowRequestCompiler winterFlowRequestCompiler2 = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                winterFlowServerDeserialization = (WinterFlowServerDeserialization) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        WinterFlowHookDataSource = winterFlowServerDeserialization;
        WinterFlowCacheManagerAgent = new WinterFlowServerDeserialization();
    }

    public static int WinterFlowArrayNetwork(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void WinterFlowBackendCacheManager(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) list.get(i4)).longValue());
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowCacheManagerListener(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void WinterFlowBandwidthObject(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowSerializerStructure(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) list.get(i4)).intValue());
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowMapperProtocol(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void WinterFlowBatchUI(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) list.get(i4)).longValue());
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowCacheManagerListener(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int WinterFlowCacheManagerAgent(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i) + 8) * size;
    }

    public static void WinterFlowConcurrencyThread(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowBatchUI(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowRouterAdapter(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void WinterFlowConsumerUserManager(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowCompilerVariable(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += WinterFlowSessionManagerSingleton.WinterFlowSyntax(((Integer) list.get(i4)).intValue());
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int WinterFlowHookDataSource(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i) + 4) * size;
    }

    public static void WinterFlowMapperProtocol(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                winterFlowSessionManagerSingleton.WinterFlowCompilerVariable(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += WinterFlowSessionManagerSingleton.WinterFlowSyntax((intValue2 >> 31) ^ (intValue2 << 1));
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void WinterFlowOrchestrationSubsystem(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowVariableBandwidth(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void WinterFlowResolverController(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine((longValue2 >> 63) ^ (longValue2 << 1));
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            winterFlowSessionManagerSingleton.WinterFlowCacheManagerListener((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void WinterFlowRouterAdapter(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowVariableBandwidth(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int WinterFlowRouterRouter(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += WinterFlowSessionManagerSingleton.WinterFlowSyntax(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int WinterFlowRouterStructure(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void WinterFlowSerializerStructure(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowBatchUI(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowRouterAdapter(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean WinterFlowServerProtocol(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void WinterFlowServiceUtility(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowBatchUI(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowRouterAdapter(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void WinterFlowSingletonPlatform(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowVariableBandwidth(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int WinterFlowSyntax(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void WinterFlowThreadListener(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowBandwidthObject(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowThreadListener(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void WinterFlowTransactionAgent(WinterFlowServerDeserialization winterFlowServerDeserialization, Object obj, Object obj2) {
        winterFlowServerDeserialization.getClass();
        WinterFlowDecoratorResponse winterFlowDecoratorResponse = (WinterFlowDecoratorResponse) obj;
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = winterFlowDecoratorResponse.unknownFields;
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer2 = ((WinterFlowDecoratorResponse) obj2).unknownFields;
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer3 = WinterFlowFrameworkRenderer.WinterFlowTransactionManagerStrategy;
        if (!winterFlowFrameworkRenderer3.equals(winterFlowFrameworkRenderer2)) {
            if (winterFlowFrameworkRenderer3.equals(winterFlowFrameworkRenderer)) {
                int i = winterFlowFrameworkRenderer.WinterFlowRouterStructure + winterFlowFrameworkRenderer2.WinterFlowRouterStructure;
                int[] copyOf = Arrays.copyOf(winterFlowFrameworkRenderer.WinterFlowHookDataSource, i);
                System.arraycopy(winterFlowFrameworkRenderer2.WinterFlowHookDataSource, 0, copyOf, winterFlowFrameworkRenderer.WinterFlowRouterStructure, winterFlowFrameworkRenderer2.WinterFlowRouterStructure);
                Object[] copyOf2 = Arrays.copyOf(winterFlowFrameworkRenderer.WinterFlowCacheManagerAgent, i);
                System.arraycopy(winterFlowFrameworkRenderer2.WinterFlowCacheManagerAgent, 0, copyOf2, winterFlowFrameworkRenderer.WinterFlowRouterStructure, winterFlowFrameworkRenderer2.WinterFlowRouterStructure);
                winterFlowFrameworkRenderer = new WinterFlowFrameworkRenderer(i, copyOf, copyOf2, true);
            } else {
                winterFlowFrameworkRenderer.getClass();
                if (!winterFlowFrameworkRenderer2.equals(winterFlowFrameworkRenderer3)) {
                    if (!winterFlowFrameworkRenderer.WinterFlowVariableVersionControl) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = winterFlowFrameworkRenderer.WinterFlowRouterStructure + winterFlowFrameworkRenderer2.WinterFlowRouterStructure;
                    winterFlowFrameworkRenderer.WinterFlowRouterStructure(i2);
                    System.arraycopy(winterFlowFrameworkRenderer2.WinterFlowHookDataSource, 0, winterFlowFrameworkRenderer.WinterFlowHookDataSource, winterFlowFrameworkRenderer.WinterFlowRouterStructure, winterFlowFrameworkRenderer2.WinterFlowRouterStructure);
                    System.arraycopy(winterFlowFrameworkRenderer2.WinterFlowCacheManagerAgent, 0, winterFlowFrameworkRenderer.WinterFlowCacheManagerAgent, winterFlowFrameworkRenderer.WinterFlowRouterStructure, winterFlowFrameworkRenderer2.WinterFlowRouterStructure);
                    winterFlowFrameworkRenderer.WinterFlowRouterStructure = i2;
                }
            }
        }
        winterFlowDecoratorResponse.unknownFields = winterFlowFrameworkRenderer;
    }

    public static int WinterFlowTransactionManagerStrategy(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += WinterFlowSessionManagerSingleton.WinterFlowSyntax((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int WinterFlowUnitTestResponse(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static void WinterFlowVariableBandwidth(int i, List list, WinterFlowJSONDecorator winterFlowJSONDecorator, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                winterFlowSessionManagerSingleton.WinterFlowSerializerStructure(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) list.get(i4)).intValue());
        }
        winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(i3);
        while (i2 < list.size()) {
            winterFlowSessionManagerSingleton.WinterFlowMapperProtocol(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int WinterFlowVariableVersionControl(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object WinterFlowResponseEngine(Object obj, int i, WinterFlowXMLDecorator winterFlowXMLDecorator, Object obj2, WinterFlowServerDeserialization winterFlowServerDeserialization) {
        return obj2;
    }
}
