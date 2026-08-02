package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1ySDK;
import defpackage.b6e;
import defpackage.uah;
import defpackage.x7j;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1cSDK extends AFi1fSDK {

    @NotNull
    private final Runnable component3;
    private String equals;

    @NotNull
    private final AFi1eSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1kSDK getMediationNetwork;

    @NotNull
    private final ExecutorService getRevenue;

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFi1eSDK.values().length];
            try {
                iArr[AFi1eSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1eSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1eSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1cSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull ExecutorService executorService, @NotNull AFi1eSDK aFi1eSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        super("app", r0, aFc1kSDK, runnable);
        String str;
        aFc1kSDK.getClass();
        executorService.getClass();
        aFi1eSDK.getClass();
        runnable.getClass();
        runnable2.getClass();
        int i = AFi1aSDK.AFa1tSDK.getRevenue[aFi1eSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                b6e.s();
                throw null;
            }
            str = "facebook_lite";
        }
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = executorService;
        this.getCurrencyIso4217Code = aFi1eSDK;
        this.component3 = runnable2;
    }

    private final boolean AFAdRevenueData(Context context) {
        int i = AFa1zSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i == 1) {
            return getCurrencyIso4217Code(context);
        }
        if (i == 2) {
            return getMediationNetwork(context);
        }
        if (i == 3) {
            return component3(context);
        }
        b6e.s();
        return false;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x022a, code lost:
    
        if (r25 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0215, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0213, code lost:
    
        if (r25 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #2 {all -> 0x0069, blocks: (B:3:0x0035, B:8:0x004a, B:10:0x0050, B:16:0x00e8, B:82:0x0071, B:84:0x0082, B:85:0x0087, B:86:0x0088, B:88:0x008e, B:89:0x00a6, B:90:0x00b6, B:92:0x00bc, B:93:0x00d4), top: B:2:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMonetizationNetwork(AFi1cSDK aFi1cSDK, Context context) {
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        int[] iArr;
        int i;
        Uri parse;
        String str;
        String str2;
        aFi1cSDK.getClass();
        context.getClass();
        aFi1cSDK.areAllFieldsValid = System.currentTimeMillis();
        aFi1cSDK.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        aFi1cSDK.addObserver(new AFj1ySDK.AnonymousClass2());
        String str3 = aFi1cSDK.equals;
        str3.getClass();
        try {
            AFi1eSDK aFi1eSDK = aFi1cSDK.getCurrencyIso4217Code;
            iArr = AFa1zSDK.getMonetizationNetwork;
            i = iArr[aFi1eSDK.ordinal()];
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            contentProviderClient = null;
        }
        if (i == 1) {
            if (getCurrencyIso4217Code(context)) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
                aFi1cSDK.getMonetizationNetwork();
                aFi1cSDK.component3.run();
            }
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFi1cSDK.getMonetizationNetwork();
            aFi1cSDK.component3.run();
        }
        if (i == 2) {
            if (getMediationNetwork(context)) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
                aFi1cSDK.getMonetizationNetwork();
                aFi1cSDK.component3.run();
            }
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFi1cSDK.getMonetizationNetwork();
            aFi1cSDK.component3.run();
        }
        if (i != 3) {
            throw new x7j();
        }
        if (!component3(context)) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFi1cSDK.getMonetizationNetwork();
            aFi1cSDK.component3.run();
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str3));
        if (parse == null) {
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            try {
                Cursor query = acquireUnstableContentProviderClient != null ? acquireUnstableContentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("install_referrer");
                            if (columnIndex != -1) {
                                str = query.getString(columnIndex);
                            } else {
                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "No such column, " + aFi1cSDK.getCurrencyIso4217Code + " provider", false, 4, null);
                                str = null;
                            }
                            if (str != null) {
                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Collected " + aFi1cSDK.getCurrencyIso4217Code + " attribution data.", false, 4, null);
                                Map<String, Object> map = aFi1cSDK.AFAdRevenueData;
                                map.getClass();
                                map.put("response", "OK");
                                Map<String, Object> map2 = aFi1cSDK.AFAdRevenueData;
                                map2.getClass();
                                map2.put(Constants.KEY_REFERRER, str);
                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                if (valueOf != null) {
                                    aFi1cSDK.AFAdRevenueData.put("click_ts", Long.valueOf(valueOf.longValue()));
                                }
                                int columnIndex3 = query.getColumnIndex("is_ct");
                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                if (valueOf2 != null) {
                                    aFi1cSDK.AFAdRevenueData.put("meta_custom", uah.g(new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                }
                                int i2 = iArr[aFi1cSDK.getCurrencyIso4217Code.ordinal()];
                                if (i2 == 1) {
                                    str2 = "com.facebook.katana";
                                } else if (i2 == 2) {
                                    str2 = "com.instagram.android";
                                } else {
                                    if (i2 != 3) {
                                        throw new x7j();
                                    }
                                    str2 = "com.facebook.lite";
                                }
                                Map<String, Object> map3 = aFi1cSDK.AFAdRevenueData;
                                map3.getClass();
                                map3.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, str2)));
                                Map<String, Object> map4 = aFi1cSDK.AFAdRevenueData;
                                map4.getClass();
                                map4.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, str2));
                            }
                            query.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        contentProviderClient = acquireUnstableContentProviderClient;
                        try {
                            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1cSDK.getCurrencyIso4217Code.name() + " provider", th, false, false, false, false, 120, null);
                            aFi1cSDK.getMonetizationNetwork();
                            aFi1cSDK.component3.run();
                        } finally {
                            Cursor cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (contentProviderClient != null) {
                                contentProviderClient.close();
                            }
                        }
                    }
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th4) {
                th = th4;
                contentProviderClient = acquireUnstableContentProviderClient;
                cursor = null;
            }
        }
        aFi1cSDK.getMonetizationNetwork();
        aFi1cSDK.component3.run();
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(@NotNull Context context) {
        context.getClass();
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new f(1, this, context));
        } else {
            this.component3.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String Y = currencyIso4217Code != null ? StringsKt.Y(currencyIso4217Code, "fb") : null;
        if (Y == null || Y.length() == 0) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            Y = null;
        }
        if (Y == null) {
            String mediationNetwork = this.getMediationNetwork.getMediationNetwork("facebook_application_id");
            Y = mediationNetwork != null ? StringsKt.Y(mediationNetwork, "fb") : null;
            if (Y == null || Y.length() == 0) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                Y = null;
            }
            if (Y == null) {
                String currencyIso4217Code2 = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                Y = currencyIso4217Code2 != null ? StringsKt.Y(currencyIso4217Code2, "fb") : null;
                if (Y == null || Y.length() == 0) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    Y = null;
                }
            }
        }
        str = Y;
        this.equals = str;
        if (str == null) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (AFAdRevenueData(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }
}
