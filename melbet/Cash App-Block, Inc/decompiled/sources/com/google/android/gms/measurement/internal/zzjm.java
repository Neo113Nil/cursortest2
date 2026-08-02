package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class zzjm {
    public static final String[] zza = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", BreadcrumbHelper.Category.ERROR, "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] zzb = {"ad_impression"};
    public static final String[] zzc = {"ad_impression", "in_app_purchase"};
    public static final String[] zzd = {"ad_impression"};
    public static final String[] zze = {"ad_impression", "in_app_purchase"};
    public static final String[] zzf = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] zzg = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final String[] zza$1 = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] zzb$1 = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] zzc$1 = {"items"};
    public static final String[] zzd$1 = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static final String[] zza$2 = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] zzb$2 = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:28:0x00bc->B:34:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00ba, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zza(zzgu zzguVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursor;
        HashSet hashSet;
        Cursor rawQuery;
        if (zzguVar == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Monitor must not be null");
            return;
        }
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
            }
        } catch (SQLiteException e) {
            e = e;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e2) {
                    e = e2;
                    zzguVar.zzg.zzc("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    try {
                        hashSet = new HashSet();
                        StringBuilder sb = new StringBuilder(str.length() + 22);
                        sb.append("SELECT * FROM ");
                        sb.append(str);
                        sb.append(" LIMIT 0");
                        rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (!hashSet.remove(str4)) {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                zzguVar.zzg.zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                            }
                        } catch (Throwable th3) {
                            rawQuery.close();
                            throw th3;
                        }
                    } catch (SQLiteException e3) {
                        zzguVar.zzd.zzb(str, "Failed to verify columns on table that was just created");
                        throw e3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            zzguVar.zzg.zzc("Error querying for table", str, e);
            if (cursor != null) {
            }
            sQLiteDatabase2.execSQL(str2);
            hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder(str.length() + 22);
            sb3.append("SELECT * FROM ");
            sb3.append(str);
            sb3.append(" LIMIT 0");
            rawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            rawQuery.close();
            while (r3 < r0) {
            }
            if (strArr != null) {
            }
            if (hashSet.isEmpty()) {
            }
        }
    }

    public static void zzb(zzgu zzguVar, SQLiteDatabase sQLiteDatabase) {
        if (zzguVar == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Monitor must not be null");
            return;
        }
        zzgs zzgsVar = zzguVar.zzg;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzgsVar.zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzgsVar.zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzgsVar.zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzgsVar.zza("Failed to turn on database write permission for owner");
    }

    public static String zzb(String str) {
        return Countries.zzc(zza, str, zzf);
    }

    public static Object zzb(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static void zza(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static String zza(String str) {
        return Countries.zzc(zzf, str, zza);
    }
}
