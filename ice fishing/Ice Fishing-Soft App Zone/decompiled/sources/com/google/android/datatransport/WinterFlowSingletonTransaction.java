package com.google.android.datatransport;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonTransaction extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowBandwidthObject;
    public final /* synthetic */ Object WinterFlowOrchestrationSubsystem;
    public Object WinterFlowResponseEngine;
    public /* synthetic */ Object WinterFlowServerProtocol;
    public Object WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax;
    public Object WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowSingletonTransaction(Object obj, Object obj2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowBandwidthObject = obj;
        this.WinterFlowOrchestrationSubsystem = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowOrchestrationSubsystem;
        Object obj3 = this.WinterFlowBandwidthObject;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowSingletonTransaction winterFlowSingletonTransaction = new WinterFlowSingletonTransaction((List) obj3, (ArrayList) obj2, winterFlowTransactionManagerLayer, 0);
                winterFlowSingletonTransaction.WinterFlowServerProtocol = obj;
                return winterFlowSingletonTransaction;
            default:
                WinterFlowSingletonTransaction winterFlowSingletonTransaction2 = new WinterFlowSingletonTransaction((WinterFlowCompilerHelper) obj3, (WinterFlowObjectSession) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowSingletonTransaction2.WinterFlowServerProtocol = obj;
                return winterFlowSingletonTransaction2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.datatransport.WinterFlowCacheCacheManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.google.android.datatransport.WinterFlowCacheCacheManager] */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        List list;
        Iterator it;
        WinterFlowTransactionOrchestration winterFlowTransactionOrchestration;
        Iterator it2;
        Object obj2;
        WinterFlowIDEPlatform winterFlowIDEPlatform;
        WinterFlowObjectSession winterFlowObjectSession;
        WinterFlowProcessorSerializer winterFlowProcessorSerializer;
        Throwable th;
        WinterFlowProcessorSerializer winterFlowProcessorSerializer2;
        WinterFlowCacheCacheManager winterFlowCacheCacheManager;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.WinterFlowSyntax;
        ?? r1 = this.WinterFlowOrchestrationSubsystem;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        Object obj3 = this.WinterFlowBandwidthObject;
        int i2 = 1;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = this.WinterFlowTransactionAgent;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    obj = this.WinterFlowServerProtocol;
                    list = (ArrayList) r1;
                    it = ((List) obj3).iterator();
                } else if (i3 == 1) {
                    obj2 = this.WinterFlowResponseEngine;
                    WinterFlowTransactionOrchestration winterFlowTransactionOrchestration2 = (WinterFlowTransactionOrchestration) this.WinterFlowServiceUtility;
                    it2 = (Iterator) this.WinterFlowThreadListener;
                    List list2 = (List) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowTransactionOrchestration = winterFlowTransactionOrchestration2;
                    list = list2;
                    if (((Boolean) obj).booleanValue()) {
                        obj = obj2;
                        it = it2;
                    } else {
                        list.add(new WinterFlowModuleEntity(winterFlowTransactionOrchestration, winterFlowTransactionManagerLayer, 0));
                        this.WinterFlowServerProtocol = list;
                        this.WinterFlowThreadListener = it2;
                        this.WinterFlowServiceUtility = null;
                        this.WinterFlowResponseEngine = null;
                        this.WinterFlowTransactionAgent = 2;
                        obj = winterFlowTransactionOrchestration.WinterFlowHookDataSource.WinterFlowArrayNetwork(new WinterFlowJavaBandwidth((SharedPreferences) winterFlowTransactionOrchestration.WinterFlowVariableVersionControl.getValue(), winterFlowTransactionOrchestration.WinterFlowTransactionManagerStrategy), obj2, this);
                        if (obj == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        it = it2;
                    }
                } else {
                    if (i3 != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.WinterFlowThreadListener;
                    list = (List) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                if (!it.hasNext()) {
                    WinterFlowTransactionOrchestration winterFlowTransactionOrchestration3 = (WinterFlowTransactionOrchestration) it.next();
                    this.WinterFlowServerProtocol = list;
                    this.WinterFlowThreadListener = it;
                    this.WinterFlowServiceUtility = winterFlowTransactionOrchestration3;
                    this.WinterFlowResponseEngine = obj;
                    this.WinterFlowTransactionAgent = 1;
                    Object WinterFlowRouterStructure = winterFlowTransactionOrchestration3.WinterFlowRouterStructure(obj, this);
                    if (WinterFlowRouterStructure == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                    Iterator it3 = it;
                    obj2 = obj;
                    obj = WinterFlowRouterStructure;
                    winterFlowTransactionOrchestration = winterFlowTransactionOrchestration3;
                    it2 = it3;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    if (!it.hasNext()) {
                        return obj;
                    }
                }
            default:
                WinterFlowCompilerHelper winterFlowCompilerHelper = (WinterFlowCompilerHelper) obj3;
                int i4 = this.WinterFlowTransactionAgent;
                try {
                    try {
                        if (i4 == 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            WinterFlowStrategyPackage WinterFlowConsumerUserManager = ((WinterFlowAdapterResponse) this.WinterFlowServerProtocol).WinterFlowRouterRouter().WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
                            WinterFlowConsumerUserManager.getClass();
                            WinterFlowProcessorSerializer winterFlowProcessorSerializer3 = new WinterFlowProcessorSerializer((WinterFlowConsumerBandwidth) WinterFlowConsumerUserManager);
                            AtomicReference atomicReference3 = winterFlowCompilerHelper.WinterFlowRouterStructure;
                            while (true) {
                                WinterFlowProcessorSerializer winterFlowProcessorSerializer4 = (WinterFlowProcessorSerializer) atomicReference3.get();
                                if (winterFlowProcessorSerializer4 != null) {
                                    WinterFlowEncryptionTool winterFlowEncryptionTool = WinterFlowEncryptionTool.WinterFlowVariableVersionControl;
                                    if (winterFlowEncryptionTool.compareTo(winterFlowEncryptionTool) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(winterFlowProcessorSerializer4, winterFlowProcessorSerializer3)) {
                                    if (atomicReference3.get() != winterFlowProcessorSerializer4) {
                                        break;
                                    }
                                }
                                if (winterFlowProcessorSerializer4 != null) {
                                    winterFlowProcessorSerializer4.WinterFlowRouterStructure.WinterFlowArrayNetwork(new WinterFlowInterfaceJava("Mutation interrupted", i2));
                                }
                                winterFlowIDEPlatform = winterFlowCompilerHelper.WinterFlowHookDataSource;
                                winterFlowObjectSession = (WinterFlowObjectSession) r1;
                                this.WinterFlowServerProtocol = winterFlowProcessorSerializer3;
                                this.WinterFlowThreadListener = winterFlowIDEPlatform;
                                this.WinterFlowResponseEngine = winterFlowObjectSession;
                                this.WinterFlowServiceUtility = winterFlowCompilerHelper;
                                this.WinterFlowTransactionAgent = 1;
                                if (winterFlowIDEPlatform.WinterFlowArrayNetwork(this) == winterFlowListenerJava) {
                                    return winterFlowListenerJava;
                                }
                                winterFlowProcessorSerializer = winterFlowProcessorSerializer3;
                            }
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                winterFlowCompilerHelper = (WinterFlowCompilerHelper) this.WinterFlowResponseEngine;
                                winterFlowCacheCacheManager = (WinterFlowCacheCacheManager) this.WinterFlowThreadListener;
                                winterFlowProcessorSerializer2 = (WinterFlowProcessorSerializer) this.WinterFlowServerProtocol;
                                try {
                                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                    atomicReference2 = winterFlowCompilerHelper.WinterFlowRouterStructure;
                                    while (!atomicReference2.compareAndSet(winterFlowProcessorSerializer2, null) && atomicReference2.get() == winterFlowProcessorSerializer2) {
                                    }
                                    winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicReference = winterFlowCompilerHelper.WinterFlowRouterStructure;
                                    while (!atomicReference.compareAndSet(winterFlowProcessorSerializer2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            winterFlowCompilerHelper = (WinterFlowCompilerHelper) this.WinterFlowServiceUtility;
                            winterFlowObjectSession = (WinterFlowObjectSession) this.WinterFlowResponseEngine;
                            ?? r2 = (WinterFlowCacheCacheManager) this.WinterFlowThreadListener;
                            winterFlowProcessorSerializer = (WinterFlowProcessorSerializer) this.WinterFlowServerProtocol;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowIDEPlatform = r2;
                        }
                        this.WinterFlowServerProtocol = winterFlowProcessorSerializer;
                        this.WinterFlowThreadListener = winterFlowIDEPlatform;
                        this.WinterFlowResponseEngine = winterFlowCompilerHelper;
                        this.WinterFlowServiceUtility = null;
                        this.WinterFlowTransactionAgent = 2;
                        Object WinterFlowUnitTestResponse = winterFlowObjectSession.WinterFlowUnitTestResponse(this);
                        if (WinterFlowUnitTestResponse == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        winterFlowCacheCacheManager = winterFlowIDEPlatform;
                        obj = WinterFlowUnitTestResponse;
                        winterFlowProcessorSerializer2 = winterFlowProcessorSerializer;
                        atomicReference2 = winterFlowCompilerHelper.WinterFlowRouterStructure;
                        while (!atomicReference2.compareAndSet(winterFlowProcessorSerializer2, null)) {
                        }
                        winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        winterFlowProcessorSerializer2 = winterFlowProcessorSerializer;
                        atomicReference = winterFlowCompilerHelper.WinterFlowRouterStructure;
                        while (!atomicReference.compareAndSet(winterFlowProcessorSerializer2, null) && atomicReference.get() == winterFlowProcessorSerializer2) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    r1.WinterFlowHookDataSource(null);
                    throw th4;
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowSingletonTransaction) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowSingletonTransaction) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
