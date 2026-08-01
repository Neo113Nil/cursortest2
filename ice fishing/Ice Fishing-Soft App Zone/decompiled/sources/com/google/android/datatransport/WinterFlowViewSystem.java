package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewSystem {
    public Object WinterFlowArrayNetwork;
    public Object WinterFlowCacheManagerAgent;
    public final Object WinterFlowHookDataSource;
    public boolean WinterFlowRouterStructure;

    public WinterFlowViewSystem() {
        this.WinterFlowHookDataSource = new Object();
        this.WinterFlowCacheManagerAgent = new ArrayList();
        this.WinterFlowArrayNetwork = new ArrayList();
        this.WinterFlowRouterStructure = true;
    }

    public Boolean WinterFlowHookDataSource() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = ((FirebaseMessaging) this.WinterFlowArrayNetwork).WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        Context context = winterFlowSyntaxEvent.WinterFlowRouterStructure;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public synchronized boolean WinterFlowRouterStructure() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.WinterFlowRouterStructure) {
                        Boolean WinterFlowHookDataSource = WinterFlowHookDataSource();
                        this.WinterFlowCacheManagerAgent = WinterFlowHookDataSource;
                        if (WinterFlowHookDataSource == null) {
                            ((WinterFlowProcessorService) ((WinterFlowExceptionProcessor) this.WinterFlowHookDataSource)).WinterFlowRouterStructure(new WinterFlowCompilerMechanism(26));
                        }
                        this.WinterFlowRouterStructure = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.WinterFlowCacheManagerAgent;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = ((FirebaseMessaging) this.WinterFlowArrayNetwork).WinterFlowRouterStructure;
            winterFlowSyntaxEvent.WinterFlowRouterStructure();
            WinterFlowUserManagerVariable winterFlowUserManagerVariable = (WinterFlowUserManagerVariable) winterFlowSyntaxEvent.WinterFlowUnitTestResponse.get();
            synchronized (winterFlowUserManagerVariable) {
                z = winterFlowUserManagerVariable.WinterFlowRouterStructure;
            }
            z2 = z;
        }
        return z2;
    }

    public WinterFlowViewSystem(WinterFlowRouterManager winterFlowRouterManager, WinterFlowLibraryAgent winterFlowLibraryAgent, WinterFlowProviderConcurrency winterFlowProviderConcurrency) {
        this.WinterFlowHookDataSource = winterFlowRouterManager;
        this.WinterFlowCacheManagerAgent = winterFlowLibraryAgent;
        this.WinterFlowArrayNetwork = winterFlowProviderConcurrency;
        this.WinterFlowRouterStructure = true;
    }

    public WinterFlowViewSystem(FirebaseMessaging firebaseMessaging, WinterFlowExceptionProcessor winterFlowExceptionProcessor) {
        this.WinterFlowArrayNetwork = firebaseMessaging;
        this.WinterFlowHookDataSource = winterFlowExceptionProcessor;
    }
}
