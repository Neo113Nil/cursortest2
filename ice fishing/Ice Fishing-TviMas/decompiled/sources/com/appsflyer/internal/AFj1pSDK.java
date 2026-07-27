package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1sSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFj1pSDK extends AFi1bSDK {
    private final AFd1kSDK getCurrencyIso4217Code;

    public AFj1pSDK(Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        AFc1dSDK<Map<String, Object>> aFc1dSDK = new AFc1dSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1pSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
            
                if (r2 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getRevenue.getPackageManager().resolveContentProvider(r10.AFAdRevenueData, 128)).packageName;
                r10.getMonetizationNetwork.getMediationNetwork.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1qSDK.AFAdRevenueData(r10.getRevenue, r0)));
                r10.getMonetizationNetwork.getMediationNetwork.put("api_ver_name", com.appsflyer.internal.AFb1qSDK.getMediationNetwork(r10.getRevenue, r0));
                r10.getMonetizationNetwork.getRevenue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0114, code lost:
            
                return r10.getMonetizationNetwork.getMediationNetwork;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
            
                if (0 == 0) goto L25;
             */
            @Override // com.appsflyer.internal.AFc1dSDK
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> getMonetizationNetwork() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.getRevenue.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFAdRevenueData).toString()), null, null, null, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFj1pSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1pSDK.this.getMediationNetwork.put("response", "OK");
                                G_("referrer", AFj1pSDK.this.getMediationNetwork, cursor);
                                F_("click_ts", AFj1pSDK.this.getMediationNetwork, cursor);
                                F_("install_begin_ts", AFj1pSDK.this.getMediationNetwork, cursor);
                                F_("install_end_ts", AFj1pSDK.this.getMediationNetwork, cursor);
                                G_("organic_keywords", AFj1pSDK.this.getMediationNetwork, cursor);
                                G_("attr_type", AFj1pSDK.this.getMediationNetwork, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                F_("click_server_ts", hashMap, cursor);
                                F_("install_begin_server_ts", hashMap, cursor);
                                G_("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    AFj1pSDK.this.getMediationNetwork.put("custom", hashMap);
                                }
                            }
                        } else {
                            AFj1pSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFj1pSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private static void F_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void G_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
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
