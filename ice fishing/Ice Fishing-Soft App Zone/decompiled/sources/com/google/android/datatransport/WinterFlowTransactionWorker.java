package com.google.android.datatransport;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionWorker {
    public static WinterFlowTransactionWorker WinterFlowRouterRouter;
    public static HandlerThread WinterFlowSyntax;
    public static final Object WinterFlowUnitTestResponse = new Object();
    public final WinterFlowConfigurationModule WinterFlowArrayNetwork;
    public volatile WinterFlowWidgetInterface WinterFlowCacheManagerAgent;
    public final Context WinterFlowHookDataSource;
    public final HashMap WinterFlowRouterStructure = new HashMap();
    public final long WinterFlowTransactionManagerStrategy;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowTransactionWorker(Context context, Looper looper) {
        WinterFlowBatchEventEmitter winterFlowBatchEventEmitter = new WinterFlowBatchEventEmitter(1, this);
        this.WinterFlowHookDataSource = context.getApplicationContext();
        WinterFlowWidgetInterface winterFlowWidgetInterface = new WinterFlowWidgetInterface(looper, winterFlowBatchEventEmitter);
        Looper.getMainLooper();
        this.WinterFlowCacheManagerAgent = winterFlowWidgetInterface;
        this.WinterFlowArrayNetwork = WinterFlowConfigurationModule.WinterFlowServerProtocol();
        this.WinterFlowVariableVersionControl = 5000L;
        this.WinterFlowTransactionManagerStrategy = 300000L;
    }

    public final void WinterFlowHookDataSource(String str, ServiceConnection serviceConnection, boolean z) {
        WinterFlowHandlerFunction winterFlowHandlerFunction = new WinterFlowHandlerFunction(str, z);
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.WinterFlowRouterStructure;
        synchronized (hashMap) {
            try {
                WinterFlowConfigurationDatabase winterFlowConfigurationDatabase = (WinterFlowConfigurationDatabase) hashMap.get(winterFlowHandlerFunction);
                if (winterFlowConfigurationDatabase == null) {
                    String winterFlowHandlerFunction2 = winterFlowHandlerFunction.toString();
                    StringBuilder sb = new StringBuilder(winterFlowHandlerFunction2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(winterFlowHandlerFunction2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!winterFlowConfigurationDatabase.WinterFlowRouterStructure.containsKey(serviceConnection)) {
                    String winterFlowHandlerFunction3 = winterFlowHandlerFunction.toString();
                    StringBuilder sb2 = new StringBuilder(winterFlowHandlerFunction3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(winterFlowHandlerFunction3);
                    throw new IllegalStateException(sb2.toString());
                }
                winterFlowConfigurationDatabase.WinterFlowRouterStructure.remove(serviceConnection);
                if (winterFlowConfigurationDatabase.WinterFlowRouterStructure.isEmpty()) {
                    this.WinterFlowCacheManagerAgent.sendMessageDelayed(this.WinterFlowCacheManagerAgent.obtainMessage(0, winterFlowHandlerFunction), this.WinterFlowVariableVersionControl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ConnectionResult WinterFlowRouterStructure(WinterFlowHandlerFunction winterFlowHandlerFunction, WinterFlowObjectRenderer winterFlowObjectRenderer, String str) {
        ConnectionResult connectionResult;
        HashMap hashMap = this.WinterFlowRouterStructure;
        synchronized (hashMap) {
            try {
                WinterFlowConfigurationDatabase winterFlowConfigurationDatabase = (WinterFlowConfigurationDatabase) hashMap.get(winterFlowHandlerFunction);
                if (winterFlowConfigurationDatabase == null) {
                    winterFlowConfigurationDatabase = new WinterFlowConfigurationDatabase(this, winterFlowHandlerFunction);
                    winterFlowConfigurationDatabase.WinterFlowRouterStructure.put(winterFlowObjectRenderer, winterFlowObjectRenderer);
                    connectionResult = winterFlowConfigurationDatabase.WinterFlowRouterStructure(str, null);
                    hashMap.put(winterFlowHandlerFunction, winterFlowConfigurationDatabase);
                } else {
                    this.WinterFlowCacheManagerAgent.removeMessages(0, winterFlowHandlerFunction);
                    if (winterFlowConfigurationDatabase.WinterFlowRouterStructure.containsKey(winterFlowObjectRenderer)) {
                        String winterFlowHandlerFunction2 = winterFlowHandlerFunction.toString();
                        StringBuilder sb = new StringBuilder(winterFlowHandlerFunction2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(winterFlowHandlerFunction2);
                        throw new IllegalStateException(sb.toString());
                    }
                    winterFlowConfigurationDatabase.WinterFlowRouterStructure.put(winterFlowObjectRenderer, winterFlowObjectRenderer);
                    int i = winterFlowConfigurationDatabase.WinterFlowHookDataSource;
                    if (i == 1) {
                        winterFlowObjectRenderer.onServiceConnected(winterFlowConfigurationDatabase.WinterFlowTransactionManagerStrategy, winterFlowConfigurationDatabase.WinterFlowArrayNetwork);
                    } else if (i == 2) {
                        connectionResult = winterFlowConfigurationDatabase.WinterFlowRouterStructure(str, null);
                    }
                    connectionResult = null;
                }
                if (winterFlowConfigurationDatabase.WinterFlowCacheManagerAgent) {
                    return ConnectionResult.WinterFlowResponseEngine;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1, null, null);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
