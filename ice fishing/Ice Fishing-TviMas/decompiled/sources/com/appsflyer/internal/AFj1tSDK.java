package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1sSDK;

/* loaded from: classes4.dex */
public final class AFj1tSDK extends AFj1sSDK {
    final ProviderInfo getCurrencyIso4217Code;
    private final AFd1kSDK getRevenue;

    public AFj1tSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getRevenue = aFd1kSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        this.getRevenue.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1tSDK.4
            /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1tSDK aFj1tSDK = AFj1tSDK.this;
                aFj1tSDK.component1 = System.currentTimeMillis();
                aFj1tSDK.component2 = AFj1sSDK.AFa1zSDK.STARTED;
                aFj1tSDK.addObserver(new AFj1sSDK.AnonymousClass1());
                Uri parse = Uri.parse(new StringBuilder("content://").append(AFj1tSDK.this.getCurrencyIso4217Code.authority).append("/transaction_id").toString());
                ContentProviderClient D_ = AFj1tSDK.D_(context, parse);
                try {
                    if (D_ != null) {
                        try {
                            try {
                                query = D_.query(parse, null, new StringBuilder("app_id=").append(context.getPackageName()).toString(), null, null);
                                D_.close();
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                                D_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1tSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName)));
                                AFj1tSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName));
                                AFj1tSDK.this.getRevenue();
                            }
                        } catch (DeadObjectException e) {
                            AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e, false, true, false);
                            D_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1tSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName)));
                            AFj1tSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName));
                            AFj1tSDK.this.getRevenue();
                        } catch (RemoteException e2) {
                            AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Failed to query unstable content providerClient", e2, false, true, false);
                            D_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1tSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName)));
                            AFj1tSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName));
                            AFj1tSDK.this.getRevenue();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex != -1) {
                                AFj1tSDK.this.getMediationNetwork.put("response", "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1tSDK.this.getMediationNetwork.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "Wrong column name");
                                AFj1tSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1tSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFj1tSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName)));
                        AFj1tSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName));
                        AFj1tSDK.this.getRevenue();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1tSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName)));
                    AFj1tSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1tSDK.this.getCurrencyIso4217Code).packageName));
                    AFj1tSDK.this.getRevenue();
                } catch (Throwable th2) {
                    D_.close();
                    throw th2;
                }
            }
        });
    }

    public static ContentProviderClient D_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }
}
