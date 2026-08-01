package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowResponseXML implements WinterFlowHookInheritance {
    public final /* synthetic */ Object WinterFlowCacheManagerAgent;
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowResponseXML(int i, Object obj, Object obj2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
        this.WinterFlowCacheManagerAgent = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowHookInheritance
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowCacheManagerAgent;
        Object obj2 = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowQueueManager winterFlowQueueManager = (WinterFlowQueueManager) obj;
                return winterFlowQueueManager.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(new WinterFlowRequestEngine(winterFlowQueueManager, (WinterFlowDeserializationNode) obj2));
            case 1:
                return new WinterFlowFrontendMechanism((Context) obj2, (String) obj);
            default:
                com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) obj2;
                String WinterFlowCacheManagerAgent = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent();
                WinterFlowUserManagerVariable winterFlowUserManagerVariable = new WinterFlowUserManagerVariable();
                Context createDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(WinterFlowCacheManagerAgent), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                winterFlowUserManagerVariable.WinterFlowRouterStructure = z;
                return winterFlowUserManagerVariable;
        }
    }
}
