package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererAgent implements WinterFlowServiceProviderStructure {
    public final /* synthetic */ WinterFlowSchedulerParser WinterFlowRouterStructure;

    public WinterFlowRendererAgent(WinterFlowSchedulerParser winterFlowSchedulerParser) {
        this.WinterFlowRouterStructure = winterFlowSchedulerParser;
    }

    @Override // com.google.android.datatransport.WinterFlowServiceProviderStructure
    public final float WinterFlowRouterStructure(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        WinterFlowSchedulerParser winterFlowSchedulerParser = this.WinterFlowRouterStructure;
        float floatValue = ((Number) ((WinterFlowObjectSession) winterFlowSchedulerParser.WinterFlowRouterStructure).WinterFlowUnitTestResponse(Float.valueOf(f))).floatValue();
        ((WinterFlowResolverSubsystem) winterFlowSchedulerParser.WinterFlowVariableVersionControl).setValue(Boolean.valueOf(floatValue > 0.0f));
        ((WinterFlowResolverSubsystem) winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy).setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
