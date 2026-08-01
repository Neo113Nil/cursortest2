package com.google.firebase.concurrent;

import com.google.android.datatransport.WinterFlowCompilerMechanism;
import com.google.android.datatransport.WinterFlowConsumerException;
import com.google.android.datatransport.WinterFlowEncryptionObject;
import com.google.android.datatransport.WinterFlowInterfaceSystem;
import com.google.android.datatransport.WinterFlowInvokerComponent;
import com.google.android.datatransport.WinterFlowNetworkEvent;
import com.google.android.datatransport.WinterFlowProxySubsystem;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowRendererTransaction;
import com.google.android.datatransport.WinterFlowTransactionManagerConfiguration;
import com.google.android.datatransport.WinterFlowValidatorProcess;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final WinterFlowRendererTransaction WinterFlowRouterStructure = new WinterFlowRendererTransaction(new WinterFlowInterfaceSystem(1));
    public static final WinterFlowRendererTransaction WinterFlowHookDataSource = new WinterFlowRendererTransaction(new WinterFlowInterfaceSystem(2));
    public static final WinterFlowRendererTransaction WinterFlowCacheManagerAgent = new WinterFlowRendererTransaction(new WinterFlowInterfaceSystem(3));
    public static final WinterFlowRendererTransaction WinterFlowArrayNetwork = new WinterFlowRendererTransaction(new WinterFlowInterfaceSystem(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        WinterFlowValidatorProcess winterFlowValidatorProcess = new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, ScheduledExecutorService.class);
        WinterFlowValidatorProcess[] winterFlowValidatorProcessArr = {new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, ExecutorService.class), new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(winterFlowValidatorProcess);
        for (int i = 0; i < 2; i++) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(winterFlowValidatorProcessArr[i], "Null interface");
        }
        Collections.addAll(hashSet, winterFlowValidatorProcessArr);
        WinterFlowQueueManager winterFlowQueueManager = new WinterFlowQueueManager(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new WinterFlowCompilerMechanism(15), hashSet3);
        WinterFlowValidatorProcess winterFlowValidatorProcess2 = new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, ScheduledExecutorService.class);
        WinterFlowValidatorProcess[] winterFlowValidatorProcessArr2 = {new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, ExecutorService.class), new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(winterFlowValidatorProcess2);
        for (int i2 = 0; i2 < 2; i2++) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(winterFlowValidatorProcessArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, winterFlowValidatorProcessArr2);
        WinterFlowQueueManager winterFlowQueueManager2 = new WinterFlowQueueManager(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new WinterFlowCompilerMechanism(16), hashSet6);
        WinterFlowValidatorProcess winterFlowValidatorProcess3 = new WinterFlowValidatorProcess(WinterFlowNetworkEvent.class, ScheduledExecutorService.class);
        WinterFlowValidatorProcess[] winterFlowValidatorProcessArr3 = {new WinterFlowValidatorProcess(WinterFlowNetworkEvent.class, ExecutorService.class), new WinterFlowValidatorProcess(WinterFlowNetworkEvent.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(winterFlowValidatorProcess3);
        for (int i3 = 0; i3 < 2; i3++) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(winterFlowValidatorProcessArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, winterFlowValidatorProcessArr3);
        WinterFlowQueueManager winterFlowQueueManager3 = new WinterFlowQueueManager(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new WinterFlowCompilerMechanism(17), hashSet9);
        WinterFlowProxySubsystem WinterFlowRouterStructure2 = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowConsumerException.class, Executor.class));
        WinterFlowRouterStructure2.WinterFlowTransactionManagerStrategy = new WinterFlowCompilerMechanism(18);
        return Arrays.asList(winterFlowQueueManager, winterFlowQueueManager2, winterFlowQueueManager3, WinterFlowRouterStructure2.WinterFlowHookDataSource());
    }
}
