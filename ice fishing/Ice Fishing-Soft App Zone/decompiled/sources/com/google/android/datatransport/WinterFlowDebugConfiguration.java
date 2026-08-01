package com.google.android.datatransport;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDebugConfiguration implements Runnable {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ boolean WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDebugConfiguration(int i, Object obj, Object obj2, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = z;
        this.WinterFlowRouterRouter = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowRouterRouter;
        boolean z = this.WinterFlowUnitTestResponse;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) obj2).lambda$setPushToken$33(z, (String) obj);
                return;
            case 1:
                ((ActivityHandler) obj2).lambda$setPushToken$32(z, (String) obj);
                return;
            default:
                Context context = (Context) obj2;
                WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = WinterFlowFrameworkMechanism.WinterFlowTransactionManagerStrategy(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    winterFlowArrayEngine.WinterFlowCacheManagerAgent(null);
                }
        }
    }
}
