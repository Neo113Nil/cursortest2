package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class s6 {
    public static MutablePreferences a(Preferences preferences, Preferences.Key key, Preferences.Key key2, Map map, Map map2) {
        String str;
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        key.getClass();
        LinkedHashMap linkedHashMap = ((MutablePreferences) preferences).preferencesMap;
        String str2 = "[]";
        if (!linkedHashMap.containsKey(key)) {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), map);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? "[]" : "{}";
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(key, str);
        }
        key2.getClass();
        if (!linkedHashMap.containsKey(key2)) {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Default r02 = Json.Default;
                r02.getClass();
                str2 = r02.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), map2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                if ((map2 instanceof Map) || !(map2 instanceof List)) {
                    str2 = "{}";
                }
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(key2, str2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(27), 7, (Object) null);
        return mutablePreferences;
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Migrated last request timestamp key: ", str);
    }

    public static final String c() {
        return "Failed to migrate endpoint metadata to DataStore.";
    }

    public static final String b() {
        return "Starting migration for endpoint metadata";
    }

    public static Pair a(SharedPreferencesView sharedPreferencesView) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap all = sharedPreferencesView.getAll();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : all.entrySet()) {
            if (entry.getValue() instanceof Long) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            s6 s6Var = com.braze.storage.e.b;
            value.getClass();
            s6Var.a(str, ((Long) value).longValue(), linkedHashMap, linkedHashMap2);
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Migrated attempt count key: ", str);
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        sharedPreferencesView.getClass();
        preferences.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(25), 7, (Object) null);
        Preferences.Key stringKey = Strings.stringKey(DataStoreKey.ENDPOINT_LAST_REQUEST_MAP.getKey());
        Preferences.Key stringKey2 = Strings.stringKey(DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP.getKey());
        LinkedHashMap linkedHashMap = ((MutablePreferences) preferences).preferencesMap;
        if (linkedHashMap.containsKey(stringKey) && linkedHashMap.containsKey(stringKey2)) {
            return preferences;
        }
        try {
            Pair a = a(sharedPreferencesView);
            return a(preferences, stringKey, stringKey2, (Map) a.first, (Map) a.second);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(26), 4, (Object) null);
            return preferences;
        }
    }

    public static final String a() {
        return "Endpoint metadata migration completed successfully";
    }

    public final void a(String str, long j, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (StringsKt__StringsJVMKt.startsWith(str, "uri-at-", false)) {
            linkedHashMap2.put(str, Long.valueOf(j));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 20), 7, (Object) null);
        } else if (StringsKt__StringsJVMKt.startsWith(str, "uri-", false)) {
            linkedHashMap.put(str, Long.valueOf(j));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 21), 7, (Object) null);
        }
    }
}
