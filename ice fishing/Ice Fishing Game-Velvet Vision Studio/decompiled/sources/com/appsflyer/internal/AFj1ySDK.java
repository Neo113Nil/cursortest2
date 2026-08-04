package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.gamericefishpro.space.ph.m0;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFj1ySDK extends AFi1cSDK {
    private final AFc1oSDK AFAdRevenueData;
    private final Runnable component2;
    private String equals;
    private final ExecutorService getCurrencyIso4217Code;
    private final AFj1zSDK getMonetizationNetwork;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                throw new com.gamericefishpro.space.oh.k();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1oSDK, runnable);
        this.AFAdRevenueData = aFc1oSDK;
        this.getCurrencyIso4217Code = executorService;
        this.getMonetizationNetwork = aFj1zSDK;
        this.component2 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i = AFa1vSDK.getRevenue[this.getMonetizationNetwork.ordinal()];
        if (i == 1) {
            return getMediationNetwork(context);
        }
        if (i == 2) {
            return AFAdRevenueData(context);
        }
        if (i == 3) {
            return component3(context);
        }
        throw new com.gamericefishpro.space.oh.k();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[PHI: r0
      0x008b: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003a, B:23:0x0061, B:32:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getRevenue(Context context) {
        String str;
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String strY = currencyIso4217Code != null ? StringsKt.y(currencyIso4217Code) : null;
        if (strY == null || strY.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strY = null;
        }
        if (strY == null) {
            String revenue = this.AFAdRevenueData.getRevenue("facebook_application_id");
            strY = revenue != null ? StringsKt.y(revenue) : null;
            if (strY == null || strY.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strY = null;
            }
            if (strY == null) {
                String currencyIso4217Code2 = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                strY = currencyIso4217Code2 != null ? StringsKt.y(currencyIso4217Code2) : null;
                if (strY == null || strY.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strY = null;
                }
                str = strY != null ? strY : null;
            }
        }
        this.equals = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.execute(new h(5, this, context));
        } else {
            this.component2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0210 A[PHI: r25
      0x0210: PHI (r25v2 android.content.ContentProviderClient) = 
      (r25v1 android.content.ContentProviderClient)
      (r25v3 android.content.ContentProviderClient)
      (r25v3 android.content.ContentProviderClient)
     binds: [B:83:0x0257, B:71:0x020e, B:76:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:82:0x0254  */
    public static final void getMonetizationNetwork(AFj1ySDK aFj1ySDK, Context context) {
        String str;
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Uri uri;
        String string;
        String str2;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str3 = aFj1ySDK.equals;
        Intrinsics.b(str3);
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.getMonetizationNetwork;
            int[] iArr = AFa1vSDK.getRevenue;
            int i = iArr[aFj1zSDK.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
            try {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (component3(context)) {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                                uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str3));
                            } else {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                                uri = null;
                            }
                        } else {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                    } else if (AFAdRevenueData(context)) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                        uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getMediationNetwork(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                    uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                    uri = null;
                }
                if (uri != null) {
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                    if (columnIndex != -1) {
                                        string = cursorQuery.getString(columnIndex);
                                    } else {
                                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.getMonetizationNetwork + " provider", false, 4, null);
                                        string = null;
                                    }
                                    if (string != null) {
                                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.getMonetizationNetwork + " attribution data.", false, 4, null);
                                        Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map, "");
                                        map.put("response", "OK");
                                        Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map2, "");
                                        map2.put("referrer", string);
                                        int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                        Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                        if (lValueOf != null) {
                                            aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                        Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                        if (numValueOf != null) {
                                            aFj1ySDK.getMediationNetwork.put("meta_custom", m0.f(new Pair("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                        }
                                        int i2 = iArr[aFj1ySDK.getMonetizationNetwork.ordinal()];
                                        if (i2 == 1) {
                                            str2 = "com.facebook.katana";
                                        } else if (i2 == 2) {
                                            str2 = "com.instagram.android";
                                        } else if (i2 == 3) {
                                            str2 = "com.facebook.lite";
                                        } else {
                                            throw new com.gamericefishpro.space.oh.k();
                                        }
                                        Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map3, "");
                                        map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str2)));
                                        Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map4, "");
                                        map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str2));
                                    }
                                    cursorQuery.close();
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } else {
                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                try {
                                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } catch (Throwable th3) {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th = th;
                cursor = null;
                contentProviderClientAcquireUnstableContentProviderClient = null;
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
                if (cursor != null) {
                    cursor.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                aFj1ySDK.getMediationNetwork();
                aFj1ySDK.component2.run();
            }
        } catch (Throwable th6) {
            th = th6;
            str = "Error while collecting Meta Install Referrer for ";
        }
        aFj1ySDK.getMediationNetwork();
        aFj1ySDK.component2.run();
    }
}
