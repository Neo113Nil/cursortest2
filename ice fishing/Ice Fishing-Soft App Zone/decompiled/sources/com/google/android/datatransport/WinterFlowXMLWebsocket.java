package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLWebsocket implements WinterFlowLoaderConsumer {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowVariableVersionControl;

    public WinterFlowXMLWebsocket(WinterFlowEventEvent winterFlowEventEvent, WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowVariableVersionControl = winterFlowEventEvent;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderConsumer
    public final Object WinterFlowCacheManagerAgent(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderConsumer
    public final Object WinterFlowHookDataSource(WinterFlowWebsocketPipeline winterFlowWebsocketPipeline, Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(winterFlowWebsocketPipeline, obj);
    }
}
