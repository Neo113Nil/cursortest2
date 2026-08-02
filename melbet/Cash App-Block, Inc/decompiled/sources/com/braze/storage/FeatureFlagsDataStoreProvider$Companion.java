package com.braze.storage;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/FeatureFlagsDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateFeatureFlagStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateFeatureFlagImpressionMapToJson", "", "FEATURE_FLAGS_DATA_STORE_STORAGE", "Ljava/lang/String;", "FEATURE_FLAGS_ELIGIBILITY_SHARED_PREFS", "FEATURE_FLAGS_STORAGE_SHARED_PREFS", "FEATURE_FLAGS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeatureFlagsDataStoreProvider$Companion {
    public /* synthetic */ FeatureFlagsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$1$0(Object obj, String str) {
        return "Added impression:" + obj + " for feature flag:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$2$0() {
        return "Migration for Feature Flags impression map completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$3() {
        return "Failed to migrate Feature Flags impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.FEATURE_FLAGS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Added feature flag from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$0(FeatureFlag featureFlag) {
        return String.valueOf(featureFlag != null ? Recorder$$ExternalSyntheticOutline2.m("Successfully decoded feature flag: ", featureFlag.getId()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse FeatureFlag from JSON: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$3$0() {
        return "Migration for feature flags completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$4() {
        return "Failed to migrate feature flags storage to DataStore.";
    }

    public final Preferences migrateFeatureFlagImpressionMapToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(20), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = sharedPrefs.getAll().entrySet().iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6(i, (Boolean) value, str2), 7, (Object) null);
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
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(21), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(22), 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateFeatureFlagStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        FeatureFlag featureFlag;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(17), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.FEATURE_FLAGS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 9), 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String str3 = (String) arrayList.get(i);
                try {
                    featureFlag = com.braze.support.e.a.a(new JSONObject(str3));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2(featureFlag, 2), 7, (Object) null);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str3, 10), 4, (Object) null);
                    featureFlag = null;
                }
                if (featureFlag != null) {
                    arrayList2.add(featureFlag);
                }
                i = i2;
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashSetSerializer(FeatureFlag.Companion.serializer(), 1), arrayList2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = arrayList2 instanceof Map ? "{}" : "[]";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.FEATURE_FLAGS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(18), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(19), 4, (Object) null);
            return currentData;
        }
    }

    private FeatureFlagsDataStoreProvider$Companion() {
    }
}
