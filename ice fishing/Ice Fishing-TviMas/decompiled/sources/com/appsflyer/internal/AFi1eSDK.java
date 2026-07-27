package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFj1sSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class AFi1eSDK extends AFi1cSDK {
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getRevenue;

    public AFi1eSDK(Runnable runnable, ExecutorService executorService, AFd1qSDK aFd1qSDK) {
        super("store", "google", aFd1qSDK, runnable);
        this.getRevenue = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    private boolean getCurrencyIso4217Code(Context context) {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFb1qSDK.getRevenue(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFh1vSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        if (getCurrencyIso4217Code(context)) {
            this.component1 = System.currentTimeMillis();
            this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1sSDK.AnonymousClass1());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass1(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFi1eSDK$1, reason: invalid class name */
    final class AnonymousClass1 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1eSDK.this.AFAdRevenueData(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1eSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1eSDK$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1eSDK.AnonymousClass1.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer service disconnected");
        }
    }

    protected final void AFAdRevenueData(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.getRevenue.put("code", String.valueOf(i));
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.android.vending")));
        this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.getMediationNetwork.put("response", "OK");
            try {
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getRevenue.put("val", installReferrer2);
                        this.getMediationNetwork.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getRevenue.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getRevenue.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getRevenue.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.getMediationNetwork.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "ReferrerClient: InstallReferrer is not ready");
                    this.getRevenue.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, new StringBuilder("Failed to get install referrer: ").append(th.getMessage()).toString());
                this.getRevenue.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i == 3) {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
        } else {
            AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "responseCode not found.");
        }
        AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer collected locally");
        getRevenue();
    }
}
