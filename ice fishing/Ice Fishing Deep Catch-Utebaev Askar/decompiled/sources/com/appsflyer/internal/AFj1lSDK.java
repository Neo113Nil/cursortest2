package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1lSDK extends AFi1cSDK {
    public AFj1lSDK(AFd1qSDK aFd1qSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1qSDK, runnable);
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        if (getMediationNetwork()) {
            this.component1 = System.currentTimeMillis();
            this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1sSDK.AnonymousClass1());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1lSDK.1
                public final void onGetAppsReferrerSetupFinished(int i2) {
                    Map<String, Object> map;
                    String str;
                    AFLogger aFLogger;
                    AFh1vSDK aFh1vSDK;
                    String str2;
                    AFj1lSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1lSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.xiaomi.mipicks"));
                    if (i2 != -1) {
                        if (i2 != 0) {
                            if (i2 == 1) {
                                AFj1lSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                                aFLogger = AFLogger.INSTANCE;
                                aFh1vSDK = AFh1vSDK.REFERRER;
                                str2 = "XiaomiInstallReferrer not supported";
                            } else if (i2 == 2) {
                                AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                map = AFj1lSDK.this.getMediationNetwork;
                                str = "FEATURE_NOT_SUPPORTED";
                            } else if (i2 == 3) {
                                AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                                map = AFj1lSDK.this.getMediationNetwork;
                                str = "DEVELOPER_ERROR";
                            } else if (i2 != 4) {
                                aFLogger = AFLogger.INSTANCE;
                                aFh1vSDK = AFh1vSDK.REFERRER;
                                str2 = "responseCode not found.";
                            } else {
                                AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                                map = AFj1lSDK.this.getMediationNetwork;
                                str = "PERMISSION_ERROR";
                            }
                            aFLogger.w(aFh1vSDK, str2);
                        } else {
                            AFj1lSDK aFj1lSDK = AFj1lSDK.this;
                            GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                            aFj1lSDK.getMediationNetwork.put("response", "OK");
                            try {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK2 = AFh1vSDK.REFERRER;
                                aFLogger2.d(aFh1vSDK2, "XiaomiInstallReferrer connected");
                                if (getAppsReferrerClient.isReady()) {
                                    GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        aFj1lSDK.getMediationNetwork.put("referrer", installReferrer2);
                                    }
                                    aFj1lSDK.getMediationNetwork.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                    aFj1lSDK.getMediationNetwork.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                    HashMap map2 = new HashMap();
                                    map2.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                    map2.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                    map2.put("install_version", installReferrer.getInstallVersion());
                                    aFj1lSDK.getMediationNetwork.put("xiaomi_custom", map2);
                                } else {
                                    aFLogger2.w(aFh1vSDK2, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                AFLogger aFLogger3 = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK3 = AFh1vSDK.REFERRER;
                                StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                                sb.append(th.getMessage());
                                aFLogger3.w(aFh1vSDK3, sb.toString());
                            }
                        }
                        AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                        AFj1lSDK.this.getRevenue();
                        getAppsReferrerClientBuild.endConnection();
                    }
                    AFLogger.INSTANCE.w(AFh1vSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                    map = AFj1lSDK.this.getMediationNetwork;
                    str = "SERVICE_DISCONNECTED";
                    map.put("response", str);
                    AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1lSDK.this.getRevenue();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }

    private boolean getMediationNetwork() {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFh1vSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }
}
