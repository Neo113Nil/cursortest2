package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetConcurrency extends WinterFlowProtocolEntity {
    public final WinterFlowParserSerializer WinterFlowHookDataSource;

    public WinterFlowWidgetConcurrency(WinterFlowObjectSession winterFlowObjectSession) {
        super(new WinterFlowDeploymentEngine(6));
        this.WinterFlowHookDataSource = new WinterFlowParserSerializer(winterFlowObjectSession);
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolEntity
    public final WinterFlowFunctionThreadPool WinterFlowHookDataSource() {
        return this.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolEntity
    public final WinterFlowRepositoryWorker WinterFlowRouterStructure(Object obj) {
        return new WinterFlowRepositoryWorker(this, obj, obj == null, null, true);
    }
}
