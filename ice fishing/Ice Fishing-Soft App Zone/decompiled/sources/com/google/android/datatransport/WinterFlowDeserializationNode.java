package com.google.android.datatransport;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationNode implements WinterFlowDataSourceVersion, WinterFlowSoftwareStrategy {
    public static final WinterFlowInterfaceSystem WinterFlowServerProtocol = new WinterFlowInterfaceSystem(0);
    public Object WinterFlowResponseEngine;
    public Object WinterFlowRouterRouter;
    public Object WinterFlowSyntax;
    public Object WinterFlowTransactionAgent;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowUnitTestResponse;
    public Object WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public synchronized WinterFlowHookInheritance WinterFlowHookDataSource(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        WinterFlowFrameworkXML winterFlowFrameworkXML = (WinterFlowFrameworkXML) ((HashMap) this.WinterFlowUnitTestResponse).get(winterFlowValidatorProcess);
        if (winterFlowFrameworkXML != null) {
            return winterFlowFrameworkXML;
        }
        return WinterFlowServerProtocol;
    }

    public ArrayList WinterFlowResponseEngine() {
        HashMap hashMap = (HashMap) this.WinterFlowUnitTestResponse;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.WinterFlowVariableVersionControl).entrySet()) {
            WinterFlowQueueManager winterFlowQueueManager = (WinterFlowQueueManager) entry.getKey();
            if (winterFlowQueueManager.WinterFlowVariableVersionControl != 0) {
                WinterFlowHookInheritance winterFlowHookInheritance = (WinterFlowHookInheritance) entry.getValue();
                for (WinterFlowValidatorProcess winterFlowValidatorProcess : winterFlowQueueManager.WinterFlowHookDataSource) {
                    if (!hashMap2.containsKey(winterFlowValidatorProcess)) {
                        hashMap2.put(winterFlowValidatorProcess, new HashSet());
                    }
                    ((Set) hashMap2.get(winterFlowValidatorProcess)).add(winterFlowHookInheritance);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                WinterFlowFrameworkXML winterFlowFrameworkXML = (WinterFlowFrameworkXML) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new WinterFlowControllerManager(5, winterFlowFrameworkXML, (WinterFlowHookInheritance) it.next()));
                }
            } else {
                WinterFlowValidatorProcess winterFlowValidatorProcess2 = (WinterFlowValidatorProcess) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                WinterFlowFrameworkXML winterFlowFrameworkXML2 = new WinterFlowFrameworkXML();
                winterFlowFrameworkXML2.WinterFlowHookDataSource = null;
                winterFlowFrameworkXML2.WinterFlowRouterStructure = Collections.newSetFromMap(new ConcurrentHashMap());
                winterFlowFrameworkXML2.WinterFlowRouterStructure.addAll(set);
                hashMap.put(winterFlowValidatorProcess2, winterFlowFrameworkXML2);
            }
        }
        return arrayList;
    }

    public void WinterFlowRouterRouter() {
        for (WinterFlowQueueManager winterFlowQueueManager : ((HashMap) this.WinterFlowVariableVersionControl).keySet()) {
            for (WinterFlowOrchestrationConcurrency winterFlowOrchestrationConcurrency : winterFlowQueueManager.WinterFlowCacheManagerAgent) {
                if (winterFlowOrchestrationConcurrency.WinterFlowHookDataSource == 2 && !((HashMap) this.WinterFlowUnitTestResponse).containsKey(winterFlowOrchestrationConcurrency.WinterFlowRouterStructure)) {
                    HashMap hashMap = (HashMap) this.WinterFlowUnitTestResponse;
                    WinterFlowValidatorProcess winterFlowValidatorProcess = winterFlowOrchestrationConcurrency.WinterFlowRouterStructure;
                    Set set = Collections.EMPTY_SET;
                    WinterFlowFrameworkXML winterFlowFrameworkXML = new WinterFlowFrameworkXML();
                    winterFlowFrameworkXML.WinterFlowHookDataSource = null;
                    winterFlowFrameworkXML.WinterFlowRouterStructure = Collections.newSetFromMap(new ConcurrentHashMap());
                    winterFlowFrameworkXML.WinterFlowRouterStructure.addAll(set);
                    hashMap.put(winterFlowValidatorProcess, winterFlowFrameworkXML);
                } else if (((HashMap) this.WinterFlowTransactionManagerStrategy).containsKey(winterFlowOrchestrationConcurrency.WinterFlowRouterStructure)) {
                    continue;
                } else {
                    int i = winterFlowOrchestrationConcurrency.WinterFlowHookDataSource;
                    if (i == 1) {
                        throw new WinterFlowRuntimeDatabaseSchema("Unsatisfied dependency for component " + winterFlowQueueManager + ": " + winterFlowOrchestrationConcurrency.WinterFlowRouterStructure);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = (HashMap) this.WinterFlowTransactionManagerStrategy;
                        WinterFlowValidatorProcess winterFlowValidatorProcess2 = winterFlowOrchestrationConcurrency.WinterFlowRouterStructure;
                        WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration = WinterFlowProcessorListener.WinterFlowCacheManagerAgent;
                        WinterFlowInterfaceSystem winterFlowInterfaceSystem = WinterFlowProcessorListener.WinterFlowArrayNetwork;
                        WinterFlowProcessorListener winterFlowProcessorListener = new WinterFlowProcessorListener();
                        winterFlowProcessorListener.WinterFlowRouterStructure = winterFlowEventEmitterOrchestration;
                        winterFlowProcessorListener.WinterFlowHookDataSource = winterFlowInterfaceSystem;
                        hashMap2.put(winterFlowValidatorProcess2, winterFlowProcessorListener);
                    }
                }
            }
        }
    }

    public ArrayList WinterFlowSyntax(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.WinterFlowTransactionManagerStrategy;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            WinterFlowQueueManager winterFlowQueueManager = (WinterFlowQueueManager) obj;
            if (winterFlowQueueManager.WinterFlowVariableVersionControl == 0) {
                WinterFlowHookInheritance winterFlowHookInheritance = (WinterFlowHookInheritance) ((HashMap) this.WinterFlowVariableVersionControl).get(winterFlowQueueManager);
                for (WinterFlowValidatorProcess winterFlowValidatorProcess : winterFlowQueueManager.WinterFlowHookDataSource) {
                    if (hashMap.containsKey(winterFlowValidatorProcess)) {
                        arrayList2.add(new WinterFlowControllerManager(4, (WinterFlowProcessorListener) ((WinterFlowHookInheritance) hashMap.get(winterFlowValidatorProcess)), winterFlowHookInheritance));
                    } else {
                        hashMap.put(winterFlowValidatorProcess, winterFlowHookInheritance);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public synchronized WinterFlowHookInheritance WinterFlowTransactionManagerStrategy(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        WinterFlowInvokerComponent.WinterFlowServiceUtility(winterFlowValidatorProcess, "Null interface requested.");
        return (WinterFlowHookInheritance) ((HashMap) this.WinterFlowTransactionManagerStrategy).get(winterFlowValidatorProcess);
    }

    public void WinterFlowUnitTestResponse(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            WinterFlowQueueManager winterFlowQueueManager = (WinterFlowQueueManager) entry.getKey();
            WinterFlowHookInheritance winterFlowHookInheritance = (WinterFlowHookInheritance) entry.getValue();
            int i = winterFlowQueueManager.WinterFlowArrayNetwork;
            if (i == 1 || (i == 2 && z)) {
                winterFlowHookInheritance.get();
            }
        }
        WinterFlowProcessorService winterFlowProcessorService = (WinterFlowProcessorService) this.WinterFlowSyntax;
        synchronized (winterFlowProcessorService) {
            try {
                arrayDeque = winterFlowProcessorService.WinterFlowHookDataSource;
                if (arrayDeque != null) {
                    winterFlowProcessorService.WinterFlowHookDataSource = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        return new WinterFlowJSONProxy((Context) ((WinterFlowSoftwareStrategy) this.WinterFlowVariableVersionControl).get(), (WinterFlowDataSource) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get(), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowUnitTestResponse).get(), (WinterFlowObjectPackage) ((WinterFlowObjectPackage) this.WinterFlowRouterRouter).get(), (Executor) ((WinterFlowSoftwareStrategy) this.WinterFlowSyntax).get(), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowResponseEngine).get(), new WinterFlowModuleFunction(1), new WinterFlowThreadPoolProcess(29), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionAgent).get());
    }
}
