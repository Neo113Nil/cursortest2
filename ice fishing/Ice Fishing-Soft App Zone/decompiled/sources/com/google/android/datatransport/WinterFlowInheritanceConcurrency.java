package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class WinterFlowInheritanceConcurrency {
    public static final WinterFlowObjectPackage WinterFlowRouterStructure = new WinterFlowObjectPackage(25);
    public static final WinterFlowObjectPackage WinterFlowHookDataSource = new WinterFlowObjectPackage(25);

    public static final WinterFlowPipelineWidget WinterFlowHookDataSource(WinterFlowObjectUI winterFlowObjectUI) {
        return new WinterFlowPipelineWidget(winterFlowObjectUI, null);
    }

    public static final WinterFlowJSON WinterFlowRouterStructure() {
        WinterFlowObjectPackage winterFlowObjectPackage = WinterFlowHookDataSource;
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) winterFlowObjectPackage.get();
        if (winterFlowJSON != null) {
            return winterFlowJSON;
        }
        WinterFlowJSON winterFlowJSON2 = new WinterFlowJSON(new WinterFlowResponseConsumer[0]);
        winterFlowObjectPackage.WinterFlowMapperProtocol(winterFlowJSON2);
        return winterFlowJSON2;
    }
}
