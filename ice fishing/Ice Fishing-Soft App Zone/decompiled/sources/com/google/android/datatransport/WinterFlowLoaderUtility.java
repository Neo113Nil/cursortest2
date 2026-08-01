package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowLoaderUtility {
    default long WinterFlowAPIFrontend(int i, long j) {
        return 0L;
    }

    default long WinterFlowConfigurationSubsystem(int i, long j, long j2) {
        return 0L;
    }

    default Object WinterFlowHandlerJSON(long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        return new WinterFlowXMLNetwork(0L);
    }

    default Object WinterFlowPackageIDE(long j, long j2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        return new WinterFlowXMLNetwork(0L);
    }
}
