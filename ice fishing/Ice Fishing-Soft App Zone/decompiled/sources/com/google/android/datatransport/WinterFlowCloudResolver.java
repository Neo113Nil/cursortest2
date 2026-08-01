package com.google.android.datatransport;

import com.adjust.sdk.network.ErrorCodes;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudResolver extends WinterFlowUserManagerLoader {
    public final /* synthetic */ int WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowCloudResolver(int i, int i2) {
        super(i, 1);
        this.WinterFlowSyntax = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public void WinterFlowHookDataSource() {
        switch (this.WinterFlowSyntax) {
            case 2:
                if (!WinterFlowRequestPlatform.WinterFlowRouterStructure(this.WinterFlowCacheManagerAgent)) {
                    throw new WinterFlowStackLayer("Received text is no valid utf8 string!", ErrorCodes.IO_EXCEPTION);
                }
                return;
            default:
                super.WinterFlowHookDataSource();
                return;
        }
    }
}
