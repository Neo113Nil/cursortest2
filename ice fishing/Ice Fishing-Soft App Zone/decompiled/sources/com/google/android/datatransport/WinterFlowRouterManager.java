package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterManager {
    public final WinterFlowDatabaseSchemaStructure WinterFlowCacheManagerAgent;
    public final WinterFlowCloudFrontend WinterFlowHookDataSource;
    public final WinterFlowRefactoringServer WinterFlowRouterStructure;

    public WinterFlowRouterManager(WinterFlowRefactoringServer winterFlowRefactoringServer, WinterFlowCloudFrontend winterFlowCloudFrontend) {
        this.WinterFlowRouterStructure = winterFlowRefactoringServer;
        this.WinterFlowHookDataSource = winterFlowCloudFrontend;
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        this.WinterFlowCacheManagerAgent = new WinterFlowDatabaseSchemaStructure();
    }

    public final Object WinterFlowHookDataSource(Object obj) {
        if (obj == null) {
            return null;
        }
        WinterFlowCompilerComponent winterFlowCompilerComponent = (WinterFlowCompilerComponent) this.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(obj);
        if (winterFlowCompilerComponent != null) {
            return winterFlowCompilerComponent.WinterFlowHookDataSource;
        }
        WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema = (WinterFlowScriptDatabaseSchema) this.WinterFlowHookDataSource.WinterFlowRouterStructure();
        int WinterFlowHookDataSource = winterFlowScriptDatabaseSchema.WinterFlowArrayNetwork.WinterFlowHookDataSource(obj);
        if (WinterFlowHookDataSource != -1) {
            return winterFlowScriptDatabaseSchema.WinterFlowHookDataSource(WinterFlowHookDataSource);
        }
        return null;
    }

    public final WinterFlowEventEvent WinterFlowRouterStructure(int i, Object obj, Object obj2) {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowCacheManagerAgent;
        WinterFlowCompilerComponent winterFlowCompilerComponent = (WinterFlowCompilerComponent) winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(obj);
        int i2 = 5;
        if (winterFlowCompilerComponent != null && winterFlowCompilerComponent.WinterFlowCacheManagerAgent == i && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCompilerComponent.WinterFlowHookDataSource, obj2)) {
            WinterFlowEventTool winterFlowEventTool = winterFlowCompilerComponent.WinterFlowArrayNetwork;
            if (winterFlowEventTool != null) {
                return winterFlowEventTool;
            }
            WinterFlowEventTool winterFlowEventTool2 = new WinterFlowEventTool(818252804, true, new WinterFlowAPIVersionControl(i2, winterFlowCompilerComponent.WinterFlowVariableVersionControl, winterFlowCompilerComponent));
            winterFlowCompilerComponent.WinterFlowArrayNetwork = winterFlowEventTool2;
            return winterFlowEventTool2;
        }
        WinterFlowCompilerComponent winterFlowCompilerComponent2 = new WinterFlowCompilerComponent(this, i, obj, obj2);
        winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(obj, winterFlowCompilerComponent2);
        WinterFlowEventTool winterFlowEventTool3 = winterFlowCompilerComponent2.WinterFlowArrayNetwork;
        if (winterFlowEventTool3 != null) {
            return winterFlowEventTool3;
        }
        WinterFlowEventTool winterFlowEventTool4 = new WinterFlowEventTool(818252804, true, new WinterFlowAPIVersionControl(i2, this, winterFlowCompilerComponent2));
        winterFlowCompilerComponent2.WinterFlowArrayNetwork = winterFlowEventTool4;
        return winterFlowEventTool4;
    }
}
