package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class ob {
    public static final String b() {
        return "Failed to migrate permission request counts to DataStore.";
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        String str;
        sharedPreferencesView.getClass();
        preferences.getClass();
        Preferences.Key stringKey = Strings.stringKey(DataStoreKey.PERMISSION_REQUEST_COUNTS.getKey());
        if (!((MutablePreferences) preferences).preferencesMap.containsKey(stringKey)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap all = sharedPreferencesView.getAll();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : all.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    value.getClass();
                    linkedHashMap.put(str2, (Integer) value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.storage.i.b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(str2, 1, value), 7, (Object) null);
                }
                if (!linkedHashMap.isEmpty()) {
                    MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r2 = Json.Default;
                        r2.getClass();
                        str = r2.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE, 1), linkedHashMap);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str = "{}";
                    }
                    mutablePreferences.setUnchecked$datastore_preferences_core_release(stringKey, str);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(23), 7, (Object) null);
                    return mutablePreferences;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new o8$$ExternalSyntheticLambda6(24), 4, (Object) null);
                return preferences;
            }
        }
        return preferences;
    }

    public static final String a(String str, Object obj) {
        return "Migrated permission count: " + str + " = " + obj;
    }

    public static final String a() {
        return "Permission request counts migration completed";
    }
}
