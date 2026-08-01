package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLConsumer implements WinterFlowRendererProvider {
    public final WinterFlowRendererProvider WinterFlowTransactionManagerStrategy;
    public final WinterFlowObjectSession WinterFlowVariableVersionControl;

    public WinterFlowXMLConsumer(WinterFlowRendererProvider winterFlowRendererProvider, WinterFlowObjectSession winterFlowObjectSession) {
        winterFlowRendererProvider.getClass();
        this.WinterFlowVariableVersionControl = winterFlowObjectSession;
        this.WinterFlowTransactionManagerStrategy = winterFlowRendererProvider instanceof WinterFlowXMLConsumer ? ((WinterFlowXMLConsumer) winterFlowRendererProvider).WinterFlowTransactionManagerStrategy : winterFlowRendererProvider;
    }
}
