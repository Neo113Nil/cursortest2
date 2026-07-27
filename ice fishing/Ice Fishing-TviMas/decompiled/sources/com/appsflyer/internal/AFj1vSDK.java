package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.material3.MenuKt;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class AFj1vSDK extends AFi1cSDK {
    private final AFj1xSDK areAllFieldsValid;
    private final Runnable component4;
    private String copy;
    private final AFd1qSDK getCurrencyIso4217Code;
    private final ExecutorService getRevenue;

    @Override // com.appsflyer.internal.AFj1sSDK
    public final void getMediationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!getMonetizationNetwork(context)) {
            this.component4.run();
        } else {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1vSDK.getRevenue(AFj1vSDK.this, context);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMonetizationNetwork(Context context) {
        if (!getMonetizationNetwork()) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String revenue = this.getCurrencyIso4217Code.getRevenue(FacebookSdk.APPLICATION_ID_PROPERTY);
        String str = null;
        String removePrefix = revenue != null ? StringsKt.removePrefix(revenue, (CharSequence) "fb") : null;
        String str2 = removePrefix;
        if (str2 == null || str2.length() == 0) {
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            removePrefix = null;
        }
        if (removePrefix == null) {
            String AFAdRevenueData = this.getCurrencyIso4217Code.AFAdRevenueData("facebook_application_id");
            removePrefix = AFAdRevenueData != null ? StringsKt.removePrefix(AFAdRevenueData, (CharSequence) "fb") : null;
            String str3 = removePrefix;
            if (str3 == null || str3.length() == 0) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                removePrefix = null;
            }
            if (removePrefix == null) {
                String revenue2 = this.getCurrencyIso4217Code.getRevenue("com.appsflyer.FacebookApplicationId");
                removePrefix = revenue2 != null ? StringsKt.removePrefix(revenue2, (CharSequence) "fb") : null;
                String str4 = removePrefix;
                if (str4 == null || str4.length() == 0) {
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    removePrefix = null;
                }
            }
        }
        str = removePrefix;
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

    private final boolean AFAdRevenueData(Context context) {
        int i = AFa1ySDK.getMediationNetwork[this.areAllFieldsValid.ordinal()];
        if (i == 1) {
            return getRevenue(context);
        }
        if (i == 2) {
            return getCurrencyIso4217Code(context);
        }
        if (i == 3) {
            return component4(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component4(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1vSDK(AFd1qSDK aFd1qSDK, ExecutorService executorService, AFj1xSDK aFj1xSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFd1qSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFj1qSDK.AFa1uSDK.getMonetizationNetwork[aFj1xSDK.ordinal()];
        if (i == 1) {
            str = AccessToken.DEFAULT_GRAPH_DOMAIN;
        } else if (i == 2) {
            str = FacebookSdk.INSTAGRAM;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        this.getCurrencyIso4217Code = aFd1qSDK;
        this.getRevenue = executorService;
        this.areAllFieldsValid = aFj1xSDK;
        this.component4 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0262, code lost:
    
        if (r9 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024b, code lost:
    
        if (r9 != null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115 A[Catch: all -> 0x026e, TRY_LEAVE, TryCatch #4 {all -> 0x026e, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x0115, B:85:0x0078, B:87:0x008d, B:88:0x0092, B:89:0x0093, B:91:0x0099, B:92:0x00be, B:93:0x00d2, B:95:0x00d8, B:96:0x00fd), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ac A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1vSDK aFj1vSDK, Context context) {
        String str;
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        int i;
        Uri parse;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aFj1vSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1vSDK.component1 = System.currentTimeMillis();
        aFj1vSDK.component2 = AFj1sSDK.AFa1zSDK.STARTED;
        aFj1vSDK.addObserver(new AFj1sSDK.AnonymousClass1());
        String str4 = aFj1vSDK.copy;
        Intrinsics.checkNotNull(str4);
        try {
            i = AFa1ySDK.getMediationNetwork[aFj1vSDK.areAllFieldsValid.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
        } catch (Throwable th2) {
            th = th2;
            str = "Error while collecting Meta Install Referrer for ";
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component4(context)) {
                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str4);
                        if (parse == null) {
                            contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                            try {
                                Cursor query = contentProviderClient != null ? contentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            int columnIndex = query.getColumnIndex("install_referrer");
                                            if (columnIndex != -1) {
                                                str2 = query.getString(columnIndex);
                                            } else {
                                                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "No such column, " + aFj1vSDK.areAllFieldsValid + " provider", false, 4, null);
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Collected " + aFj1vSDK.areAllFieldsValid + " attribution data.", false, 4, null);
                                                Map<String, Object> map = aFj1vSDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map, "");
                                                map.put("response", "OK");
                                                Map<String, Object> map2 = aFj1vSDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                                map2.put("referrer", str2);
                                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFj1vSDK.getMediationNetwork.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = query.getColumnIndex("is_ct");
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFj1vSDK.getMediationNetwork.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i2 = AFa1ySDK.getMediationNetwork[aFj1vSDK.areAllFieldsValid.ordinal()];
                                                if (i2 == 1) {
                                                    str3 = "com.facebook.katana";
                                                } else if (i2 == 2) {
                                                    str3 = "com.instagram.android";
                                                } else {
                                                    if (i2 != 3) {
                                                        throw new NoWhenBranchMatchedException();
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
                                            query.close();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = query;
                                        try {
                                            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, str + aFj1vSDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, MenuKt.InTransitionDuration, null);
                                        } finally {
                                            Cursor cursor2 = cursor;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (contentProviderClient != null) {
                                                contentProviderClient.close();
                                            }
                                        }
                                    }
                                }
                                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = null;
                                AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, str + aFj1vSDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, MenuKt.InTransitionDuration, null);
                            }
                        }
                    } else {
                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getCurrencyIso4217Code(context)) {
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str4);
                    if (parse == null) {
                    }
                } else {
                    AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (getRevenue(context)) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str4);
                if (parse == null) {
                }
            } else {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            contentProviderClient = null;
            cursor = null;
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.META_REFERRER, str + aFj1vSDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, MenuKt.InTransitionDuration, null);
        }
        aFj1vSDK.getRevenue();
        aFj1vSDK.component4.run();
    }

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
}
