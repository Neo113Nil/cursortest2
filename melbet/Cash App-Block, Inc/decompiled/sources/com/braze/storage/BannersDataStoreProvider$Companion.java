package com.braze.storage;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/BannersDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateBannerStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateBannerImpressionMapToJson", "", "BANNERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "BANNERS_STORAGE_SHARED_PREFS", "BANNERS_ELIGIBILITY_SHARED_PREFS", "BANNERS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannersDataStoreProvider$Companion {
    public /* synthetic */ BannersDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.BANNERS_IMPRESSION_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$1$0(Object obj, String str) {
        return "Added impression:" + obj + " for banner:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$2$0() {
        return "Migration for Banners impression map completed successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$3() {
        return "Failed to migrate banner impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.BANNERS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Added banner from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$1$1(Object obj) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Banner value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$2$0(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Migration for banners completed successfully. Migrated ", " banners.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3() {
        return "Failed to migrate banner storage to DataStore.";
    }

    public final Preferences migrateBannerImpressionMapToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(7), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6(0, (Boolean) value, str2), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r1 = Json.Default;
                r1.getClass();
                str = r1.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, 1), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(8), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(9), 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateBannerStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        int i;
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(5), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.BANNERS.getKey()))) {
            return currentData;
        }
        int i2 = 6;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = sharedPrefs.getAll().entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, i2), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2(value, i), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), arrayList);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = arrayList instanceof Map ? "{}" : "[]";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.BANNERS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(i, arrayList), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(i2), 4, (Object) null);
            return currentData;
        }
    }

    private BannersDataStoreProvider$Companion() {
    }
}
