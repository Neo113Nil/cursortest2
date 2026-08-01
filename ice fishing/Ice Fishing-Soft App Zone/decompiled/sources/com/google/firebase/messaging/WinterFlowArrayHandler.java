package com.google.firebase.messaging;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.datatransport.WinterFlowAdapterUnitTest;
import com.google.android.datatransport.WinterFlowFunctionJSON;
import java.io.IOException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayHandler implements Runnable {
    public static final Object WinterFlowResponseEngine = new Object();
    public static Boolean WinterFlowServerProtocol;
    public static Boolean WinterFlowTransactionAgent;
    public final WinterFlowFunctionJSON WinterFlowRouterRouter;
    public final long WinterFlowSyntax;
    public final WinterFlowAdapterUnitTest WinterFlowTransactionManagerStrategy;
    public final PowerManager.WakeLock WinterFlowUnitTestResponse;
    public final Context WinterFlowVariableVersionControl;

    public WinterFlowArrayHandler(WinterFlowFunctionJSON winterFlowFunctionJSON, Context context, WinterFlowAdapterUnitTest winterFlowAdapterUnitTest, long j) {
        this.WinterFlowRouterRouter = winterFlowFunctionJSON;
        this.WinterFlowVariableVersionControl = context;
        this.WinterFlowSyntax = j;
        this.WinterFlowTransactionManagerStrategy = winterFlowAdapterUnitTest;
        this.WinterFlowUnitTestResponse = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean WinterFlowHookDataSource(Context context) {
        boolean booleanValue;
        synchronized (WinterFlowResponseEngine) {
            try {
                Boolean bool = WinterFlowTransactionAgent;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                WinterFlowTransactionAgent = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean WinterFlowRouterStructure(Context context) {
        boolean booleanValue;
        synchronized (WinterFlowResponseEngine) {
            try {
                Boolean bool = WinterFlowServerProtocol;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                WinterFlowServerProtocol = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean WinterFlowCacheManagerAgent() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.WinterFlowVariableVersionControl.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        WinterFlowFunctionJSON winterFlowFunctionJSON = this.WinterFlowRouterRouter;
        Context context = this.WinterFlowVariableVersionControl;
        boolean WinterFlowHookDataSource = WinterFlowHookDataSource(context);
        PowerManager.WakeLock wakeLock = this.WinterFlowUnitTestResponse;
        if (WinterFlowHookDataSource) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    winterFlowFunctionJSON.WinterFlowRouterStructure(true);
                    if (!this.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl()) {
                        winterFlowFunctionJSON.WinterFlowRouterStructure(false);
                        if (!WinterFlowHookDataSource(context)) {
                            return;
                        }
                    } else {
                        if (!WinterFlowRouterStructure(context) || WinterFlowCacheManagerAgent()) {
                            if (winterFlowFunctionJSON.WinterFlowHookDataSource()) {
                                winterFlowFunctionJSON.WinterFlowRouterStructure(false);
                            } else {
                                winterFlowFunctionJSON.WinterFlowCacheManagerAgent(this.WinterFlowSyntax);
                            }
                            if (WinterFlowHookDataSource(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        TopicsSyncTask$ConnectivityChangeReceiver topicsSyncTask$ConnectivityChangeReceiver = new TopicsSyncTask$ConnectivityChangeReceiver();
                        topicsSyncTask$ConnectivityChangeReceiver.WinterFlowRouterStructure = this;
                        context.registerReceiver(topicsSyncTask$ConnectivityChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!WinterFlowHookDataSource(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                } catch (Throwable th) {
                    if (WinterFlowHookDataSource(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                e.getMessage();
                winterFlowFunctionJSON.WinterFlowRouterStructure(false);
                if (WinterFlowHookDataSource(context)) {
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused3) {
        }
    }
}
