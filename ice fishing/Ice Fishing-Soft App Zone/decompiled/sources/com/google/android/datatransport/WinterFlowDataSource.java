package com.google.android.datatransport;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSource {
    public final HashMap WinterFlowCacheManagerAgent;
    public final WinterFlowObjectPackage WinterFlowHookDataSource;
    public final WinterFlowAlgorithmArray WinterFlowRouterStructure;

    public WinterFlowDataSource(Context context, WinterFlowObjectPackage winterFlowObjectPackage) {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(context, 15);
        this.WinterFlowCacheManagerAgent = new HashMap();
        this.WinterFlowRouterStructure = winterFlowAlgorithmArray;
        this.WinterFlowHookDataSource = winterFlowObjectPackage;
    }

    public final synchronized WinterFlowServiceProviderGateway WinterFlowRouterStructure(String str) {
        if (this.WinterFlowCacheManagerAgent.containsKey(str)) {
            return (WinterFlowServiceProviderGateway) this.WinterFlowCacheManagerAgent.get(str);
        }
        CctBackendFactory WinterFlowSingletonPlatform = this.WinterFlowRouterStructure.WinterFlowSingletonPlatform(str);
        if (WinterFlowSingletonPlatform == null) {
            return null;
        }
        WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowHookDataSource;
        WinterFlowServiceProviderGateway create = WinterFlowSingletonPlatform.create(new WinterFlowRequestStructure((Context) winterFlowObjectPackage.WinterFlowRouterRouter, (WinterFlowFunctionProcessor) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy, (WinterFlowFunctionProcessor) winterFlowObjectPackage.WinterFlowUnitTestResponse, str));
        this.WinterFlowCacheManagerAgent.put(str, create);
        return create;
    }
}
