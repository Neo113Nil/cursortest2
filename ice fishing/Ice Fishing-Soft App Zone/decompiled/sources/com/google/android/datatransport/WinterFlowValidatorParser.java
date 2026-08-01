package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorParser implements WinterFlowCacheInterface {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Serializable WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowValidatorParser(WinterFlowBandwidthCache winterFlowBandwidthCache, WinterFlowCacheInterface winterFlowCacheInterface, String[] strArr, int[] iArr) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowTransactionManagerStrategy = winterFlowBandwidthCache;
        this.WinterFlowSyntax = winterFlowCacheInterface;
        this.WinterFlowUnitTestResponse = strArr;
        this.WinterFlowRouterRouter = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowVersionControlProtocol winterFlowVersionControlProtocol;
        int i;
        int i2 = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        int i3 = 1;
        Serializable serializable = this.WinterFlowTransactionManagerStrategy;
        int i4 = 0;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowVersionControlProtocol) {
                    winterFlowVersionControlProtocol = (WinterFlowVersionControlProtocol) winterFlowTransactionManagerLayer;
                    int i5 = winterFlowVersionControlProtocol.WinterFlowServerProtocol;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        winterFlowVersionControlProtocol.WinterFlowServerProtocol = i5 - Integer.MIN_VALUE;
                        Object obj2 = winterFlowVersionControlProtocol.WinterFlowResponseEngine;
                        i = winterFlowVersionControlProtocol.WinterFlowServerProtocol;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                            WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) ((WinterFlowBandwidthCache) serializable).WinterFlowVariableVersionControl;
                            if (winterFlowConsumerBandwidth != null) {
                                winterFlowConsumerBandwidth.WinterFlowArrayNetwork(new WinterFlowInterfaceJava("Child of the scoped flow was cancelled", i4));
                                winterFlowVersionControlProtocol.WinterFlowRouterRouter = this;
                                winterFlowVersionControlProtocol.WinterFlowSyntax = obj;
                                winterFlowVersionControlProtocol.WinterFlowServerProtocol = 1;
                                Object WinterFlowCompilerVariable = winterFlowConsumerBandwidth.WinterFlowCompilerVariable(winterFlowVersionControlProtocol);
                                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                                if (WinterFlowCompilerVariable == winterFlowListenerJava) {
                                    return winterFlowListenerJava;
                                }
                            }
                        } else {
                            if (i != 1) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = winterFlowVersionControlProtocol.WinterFlowSyntax;
                            this = winterFlowVersionControlProtocol.WinterFlowRouterRouter;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        }
                        ((WinterFlowBandwidthCache) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl = WinterFlowCacheRuntime.WinterFlowStrategyTool((WinterFlowAdapterResponse) this.WinterFlowUnitTestResponse, null, new WinterFlowModuleManager((WinterFlowResponseVersionControl) this.WinterFlowRouterRouter, (WinterFlowCacheInterface) this.WinterFlowSyntax, obj, null), 1);
                        return winterFlowAlgorithmSession;
                    }
                }
                winterFlowVersionControlProtocol = new WinterFlowVersionControlProtocol(this, winterFlowTransactionManagerLayer);
                Object obj22 = winterFlowVersionControlProtocol.WinterFlowResponseEngine;
                i = winterFlowVersionControlProtocol.WinterFlowServerProtocol;
                if (i != 0) {
                }
                ((WinterFlowBandwidthCache) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl = WinterFlowCacheRuntime.WinterFlowStrategyTool((WinterFlowAdapterResponse) this.WinterFlowUnitTestResponse, null, new WinterFlowModuleManager((WinterFlowResponseVersionControl) this.WinterFlowRouterRouter, (WinterFlowCacheInterface) this.WinterFlowSyntax, obj, null), 1);
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowStackUI winterFlowStackUI = (WinterFlowStackUI) obj;
                WinterFlowTransactionInterface winterFlowTransactionInterface = (WinterFlowTransactionInterface) this.WinterFlowRouterRouter;
                WinterFlowTransactionInterface winterFlowTransactionInterface2 = (WinterFlowTransactionInterface) this.WinterFlowUnitTestResponse;
                WinterFlowTransactionInterface winterFlowTransactionInterface3 = (WinterFlowTransactionInterface) serializable;
                if (winterFlowStackUI instanceof WinterFlowDebugVersion) {
                    winterFlowTransactionInterface3.WinterFlowVariableVersionControl++;
                } else if (winterFlowStackUI instanceof WinterFlowHookServiceProvider) {
                    winterFlowTransactionInterface3.WinterFlowVariableVersionControl--;
                } else if (winterFlowStackUI instanceof WinterFlowJSONService) {
                    winterFlowTransactionInterface3.WinterFlowVariableVersionControl--;
                } else if (winterFlowStackUI instanceof WinterFlowUserManagerWorker) {
                    winterFlowTransactionInterface2.WinterFlowVariableVersionControl++;
                } else if (winterFlowStackUI instanceof WinterFlowBandwidthModule) {
                    winterFlowTransactionInterface2.WinterFlowVariableVersionControl--;
                } else if (winterFlowStackUI instanceof WinterFlowArrayTesting) {
                    winterFlowTransactionInterface.WinterFlowVariableVersionControl++;
                } else if (winterFlowStackUI instanceof WinterFlowUINetwork) {
                    winterFlowTransactionInterface.WinterFlowVariableVersionControl--;
                }
                boolean z = winterFlowTransactionInterface3.WinterFlowVariableVersionControl > 0;
                boolean z2 = winterFlowTransactionInterface2.WinterFlowVariableVersionControl > 0;
                boolean z3 = winterFlowTransactionInterface.WinterFlowVariableVersionControl > 0;
                WinterFlowConfigurationNetwork winterFlowConfigurationNetwork = (WinterFlowConfigurationNetwork) this.WinterFlowSyntax;
                if (winterFlowConfigurationNetwork.WinterFlowBatchUI != z) {
                    winterFlowConfigurationNetwork.WinterFlowBatchUI = z;
                    i4 = 1;
                }
                if (winterFlowConfigurationNetwork.WinterFlowRouterAdapter != z2) {
                    winterFlowConfigurationNetwork.WinterFlowRouterAdapter = z2;
                    i4 = 1;
                }
                if (winterFlowConfigurationNetwork.WinterFlowSerializerStructure != z3) {
                    winterFlowConfigurationNetwork.WinterFlowSerializerStructure = z3;
                } else {
                    i3 = i4;
                }
                if (i3 != 0) {
                    WinterFlowUnitTestLibrary.WinterFlowArrayHelper(winterFlowConfigurationNetwork);
                }
                return winterFlowAlgorithmSession;
            default:
                return WinterFlowRouterStructure((int[]) obj, winterFlowTransactionManagerLayer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.WinterFlowRouterRouter(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r1.WinterFlowRouterRouter(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WinterFlowRouterStructure(int[] iArr, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowPackageRequest winterFlowPackageRequest;
        int i;
        String[] strArr = (String[]) this.WinterFlowUnitTestResponse;
        WinterFlowCacheInterface winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowSyntax;
        WinterFlowBandwidthCache winterFlowBandwidthCache = (WinterFlowBandwidthCache) this.WinterFlowTransactionManagerStrategy;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowPackageRequest) {
            winterFlowPackageRequest = (WinterFlowPackageRequest) winterFlowTransactionManagerLayer;
            int i2 = winterFlowPackageRequest.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowPackageRequest.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowPackageRequest.WinterFlowSyntax;
                i = winterFlowPackageRequest.WinterFlowTransactionAgent;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    Object obj2 = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (obj2 == null) {
                        Set WinterFlowModuleAgent = WinterFlowProtocolPipeline.WinterFlowModuleAgent(strArr);
                        winterFlowPackageRequest.WinterFlowRouterRouter = iArr;
                        winterFlowPackageRequest.WinterFlowTransactionAgent = 1;
                    } else {
                        int[] iArr2 = (int[]) this.WinterFlowRouterRouter;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj3 = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                            if (obj3 == null) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Required value was null.");
                                return null;
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj3)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set WinterFlowDatabaseSchemaUtility = WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility(arrayList);
                            winterFlowPackageRequest.WinterFlowRouterRouter = iArr;
                            winterFlowPackageRequest.WinterFlowTransactionAgent = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = winterFlowPackageRequest.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowBandwidthCache.WinterFlowVariableVersionControl = iArr;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        }
        winterFlowPackageRequest = new WinterFlowPackageRequest(this, winterFlowTransactionManagerLayer);
        Object obj4 = winterFlowPackageRequest.WinterFlowSyntax;
        i = winterFlowPackageRequest.WinterFlowTransactionAgent;
        if (i != 0) {
        }
        winterFlowBandwidthCache.WinterFlowVariableVersionControl = iArr;
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public /* synthetic */ WinterFlowValidatorParser(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = serializable;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = obj2;
        this.WinterFlowSyntax = obj3;
    }
}
