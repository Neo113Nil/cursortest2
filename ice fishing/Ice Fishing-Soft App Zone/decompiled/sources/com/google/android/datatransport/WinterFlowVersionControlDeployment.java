package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlDeployment implements WinterFlowHandlerProcessor, WinterFlowCompilerMapper {
    public final WinterFlowResolverSubsystem WinterFlowVariableVersionControl;

    public WinterFlowVersionControlDeployment(int i) {
        switch (i) {
            case 1:
                this.WinterFlowVariableVersionControl = WinterFlowDecoratorUI.WinterFlowSerializerStructure(new WinterFlowServerCloud(0.0f));
                break;
            default:
                this.WinterFlowVariableVersionControl = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerMapper
    public Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowResolverSubsystem winterFlowResolverSubsystem = this.WinterFlowVariableVersionControl;
        WinterFlowServerCloud winterFlowServerCloud = (WinterFlowServerCloud) winterFlowResolverSubsystem.getValue();
        float f = ((WinterFlowServerCloud) obj).WinterFlowRouterStructure;
        winterFlowServerCloud.getClass();
        winterFlowResolverSubsystem.setValue(new WinterFlowServerCloud(f));
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
