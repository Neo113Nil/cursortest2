package com.google.android.datatransport;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseEntity extends WinterFlowUserManagerController implements WinterFlowInheritance, WinterFlowConcurrencyParser, WinterFlowManagerModule {
    public final WinterFlowJSON WinterFlowBackendCacheManager;
    public Object WinterFlowBatchUI;
    public final WinterFlowJSON WinterFlowConsumerUserManager;
    public WinterFlowCacheManagerUtility WinterFlowEventEmitterController;
    public WinterFlowCacheManagerUtility WinterFlowMapperProtocol = WinterFlowIDESoftware.WinterFlowRouterStructure;
    public final WinterFlowJSON WinterFlowResolverController;
    public PointerInputEventHandler WinterFlowRouterAdapter;
    public WinterFlowPipelineObject WinterFlowSerializerStructure;
    public Object WinterFlowVariableBandwidth;

    public WinterFlowDatabaseEntity(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.WinterFlowVariableBandwidth = obj;
        this.WinterFlowBatchUI = obj2;
        this.WinterFlowRouterAdapter = pointerInputEventHandler;
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowRouterRefactoring[16]);
        this.WinterFlowResolverController = winterFlowJSON;
        this.WinterFlowConsumerUserManager = winterFlowJSON;
        this.WinterFlowBackendCacheManager = new WinterFlowJSON(new WinterFlowRouterRefactoring[16]);
    }

    @Override // com.google.android.datatransport.WinterFlowManagerModule
    public final void WinterFlowConfiguration() {
        WinterFlowUIPlatform();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowHookDataSource() {
        return WinterFlowCloudStack.WinterFlowSyntaxSubsystem(this).WinterFlowArrayHelper.WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowManagerModule
    public final void WinterFlowOrchestrationConfiguration() {
        WinterFlowCacheManagerUtility winterFlowCacheManagerUtility = this.WinterFlowEventEmitterController;
        if (winterFlowCacheManagerUtility == null) {
            return;
        }
        List list = winterFlowCacheManagerUtility.WinterFlowRouterStructure;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WinterFlowObjectSystem) list.get(i)).WinterFlowArrayNetwork) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) list.get(i2);
                    long j = winterFlowObjectSystem.WinterFlowRouterStructure;
                    long j2 = winterFlowObjectSystem.WinterFlowCacheManagerAgent;
                    long j3 = winterFlowObjectSystem.WinterFlowHookDataSource;
                    float f = winterFlowObjectSystem.WinterFlowVariableVersionControl;
                    boolean z = winterFlowObjectSystem.WinterFlowArrayNetwork;
                    arrayList.add(new WinterFlowObjectSystem(j, j3, j2, false, f, j3, j2, z, z, winterFlowObjectSystem.WinterFlowSyntax, 0L, 1.0f, 0L));
                }
                WinterFlowCacheManagerUtility winterFlowCacheManagerUtility2 = new WinterFlowCacheManagerUtility(arrayList, null);
                this.WinterFlowMapperProtocol = winterFlowCacheManagerUtility2;
                WinterFlowValidatorNetwork(winterFlowCacheManagerUtility2, WinterFlowJSONSerializer.WinterFlowVariableVersionControl);
                WinterFlowValidatorNetwork(winterFlowCacheManagerUtility2, WinterFlowJSONSerializer.WinterFlowTransactionManagerStrategy);
                WinterFlowValidatorNetwork(winterFlowCacheManagerUtility2, WinterFlowJSONSerializer.WinterFlowUnitTestResponse);
                this.WinterFlowEventEmitterController = null;
                return;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowManagerModule
    public final void WinterFlowResolverController(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, WinterFlowJSONSerializer winterFlowJSONSerializer, long j) {
        if (winterFlowJSONSerializer == WinterFlowJSONSerializer.WinterFlowVariableVersionControl) {
            this.WinterFlowMapperProtocol = winterFlowCacheManagerUtility;
        }
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        if (this.WinterFlowSerializerStructure == null) {
            this.WinterFlowSerializerStructure = WinterFlowCacheRuntime.WinterFlowStrategyTool(WinterFlowModuleService(), null, new WinterFlowGatewayWorker(this, winterFlowTransactionManagerLayer, 12), 1);
        }
        WinterFlowValidatorNetwork(winterFlowCacheManagerUtility, winterFlowJSONSerializer);
        List list = winterFlowCacheManagerUtility.WinterFlowRouterStructure;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                winterFlowCacheManagerUtility = null;
                break;
            } else if (!WinterFlowCacheRuntime.WinterFlowResponseEngine((WinterFlowObjectSystem) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.WinterFlowEventEmitterController = winterFlowCacheManagerUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowRouterRouter() {
        return WinterFlowCloudStack.WinterFlowSyntaxSubsystem(this).WinterFlowArrayHelper.WinterFlowRouterRouter();
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryDeployment, com.google.android.datatransport.WinterFlowManagerModule
    public final void WinterFlowRouterStructure() {
        WinterFlowUIPlatform();
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final void WinterFlowTestingTransactionManager() {
        WinterFlowUIPlatform();
    }

    public final void WinterFlowUIPlatform() {
        WinterFlowPipelineObject winterFlowPipelineObject = this.WinterFlowSerializerStructure;
        if (winterFlowPipelineObject != null) {
            winterFlowPipelineObject.WinterFlowBackendCacheManager(new WinterFlowCloudManager("Pointer input was reset", 2));
            this.WinterFlowSerializerStructure = null;
        }
    }

    public final void WinterFlowValidatorNetwork(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, WinterFlowJSONSerializer winterFlowJSONSerializer) {
        WinterFlowEventCloud winterFlowEventCloud;
        WinterFlowEventCloud winterFlowEventCloud2;
        synchronized (this.WinterFlowConsumerUserManager) {
            WinterFlowJSON winterFlowJSON = this.WinterFlowBackendCacheManager;
            winterFlowJSON.WinterFlowCacheManagerAgent(winterFlowJSON.WinterFlowUnitTestResponse, this.WinterFlowResolverController);
        }
        try {
            int ordinal = winterFlowJSONSerializer.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    WinterFlowJSON winterFlowJSON2 = this.WinterFlowBackendCacheManager;
                    int i = winterFlowJSON2.WinterFlowUnitTestResponse - 1;
                    Object[] objArr = winterFlowJSON2.WinterFlowVariableVersionControl;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            WinterFlowRouterRefactoring winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) objArr[i];
                            if (winterFlowJSONSerializer == winterFlowRouterRefactoring.WinterFlowRouterRouter && (winterFlowEventCloud2 = winterFlowRouterRefactoring.WinterFlowUnitTestResponse) != null) {
                                winterFlowRouterRefactoring.WinterFlowUnitTestResponse = null;
                                winterFlowEventCloud2.WinterFlowSyntax(winterFlowCacheManagerUtility);
                            }
                            i--;
                        }
                    }
                    this.WinterFlowBackendCacheManager.WinterFlowUnitTestResponse();
                }
                if (ordinal != 2) {
                    throw new WinterFlowServerSystem();
                }
            }
            WinterFlowJSON winterFlowJSON3 = this.WinterFlowBackendCacheManager;
            Object[] objArr2 = winterFlowJSON3.WinterFlowVariableVersionControl;
            int i2 = winterFlowJSON3.WinterFlowUnitTestResponse;
            for (int i3 = 0; i3 < i2; i3++) {
                WinterFlowRouterRefactoring winterFlowRouterRefactoring2 = (WinterFlowRouterRefactoring) objArr2[i3];
                if (winterFlowJSONSerializer == winterFlowRouterRefactoring2.WinterFlowRouterRouter && (winterFlowEventCloud = winterFlowRouterRefactoring2.WinterFlowUnitTestResponse) != null) {
                    winterFlowRouterRefactoring2.WinterFlowUnitTestResponse = null;
                    winterFlowEventCloud.WinterFlowSyntax(winterFlowCacheManagerUtility);
                }
            }
            this.WinterFlowBackendCacheManager.WinterFlowUnitTestResponse();
        } catch (Throwable th) {
            this.WinterFlowBackendCacheManager.WinterFlowUnitTestResponse();
            throw th;
        }
    }
}
