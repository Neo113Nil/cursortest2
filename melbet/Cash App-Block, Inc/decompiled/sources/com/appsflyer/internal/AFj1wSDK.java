package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFj1wSDK extends AFi1cSDK {
    private final AFd1zSDK AFAdRevenueData;
    private final AFj1vSDK getCurrencyIso4217Code;

    public AFj1wSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFj1vSDK aFj1vSDK) {
        super("store", "huawei", aFd1zSDK.AFAdRevenueData(), runnable);
        this.AFAdRevenueData = aFd1zSDK;
        this.getCurrencyIso4217Code = aFj1vSDK;
    }

    private boolean getCurrencyIso4217Code(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getCurrencyIso4217Code.getCurrencyIso4217Code(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getCurrencyIso4217Code.getRevenue(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e2, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0109, code lost:
    
        getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
    
        if (0 == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getRevenue(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str)));
        this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor != null) {
                boolean moveToFirst = cursor.moveToFirst();
                Map<String, Object> map = this.getMediationNetwork;
                if (moveToFirst) {
                    map.put("response", "OK");
                    this.getMediationNetwork.put("referrer", cursor.getString(0));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(cursor.getLong(1)));
                    this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                    if (cursor.getColumnCount() > 3) {
                        this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                        HashMap hashMap = new HashMap();
                        String string2 = cursor.getString(4);
                        if (string2 != null) {
                            hashMap.put("track_id", string2);
                        }
                        hashMap.put("referrer_ex", cursor.getString(5));
                        this.getMediationNetwork.put("huawei_custom", hashMap);
                    }
                } else {
                    map.put("response", "FEATURE_NOT_SUPPORTED");
                }
            } else {
                this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th) {
            try {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        if (getCurrencyIso4217Code(context)) {
            this.AFAdRevenueData.getMonetizationNetwork().execute(new AFb1iSDK$$ExternalSyntheticLambda1(3, this, context));
        }
    }
}
