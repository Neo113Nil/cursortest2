package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowResponseAgent {
    public final String WinterFlowHookDataSource;
    public final WinterFlowRendererRenderer WinterFlowRouterStructure;
    public final LinkedHashMap WinterFlowCacheManagerAgent = new LinkedHashMap();
    public final ArrayList WinterFlowArrayNetwork = new ArrayList();
    public final LinkedHashMap WinterFlowVariableVersionControl = new LinkedHashMap();

    public WinterFlowResponseAgent(WinterFlowRendererRenderer winterFlowRendererRenderer, String str) {
        this.WinterFlowRouterStructure = winterFlowRendererRenderer;
        this.WinterFlowHookDataSource = str;
    }

    public WinterFlowServerLayer WinterFlowHookDataSource() {
        return this.WinterFlowRouterStructure.WinterFlowRouterStructure();
    }

    public WinterFlowServerLayer WinterFlowRouterStructure() {
        WinterFlowServerLayer WinterFlowHookDataSource = WinterFlowHookDataSource();
        WinterFlowHookDataSource.getClass();
        WinterFlowListenerPlatform winterFlowListenerPlatform = WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy;
        Iterator it = this.WinterFlowCacheManagerAgent.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return null;
            }
            str.getClass();
            throw null;
        }
        ArrayList arrayList = this.WinterFlowArrayNetwork;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final WinterFlowPackageStructure winterFlowPackageStructure = (WinterFlowPackageStructure) obj;
            winterFlowPackageStructure.getClass();
            winterFlowListenerPlatform.getClass();
            ArrayList WinterFlowSoftwareEngine = WinterFlowUnitTestLibrary.WinterFlowSoftwareEngine((LinkedHashMap) winterFlowListenerPlatform.WinterFlowArrayNetwork, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowModuleLayer
                @Override // com.google.android.datatransport.WinterFlowObjectSession
                public final Object WinterFlowUnitTestResponse(Object obj2) {
                    boolean contains;
                    int i3 = i;
                    WinterFlowPackageStructure winterFlowPackageStructure2 = winterFlowPackageStructure;
                    String str2 = (String) obj2;
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            str2.getClass();
                            contains = winterFlowPackageStructure2.WinterFlowCacheManagerAgent().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = winterFlowPackageStructure2.WinterFlowCacheManagerAgent().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!WinterFlowSoftwareEngine.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + winterFlowPackageStructure.WinterFlowRouterStructure + " can't be used to open destination " + ((WinterFlowServerLayer) winterFlowListenerPlatform.WinterFlowHookDataSource) + ".\nFollowing required arguments are missing: " + WinterFlowSoftwareEngine).toString());
            }
            ((ArrayList) winterFlowListenerPlatform.WinterFlowCacheManagerAgent).add(winterFlowPackageStructure);
        }
        Iterator it2 = this.WinterFlowVariableVersionControl.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return null;
        }
        String str2 = this.WinterFlowHookDataSource;
        if (str2 != null) {
            winterFlowListenerPlatform.getClass();
            if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str2)) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot have an empty route");
                return null;
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            final WinterFlowPackageStructure winterFlowPackageStructure2 = new WinterFlowPackageStructure(concat);
            final int i3 = 1;
            ArrayList WinterFlowSoftwareEngine2 = WinterFlowUnitTestLibrary.WinterFlowSoftwareEngine((LinkedHashMap) winterFlowListenerPlatform.WinterFlowArrayNetwork, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowModuleLayer
                @Override // com.google.android.datatransport.WinterFlowObjectSession
                public final Object WinterFlowUnitTestResponse(Object obj2) {
                    boolean contains;
                    int i32 = i3;
                    WinterFlowPackageStructure winterFlowPackageStructure22 = winterFlowPackageStructure2;
                    String str22 = (String) obj2;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            str22.getClass();
                            contains = winterFlowPackageStructure22.WinterFlowCacheManagerAgent().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            contains = winterFlowPackageStructure22.WinterFlowCacheManagerAgent().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!WinterFlowSoftwareEngine2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((WinterFlowServerLayer) winterFlowListenerPlatform.WinterFlowHookDataSource) + ". Following required arguments are missing: " + WinterFlowSoftwareEngine2).toString());
            }
            winterFlowListenerPlatform.WinterFlowTransactionManagerStrategy = new WinterFlowRendererNode(new WinterFlowAPISystem(8, concat));
            winterFlowListenerPlatform.WinterFlowRouterStructure = concat.hashCode();
            winterFlowListenerPlatform.WinterFlowVariableVersionControl = str2;
        }
        return WinterFlowHookDataSource;
    }
}
