package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1sSDK;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFj1rSDK extends AFi1cSDK {
    private final ExecutorService getRevenue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(ExecutorService executorService, AFd1qSDK aFd1qSDK, Runnable runnable) {
        super("preload", "samsung", aFd1qSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getRevenue = executorService;
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1rSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1rSDK.getMediationNetwork(AFj1rSDK.this, context);
                }
            });
        }
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getMonetizationNetwork()) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean E_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0120, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0122, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMediationNetwork(AFj1rSDK aFj1rSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor query;
        Date AFAdRevenueData;
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1rSDK.component1 = System.currentTimeMillis();
        aFj1rSDK.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        aFj1rSDK.addObserver(new AFj1sSDK.AnonymousClass1());
        Cursor cursor = null;
        r2 = null;
        Long l = null;
        cursor = null;
        try {
            Uri parse = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    query = acquireUnstableContentProviderClient.query(parse, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        aFj1rSDK.getRevenue();
                        return;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                    }
                }
            } else {
                query = null;
            }
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        if (E_(query)) {
                            String N_ = AFj1kSDK.N_(query, "INSTALLED_TIME_TEXT");
                            if (N_ != null && (AFAdRevenueData = AFa1pSDK.AFAdRevenueData(N_, "yy:MM:dd:hh:mm")) != null) {
                                l = Long.valueOf(AFAdRevenueData.getTime());
                            }
                            if (l != null) {
                                long longValue = l.longValue();
                                Map<String, Object> map = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(longValue));
                            }
                            String N_2 = AFj1kSDK.N_(query, "MAPS_ID");
                            if (N_2 != null) {
                                Map<String, Object> map2 = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("referrer", N_2);
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String N_3 = AFj1kSDK.N_(query, "DEVICE_NAME");
                            if (N_3 != null) {
                                linkedHashMap.put("device_model", N_3);
                            }
                            String N_4 = AFj1kSDK.N_(query, "COUNTRY");
                            if (N_4 != null) {
                                linkedHashMap.put("country", N_4);
                            }
                            String N_5 = AFj1kSDK.N_(query, "CAMPAIGN_ID");
                            if (N_5 != null) {
                                linkedHashMap.put("campaign_id", N_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map3 = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                map3.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map4 = aFj1rSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map5 = aFj1rSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map5, "");
                            map5.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    cursor = query;
                    AFLogger.INSTANCE.e(AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    aFj1rSDK.getRevenue();
                    return;
                }
            }
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
            if (query != null) {
                query.close();
            }
        } catch (Throwable th4) {
            th = th4;
            contentProviderClient = null;
        }
    }
}
