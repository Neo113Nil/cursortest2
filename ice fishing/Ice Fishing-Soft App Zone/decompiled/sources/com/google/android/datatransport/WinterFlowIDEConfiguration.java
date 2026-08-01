package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEConfiguration implements WinterFlowQueryJava {
    public static final WinterFlowResponseProxy WinterFlowTransactionManagerStrategy;
    public static final WinterFlowResponseProxy WinterFlowUnitTestResponse;
    public boolean WinterFlowArrayNetwork;
    public final WinterFlowLibraryParser WinterFlowCacheManagerAgent;
    public final HashMap WinterFlowHookDataSource;
    public final HashMap WinterFlowRouterStructure;
    public static final WinterFlowLibraryParser WinterFlowVariableVersionControl = new WinterFlowLibraryParser(0);
    public static final WinterFlowArrayThread WinterFlowRouterRouter = new WinterFlowArrayThread();

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.datatransport.WinterFlowResponseProxy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.datatransport.WinterFlowResponseProxy] */
    static {
        final int i = 0;
        WinterFlowTransactionManagerStrategy = new WinterFlowEventLayer() { // from class: com.google.android.datatransport.WinterFlowResponseProxy
            @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
            public final void WinterFlowRouterStructure(Object obj, Object obj2) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((WinterFlowObjectArray) obj2).WinterFlowHookDataSource((String) obj);
                        break;
                    default:
                        ((WinterFlowObjectArray) obj2).WinterFlowCacheManagerAgent(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        WinterFlowUnitTestResponse = new WinterFlowEventLayer() { // from class: com.google.android.datatransport.WinterFlowResponseProxy
            @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
            public final void WinterFlowRouterStructure(Object obj, Object obj2) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((WinterFlowObjectArray) obj2).WinterFlowHookDataSource((String) obj);
                        break;
                    default:
                        ((WinterFlowObjectArray) obj2).WinterFlowCacheManagerAgent(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public WinterFlowIDEConfiguration() {
        HashMap hashMap = new HashMap();
        this.WinterFlowRouterStructure = hashMap;
        HashMap hashMap2 = new HashMap();
        this.WinterFlowHookDataSource = hashMap2;
        this.WinterFlowCacheManagerAgent = WinterFlowVariableVersionControl;
        this.WinterFlowArrayNetwork = false;
        hashMap2.put(String.class, WinterFlowTransactionManagerStrategy);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, WinterFlowUnitTestResponse);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, WinterFlowRouterRouter);
        hashMap.remove(Date.class);
    }

    public final WinterFlowQueryJava WinterFlowRouterStructure(Class cls, WinterFlowResponseSubsystem winterFlowResponseSubsystem) {
        this.WinterFlowRouterStructure.put(cls, winterFlowResponseSubsystem);
        this.WinterFlowHookDataSource.remove(cls);
        return this;
    }
}
