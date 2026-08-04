package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
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

    private final boolean AFAdRevenueData(Context context) {
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str;
        if (!getMonetizationNetwork()) {
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.SAMSUNG_PRELOAD_REFERRER;
            str = "Referrer collection disallowed by counter.";
        } else {
            if (getCurrencyIso4217Code(context)) {
                return true;
            }
            aFLogger = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.SAMSUNG_PRELOAD_REFERRER;
            str = "Referrer collection disallowed by missing content provider.";
        }
        AFh1uSDK.d$default(aFLogger, aFh1vSDK, str, false, 4, null);
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

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getRevenue.execute(new l(this, context, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    public static final void getMediationNetwork(AFj1rSDK aFj1rSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursorQuery;
        Date dateAFAdRevenueData;
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1rSDK.component1 = System.currentTimeMillis();
        aFj1rSDK.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        aFj1rSDK.addObserver(new AFj1sSDK.AnonymousClass1());
        Cursor cursor = null;
        cursor = null;
        lValueOf = null;
        Long lValueOf = null;
        try {
            Uri uri = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFj1rSDK.getRevenue();
                    } catch (Throwable th3) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        throw th3;
                    }
                }
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        if (E_(cursorQuery)) {
                            String strN_ = AFj1kSDK.N_(cursorQuery, "INSTALLED_TIME_TEXT");
                            if (strN_ != null && (dateAFAdRevenueData = AFa1pSDK.AFAdRevenueData(strN_, "yy:MM:dd:hh:mm")) != null) {
                                lValueOf = Long.valueOf(dateAFAdRevenueData.getTime());
                            }
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                Map<String, Object> map = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(jLongValue));
                            }
                            String strN_2 = AFj1kSDK.N_(cursorQuery, "MAPS_ID");
                            if (strN_2 != null) {
                                Map<String, Object> map2 = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("referrer", strN_2);
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String strN_3 = AFj1kSDK.N_(cursorQuery, "DEVICE_NAME");
                            if (strN_3 != null) {
                                linkedHashMap.put("device_model", strN_3);
                            }
                            String strN_4 = AFj1kSDK.N_(cursorQuery, "COUNTRY");
                            if (strN_4 != null) {
                                linkedHashMap.put(AdRevenueScheme.COUNTRY, strN_4);
                            }
                            String strN_5 = AFj1kSDK.N_(cursorQuery, "CAMPAIGN_ID");
                            if (strN_5 != null) {
                                linkedHashMap.put("campaign_id", strN_5);
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
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    } else {
                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    cursor = cursorQuery;
                    AFLogger.INSTANCE.e(AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                }
            } else {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFj1rSDK.getRevenue();
    }
}
