package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.WinterFlowCompilerMechanism;
import com.google.android.datatransport.WinterFlowConfigurationDeserialization;
import com.google.android.datatransport.WinterFlowDeserializationPlatform;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowFrameworkTool;
import com.google.android.datatransport.WinterFlowInvokerComponent;
import com.google.android.datatransport.WinterFlowJSONUnitTest;
import com.google.android.datatransport.WinterFlowListenerSystem;
import com.google.android.datatransport.WinterFlowOrchestrationConcurrency;
import com.google.android.datatransport.WinterFlowProxySubsystem;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowSessionManagerProcess;
import com.google.android.datatransport.WinterFlowStrategyConcurrency;
import com.google.android.datatransport.WinterFlowTransactionManagerConfiguration;
import com.google.android.datatransport.WinterFlowValidatorProcess;
import com.google.android.datatransport.WinterFlowWidgetSingleton;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String WinterFlowRouterStructure(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowListenerSystem.class));
        for (Class cls : new Class[0]) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(cls, "Null interface");
            hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls));
        }
        WinterFlowOrchestrationConcurrency winterFlowOrchestrationConcurrency = new WinterFlowOrchestrationConcurrency(2, 0, WinterFlowConfigurationDeserialization.class);
        String str = null;
        if (hashSet.contains(winterFlowOrchestrationConcurrency.WinterFlowRouterStructure)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(winterFlowOrchestrationConcurrency);
        arrayList.add(new WinterFlowQueueManager(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new WinterFlowCompilerMechanism(11), hashSet3));
        WinterFlowValidatorProcess winterFlowValidatorProcess = new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, Executor.class);
        WinterFlowProxySubsystem winterFlowProxySubsystem = new WinterFlowProxySubsystem(WinterFlowDeserializationPlatform.class, WinterFlowFrameworkTool.class, WinterFlowJSONUnitTest.class);
        winterFlowProxySubsystem.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(Context.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(WinterFlowSyntaxEvent.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(2, 0, WinterFlowSessionManagerProcess.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(1, 1, WinterFlowListenerSystem.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(winterFlowValidatorProcess, 1, 0));
        winterFlowProxySubsystem.WinterFlowTransactionManagerStrategy = new WinterFlowStrategyConcurrency(winterFlowValidatorProcess, i);
        arrayList.add(winterFlowProxySubsystem.WinterFlowHookDataSource());
        arrayList.add(WinterFlowInvokerComponent.WinterFlowSingletonPlatform("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowSingletonPlatform("fire-core", "22.0.1"));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowSingletonPlatform("device-name", WinterFlowRouterStructure(Build.PRODUCT)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowSingletonPlatform("device-model", WinterFlowRouterStructure(Build.DEVICE)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowSingletonPlatform("device-brand", WinterFlowRouterStructure(Build.BRAND)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowResolverController("android-target-sdk", new WinterFlowCompilerMechanism(21)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowResolverController("android-min-sdk", new WinterFlowCompilerMechanism(22)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowResolverController("android-platform", new WinterFlowCompilerMechanism(23)));
        arrayList.add(WinterFlowInvokerComponent.WinterFlowResolverController("android-installer", new WinterFlowCompilerMechanism(24)));
        try {
            WinterFlowWidgetSingleton.WinterFlowTransactionManagerStrategy.getClass();
            str = "2.4.10";
        } catch (NoClassDefFoundError unused) {
        }
        if (str != null) {
            arrayList.add(WinterFlowInvokerComponent.WinterFlowSingletonPlatform("kotlin", str));
        }
        return arrayList;
    }
}
