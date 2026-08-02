package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.models.BrazeGeofence;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class o8 {
    public static final String b() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Migration for ", DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey(), " completed successfully");
    }

    public static final String c(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to decode BrazeGeofence from JSON: ", str);
    }

    public static final String d(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Migration for ", str, " completed successfully");
    }

    public static final String e(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to migrate ", str, " list to DataStore.");
    }

    public static final String f(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Added timestamp for geofence:", str, " from SharedPreferences");
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences, String str) {
        String str2;
        BrazeGeofence brazeGeofence;
        sharedPreferencesView.getClass();
        preferences.getClass();
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 2), 7, (Object) null);
        if (((MutablePreferences) preferences).preferencesMap.containsKey(new Preferences.Key(str))) {
            return preferences;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPreferencesView.getAll().entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str3, 3), 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String str4 = (String) arrayList.get(i2);
                try {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    brazeGeofence = (BrazeGeofence) r0.decodeFromString(str4, BrazeGeofence.Companion.serializer());
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda2(brazeGeofence, i), 7, (Object) null);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new o6$$ExternalSyntheticLambda2(str4, 4), 4, (Object) null);
                    brazeGeofence = null;
                }
                if (brazeGeofence != null) {
                    arrayList2.add(brazeGeofence);
                }
                i2 = i3;
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r02 = Json.Default;
                r02.getClass();
                str2 = r02.encodeToString(new HashSetSerializer(BrazeGeofence.Companion.serializer(), 1), arrayList2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = arrayList2 instanceof Map ? "{}" : "[]";
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), str2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 5), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 6), 4, (Object) null);
            return preferences;
        }
    }

    public static final String c() {
        return "Failed to migrate individual reeligibility map to DataStore.";
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Added geofence from SharedPreferences key: ", str);
    }

    public static final String a() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey());
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        String str;
        sharedPreferencesView.getClass();
        preferences.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(0), 7, (Object) null);
        if (((MutablePreferences) preferences).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()))) {
            return preferences;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPreferencesView.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str2, 7), 7, (Object) null);
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
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(18), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new o8$$ExternalSyntheticLambda6(19), 4, (Object) null);
            return preferences;
        }
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", str);
    }

    public static final String a(BrazeGeofence brazeGeofence) {
        return Recorder$$ExternalSyntheticOutline2.m("Successfully decoded geofence: ", brazeGeofence.getId());
    }
}
