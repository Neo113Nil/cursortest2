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

/* JADX INFO: loaded from: classes.dex */
public final class AFj1tSDK extends AFj1sSDK {
    final ProviderInfo getCurrencyIso4217Code;
    private final AFd1kSDK getRevenue;

    public AFj1tSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getRevenue = aFd1kSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    public static ContentProviderClient D_(Context context, Uri uri) {
        SecurityException securityException;
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str;
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e2) {
            securityException = e2;
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.PREINSTALL;
            str = "Failed to acquire unstable content providerClient due to SecurityException";
            aFLogger.e(aFh1vSDK, str, securityException, false, true, false);
            return null;
        } catch (Throwable th) {
            securityException = th;
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.PREINSTALL;
            str = "Failed to acquire unstable content providerClient due to unexpected throwable";
            aFLogger.e(aFh1vSDK, str, securityException, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        this.getRevenue.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1tSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                RemoteException remoteException;
                AFLogger aFLogger;
                AFh1vSDK aFh1vSDK;
                String str;
                AFj1tSDK aFj1tSDK = AFj1tSDK.this;
                aFj1tSDK.component1 = System.currentTimeMillis();
                aFj1tSDK.component2 = AFj1sSDK.AFa1zSDK.STARTED;
                aFj1tSDK.addObserver(new AFj1sSDK.AnonymousClass1());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFj1tSDK.this.getCurrencyIso4217Code.authority);
                sb.append("/transaction_id");
                Uri uri = Uri.parse(sb.toString());
                ContentProviderClient contentProviderClientD_ = AFj1tSDK.D_(context, uri);
                if (contentProviderClientD_ != null) {
                    try {
                        try {
                            StringBuilder sb2 = new StringBuilder("app_id=");
                            sb2.append(context.getPackageName());
                            cursorQuery = contentProviderClientD_.query(uri, null, sb2.toString(), null, null);
                            contentProviderClientD_.close();
                        } catch (DeadObjectException e2) {
                            remoteException = e2;
                            aFLogger = AFLogger.INSTANCE;
                            aFh1vSDK = AFh1vSDK.PREINSTALL;
                            str = "Failed to acquire unstable content providerClient";
                            aFLogger.e(aFh1vSDK, str, remoteException, false, true, false);
                            contentProviderClientD_.close();
                            cursorQuery = null;
                        } catch (RemoteException e3) {
                            remoteException = e3;
                            aFLogger = AFLogger.INSTANCE;
                            aFh1vSDK = AFh1vSDK.PREINSTALL;
                            str = "Failed to query unstable content providerClient";
                            aFLogger.e(aFh1vSDK, str, remoteException, false, true, false);
                            contentProviderClientD_.close();
                            cursorQuery = null;
                        } catch (Throwable th) {
                            remoteException = th;
                            aFLogger = AFLogger.INSTANCE;
                            aFh1vSDK = AFh1vSDK.PREINSTALL;
                            str = "Error to get data from providerClient ";
                            aFLogger.e(aFh1vSDK, str, remoteException, false, true, false);
                            contentProviderClientD_.close();
                            cursorQuery = null;
                        }
                    } catch (Throwable th2) {
                        contentProviderClientD_.close();
                        throw th2;
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex("transaction_id");
                    if (columnIndex == -1) {
                        AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "Wrong column name");
                        AFj1tSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFj1tSDK.this.getMediationNetwork.put("response", "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFj1tSDK.this.getMediationNetwork.put("referrer", string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.w(AFh1vSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFj1tSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                }
                AFj1tSDK aFj1tSDK2 = AFj1tSDK.this;
                aFj1tSDK2.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1tSDK2.getCurrencyIso4217Code).packageName)));
                AFj1tSDK aFj1tSDK3 = AFj1tSDK.this;
                aFj1tSDK3.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1tSDK3.getCurrencyIso4217Code).packageName));
                AFj1tSDK.this.getRevenue();
            }
        });
    }
}
