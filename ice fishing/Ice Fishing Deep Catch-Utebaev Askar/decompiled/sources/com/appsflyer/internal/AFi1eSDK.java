package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class AFi1eSDK extends AFi1cSDK {
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1eSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i2) {
            AFi1eSDK.this.AFAdRevenueData(installReferrerClient, context, i2);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i2) {
            ExecutorService executorService = AFi1eSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i2);
                }
            });
        }
    }

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
            if (AFb1qSDK.getRevenue(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e2) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e2);
            AFLogger.INSTANCE.v(AFh1vSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    public final void AFAdRevenueData(InstallReferrerClient installReferrerClient, Context context, int i2) {
        Map<String, Object> map;
        String str;
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str2;
        this.getRevenue.put("code", String.valueOf(i2));
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.android.vending")));
        this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.android.vending"));
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 == 1) {
                    this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                    aFLogger = AFLogger.INSTANCE;
                    aFh1vSDK = AFh1vSDK.REFERRER;
                    str2 = "InstallReferrer not supported";
                } else if (i2 == 2) {
                    AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
                    map = this.getMediationNetwork;
                    str = "FEATURE_NOT_SUPPORTED";
                } else if (i2 != 3) {
                    aFLogger = AFLogger.INSTANCE;
                    aFh1vSDK = AFh1vSDK.REFERRER;
                    str2 = "responseCode not found.";
                } else {
                    AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
                    map = this.getMediationNetwork;
                    str = "DEVELOPER_ERROR";
                }
                aFLogger.w(aFh1vSDK, str2);
            } else {
                this.getMediationNetwork.put("response", "OK");
                try {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK2 = AFh1vSDK.REFERRER;
                    aFLogger2.d(aFh1vSDK2, "InstallReferrer connected");
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
                        HashMap map2 = new HashMap();
                        try {
                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                            this.getRevenue.put("instant", Boolean.valueOf(googlePlayInstantParam));
                            map2.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        } catch (NoSuchMethodError e2) {
                            AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e2);
                        }
                        try {
                            map2.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                            map2.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                            map2.put("install_version", installReferrer.getInstallVersion());
                        } catch (NoSuchMethodError e3) {
                            AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "some method not exist", e3, false, false);
                        }
                        if (!map2.isEmpty()) {
                            this.getMediationNetwork.put("google_custom", map2);
                        }
                        installReferrerClient.endConnection();
                    } else {
                        aFLogger2.w(aFh1vSDK2, "ReferrerClient: InstallReferrer is not ready");
                        this.getRevenue.put("err", "ReferrerClient: InstallReferrer is not ready");
                    }
                } catch (Throwable th) {
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK3 = AFh1vSDK.REFERRER;
                    StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                    sb.append(th.getMessage());
                    aFLogger3.w(aFh1vSDK3, sb.toString());
                    this.getRevenue.put("err", th.getMessage());
                    aFLogger3.e(aFh1vSDK3, "Failed to get install referrer", th, false, false);
                }
            }
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer collected locally");
            getRevenue();
        }
        AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
        map = this.getMediationNetwork;
        str = "SERVICE_DISCONNECTED";
        map.put("response", str);
        AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Install Referrer collected locally");
        getRevenue();
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        if (getCurrencyIso4217Code(context)) {
            this.component1 = System.currentTimeMillis();
            this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1sSDK.AnonymousClass1());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new AnonymousClass1(installReferrerClientBuild, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }
}
