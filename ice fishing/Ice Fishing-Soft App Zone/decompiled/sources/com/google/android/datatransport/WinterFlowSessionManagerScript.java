package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerScript implements WinterFlowCacheManagerInterface {
    public final /* synthetic */ Object WinterFlowArrayNetwork;
    public final /* synthetic */ Object WinterFlowCacheManagerAgent;
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public WinterFlowSessionManagerScript(WinterFlowJavaSubsystem winterFlowJavaSubsystem, WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, WinterFlowPackageResolver winterFlowPackageResolver) {
        this.WinterFlowRouterStructure = 1;
        this.WinterFlowCacheManagerAgent = winterFlowJavaSubsystem;
        this.WinterFlowArrayNetwork = winterFlowLibrarySessionManager;
        this.WinterFlowHookDataSource = winterFlowPackageResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerInterface
    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowArrayNetwork;
        Object obj2 = this.WinterFlowCacheManagerAgent;
        Object obj3 = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowPackageResolver) obj3).remove(obj2);
                ((WinterFlowSessionManagerRequest) obj).WinterFlowArrayNetwork.WinterFlowTransactionAgent(obj2);
                break;
            case 1:
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj;
                ((WinterFlowJavaSubsystem) obj2).WinterFlowHookDataSource().WinterFlowCacheManagerAgent(winterFlowLibrarySessionManager);
                ((WinterFlowPackageResolver) obj3).remove(winterFlowLibrarySessionManager);
                break;
            case 2:
                ((WinterFlowDecoratorVersion) obj3).WinterFlowUnitTestResponse().WinterFlowTransactionManagerStrategy((WinterFlowSessionInvoker) obj2);
                WinterFlowMapperFramework winterFlowMapperFramework = (WinterFlowMapperFramework) ((WinterFlowBandwidthCache) obj).WinterFlowVariableVersionControl;
                if (winterFlowMapperFramework != null) {
                    winterFlowMapperFramework.WinterFlowRouterStructure();
                    break;
                }
                break;
            default:
                WinterFlowDecoratorPlatform winterFlowDecoratorPlatform = (WinterFlowDecoratorPlatform) obj3;
                WinterFlowTransactionManagerEventEmitter winterFlowTransactionManagerEventEmitter = (WinterFlowTransactionManagerEventEmitter) obj;
                if (winterFlowDecoratorPlatform.WinterFlowTransactionManagerStrategy.WinterFlowTransactionAgent(obj2) == winterFlowTransactionManagerEventEmitter) {
                    Map map = winterFlowDecoratorPlatform.WinterFlowVariableVersionControl;
                    Map WinterFlowVariableVersionControl = winterFlowTransactionManagerEventEmitter.WinterFlowVariableVersionControl();
                    if (!WinterFlowVariableVersionControl.isEmpty()) {
                        map.put(obj2, WinterFlowVariableVersionControl);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ WinterFlowSessionManagerScript(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
        this.WinterFlowCacheManagerAgent = obj2;
        this.WinterFlowArrayNetwork = obj3;
    }
}
