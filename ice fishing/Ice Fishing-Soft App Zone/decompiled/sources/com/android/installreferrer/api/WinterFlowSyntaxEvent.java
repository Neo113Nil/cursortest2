package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.datatransport.WinterFlowFunctionView;
import com.google.android.datatransport.WinterFlowJavaModule;
import com.google.android.datatransport.WinterFlowWidgetResolver;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEvent implements ServiceConnection {
    public final /* synthetic */ WinterFlowArrayHandler WinterFlowHookDataSource;
    public final InstallReferrerStateListener WinterFlowRouterStructure;

    public WinterFlowSyntaxEvent(WinterFlowArrayHandler winterFlowArrayHandler, InstallReferrerStateListener installReferrerStateListener) {
        this.WinterFlowHookDataSource = winterFlowArrayHandler;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.WinterFlowRouterStructure = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        WinterFlowWidgetResolver winterFlowJavaModule;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = WinterFlowFunctionView.WinterFlowCacheManagerAgent;
        if (iBinder == null) {
            winterFlowJavaModule = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            winterFlowJavaModule = queryLocalInterface instanceof WinterFlowWidgetResolver ? (WinterFlowWidgetResolver) queryLocalInterface : new WinterFlowJavaModule(iBinder);
        }
        WinterFlowArrayHandler winterFlowArrayHandler = this.WinterFlowHookDataSource;
        winterFlowArrayHandler.WinterFlowCacheManagerAgent = winterFlowJavaModule;
        winterFlowArrayHandler.WinterFlowRouterStructure = 2;
        this.WinterFlowRouterStructure.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        WinterFlowArrayHandler winterFlowArrayHandler = this.WinterFlowHookDataSource;
        winterFlowArrayHandler.WinterFlowCacheManagerAgent = null;
        winterFlowArrayHandler.WinterFlowRouterStructure = 0;
        this.WinterFlowRouterStructure.onInstallReferrerServiceDisconnected();
    }
}
