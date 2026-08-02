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
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/TriggerDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateTriggersStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateTriggersReeligibilityToJson", "", "TRIGGERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "TRIGGERS_STORAGE_SHARED_PREFS", "TRIGGERS_REELIGIBILITY_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TriggerDataStoreProvider$Companion {
    public /* synthetic */ TriggerDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$1() {
        return "Migration already completed for triggered actions impression maps. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$2$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Added timestamp for trigger:", str, " from SharedPreferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$3$0() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Migration for ", DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey(), " completed successfully");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$4() {
        return "Failed to migrate triggers reeligibility map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.TRIGGERED_ACTIONS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$1() {
        return "Migration already completed for triggered actions. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$2$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Added triggered action from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$2$1(String str, Object obj) {
        return "Triggered action with key:" + str + " and value:" + obj + " from SharedPreferences has an invalid value and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$3$0(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Migration for triggered actions completed successfully. Migrated ", " actions.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4() {
        return "Failed to migrate triggered actions to DataStore.";
    }

    public final Preferences migrateTriggersReeligibilityToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(0), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(8), 7, (Object) null);
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 12), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r1 = Json.Default;
                r1.getClass();
                str = r1.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(10), 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateTriggersStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        int i;
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(11), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.TRIGGERED_ACTIONS.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(12), 7, (Object) null);
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = sharedPrefs.getAll().entrySet().iterator();
            while (true) {
                i = 2;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof String) || StringsKt.isBlank((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$b$a$$ExternalSyntheticLambda1(str2, i, value), 7, (Object) null);
                } else {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 13), 7, (Object) null);
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
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.TRIGGERED_ACTIONS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(i, arrayList), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(7), 4, (Object) null);
            return currentData;
        }
    }

    private TriggerDataStoreProvider$Companion() {
    }
}
