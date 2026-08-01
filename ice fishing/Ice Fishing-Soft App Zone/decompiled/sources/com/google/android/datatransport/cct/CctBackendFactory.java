package com.google.android.datatransport.cct;

import android.content.Context;
import com.google.android.datatransport.WinterFlowDebugDeployment;
import com.google.android.datatransport.WinterFlowRequestStructure;
import com.google.android.datatransport.WinterFlowServiceProviderGateway;
import com.google.android.datatransport.WinterFlowUserManagerAdapter;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class CctBackendFactory {
    public WinterFlowServiceProviderGateway create(WinterFlowUserManagerAdapter winterFlowUserManagerAdapter) {
        Context context = ((WinterFlowRequestStructure) winterFlowUserManagerAdapter).WinterFlowRouterStructure;
        WinterFlowRequestStructure winterFlowRequestStructure = (WinterFlowRequestStructure) winterFlowUserManagerAdapter;
        return new WinterFlowDebugDeployment(context, winterFlowRequestStructure.WinterFlowHookDataSource, winterFlowRequestStructure.WinterFlowCacheManagerAgent);
    }
}
