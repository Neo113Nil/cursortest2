package com.google.android.datatransport;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderUserManager {
    public static final Pattern WinterFlowResponseEngine = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static int WinterFlowRouterRouter;
    public static PendingIntent WinterFlowSyntax;
    public final ScheduledThreadPoolExecutor WinterFlowArrayNetwork;
    public final WinterFlowFrontendTesting WinterFlowCacheManagerAgent;
    public final Context WinterFlowHookDataSource;
    public Messenger WinterFlowTransactionManagerStrategy;
    public WinterFlowResponseHandler WinterFlowUnitTestResponse;
    public final WinterFlowParserRequest WinterFlowRouterStructure = new WinterFlowParserRequest(0);
    public final Messenger WinterFlowVariableVersionControl = new Messenger(new WinterFlowRendererException(this, Looper.getMainLooper()));

    public WinterFlowProviderUserManager(Context context) {
        this.WinterFlowHookDataSource = context;
        this.WinterFlowCacheManagerAgent = new WinterFlowFrontendTesting(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new WinterFlowCompilerScheduler("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.WinterFlowArrayNetwork = scheduledThreadPoolExecutor;
    }

    public final WinterFlowExceptionParser WinterFlowHookDataSource(Bundle bundle) {
        String num;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle2;
        synchronized (WinterFlowProviderUserManager.class) {
            int i = WinterFlowRouterRouter;
            WinterFlowRouterRouter = i + 1;
            num = Integer.toString(i);
        }
        WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
        WinterFlowParserRequest winterFlowParserRequest = this.WinterFlowRouterStructure;
        synchronized (winterFlowParserRequest) {
            winterFlowParserRequest.put(num, winterFlowArrayEngine);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.WinterFlowCacheManagerAgent.WinterFlowOrchestrationSubsystem() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.WinterFlowHookDataSource;
        synchronized (WinterFlowProviderUserManager.class) {
            try {
                PendingIntent pendingIntent = WinterFlowSyntax;
                if (pendingIntent == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, WinterFlowArrayFramework.WinterFlowRouterStructure);
                    WinterFlowSyntax = pendingIntent;
                }
                intent.putExtra("app", pendingIntent);
            } finally {
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 5);
        sb.append("|ID|");
        sb.append(num);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.WinterFlowVariableVersionControl);
        if (this.WinterFlowTransactionManagerStrategy != null || this.WinterFlowUnitTestResponse != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.WinterFlowTransactionManagerStrategy;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            winterFlowArrayEngine.WinterFlowRouterStructure.WinterFlowRouterStructure(WinterFlowRuntimeService.WinterFlowTransactionManagerStrategy, new WinterFlowNodeLayer(this, num, this.WinterFlowArrayNetwork.schedule(new WinterFlowDeploymentSystem(15, winterFlowArrayEngine), 30L, TimeUnit.SECONDS)));
            return winterFlowArrayEngine.WinterFlowRouterStructure;
        }
        int WinterFlowOrchestrationSubsystem = this.WinterFlowCacheManagerAgent.WinterFlowOrchestrationSubsystem();
        Context context2 = this.WinterFlowHookDataSource;
        if (WinterFlowOrchestrationSubsystem != 2) {
            context2.startService(intent);
        } else if (Build.VERSION.SDK_INT < 34) {
            context2.sendBroadcast(intent);
        } else {
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle2 = shareIdentityEnabled.toBundle();
            context2.sendBroadcast(intent, null, bundle2);
        }
        winterFlowArrayEngine.WinterFlowRouterStructure.WinterFlowRouterStructure(WinterFlowRuntimeService.WinterFlowTransactionManagerStrategy, new WinterFlowNodeLayer(this, num, this.WinterFlowArrayNetwork.schedule(new WinterFlowDeploymentSystem(15, winterFlowArrayEngine), 30L, TimeUnit.SECONDS)));
        return winterFlowArrayEngine.WinterFlowRouterStructure;
    }

    public final void WinterFlowRouterStructure(Bundle bundle, String str) {
        WinterFlowParserRequest winterFlowParserRequest = this.WinterFlowRouterStructure;
        synchronized (winterFlowParserRequest) {
            try {
                WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) winterFlowParserRequest.remove(str);
                if (winterFlowArrayEngine == null) {
                    new StringBuilder(String.valueOf(str).length() + 21);
                } else {
                    winterFlowArrayEngine.WinterFlowRouterStructure(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
