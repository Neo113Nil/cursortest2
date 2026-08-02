package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.storage.k;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class jc {
    public static final String b() {
        return "Push ID storage already migrated to DataStore";
    }

    public static final String c() {
        return "Migration for push ID map completed successfully";
    }

    public static final String d() {
        return "Failed to migrate push ID storage to DataStore.";
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        String str;
        sharedPreferencesView.getClass();
        preferences.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(15), 7, (Object) null);
        if (((MutablePreferences) preferences).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.PUSH_ID_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(16), 6, (Object) null);
            return preferences;
        }
        int i = 18;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPreferencesView.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k.d, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(i, str2, (Long) value), 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda3(linkedHashMap, 1), 7, (Object) null);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r3 = Json.Default;
                r3.getClass();
                str = r3.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.PUSH_ID_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(17), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new hf$$ExternalSyntheticLambda0(18), 4, (Object) null);
            return preferences;
        }
    }

    public static final String a() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.PUSH_ID_MAP.getKey());
    }

    public static final String a(String str, Object obj) {
        return "Migrating push id: " + str + " with timestamp: " + obj;
    }

    public static final String a(Map map) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(map.size(), "Migrated ", " push identifiers to DataStore");
    }
}
