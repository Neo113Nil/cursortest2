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
import com.appsflyer.internal.AFj1ySDK;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes.dex */
public final class AFj1vSDK extends AFj1ySDK {
    private final AFc1fSDK getMediationNetwork;
    final ProviderInfo getRevenue;

    public AFj1vSDK(ProviderInfo providerInfo, Runnable runnable, AFc1fSDK aFc1fSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMediationNetwork = aFc1fSDK;
        this.getRevenue = providerInfo;
    }

    public static ContentProviderClient z_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(final Context context) {
        this.getMediationNetwork.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1vSDK aFj1vSDK = AFj1vSDK.this;
                aFj1vSDK.areAllFieldsValid = System.currentTimeMillis();
                aFj1vSDK.component1 = AFj1ySDK.AFa1vSDK.STARTED;
                aFj1vSDK.addObserver(new AFj1ySDK.AnonymousClass2());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFj1vSDK.this.getRevenue.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient z_ = AFj1vSDK.z_(context, parse);
                try {
                    if (z_ != null) {
                        try {
                            try {
                                StringBuilder sb2 = new StringBuilder("app_id=");
                                sb2.append(context.getPackageName());
                                query = z_.query(parse, null, sb2.toString(), null, null);
                                z_.close();
                            } catch (RemoteException e) {
                                AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to query unstable content providerClient", e, false, true, false);
                                z_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1vSDK aFj1vSDK2 = AFj1vSDK.this;
                                aFj1vSDK2.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1vSDK2.getRevenue).packageName)));
                                AFj1vSDK aFj1vSDK3 = AFj1vSDK.this;
                                aFj1vSDK3.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1vSDK3.getRevenue).packageName));
                                AFj1vSDK.this.getMonetizationNetwork();
                            }
                        } catch (DeadObjectException e2) {
                            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false, true, false);
                            z_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1vSDK aFj1vSDK22 = AFj1vSDK.this;
                            aFj1vSDK22.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1vSDK22.getRevenue).packageName)));
                            AFj1vSDK aFj1vSDK32 = AFj1vSDK.this;
                            aFj1vSDK32.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1vSDK32.getRevenue).packageName));
                            AFj1vSDK.this.getMonetizationNetwork();
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                            z_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1vSDK aFj1vSDK222 = AFj1vSDK.this;
                            aFj1vSDK222.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1vSDK222.getRevenue).packageName)));
                            AFj1vSDK aFj1vSDK322 = AFj1vSDK.this;
                            aFj1vSDK322.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1vSDK322.getRevenue).packageName));
                            AFj1vSDK.this.getMonetizationNetwork();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex == -1) {
                                AFLogger.INSTANCE.w(AFh1zSDK.PREINSTALL, "Wrong column name");
                                AFj1vSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1vSDK.this.AFAdRevenueData.put("response", "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1vSDK.this.AFAdRevenueData.put(Constants.KEY_REFERRER, string);
                                    }
                                }
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFh1zSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1vSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFj1vSDK aFj1vSDK2222 = AFj1vSDK.this;
                        aFj1vSDK2222.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1vSDK2222.getRevenue).packageName)));
                        AFj1vSDK aFj1vSDK3222 = AFj1vSDK.this;
                        aFj1vSDK3222.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1vSDK3222.getRevenue).packageName));
                        AFj1vSDK.this.getMonetizationNetwork();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1vSDK aFj1vSDK22222 = AFj1vSDK.this;
                    aFj1vSDK22222.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1vSDK22222.getRevenue).packageName)));
                    AFj1vSDK aFj1vSDK32222 = AFj1vSDK.this;
                    aFj1vSDK32222.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1vSDK32222.getRevenue).packageName));
                    AFj1vSDK.this.getMonetizationNetwork();
                } catch (Throwable th2) {
                    z_.close();
                    throw th2;
                }
            }
        });
    }
}
