package com.google.android.datatransport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowHandlerSubsystem implements Runnable {
    public final /* synthetic */ Runnable WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowViewNode WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ WinterFlowJSONProxy WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowHandlerSubsystem(WinterFlowJSONProxy winterFlowJSONProxy, WinterFlowViewNode winterFlowViewNode, int i, Runnable runnable) {
        this.WinterFlowVariableVersionControl = winterFlowJSONProxy;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewNode;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final WinterFlowViewNode winterFlowViewNode = this.WinterFlowTransactionManagerStrategy;
        final int i = this.WinterFlowUnitTestResponse;
        Runnable runnable = this.WinterFlowRouterRouter;
        final WinterFlowJSONProxy winterFlowJSONProxy = this.WinterFlowVariableVersionControl;
        WinterFlowFrameworkManager winterFlowFrameworkManager = (WinterFlowFrameworkManager) winterFlowJSONProxy.WinterFlowTransactionManagerStrategy;
        try {
            try {
                WinterFlowFrameworkManager winterFlowFrameworkManager2 = (WinterFlowFrameworkManager) winterFlowJSONProxy.WinterFlowCacheManagerAgent;
                Objects.requireNonNull(winterFlowFrameworkManager2);
                winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowXMLFrontend(winterFlowFrameworkManager2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) winterFlowJSONProxy.WinterFlowRouterStructure).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowUserManagerSubsystem() { // from class: com.google.android.datatransport.WinterFlowLoaderUnitTest
                        @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
                        public final Object WinterFlowHookDataSource() {
                            ((WinterFlowObjectPackage) WinterFlowJSONProxy.this.WinterFlowArrayNetwork).WinterFlowRouterAdapter(winterFlowViewNode, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    winterFlowJSONProxy.WinterFlowHookDataSource(winterFlowViewNode, i);
                }
                runnable.run();
            } catch (WinterFlowXMLTool unused) {
                ((WinterFlowObjectPackage) winterFlowJSONProxy.WinterFlowArrayNetwork).WinterFlowRouterAdapter(winterFlowViewNode, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
