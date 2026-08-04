package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1pSDK extends AFi1bSDK {
    private final AFd1kSDK getCurrencyIso4217Code;

    public AFj1pSDK(Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        AFc1dSDK<Map<String, Object>> aFc1dSDK = new AFc1dSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1pSDK.5
            private static void F_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j2 = cursor.getLong(columnIndex);
                if (j2 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j2));
            }

            private static void G_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:24:0x00d5 A[PHI: r2
              0x00d5: PHI (r2v1 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v8 android.database.Cursor) binds: [B:23:0x00d3, B:17:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.appsflyer.internal.AFc1dSDK
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getMonetizationNetwork() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getRevenue.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.AFAdRevenueData);
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFj1pSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFj1pSDK.this.getMediationNetwork.put("response", "OK");
                            G_("referrer", AFj1pSDK.this.getMediationNetwork, cursorQuery);
                            F_("click_ts", AFj1pSDK.this.getMediationNetwork, cursorQuery);
                            F_("install_begin_ts", AFj1pSDK.this.getMediationNetwork, cursorQuery);
                            F_("install_end_ts", AFj1pSDK.this.getMediationNetwork, cursorQuery);
                            G_("organic_keywords", AFj1pSDK.this.getMediationNetwork, cursorQuery);
                            G_("attr_type", AFj1pSDK.this.getMediationNetwork, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            F_("click_server_ts", map, cursorQuery);
                            F_("install_begin_server_ts", map, cursorQuery);
                            G_("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFj1pSDK.this.getMediationNetwork.put("custom", map);
                            }
                        } else {
                            AFj1pSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e2) {
                        AFj1pSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e2.getMessage(), e2, false, true);
                        if (0 != 0) {
                            cursorQuery.close();
                        }
                    }
                    String str = ((PackageItemInfo) this.getRevenue.getPackageManager().resolveContentProvider(this.AFAdRevenueData, 128)).packageName;
                    AFj1pSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(this.getRevenue, str)));
                    AFj1pSDK.this.getMediationNetwork.put("api_ver_name", AFb1qSDK.getMediationNetwork(this.getRevenue, str));
                    AFj1pSDK.this.getRevenue();
                    return AFj1pSDK.this.getMediationNetwork;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        };
        AFd1rSDK revenue = this.getCurrencyIso4217Code.getRevenue();
        AFb1rSDK.getRevenue();
        if (AFb1rSDK.getMediationNetwork(revenue, false) > 0 || !aFc1dSDK.getCurrencyIso4217Code()) {
            return;
        }
        aFc1dSDK.getCurrencyIso4217Code.execute(aFc1dSDK.getMediationNetwork);
        this.component1 = System.currentTimeMillis();
        this.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1sSDK.AnonymousClass1());
    }
}
