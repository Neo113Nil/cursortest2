package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class g7 {
    public static final String b() {
        return "Failed to migrate event storage to DataStore.";
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        String str;
        sharedPreferencesView.getClass();
        preferences.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(16), 7, (Object) null);
        if (((MutablePreferences) preferences).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.EVENT_STORAGE_MAP.getKey()))) {
            return preferences;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPreferencesView.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.storage.f.b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str2, 11), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.storage.f.b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda2(value, 0), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = r0.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.EVENT_STORAGE_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda3(linkedHashMap, 0), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new g$$ExternalSyntheticLambda0(17), 4, (Object) null);
            return preferences;
        }
    }

    public static final String a() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.EVENT_STORAGE_MAP.getKey());
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Added event from SharedPreferences key: ", str);
    }

    public static final String a(Object obj) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Event value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.", obj);
    }

    public static final String a(Map map) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(map.size(), "Migration for events completed successfully. Migrated ", " events.");
    }
}
