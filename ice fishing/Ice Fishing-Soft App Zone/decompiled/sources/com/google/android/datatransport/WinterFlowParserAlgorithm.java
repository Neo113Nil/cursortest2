package com.google.android.datatransport;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
@WinterFlowJavaHelper("navigation")
/* loaded from: classes.dex */
public class WinterFlowParserAlgorithm extends WinterFlowRendererRenderer {
    public final WinterFlowRouterTesting WinterFlowCacheManagerAgent;

    public WinterFlowParserAlgorithm(WinterFlowRouterTesting winterFlowRouterTesting) {
        winterFlowRouterTesting.getClass();
        this.WinterFlowCacheManagerAgent = winterFlowRouterTesting;
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final void WinterFlowArrayNetwork(List list, WinterFlowQueueView winterFlowQueueView) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) it.next();
            WinterFlowServerLayer winterFlowServerLayer = winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy;
            winterFlowServerLayer.getClass();
            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = (WinterFlowSerializerMicroservice) winterFlowServerLayer;
            WinterFlowListenerPlatform winterFlowListenerPlatform = winterFlowSerializerMicroservice.WinterFlowTransactionManagerStrategy;
            WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
            winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowLibrarySessionManager.WinterFlowServerProtocol.WinterFlowRouterStructure();
            WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = winterFlowSerializerMicroservice.WinterFlowResponseEngine;
            int i = winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent;
            String str = winterFlowMicroserviceProtocol.WinterFlowVariableVersionControl;
            if (i == 0 && str == null) {
                winterFlowListenerPlatform.getClass();
                String valueOf = String.valueOf(winterFlowListenerPlatform.WinterFlowRouterStructure);
                valueOf.getClass();
                if (winterFlowMicroserviceProtocol.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure == 0) {
                    valueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            int i2 = 0;
            WinterFlowServerLayer WinterFlowHookDataSource = str != null ? winterFlowMicroserviceProtocol.WinterFlowHookDataSource(str, false) : (WinterFlowServerLayer) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowMicroserviceProtocol.WinterFlowHookDataSource, i);
            if (WinterFlowHookDataSource == null) {
                String str2 = winterFlowMicroserviceProtocol.WinterFlowArrayNetwork;
                if (str2 == null) {
                    str2 = winterFlowMicroserviceProtocol.WinterFlowVariableVersionControl;
                    if (str2 == null) {
                        str2 = String.valueOf(winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent);
                    }
                    winterFlowMicroserviceProtocol.WinterFlowArrayNetwork = str2;
                }
                str2.getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowResponseEngine("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            WinterFlowListenerPlatform winterFlowListenerPlatform2 = WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy;
            if (str != null) {
                if (!str.equals((String) winterFlowListenerPlatform2.WinterFlowVariableVersionControl)) {
                    WinterFlowLoaderValidator WinterFlowRouterStructure = winterFlowListenerPlatform2.WinterFlowRouterStructure(str);
                    Bundle bundle = WinterFlowRouterStructure != null ? WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                        WinterFlowOrchestrationSubsystem.putAll(bundle);
                        Bundle bundle2 = (Bundle) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                        if (bundle2 != null) {
                            WinterFlowOrchestrationSubsystem.putAll(bundle2);
                        }
                        winterFlowBandwidthCache.WinterFlowVariableVersionControl = WinterFlowOrchestrationSubsystem;
                    }
                }
                if (WinterFlowHookDataSource.WinterFlowCacheManagerAgent().isEmpty()) {
                    continue;
                } else {
                    ArrayList WinterFlowSoftwareEngine = WinterFlowUnitTestLibrary.WinterFlowSoftwareEngine(WinterFlowHookDataSource.WinterFlowCacheManagerAgent(), new WinterFlowSessionManagerEngine(winterFlowBandwidthCache, i2));
                    if (!WinterFlowSoftwareEngine.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + WinterFlowHookDataSource + ". Missing required arguments [" + WinterFlowSoftwareEngine + ']').toString());
                    }
                }
            }
            this.WinterFlowCacheManagerAgent.WinterFlowHookDataSource(WinterFlowHookDataSource.WinterFlowVariableVersionControl).WinterFlowArrayNetwork(WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(WinterFlowHookDataSource().WinterFlowHookDataSource(WinterFlowHookDataSource, WinterFlowHookDataSource.WinterFlowRouterStructure((Bundle) winterFlowBandwidthCache.WinterFlowVariableVersionControl))), winterFlowQueueView);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    /* renamed from: WinterFlowUnitTestResponse, reason: merged with bridge method [inline-methods] */
    public WinterFlowSerializerMicroservice WinterFlowRouterStructure() {
        return new WinterFlowSerializerMicroservice(this);
    }
}
