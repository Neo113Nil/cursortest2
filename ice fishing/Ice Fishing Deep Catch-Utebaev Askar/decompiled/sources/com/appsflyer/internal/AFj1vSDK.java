package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1vSDK extends AFi1cSDK {
    private final AFj1xSDK areAllFieldsValid;
    private final Runnable component4;
    private String copy;
    private final AFd1qSDK getCurrencyIso4217Code;
    private final ExecutorService getRevenue;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1xSDK.values().length];
            try {
                iArr[AFj1xSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1xSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1xSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1vSDK(AFd1qSDK aFd1qSDK, ExecutorService executorService, AFj1xSDK aFj1xSDK, Runnable runnable, Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i2 = AFj1qSDK.AFa1uSDK.getMonetizationNetwork[aFj1xSDK.ordinal()];
        if (i2 == 1) {
            str = "facebook";
        } else if (i2 == 2) {
            str = "instagram";
        } else {
            if (i2 != 3) {
                throw new f.c();
            }
            str = "facebook_lite";
        }
        super("app", str, aFd1qSDK, runnable);
        this.getCurrencyIso4217Code = aFd1qSDK;
        this.getRevenue = executorService;
        this.areAllFieldsValid = aFj1xSDK;
        this.component4 = runnable2;
    }

    private final boolean AFAdRevenueData(Context context) {
        int i2 = AFa1ySDK.getMediationNetwork[this.areAllFieldsValid.ordinal()];
        if (i2 == 1) {
            return getRevenue(context);
        }
        if (i2 == 2) {
            return getCurrencyIso4217Code(context);
        }
        if (i2 == 3) {
            return component4(context);
        }
        throw new f.c();
    }

    private static boolean component4(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009e A[PHI: r0
      0x009e: PHI (r0v6 java.lang.String) = (r0v5 java.lang.String), (r0v11 java.lang.String), (r0v16 java.lang.String) binds: [B:19:0x0041, B:32:0x006e, B:45:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getMonetizationNetwork(Context context) {
        String str;
        if (!getMonetizationNetwork()) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String revenue = this.getCurrencyIso4217Code.getRevenue("com.facebook.sdk.ApplicationId");
        String strI = revenue != null ? kotlin.text.q.i(revenue) : null;
        if (strI == null || strI.length() == 0) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strI = null;
        }
        if (strI == null) {
            String strAFAdRevenueData = this.getCurrencyIso4217Code.AFAdRevenueData("facebook_application_id");
            strI = strAFAdRevenueData != null ? kotlin.text.q.i(strAFAdRevenueData) : null;
            if (strI == null || strI.length() == 0) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strI = null;
            }
            if (strI == null) {
                String revenue2 = this.getCurrencyIso4217Code.getRevenue("com.appsflyer.FacebookApplicationId");
                strI = revenue2 != null ? kotlin.text.q.i(revenue2) : null;
                if (strI == null || strI.length() == 0) {
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strI = null;
                }
                str = strI != null ? strI : null;
            }
        }
        this.copy = str;
        if (str == null) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (AFAdRevenueData(context)) {
            return true;
        }
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x023d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0242 A[PHI: r9
      0x0242: PHI (r9v4 android.content.ContentProviderClient) = 
      (r9v3 android.content.ContentProviderClient)
      (r9v8 android.content.ContentProviderClient)
      (r9v8 android.content.ContentProviderClient)
     binds: [B:86:0x0240, B:66:0x01ea, B:71:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void getRevenue(AFj1vSDK aFj1vSDK, Context context) {
        String str;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Throwable th;
        Cursor cursor;
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str2;
        String strConcat;
        Uri uri;
        String string;
        String str3;
        Intrinsics.checkNotNullParameter(aFj1vSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1vSDK.component1 = System.currentTimeMillis();
        aFj1vSDK.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        aFj1vSDK.addObserver(new AFj1sSDK.AnonymousClass1());
        String str4 = aFj1vSDK.copy;
        Intrinsics.b(str4);
        try {
            AFj1xSDK aFj1xSDK = aFj1vSDK.areAllFieldsValid;
            int[] iArr = AFa1ySDK.getMediationNetwork;
            int i2 = iArr[aFj1xSDK.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new f.c();
                        }
                        if (component4(context)) {
                            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                            strConcat = "content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str4);
                            uri = Uri.parse(strConcat);
                        } else {
                            aFLogger = AFLogger.INSTANCE;
                            aFh1vSDK = AFh1vSDK.META_REFERRER;
                            str2 = "Facebook Lite content provider not found";
                            AFh1uSDK.d$default(aFLogger, aFh1vSDK, str2, false, 4, null);
                            uri = null;
                        }
                    } else if (getCurrencyIso4217Code(context)) {
                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                        strConcat = "content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str4);
                        uri = Uri.parse(strConcat);
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFh1vSDK = AFh1vSDK.META_REFERRER;
                        str2 = "Instagram content provider not found";
                        AFh1uSDK.d$default(aFLogger, aFh1vSDK, str2, false, 4, null);
                        uri = null;
                    }
                } else if (getRevenue(context)) {
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                    strConcat = "content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str4);
                    uri = Uri.parse(strConcat);
                } else {
                    aFLogger = AFLogger.INSTANCE;
                    aFh1vSDK = AFh1vSDK.META_REFERRER;
                    str2 = "Facebook content provider not found";
                    AFh1uSDK.d$default(aFLogger, aFh1vSDK, str2, false, 4, null);
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
                                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "No such column, " + aFj1vSDK.areAllFieldsValid + " provider", false, 4, null);
                                        string = null;
                                    }
                                    if (string != null) {
                                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Collected " + aFj1vSDK.areAllFieldsValid + " attribution data.", false, 4, null);
                                        Map<String, Object> map = aFj1vSDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map, "");
                                        map.put("response", "OK");
                                        Map<String, Object> map2 = aFj1vSDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map2, "");
                                        map2.put("referrer", string);
                                        int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                        Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                        if (lValueOf != null) {
                                            aFj1vSDK.getMediationNetwork.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                        Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                        if (numValueOf != null) {
                                            aFj1vSDK.getMediationNetwork.put("meta_custom", d0.e(new Pair("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                        }
                                        int i3 = iArr[aFj1vSDK.areAllFieldsValid.ordinal()];
                                        if (i3 == 1) {
                                            str3 = "com.facebook.katana";
                                        } else if (i3 == 2) {
                                            str3 = "com.instagram.android";
                                        } else {
                                            if (i3 != 3) {
                                                throw new f.c();
                                            }
                                            str3 = "com.facebook.lite";
                                        }
                                        Map<String, Object> map3 = aFj1vSDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map3, "");
                                        map3.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, str3)));
                                        Map<String, Object> map4 = aFj1vSDK.getMediationNetwork;
                                        Intrinsics.checkNotNullExpressionValue(map4, "");
                                        map4.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, str3));
                                    }
                                    cursorQuery.close();
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } else {
                                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
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
                                    AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, str + aFj1vSDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, 120, null);
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
                            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        cursor = null;
                        AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, str + aFj1vSDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, 120, null);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        aFj1vSDK.getRevenue();
                        aFj1vSDK.component4.run();
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                contentProviderClientAcquireUnstableContentProviderClient = null;
                th = th;
                cursor = null;
                AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, str + aFj1vSDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, 120, null);
                if (cursor != null) {
                    cursor.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                aFj1vSDK.getRevenue();
                aFj1vSDK.component4.run();
            }
        } catch (Throwable th6) {
            th = th6;
            str = "Error while collecting Meta Install Referrer for ";
        }
        aFj1vSDK.getRevenue();
        aFj1vSDK.component4.run();
    }

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new l(this, context, 3));
        } else {
            this.component4.run();
        }
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }
}
