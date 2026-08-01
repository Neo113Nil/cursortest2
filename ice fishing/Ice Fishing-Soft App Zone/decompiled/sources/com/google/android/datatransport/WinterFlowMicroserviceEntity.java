package com.google.android.datatransport;

import android.os.Bundle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceEntity {
    public final WinterFlowProtocolPlatform WinterFlowRouterStructure;

    public WinterFlowMicroserviceEntity(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(WinterFlowMicroserviceEntity.class.getClassLoader());
        this.WinterFlowRouterStructure = new WinterFlowProtocolPlatform(bundle);
    }

    public WinterFlowMicroserviceEntity(WinterFlowLibrarySessionManager winterFlowLibrarySessionManager) {
        this.WinterFlowRouterStructure = new WinterFlowProtocolPlatform(winterFlowLibrarySessionManager, winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure);
    }
}
