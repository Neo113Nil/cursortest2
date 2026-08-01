package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineHelper extends WinterFlowProtocolEntity {
    public final /* synthetic */ int WinterFlowHookDataSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowPipelineHelper(int i, WinterFlowObjectUI winterFlowObjectUI) {
        super(winterFlowObjectUI);
        this.WinterFlowHookDataSource = i;
    }

    @Override // com.google.android.datatransport.WinterFlowProtocolEntity
    public final WinterFlowRepositoryWorker WinterFlowRouterStructure(Object obj) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowRepositoryWorker(this, obj, obj == null, WinterFlowSessionManagerProcess.WinterFlowResolverController, true);
            default:
                return new WinterFlowRepositoryWorker(this, obj, obj == null, null, false);
        }
    }
}
