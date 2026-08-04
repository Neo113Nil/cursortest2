package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1zSDK extends AFi1cSDK {
    private final AFd1kSDK getCurrencyIso4217Code;
    private final AFj1wSDK getRevenue;

    public AFj1zSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFj1wSDK aFj1wSDK) {
        super("store", "huawei", aFd1kSDK.getMediationNetwork(), runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getRevenue = aFj1wSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00fc A[PHI: r2
      0x00fc: PHI (r2v8 android.database.Cursor) = (r2v7 android.database.Cursor), (r2v9 android.database.Cursor) binds: [B:24:0x00fa, B:15:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1sSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, str)));
        this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.getMediationNetwork.put("response", "OK");
                this.getMediationNetwork.put("referrer", cursorQuery.getString(0));
                this.getMediationNetwork.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.getMediationNetwork.put("huawei_custom", map);
                }
            } else {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th) {
            try {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFh1vSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
                if (0 != 0) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }
        getRevenue();
    }

    private boolean getRevenue(Context context) {
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str;
        if (!getMonetizationNetwork()) {
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.REFERRER;
            str = "Huawei referrer collection disallowed by counter.";
        } else if (!this.getRevenue.getCurrencyIso4217Code(context)) {
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.REFERRER;
            str = "Huawei referrer collection disallowed by missing content provider.";
        } else {
            if (this.getRevenue.getRevenue(context)) {
                return true;
            }
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.REFERRER;
            str = "Huawei referrer collection disallowed by invalid content provider.";
        }
        aFLogger.d(aFh1vSDK, str);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new l(this, context, 4));
        }
    }
}
