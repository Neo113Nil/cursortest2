package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1sSDK;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AFj1zSDK extends AFi1cSDK {
    private final AFd1kSDK getCurrencyIso4217Code;
    private final AFj1wSDK getRevenue;

    public AFj1zSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFj1wSDK aFj1wSDK) {
        super("store", "huawei", aFd1kSDK.getMediationNetwork(), runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getRevenue = aFj1wSDK;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1zSDK.this.getCurrencyIso4217Code(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
    
        getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1sSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, str)));
        this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor != null) {
                if (!cursor.moveToFirst()) {
                    this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                } else {
                    this.getMediationNetwork.put("response", "OK");
                    this.getMediationNetwork.put("referrer", cursor.getString(0));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(cursor.getLong(1)));
                    this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                    if (cursor.getColumnCount() > 3) {
                        this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                        HashMap hashMap = new HashMap();
                        String string = cursor.getString(4);
                        if (string != null) {
                            hashMap.put("track_id", string);
                        }
                        hashMap.put("referrer_ex", cursor.getString(5));
                        this.getMediationNetwork.put("huawei_custom", hashMap);
                    }
                }
            } else {
                this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th) {
            try {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    private boolean getRevenue(Context context) {
        if (!getMonetizationNetwork()) {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getRevenue.getCurrencyIso4217Code(context)) {
            AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getRevenue.getRevenue(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1vSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }
}
