package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFi1dSDK extends AFi1fSDK {
    private final AFi1hSDK getMediationNetwork;
    private final AFc1fSDK getRevenue;

    public AFi1dSDK(Runnable runnable, AFc1fSDK aFc1fSDK, AFi1hSDK aFi1hSDK) {
        super("store", "huawei", aFc1fSDK.getRevenue(), runnable);
        this.getRevenue = aFc1fSDK;
        this.getMediationNetwork = aFi1hSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00de, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0105, code lost:
    
        getMonetizationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0108, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        if (0 == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getMediationNetwork(Context context) {
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        addObserver(new AFj1ySDK.AnonymousClass2());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor != null) {
                boolean moveToFirst = cursor.moveToFirst();
                Map<String, Object> map = this.AFAdRevenueData;
                if (moveToFirst) {
                    map.put("response", "OK");
                    this.AFAdRevenueData.put(Constants.KEY_REFERRER, cursor.getString(0));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(cursor.getLong(1)));
                    this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                    if (cursor.getColumnCount() > 3) {
                        this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                        HashMap hashMap = new HashMap();
                        String string = cursor.getString(4);
                        if (string != null) {
                            hashMap.put("track_id", string);
                        }
                        hashMap.put("referrer_ex", cursor.getString(5));
                        this.AFAdRevenueData.put("huawei_custom", hashMap);
                    }
                } else {
                    map.put("response", "FEATURE_NOT_SUPPORTED");
                }
            } else {
                this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
            }
        }
    }

    private boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.getMediationNetwork(context)) {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.AFAdRevenueData(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(Context context) {
        if (getMonetizationNetwork(context)) {
            this.getRevenue.AFAdRevenueData().execute(new f(2, this, context));
        }
    }
}
